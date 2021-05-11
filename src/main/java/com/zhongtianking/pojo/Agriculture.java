package com.zhongtianking.pojo;

import java.util.Date;

/**
 * @author xiaoyang
 * @Description 农业知识科普bean
 * @create 2021-05-09 20:42
 */
public class Agriculture {
    //文章id
    private int id;
    //发布人id
    private int rootid;
    //分类
    private String sort;
    //发布时间
    private Date issuingTime;
    //文章标题
    private String title;
    //内容
    private String content;
    //缩略图地址
    private String msgUrl;

    public Agriculture() {
    }

    public Agriculture(int id, int rootid, String sort, Date issuingTime, String title, String content, String msgUrl) {
        this.id = id;
        this.rootid = rootid;
        this.sort = sort;
        this.issuingTime = issuingTime;
        this.title = title;
        this.content = content;
        this.msgUrl = msgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRootid() {
        return rootid;
    }

    public void setRootid(int rootid) {
        this.rootid = rootid;
    }

    public String getSort() {
        return sort;
    }

    public void setSort(String sort) {
        this.sort = sort;
    }

    public Date getIssuingTime() {
        return issuingTime;
    }

    public void setIssuingTime(Date issuingTime) {
        this.issuingTime = issuingTime;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getMsgUrl() {
        return msgUrl;
    }

    public void setMsgUrl(String msgUrl) {
        this.msgUrl = msgUrl;
    }

    @Override
    public String toString() {
        return "Agriculture{" +
                "id=" + id +
                ", rootid=" + rootid +
                ", sort='" + sort + '\'' +
                ", issuingTime=" + issuingTime +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", msgUrl='" + msgUrl + '\'' +
                '}';
    }
}
