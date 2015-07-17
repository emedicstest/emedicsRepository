package com.wael.micro2media;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Vector;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfig;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.AsyncTask;
import android.os.Bundle;
import android.support.v4.app.ActionBarDrawerToggle;
import android.support.v4.widget.DrawerLayout;
import android.util.Log;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import com.wael.micro2media.R;
import com.wael.micro2media.R.id;
import com.wael.micro2media.R.string;

public class MainActivity extends Activity {

	// declare properties

	public static DrawerLayout mDrawerLayout;
	public static ListView mDrawerList;
	public static Activity myActivity;
	public static Fragment fragment;
	private ActionBarDrawerToggle mDrawerToggle;
	public static FragmentManager fragmentManager;

	// nav drawer title
	private CharSequence mDrawerTitle;
	// used to store app title
	private CharSequence mTitle;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		myActivity = this;

		// for proper titles
		mTitle = mDrawerTitle = getTitle();

		// initialize properties

		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerList = (ListView) findViewById(R.id.left_drawer);

		// list the drawer items
		ObjectDrawerItem[] drawerItem = new ObjectDrawerItem[8];

		drawerItem[0] = new ObjectDrawerItem(R.drawable.ic_action_copy,
				getResources().getString(string.PATIENTS));
		drawerItem[1] = new ObjectDrawerItem(R.drawable.ic_action_copy,
				getResources().getString(string.CONSULTATIONS));
		drawerItem[2] = new ObjectDrawerItem(R.drawable.ic_action_copy,
				getResources().getString(string.TASKS));
		drawerItem[3] = new ObjectDrawerItem(R.drawable.ic_action_copy,
				getResources().getString(string.REFERENCES));
		drawerItem[4] = new ObjectDrawerItem(R.drawable.ic_action_copy,
				"Fragment 4");
		drawerItem[5] = new ObjectDrawerItem(R.drawable.ic_action_copy,
				"Fragment 5");
		drawerItem[6] = new ObjectDrawerItem(R.drawable.ic_action_copy,
				"Fragment 6");
		drawerItem[7] = new ObjectDrawerItem(R.drawable.ic_action_copy,
				getResources().getString(string.LOGOUT));

		// Pass the folderData to our ListView adapter
		DrawerItemCustomAdapter adapter = new DrawerItemCustomAdapter(this,
				R.layout.listview_item_row, drawerItem);

		// Set the adapter for the list view
		mDrawerList.setAdapter(adapter);

		// set the item click listener
		mDrawerList.setOnItemClickListener(new DrawerItemClickListener());

		// for app icon control for nav drawer
		mDrawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
		mDrawerToggle = new ActionBarDrawerToggle(this, /* host Activity */
		mDrawerLayout, /* DrawerLayout object */
		R.drawable.ic_drawer, /* nav drawer icon to replace 'Up' caret */
		R.string.drawer_open, /* "open drawer" description */
		R.string.drawer_close /* "close drawer" description */
		) {

			/** Called when a drawer has settled in a completely closed state. */
			public void onDrawerClosed(View view) {
				super.onDrawerClosed(view);
				getActionBar().setTitle(mTitle);
			}

			/** Called when a drawer has settled in a completely open state. */
			public void onDrawerOpened(View drawerView) {
				super.onDrawerOpened(drawerView);
				getActionBar().setTitle(mDrawerTitle);
			}
		};

		// Set the drawer toggle as the DrawerListener
		// mDrawerLayout.setDrawerListener(mDrawerToggle);

		// enable ActionBar app icon to behave as action to toggle nav drawer
		getActionBar().setDisplayHomeAsUpEnabled(true);
		getActionBar().setHomeButtonEnabled(true);

		if (savedInstanceState == null) {
			// on first time display view for first nav item
			selectItem(0);
		}
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {

		// The action bar home/up action should open or close the drawer.
		// ActionBarDrawerToggle will take care of this.
		if (mDrawerToggle.onOptionsItemSelected(item)) {
			return true;
		}

		return super.onOptionsItemSelected(item);
	}

	@Override
	public void onConfigurationChanged(Configuration newConfig) {
		super.onConfigurationChanged(newConfig);
		mDrawerToggle.onConfigurationChanged(newConfig);
	}

	// to change up caret
	@Override
	protected void onPostCreate(Bundle savedInstanceState) {
		super.onPostCreate(savedInstanceState);
		// Sync the toggle state after onRestoreInstanceState has occurred.
		mDrawerToggle.syncState();
	}

	// navigation drawer click listener
	private class DrawerItemClickListener implements
			ListView.OnItemClickListener {

		@Override
		public void onItemClick(AdapterView<?> parent, View view, int position,
				long id) {
			selectItem(position);
		}

	}

	private void selectItem(int position) {

		// update the main content by replacing fragments

		fragment = null;

		switch (position) {
		case 0:
			fragment = new FragmentPatients();
			setTitle(getResources().getString(string.PATIENTS));
			break;
		case 1:
			fragment = new FragmentConsultation();
			setTitle(getResources().getString(string.TASKS));
			break;

		case 2:
			fragment = new FragmentTasks();
			setTitle(getResources().getString(string.REFERENCES));
			break;

		case 3:
			fragment = new FragmentTasks();
			setTitle("Fragment 4");
			break;

		case 4:
			fragment = new FragmentTasks();
			setTitle("Fragment 5");
			break;
		case 5:
			fragment = new FragmentTasks();
			setTitle("Fragment 6");
			break;

		case 6:
			fragment = new FragmentTasks();
			setTitle("Fragment 7");
			break;

		case 7:

			Intent i = new Intent(MainActivity.myActivity, LoginActivity.class);
			MainActivity.myActivity.startActivity(i);
			MainActivity.myActivity.finish();
			break;

		default:
			break;
		}

		if (fragment != null) {
			fragmentManager = getFragmentManager();
			fragmentManager.beginTransaction()
					.replace(R.id.content_frame, fragment).commit();

			// update selected item and title, then close the drawer
			mDrawerList.setItemChecked(position, true);
			mDrawerList.setSelection(position);

			mDrawerLayout.closeDrawer(mDrawerList);

		} else {
			// error in creating fragment
			Log.e("MainActivity", "Error in creating fragment");
		}
	}

	@Override
	public void setTitle(CharSequence title) {
		mTitle = title;
		getActionBar().setTitle(mTitle);
	}

}
