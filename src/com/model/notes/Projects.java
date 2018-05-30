package com.model.notes;

import java.io.Serializable;

public class Projects implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -865031269044722269L;
	
	private int projectId;
	private String projectName;
	private String projectDescription;
	private String projectLink;
	
	public String getProjectLink() {
		return projectLink;
	}
	public void setProjectLink(String projectLink) {
		this.projectLink = projectLink;
	}
	public int getProjectId() {
		return projectId;
	}
	public String getProjectName() {
		return projectName;
	}
	public String getProjectDescription() {
		return projectDescription;
	}
	
	public void setProjectId(int projectId) {
		this.projectId = projectId;
	}
	public void setProjectName(String projectName) {
		this.projectName = projectName;
	}
	public void setProjectDescription(String projectDescription) {
		this.projectDescription = projectDescription;
	}
	

}
