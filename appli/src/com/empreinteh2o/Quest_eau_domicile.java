package com.empreinteh2o;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class Quest_eau_domicile extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quest_eau_domicile);
		
/////////////////////////// Change Activity ///////////////////////////////////////////
        Button changeButton = (Button) findViewById(R.id.eau_suivant_bt);
        changeButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), Quest_equipement.class);
				startActivity(changeActivity);
				finish();
			}
		});
        
        Button changeButton2 = (Button) findViewById(R.id.eau_precedent_bt);
        changeButton2.setOnClickListener(new OnClickListener() {
    		@Override
    		public void onClick(View arg0) {
    			Intent changeActivity = new Intent(getApplicationContext(), Quest_textile.class);
    			startActivity(changeActivity);
    			finish();
    		}
    	});
        
	///////////////////////////////////// Spinner 11spinner////////////////////////////////////////////////////
	Spinner spinneaui1 = (Spinner) findViewById(R.id.spinrob1);
	ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
	R.array.eau_robi1_array, android.R.layout.simple_spinner_item);
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinneaui1.setAdapter(adapter);
	
	Spinner spinneaui2 = (Spinner) findViewById(R.id.spindouch1);
	ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
	R.array.eau_robi1_array, android.R.layout.simple_spinner_item);
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinneaui2.setAdapter(adapter2);
	
	Spinner spinneaui3 = (Spinner) findViewById(R.id.spinwc1);
	ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
	R.array.eau_robi2_array, android.R.layout.simple_spinner_item);
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinneaui3.setAdapter(adapter3);
	
	Spinner spinneaui4 = (Spinner) findViewById(R.id.spinw2);
	ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
	R.array.eau_robi3_array, android.R.layout.simple_spinner_item);
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinneaui4.setAdapter(adapter4);
	
	Spinner spinneaui5 = (Spinner) findViewById(R.id.spinl1);
	ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
	R.array.eau_robi4_array, android.R.layout.simple_spinner_item);
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinneaui5.setAdapter(adapter5);
	
	Spinner spinneaui6 = (Spinner) findViewById(R.id.spinl2);
	ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,
	R.array.eau_robi5_array, android.R.layout.simple_spinner_item);
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinneaui6.setAdapter(adapter6);
	
	Spinner spinneaui7 = (Spinner) findViewById(R.id.spinless1);
	ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this,
	R.array.eau_robi6_array, android.R.layout.simple_spinner_item);
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinneaui7.setAdapter(adapter7);
	
	Spinner spinneaui8 = (Spinner) findViewById(R.id.spinless2);
	ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this,
	R.array.eau_robi7_array, android.R.layout.simple_spinner_item);
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinneaui8.setAdapter(adapter8);
	
	Spinner spinneaui9 = (Spinner) findViewById(R.id.spinless3);
	ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(this,
	R.array.eau_robi4_array, android.R.layout.simple_spinner_item);
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinneaui9.setAdapter(adapter9);
	
	Spinner spinneaui10 = (Spinner) findViewById(R.id.spinvais1);
	ArrayAdapter<CharSequence> adapter10 = ArrayAdapter.createFromResource(this,
	R.array.eau_robi8_array, android.R.layout.simple_spinner_item);
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinneaui10.setAdapter(adapter10);
	
	Spinner spinneaui11 = (Spinner) findViewById(R.id.spinvais2);
	ArrayAdapter<CharSequence> adapter11 = ArrayAdapter.createFromResource(this,
	R.array.eau_robi9_array, android.R.layout.simple_spinner_item);
	adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
	spinneaui11.setAdapter(adapter11);
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
	  	        	Toast.makeText(this, "Application réalisée par Cazaubon Baptiste, Estival Nicolas et Menard Romain", Toast.LENGTH_LONG).show();
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
