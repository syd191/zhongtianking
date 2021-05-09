package com.zhongtianking.pojo;

/**
 * @author xiaoyang
 * @Description 农业机械bean
 * @create 2021-05-09 20:43
 */
public class Machine {
    //机械id
    private int id;
    //机械介绍
    private String introduction;
    //机械分类
    private String sort;

    public Machine() {
    }

    public Machine(int id, String introduction, String sort) {
        this.id = id;
        this.introduction = introduction;
        this.sort = sort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "MachineBean{" +
                "id=" + id +
                ", introduction='" + introduction + '\'' +
                ", sort='" + sort + '\'' +
                '}';
    }
}
