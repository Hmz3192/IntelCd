package cn.zjnu.hmz.config;


public class Salt {
    private String salt;

    public Salt() {
    }

    public Salt(String salt) {
        this.salt = salt;
    }

    public String getSalt() {
        return salt;
    }

    public void setSalt(String salt) {
        this.salt = salt;
    }
}
