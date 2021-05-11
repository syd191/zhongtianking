package com.zhongtianking.pojo;

/**
 * @author xiaoyang
 * @Description 农作物分类
 * @create 2021-05-11 12:31
 */
public class CropSector {
    private int sectorId;
    private int sectorName;

    public CropSector() {
    }

    public CropSector(int sectorId, int sectorName) {
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
        return "CropSector{" +
                "sectorId=" + sectorId +
                ", sectorName=" + sectorName +
                '}';
    }
}
