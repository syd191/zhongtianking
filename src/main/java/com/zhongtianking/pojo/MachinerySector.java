package com.zhongtianking.pojo;

/**
 * @author xiaoyang
 * @Description 农用机械分类bean
 * @create 2021-05-11 12:21
 */
public class MachinerySector {
    //板块id
    private int sectorId;
    //板块名称
    private int sectorName;

    public MachinerySector() {
    }

    public MachinerySector(int sectorId, int sectorName) {
        this.sectorId = sectorId;
        this.sectorName = sectorName;
    }

    public int getSectorId() {
        return sectorId;
    }

    public void setSectorId(int sectorId) {
        this.sectorId = sectorId;
    }

    public int getSectorName() {
        return sectorName;
    }

    public void setSectorName(int sectorName) {
        this.sectorName = sectorName;
    }

    @Override
    public String toString() {
        return "MachinerySector{" +
                "sectorId=" + sectorId +
                ", sectorName=" + sectorName +
                '}';
    }
}
