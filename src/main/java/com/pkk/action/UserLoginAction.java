package com.pkk.action;

import javax.annotation.Resource;

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

    @Resource
    private SysMenuServcie sysMenuServcie;


    public String testSuccess() {
        System.out.println("进入");
        System.out.println("---" + sysMenuServcie);

        return "success";
    }


}
