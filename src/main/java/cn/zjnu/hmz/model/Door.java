package cn.zjnu.hmz.model;

public class Door {
    private Integer id;

    private Integer userId;

    private String doorName;

    private String doorLocation;

    private String doorId;

    private String addTime;

    private String doorState;

    private String doorKind;

    public Door(Integer id, Integer userId, String doorName, String doorLocation, String doorId, String addTime, String doorState, String doorKind) {
        this.id = id;
        this.userId = userId;
        this.doorName = doorName;
        this.doorLocation = doorLocation;
        this.doorId = doorId;
        this.addTime = addTime;
        this.doorState = doorState;
        this.doorKind = doorKind;
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

    public String getDoorId() {
        return doorId;
    }

    public void setDoorId(String doorId) {
        this.doorId = doorId == null ? null : doorId.trim();
    }

    public String getAddTime() {
        return addTime;
    }

    public void setAddTime(String addTime) {
        this.addTime = addTime == null ? null : addTime.trim();
    }

    public String getDoorState() {
        return doorState;
    }

    public void setDoorState(String doorState) {
        this.doorState = doorState == null ? null : doorState.trim();
    }

    public String getDoorKind() {
        return doorKind;
    }

    public void setDoorKind(String doorKind) {
        this.doorKind = doorKind == null ? null : doorKind.trim();
    }
}