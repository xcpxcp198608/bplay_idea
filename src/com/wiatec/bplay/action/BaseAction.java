package com.wiatec.bplay.action;

import org.apache.struts2.interceptor.ServletResponseAware;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by xuchengpeng on 20/04/2017.
 */
public class BaseAction implements ServletResponseAware {

    protected PrintWriter out;

    @Override
    public void setServletResponse(HttpServletResponse httpServletResponse) {
        try {
            httpServletResponse.setContentType("text/html ; charset=utf-8");
            httpServletResponse.setCharacterEncoding("utf-8");
            out = httpServletResponse.getWriter();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
