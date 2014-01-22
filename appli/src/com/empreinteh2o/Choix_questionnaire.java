package com.empreinteh2o;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Choix_questionnaire extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_choix_questionnaire);
	
		Button changeButton = (Button) findViewById(R.id.change_to_alimentation);
        changeButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), Quest_alimentation.class);
				startActivity(changeActivity);
			}
		});
	
        Button changeButton2 = (Button) findViewById(R.id.change_to_eau_domicile);
        changeButton2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), Quest_eau_domicile.class);
				startActivity(changeActivity);
			}
		});
        
        Button changeButton3 = (Button) findViewById(R.id.change_to_equipement);
        changeButton3.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), Quest_equipement.class);
				startActivity(changeActivity);
			}
		});
	
        Button changeButton4 = (Button) findViewById(R.id.change_to_textile);
        changeButton4.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), Quest_textile.class);
				startActivity(changeActivity);
			}
		});
	
	
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.choix_questionnaire, menu);
		return true;
	}

}
