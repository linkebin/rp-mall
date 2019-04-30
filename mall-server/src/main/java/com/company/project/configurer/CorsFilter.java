package com.company.project.configurer;

import org.springframework.stereotype.Component;

import javax.servlet.*;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * cors（跨域）过滤器
 */
@Component
@WebFilter(urlPatterns = "*//**",filterName = "corsFilter")
public class CorsFilter implements Filter {
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        HttpServletRequest request = (HttpServletRequest) servletRequest;
        HttpServletResponse response = (HttpServletResponse) servletResponse;
        response.setCharacterEncoding("UTF-8");
        response.setHeader("Content-type", "application/json;charset=UTF-8");
        String origin = request.getHeader("Origin");
        response.addHeader("Access-Control-Allow-Origin", origin);
        response.setHeader("Access-Control-Allow-Credentials", "true");//解决js请求跨域session问题
        //预检时判断哪些头部是允许(跨域)的
        response.setHeader("Access-Control-Allow-Headers", "loginAgain,SESSIONID,,Origin, X-Requested-With, Content-Type, Accept");
        //哪些头部可以响应给外部(外部可以获取到哪些响应头)
        response.setHeader("Access-Control-Expose-Headers", "loginAgain,SESSIONID,,Origin, X-Requested-With, Content-Type, Accept");
        response.setHeader("Access-Control-Max-Age", "3600");
        response.setHeader("Access-Control-Allow-Methods", "POST, GET, OPTIONS,DELETE,PUT");
        filterChain.doFilter(request,response);
    }

    @Override
    public void destroy() {

    }
}
