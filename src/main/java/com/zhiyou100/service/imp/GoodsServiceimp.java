package com.zhiyou100.service.imp;

import com.zhiyou100.mapper.GoodsMapper;
import com.zhiyou100.pojo.goods;
import com.zhiyou100.pojo.queryall;
import com.zhiyou100.service.GoodsService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class GoodsServiceimp implements GoodsService {

   @Resource
    private GoodsMapper dingdanMapper;
    @Override
    public List<goods> getALL() {

        return dingdanMapper.getAll() ;
    }

    @Override
    public List<queryall> getALLM() {
        return dingdanMapper.getAllM();
    }

    @Override
    public void delete(Integer gid) {

        dingdanMapper.deleteupdat(gid);
    }

    @Override
    public void update2(goods goods) {
        dingdanMapper.update2(goods);
    }

    @Override
    public void addGood(goods goods) {
        dingdanMapper.addGood(goods);
    }

    @Override
    public void update(goods goods) {
        dingdanMapper.update(goods);
    }
}
