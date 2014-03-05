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
		
/////////////////////////// Changement d'activit� //////////////////////////////////
		
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
    
  //R�cup�ration de la listview cr��e dans le fichier main.xml
    maListViewPersoAlim = (ListView) findViewById(R.id.LV_q_alimentation);

    //Cr�ation de la ArrayList qui nous permettra de remplire la listView
    ArrayList<HashMap<String, String>> listItem = new ArrayList<HashMap<String, String>>();

    //On d�clare la HashMap qui contiendra les informations pour un item
    HashMap<String, String> map;

    //Cr�ation d'une HashMap pour ins�rer les informations du premier item de notre listView
    map = new HashMap<String, String>();
    //on ins�re un �l�ment titre que l'on r�cup�rera dans le textView titre cr�� dans le fichier affichageitem.xml
    map.put("titre", "Word");
    //on ins�re un �l�ment description que l'on r�cup�rera dans le textView description cr�� dans le fichier affichageitem.xml
    map.put("description", "Editeur de texte");
    //enfin on ajoute cette hashMap dans la arrayList
    listItem.add(map);

    //On refait la manip plusieurs fois avec des donn�es diff�rentes pour former les items de notre ListView

    map = new HashMap<String, String>();
    map.put("titre", "Excel");
    map.put("description", "Tableur");
    listItem.add(map);

    map = new HashMap<String, String>();
    map.put("titre", "Power Point");
    map.put("description", "Logiciel de pr�sentation");
    listItem.add(map);

    map = new HashMap<String, String>();
    map.put("titre", "Outlook");
    map.put("description", "Client de courrier �lectronique");
    listItem.add(map);

    //Cr�ation d'un SimpleAdapter qui se chargera de mettre les items pr�sent dans notre list (listItem) dans la vue affichageitem
    SimpleAdapter mSchedule = new SimpleAdapter (this.getBaseContext(), listItem, R.layout.activity_alim_lv_item,
           new String[] {"titre", "description"}, new int[] {R.id.titre, R.id.description});

    //On attribut � notre listView l'adapter que l'on vient de cr�er
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
	  	        	Toast.makeText(this, "Hello � propos!", Toast.LENGTH_SHORT).show();
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
