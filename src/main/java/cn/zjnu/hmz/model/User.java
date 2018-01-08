package cn.zjnu.hmz.model;

public class User {
    private Integer id;

    private String account;

    private String name;

    private String password;

    private String picUrl;

    private String sixPasswrod;

    private String iphone;

    private String email;

    public User(Integer id, String account, String name, String password, String picUrl, String sixPasswrod, String iphone, String email) {
        this.id = id;
        this.account = account;
        this.name = name;
        this.password = password;
        this.picUrl = picUrl;
        this.sixPasswrod = sixPasswrod;
        this.iphone = iphone;
        this.email = email;
    }

    public User() {
        super();
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account == null ? null : account.trim();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public String getPicUrl() {
        return picUrl;
    }

    public void setPicUrl(String picUrl) {
        this.picUrl = picUrl == null ? null : picUrl.trim();
    }

    public String getSixPasswrod() {
        return sixPasswrod;
    }

    public void setSixPasswrod(String sixPasswrod) {
        this.sixPasswrod = sixPasswrod == null ? null : sixPasswrod.trim();
    }

    public String getIphone() {
        return iphone;
    }

    public void setIphone(String iphone) {
        this.iphone = iphone == null ? null : iphone.trim();
    }

    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", account='" + account + '\'' +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                ", picUrl='" + picUrl + '\'' +
                ", sixPasswrod='" + sixPasswrod + '\'' +
                ", iphone='" + iphone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void setEmail(String email) {

        this.email = email == null ? null : email.trim();
    }
}