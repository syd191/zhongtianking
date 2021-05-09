package com.zhongtianking.pojo;

/**
 * @author xiaoyang
 * @Description 农作物价格bean
 * @create 2021-05-09 20:50
 */
public class Price {
    //农作物id
    private int id;
    //农作物价格
    private double price;
    //农作物分类
    private String sort;

    @Override
    public String toString() {
        return "PriceBean{" +
                "id=" + id +
                ", price=" + price +
                ", sort='" + sort + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Price(int id, double price, String sort) {
        this.id = id;
        this.price = price;
        this.sort = sort;
    }

    public Price() {
    }
}
