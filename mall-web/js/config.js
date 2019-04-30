/**
 * Created by linkb on 2019/4/30.
 */
//域名配置
var basePath = "http://localhost:8080";
var projectPath="/mall-web";
//统一ajax返回封装
(function ($) {
    //允许跨域携带cookie
    $.ajaxSetup({
        type: "POST",
        xhrFields: {withCredentials: true},
        crossDomain: true
    });
    //统一返回封装
    var ajax = $.ajax;
    $.ajax = function (s) {
        var old = s.success;
        s.success = function (data, textStatus, XMLHttpRequest) {
            if (data.code == 401) {//未登录，跳转到登录页面
                alert("未登录或超时，请先登录！！");
                window.location.replace(projectPath+"/login.html");
            } else if (data.code == 403) {
                layer.alert("您没有权限");
            }
            old(data, textStatus, XMLHttpRequest);
        };
        ajax(s);
    }
})(jQuery);

//统一按钮权限扫描
jQuery(function () {
    // var loginHtml = $("#thisHtml").val();
    // if (loginHtml == undefined || loginHtml != "login") {
    //     if (window.sessionStorage) {
    //         var str = window.sessionStorage.getItem("user");
    //         if (str == undefined || str == "" || str == null) {
    //             alert("未登录或超时，请先登录！！");
    //             window.location.href = projectPath+"/login.html";
    //         }
    //     } else {
    //         var userName = $.cookie('userName');
    //         if (userName == undefined || userName == "" || userName == null) {
    //             alert("未登录或超时，请先登录！！");
    //             window.location.href = projectPath+"/login.html";
    //         }
    //     }
    //     $('a').each(function () {
    //         var menuList;
    //         if (window.sessionStorage) {
    //             var str = window.sessionStorage.getItem("user");
    //             var user = JSON.parse(str);
    //             menuList = user.menuList;
    //         } else {
    //             $.post(basePath + "/login/getButtonListByUser", function (result, status) {
    //                 menuList = result.data
    //             });
    //
    //         }
    //         var dom = $(this);
    //         var power = dom.attr("e-power");
    //         if (power != undefined && power != "" && power != null) {
    //             dom.hide();
    //             for (var i = 0; i < menuList.length; i++) {
    //                 if (menuList[i].url == power) {
    //                     dom.show();
    //                     break
    //                 }
    //
    //             }
    //         }
    //     })
    // }
});


function getUserName() {
    if (window.sessionStorage) {
        var str = window.sessionStorage.getItem("user");
        if (str != undefined && str != "" && str != null) {
            var user = JSON.parse(str);
            return user.userName;
        }
    } else {
        return $.cookie('userName');
    }
}