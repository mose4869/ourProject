package com.mose.goods.mapper;
import com.mose.goods.dto.City;
import com.mose.goods.pojo.GoodsInfo;
import com.mose.goods.pojo.GoodsType;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GoodsMapper {

    public List<City> getCitysByPid(int pid);
    public List<GoodsType> getGoodsTypeByPid(int type_pid);



    public List<GoodsInfo> getGoodsInfoBy(GoodsInfo goodsInfo);
    public List<GoodsType> getMenuSearch(GoodsType goodsType);
    public List<GoodsInfo> getSearchGoodS(@Param("key") String key,@Param("cause") String cause,@Param("asc") String asc,@Param("city") String city);

}
