package com.wael.entities;

import java.sql.SQLException;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.j256.ormlite.android.apptools.OrmLiteSqliteOpenHelper;
import com.j256.ormlite.dao.Dao;
import com.j256.ormlite.support.ConnectionSource;
import com.j256.ormlite.table.TableUtils;
import com.wael.micro2media.R;

/**
 * Database helper which creates and upgrades the database and provides the DAOs
 * for the app.
 * 
 * 
 */
public class DatabaseHelper extends OrmLiteSqliteOpenHelper {

	/************************************************
	 * Suggested Copy/Paste code. Everything from here to the done block.
	 ************************************************/

	private static final String DATABASE_NAME = "emedics.db";
	private static final int DATABASE_VERSION = 1;

	private Dao<AdminDetails, Integer> AdminDao;
	private Dao<Patient_annexe_a, Integer> Patient_annexe_aDao;
	private Dao<Annexe_c, Integer> Annexe_cDao;

	public DatabaseHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION,
				R.raw.ormlite_config);
	}

	/************************************************
	 * Suggested Copy/Paste Done
	 ************************************************/

	@Override
	public void onCreate(SQLiteDatabase sqliteDatabase,
			ConnectionSource connectionSource) {
		try {

			// Create tables. This onCreate() method will be invoked only once
			// of the application life time i.e. the first time when the
			// application starts.
			TableUtils.createTable(connectionSource, AdminDetails.class);
			TableUtils.createTable(connectionSource, Patient_annexe_a.class);
			TableUtils.createTable(connectionSource, Annexe_c.class);

		} catch (SQLException e) {
			Log.e(DatabaseHelper.class.getName(), "Unable to create datbases",
					e);
		}
	}

	@Override
	public void onUpgrade(SQLiteDatabase sqliteDatabase,
			ConnectionSource connectionSource, int oldVer, int newVer) {
		try {

			// In case of change in database of next version of application,
			// please increase the value of DATABASE_VERSION variable, then this
			// method will be invoked
			// automatically. Developer needs to handle the upgrade logic here,
			// i.e. create a new table or a new column to an existing table,
			// take the backups of the
			// existing database etc.

			TableUtils.dropTable(connectionSource, AdminDetails.class, true);
			TableUtils
					.dropTable(connectionSource, Patient_annexe_a.class, true);
			TableUtils.dropTable(connectionSource, Annexe_c.class, true);
			onCreate(sqliteDatabase, connectionSource);

		} catch (SQLException e) {
			Log.e(DatabaseHelper.class.getName(),
					"Unable to upgrade database from version " + oldVer
							+ " to new " + newVer, e);
		}
	}

	// Create the getDao methods of all database tables to access those from
	// android code.
	// Insert, delete, read, update everything will be happened through DAOs

	public Dao<AdminDetails, Integer> getAdminDao() throws SQLException {
		if (AdminDao == null) {
			AdminDao = getDao(AdminDetails.class);
		}
		return AdminDao;
	}

	public Dao<Patient_annexe_a, Integer> getPatient_annexe_a_Dao()
			throws SQLException {
		if (Patient_annexe_aDao == null) {
			Patient_annexe_aDao = getDao(Patient_annexe_a.class);
		}
		return Patient_annexe_aDao;
	}

	public Dao<Annexe_c, Integer> getAnnexe_c_Dao() throws SQLException {
		if (Annexe_cDao == null) {
			Annexe_cDao = getDao(Annexe_c.class);
		}
		return Annexe_cDao;
	}

}
