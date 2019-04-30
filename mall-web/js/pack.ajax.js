/**简化ajax请求
 * Created by Administrator on 2017/7/26.
 */
var TIME_OUT = 60000;
/**
 * 提交post请求,返回json数据
 * @param url
 * @param data ：var data =new Object(); var data = {id:'1'};
 * @param callback
 */
$.postJSON = function(url,data,callback){
    $.ajax({
        url:url,
        type:"post",
        dataType:"json",
        data:data,
        timeout:TIME_OUT,
        beforeSend:function(XMLHttpRequest){
        },
        success:function(data){
            if(data.code!=undefined)
            {}
            callback(data);
        },
        error:function(XMLHttpRequest,textStatus,errorThrown){

        }
    });
};


/**
 * 提交post请求,返回操作状态
 * @param url
 * @param data :var data =new Object(); var data = {id:'1'};
 * @param callback
 */
$.postStatus = function(url,data,callback){
    $.ajax({
        url:url,
        type:"post",
        dataType:"json",
        data:data,
        timeout:TIME_OUT,
        success:function(data){
            if(data.code!=undefined) {
                if(data.code==200)
                {
                    callback(data);
                }
                else
                {
                    alert('操作失败');
                    console.log(data.message);
                }
            }
        },
        error:function(XMLHttpRequest,textStatus,errorThrown){
        }
    });
};

$.fn.serializeObject = function()
{
    var o = {};
    var a = this.serializeArray();
    $.each(a, function() {
        if (o[this.name] !== undefined) {
            if (!o[this.name].push) {
                o[this.name] = [o[this.name]];
            }
            o[this.name].push(this.value || '');
        } else {
            o[this.name] = this.value || '';
        }
    });
    return o;
};

//表单填充
$.fn.setForm = function(jsonValue) {
    var obj=this;
    $.each(jsonValue, function (name, ival) {
        var $oinput = obj.find("input[name='" + name + "']");

        if ($oinput.attr("type")== "radio" || $oinput.attr("type")== "checkbox"){
            $oinput.each(function(){
                if(Object.prototype.toString.apply(ival) == '[object Array]'){
                    //是复选框，并且是数组
                    for(var i=0;i<ival.length;i++){
                        if($(this).val()==ival[i])
                            $(this).attr("checked", "checked");
                    }
                }else{
                    if($(this).val()==ival){
                        $(this).attr("checked", "checked");
                    }
                }
            });
        }else if($oinput.attr("type")== "textarea"){//多行文本框
            obj.find("[name="+name+"]").html(ival);
        }else if($oinput.attr("type")== 'hidden'){
            obj.find("[name='"+name+"']").val(ival);
        }else if($oinput.attr("type")== undefined){
            // console.log($oinput)
        } else {
            obj.find("[name='"+name+"']").val(ival);
        }
    });
};