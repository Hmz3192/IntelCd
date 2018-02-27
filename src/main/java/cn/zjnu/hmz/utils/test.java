package cn.zjnu.hmz.utils;

import cn.zjnu.hmz.model.User;

import java.time.temporal.Temporal;
import java.util.*;

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



    /*public static void main(String[] args) {
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

    }*/

    /*public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 4, 5};
        List<User> users = new ArrayList<>();
        for (Integer i = 0; i < 5; i++) {
            users.add(i, new User(i, " ", " ", " ", " ", " ", " ", " "));
        }
        int i = 0;
        for(Iterator iterator = users.iterator();iterator.hasNext();) {
            System.out.println(iterator.next());
            i++;
        }


       *//* String a = "hhell";
        a = a + "ssdasdasd";
        System.out.println(a);

        for (Integer i = 0; i < 5; i++) {
            users.add(i, new User(i, " ", " ", " ", " ", " ", " ", " "));
        }
        users = randomList(users);

        for (int i = 0 ; i< 5 ;i++) {
            System.out.println(users.get(i).getId().toString());

        }*//*
    }*/

    public static int[] randomArr(int[] arr) {

        int[] arrTemp = new int[5];
        int end = arr.length;
        Random rad = new Random();


        for (int i = 0; i < arr.length; i++) {
            int index = rad.nextInt(end);
            arrTemp[i] = arr[index];
            arr[index] = arr[end - 1];
            end--;
        }

        return arrTemp;
    }


    public static List<User> randomList(List<User> objects) {

        List<User> objects1Temp = new ArrayList<>();
        int end = objects.size();
        int list = end;
        Random rad = new Random();

        for (int i = 0; i < list; i++) {
            int index = rad.nextInt(end);
            objects1Temp.add(objects.get(index));
            objects.remove(index);
            end--;
        }
        return objects1Temp;
    }

}


