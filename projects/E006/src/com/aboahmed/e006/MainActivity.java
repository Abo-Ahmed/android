package com.aboahmed.e006;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final Button check = (Button) this.findViewById(R.id.check);
    	final EditText x = (EditText) findViewById(R.id.myname);
    	
        check.setOnClickListener(new  OnClickListener()
        	    {

    		@Override
    		public void onClick(View v) {
    		 	  Toast.makeText(getBaseContext(), x.getText().toString() , Toast.LENGTH_LONG).show();
    			}
        	
        	
        });
    
    }

    protected void onPause()
    {
 	   
 	   super.onPause();
 	   final EditText x = (EditText) findViewById(R.id.myname);
 	   Toast.makeText(getBaseContext(), x.getText() , Toast.LENGTH_LONG).show();
 	  
    }
    
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
    
    
}
