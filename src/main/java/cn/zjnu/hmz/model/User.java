package cn.zjnu.hmz.model;

public class User {
    private Integer id;

    private String account;

    private String name;

    private String password;

    private String picUrl;

    private String sixPassword;

    private String iphone;

    private String email;

    private String idCard;

    private String cardPic;

    private String locationId;

    public User(Integer id, String account, String name, String password, String picUrl, String sixPassword, String iphone, String email, String idCard, String cardPic, String locationId) {
        this.id = id;
        this.account = account;
        this.name = name;
        this.password = password;
        this.picUrl = picUrl;
        this.sixPassword = sixPassword;
        this.iphone = iphone;
        this.email = email;
        this.idCard = idCard;
        this.cardPic = cardPic;
        this.locationId = locationId;
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

    public String getSixPassword() {
        return sixPassword;
    }

    public void setSixPassword(String sixPassword) {
        this.sixPassword = sixPassword == null ? null : sixPassword.trim();
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

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard == null ? null : idCard.trim();
    }

    public String getCardPic() {
        return cardPic;
    }

    public void setCardPic(String cardPic) {
        this.cardPic = cardPic == null ? null : cardPic.trim();
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        this.locationId = locationId == null ? null : locationId.trim();
    }
}