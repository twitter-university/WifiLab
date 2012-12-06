package com.marakana.android.wifilab;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

public class MainActivity extends Activity {
	TextView output;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		output = (TextView)findViewById(R.id.output);
		
		// Print the results
		listConfiguredNetworks();
	}

	public void listConfiguredNetworks() {
		// TODO Hint: use WifiManager's getConfiguredNetworks().
	}
	
	public void listScannedNetworks() {
		// TODO Hint: use WifiManager's getScanResults() here.
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if( item.getItemId() == R.id.item_scan ) {
			// TODO Hint: use WifiManager to start scanning
			return true;
		} else {
			return false;
		}
	}
	
	// TODO Hint: you need Broadcast Receiver to get the scan results
	// then call listScannedNetworks() to print it.

}
