package com.wsw.web.filter;

import javax.servlet.*;
import java.io.IOException;
import java.util.Date;

//@WebFilter(filterName = "TimeFilter")
//@Component
public class TimeFilter implements Filter {
    public void destroy() {
        System.out.println("time filter destroy");
    }

    public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws ServletException, IOException {
        // 只有req， resp 参数
        System.out.println("time filter start ");
        long time = new Date().getTime();
        chain.doFilter(req, resp);
        System.out.println("time filter 耗时 ： " + (new Date().getTime() - time));
    }

    public void init(FilterConfig config) throws ServletException {
        System.out.println("time filter init ");
    }

}
