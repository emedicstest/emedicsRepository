package com.wael.entities;

import java.io.Serializable;
import java.util.Date;

import com.j256.ormlite.field.DatabaseField;

public class Annexe_c implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2140586045151198398L;

	public static final String ID_FIELD = "Evaluation_ID";

	@DatabaseField(generatedId = true, columnName = "evaluation_id")
	public Integer Evaluation_ID;

	// Foreign key defined to hold associations
	@DatabaseField(canBeNull = false, foreign = true, foreignAutoRefresh = true)
	public Patient_annexe_a patient;

	public Annexe_c() {
	}

	public Annexe_c(Date c_a_1, String c_a_2, String c_a_3a, String c_a_3b,
			String c_a_3c, String c_a_comments, String c_a_status,
			String c_b_1a, String c_b_1b, String c_b_2, String c_b_3a,
			String c_b_3b, String c_b_3c, String c_b_4, String c_b_5,
			String c_b_comments, String c_b_status, String c_c_1, String c_c_2,
			String c_c_3, String c_c_comments, String c_c_status, String c_d_1,
			String c_d_comments, String c_d_status, String c_e_1a,
			String c_e_1b, String c_e_1c, String c_e_1d, String c_e_1e,
			String c_e_2a, String c_e_2b, String c_e_2c, String c_e_2d,
			String c_e_2e, String c_e_comments, String c_e_status,
			String c_f_1a, String c_f_1b, String c_f_1c, String c_f_2,
			String c_f_3, String c_f_4, String c_f_comments, String c_f_status,
			String c_g1, String c_g_2a, String c_g_2b, String c_g_comments,
			String c_g_status, String c_h1_comments, String c_h1_g1,
			String c_h1_f1, String c_h1_e1, String c_h2_a, String c_h1_d1,
			String c_h2_b, String c_h1_c1, String c_h2_c, String c_h1_b1,
			String c_h2_d, String c_h1_a1, String c_h2_f, String c_h1_g,
			String c_h2_g, String c_h1_f, String c_h2_h, String c_h1_e,
			String c_h2_i, String c_h1_d, String c_h2_j, String c_h1_c,
			String c_h1_b, String c_h3, String c_h1_a, String c_h2_comments,
			String c_h4, String c_h5_a, String c_h5_b, String c_h6_a,
			String c_h6_b, String c_h_comments, String c_h_status, String c_i1,
			String c_i2, String c_i3a, String c_i3b, String c_i3c,
			String c_i3d, String c_i3e, String c_i3f, String c_i_comments,
			String c_i_status, String c_j_1, String c_j1a_1, String c_j1a_2,
			String c_j1a_3, String c_j_status, String c_k_1a, String c_k_1b,
			String c_k_1c, String c_k_1d, String c_k_1e, String c_k_1f,
			String c_k_1g, String c_k_1h, String c_k_1i, String c_k_1j,
			String c_k_1k, String c_k_2, String c_k_3, String c_k_4a,
			String c_k_4b, String c_k_4c, String c_k_5, String c_k_6a,
			String c_k_6b, String c_k_7a, String c_k_7b, String c_k_8a,
			String c_k_8b, String c_k_8c, String c_k_comments,
			String c_k_status, String c_l_1a, String c_l_1b, String c_l_2a,
			String c_l_2b, String c_l_3, String c_l_4, String c_l_5,
			String c_l_6, String c_l_comments, String c_l_status, String c_m_1,
			String c_m_2, String c_m_3a, String c_m_3b, String c_m_3c,
			String c_m_3d, String c_m_4, String c_m_comments,
			String c_m_status, String c_n_1, String c_n_comments,
			String c_n_status, String c_o_1a, String c_o_1b, String c_o_1c,
			String c_o_1d, String c_o_1e, String c_o_1f, String c_o_1g,
			String c_o_1h, String c_o_1i, String c_o_1iInfo,
			String c_o_comments, String c_o_status, String c_o_2, String c_p_1,
			String c_p_2a, String c_p_2b, String c_p_3, String c_p_4,
			String c_p_5a, String c_p_5b, String c_p_5c, String c_p_5d,
			String c_p_5e, String c_p_6, String c_p_7, String c_p_comments,
			String c_p_status, String c_q_1, String c_q_2, String c_q_3,
			String c_q_comments, String c_q_status, String c_r_1, String c_r_2,
			String c_r_comments, String c_r_status, String c_drugs_service,
			String c_drugs_intolerances, String c_drugs_intolerances1,
			String c_Annexe_Status, Date c_S_Date, String c_S_Status) {
		super();

		this.c_a_1 = c_a_1;
		this.c_a_2 = c_a_2;
		this.c_a_3a = c_a_3a;
		this.c_a_3b = c_a_3b;
		this.c_a_3c = c_a_3c;
		this.c_a_comments = c_a_comments;
		this.c_a_status = c_a_status;
		this.c_b_1a = c_b_1a;
		this.c_b_1b = c_b_1b;
		this.c_b_2 = c_b_2;
		this.c_b_3a = c_b_3a;
		this.c_b_3b = c_b_3b;
		this.c_b_3c = c_b_3c;
		this.c_b_4 = c_b_4;
		this.c_b_5 = c_b_5;
		this.c_b_comments = c_b_comments;
		this.c_b_status = c_b_status;
		this.c_c_1 = c_c_1;
		this.c_c_2 = c_c_2;
		this.c_c_3 = c_c_3;
		this.c_c_comments = c_c_comments;
		this.c_c_status = c_c_status;
		this.c_d_1 = c_d_1;
		this.c_d_comments = c_d_comments;
		this.c_d_status = c_d_status;
		this.c_e_1a = c_e_1a;
		this.c_e_1b = c_e_1b;
		this.c_e_1c = c_e_1c;
		this.c_e_1d = c_e_1d;
		this.c_e_1e = c_e_1e;
		this.c_e_2a = c_e_2a;
		this.c_e_2b = c_e_2b;
		this.c_e_2c = c_e_2c;
		this.c_e_2d = c_e_2d;
		this.c_e_2e = c_e_2e;
		this.c_e_comments = c_e_comments;
		this.c_e_status = c_e_status;
		this.c_f_1a = c_f_1a;
		this.c_f_1b = c_f_1b;
		this.c_f_1c = c_f_1c;
		this.c_f_2 = c_f_2;
		this.c_f_3 = c_f_3;
		this.c_f_4 = c_f_4;
		this.c_f_comments = c_f_comments;
		this.c_f_status = c_f_status;
		this.c_g1 = c_g1;
		this.c_g_2a = c_g_2a;
		this.c_g_2b = c_g_2b;
		this.c_g_comments = c_g_comments;
		this.c_g_status = c_g_status;
		this.c_h1_comments = c_h1_comments;
		this.c_h1_g1 = c_h1_g1;
		this.c_h1_f1 = c_h1_f1;
		this.c_h1_e1 = c_h1_e1;
		this.c_h2_a = c_h2_a;
		this.c_h1_d1 = c_h1_d1;
		this.c_h2_b = c_h2_b;
		this.c_h1_c1 = c_h1_c1;
		this.c_h2_c = c_h2_c;
		this.c_h1_b1 = c_h1_b1;
		this.c_h2_d = c_h2_d;
		this.c_h1_a1 = c_h1_a1;
		this.c_h2_f = c_h2_f;
		this.c_h1_g = c_h1_g;
		this.c_h2_g = c_h2_g;
		this.c_h1_f = c_h1_f;
		this.c_h2_h = c_h2_h;
		this.c_h1_e = c_h1_e;
		this.c_h2_i = c_h2_i;
		this.c_h1_d = c_h1_d;
		this.c_h2_j = c_h2_j;
		this.c_h1_c = c_h1_c;
		this.c_h1_b = c_h1_b;
		this.c_h3 = c_h3;
		this.c_h1_a = c_h1_a;
		this.c_h2_comments = c_h2_comments;
		this.c_h4 = c_h4;
		this.c_h5_a = c_h5_a;
		this.c_h5_b = c_h5_b;
		this.c_h6_a = c_h6_a;
		this.c_h6_b = c_h6_b;
		this.c_h_comments = c_h_comments;
		this.c_h_status = c_h_status;
		this.c_i1 = c_i1;
		this.c_i2 = c_i2;
		this.c_i3a = c_i3a;
		this.c_i3b = c_i3b;
		this.c_i3c = c_i3c;
		this.c_i3d = c_i3d;
		this.c_i3e = c_i3e;
		this.c_i3f = c_i3f;
		this.c_i_comments = c_i_comments;
		this.c_i_status = c_i_status;
		this.c_j_1 = c_j_1;
		this.c_j1a_1 = c_j1a_1;
		this.c_j1a_2 = c_j1a_2;
		this.c_j1a_3 = c_j1a_3;
		this.c_j_status = c_j_status;
		this.c_k_1a = c_k_1a;
		this.c_k_1b = c_k_1b;
		this.c_k_1c = c_k_1c;
		this.c_k_1d = c_k_1d;
		this.c_k_1e = c_k_1e;
		this.c_k_1f = c_k_1f;
		this.c_k_1g = c_k_1g;
		this.c_k_1h = c_k_1h;
		this.c_k_1i = c_k_1i;
		this.c_k_1j = c_k_1j;
		this.c_k_1k = c_k_1k;
		this.c_k_2 = c_k_2;
		this.c_k_3 = c_k_3;
		this.c_k_4a = c_k_4a;
		this.c_k_4b = c_k_4b;
		this.c_k_4c = c_k_4c;
		this.c_k_5 = c_k_5;
		this.c_k_6a = c_k_6a;
		this.c_k_6b = c_k_6b;
		this.c_k_7a = c_k_7a;
		this.c_k_7b = c_k_7b;
		this.c_k_8a = c_k_8a;
		this.c_k_8b = c_k_8b;
		this.c_k_8c = c_k_8c;
		this.c_k_comments = c_k_comments;
		this.c_k_status = c_k_status;
		this.c_l_1a = c_l_1a;
		this.c_l_1b = c_l_1b;
		this.c_l_2a = c_l_2a;
		this.c_l_2b = c_l_2b;
		this.c_l_3 = c_l_3;
		this.c_l_4 = c_l_4;
		this.c_l_5 = c_l_5;
		this.c_l_6 = c_l_6;
		this.c_l_comments = c_l_comments;
		this.c_l_status = c_l_status;
		this.c_m_1 = c_m_1;
		this.c_m_2 = c_m_2;
		this.c_m_3a = c_m_3a;
		this.c_m_3b = c_m_3b;
		this.c_m_3c = c_m_3c;
		this.c_m_3d = c_m_3d;
		this.c_m_4 = c_m_4;
		this.c_m_comments = c_m_comments;
		this.c_m_status = c_m_status;
		this.c_n_1 = c_n_1;
		this.c_n_comments = c_n_comments;
		this.c_n_status = c_n_status;
		this.c_o_1a = c_o_1a;
		this.c_o_1b = c_o_1b;
		this.c_o_1c = c_o_1c;
		this.c_o_1d = c_o_1d;
		this.c_o_1e = c_o_1e;
		this.c_o_1f = c_o_1f;
		this.c_o_1g = c_o_1g;
		this.c_o_1h = c_o_1h;
		this.c_o_1i = c_o_1i;
		this.c_o_1iInfo = c_o_1iInfo;
		this.c_o_comments = c_o_comments;
		this.c_o_status = c_o_status;
		this.c_o_2 = c_o_2;
		this.c_p_1 = c_p_1;
		this.c_p_2a = c_p_2a;
		this.c_p_2b = c_p_2b;
		this.c_p_3 = c_p_3;
		this.c_p_4 = c_p_4;
		this.c_p_5a = c_p_5a;
		this.c_p_5b = c_p_5b;
		this.c_p_5c = c_p_5c;
		this.c_p_5d = c_p_5d;
		this.c_p_5e = c_p_5e;
		this.c_p_6 = c_p_6;
		this.c_p_7 = c_p_7;
		this.c_p_comments = c_p_comments;
		this.c_p_status = c_p_status;
		this.c_q_1 = c_q_1;
		this.c_q_2 = c_q_2;
		this.c_q_3 = c_q_3;
		this.c_q_comments = c_q_comments;
		this.c_q_status = c_q_status;
		this.c_r_1 = c_r_1;
		this.c_r_2 = c_r_2;
		this.c_r_comments = c_r_comments;
		this.c_r_status = c_r_status;
		C_drugs_service = c_drugs_service;
		C_drugs_intolerances = c_drugs_intolerances;
		C_drugs_intolerances1 = c_drugs_intolerances1;
		C_Annexe_Status = c_Annexe_Status;
		C_S_Date = c_S_Date;
		C_S_Status = c_S_Status;
	}

	@DatabaseField(columnName = "C_A_1")
	public Date c_a_1;
	@DatabaseField(columnName = "C_A_2")
	public String c_a_2;
	@DatabaseField(columnName = "C_A_3a")
	public String c_a_3a;
	@DatabaseField(columnName = "C_A_3b")
	public String c_a_3b;
	@DatabaseField(columnName = "C_A_3c")
	public String c_a_3c;
	@DatabaseField(columnName = "C_A_Comments")
	public String c_a_comments;

	@DatabaseField(columnName = "C_A_Status")
	public String c_a_status;
	@DatabaseField(columnName = "C_B_1a")
	public String c_b_1a;
	@DatabaseField(columnName = "C_B_1b")
	public String c_b_1b;

	@DatabaseField(columnName = "C_B_2")
	public String c_b_2;
	@DatabaseField(columnName = "C_B_3a")
	public String c_b_3a;
	@DatabaseField(columnName = "C_B_3b")
	public String c_b_3b;

	@DatabaseField(columnName = "C_B_3c")
	public String c_b_3c;
	@DatabaseField(columnName = "C_B_4")
	public String c_b_4;
	@DatabaseField(columnName = "C_B_5")
	public String c_b_5;
	@DatabaseField(columnName = "C_B_Comments")
	public String c_b_comments;
	@DatabaseField(columnName = "C_B_Status")
	public String c_b_status;
	@DatabaseField(columnName = "C_C_1")
	public String c_c_1;
	@DatabaseField(columnName = "C_C_2")
	public String c_c_2;
	@DatabaseField(columnName = "C_C_3")
	public String c_c_3;
	@DatabaseField(columnName = "C_C_Comments")
	public String c_c_comments;
	@DatabaseField(columnName = "C_C_Status")
	public String c_c_status;

	@DatabaseField(columnName = "C_D_1")
	public String c_d_1;
	@DatabaseField(columnName = "C_D_Comments")
	public String c_d_comments;
	@DatabaseField(columnName = "C_D_Status")
	public String c_d_status;
	@DatabaseField(columnName = "C_E_1a")
	public String c_e_1a;
	@DatabaseField(columnName = "C_E_1b")
	public String c_e_1b;
	@DatabaseField(columnName = "C_E_1c")
	public String c_e_1c;
	@DatabaseField(columnName = "C_E_1d")
	public String c_e_1d;
	@DatabaseField(columnName = "C_E_1e")
	public String c_e_1e;

	@DatabaseField(columnName = "C_E_2a")
	public String c_e_2a;
	@DatabaseField(columnName = "C_E_2b")
	public String c_e_2b;
	@DatabaseField(columnName = "C_E_2c")
	public String c_e_2c;
	@DatabaseField(columnName = "C_E_2d")
	public String c_e_2d;
	@DatabaseField(columnName = "C_E_2e")
	public String c_e_2e;
	@DatabaseField(columnName = "C_E_Comments")
	public String c_e_comments;
	@DatabaseField(columnName = "C_E_Status")
	public String c_e_status;

	@DatabaseField(columnName = "C_F_1a")
	public String c_f_1a;
	@DatabaseField(columnName = "C_F_1b")
	public String c_f_1b;
	@DatabaseField(columnName = "C_F_1c")
	public String c_f_1c;

	@DatabaseField(columnName = "C_F_2")
	public String c_f_2;
	@DatabaseField(columnName = "C_F_3")
	public String c_f_3;
	@DatabaseField(columnName = "C_F_4")
	public String c_f_4;
	@DatabaseField(columnName = "C_F_Comments")
	public String c_f_comments;
	@DatabaseField(columnName = "C_F_Status")
	public String c_f_status;

	@DatabaseField(columnName = "C_G1")
	public String c_g1;
	@DatabaseField(columnName = "C_G_2a")
	public String c_g_2a;
	@DatabaseField(columnName = "C_G_2b")
	public String c_g_2b;

	@DatabaseField(columnName = "C_G_Comments")
	public String c_g_comments;
	@DatabaseField(columnName = "C_G_Status")
	public String c_g_status;

	@DatabaseField(columnName = "C_H1_Comments")
	public String c_h1_comments;
	@DatabaseField(columnName = "C_H1_g1")
	public String c_h1_g1;
	@DatabaseField(columnName = "C_H1_f1")
	public String c_h1_f1;
	@DatabaseField(columnName = "C_H1_e1")
	public String c_h1_e1;
	@DatabaseField(columnName = "C_H2_a")
	public String c_h2_a;

	@DatabaseField(columnName = "C_H1_d1")
	public String c_h1_d1;
	@DatabaseField(columnName = "C_H2_b")
	public String c_h2_b;

	@DatabaseField(columnName = "C_H1_c1")
	public String c_h1_c1;
	@DatabaseField(columnName = "C_H2_c")
	public String c_h2_c;

	@DatabaseField(columnName = "C_H1_b1")
	public String c_h1_b1;
	@DatabaseField(columnName = "C_H2_d")
	public String c_h2_d;

	@DatabaseField(columnName = "C_H1_a1")
	public String c_h1_a1;

	@DatabaseField(columnName = "C_H2_f")
	public String c_h2_f;

	@DatabaseField(columnName = "C_H1_g")
	public String c_h1_g;

	@DatabaseField(columnName = "C_H2_g")
	public String c_h2_g;

	@DatabaseField(columnName = "C_H1_f")
	public String c_h1_f;

	@DatabaseField(columnName = "C_H2_h")
	public String c_h2_h;

	@DatabaseField(columnName = "C_H1_e")
	public String c_h1_e;

	@DatabaseField(columnName = "C_H2_i")
	public String c_h2_i;

	@DatabaseField(columnName = "C_H1_d")
	public String c_h1_d;

	@DatabaseField(columnName = "C_H2_j")
	public String c_h2_j;

	@DatabaseField(columnName = "C_H1_c")
	public String c_h1_c;

	@DatabaseField(columnName = "C_H1_b")
	public String c_h1_b;

	@DatabaseField(columnName = "C_H3")
	public String c_h3;

	@DatabaseField(columnName = "C_H1_a")
	public String c_h1_a;

	@DatabaseField(columnName = "C_H2_Comments")
	public String c_h2_comments;

	@DatabaseField(columnName = "C_H4")
	public String c_h4;

	@DatabaseField(columnName = "C_H5_a")
	public String c_h5_a;
	@DatabaseField(columnName = "C_H5_b")
	public String c_h5_b;

	@DatabaseField(columnName = "C_H6_a")
	public String c_h6_a;
	@DatabaseField(columnName = "C_H6_b")
	public String c_h6_b;

	@DatabaseField(columnName = "C_H_Comments")
	public String c_h_comments;
	@DatabaseField(columnName = "C_H_Status")
	public String c_h_status;

	@DatabaseField(columnName = "C_I1")
	public String c_i1;
	@DatabaseField(columnName = "C_I2")
	public String c_i2;

	@DatabaseField(columnName = "C_I3a")
	public String c_i3a;
	@DatabaseField(columnName = "C_I3b")
	public String c_i3b;
	@DatabaseField(columnName = "C_I3c")
	public String c_i3c;

	@DatabaseField(columnName = "C_I3d")
	public String c_i3d;
	@DatabaseField(columnName = "C_I3e")
	public String c_i3e;
	@DatabaseField(columnName = "C_I3f")
	public String c_i3f;

	@DatabaseField(columnName = "C_I_Comments")
	public String c_i_comments;
	@DatabaseField(columnName = "C_I_Status")
	public String c_i_status;

	@DatabaseField(columnName = "C_J_1")
	public String c_j_1;

	@DatabaseField(columnName = "C_J1a_1")
	public String c_j1a_1;

	@DatabaseField(columnName = "C_J1a_2")
	public String c_j1a_2;

	@DatabaseField(columnName = "C_J1a_3")
	public String c_j1a_3;

	@DatabaseField(columnName = "C_J_Status")
	public String c_j_status;

	@DatabaseField(columnName = "C_K_1a")
	public String c_k_1a;

	@DatabaseField(columnName = "C_K_1b")
	public String c_k_1b;
	@DatabaseField(columnName = "C_K_1c")
	public String c_k_1c;
	@DatabaseField(columnName = "C_K_1d")
	public String c_k_1d;
	@DatabaseField(columnName = "C_K_1e")
	public String c_k_1e;
	@DatabaseField(columnName = "C_K_1f")
	public String c_k_1f;
	@DatabaseField(columnName = "C_K_1g")
	public String c_k_1g;
	@DatabaseField(columnName = "C_K_1h")
	public String c_k_1h;
	@DatabaseField(columnName = "C_K_1i")
	public String c_k_1i;
	@DatabaseField(columnName = "C_K_1j")
	public String c_k_1j;

	@DatabaseField(columnName = "C_K_1k")
	public String c_k_1k;

	@DatabaseField(columnName = "C_K_2")
	public String c_k_2;
	@DatabaseField(columnName = "C_K_3")
	public String c_k_3;

	@DatabaseField(columnName = "C_K_4a")
	public String c_k_4a;

	@DatabaseField(columnName = "C_K_4b")
	public String c_k_4b;

	@DatabaseField(columnName = "C_K_4c")
	public String c_k_4c;

	@DatabaseField(columnName = "C_K_5")
	public String c_k_5;

	@DatabaseField(columnName = "C_K_6a")
	public String c_k_6a;

	@DatabaseField(columnName = "C_K_6b")
	public String c_k_6b;

	@DatabaseField(columnName = "C_K_7a")
	public String c_k_7a;

	@DatabaseField(columnName = "C_K_7b")
	public String c_k_7b;

	@DatabaseField(columnName = "C_K_8a")
	public String c_k_8a;

	@DatabaseField(columnName = "C_K_8b")
	public String c_k_8b;

	@DatabaseField(columnName = "C_K_8c")
	public String c_k_8c;

	@DatabaseField(columnName = "C_K_Comments")
	public String c_k_comments;
	@DatabaseField(columnName = "C_K_Status")
	public String c_k_status;

	@DatabaseField(columnName = "C_L_1a")
	public String c_l_1a;

	@DatabaseField(columnName = "C_L_1b")
	public String c_l_1b;

	@DatabaseField(columnName = "C_L_2a")
	public String c_l_2a;

	@DatabaseField(columnName = "C_L_2b")
	public String c_l_2b;

	@DatabaseField(columnName = "C_L_3")
	public String c_l_3;

	@DatabaseField(columnName = "C_L_4")
	public String c_l_4;

	@DatabaseField(columnName = "C_L_5")
	public String c_l_5;

	@DatabaseField(columnName = "C_L_6")
	public String c_l_6;

	@DatabaseField(columnName = "C_L_Comments")
	public String c_l_comments;
	@DatabaseField(columnName = "C_L_Status")
	public String c_l_status;

	@DatabaseField(columnName = "C_M_1")
	public String c_m_1;

	@DatabaseField(columnName = "C_M_2")
	public String c_m_2;

	@DatabaseField(columnName = "C_M_3a")
	public String c_m_3a;
	@DatabaseField(columnName = "C_M_3b")
	public String c_m_3b;

	@DatabaseField(columnName = "C_M_3c")
	public String c_m_3c;
	@DatabaseField(columnName = "C_M_3d")
	public String c_m_3d;

	@DatabaseField(columnName = "C_M_4")
	public String c_m_4;

	@DatabaseField(columnName = "C_M_Comments")
	public String c_m_comments;
	@DatabaseField(columnName = "C_M_Status")
	public String c_m_status;

	@DatabaseField(columnName = "C_N_1")
	public String c_n_1;
	@DatabaseField(columnName = "C_N_Comments")
	public String c_n_comments;
	@DatabaseField(columnName = "C_N_Status")
	public String c_n_status;

	@DatabaseField(columnName = "C_O_1a")
	public String c_o_1a;

	@DatabaseField(columnName = "C_O_1b")
	public String c_o_1b;
	@DatabaseField(columnName = "C_O_1c")
	public String c_o_1c;
	@DatabaseField(columnName = "C_O_1d")
	public String c_o_1d;
	@DatabaseField(columnName = "C_O_1e")
	public String c_o_1e;
	@DatabaseField(columnName = "C_O_1f")
	public String c_o_1f;
	@DatabaseField(columnName = "C_O_1g")
	public String c_o_1g;
	@DatabaseField(columnName = "C_O_1h")
	public String c_o_1h;
	@DatabaseField(columnName = "C_O_1i")
	public String c_o_1i;
	@DatabaseField(columnName = "C_O_1iInfo")
	public String c_o_1iInfo;

	@DatabaseField(columnName = "C_O_Comments")
	public String c_o_comments;
	@DatabaseField(columnName = "C_O_Status")
	public String c_o_status;

	@DatabaseField(columnName = "C_O_2")
	public String c_o_2;

	@DatabaseField(columnName = "C_P_1")
	public String c_p_1;

	@DatabaseField(columnName = "C_P_2a")
	public String c_p_2a;
	@DatabaseField(columnName = "C_P_2b")
	public String c_p_2b;

	@DatabaseField(columnName = "C_P_3")
	public String c_p_3;

	@DatabaseField(columnName = "C_P_4")
	public String c_p_4;

	@DatabaseField(columnName = "C_P_5a")
	public String c_p_5a;
	@DatabaseField(columnName = "C_P_5b")
	public String c_p_5b;
	@DatabaseField(columnName = "C_P_5c")
	public String c_p_5c;
	@DatabaseField(columnName = "C_P_5d")
	public String c_p_5d;
	@DatabaseField(columnName = "C_P_5e")
	public String c_p_5e;

	@DatabaseField(columnName = "C_P_6")
	public String c_p_6;

	@DatabaseField(columnName = "C_P_7")
	public String c_p_7;

	@DatabaseField(columnName = "C_P_Comments")
	public String c_p_comments;
	@DatabaseField(columnName = "C_P_Status")
	public String c_p_status;

	@DatabaseField(columnName = "C_Q_1")
	public String c_q_1;
	@DatabaseField(columnName = "C_Q_2")
	public String c_q_2;
	@DatabaseField(columnName = "C_Q_3")
	public String c_q_3;

	@DatabaseField(columnName = "C_Q_Comments")
	public String c_q_comments;
	@DatabaseField(columnName = "C_Q_Status")
	public String c_q_status;

	@DatabaseField(columnName = "C_R_1")
	public String c_r_1;
	@DatabaseField(columnName = "C_R_2")
	public String c_r_2;

	@DatabaseField(columnName = "C_R_Comments")
	public String c_r_comments;
	@DatabaseField(columnName = "C_R_Status")
	public String c_r_status;

	@DatabaseField(columnName = "C_drugs_service")
	public String C_drugs_service;
	@DatabaseField(columnName = "C_drugs_intolerances")
	public String C_drugs_intolerances;
	@DatabaseField(columnName = "C_drugs_intolerances1")
	public String C_drugs_intolerances1;

	@DatabaseField(columnName = "C_Annexe_Status")
	public String C_Annexe_Status;

	@DatabaseField(columnName = "C_S_Date")
	public Date C_S_Date;

	@DatabaseField(columnName = "C_S_Status")
	public String C_S_Status;

	public Integer getEvaluation_ID() {
		return Evaluation_ID;
	}

	public void setEvaluation_ID(Integer evaluation_ID) {
		Evaluation_ID = evaluation_ID;
	}

	public static String getIdField() {
		return ID_FIELD;
	}

	public Patient_annexe_a getPatient() {
		return patient;
	}

	public void setPatient(Patient_annexe_a patient) {
		this.patient = patient;
	}

	public Date getC_a_1() {
		return c_a_1;
	}

	public void setC_a_1(Date c_a_1) {
		this.c_a_1 = c_a_1;
	}

	public String getC_a_2() {
		return c_a_2;
	}

	public void setC_a_2(String c_a_2) {
		this.c_a_2 = c_a_2;
	}

	public String getC_a_3a() {
		return c_a_3a;
	}

	public void setC_a_3a(String c_a_3a) {
		this.c_a_3a = c_a_3a;
	}

	public String getC_a_3b() {
		return c_a_3b;
	}

	public void setC_a_3b(String c_a_3b) {
		this.c_a_3b = c_a_3b;
	}

	public String getC_a_3c() {
		return c_a_3c;
	}

	public void setC_a_3c(String c_a_3c) {
		this.c_a_3c = c_a_3c;
	}

	public String getC_a_comments() {
		return c_a_comments;
	}

	public void setC_a_comments(String c_a_comments) {
		this.c_a_comments = c_a_comments;
	}

	public String getC_a_status() {
		return c_a_status;
	}

	public void setC_a_status(String c_a_status) {
		this.c_a_status = c_a_status;
	}

	public String getC_b_1a() {
		return c_b_1a;
	}

	public void setC_b_1a(String c_b_1a) {
		this.c_b_1a = c_b_1a;
	}

	public String getC_b_1b() {
		return c_b_1b;
	}

	public void setC_b_1b(String c_b_1b) {
		this.c_b_1b = c_b_1b;
	}

	public String getC_b_2() {
		return c_b_2;
	}

	public void setC_b_2(String c_b_2) {
		this.c_b_2 = c_b_2;
	}

	public String getC_b_3a() {
		return c_b_3a;
	}

	public void setC_b_3a(String c_b_3a) {
		this.c_b_3a = c_b_3a;
	}

	public String getC_b_3b() {
		return c_b_3b;
	}

	public void setC_b_3b(String c_b_3b) {
		this.c_b_3b = c_b_3b;
	}

	public String getC_b_3c() {
		return c_b_3c;
	}

	public void setC_b_3c(String c_b_3c) {
		this.c_b_3c = c_b_3c;
	}

	public String getC_b_4() {
		return c_b_4;
	}

	public void setC_b_4(String c_b_4) {
		this.c_b_4 = c_b_4;
	}

	public String getC_b_5() {
		return c_b_5;
	}

	public void setC_b_5(String c_b_5) {
		this.c_b_5 = c_b_5;
	}

	public String getC_b_comments() {
		return c_b_comments;
	}

	public void setC_b_comments(String c_b_comments) {
		this.c_b_comments = c_b_comments;
	}

	public String getC_b_status() {
		return c_b_status;
	}

	public void setC_b_status(String c_b_status) {
		this.c_b_status = c_b_status;
	}

	public String getC_c_1() {
		return c_c_1;
	}

	public void setC_c_1(String c_c_1) {
		this.c_c_1 = c_c_1;
	}

	public String getC_c_2() {
		return c_c_2;
	}

	public void setC_c_2(String c_c_2) {
		this.c_c_2 = c_c_2;
	}

	public String getC_c_3() {
		return c_c_3;
	}

	public void setC_c_3(String c_c_3) {
		this.c_c_3 = c_c_3;
	}

	public String getC_c_comments() {
		return c_c_comments;
	}

	public void setC_c_comments(String c_c_comments) {
		this.c_c_comments = c_c_comments;
	}

	public String getC_c_status() {
		return c_c_status;
	}

	public void setC_c_status(String c_c_status) {
		this.c_c_status = c_c_status;
	}

	public String getC_d_1() {
		return c_d_1;
	}

	public void setC_d_1(String c_d_1) {
		this.c_d_1 = c_d_1;
	}

	public String getC_d_comments() {
		return c_d_comments;
	}

	public void setC_d_comments(String c_d_comments) {
		this.c_d_comments = c_d_comments;
	}

	public String getC_d_status() {
		return c_d_status;
	}

	public void setC_d_status(String c_d_status) {
		this.c_d_status = c_d_status;
	}

	public String getC_e_1a() {
		return c_e_1a;
	}

	public void setC_e_1a(String c_e_1a) {
		this.c_e_1a = c_e_1a;
	}

	public String getC_e_1b() {
		return c_e_1b;
	}

	public void setC_e_1b(String c_e_1b) {
		this.c_e_1b = c_e_1b;
	}

	public String getC_e_1c() {
		return c_e_1c;
	}

	public void setC_e_1c(String c_e_1c) {
		this.c_e_1c = c_e_1c;
	}

	public String getC_e_1d() {
		return c_e_1d;
	}

	public void setC_e_1d(String c_e_1d) {
		this.c_e_1d = c_e_1d;
	}

	public String getC_e_1e() {
		return c_e_1e;
	}

	public void setC_e_1e(String c_e_1e) {
		this.c_e_1e = c_e_1e;
	}

	public String getC_e_2a() {
		return c_e_2a;
	}

	public void setC_e_2a(String c_e_2a) {
		this.c_e_2a = c_e_2a;
	}

	public String getC_e_2b() {
		return c_e_2b;
	}

	public void setC_e_2b(String c_e_2b) {
		this.c_e_2b = c_e_2b;
	}

	public String getC_e_2c() {
		return c_e_2c;
	}

	public void setC_e_2c(String c_e_2c) {
		this.c_e_2c = c_e_2c;
	}

	public String getC_e_2d() {
		return c_e_2d;
	}

	public void setC_e_2d(String c_e_2d) {
		this.c_e_2d = c_e_2d;
	}

	public String getC_e_2e() {
		return c_e_2e;
	}

	public void setC_e_2e(String c_e_2e) {
		this.c_e_2e = c_e_2e;
	}

	public String getC_e_comments() {
		return c_e_comments;
	}

	public void setC_e_comments(String c_e_comments) {
		this.c_e_comments = c_e_comments;
	}

	public String getC_e_status() {
		return c_e_status;
	}

	public void setC_e_status(String c_e_status) {
		this.c_e_status = c_e_status;
	}

	public String getC_f_1a() {
		return c_f_1a;
	}

	public void setC_f_1a(String c_f_1a) {
		this.c_f_1a = c_f_1a;
	}

	public String getC_f_1b() {
		return c_f_1b;
	}

	public void setC_f_1b(String c_f_1b) {
		this.c_f_1b = c_f_1b;
	}

	public String getC_f_1c() {
		return c_f_1c;
	}

	public void setC_f_1c(String c_f_1c) {
		this.c_f_1c = c_f_1c;
	}

	public String getC_f_2() {
		return c_f_2;
	}

	public void setC_f_2(String c_f_2) {
		this.c_f_2 = c_f_2;
	}

	public String getC_f_3() {
		return c_f_3;
	}

	public void setC_f_3(String c_f_3) {
		this.c_f_3 = c_f_3;
	}

	public String getC_f_4() {
		return c_f_4;
	}

	public void setC_f_4(String c_f_4) {
		this.c_f_4 = c_f_4;
	}

	public String getC_f_comments() {
		return c_f_comments;
	}

	public void setC_f_comments(String c_f_comments) {
		this.c_f_comments = c_f_comments;
	}

	public String getC_f_status() {
		return c_f_status;
	}

	public void setC_f_status(String c_f_status) {
		this.c_f_status = c_f_status;
	}

	public String getC_g1() {
		return c_g1;
	}

	public void setC_g1(String c_g1) {
		this.c_g1 = c_g1;
	}

	public String getC_g_2a() {
		return c_g_2a;
	}

	public void setC_g_2a(String c_g_2a) {
		this.c_g_2a = c_g_2a;
	}

	public String getC_g_2b() {
		return c_g_2b;
	}

	public void setC_g_2b(String c_g_2b) {
		this.c_g_2b = c_g_2b;
	}

	public String getC_g_comments() {
		return c_g_comments;
	}

	public void setC_g_comments(String c_g_comments) {
		this.c_g_comments = c_g_comments;
	}

	public String getC_g_status() {
		return c_g_status;
	}

	public void setC_g_status(String c_g_status) {
		this.c_g_status = c_g_status;
	}

	public String getC_h1_comments() {
		return c_h1_comments;
	}

	public void setC_h1_comments(String c_h1_comments) {
		this.c_h1_comments = c_h1_comments;
	}

	public String getC_h1_g1() {
		return c_h1_g1;
	}

	public void setC_h1_g1(String c_h1_g1) {
		this.c_h1_g1 = c_h1_g1;
	}

	public String getC_h1_f1() {
		return c_h1_f1;
	}

	public void setC_h1_f1(String c_h1_f1) {
		this.c_h1_f1 = c_h1_f1;
	}

	public String getC_h1_e1() {
		return c_h1_e1;
	}

	public void setC_h1_e1(String c_h1_e1) {
		this.c_h1_e1 = c_h1_e1;
	}

	public String getC_h2_a() {
		return c_h2_a;
	}

	public void setC_h2_a(String c_h2_a) {
		this.c_h2_a = c_h2_a;
	}

	public String getC_h1_d1() {
		return c_h1_d1;
	}

	public void setC_h1_d1(String c_h1_d1) {
		this.c_h1_d1 = c_h1_d1;
	}

	public String getC_h2_b() {
		return c_h2_b;
	}

	public void setC_h2_b(String c_h2_b) {
		this.c_h2_b = c_h2_b;
	}

	public String getC_h1_c1() {
		return c_h1_c1;
	}

	public void setC_h1_c1(String c_h1_c1) {
		this.c_h1_c1 = c_h1_c1;
	}

	public String getC_h2_c() {
		return c_h2_c;
	}

	public void setC_h2_c(String c_h2_c) {
		this.c_h2_c = c_h2_c;
	}

	public String getC_h1_b1() {
		return c_h1_b1;
	}

	public void setC_h1_b1(String c_h1_b1) {
		this.c_h1_b1 = c_h1_b1;
	}

	public String getC_h2_d() {
		return c_h2_d;
	}

	public void setC_h2_d(String c_h2_d) {
		this.c_h2_d = c_h2_d;
	}

	public String getC_h1_a1() {
		return c_h1_a1;
	}

	public void setC_h1_a1(String c_h1_a1) {
		this.c_h1_a1 = c_h1_a1;
	}

	public String getC_h2_f() {
		return c_h2_f;
	}

	public void setC_h2_f(String c_h2_f) {
		this.c_h2_f = c_h2_f;
	}

	public String getC_h1_g() {
		return c_h1_g;
	}

	public void setC_h1_g(String c_h1_g) {
		this.c_h1_g = c_h1_g;
	}

	public String getC_h2_g() {
		return c_h2_g;
	}

	public void setC_h2_g(String c_h2_g) {
		this.c_h2_g = c_h2_g;
	}

	public String getC_h1_f() {
		return c_h1_f;
	}

	public void setC_h1_f(String c_h1_f) {
		this.c_h1_f = c_h1_f;
	}

	public String getC_h2_h() {
		return c_h2_h;
	}

	public void setC_h2_h(String c_h2_h) {
		this.c_h2_h = c_h2_h;
	}

	public String getC_h1_e() {
		return c_h1_e;
	}

	public void setC_h1_e(String c_h1_e) {
		this.c_h1_e = c_h1_e;
	}

	public String getC_h2_i() {
		return c_h2_i;
	}

	public void setC_h2_i(String c_h2_i) {
		this.c_h2_i = c_h2_i;
	}

	public String getC_h1_d() {
		return c_h1_d;
	}

	public void setC_h1_d(String c_h1_d) {
		this.c_h1_d = c_h1_d;
	}

	public String getC_h2_j() {
		return c_h2_j;
	}

	public void setC_h2_j(String c_h2_j) {
		this.c_h2_j = c_h2_j;
	}

	public String getC_h1_c() {
		return c_h1_c;
	}

	public void setC_h1_c(String c_h1_c) {
		this.c_h1_c = c_h1_c;
	}

	public String getC_h1_b() {
		return c_h1_b;
	}

	public void setC_h1_b(String c_h1_b) {
		this.c_h1_b = c_h1_b;
	}

	public String getC_h3() {
		return c_h3;
	}

	public void setC_h3(String c_h3) {
		this.c_h3 = c_h3;
	}

	public String getC_h1_a() {
		return c_h1_a;
	}

	public void setC_h1_a(String c_h1_a) {
		this.c_h1_a = c_h1_a;
	}

	public String getC_h2_comments() {
		return c_h2_comments;
	}

	public void setC_h2_comments(String c_h2_comments) {
		this.c_h2_comments = c_h2_comments;
	}

	public String getC_h4() {
		return c_h4;
	}

	public void setC_h4(String c_h4) {
		this.c_h4 = c_h4;
	}

	public String getC_h5_a() {
		return c_h5_a;
	}

	public void setC_h5_a(String c_h5_a) {
		this.c_h5_a = c_h5_a;
	}

	public String getC_h5_b() {
		return c_h5_b;
	}

	public void setC_h5_b(String c_h5_b) {
		this.c_h5_b = c_h5_b;
	}

	public String getC_h6_a() {
		return c_h6_a;
	}

	public void setC_h6_a(String c_h6_a) {
		this.c_h6_a = c_h6_a;
	}

	public String getC_h6_b() {
		return c_h6_b;
	}

	public void setC_h6_b(String c_h6_b) {
		this.c_h6_b = c_h6_b;
	}

	public String getC_h_comments() {
		return c_h_comments;
	}

	public void setC_h_comments(String c_h_comments) {
		this.c_h_comments = c_h_comments;
	}

	public String getC_h_status() {
		return c_h_status;
	}

	public void setC_h_status(String c_h_status) {
		this.c_h_status = c_h_status;
	}

	public String getC_i1() {
		return c_i1;
	}

	public void setC_i1(String c_i1) {
		this.c_i1 = c_i1;
	}

	public String getC_i2() {
		return c_i2;
	}

	public void setC_i2(String c_i2) {
		this.c_i2 = c_i2;
	}

	public String getC_i3a() {
		return c_i3a;
	}

	public void setC_i3a(String c_i3a) {
		this.c_i3a = c_i3a;
	}

	public String getC_i3b() {
		return c_i3b;
	}

	public void setC_i3b(String c_i3b) {
		this.c_i3b = c_i3b;
	}

	public String getC_i3c() {
		return c_i3c;
	}

	public void setC_i3c(String c_i3c) {
		this.c_i3c = c_i3c;
	}

	public String getC_i3d() {
		return c_i3d;
	}

	public void setC_i3d(String c_i3d) {
		this.c_i3d = c_i3d;
	}

	public String getC_i3e() {
		return c_i3e;
	}

	public void setC_i3e(String c_i3e) {
		this.c_i3e = c_i3e;
	}

	public String getC_i3f() {
		return c_i3f;
	}

	public void setC_i3f(String c_i3f) {
		this.c_i3f = c_i3f;
	}

	public String getC_i_comments() {
		return c_i_comments;
	}

	public void setC_i_comments(String c_i_comments) {
		this.c_i_comments = c_i_comments;
	}

	public String getC_i_status() {
		return c_i_status;
	}

	public void setC_i_status(String c_i_status) {
		this.c_i_status = c_i_status;
	}

	public String getC_j_1() {
		return c_j_1;
	}

	public void setC_j_1(String c_j_1) {
		this.c_j_1 = c_j_1;
	}

	public String getC_j1a_1() {
		return c_j1a_1;
	}

	public void setC_j1a_1(String c_j1a_1) {
		this.c_j1a_1 = c_j1a_1;
	}

	public String getC_j1a_2() {
		return c_j1a_2;
	}

	public void setC_j1a_2(String c_j1a_2) {
		this.c_j1a_2 = c_j1a_2;
	}

	public String getC_j1a_3() {
		return c_j1a_3;
	}

	public void setC_j1a_3(String c_j1a_3) {
		this.c_j1a_3 = c_j1a_3;
	}

	public String getC_j_status() {
		return c_j_status;
	}

	public void setC_j_status(String c_j_status) {
		this.c_j_status = c_j_status;
	}

	public String getC_k_1a() {
		return c_k_1a;
	}

	public void setC_k_1a(String c_k_1a) {
		this.c_k_1a = c_k_1a;
	}

	public String getC_k_1b() {
		return c_k_1b;
	}

	public void setC_k_1b(String c_k_1b) {
		this.c_k_1b = c_k_1b;
	}

	public String getC_k_1c() {
		return c_k_1c;
	}

	public void setC_k_1c(String c_k_1c) {
		this.c_k_1c = c_k_1c;
	}

	public String getC_k_1d() {
		return c_k_1d;
	}

	public void setC_k_1d(String c_k_1d) {
		this.c_k_1d = c_k_1d;
	}

	public String getC_k_1e() {
		return c_k_1e;
	}

	public void setC_k_1e(String c_k_1e) {
		this.c_k_1e = c_k_1e;
	}

	public String getC_k_1f() {
		return c_k_1f;
	}

	public void setC_k_1f(String c_k_1f) {
		this.c_k_1f = c_k_1f;
	}

	public String getC_k_1g() {
		return c_k_1g;
	}

	public void setC_k_1g(String c_k_1g) {
		this.c_k_1g = c_k_1g;
	}

	public String getC_k_1h() {
		return c_k_1h;
	}

	public void setC_k_1h(String c_k_1h) {
		this.c_k_1h = c_k_1h;
	}

	public String getC_k_1i() {
		return c_k_1i;
	}

	public void setC_k_1i(String c_k_1i) {
		this.c_k_1i = c_k_1i;
	}

	public String getC_k_1j() {
		return c_k_1j;
	}

	public void setC_k_1j(String c_k_1j) {
		this.c_k_1j = c_k_1j;
	}

	public String getC_k_1k() {
		return c_k_1k;
	}

	public void setC_k_1k(String c_k_1k) {
		this.c_k_1k = c_k_1k;
	}

	public String getC_k_2() {
		return c_k_2;
	}

	public void setC_k_2(String c_k_2) {
		this.c_k_2 = c_k_2;
	}

	public String getC_k_3() {
		return c_k_3;
	}

	public void setC_k_3(String c_k_3) {
		this.c_k_3 = c_k_3;
	}

	public String getC_k_4a() {
		return c_k_4a;
	}

	public void setC_k_4a(String c_k_4a) {
		this.c_k_4a = c_k_4a;
	}

	public String getC_k_4b() {
		return c_k_4b;
	}

	public void setC_k_4b(String c_k_4b) {
		this.c_k_4b = c_k_4b;
	}

	public String getC_k_4c() {
		return c_k_4c;
	}

	public void setC_k_4c(String c_k_4c) {
		this.c_k_4c = c_k_4c;
	}

	public String getC_k_5() {
		return c_k_5;
	}

	public void setC_k_5(String c_k_5) {
		this.c_k_5 = c_k_5;
	}

	public String getC_k_6a() {
		return c_k_6a;
	}

	public void setC_k_6a(String c_k_6a) {
		this.c_k_6a = c_k_6a;
	}

	public String getC_k_6b() {
		return c_k_6b;
	}

	public void setC_k_6b(String c_k_6b) {
		this.c_k_6b = c_k_6b;
	}

	public String getC_k_7a() {
		return c_k_7a;
	}

	public void setC_k_7a(String c_k_7a) {
		this.c_k_7a = c_k_7a;
	}

	public String getC_k_7b() {
		return c_k_7b;
	}

	public void setC_k_7b(String c_k_7b) {
		this.c_k_7b = c_k_7b;
	}

	public String getC_k_8a() {
		return c_k_8a;
	}

	public void setC_k_8a(String c_k_8a) {
		this.c_k_8a = c_k_8a;
	}

	public String getC_k_8b() {
		return c_k_8b;
	}

	public void setC_k_8b(String c_k_8b) {
		this.c_k_8b = c_k_8b;
	}

	public String getC_k_8c() {
		return c_k_8c;
	}

	public void setC_k_8c(String c_k_8c) {
		this.c_k_8c = c_k_8c;
	}

	public String getC_k_comments() {
		return c_k_comments;
	}

	public void setC_k_comments(String c_k_comments) {
		this.c_k_comments = c_k_comments;
	}

	public String getC_k_status() {
		return c_k_status;
	}

	public void setC_k_status(String c_k_status) {
		this.c_k_status = c_k_status;
	}

	public String getC_l_1a() {
		return c_l_1a;
	}

	public void setC_l_1a(String c_l_1a) {
		this.c_l_1a = c_l_1a;
	}

	public String getC_l_1b() {
		return c_l_1b;
	}

	public void setC_l_1b(String c_l_1b) {
		this.c_l_1b = c_l_1b;
	}

	public String getC_l_2a() {
		return c_l_2a;
	}

	public void setC_l_2a(String c_l_2a) {
		this.c_l_2a = c_l_2a;
	}

	public String getC_l_2b() {
		return c_l_2b;
	}

	public void setC_l_2b(String c_l_2b) {
		this.c_l_2b = c_l_2b;
	}

	public String getC_l_3() {
		return c_l_3;
	}

	public void setC_l_3(String c_l_3) {
		this.c_l_3 = c_l_3;
	}

	public String getC_l_4() {
		return c_l_4;
	}

	public void setC_l_4(String c_l_4) {
		this.c_l_4 = c_l_4;
	}

	public String getC_l_5() {
		return c_l_5;
	}

	public void setC_l_5(String c_l_5) {
		this.c_l_5 = c_l_5;
	}

	public String getC_l_6() {
		return c_l_6;
	}

	public void setC_l_6(String c_l_6) {
		this.c_l_6 = c_l_6;
	}

	public String getC_l_comments() {
		return c_l_comments;
	}

	public void setC_l_comments(String c_l_comments) {
		this.c_l_comments = c_l_comments;
	}

	public String getC_l_status() {
		return c_l_status;
	}

	public void setC_l_status(String c_l_status) {
		this.c_l_status = c_l_status;
	}

	public String getC_m_1() {
		return c_m_1;
	}

	public void setC_m_1(String c_m_1) {
		this.c_m_1 = c_m_1;
	}

	public String getC_m_2() {
		return c_m_2;
	}

	public void setC_m_2(String c_m_2) {
		this.c_m_2 = c_m_2;
	}

	public String getC_m_3a() {
		return c_m_3a;
	}

	public void setC_m_3a(String c_m_3a) {
		this.c_m_3a = c_m_3a;
	}

	public String getC_m_3b() {
		return c_m_3b;
	}

	public void setC_m_3b(String c_m_3b) {
		this.c_m_3b = c_m_3b;
	}

	public String getC_m_3c() {
		return c_m_3c;
	}

	public void setC_m_3c(String c_m_3c) {
		this.c_m_3c = c_m_3c;
	}

	public String getC_m_3d() {
		return c_m_3d;
	}

	public void setC_m_3d(String c_m_3d) {
		this.c_m_3d = c_m_3d;
	}

	public String getC_m_4() {
		return c_m_4;
	}

	public void setC_m_4(String c_m_4) {
		this.c_m_4 = c_m_4;
	}

	public String getC_m_comments() {
		return c_m_comments;
	}

	public void setC_m_comments(String c_m_comments) {
		this.c_m_comments = c_m_comments;
	}

	public String getC_m_status() {
		return c_m_status;
	}

	public void setC_m_status(String c_m_status) {
		this.c_m_status = c_m_status;
	}

	public String getC_n_1() {
		return c_n_1;
	}

	public void setC_n_1(String c_n_1) {
		this.c_n_1 = c_n_1;
	}

	public String getC_n_comments() {
		return c_n_comments;
	}

	public void setC_n_comments(String c_n_comments) {
		this.c_n_comments = c_n_comments;
	}

	public String getC_n_status() {
		return c_n_status;
	}

	public void setC_n_status(String c_n_status) {
		this.c_n_status = c_n_status;
	}

	public String getC_o_1a() {
		return c_o_1a;
	}

	public void setC_o_1a(String c_o_1a) {
		this.c_o_1a = c_o_1a;
	}

	public String getC_o_1b() {
		return c_o_1b;
	}

	public void setC_o_1b(String c_o_1b) {
		this.c_o_1b = c_o_1b;
	}

	public String getC_o_1c() {
		return c_o_1c;
	}

	public void setC_o_1c(String c_o_1c) {
		this.c_o_1c = c_o_1c;
	}

	public String getC_o_1d() {
		return c_o_1d;
	}

	public void setC_o_1d(String c_o_1d) {
		this.c_o_1d = c_o_1d;
	}

	public String getC_o_1e() {
		return c_o_1e;
	}

	public void setC_o_1e(String c_o_1e) {
		this.c_o_1e = c_o_1e;
	}

	public String getC_o_1f() {
		return c_o_1f;
	}

	public void setC_o_1f(String c_o_1f) {
		this.c_o_1f = c_o_1f;
	}

	public String getC_o_1g() {
		return c_o_1g;
	}

	public void setC_o_1g(String c_o_1g) {
		this.c_o_1g = c_o_1g;
	}

	public String getC_o_1h() {
		return c_o_1h;
	}

	public void setC_o_1h(String c_o_1h) {
		this.c_o_1h = c_o_1h;
	}

	public String getC_o_1i() {
		return c_o_1i;
	}

	public void setC_o_1i(String c_o_1i) {
		this.c_o_1i = c_o_1i;
	}

	public String getC_o_1iInfo() {
		return c_o_1iInfo;
	}

	public void setC_o_1iInfo(String c_o_1iInfo) {
		this.c_o_1iInfo = c_o_1iInfo;
	}

	public String getC_o_comments() {
		return c_o_comments;
	}

	public void setC_o_comments(String c_o_comments) {
		this.c_o_comments = c_o_comments;
	}

	public String getC_o_status() {
		return c_o_status;
	}

	public void setC_o_status(String c_o_status) {
		this.c_o_status = c_o_status;
	}

	public String getC_o_2() {
		return c_o_2;
	}

	public void setC_o_2(String c_o_2) {
		this.c_o_2 = c_o_2;
	}

	public String getC_p_1() {
		return c_p_1;
	}

	public void setC_p_1(String c_p_1) {
		this.c_p_1 = c_p_1;
	}

	public String getC_p_2a() {
		return c_p_2a;
	}

	public void setC_p_2a(String c_p_2a) {
		this.c_p_2a = c_p_2a;
	}

	public String getC_p_2b() {
		return c_p_2b;
	}

	public void setC_p_2b(String c_p_2b) {
		this.c_p_2b = c_p_2b;
	}

	public String getC_p_3() {
		return c_p_3;
	}

	public void setC_p_3(String c_p_3) {
		this.c_p_3 = c_p_3;
	}

	public String getC_p_4() {
		return c_p_4;
	}

	public void setC_p_4(String c_p_4) {
		this.c_p_4 = c_p_4;
	}

	public String getC_p_5a() {
		return c_p_5a;
	}

	public void setC_p_5a(String c_p_5a) {
		this.c_p_5a = c_p_5a;
	}

	public String getC_p_5b() {
		return c_p_5b;
	}

	public void setC_p_5b(String c_p_5b) {
		this.c_p_5b = c_p_5b;
	}

	public String getC_p_5c() {
		return c_p_5c;
	}

	public void setC_p_5c(String c_p_5c) {
		this.c_p_5c = c_p_5c;
	}

	public String getC_p_5d() {
		return c_p_5d;
	}

	public void setC_p_5d(String c_p_5d) {
		this.c_p_5d = c_p_5d;
	}

	public String getC_p_5e() {
		return c_p_5e;
	}

	public void setC_p_5e(String c_p_5e) {
		this.c_p_5e = c_p_5e;
	}

	public String getC_p_6() {
		return c_p_6;
	}

	public void setC_p_6(String c_p_6) {
		this.c_p_6 = c_p_6;
	}

	public String getC_p_7() {
		return c_p_7;
	}

	public void setC_p_7(String c_p_7) {
		this.c_p_7 = c_p_7;
	}

	public String getC_p_comments() {
		return c_p_comments;
	}

	public void setC_p_comments(String c_p_comments) {
		this.c_p_comments = c_p_comments;
	}

	public String getC_p_status() {
		return c_p_status;
	}

	public void setC_p_status(String c_p_status) {
		this.c_p_status = c_p_status;
	}

	public String getC_q_1() {
		return c_q_1;
	}

	public void setC_q_1(String c_q_1) {
		this.c_q_1 = c_q_1;
	}

	public String getC_q_2() {
		return c_q_2;
	}

	public void setC_q_2(String c_q_2) {
		this.c_q_2 = c_q_2;
	}

	public String getC_q_3() {
		return c_q_3;
	}

	public void setC_q_3(String c_q_3) {
		this.c_q_3 = c_q_3;
	}

	public String getC_q_comments() {
		return c_q_comments;
	}

	public void setC_q_comments(String c_q_comments) {
		this.c_q_comments = c_q_comments;
	}

	public String getC_q_status() {
		return c_q_status;
	}

	public void setC_q_status(String c_q_status) {
		this.c_q_status = c_q_status;
	}

	public String getC_r_1() {
		return c_r_1;
	}

	public void setC_r_1(String c_r_1) {
		this.c_r_1 = c_r_1;
	}

	public String getC_r_2() {
		return c_r_2;
	}

	public void setC_r_2(String c_r_2) {
		this.c_r_2 = c_r_2;
	}

	public String getC_r_comments() {
		return c_r_comments;
	}

	public void setC_r_comments(String c_r_comments) {
		this.c_r_comments = c_r_comments;
	}

	public String getC_r_status() {
		return c_r_status;
	}

	public void setC_r_status(String c_r_status) {
		this.c_r_status = c_r_status;
	}

	public String getC_drugs_service() {
		return C_drugs_service;
	}

	public void setC_drugs_service(String c_drugs_service) {
		C_drugs_service = c_drugs_service;
	}

	public String getC_drugs_intolerances() {
		return C_drugs_intolerances;
	}

	public void setC_drugs_intolerances(String c_drugs_intolerances) {
		C_drugs_intolerances = c_drugs_intolerances;
	}

	public String getC_drugs_intolerances1() {
		return C_drugs_intolerances1;
	}

	public void setC_drugs_intolerances1(String c_drugs_intolerances1) {
		C_drugs_intolerances1 = c_drugs_intolerances1;
	}

	public String getC_Annexe_Status() {
		return C_Annexe_Status;
	}

	public void setC_Annexe_Status(String c_Annexe_Status) {
		C_Annexe_Status = c_Annexe_Status;
	}

	public Date getC_S_Date() {
		return C_S_Date;
	}

	public void setC_S_Date(Date c_S_Date) {
		C_S_Date = c_S_Date;
	}

	public String getC_S_Status() {
		return C_S_Status;
	}

	public void setC_S_Status(String c_S_Status) {
		C_S_Status = c_S_Status;
	}

}
