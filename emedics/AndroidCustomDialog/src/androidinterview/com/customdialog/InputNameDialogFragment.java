package androidinterview.com.customdialog;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.EditText;

public class InputNameDialogFragment extends DialogFragment {
	EditText txtname;
	Button btnDone;
	static String DialogboxTitle;
	
	public interface InputNameDialogListener {
		void onFinishInputDialog(String inputText);
		}
	
	//---empty constructor required
	public InputNameDialogFragment() {
		
		}
	//---set the title of the dialog window
	public void setDialogTitle(String title) {
	DialogboxTitle = title;
	}
	
	public View onCreateView(LayoutInflater inflater,ViewGroup container,Bundle saveInstanceState){
		
		View view = inflater.inflate(
				R.layout.input_name_dialogfragment, container);
				
				//---get the EditText and Button views
				txtname = (EditText) view.findViewById(R.id.txtName);
				btnDone = (Button) view.findViewById(R.id.btnDone);
				
				//---event handler for the button
				btnDone.setOnClickListener(new View.OnClickListener()
				{
					public void onClick(View view) {
					
						//---gets the calling activity
						InputNameDialogListener activity = (InputNameDialogListener) getActivity();
						activity.onFinishInputDialog(txtname.getText().toString());
				
						//---dismiss the alert
						dismiss();
					}
				});
				
				//---show the keyboard automatically
				txtname.requestFocus();
				getDialog().getWindow().setSoftInputMode(
				LayoutParams.SOFT_INPUT_STATE_VISIBLE);
				
				//---set the title for the dialog
				getDialog().setTitle(DialogboxTitle);
		
		return view;	
	}
}
