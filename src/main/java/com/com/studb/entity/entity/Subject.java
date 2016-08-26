package com.com.studb.entity.entity;

/**
 * 
 * @author wujiafeng
 */
public class Subject {
	/**
	 *  科目编号
	 */
	private Integer subjectNo;
	/**
	 *  科目名称
	 */
	private String subjectName;
	/**
	 *  课时数
	 */
	private Integer classHour;
	/**
	 *  所属年级
	 */
	private Integer gradeId;
	/**
	 * 科目编号
	 * @param subjectNo
	 */
	public void setSubjectNo(Integer subjectNo){
		this.subjectNo = subjectNo;
	}
	
    /**
     * 科目编号
     * @return
     */	
    public Integer getSubjectNo(){
    	return subjectNo;
    }
	/**
	 * 科目名称
	 * @param subjectName
	 */
	public void setSubjectName(String subjectName){
		this.subjectName = subjectName;
	}
	
    /**
     * 科目名称
     * @return
     */	
    public String getSubjectName(){
    	return subjectName;
    }
	/**
	 * 课时数
	 * @param classHour
	 */
	public void setClassHour(Integer classHour){
		this.classHour = classHour;
	}
	
    /**
     * 课时数
     * @return
     */	
    public Integer getClassHour(){
    	return classHour;
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
}