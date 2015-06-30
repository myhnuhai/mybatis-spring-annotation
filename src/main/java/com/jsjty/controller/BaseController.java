package com.jsjty.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ExceptionHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

/**
 * package com.jsjty.controller
 * Author  Administrator
 * Created by 2015/5/22.
 */
@Controller
public abstract class BaseController {
    @ExceptionHandler
    public String exception(HttpServletRequest request, HttpServletResponse response, Exception e) {

        //这里进行通用处理，如日志记录等...

        //如果是json格式的ajax请求
        if (request.getHeader("accept").indexOf("application/json") > -1
                || (request.getHeader("X-Requested-With")!= null && request.getHeader("X-Requested-With").indexOf("XMLHttpRequest") > -1)) {
            response.setStatus(500);
            response.setContentType("application/json;charset=utf-8");
            try {
                PrintWriter writer = response.getWriter();
                writer.write(e.getMessage());
                writer.flush();
            } catch (IOException e1) {
                // TODO Auto-generated catch block
                e1.printStackTrace();
            }
            return null;
        }
        else{//如果是普通请求
            request.setAttribute("exceptionMessage", e.getMessage());

            // 根据不同的异常类型可以返回不同界面
            if(e instanceof SQLException)
                return "index";
            else
                return "error";
        }
    }
}
