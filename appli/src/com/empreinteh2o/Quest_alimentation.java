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
import android.widget.Button;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

public class Quest_alimentation extends Activity {
	private ListView maListViewPersoAlim; // variable pour ma listview

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);		
		setContentView(R.layout.activity_quest_alimentation);
		
/////////////////////////// Changement d'activité //////////////////////////////////
		
        Button changeButton = (Button) findViewById(R.id.alim_suivant_bt);
        changeButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), Quest_textile.class);
				startActivity(changeActivity);
				finish();
			}
		});
	
    Button changeButton2 = (Button) findViewById(R.id.alim_precedent_bt);
    changeButton2.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Intent changeActivity = new Intent(getApplicationContext(), MainActivity.class);
			startActivity(changeActivity);
			finish();
		}
	});
   
    ////////////////////////Menu de selection rapide /////////////////////
    Button menualim = (Button) findViewById(R.id.btalim);
    menualim.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Intent changeActivity = new Intent(getApplicationContext(), Quest_alimentation.class);
			startActivity(changeActivity);
			finish();
		}
	});
    Button menueau = (Button) findViewById(R.id.bteau);
    menueau.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Intent changeActivity = new Intent(getApplicationContext(), Quest_eau_domicile.class);
			startActivity(changeActivity);
			finish();
		}
	});
    Button menuequip = (Button) findViewById(R.id.btequip);
    menuequip.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Intent changeActivity = new Intent(getApplicationContext(), Quest_equipement.class);
			startActivity(changeActivity);
			finish();
		}
	});
    Button menutext = (Button) findViewById(R.id.bttext);
    menutext.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Intent changeActivity = new Intent(getApplicationContext(), Quest_textile.class);
			startActivity(changeActivity);
			finish();
		}
	});
    Button menugra = (Button) findViewById(R.id.btgraph);
	menugra.setOnClickListener(new OnClickListener() {
	@Override
	public void onClick(View arg0) {
	Intent changegra = new Intent(getApplicationContext(), Graphe.class);
	startActivity(changegra);
	finish();
	}
	});
    
//////////////ListeView layout Alimentation ////////////////////////////////////////////
    
  //Récupération de la listview créée dans le fichier main.xml
    /*
     maListViewPersoAlim = (ListView) findViewById(R.id.LV_q_alimentation);

    //Création de la ArrayList qui nous permettra de remplire la listView
    ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

    //On déclare la HashMap qui contiendra les informations pour un item
    HashMap<String, String> map;

    //Création d'une HashMap pour insérer les informations du premier item de notre listView
    map = new HashMap<String, String>();

    map = new HashMap<String, String>();
    map.put("titre", getString(R.string.Aq3c1));
    listItem.add(map);

    map = new HashMap<String, String>();
    map.put("titre", getString(R.string.Aq3c2));
    listItem.add(map);
    
    map = new HashMap<String, String>();
    map.put("titre", getString(R.string.Aq3c3));
    listItem.add(map);
    
    map = new HashMap<String, String>();
    map.put("titre", getString(R.string.Aq3c4));
    listItem.add(map);

    map = new HashMap<String, String>();
    map.put("titre", getString(R.string.Aq3c5));
    listItem.add(map);

    //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
    SimpleAdapter mSchedule = new SimpleAdapter (this.getBaseContext(), listItem, R.layout.activity_alim_lv_item,
    new String[] {"titre"}, new int[] {R.id.titre});

    //On attribut à notre listView l'adapter que l'on vient de créer
    maListViewPersoAlim.setAdapter(mSchedule);
    */
    
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
		    		Toast.makeText(this, "Merci de ta visite", Toast.LENGTH_LONG).show();
		    		finish();
		                return true;
	           default:
	 	            return super.onOptionsItemSelected(item);
	  	    }
	}

}
