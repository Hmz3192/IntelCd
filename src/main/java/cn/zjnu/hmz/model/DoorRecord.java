package cn.zjnu.hmz.model;

public class DoorRecord {
    private Integer id;

    private Integer userId;

    private Integer doorId;

    private String openTime;

    private String openKind;

    private String openPassword;

    private String openReson;

    public DoorRecord(Integer id, Integer userId, Integer doorId, String openTime, String openKind, String openPassword, String openReson) {
        this.id = id;
        this.userId = userId;
        this.doorId = doorId;
        this.openTime = openTime;
        this.openKind = openKind;
        this.openPassword = openPassword;
        this.openReson = openReson;
    }

    public DoorRecord() {
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

    public Integer getDoorId() {
        return doorId;
    }

    public void setDoorId(Integer doorId) {
        this.doorId = doorId;
    }

    public String getOpenTime() {
        return openTime;
    }

    public void setOpenTime(String openTime) {
        this.openTime = openTime == null ? null : openTime.trim();
    }

    public String getOpenKind() {
        return openKind;
    }

    public void setOpenKind(String openKind) {
        this.openKind = openKind == null ? null : openKind.trim();
    }

    public String getOpenPassword() {
        return openPassword;
    }

    public void setOpenPassword(String openPassword) {
        this.openPassword = openPassword == null ? null : openPassword.trim();
    }

    public String getOpenReson() {
        return openReson;
    }

    public void setOpenReson(String openReson) {
        this.openReson = openReson == null ? null : openReson.trim();
    }
}