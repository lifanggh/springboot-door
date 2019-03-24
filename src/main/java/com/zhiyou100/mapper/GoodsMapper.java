package com.zhiyou100.mapper;

import com.zhiyou100.pojo.goods;
import com.zhiyou100.pojo.queryall;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface GoodsMapper {
    List<goods> getAll();

    List<queryall> getAllM();

    void deleteupdat(Integer gid);

    void update2(goods goods);

    void addGood(goods goods);

    void update(goods goods);
}
