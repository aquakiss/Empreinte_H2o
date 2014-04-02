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
	
        /* Spinner */
        
        Spinner spinner1 = (Spinner) findViewById(R.id.spinnerEquipement1);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter1 = ArrayAdapter.createFromResource(this,
        R.array.oui_non, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter1.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner1.setAdapter(adapter1);
        
        Spinner spinner2 = (Spinner) findViewById(R.id.spinnerEquipement2);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter2 = ArrayAdapter.createFromResource(this,
        R.array.oui_non, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter2.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner2.setAdapter(adapter2);
        
        Spinner spinner3 = (Spinner) findViewById(R.id.spinnerEquipement3);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter3 = ArrayAdapter.createFromResource(this,
        R.array.oui_non, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter3.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner3.setAdapter(adapter3);
        
        Spinner spinner4 = (Spinner) findViewById(R.id.spinnerEquipement4);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter4 = ArrayAdapter.createFromResource(this,
        R.array.oui_non, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter4.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner4.setAdapter(adapter4);
        
        Spinner spinner5 = (Spinner) findViewById(R.id.spinnerEquipement5);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter5 = ArrayAdapter.createFromResource(this,
        R.array.oui_non, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter5.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner5.setAdapter(adapter5);
       
        Spinner spinner6 = (Spinner) findViewById(R.id.spinnerEquipement6);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter6 = ArrayAdapter.createFromResource(this,
        R.array.oui_non, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter6.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner6.setAdapter(adapter6);
        
        Spinner spinner7 = (Spinner) findViewById(R.id.spinnerEquipement7);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter7 = ArrayAdapter.createFromResource(this,
        R.array.oui_non, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter7.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner7.setAdapter(adapter7);
       
        Spinner spinner8 = (Spinner) findViewById(R.id.spinnerEquipement8);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter8 = ArrayAdapter.createFromResource(this,
        R.array.oui_non, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter8.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner8.setAdapter(adapter8);
        
        Spinner spinner9 = (Spinner) findViewById(R.id.spinnerEquipement9);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter9 = ArrayAdapter.createFromResource(this,
        R.array.oui_non, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter9.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner9.setAdapter(adapter9);
       
        Spinner spinner10 = (Spinner) findViewById(R.id.spinnerEquipement10);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter10 = ArrayAdapter.createFromResource(this,
        R.array.oui_non, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter10.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinner10.setAdapter(adapter10);
	
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
