package com.zhiyou100.controller;

import com.zhiyou100.pojo.User;
import com.zhiyou100.service.LoginService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 登录
 */
@Controller
public class LoginController {
    @Resource
    private LoginService service;

    @RequestMapping("/")
    public String showLogin(){
        return "login.html";
    }

    @RequestMapping("login.do")
    @ResponseBody
    public Map<String,Object> login( User user, HttpSession session) {
        System.out.println(user.getName());
        System.out.println(user.getPass());
//        HashMap<String, Object> map = new HashMap<>();
        Map<String, Object> mapp = service.getUser(user, session);

            return mapp;

    }

}
