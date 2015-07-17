/**
 * Author: Wael
 * */
package com.wael.micro2media;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.SQLException;
import java.util.Date;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Vector;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.graphics.Color;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.j256.ormlite.android.apptools.OpenHelperManager;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.stmt.PreparedQuery;
import com.j256.ormlite.stmt.QueryBuilder;
import com.wael.entities.AdminDetails;
import com.wael.entities.Annexe_c;
import com.wael.entities.DatabaseHelper;
import com.wael.entities.Patient_annexe_a;
import com.wael.micro2media.R.id;
import com.wael.micro2media.R.layout;
import com.wael.micro2media.R.string;

public class LoginActivity extends Activity {
	// LogCat tag

	private Button btnLogin;
	private EditText inputUserName;
	private EditText inputPassword;
	private TextView en, de, fr;
	private ProgressDialog pDialog;
	public String USERNAME = "";
	public String PASSWORD = "";
	public static int idConnected;
	public String DB_NAME = "new";
	Vector<Integer> vectorLogin;
	public static String bLogin = "";
	public static Context mycontextLogin;

	public static String myPass = "";
	// Reference of DatabaseHelper class to access its DAOs and other components
	private DatabaseHelper databaseHelper = null;

	private Dao<AdminDetails, Integer> adminDao;
	private Dao<Patient_annexe_a, Integer> Patient_annexe_aDao;
	private Dao<Annexe_c, Integer> annexe_cDao;

	private AdminDetails admin;

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(layout.activity_login);
		setTitle("Authentification");

		mycontextLogin = getApplicationContext();
		inputUserName = (EditText) findViewById(id.email);
		inputPassword = (EditText) findViewById(id.password);
		btnLogin = (Button) findViewById(id.btnLogin);

		en = (TextView) findViewById(id.en);
		de = (TextView) findViewById(id.de);
		fr = (TextView) findViewById(id.fr);

		Locale l = Locale.getDefault();

		Log.w("log", l.getLanguage());

		if (l.getLanguage().trim().equals("fr")) {

			fr.setTextColor(Color.parseColor("#00B050"));
		} else if (l.getLanguage().trim().equals("de")) {
			de.setTextColor(Color.parseColor("#00B050"));
		} else {
			en.setTextColor(Color.parseColor("#00B050"));
		}

		en.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				en.setTextColor(Color.parseColor("#00B050"));
				fr.setTextColor(Color.BLACK);
				de.setTextColor(Color.BLACK);

				String languageToLoad = "en";
				Locale locale = new Locale(languageToLoad);
				Locale.setDefault(locale);
				Configuration config = new Configuration();
				config.locale = locale;
				getApplicationContext().getResources().updateConfiguration(
						config,
						getApplicationContext().getResources()
								.getDisplayMetrics());

				Intent i = new Intent(LoginActivity.this, LoginActivity.class);
				startActivity(i);
				finish();
			}
		});

		de.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				de.setTextColor(Color.parseColor("#00B050"));
				fr.setTextColor(Color.BLACK);
				en.setTextColor(Color.BLACK);

				String languageToLoad = "de";
				Locale locale = new Locale(languageToLoad);
				Locale.setDefault(locale);
				Configuration config = new Configuration();
				config.locale = locale;
				getApplicationContext().getResources().updateConfiguration(
						config,
						getApplicationContext().getResources()
								.getDisplayMetrics());

				Intent i = new Intent(LoginActivity.this, LoginActivity.class);
				startActivity(i);
				finish();
			}
		});

		fr.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View arg0) {
				fr.setTextColor(Color.parseColor("#00B050"));
				en.setTextColor(Color.BLACK);
				de.setTextColor(Color.BLACK);
				String languageToLoad = "fr";
				Locale locale = new Locale(languageToLoad);
				Locale.setDefault(locale);
				Configuration config = new Configuration();
				config.locale = locale;
				getApplicationContext().getResources().updateConfiguration(
						config,
						getApplicationContext().getResources()
								.getDisplayMetrics());

				Intent i = new Intent(LoginActivity.this, LoginActivity.class);
				startActivity(i);
				finish();
			}
		});

		// Login button Click Event
		btnLogin.setOnClickListener(new View.OnClickListener() {

			public void onClick(View view) {
				String username = inputUserName.getText().toString().trim();
				String password = inputPassword.getText().toString().trim();

				USERNAME = username;
				PASSWORD = password;

				if (Connectivity.isNetworkAvailable(getApplicationContext())) {

					// This is how, a reference of DAO object can be done
					// hathi insert admin et create table
					//
					// try {
					// adminDao = getHelper().getAdminDao();
					// AdminDetails admin11 = new AdminDetails();
					//
					// admin11.setUser_Name("wael");
					// admin11.setUser_Pass("39057f4a925f064130b3b7059a0e3294");
					// adminDao.create(admin11);
					// } catch (SQLException e1) {
					// // TODO Auto-generated catch block
					// e1.printStackTrace();
					// }

					try {
						adminDao = getHelper().getAdminDao();
						// AdminDetails admin11 = new AdminDetails();
						//
						// admin11.setUser_Name("wael");
						// admin11.setUser_Pass("wael");
						// adminDao.create(admin11);
						//
						// Patient_annexe_aDao = getHelper()
						// .getPatient_annexe_a_Dao();
						// Patient_annexe_a p = new Patient_annexe_a();
						// p.setA_bb_1_canton("a_bb_1_canton");
						// Patient_annexe_aDao.create(p);

						annexe_cDao = getHelper().getAnnexe_c_Dao();
						Annexe_c annex_c = new Annexe_c(new Date(), "c_a_2",
								"c_a_3a", "c_a_3b", "c_a_3c", "c_a_comments",
								"c_a_status", "c_b_1a", "c_b_1b", "c_b_2",
								"c_b_3a", "c_b_3b", "c_b_3c", "c_b_4", "c_b_5",
								"c_b_comments", "c_b_status", "c_c_1", "c_c_2",
								"c_c_3", "c_c_comments", "c_c_status", "c_d_1",
								"c_d_comments", "c_d_status", "c_e_1a",
								"c_e_1b", "c_e_1c", "c_e_1d", "c_e_1e",
								"c_e_2a", "c_e_2b", "c_e_2c", "c_e_2d",
								"c_e_2e", "c_e_comments", "c_e_status",
								"c_f_1a", "c_f_1b", "c_f_1c", "c_f_2", "c_f_3",
								"c_f_4", "c_f_comments", "c_f_status", "c_g1",
								"c_g_2a", "c_g_2b", "c_g_comments",
								"c_g_status", "c_h1_comments", "c_h1_g1",
								"c_h1_f1", "c_h1_e1", "c_h2_a", "c_h1_d1",
								"c_h2_b", "c_h1_c1", "c_h2_c", "c_h1_b1",
								"c_h2_d", "c_h1_a1", "c_h2_f", "c_h1_g",
								"c_h2_g", "c_h1_f", "c_h2_h", "c_h1_e",
								"c_h2_i", "c_h1_d", "c_h2_j", "c_h1_c",
								"c_h1_b", "c_h3", "c_h1_a", "c_h2_comments",
								"c_h4", "c_h5_a", "c_h5_b", "c_h6_a", "c_h6_b",
								"c_h_comments", "c_h_status", "c_i1", "c_i2",
								"c_i3a", "c_i3b", "c_i3c", "c_i3d", "c_i3e",
								"c_i3f", "c_i_comments", "c_i_status", "c_j_1",
								"c_j1a_1", "c_j1a_2", "c_j1a_3", "c_j_status",
								"c_k_1a", "c_k_1b", "c_k_1c", "c_k_1d",
								"c_k_1e", "c_k_1f", "c_k_1g", "c_k_1h",
								"c_k_1i", "c_k_1j", "c_k_1k", "c_k_2", "c_k_3",
								"c_k_4a", "c_k_4b", "c_k_4c", "c_k_5",
								"c_k_6a", "c_k_6b", "c_k_7a", "c_k_7b",
								"c_k_8a", "c_k_8b", "c_k_8c", "c_k_comments",
								"c_k_status", "c_l_1a", "c_l_1b", "c_l_2a",
								"c_l_2b", "c_l_3", "c_l_4", "c_l_5", "c_l_6",
								"c_l_comments", "c_l_status", "c_m_1", "c_m_2",
								"c_m_3a", "c_m_3b", "c_m_3c", "c_m_3d",
								"c_m_4", "c_m_comments", "c_m_status", "c_n_1",
								"c_n_comments", "c_n_status", "c_o_1a",
								"c_o_1b", "c_o_1c", "c_o_1d", "c_o_1e",
								"c_o_1f", "c_o_1g", "c_o_1h", "c_o_1i",
								"c_o_1iInfo", "c_o_comments", "c_o_status",
								"c_o_2", "c_p_1", "c_p_2a", "c_p_2b", "c_p_3",
								"c_p_4", "c_p_5a", "c_p_5b", "c_p_5c",
								"c_p_5d", "c_p_5e", "c_p_6", "c_p_7",
								"c_p_comments", "c_p_status", "c_q_1", "c_q_2",
								"c_q_3", "c_q_comments", "c_q_status", "c_r_1",
								"c_r_2", "c_r_comments", "c_r_status",
								"c_drugs_service", "c_drugs_intolerances",
								"c_drugs_intolerances1", "c_Annexe_Status",
								new Date(), "c_S_Status");

						// annex_c.setPatient(p);
						// annexe_cDao.create(annex_c);

					} catch (SQLException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}

					if (USERNAME.length() > 0 && PASSWORD.length() > 0) {

						// go to the main activity
						// Get our query builder from the DAO

						// We need only Students who are associated with the
						// selected Teacher, so build the query by "Where"
						// clause
						try {
							adminDao = getHelper().getAdminDao();

							// Get our query builder from the DAO
							QueryBuilder<AdminDetails, Integer> queryBuilder = adminDao
									.queryBuilder();
							List list;
							queryBuilder.where().eq("user_name", username)
									.and().eq("user_pass", MD5.crypt(password));

							list = queryBuilder.query();
						
							if (list.size() > 0) {
								Intent i = new Intent(LoginActivity.this,
										MainActivity.class);
								startActivity(i);
								finish();

							} else {
								Toast.makeText(
										LoginActivity.this,
										getResources()
												.getString(
														string.invalid_username_password),
										Toast.LENGTH_SHORT).show();
							}

						} catch (SQLException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}

					} else {
						Toast.makeText(
								LoginActivity.this,
								getResources().getString(
										string.empty_username_password),
								Toast.LENGTH_SHORT).show();

					}

				} else {
					Toast.makeText(getApplicationContext(),
							"Pas de connexion internet", Toast.LENGTH_SHORT)
							.show();
				}

			}
		});

	}

	private void showDialog() {
		if (!pDialog.isShowing())
			pDialog.show();
	}

	private void hideDialog() {
		if (pDialog.isShowing())
			pDialog.dismiss();
	}

	// This is how, DatabaseHelper can be initialized for future use
	private DatabaseHelper getHelper() {
		if (databaseHelper == null) {
			databaseHelper = OpenHelperManager.getHelper(this,
					DatabaseHelper.class);
		}
		return databaseHelper;
	}

}
