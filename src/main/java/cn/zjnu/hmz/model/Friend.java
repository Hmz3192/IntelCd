package cn.zjnu.hmz.model;

public class Friend {
    private Integer userId;

    private Integer account;

    private String nick;

    private Integer friendId;

    private String state;

    public Friend(Integer userId, Integer account, String nick, Integer friendId, String state) {
        this.userId = userId;
        this.account = account;
        this.nick = nick;
        this.friendId = friendId;
        this.state = state;
    }

    public Friend() {
        super();
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getAccount() {
        return account;
    }

    public void setAccount(Integer account) {
        this.account = account;
    }

    public String getNick() {
        return nick;
    }

    public void setNick(String nick) {
        this.nick = nick == null ? null : nick.trim();
    }

    public Integer getFriendId() {
        return friendId;
    }

    public void setFriendId(Integer friendId) {
        this.friendId = friendId;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }
}