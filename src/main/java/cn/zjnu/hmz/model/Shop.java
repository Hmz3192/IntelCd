package cn.zjnu.hmz.model;

public class Shop {
    private Integer shopId;

    private String shopName;

    private String shopPics;

    private String shopLocation;

    private String shopVerifyCard;

    private String shopProducts;

    private String productsPics;

    private String shopIntro;

    private String shopTips;

    private String longitude;

    private String dimension;

    public Shop(Integer shopId, String shopName, String shopPics, String shopLocation, String shopVerifyCard, String shopProducts, String productsPics, String shopIntro, String shopTips, String longitude, String dimension) {
        this.shopId = shopId;
        this.shopName = shopName;
        this.shopPics = shopPics;
        this.shopLocation = shopLocation;
        this.shopVerifyCard = shopVerifyCard;
        this.shopProducts = shopProducts;
        this.productsPics = productsPics;
        this.shopIntro = shopIntro;
        this.shopTips = shopTips;
        this.longitude = longitude;
        this.dimension = dimension;
    }

    public Shop() {
        super();
    }

    public Integer getShopId() {
        return shopId;
    }

    public void setShopId(Integer shopId) {
        this.shopId = shopId;
    }

    public String getShopName() {
        return shopName;
    }

    public void setShopName(String shopName) {
        this.shopName = shopName == null ? null : shopName.trim();
    }

    public String getShopPics() {
        return shopPics;
    }

    public void setShopPics(String shopPics) {
        this.shopPics = shopPics == null ? null : shopPics.trim();
    }

    public String getShopLocation() {
        return shopLocation;
    }

    public void setShopLocation(String shopLocation) {
        this.shopLocation = shopLocation == null ? null : shopLocation.trim();
    }

    public String getShopVerifyCard() {
        return shopVerifyCard;
    }

    public void setShopVerifyCard(String shopVerifyCard) {
        this.shopVerifyCard = shopVerifyCard == null ? null : shopVerifyCard.trim();
    }

    public String getShopProducts() {
        return shopProducts;
    }

    public void setShopProducts(String shopProducts) {
        this.shopProducts = shopProducts == null ? null : shopProducts.trim();
    }

    public String getProductsPics() {
        return productsPics;
    }

    public void setProductsPics(String productsPics) {
        this.productsPics = productsPics == null ? null : productsPics.trim();
    }

    public String getShopIntro() {
        return shopIntro;
    }

    public void setShopIntro(String shopIntro) {
        this.shopIntro = shopIntro == null ? null : shopIntro.trim();
    }

    public String getShopTips() {
        return shopTips;
    }

    public void setShopTips(String shopTips) {
        this.shopTips = shopTips == null ? null : shopTips.trim();
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude == null ? null : longitude.trim();
    }

    public String getDimension() {
        return dimension;
    }

    public void setDimension(String dimension) {
        this.dimension = dimension == null ? null : dimension.trim();
    }
}