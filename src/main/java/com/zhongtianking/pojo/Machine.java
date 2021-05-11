package com.zhongtianking.pojo;

/**
 * @author xiaoyang
 * @Description 农业机械bean
 * @create 2021-05-09 20:43
 */
public class Machine {
    //机械id
    private int id;
    //板块id
    private int sectorId;
    //机械介绍
    private String introduction;
    //机械信息缩略图地址
    private String msgUrl;

    public Machine() {
    }

    public Machine(int id, int sectorId, String introduction, String msgUrl) {
        this.id = id;
        this.sectorId = sectorId;
        this.introduction = introduction;
        this.msgUrl = msgUrl;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public String getIntroduction() {
        return introduction;
    }

    public void setIntroduction(String introduction) {
        this.introduction = introduction;
    }

    public String getMsgUrl() {
        return msgUrl;
    }

    public void setMsgUrl(String msgUrl) {
        this.msgUrl = msgUrl;
    }

    @Override
    public String toString() {
        return "Machine{" +
                "id=" + id +
                ", sectorId=" + sectorId +
                ", introduction='" + introduction + '\'' +
                ", msgUrl='" + msgUrl + '\'' +
                '}';
    }
}
