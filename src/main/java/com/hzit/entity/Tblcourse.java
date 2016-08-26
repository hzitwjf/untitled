package com.hzit.entity;

/**
 * 
 * @author wujiafeng
 */
public class Tblcourse {
	/**
	 *  
	 */
	private String courseId;
	/**
	 *  
	 */
	private String courseName;
	/**
	 *  
	 */
	private String teaId;
	/**
	 * 
	 * @param courseId
	 */
	public void setCourseId(String courseId){
		this.courseId = courseId;
	}
	
    /**
     * 
     * @return
     */	
    public String getCourseId(){
    	return courseId;
    }
	/**
	 * 
	 * @param courseName
	 */
	public void setCourseName(String courseName){
		this.courseName = courseName;
	}
	
    /**
     * 
     * @return
     */	
    public String getCourseName(){
    	return courseName;
    }
	/**
	 * 
	 * @param teaId
	 */
	public void setTeaId(String teaId){
		this.teaId = teaId;
	}
	
    /**
     * 
     * @return
     */	
    public String getTeaId(){
    	return teaId;
    }
}