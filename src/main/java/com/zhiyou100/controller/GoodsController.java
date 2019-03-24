package com.zhiyou100.controller;

import com.zhiyou100.pojo.goods;
import com.zhiyou100.pojo.queryall;
import com.zhiyou100.service.GoodsService;
import com.zhiyou100.util.IDUtils;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class GoodsController {
    @Resource
    private GoodsService service;

    //测试返回页面
    @RequestMapping("show.do")
    public String Show() {

        return "index.html";
    }

    //查询所有的商品
    @RequestMapping("getall.do")
    public String ShowAllGood(ModelMap map) {
        List<goods> list = service.getALL();
        map.put("goodlist", list);
        return "index.html";
    }

    //添加商品
    @RequestMapping("add.do")
    public String addGood() {

        return "add.html";
    }

    @RequestMapping("add2.do")
    @ResponseBody
    public String add2Good(goods goods) {
        goods.setGid((int) IDUtils.getItemId());
        service.addGood(goods);
        return "1";
    }


    //修改
    @RequestMapping("update.do")
    public String update(goods goods, BindingResult result) {
        System.out.println(goods.getGname());
        service.update(goods);

        return "forward:getall.do";
    }


    //查询所有的信息
    @RequestMapping("all.do")
    public String ShowAllM(ModelMap map, Integer gid) {
        List<queryall> list = service.getALLM();

        map.put("ALLlist", list);

        if (gid != null) {
            for (queryall l : list) {
                if (l.getGid().equals(gid)) {
                    map.put("ALLlist", l);
                }
            }
        }
        return "index.html";
    }


    //删除:
    @RequestMapping("delete.do")
    public String delete(Integer gid) {
        service.delete(gid);

        return "redirect:all.do";

    }


}
