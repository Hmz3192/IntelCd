package cn.zjnu.hmz.utils;

/**
 * @Author Hu mingzhi
 * Created by ThinKPad on 2017/10/29.
 */
public class test {


    public static String getSixId() {
        double v = (Math.random() * 9 + 1) * 100000;
        int a = (int) v;
        return String.valueOf(a);
    }
}
