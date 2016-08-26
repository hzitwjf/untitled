package union.weuinet;

import java.io.Serializable;

/**
 * Created by Administrator on 2016/8/12.
 */
public class User implements Serializable {
    private String userId;
    private String name;
    private int department;
    private String position;
    private String mobile;
    private int gender;
    private String email;
    private String weixinId;
    private String avatarMediaid;
    private String extattr;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDepartment() {
        return department;
    }

    public void setDepartment(int department) {
        this.department = department;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public int getGender() {
        return gender;
    }

    public void setGender(int gender) {
        this.gender = gender;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWeixinId() {
        return weixinId;
    }

    public void setWeixinId(String weixinId) {
        this.weixinId = weixinId;
    }

    public String getAvatarMediaid() {
        return avatarMediaid;
    }

    public void setAvatarMediaid(String avatarMediaid) {
        this.avatarMediaid = avatarMediaid;
    }

    public String getExtattr() {
        return extattr;
    }

    public void setExtattr(String extattr) {
        this.extattr = extattr;
    }
}
