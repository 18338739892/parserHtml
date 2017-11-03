package com.pkk.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;
import org.springframework.stereotype.Controller;

import com.pkk.service.SysMenuServcie;

/**
 * @author peikunkun
 * @version V1.0
 * @Title: love
 * @Package com.pkk.action
 * @Description: <>
 * @date 11/1 0001 19:02
 */
@Controller
public class UserLoginAction {

    private Map<String, String> json = new HashMap<>();

    public Map<String, String> getJson() {
        return json;
    }

    public void setJson(Map<String, String> json) {
        this.json = json;
    }

    @Resource
    private SysMenuServcie sysMenuServcie;


    public String testSuccess() {
        System.out.println("进入");
        System.out.println("---" + sysMenuServcie);

        return "success";
    }

    public String testError() {
        System.out.println("进入");
        System.out.println("---" + sysMenuServcie);

        json.put("key", "json数据");

        return "fail";
    }

    public void testFail() {
        System.out.println("进入");
        System.out.println("---" + sysMenuServcie);

        json.put("key", "json数据");

        HttpServletResponse response = ServletActionContext.getResponse();
        response.setCharacterEncoding("UTF-8");
        PrintWriter out = null;
        try {
            out = response.getWriter();
            out.println(json);
            out.flush();
            out.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }


}
