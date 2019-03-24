package com.zhiyou100.service;

import com.zhiyou100.pojo.goods;
import com.zhiyou100.pojo.queryall;

import java.util.List;

public interface GoodsService {
    List<goods> getALL();

    List<queryall> getALLM();

    void delete(Integer gid);

    void update2(goods goods);

    void addGood(goods goods);

    void update(goods goods);
}
