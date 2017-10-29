package cn.zjnu.hmz.model;

import java.util.Date;

public class Door {
    private Integer id;

    private Integer userId;

    private String doorName;

    private String doorLocation;

    private Integer doorId;

    private Date addTime;

    private String doorState;

    public Door(Integer id, Integer userId, String doorName, String doorLocation, Integer doorId, Date addTime, String doorState) {
        this.id = id;
        this.userId = userId;
        this.doorName = doorName;
        this.doorLocation = doorLocation;
        this.doorId = doorId;
        this.addTime = addTime;
        this.doorState = doorState;
    }

    public Door() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getDoorName() {
        return doorName;
    }

    public void setDoorName(String doorName) {
        this.doorName = doorName == null ? null : doorName.trim();
    }

    public String getDoorLocation() {
        return doorLocation;
    }

    public void setDoorLocation(String doorLocation) {
        this.doorLocation = doorLocation == null ? null : doorLocation.trim();
    }

    public Integer getDoorId() {
        return doorId;
    }

    public void setDoorId(Integer doorId) {
        this.doorId = doorId;
    }

    public Date getAddTime() {
        return addTime;
    }

    public void setAddTime(Date addTime) {
        this.addTime = addTime;
    }

    public String getDoorState() {
        return doorState;
    }

    public void setDoorState(String doorState) {
        this.doorState = doorState == null ? null : doorState.trim();
    }
}