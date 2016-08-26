package com.com.studb.entity.entity;

/**
 * 
 * @author wujiafeng
 */
public class Result {
	/**
	 *  参加考试的学员编号
	 */
	private Integer studentNo;
	/**
	 *  参考考试的科目编号
	 */
	private Integer subjectNo;
	/**
	 *  参加考试的考试时间
	 */
	private java.util.Date examDate;
	/**
	 *  考试分数
	 */
	private Integer studentResult;
	/**
	 *  
	 */
	private Integer studentPk;
	/**
	 * 参加考试的学员编号
	 * @param studentNo
	 */
	public void setStudentNo(Integer studentNo){
		this.studentNo = studentNo;
	}
	
    /**
     * 参加考试的学员编号
     * @return
     */	
    public Integer getStudentNo(){
    	return studentNo;
    }
	/**
	 * 参考考试的科目编号
	 * @param subjectNo
	 */
	public void setSubjectNo(Integer subjectNo){
		this.subjectNo = subjectNo;
	}
	
    /**
     * 参考考试的科目编号
     * @return
     */	
    public Integer getSubjectNo(){
    	return subjectNo;
    }
	/**
	 * 参加考试的考试时间
	 * @param examDate
	 */
	public void setExamDate(java.util.Date examDate){
		this.examDate = examDate;
	}
	
    /**
     * 参加考试的考试时间
     * @return
     */	
    public java.util.Date getExamDate(){
    	return examDate;
    }
	/**
	 * 考试分数
	 * @param studentResult
	 */
	public void setStudentResult(Integer studentResult){
		this.studentResult = studentResult;
	}
	
    /**
     * 考试分数
     * @return
     */	
    public Integer getStudentResult(){
    	return studentResult;
    }
	/**
	 * 
	 * @param studentPk
	 */
	public void setStudentPk(Integer studentPk){
		this.studentPk = studentPk;
	}
	
    /**
     * 
     * @return
     */	
    public Integer getStudentPk(){
    	return studentPk;
    }
}