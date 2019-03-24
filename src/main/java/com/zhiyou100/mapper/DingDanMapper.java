package com.zhiyou100.mapper;

import com.zhiyou100.pojo.Dingdan;
import com.zhiyou100.pojo.goods;
import com.zhiyou100.pojo.queryall;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface DingDanMapper {

    goods select(Integer gid);

    Dingdan addDingdan(Dingdan dingd);

    queryall getDingdan(int id);

    void update2(goods goods);
}
