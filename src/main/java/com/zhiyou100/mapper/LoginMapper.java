package com.zhiyou100.mapper;

import com.zhiyou100.pojo.User;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface LoginMapper {
     List<User> getUser(String name);
}
