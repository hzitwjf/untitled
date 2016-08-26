package com.com.studb.entity.entity;

/**
 * 
 * @author wujiafeng
 */
public class Student {
	/**
	 *  学号
	 */
	private Integer studentNo;
	/**
	 *  密码
	 */
	private String loginPwd;
	/**
	 *  学员名字
	 */
	private String studentName;
	/**
	 *  性别
	 */
	private Byte sex;
	/**
	 *  所属年级
	 */
	private Integer gradeId;
	/**
	 *  电话
	 */
	private String phone;
	/**
	 *  地址
	 */
	private String address;
	/**
	 *  出生日期
	 */
	private java.util.Date bornDate;
	/**
	 *  邮箱
	 */
	private String emall;
	/**
	 *  身份证
	 */
	private String identityCard;
	/**
	 * 学号
	 * @param studentNo
	 */
	public void setStudentNo(Integer studentNo){
		this.studentNo = studentNo;
	}
	
    /**
     * 学号
     * @return
     */	
    public Integer getStudentNo(){
    	return studentNo;
    }
	/**
	 * 密码
	 * @param loginPwd
	 */
	public void setLoginPwd(String loginPwd){
		this.loginPwd = loginPwd;
	}
	
    /**
     * 密码
     * @return
     */	
    public String getLoginPwd(){
    	return loginPwd;
    }
	/**
	 * 学员名字
	 * @param studentName
	 */
	public void setStudentName(String studentName){
		this.studentName = studentName;
	}
	
    /**
     * 学员名字
     * @return
     */	
    public String getStudentName(){
    	return studentName;
    }
	/**
	 * 性别
	 * @param sex
	 */
	public void setSex(Byte sex){
		this.sex = sex;
	}
	
    /**
     * 性别
     * @return
     */	
    public Byte getSex(){
    	return sex;
    }
	/**
	 * 所属年级
	 * @param gradeId
	 */
	public void setGradeId(Integer gradeId){
		this.gradeId = gradeId;
	}
	
    /**
     * 所属年级
     * @return
     */	
    public Integer getGradeId(){
    	return gradeId;
    }
	/**
	 * 电话
	 * @param phone
	 */
	public void setPhone(String phone){
		this.phone = phone;
	}
	
    /**
     * 电话
     * @return
     */	
    public String getPhone(){
    	return phone;
    }
	/**
	 * 地址
	 * @param address
	 */
	public void setAddress(String address){
		this.address = address;
	}
	
    /**
     * 地址
     * @return
     */	
    public String getAddress(){
    	return address;
    }
	/**
	 * 出生日期
	 * @param bornDate
	 */
	public void setBornDate(java.util.Date bornDate){
		this.bornDate = bornDate;
	}
	
    /**
     * 出生日期
     * @return
     */	
    public java.util.Date getBornDate(){
    	return bornDate;
    }
	/**
	 * 邮箱
	 * @param emall
	 */
	public void setEmall(String emall){
		this.emall = emall;
	}
	
    /**
     * 邮箱
     * @return
     */	
    public String getEmall(){
    	return emall;
    }
	/**
	 * 身份证
	 * @param identityCard
	 */
	public void setIdentityCard(String identityCard){
		this.identityCard = identityCard;
	}
	
    /**
     * 身份证
     * @return
     */	
    public String getIdentityCard(){
    	return identityCard;
    }
}