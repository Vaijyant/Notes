package com.model.notes;

import java.io.Serializable;

public class Notes implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -3635182249366158756L;
	
	private int notesId;
	private String notesSubject;
	private String notesDescription;
	private String notesDate;
	private String notesLink;

	public int getNotesId() {
		return notesId;
	}

	public void setNotesId(int notesId) {
		this.notesId = notesId;
	}

	public String getNotesSubject() {
		return notesSubject;
	}

	public void setNotesSubject(String string) {
		this.notesSubject = string;
	}

	public String getNotesDate() {
		return notesDate;
	}

	public void setNotesDate(String notesDate) {
		this.notesDate = notesDate;
	}

	public String getNotesLink() {
		return notesLink;
	}

	public void setNotesLink(String notesLink) {
		this.notesLink = notesLink;
	}

	public String getNotesDescription() {
		return notesDescription;
	}

	public void setNotesDescription(String notesDescription) {
		this.notesDescription = notesDescription;
	}

}
