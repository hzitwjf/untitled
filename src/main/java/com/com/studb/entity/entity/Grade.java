package com.com.studb.entity.entity;

/**
 * 
 * @author wujiafeng
 */
public class Grade {
	/**
	 *  年级ID
	 */
	private Integer gradeId;
	/**
	 *  年级名称
	 */
	private String gradeName;
	/**
	 * 年级ID
	 * @param gradeId
	 */
	public void setGradeId(Integer gradeId){
		this.gradeId = gradeId;
	}
	
    /**
     * 年级ID
     * @return
     */	
    public Integer getGradeId(){
    	return gradeId;
    }
	/**
	 * 年级名称
	 * @param gradeName
	 */
	public void setGradeName(String gradeName){
		this.gradeName = gradeName;
	}
	
    /**
     * 年级名称
     * @return
     */	
    public String getGradeName(){
    	return gradeName;
    }
}