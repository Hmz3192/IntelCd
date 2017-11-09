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



    public static void main(String[] args) {
        String location = "中国浙江省金华市婺城区二环北路";
        String sheng = "省";
        String shi = "市";
        String qu = "区";

        int sheng_size = location.indexOf(sheng);
        int shi_size = location.indexOf(shi);


        String shengName = location.substring(sheng_size-2,sheng_size); //substr的值为hel
        String shiName = location.substring(shi_size-2,shi_size); //substr的值为hel

        System.out.println(shengName+shiName);

        String location1 = shengName + shiName;

        System.out.println(location1.substring(0,2) + "-" + location1.substring(2, 4));

    }
}
