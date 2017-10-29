package cn.zjnu.hmz.utils;

import cn.zjnu.hmz.config.Salt;
import com.google.gson.Gson;
import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;


public class JsonUtils {
    public static String readSalt(){
        File file = new File("E:\\WorkSpace\\Idea\\IntelCd\\src\\main\\java\\cn\\zjnu\\hmz\\config\\salt.json");
        String content = null;
        try {
            content = FileUtils.readFileToString(file);
        } catch (IOException e) {
            e.printStackTrace();
        }
        Gson gson = new Gson();
        Salt salt = gson.fromJson(content, Salt.class);
        return salt.getSalt();
    }
}
