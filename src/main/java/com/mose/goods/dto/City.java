package com.mose.goods.dto;




public class City {
    private int city_id;
    private int city_pid;
    private String city_name;

    public City() {
    }

    public int getCity_id() {
        return city_id;
    }

    public void setCity_id(int city_id) {
        this.city_id = city_id;
    }

    public int getCity_pid() {
        return city_pid;
    }

    public void setCity_pid(int city_pid) {
        this.city_pid = city_pid;
    }

    public String getCity_name() {
        return city_name;
    }

    public void setCity_name(String city_name) {
        this.city_name = city_name;
    }

    @Override
    public String toString() {
        return "City{" +
                "city_id=" + city_id +
                ", city_pid=" + city_pid +
                ", city_name='" + city_name + '\'' +
                '}';
    }
}
