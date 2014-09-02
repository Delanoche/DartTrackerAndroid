package com.dipernaa.darttracker;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;

/**
 * 
 * @author Tony DiPerna
 * @see android.support.v7.app.ActionBarActivity
 */
public class GameActivity extends ActionBarActivity {

	/**
	 * @see android.support.v7.app.ActionBarActivity
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_game);
		
		Intent intent = getIntent();
		String first = intent.getStringExtra(MainActivity.FIRST_IDENTIFIER);
		String second = intent.getStringExtra(MainActivity.SECOND_IDENTIFIER);
		TextView tv = (TextView)findViewById(R.id.main_text);
		tv.setText(first + " vs. " + second);
	}

	/**
	 * @see android.support.v7.app.ActionBarActivity
	 */
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		getMenuInflater().inflate(R.menu.game, menu);
		return true;
	}

	/**
	 * @see android.support.v7.app.ActionBarActivity
	 */
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		if(item.getItemId() == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
