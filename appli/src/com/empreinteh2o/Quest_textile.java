package com.empreinteh2o;

import java.util.ArrayList;
import java.util.HashMap;
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
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Spinner;
import android.widget.Toast;

public class Quest_textile extends Activity {
	private ListView maListViewPersoTextile; // variable pour ma listview

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_quest_textile);
		
		/////////////////////////// Changement d'activit� //////////////////////////////////
		
        Button changeButton = (Button) findViewById(R.id.textil_suivant_bt);
        changeButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), Quest_eau_domicile.class);
				startActivity(changeActivity);
			}
		});
        
        Button changeButton2 = (Button) findViewById(R.id.textil_precedent_bt);
        changeButton2.setOnClickListener(new OnClickListener() {
    		@Override
    		public void onClick(View arg0) {
    			Intent changeActivity = new Intent(getApplicationContext(), Quest_alimentation.class);
    			startActivity(changeActivity);
    		}
    	});
        
     ////////////// Spinner pour Textile ///////////////////////////////////////////////
        
     Spinner spinner = (Spinner) findViewById(R.id.Spinnertextile);
     // Create an ArrayAdapter using the string array and a default spinner layout
     ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
     R.array.textile_array, android.R.layout.simple_spinner_item);
     // Specify the layout to use when the list of choices appears
     adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
     // Apply the adapter to the spinner
     spinner.setAdapter(adapter);
     
     ////////////// ListeView layout Textile ////////////////////////////////////////////
     
     //R�cup�ration de la listview cr��e dans le fichier main.xml
     maListViewPersoTextile = (ListView) findViewById(R.id.listViewTextil);

     //Cr�ation de la ArrayList qui nous permettra de remplire la listView
     ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

     //On d�clare la HashMap qui contiendra les informations pour un item
     HashMap<String, String> map;

     map = new HashMap<String, String>();
     map.put("titre", "Tshirt");
     listItem.add(map);
     
     map = new HashMap<String, String>();
     map.put("titre", "Haut");
     listItem.add(map);
     
     map = new HashMap<String, String>();
     map.put("titre", "Chemise");
     listItem.add(map);

     map = new HashMap<String, String>();
     map.put("titre", "Manteau");
     listItem.add(map);

     map = new HashMap<String, String>();
     map.put("titre", "Pantalon");
     listItem.add(map);
     
     map = new HashMap<String, String>();
     map.put("titre", "Jupe");
     listItem.add(map);
     
     map = new HashMap<String, String>();
     map.put("titre", "Chaussure");
     listItem.add(map);

     //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
     SimpleAdapter mSchedule = new SimpleAdapter (this.getBaseContext(), listItem, R.layout.activity_textile_lv_item,
            new String[] {"titre"}, new int[] {R.id.titre});

     //On attribut � notre listView l'adapter que l'on vient de cr�er
     maListViewPersoTextile.setAdapter(mSchedule);
     
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
		    		onDestroy();
		                return true;
	           default:
	 	            return super.onOptionsItemSelected(item);
	  	    }
	}

}
