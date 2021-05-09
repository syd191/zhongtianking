package com.zhongtianking.pojo;

/**
 * @author xiaoyang
 * @Description 论坛板块bean
 * @create 2021-05-09 20:32
 */
public class Section {
    //是否为精华贴
    private Boolean isFine;
    //是否为顶置贴
    private Boolean isOverhead;
    //是否为推荐帖
    private Boolean isrecommendation;

    public Section(Boolean isFine, Boolean isOverhead, Boolean isrecommendation) {
        this.isFine = isFine;
        this.isOverhead = isOverhead;
        this.isrecommendation = isrecommendation;
    }

    @Override
    public String toString() {
        return "SectionBean{" +
                "isFine=" + isFine +
                ", isOverhead=" + isOverhead +
                ", isrecommendation=" + isrecommendation +
                '}';
    }

    public Section() {
    }

    public Boolean getFine() {
        return isFine;
    }

    public void setFine(Boolean fine) {
        isFine = fine;
    }

    public Boolean getOverhead() {
        return isOverhead;
    }

    public void setOverhead(Boolean overhead) {
        isOverhead = overhead;
    }

    public Boolean getIsrecommendation() {
        return isrecommendation;
    }

    public void setIsrecommendation(Boolean isrecommendation) {
        this.isrecommendation = isrecommendation;
    }
}
