package com.zhiyou100.service.imp;

import com.zhiyou100.mapper.DingDanMapper;
import com.zhiyou100.pojo.Dingdan;
import com.zhiyou100.pojo.goods;
import com.zhiyou100.pojo.queryall;
import com.zhiyou100.service.DingdanService;
import com.zhiyou100.util.DateUtil;
import com.zhiyou100.util.IDUtils;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class DingdanServiceimp implements DingdanService {
@Resource
private DingDanMapper danMapper;
    /**
     * 购物
     * 1.那个用户 购物
     * 2.修改商品表对应的 库存=总库商品-买的数量
     * 3.生成订单,想订单中插入一条数据
     * @param gid
     * @param usrId
     */

    @Override
    public queryall addDingdan(Integer gid, Integer usrId) {
        //查询当前的商品数量
       goods goods =danMapper.select(gid);
        goods.setGid( ((int)goods.getGnum()-1));
        //修改
        danMapper.update2(goods);
     //生成订单
        Dingdan dingd = new Dingdan();
        //生成订单编号
        int id = (int) IDUtils.getItemId();
        dingd.setDid(id);
        //用户id
        dingd.setDuid(usrId);
        //商品id
        dingd.setDgid(gid);
        //时间
        String date = DateUtil.getDate("yyyy-MM-dd HH:mm:ss");
        dingd.setDtime(date);
        //金钱
        dingd.setDmany(goods.getGprice());
        //状态
        dingd.setType(1);
        //添加
        Dingdan dingdan=danMapper.addDingdan(dingd);



        //查看订单
        queryall qq=danMapper.getDingdan(id);

       return qq;
    }




}
