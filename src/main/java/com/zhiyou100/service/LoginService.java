package com.zhiyou100.service;

import com.zhiyou100.pojo.User;

import javax.servlet.http.HttpSession;
import java.util.List;
import java.util.Map;

public interface LoginService {
    Map<String, Object> getUser(User user , HttpSession session);
}
