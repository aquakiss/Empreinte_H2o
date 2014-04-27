package com.empreinteh2o;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceClose_all_Activity) {
		super.onCreate(savedInstanceClose_all_Activity);
		setContentView(R.layout.activity_main);
		
        Button changeButton = (Button) findViewById(R.id.main_bt_1);
        changeButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View arg0) {
				Intent changeActivity = new Intent(getApplicationContext(), Quest_alimentation.class);
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
	  	        case R.id.action_settings_apropos:
	  	        	Toast.makeText(this, "Application r�alis�e par Cazaubon Baptiste, Estival Nicolas et Menard Romain", Toast.LENGTH_SHORT).show();
	   	            return true;
		    	case R.id.action_settings_quit:
		    		Toast.makeText(this, "Merci de ta visite", Toast.LENGTH_LONG).show();
		    		// com.empreinteh2o.Close_all_Activity.closeAllActivities();
		    		finish();
		                return true;
		                
	           default:
	 	            return super.onOptionsItemSelected(item);
	  	    }
	}
	

}
