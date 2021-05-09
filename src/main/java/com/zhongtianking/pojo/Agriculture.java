package com.zhongtianking.pojo;

import java.sql.Date;

/**
 * @author xiaoyang
 * @Description 农业知识科普bean
 * @create 2021-05-09 20:42
 */
public class Agriculture {
    //发布时间
    private Date issuingTime;
    //内容
    private String content;
    //分类
    private String sort;
    //id
    private int id;

    public Agriculture() {
    }

    public Agriculture(Date issuingTime, String content, String sort, int id) {
        this.issuingTime = issuingTime;
        this.content = content;
        this.sort = sort;
        this.id = id;
    }

    public Date getIssuingTime() {
        return issuingTime;
    }

    public void setIssuingTime(Date issuingTime) {
        this.issuingTime = issuingTime;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "AgricultureBean{" +
                "issuingTime=" + issuingTime +
                ", content='" + content + '\'' +
                ", sort='" + sort + '\'' +
                ", id=" + id +
                '}';
    }
}
