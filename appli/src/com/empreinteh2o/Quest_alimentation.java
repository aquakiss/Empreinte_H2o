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
			}
		});
	
    Button changeButton2 = (Button) findViewById(R.id.alim_precedent_bt);
    changeButton2.setOnClickListener(new OnClickListener() {
		@Override
		public void onClick(View arg0) {
			Intent changeActivity = new Intent(getApplicationContext(), MainActivity.class);
			startActivity(changeActivity);
		}
	});
   
//////////////ListeView layout Alimentation ////////////////////////////////////////////
    
  //Récupération de la listview créée dans le fichier main.xml
    maListViewPersoAlim = (ListView) findViewById(R.id.LV_q_alimentation);

    //Création de la ArrayList qui nous permettra de remplire la listView
    ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

    //On déclare la HashMap qui contiendra les informations pour un item
    HashMap<String, String> map;

    //Création d'une HashMap pour insérer les informations du premier item de notre listView
    map = new HashMap<String, String>();
    //on insère un élément titre que l'on récupérera dans le textView titre créé dans le fichier affichageitem.xml
    map.put("titre", "Word");
    //on insère un élément description que l'on récupérera dans le textView description créé dans le fichier affichageitem.xml
    map.put("description", "Editeur de texte");
    //enfin on ajoute cette hashMap dans la arrayList
    listItem.add(map);

    //On refait la manip plusieurs fois avec des données différentes pour former les items de notre ListView

    map = new HashMap<String, String>();
    map.put("titre", "Excel");
    map.put("description", "Tableur");
    listItem.add(map);

    map = new HashMap<String, String>();
    map.put("titre", "Power Point");
    map.put("description", "Logiciel de présentation");
    listItem.add(map);

    map = new HashMap<String, String>();
    map.put("titre", "Outlook");
    map.put("description", "Client de courrier électronique");
    listItem.add(map);

    //Création d'un SimpleAdapter qui se chargera de mettre les items présent dans notre list (listItem) dans la vue affichageitem
    SimpleAdapter mSchedule = new SimpleAdapter (this.getBaseContext(), listItem, R.layout.activity_alim_lv_item,
           new String[] {"titre", "description"}, new int[] {R.id.titre, R.id.description});

    //On attribut à notre listView l'adapter que l'on vient de créer
    maListViewPersoAlim.setAdapter(mSchedule);
    
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
	  	        	Toast.makeText(this, "Hello à propos!", Toast.LENGTH_SHORT).show();
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
