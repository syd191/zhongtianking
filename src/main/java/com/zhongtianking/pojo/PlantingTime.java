package com.zhongtianking.pojo;

/**
 * @author xiaoyang
 * @Description 简单农作物种植时间bean
 * @create 2021-05-09 20:48
 */
public class PlantingTime {
    //农作物id
    private int id;
    //农作物分类
    private int ssectorId;
    //种植时间
    private String plantingDate;
    //农作物价格
    private double price;
    //农作物缩略图地址
    private String msgUrl;

    public PlantingTime() {
    }

    public PlantingTime(int id, int ssectorId, String plantingDate, double price, String msgUrl) {
        this.id = id;
        this.ssectorId = ssectorId;
        this.plantingDate = plantingDate;
        this.price = price;
        this.msgUrl = msgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSsectorId() {
        return ssectorId;
    }

    public void setSsectorId(int ssectorId) {
        this.ssectorId = ssectorId;
    }

    public String getPlantingDate() {
        return plantingDate;
    }

    public void setPlantingDate(String plantingDate) {
        this.plantingDate = plantingDate;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getMsgUrl() {
        return msgUrl;
    }

    public void setMsgUrl(String msgUrl) {
        this.msgUrl = msgUrl;
    }

    @Override
    public String toString() {
        return "PlantingTime{" +
                "id=" + id +
                ", ssectorId=" + ssectorId +
                ", plantingDate='" + plantingDate + '\'' +
                ", price=" + price +
                ", msgUrl='" + msgUrl + '\'' +
                '}';
    }
}
