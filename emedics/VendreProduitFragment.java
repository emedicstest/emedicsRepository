package com.wael.targa;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;

import org.apache.xmlrpc.XmlRpcException;
import org.apache.xmlrpc.client.XmlRpcClient;
import org.apache.xmlrpc.client.XmlRpcClientConfig;
import org.apache.xmlrpc.client.XmlRpcClientConfigImpl;

import android.app.Fragment;
import android.graphics.PointF;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.dlazaro66.qrcodereaderview.QRCodeReaderView;
import com.dlazaro66.qrcodereaderview.QRCodeReaderView.OnQRCodeReadListener;
import com.wael.targa.R.layout;

public class VendreProduitFragment extends Fragment implements
		OnQRCodeReadListener {

	private TextView myTextView;
	private QRCodeReaderView mydecoderview;
	private ImageView line_image;
	
	public static Integer nbr = 0;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		View rootView = inflater.inflate(layout.activity_decoder, container,
				false);

		nbr++;
		Toast.makeText(getActivity(), "Passer La carte de fidelité",
				Toast.LENGTH_LONG).show();

		mydecoderview = (QRCodeReaderView) rootView
				.findViewById(R.id.qrdecoderview);
		mydecoderview.setOnQRCodeReadListener(this);

		myTextView = (TextView) rootView.findViewById(R.id.exampleTextView);

		line_image = (ImageView) rootView.findViewById(R.id.red_line_image);

		TranslateAnimation mAnimation = new TranslateAnimation(
				TranslateAnimation.ABSOLUTE, 0f, TranslateAnimation.ABSOLUTE,
				0f, TranslateAnimation.RELATIVE_TO_PARENT, 0f,
				TranslateAnimation.RELATIVE_TO_PARENT, 0.5f);
		mAnimation.setDuration(1000);
		mAnimation.setRepeatCount(-1);
		mAnimation.setRepeatMode(Animation.REVERSE);
		mAnimation.setInterpolator(new LinearInterpolator());
		line_image.setAnimation(mAnimation);

		// String text = "Imen_Zara_200";
		//
		// String[] separated = text.split("\\_");
		// if (separated.length > 0) {
		// clientNameQR = separated[0];
		// commercantNameQR = separated[1];
		// nbrPointsQR = separated[2];
		// }
		//
		// Toast.makeText(getActivity(),
		// clientNameQR + commercantNameQR + nbrPointsQR,
		// Toast.LENGTH_SHORT).show();

		return rootView;

	}

	// Called when a QR is decoded
	// "text" : the text encoded in QR
	// "points" : points where QR control points are placed
	@Override
	public void onQRCodeRead(String text, PointF[] points) {

		myTextView.setText(text);

		if (nbr < 1) {
			Toast.makeText(getActivity(), "Passer le produit",
					Toast.LENGTH_SHORT).show();

			String[] separated = text.split("\\_");
			if (separated.length > 0) {
				MainActivity.clientNameQR = separated[0];
				MainActivity.commercantNameQR = separated[1];
				MainActivity.nbrPointsCardQR = separated[2];
			}

			Toast.makeText(getActivity(),
					MainActivity.clientNameQR + MainActivity.commercantNameQR + MainActivity.nbrPointsCardQR,
					Toast.LENGTH_SHORT).show();

		} else {
			MainActivity.nbrPointsArticleQR = text;

			Toast.makeText(getActivity(), "nbr1 " + MainActivity.nbrPointsArticleQR,
					Toast.LENGTH_SHORT).show();

			//

		}

		if (nbr < 2) {
			MainActivity.fragment = new VendreProduitFragment();
		} else {
			new UpdateDataAsync().execute();
			// Toast.makeText(
			// getActivity(),
			// "nbr2 " + clientNameQR + " " + commercantNameQR + " "
			// + nbrPointsCardQR + " " + nbrPointsArticleQR,
			// Toast.LENGTH_SHORT).show();
			MainActivity.fragment = new AddProductFragment();
		}

		if (MainActivity.fragment != null) {
			MainActivity.fragmentManager = getFragmentManager();
			MainActivity.fragmentManager.beginTransaction()
					.replace(R.id.content_frame, MainActivity.fragment)
					.commit();

		}

	}

	// Called when your device have no camera
	@Override
	public void cameraNotFound() {

	}

	// Called when there's no QR codes in the camera preview image
	@Override
	public void QRCodeNotFoundOnCamImage() {

	}

	@Override
	public void onResume() {
		super.onResume();
		mydecoderview.getCameraManager().startPreview();
	}

	@Override
	public void onPause() {
		super.onPause();
		mydecoderview.getCameraManager().stopPreview();
	}

	public static Integer[] searchClientByNom() throws MalformedURLException {

		Integer[] li = null;

		XmlRpcClient xmlrpc = new XmlRpcClient();

		XmlRpcClientConfigImpl xmlrpcConfgDb = new XmlRpcClientConfigImpl();
		xmlrpcConfgDb.setEnabledForExceptions(true);
		// xmlrpcConfgDb.setServerURL((new URL("http", "41.224.241.25", 88,
		// "/xmlrpc/object")));

		xmlrpcConfgDb.setServerURL((new URL("http", MainActivity.myActivity
				.getResources().getString(com.wael.targa.R.string.adresse),
				8069, "/xmlrpc/object")));

		xmlrpc.setConfig(xmlrpcConfgDb);

		Object[] l = { "name", "=", MainActivity.clientNameQR };
		Object[] filters = { l };
		// filters.add(l);

		Object[] params = new Object[] { "new", 1, "admin", "res.users",
				"search", filters };

		try {

			Object[] o = (Object[]) xmlrpc.execute("execute", params);

			// System.out.println("finished");
			// System.out.println(o.length);
			li = new Integer[o.length];

			for (int i = 0; i < o.length; i++) {
				li[i] = (Integer) o[i];
			}

			// System.out.println(obj);

		} catch (Exception e) {
			e.printStackTrace();

		}

		return li;
	}

	public static Integer[] searchCommercantByNom()
			throws MalformedURLException {

		Integer[] li = null;

		XmlRpcClient xmlrpc = new XmlRpcClient();

		XmlRpcClientConfigImpl xmlrpcConfgDb = new XmlRpcClientConfigImpl();
		xmlrpcConfgDb.setEnabledForExceptions(true);
		// xmlrpcConfgDb.setServerURL((new URL("http", "41.224.241.25", 88,
		// "/xmlrpc/object")));

		xmlrpcConfgDb.setServerURL((new URL("http", MainActivity.myActivity
				.getResources().getString(com.wael.targa.R.string.adresse),
				8069, "/xmlrpc/object")));

		xmlrpc.setConfig(xmlrpcConfgDb);

		Object[] l = { "name", "=", MainActivity.commercantNameQR };
		Object[] filters = { l };
		// filters.add(l);

		Object[] params = new Object[] { "new", 1, "admin", "res.users",
				"search", filters };

		try {

			Object[] o = (Object[]) xmlrpc.execute("execute", params);

			// System.out.println("finished");
			// System.out.println(o.length);
			li = new Integer[o.length];

			for (int i = 0; i < o.length; i++) {
				li[i] = (Integer) o[i];
			}

			// System.out.println(obj);

		} catch (Exception e) {
			e.printStackTrace();

		}

		return li;
	}

	public static Integer[] searchCardByNom() throws MalformedURLException {

		Integer[] li = null;

		XmlRpcClient xmlrpc = new XmlRpcClient();

		XmlRpcClientConfigImpl xmlrpcConfgDb = new XmlRpcClientConfigImpl();
		xmlrpcConfgDb.setEnabledForExceptions(true);
		// xmlrpcConfgDb.setServerURL((new URL("http", "41.224.241.25", 88,
		// "/xmlrpc/object")));

		xmlrpcConfgDb.setServerURL((new URL("http", MainActivity.myActivity
				.getResources().getString(com.wael.targa.R.string.adresse),
				8069, "/xmlrpc/object")));

		xmlrpc.setConfig(xmlrpcConfgDb);

		Object[] l = { "x_name", "=",
				"Card_" + MainActivity.clientNameQR + "_" + MainActivity.commercantNameQR };
		Object[] filters = { l };
		// filters.add(l);

		Object[] params = new Object[] { "new", 1, "admin", "assoc.fid",
				"search", filters };

		try {

			Object[] o = (Object[]) xmlrpc.execute("execute", params);

			// System.out.println("finished");
			// System.out.println(o.length);
			li = new Integer[o.length];

			for (int i = 0; i < o.length; i++) {
				li[i] = (Integer) o[i];
			}

			// System.out.println(obj);

		} catch (Exception e) {
			e.printStackTrace();

		}

		return li;
	}

	public static void updateCard() throws MalformedURLException {

		// Integer[] writeIds = new Integer[] { idDisabledUser };
		Map writeValues = new HashMap<String, Object>();
		
		//
		 writeValues.put("x_point_client",
		 Integer.parseInt(MainActivity.nbrPointsArticleQR)
		 + Integer.parseInt(MainActivity.nbrPointsCardQR));

		XmlRpcClient client = new XmlRpcClient();
		XmlRpcClientConfig executionConfig = getExecutionConfig();

		client.setConfig(executionConfig);
		Object[] params = new Object[] { "new", 1, "admin", "assoc.fid",
				"write",69, writeValues, null };
		Object result;
		try {
			result = client.execute("execute", params);
			if (result instanceof Boolean) {
				Log.w("write", (Boolean) result + "");
			}

		} catch (XmlRpcException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// searchUserDisable();

	}

	@SuppressWarnings("unused")
	private static XmlRpcClientConfig getExecutionConfig()
			throws MalformedURLException {
		XmlRpcClientConfigImpl xmlRpcConfigLogin = new XmlRpcClientConfigImpl();
		xmlRpcConfigLogin.setEnabledForExtensions(true);
		// URL loginURL = new URL("http", "41.224.241.25", 88,
		// "/xmlrpc/object");
		URL loginURL = new URL("http", MainActivity.myActivity.getResources()
				.getString(com.wael.targa.R.string.adresse), 8069,
				"/xmlrpc/object");

		xmlRpcConfigLogin.setServerURL(loginURL);
		return xmlRpcConfigLogin;
	}

	public static class UpdateDataAsync extends AsyncTask<Void, Void, Void> {

		@Override
		protected void onPreExecute() {
			super.onPreExecute();
			Log.w("testtest",MainActivity.nbrPointsCardQR + "");
		}

		@Override
		protected Void doInBackground(Void... params1) {
			// Create an array

			try {
				updateCard();
				Log.w("www", "update");
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}

		@Override
		protected void onPostExecute(Void args) {

		}
	}
}