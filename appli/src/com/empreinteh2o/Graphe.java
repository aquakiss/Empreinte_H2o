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

public class Graphe extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_graphe);
		
		
		Button changeButton = (Button) findViewById(R.id.button1);
        changeButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), MainActivity.class);
				startActivity(changeActivity);
				finish();
			}
		});
        
        Button changeButton2 = (Button) findViewById(R.id.button6);
        changeButton2.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), Conseils2.class);
				startActivity(changeActivity);
				finish();
			}
		});
		
	////////////////////////Menu de selection rapide /////////////////////
	Button menualim = (Button) findViewById(R.id.btalim);
	menualim.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
		Intent changealim = new Intent(getApplicationContext(), Quest_alimentation.class);
		startActivity(changealim);
		finish();
		}
	});
	Button menueau = (Button) findViewById(R.id.bteau);
	menueau.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
		Intent changeau = new Intent(getApplicationContext(), Quest_eau_domicile.class);
		startActivity(changeau);
		finish();
		}
	});
	Button menuequip = (Button) findViewById(R.id.btequip);
	menuequip.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
		Intent changequip = new Intent(getApplicationContext(), Quest_equipement.class);
		startActivity(changequip);
		finish();
		}	
	});
	Button menutext = (Button) findViewById(R.id.bttext);
	menutext.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
		Intent changetext = new Intent(getApplicationContext(), Quest_textile.class);
		startActivity(changetext);
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
				finish();
            return true;
	  	        case R.id.action_settings_apropos:
	  	        	Toast.makeText(this, "Application réalisée par Cazaubon Baptiste, Estival Nicolas et Menard Romain", Toast.LENGTH_SHORT).show();
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
