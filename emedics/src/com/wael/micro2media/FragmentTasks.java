package com.wael.micro2media;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.wael.micro2media.R.layout;

public class FragmentTasks extends Fragment {

	public FragmentTasks() {
	}

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {

		View rootView = inflater.inflate(layout.fragment_patients, container,
				false);

		return rootView;
	}

}
