package union.net;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/11.
 */
public class UserDuiXiang implements Serializable{
    private String userId;
    private String pwd;
    public UserDuiXiang(){

    }
    public UserDuiXiang(String userId,String pwd){
        this.userId=userId;
        this.pwd=pwd;
    }

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

}
