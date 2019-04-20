package com.mose.goods.vo;
import java.io.Serializable;
import java.util.List;


public class GoodsInfoVo implements Serializable {
    int userid;
    String  goods_title;
    String  goods_description;
    double goods_price;
    String  goods_pic;
    String goods_type;
    int goods_pid;
    String goods_num;
    String  goods_date;
    String city;
    long  rate;
    long recommend;
    String goods_newLevel;
    List<String> imgPaths;

    public GoodsInfoVo() {
    }

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getGoods_title() {
        return goods_title;
    }

    public void setGoods_title(String goods_title) {
        this.goods_title = goods_title;
    }

    public String getGoods_description() {
        return goods_description;
    }

    public void setGoods_description(String goods_description) {
        this.goods_description = goods_description;
    }

    public double getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(double goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_pic() {
        return goods_pic;
    }

    public void setGoods_pic(String goods_pic) {
        this.goods_pic = goods_pic;
    }

    public String getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(String goods_type) {
        this.goods_type = goods_type;
    }

    public int getGoods_pid() {
        return goods_pid;
    }

    public void setGoods_pid(int goods_pid) {
        this.goods_pid = goods_pid;
    }

    public String getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(String goods_num) {
        this.goods_num = goods_num;
    }

    public String getGoods_date() {
        return goods_date;
    }

    public void setGoods_date(String goods_date) {
        this.goods_date = goods_date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public long getRate() {
        return rate;
    }

    public void setRate(long rate) {
        this.rate = rate;
    }

    public long getRecommend() {
        return recommend;
    }

    public void setRecommend(long recommend) {
        this.recommend = recommend;
    }

    public String getGoods_newLevel() {
        return goods_newLevel;
    }

    public void setGoods_newLevel(String goods_newLevel) {
        this.goods_newLevel = goods_newLevel;
    }

    public List<String> getImgPaths() {
        return imgPaths;
    }

    public void setImgPaths(List<String> imgPaths) {
        this.imgPaths = imgPaths;
    }

    @Override
    public String toString() {
        return "GoodsInfoVo{" +
                "userid=" + userid +
                ", goods_title='" + goods_title + '\'' +
                ", goods_description='" + goods_description + '\'' +
                ", goods_price=" + goods_price +
                ", goods_pic='" + goods_pic + '\'' +
                ", goods_type='" + goods_type + '\'' +
                ", goods_pid=" + goods_pid +
                ", goods_num='" + goods_num + '\'' +
                ", goods_date='" + goods_date + '\'' +
                ", city='" + city + '\'' +
                ", rate=" + rate +
                ", recommend=" + recommend +
                ", goods_newLevel='" + goods_newLevel + '\'' +
                ", imgPaths=" + imgPaths +
                '}';
    }

}
