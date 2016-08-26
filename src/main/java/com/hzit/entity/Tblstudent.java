package com.hzit.entity;

/**
 * 
 * @author wujiafeng
 */
public class Tblstudent {
	/**
	 *  
	 */
	private String stuId;
	/**
	 *  
	 */
	private String stuName;
	/**
	 *  
	 */
	private Integer stuAge;
	/**
	 *  
	 */
	private String stuSex;
	/**
	 * 
	 * @param stuId
	 */
	public void setStuId(String stuId){
		this.stuId = stuId;
	}
	
    /**
     * 
     * @return
     */	
    public String getStuId(){
    	return stuId;
    }
	/**
	 * 
	 * @param stuName
	 */
	public void setStuName(String stuName){
		this.stuName = stuName;
	}
	
    /**
     * 
     * @return
     */	
    public String getStuName(){
    	return stuName;
    }
	/**
	 * 
	 * @param stuAge
	 */
	public void setStuAge(Integer stuAge){
		this.stuAge = stuAge;
	}
	
    /**
     * 
     * @return
     */	
    public Integer getStuAge(){
    	return stuAge;
    }
	/**
	 * 
	 * @param stuSex
	 */
	public void setStuSex(String stuSex){
		this.stuSex = stuSex;
	}
	
    /**
     * 
     * @return
     */	
    public String getStuSex(){
    	return stuSex;
    }
}