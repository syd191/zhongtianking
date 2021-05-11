package com.zhongtianking.pojo;

/**
 * @author xiaoyang
 * @Description 论坛板块bean
 * @create 2021-05-11 11:56
 */
public class ForumSection {
    private int pid;
    private String sectionName;

    @Override
    public String toString() {
        return "Section{" +
                "pid=" + pid +
                ", sectionName='" + sectionName + '\'' +
                '}';
    }

    public ForumSection(int pid, String sectionName) {
        this.pid = pid;
        this.sectionName = sectionName;
    }

    public ForumSection() {
    }

    public int getPid() {
        return pid;
    }

    public void setPid(int id) {
        this.pid = id;
    }

    public String getSectionName() {
        return sectionName;
    }

    public void setSectionName(String sectionName) {
        this.sectionName = sectionName;
    }
}
