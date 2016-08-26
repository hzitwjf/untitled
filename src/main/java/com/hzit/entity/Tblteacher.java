package com.hzit.entity;

/**
 * 
 * @author wujiafeng
 */
public class Tblteacher {
	/**
	 *  
	 */
	private String teaId;
	/**
	 *  
	 */
	private String teaName;
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
	/**
	 * 
	 * @param teaName
	 */
	public void setTeaName(String teaName){
		this.teaName = teaName;
	}
	
    /**
     * 
     * @return
     */	
    public String getTeaName(){
    	return teaName;
    }
}