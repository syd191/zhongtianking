package com.zhongtianking.pojo;

/**
 * @author xiaoyang
 * @Description 农作物种植时间bean
 * @create 2021-05-09 20:48
 */
public class Season {
    //农作物id
    private int id;
    //种植时间
    private String plantingDate;
    //农作物分类
    private String sort;

    public Season() {
    }

    public Season(int id, String plantingDate, String sort) {
        this.id = id;
        this.plantingDate = plantingDate;
        this.sort = sort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getPlantingDate() {
        return plantingDate;
    }

    public void setPlantingDate(String plantingDate) {
        this.plantingDate = plantingDate;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    @Override
    public String toString() {
        return "SeasonBean{" +
                "id=" + id +
                ", plantingDate='" + plantingDate + '\'' +
                ", sort='" + sort + '\'' +
                '}';
    }
}
