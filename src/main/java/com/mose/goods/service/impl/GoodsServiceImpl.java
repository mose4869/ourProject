package com.mose.goods.service.impl;


import com.mose.goods.dto.City;
import com.mose.goods.mapper.GoodsMapper;
import com.mose.goods.pojo.GoodsInfo;
import com.mose.goods.pojo.GoodsType;
import com.mose.goods.service.GoodsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoodsServiceImpl implements GoodsService {


    @Autowired
    GoodsMapper goodsMapper;

    public List<City> getCitysByPid(int pid) {
        return this.goodsMapper.getCitysByPid(pid);
    }

    public List<GoodsType> getGoodsTypeByPid(int type_pid) {
        return this.goodsMapper.getGoodsTypeByPid(type_pid);
    }

    public List<GoodsInfo> getGoodsInfoBy(GoodsInfo goodsInfo) {
        return this.goodsMapper.getGoodsInfoBy(goodsInfo);
    }

    public List<GoodsType> getMenuSearch(GoodsType goodsType) {
        return goodsMapper.getMenuSearch(goodsType);
    }

    public List<GoodsInfo> getSearchGoodS(String key, String cause, String asc,String city) {
        return goodsMapper.getSearchGoodS(key,cause,asc,city);
    }


}
