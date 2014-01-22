package com.empreinteh2o;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Quest_textile extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quest_textile);
		
        Button changeButton = (Button) findViewById(R.id.textil_suivant_bt);
        changeButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), Graphe.class);
				startActivity(changeActivity);
			}
		});
        
        Button changeButton2 = (Button) findViewById(R.id.textil_precedent_bt);
        changeButton2.setOnClickListener(new OnClickListener() {
    		@Override
    		public void onClick(View arg0) {
    			Intent changeActivity = new Intent(getApplicationContext(), Quest_equipement.class);
    			startActivity(changeActivity);
    		}
    	});
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.quest_textile, menu);
		return true;
	}

}
