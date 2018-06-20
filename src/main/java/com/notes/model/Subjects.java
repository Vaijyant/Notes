package com.notes.model;

import java.io.Serializable;

public class Subjects implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 3850392476185353845L;
	
	int subjectId;
	String subjectAbb;
	String subjectName;
	
	public int getSubjectId() {
		return subjectId;
	}
	public void setSubjectId(int subjectId) {
		this.subjectId = subjectId;
	}
	public String getSubjectAbb() {
		return subjectAbb;
	}
	public void setSubjectAbb(String subjectAbb) {
		this.subjectAbb = subjectAbb;
	}
	public String getSubjectName() {
		return subjectName;
	}
	public void setSubjectName(String subjectName) {
		this.subjectName = subjectName;
	}
	

}
