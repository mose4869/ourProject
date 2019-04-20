package com.mose.goods.pojo;

import java.util.List;

public class GoodsType {
    int type_id;
    String type_name;
    int type_pid;
    int status;
    List<GoodsType> children;

    public int getType_id() {
        return type_id;
    }

    public void setType_id(int type_id) {
        this.type_id = type_id;
    }

    public String getType_name() {
        return type_name;
    }

    public void setType_name(String type_name) {
        this.type_name = type_name;
    }

    public int getType_pid() {
        return type_pid;
    }

    public void setType_pid(int type_pid) {
        this.type_pid = type_pid;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public List<GoodsType> getChildren() {
        return children;
    }

    public void setChildren(List<GoodsType> children) {
        this.children = children;
    }

    @Override
    public String toString() {
        return "GoodsType{" +
                "type_id=" + type_id +
                ", type_name='" + type_name + '\'' +
                ", type_pid=" + type_pid +
                ", status=" + status +
                ", children=" + children +
                '}';
    }
}
