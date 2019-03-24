package com.zhiyou100.controller;

import com.zhiyou100.pojo.User;
import com.zhiyou100.pojo.queryall;
import com.zhiyou100.service.DingdanService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
public class DingdanController {
    @Resource
    private DingdanService service;
    @RequestMapping("shopping.do")
    public String shopping(Integer gid, HttpSession session, ModelMap map){
        User user = (User) session.getAttribute("LOGIN_LIST");
        Integer usrId = user.getId();
        //返回订单
      queryall all = service.addDingdan(gid,usrId);
      //放入map
        map.put("all",all);
        return "dingdan.html";
    }
}
