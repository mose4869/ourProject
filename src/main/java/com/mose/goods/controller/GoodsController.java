package com.mose.goods.controller;


import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.mose.goods.dto.City;
import com.mose.goods.pojo.GoodsInfo;
import com.mose.goods.pojo.GoodsType;
import com.mose.goods.service.GoodsService;
import com.mose.goods.vo.GoodsInfoVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.UUID;

@Controller
public class GoodsController {
    @Autowired
    GoodsService goodsService;


    /**
     * 发布闲置，添加商品信息
     *
     * @param uploadFile
     * @param defaultPid
     * @param goodsInfoVo
     * @return
     * @throws IOException
     */
    @ResponseBody
    @RequestMapping(value = "addGoodsInfo", method = RequestMethod.POST)
    public Object addGoodsInfo(@RequestParam("RoomInfo1_RoomPicture") MultipartFile[] uploadFile,
                               @RequestParam("defaultPid") Integer defaultPid,
                               GoodsInfoVo goodsInfoVo
    ) throws IOException {
        UUID uuid = UUID.randomUUID();
//        defaultPid为第几张为产品主展示图。
        System.out.println("默认图片" + defaultPid);
//        多文件上传。
        List<String> imgPaths = new ArrayList<String>();
        for (int i = 0; i < uploadFile.length; i++) {
            System.out.println(uploadFile[i].getOriginalFilename());
            String path = "E:/test/" + uuid + i + uploadFile[i].getOriginalFilename();
            File newFile = new File(path);
            imgPaths.add(path);
            uploadFile[i].transferTo(newFile);//直接复制文件
            //将默认展示图片添加到商品信息中
            if (i == (defaultPid - 1)) {
                goodsInfoVo.setGoods_pic(path);
            }
        }
        goodsInfoVo.setImgPaths(imgPaths);
        System.out.println(goodsInfoVo);

        return "上传成功";
    }

    /**
     * @param city
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getCitys", method = RequestMethod.POST)
    public Object getCitys(@RequestBody City city) {
        System.out.println(city);
        return goodsService.getCitysByPid(city.getCity_pid());
    }

    /**
     * @param goodsType
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getTypes", method = RequestMethod.POST)
    public Object getTypes(@RequestBody GoodsType goodsType) {
        System.out.println(goodsType);
        return goodsService.getGoodsTypeByPid(goodsType.getType_pid());
    }

    /**
     * 首页回显
     *
     * @param goodsInfo
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getGoodsInfoBy/{currentPage}", method = RequestMethod.POST)
    public PageInfo getGoodsInfoBy(@PathVariable Integer currentPage,@RequestBody(required = false) GoodsInfo goodsInfo) {
        PageHelper.startPage(currentPage,9);
        List<GoodsInfo> goodsInfoBy = goodsService.getGoodsInfoBy(goodsInfo);
        return new PageInfo(goodsInfoBy);
    }

    /**
     * 搜索分页
     *
     * @param currentPage
     * @param
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getSearchGoodS/{currentPage}", method = RequestMethod.POST)
    public PageInfo getSearchGoodS(@PathVariable Integer currentPage,@RequestBody Map<String,String> map) {
        System.out.println(map+"          ffffffffffff");
        PageHelper.startPage(currentPage, 3);

        List<GoodsInfo> searchGoodS = goodsService.getSearchGoodS(map.get("key"),map.get("cause"),map.get("asc"),map.get("city"));
        return new PageInfo(searchGoodS);
    }

    /**
     * 商品类型
     *
     * @param goodsType
     * @return
     */
    @ResponseBody
    @RequestMapping(value = "getMenuSearch", method = RequestMethod.POST)
    public Object getMenuSearch(@RequestBody(required = false) GoodsType goodsType) {
        List<GoodsType> menuSearch = goodsService.getMenuSearch(goodsType);
        System.out.println(menuSearch);
        return menuSearch;
    }

}
