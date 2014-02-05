package com.empreinteh2o;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class Conseils2 extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_conseils2);
	}

		
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.conseils2, menu);
		return true;
	}

}
