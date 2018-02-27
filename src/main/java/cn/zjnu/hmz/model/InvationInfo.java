package cn.zjnu.hmz.model;

public class InvationInfo {
    private Integer userId;

    private Integer groupId;

    private String reason;

    private String status;

    public InvationInfo(Integer userId, Integer groupId, String reason, String status) {
        this.userId = userId;
        this.groupId = groupId;
        this.reason = reason;
        this.status = status;
    }

    public InvationInfo() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getGroupId() {
        return groupId;
    }

    public void setGroupId(Integer groupId) {
        this.groupId = groupId;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason == null ? null : reason.trim();
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }
}