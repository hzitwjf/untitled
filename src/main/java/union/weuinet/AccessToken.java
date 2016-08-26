package union.weuinet;

import com.fasterxml.jackson.databind.JsonNode;
import com.hzit.util.NetUtils;

/**
 * Created by Administrator on 2016/8/13.
 */
public class AccessToken {
    public static String accessToken() {
        String cropid = null;
        String secrect = null;
        JsonNode yaoshi = null;
        try {
            cropid = "wx56fa916da08b0108";
            secrect = "rGq6rcc8kwDHor3K7StzjTA9G37ER4M4qjdnpNjfY5aROWrqZ6-8_x7TjrEyKzn_";
            yaoshi = NetUtils.getJson("https://qyapi.weixin.qq.com/cgi-bin/gettoken?corpid=" + cropid + "&corpsecret=" + secrect);
            //System.out.println(yaoshi.get("access_token"));
            return yaoshi.get("access_token").asText();
        } catch (Exception e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        return "";

    }
}
