package com.wael.entities;

import java.io.Serializable;
import java.util.Date;

import com.j256.ormlite.field.DataType;
import com.j256.ormlite.field.DatabaseField;

public class Patient_annexe_a implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -222864131214757024L;

	@DatabaseField(generatedId = true, columnName = "Patient_ID", dataType = DataType.SERIALIZABLE)
	public Integer PatientID;

	@DatabaseField(columnName = "A_BB_1_LastName")
	public String a_bb_1_lastname;

	@DatabaseField(columnName = "A_BB_1_FirstName")
	public String a_bb_1_firstname;

	@DatabaseField(columnName = "A_BB_1_No_avs")
	public String a_bb_1_no_avs;

	@DatabaseField(columnName = "A_BB_1_No_dossier_interne")
	public String a_bb_1_no_dossier_interne;

	@DatabaseField(columnName = "A_BB_1_No_carte_assure")
	public String a_bb_1_no_carte_assure;

	@DatabaseField(columnName = "A_BB_1_Street")
	public String a_bb_1_street;

	@DatabaseField(columnName = "A_BB_1_No")
	public String a_bb_1_no;

	@DatabaseField(columnName = "A_BB_1_Canton")
	public String a_bb_1_canton;

	@DatabaseField(columnName = "A_BB_1_PostalCode")
	public String a_bb_1_postalcode;

	@DatabaseField(columnName = "A_BB_1_City")
	public String a_bb_1_city;

	@DatabaseField(columnName = "A_BB_1_Email")
	public String a_bb_1_email;

	@DatabaseField(columnName = "A_BB_1_Phone")
	public String a_bb_1_phone;

	@DatabaseField(columnName = "A_BB_2")
	public String a_bb_2;

	@DatabaseField(columnName = "A_BB_3a")
	public String a_bb_3a;

	@DatabaseField(columnName = "A_BB_3b")
	public String a_bb_3b;

	@DatabaseField(columnName = "A_BB_1__Natel")
	public String a_bb_1_Natel;

	@DatabaseField(columnName = "A_BB_4_Sexe")
	public String a_bb_4_sexe;

	@DatabaseField(columnName = "A_BB_5_DOB")
	public Date a_bb_5_dob;

	@DatabaseField(columnName = "A_BB_6_Nationality")
	public String a_bb_6_nationality;

	@DatabaseField(columnName = "A_BB_6_OtherNationality")
	public String a_bb_6_othernationality;

	@DatabaseField(columnName = "A_BB_7_CivilStatus")
	public String a_bb_7_civilstatus;

	@DatabaseField(columnName = "A_BB_7_LangueMaternelle")
	public String a_bb_7_languematernelle;

	@DatabaseField(columnName = "A_BB_7_OtherLanguage")
	public String a_bb_7_otherlanguage;

	@DatabaseField(columnName = "A_BB_9_LastJob")
	public String a_bb_9_lastjob;

	@DatabaseField(columnName = "A_BB_Comments")
	public String a_bb_comments;

	@DatabaseField(columnName = "A_CC_7a")
	public String a_cc_7a;

	@DatabaseField(columnName = "A_CC_7b")
	public String a_cc_7b;
	@DatabaseField(columnName = "A_CC_7c")
	public String a_cc_7c;
	@DatabaseField(columnName = "A_CC_7d")
	public String a_cc_7d;
	@DatabaseField(columnName = "A_CC_7e")
	public String a_cc_7e;

	@DatabaseField(columnName = "A_CC_8a")
	public String a_cc_8a;
	@DatabaseField(columnName = "A_CC_8b")
	public String a_cc_8b;

	@DatabaseField(columnName = "A_CC_8_description")
	public String a_cc_8_description;

	@DatabaseField(columnName = "A_CC_comments")
	public String a_cc_comments;

	public Patient_annexe_a() {
	}

	public Patient_annexe_a(String a_bb_1_lastname, String a_bb_1_firstname,
			String a_bb_1_no_avs, String a_bb_1_no_dossier_interne,
			String a_bb_1_no_carte_assure, String a_bb_1_street,
			String a_bb_1_no, String a_bb_1_canton, String a_bb_1_postalcode,
			String a_bb_1_city, String a_bb_1_email, String a_bb_1_phone,
			String a_bb_2, String a_bb_3a, String a_bb_3b, String a_bb_1_Natel,
			String a_bb_4_sexe, Date a_bb_5_dob, String a_bb_6_nationality,
			String a_bb_6_othernationality, String a_bb_7_civilstatus,
			String a_bb_7_languematernelle, String a_bb_7_otherlanguage,
			String a_bb_9_lastjob, String a_bb_comments, String a_cc_7a,
			String a_cc_7b, String a_cc_7c, String a_cc_7d, String a_cc_7e,
			String a_cc_8a, String a_cc_8b, String a_cc_8_description,
			String a_cc_comments) {
		super();
		this.a_bb_1_lastname = a_bb_1_lastname;
		this.a_bb_1_firstname = a_bb_1_firstname;
		this.a_bb_1_no_avs = a_bb_1_no_avs;
		this.a_bb_1_no_dossier_interne = a_bb_1_no_dossier_interne;
		this.a_bb_1_no_carte_assure = a_bb_1_no_carte_assure;
		this.a_bb_1_street = a_bb_1_street;
		this.a_bb_1_no = a_bb_1_no;
		this.a_bb_1_canton = a_bb_1_canton;
		this.a_bb_1_postalcode = a_bb_1_postalcode;
		this.a_bb_1_city = a_bb_1_city;
		this.a_bb_1_email = a_bb_1_email;
		this.a_bb_1_phone = a_bb_1_phone;
		this.a_bb_2 = a_bb_2;
		this.a_bb_3a = a_bb_3a;
		this.a_bb_3b = a_bb_3b;
		this.a_bb_1_Natel = a_bb_1_Natel;
		this.a_bb_4_sexe = a_bb_4_sexe;
		this.a_bb_5_dob = a_bb_5_dob;
		this.a_bb_6_nationality = a_bb_6_nationality;
		this.a_bb_6_othernationality = a_bb_6_othernationality;
		this.a_bb_7_civilstatus = a_bb_7_civilstatus;
		this.a_bb_7_languematernelle = a_bb_7_languematernelle;
		this.a_bb_7_otherlanguage = a_bb_7_otherlanguage;
		this.a_bb_9_lastjob = a_bb_9_lastjob;
		this.a_bb_comments = a_bb_comments;
		this.a_cc_7a = a_cc_7a;
		this.a_cc_7b = a_cc_7b;
		this.a_cc_7c = a_cc_7c;
		this.a_cc_7d = a_cc_7d;
		this.a_cc_7e = a_cc_7e;
		this.a_cc_8a = a_cc_8a;
		this.a_cc_8b = a_cc_8b;
		this.a_cc_8_description = a_cc_8_description;
		this.a_cc_comments = a_cc_comments;
	}

	public int getPatientID() {
		return PatientID;
	}

	public void setPatientID(int patientID) {
		PatientID = patientID;
	}

	public String getA_bb_1_lastname() {
		return a_bb_1_lastname;
	}

	public void setA_bb_1_lastname(String a_bb_1_lastname) {
		this.a_bb_1_lastname = a_bb_1_lastname;
	}

	public String getA_bb_1_firstname() {
		return a_bb_1_firstname;
	}

	public void setA_bb_1_firstname(String a_bb_1_firstname) {
		this.a_bb_1_firstname = a_bb_1_firstname;
	}

	public String getA_bb_1_no_avs() {
		return a_bb_1_no_avs;
	}

	public void setA_bb_1_no_avs(String a_bb_1_no_avs) {
		this.a_bb_1_no_avs = a_bb_1_no_avs;
	}

	public String getA_bb_1_no_dossier_interne() {
		return a_bb_1_no_dossier_interne;
	}

	public void setA_bb_1_no_dossier_interne(String a_bb_1_no_dossier_interne) {
		this.a_bb_1_no_dossier_interne = a_bb_1_no_dossier_interne;
	}

	public String getA_bb_1_no_carte_assure() {
		return a_bb_1_no_carte_assure;
	}

	public void setA_bb_1_no_carte_assure(String a_bb_1_no_carte_assure) {
		this.a_bb_1_no_carte_assure = a_bb_1_no_carte_assure;
	}

	public String getA_bb_1_street() {
		return a_bb_1_street;
	}

	public void setA_bb_1_street(String a_bb_1_street) {
		this.a_bb_1_street = a_bb_1_street;
	}

	public String getA_bb_1_no() {
		return a_bb_1_no;
	}

	public void setA_bb_1_no(String a_bb_1_no) {
		this.a_bb_1_no = a_bb_1_no;
	}

	public String getA_bb_1_canton() {
		return a_bb_1_canton;
	}

	public void setA_bb_1_canton(String a_bb_1_canton) {
		this.a_bb_1_canton = a_bb_1_canton;
	}

	public String getA_bb_1_postalcode() {
		return a_bb_1_postalcode;
	}

	public void setA_bb_1_postalcode(String a_bb_1_postalcode) {
		this.a_bb_1_postalcode = a_bb_1_postalcode;
	}

	public String getA_bb_1_city() {
		return a_bb_1_city;
	}

	public void setA_bb_1_city(String a_bb_1_city) {
		this.a_bb_1_city = a_bb_1_city;
	}

	public String getA_bb_1_email() {
		return a_bb_1_email;
	}

	public void setA_bb_1_email(String a_bb_1_email) {
		this.a_bb_1_email = a_bb_1_email;
	}

	public String getA_bb_1_phone() {
		return a_bb_1_phone;
	}

	public void setA_bb_1_phone(String a_bb_1_phone) {
		this.a_bb_1_phone = a_bb_1_phone;
	}

	public String getA_bb_2() {
		return a_bb_2;
	}

	public void setA_bb_2(String a_bb_2) {
		this.a_bb_2 = a_bb_2;
	}

	public String getA_bb_3a() {
		return a_bb_3a;
	}

	public void setA_bb_3a(String a_bb_3a) {
		this.a_bb_3a = a_bb_3a;
	}

	public String getA_bb_3b() {
		return a_bb_3b;
	}

	public void setA_bb_3b(String a_bb_3b) {
		this.a_bb_3b = a_bb_3b;
	}

	public String getA_bb_1_Natel() {
		return a_bb_1_Natel;
	}

	public void setA_bb_1_Natel(String a_bb_1_Natel) {
		this.a_bb_1_Natel = a_bb_1_Natel;
	}

	public String getA_bb_4_sexe() {
		return a_bb_4_sexe;
	}

	public void setA_bb_4_sexe(String a_bb_4_sexe) {
		this.a_bb_4_sexe = a_bb_4_sexe;
	}

	public Date getA_bb_5_dob() {
		return a_bb_5_dob;
	}

	public void setA_bb_5_dob(Date a_bb_5_dob) {
		this.a_bb_5_dob = a_bb_5_dob;
	}

	public String getA_bb_6_nationality() {
		return a_bb_6_nationality;
	}

	public void setA_bb_6_nationality(String a_bb_6_nationality) {
		this.a_bb_6_nationality = a_bb_6_nationality;
	}

	public String getA_bb_6_othernationality() {
		return a_bb_6_othernationality;
	}

	public void setA_bb_6_othernationality(String a_bb_6_othernationality) {
		this.a_bb_6_othernationality = a_bb_6_othernationality;
	}

	public String getA_bb_7_civilstatus() {
		return a_bb_7_civilstatus;
	}

	public void setA_bb_7_civilstatus(String a_bb_7_civilstatus) {
		this.a_bb_7_civilstatus = a_bb_7_civilstatus;
	}

	public String getA_bb_7_languematernelle() {
		return a_bb_7_languematernelle;
	}

	public void setA_bb_7_languematernelle(String a_bb_7_languematernelle) {
		this.a_bb_7_languematernelle = a_bb_7_languematernelle;
	}

	public String getA_bb_7_otherlanguage() {
		return a_bb_7_otherlanguage;
	}

	public void setA_bb_7_otherlanguage(String a_bb_7_otherlanguage) {
		this.a_bb_7_otherlanguage = a_bb_7_otherlanguage;
	}

	public String getA_bb_9_lastjob() {
		return a_bb_9_lastjob;
	}

	public void setA_bb_9_lastjob(String a_bb_9_lastjob) {
		this.a_bb_9_lastjob = a_bb_9_lastjob;
	}

	public String getA_bb_comments() {
		return a_bb_comments;
	}

	public void setA_bb_comments(String a_bb_comments) {
		this.a_bb_comments = a_bb_comments;
	}

	public String getA_cc_7a() {
		return a_cc_7a;
	}

	public void setA_cc_7a(String a_cc_7a) {
		this.a_cc_7a = a_cc_7a;
	}

	public String getA_cc_7b() {
		return a_cc_7b;
	}

	public void setA_cc_7b(String a_cc_7b) {
		this.a_cc_7b = a_cc_7b;
	}

	public String getA_cc_7c() {
		return a_cc_7c;
	}

	public void setA_cc_7c(String a_cc_7c) {
		this.a_cc_7c = a_cc_7c;
	}

	public String getA_cc_7d() {
		return a_cc_7d;
	}

	public void setA_cc_7d(String a_cc_7d) {
		this.a_cc_7d = a_cc_7d;
	}

	public String getA_cc_7e() {
		return a_cc_7e;
	}

	public void setA_cc_7e(String a_cc_7e) {
		this.a_cc_7e = a_cc_7e;
	}

	public String getA_cc_8a() {
		return a_cc_8a;
	}

	public void setA_cc_8a(String a_cc_8a) {
		this.a_cc_8a = a_cc_8a;
	}

	public String getA_cc_8b() {
		return a_cc_8b;
	}

	public void setA_cc_8b(String a_cc_8b) {
		this.a_cc_8b = a_cc_8b;
	}

	public String getA_cc_8_description() {
		return a_cc_8_description;
	}

	public void setA_cc_8_description(String a_cc_8_description) {
		this.a_cc_8_description = a_cc_8_description;
	}

	public String getA_cc_comments() {
		return a_cc_comments;
	}

	public void setA_cc_comments(String a_cc_comments) {
		this.a_cc_comments = a_cc_comments;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

}
