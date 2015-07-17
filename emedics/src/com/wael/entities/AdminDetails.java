package com.wael.entities;

import java.io.Serializable;

import com.j256.ormlite.field.DatabaseField;

public class AdminDetails implements Serializable {

	/**
	 * Model class for student_details database table
	 */
	private static final long serialVersionUID = -222864131214757024L;

	@DatabaseField(generatedId = true, columnName = "user_id")
	public int User_Id;
	@DatabaseField(columnName = "user_name")
	public String User_Name;
	
	@DatabaseField(columnName = "user_pass")
	public static String User_Pass = "user_pass";
	@DatabaseField(columnName = "pwd")
	public String Pwd;
	@DatabaseField(columnName = "user_email")
	public static String User_Email = "user_email";;
	@DatabaseField(columnName = "user_privilege")
	public int User_Privilege;
	@DatabaseField(columnName = "user_options")
	public String User_Options;

	public int getUser_Id() {
		return User_Id;
	}

	public void setUser_Id(int user_Id) {
		User_Id = user_Id;
	}

	public String getUser_Name() {
		return User_Name;
	}

	public void setUser_Name(String user_Name) {
		User_Name = user_Name;
	}

	public String getUser_Pass() {
		return User_Pass;
	}

	public void setUser_Pass(String user_Pass) {
		User_Pass = user_Pass;
	}

	public String getPwd() {
		return Pwd;
	}

	public void setPwd(String pwd) {
		Pwd = pwd;
	}

	public String getUser_Email() {
		return User_Email;
	}

	public void setUser_Email(String user_Email) {
		User_Email = user_Email;
	}

	public int getUser_Privilege() {
		return User_Privilege;
	}

	public void setUser_Privilege(int user_Privilege) {
		User_Privilege = user_Privilege;
	}

	public String getUser_Options() {
		return User_Options;
	}

	public void setUser_Options(String user_Options) {
		User_Options = user_Options;
	}

	// Default constructor is needed for the SQLite, so make sure you also have
	// it
	public AdminDetails() {

	}

	// For our own purpose, so it's easier to create a StudentDetails object
	public AdminDetails(String user_Name, String user_Pass, String pwd,
			String user_Email, int user_Privilege, String user_Options) {
		super();
		User_Name = user_Name;
		User_Pass = user_Pass;
		Pwd = pwd;
		User_Email = user_Email;
		User_Privilege = user_Privilege;
		User_Options = user_Options;
	}
}
