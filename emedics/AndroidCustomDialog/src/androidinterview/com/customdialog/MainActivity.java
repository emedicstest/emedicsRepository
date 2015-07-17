package androidinterview.com.customdialog;

import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.FragmentManager;
import android.view.View;
import android.widget.Toast;
import androidinterview.com.customdialog.InputNameDialogFragment.InputNameDialogListener;
import androidinterview.com.customdialog.YesNoDialogFragment.YesNoDialogListener;

public class MainActivity extends FragmentActivity implements YesNoDialogListener, InputNameDialogListener {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
	}
	
	//-- InputName Dialog box
	public void btnShowDialog(View view) {
		showInputNameDialog();
	}
	
	private void showInputNameDialog() {
		FragmentManager fragmentManager = getSupportFragmentManager();
		InputNameDialogFragment inputNameDialog = new InputNameDialogFragment();
		inputNameDialog.setCancelable(false);
		inputNameDialog.setDialogTitle("Enter Name");
		inputNameDialog.show(fragmentManager, "Input Dialog");
	}
	
	@Override
	public void onFinishInputDialog(String inputText) {
		// -- Finish dialog box show msg
		Toast.makeText(this, "Input Name to dialog: " + inputText,
				Toast.LENGTH_SHORT).show();
	}
	
	//-- YES-No Dialog box
	public void btnShowYesNoDialog(View view) {
		showYesNoDialog();
	}
	
	private void showYesNoDialog() {
		FragmentManager fragmentManager = getSupportFragmentManager();
		YesNoDialogFragment yesnoDialog = new YesNoDialogFragment();
		yesnoDialog.setCancelable(false);
		yesnoDialog.setDialogTitle("Select One");
		yesnoDialog.show(fragmentManager, "Yes/No Dialog");
	}
	@Override
	public void onFinishYesNoDialog(boolean state) {
		// -- Finish dialog box show msg
		Toast.makeText(this, "Which Option Selected: " + state,
				Toast.LENGTH_SHORT).show();
	}
	
}
