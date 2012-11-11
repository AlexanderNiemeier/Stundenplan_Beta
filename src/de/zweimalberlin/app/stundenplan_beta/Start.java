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

	public void onClick_btn_kurs_detail(View v) {
		Log.i("Content ", " btn_kurs_detail ");
		setContentView(R.layout.activity_kurs_detail);
		EditText tv = (EditText) findViewById(R.id.g3_output_txt_Kurs);
		tv.setText(kurs_name);
	}

	public void onClick_btn_stundenplan(View v) {
		Log.i("Content ", " btn_kurs_detail ");
		setContentView(R.layout.layout_stundenplan_woche);
	}

}
