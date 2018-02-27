package cn.zjnu.hmz.model;

public class GroupInfo {
    private Integer groupid;

    private String groupname;

    private String invateperson;

    public GroupInfo(Integer groupid, String groupname, String invateperson) {
        this.groupid = groupid;
        this.groupname = groupname;
        this.invateperson = invateperson;
    }

    public GroupInfo() {
        super();
    }

    public Integer getGroupid() {
        return groupid;
    }

    public void setGroupid(Integer groupid) {
        this.groupid = groupid;
    }

    public String getGroupname() {
        return groupname;
    }

    public void setGroupname(String groupname) {
        this.groupname = groupname == null ? null : groupname.trim();
    }

    public String getInvateperson() {
        return invateperson;
    }

    public void setInvateperson(String invateperson) {
        this.invateperson = invateperson == null ? null : invateperson.trim();
    }
}