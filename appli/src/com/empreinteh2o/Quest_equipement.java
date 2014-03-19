package com.empreinteh2o;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class Quest_equipement extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quest_equipement);
		
        Button changeButton = (Button) findViewById(R.id.equipement_suivant_bt);
        changeButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), Graphe.class);
				startActivity(changeActivity);
				finish();
			}
		});
        
        Button changeButton2 = (Button) findViewById(R.id.equipement_precedent_bt);
        changeButton2.setOnClickListener(new OnClickListener() {
    		@Override
    		public void onClick(View arg0) {
    			Intent changeActivity = new Intent(getApplicationContext(), Quest_eau_domicile.class);
    			startActivity(changeActivity);
    			finish();
    		}
    	});
	}

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
      MenuInflater inflater = getMenuInflater();
      inflater.inflate(R.menu.main, menu);    
    return true;
    }


	@Override
	public boolean onMenuItemSelected(int featureId, MenuItem item) {
	    switch (item.getItemId()) {
		case R.id.action_settings_accueil:
			Toast.makeText(this, "redirection en cours", Toast.LENGTH_SHORT).show();
				Intent changeActivity = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(changeActivity);
            return true;
	  	        case R.id.action_settings_apropos:
	  	        	Toast.makeText(this, "Hello a propos!", Toast.LENGTH_SHORT).show();
	   	            return true;
		    	case R.id.action_settings_quit:
		    		Toast.makeText(this, "Merci de ta visite", Toast.LENGTH_SHORT).show();
		    		finish();
		                return true;
	           default:
	 	            return super.onOptionsItemSelected(item);
	  	    }
	}

}
