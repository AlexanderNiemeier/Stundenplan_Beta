package de.zweimalberlin.app.stundenplan_beta;

import android.os.Bundle;
import android.app.Activity;
import android.content.res.Resources;
import android.util.Log;
import android.view.Menu;
import android.view.View;
import android.view.Window;
import android.widget.EditText;
import android.widget.TextView;

public class Start extends Activity {

	String kurs_name = "Variable";

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.requestWindowFeature(Window.FEATURE_NO_TITLE);
		setContentView(R.layout.activity_start);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.activity_start, menu);
		return true;
	}

	public void onClick_btn_imageview(View v) {
		Log.i("Content ", " imageview_view ");
		setContentView(R.layout.imageview_stundenplan);
	}

	public void onClickExpand(View v) {
		Log.i("Content ", " imageview_control ");
		setContentView(R.layout.activity_start);
	}

}
