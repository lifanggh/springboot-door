package com.zhiyou100.service.imp;

import com.zhiyou100.mapper.LoginMapper;
import com.zhiyou100.pojo.User;
import com.zhiyou100.service.LoginService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Service
public class LoginServiceimp implements LoginService {
    @Resource
    private LoginMapper loginMapper;

    @Override
    public Map<String, Object> getUser(User user, HttpSession session) {
        HashMap<String, Object> map = new HashMap<>();
        List<User> list = loginMapper.getUser(user.getName());

        if (list.size() >= 0) {
            for (User u : list) {
                if (u.getPass().equals(user.getPass())) {

                    session.setAttribute("LOGIN_LIST", u);

                    map.put("ms", true);
                } else {
                    map.put("ms", false);
                    map.put("msg", "密码错误!");
                }

            }
        } else {

            map.put("msg", "用户名不存在");
        }


        return map;
    }
}
