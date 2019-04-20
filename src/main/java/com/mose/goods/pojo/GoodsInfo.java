package com.mose.goods.pojo;

import com.fasterxml.jackson.annotation.JsonFormat;

import java.util.Date;

public class GoodsInfo {
    int goods_id;
    int userid;
    String goods_title;
    String goods_description;
    long goods_price;
    String goods_pic;
    int goods_type;
    int goods_pid;
    int goods_num;
    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss",timezone="GMT+8")
    Date goods_date;
    int goods_serial;
    String city;
    int rate;
    String old;
    int recommend;
    int status=1;

    public int getGoods_serial() {
        return goods_serial;
    }

    public void setGoods_serial(int goods_serial) {
        this.goods_serial = goods_serial;
    }

    public String getOld() {
        return old;
    }

    public void setOld(String old) {
        this.old = old;
    }

    public int getGoods_id() {
        return goods_id;
    }

    public void setGoods_id(int goods_id) {
        this.goods_id = goods_id;
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

    public long getGoods_price() {
        return goods_price;
    }

    public void setGoods_price(long goods_price) {
        this.goods_price = goods_price;
    }

    public String getGoods_pic() {
        return goods_pic;
    }

    public void setGoods_pic(String goods_pic) {
        this.goods_pic = goods_pic;
    }

    public int getGoods_type() {
        return goods_type;
    }

    public void setGoods_type(int goods_type) {
        this.goods_type = goods_type;
    }

    public int getGoods_pid() {
        return goods_pid;
    }

    public void setGoods_pid(int goods_pid) {
        this.goods_pid = goods_pid;
    }

    public int getGoods_num() {
        return goods_num;
    }

    public void setGoods_num(int goods_num) {
        this.goods_num = goods_num;
    }

    public Date getGoods_date() {
        return goods_date;
    }

    public void setGoods_date(Date goods_date) {
        this.goods_date = goods_date;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public int getRate() {
        return rate;
    }

    public void setRate(int rate) {
        this.rate = rate;
    }

    public int getRecommend() {
        return recommend;
    }

    public void setRecommend(int recommend) {
        this.recommend = recommend;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "GoodsInfo{" +
                "goods_id=" + goods_id +
                ", userid=" + userid +
                ", goods_title='" + goods_title + '\'' +
                ", goods_description='" + goods_description + '\'' +
                ", goods_price=" + goods_price +
                ", goods_pic='" + goods_pic + '\'' +
                ", goods_type=" + goods_type +
                ", goods_pid=" + goods_pid +
                ", goods_num=" + goods_num +
                ", goods_date=" + goods_date +
                ", goods_serial=" + goods_serial +
                ", city='" + city + '\'' +
                ", rate=" + rate +
                ", old='" + old + '\'' +
                ", recommend=" + recommend +
                ", status=" + status +
                '}';
    }
}
