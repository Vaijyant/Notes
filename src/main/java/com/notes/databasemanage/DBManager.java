package com.notes.databasemanage;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import com.notes.model.Notes;
import com.notes.model.Projects;
import com.notes.model.Subjects;

public class DBManager {

	private static final String DBDriver = "com.mysql.jdbc.Driver";
	private static final String DBUrl = "jdbc:mysql://ec2-50-19-213-178.compute-1.amazonaws.com:3306/subjects";

	private static final String DBUser = "notes_victor";
	private static final String DBPass = "victor";

	/*
	 * private static final String DBUrl = "jdbc:mysql://localhost/payroll";
	 * private static final String DBUrlPaySlab = DBUrl; private static final
	 * String DBUser = "root"; private static final String DBUserPaySlab =
	 * DBUser; private static final String DBPass = "root"; private static final
	 * String DBPassPaySlab = DBPass;
	 */

	static {
		try {
			Class.forName(DBDriver);
		} catch (Exception ex) {
			System.out.println("DBManager says Driver Not Avaialble." + ex);
		}
	}

	public static ArrayList<Projects> getProjects() {
		ArrayList<Projects> proList = new ArrayList<Projects>();
		Projects pro = null;
		try {
			Connection con = DriverManager.getConnection(DBUrl, DBUser, DBPass);
			PreparedStatement st = con
					.prepareStatement("Select * from projects");
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				pro = new Projects();
				pro.setProjectId(rs.getInt(1));
				pro.setProjectName(rs.getString(2));
				pro.setProjectLink(rs.getString(3));
				pro.setProjectDescription(rs.getString(4));
				proList.add(pro);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		if (pro == null)
			return null;
		else
			return proList;

	}

	public static ArrayList<Subjects> getSubjects() {
		ArrayList<Subjects> subList = new ArrayList<Subjects>();
		Subjects sub = null;
		try {
			Connection con = DriverManager.getConnection(DBUrl, DBUser, DBPass);
			PreparedStatement st = con
					.prepareStatement("Select * from subject");
			ResultSet rs = st.executeQuery();

			while (rs.next()) {

				sub = new Subjects();
				sub.setSubjectId(rs.getInt(1));
				sub.setSubjectAbb(rs.getString(2));
				sub.setSubjectName(rs.getString(3));
				subList.add(sub);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		if (sub == null)
			return null;
		else
			return subList;
	}

	public static ArrayList<Notes> getNotes(String subjectAbb) {
		ArrayList<Notes> notesList = new ArrayList<Notes>();
		Notes note = null;
		try {
			Connection con = DriverManager.getConnection(DBUrl, DBUser, DBPass);
			String querry = "Select * from "+subjectAbb;
			PreparedStatement st = con.prepareStatement(querry);
			ResultSet rs = st.executeQuery();

			while (rs.next()) {
				note = new Notes();
				note.setNotesId(rs.getInt(1));
				note.setNotesSubject(rs.getString(2));
				note.setNotesDescription(rs.getString(3));
				note.setNotesDate(rs.getString(4));
				note.setNotesLink(rs.getString(5));
				notesList.add(note);
			}
		} catch (Exception ex) {
			System.out.println(ex);
		}
		
		if (note == null)
			return null;
		else
			return notesList;
	}
}