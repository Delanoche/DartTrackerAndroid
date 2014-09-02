package com.dipernaa.darttracker;

import android.support.v7.app.ActionBarActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

/**
 * Main activity of the app.
 * Select type of game, fill in the player's name and start the game.
 * @author Tony DiPerna
 * @see android.support.v7.app.ActionBarActivity
 */
public class MainActivity extends ActionBarActivity {

	/**
	 * Name used in the intent to identify the first player's name
	 */
	public static final String FIRST_IDENTIFIER = "FIRST";
	
	/**
	 * Name used in the intent to identify the second player's name
	 */
	public static final String SECOND_IDENTIFIER = "SECOND";
	
	/**
	 * EditText containing the first player's name
	 */
	private EditText firstPlayer;
	
	/**
	 * EditText containing the second player's name
	 */
	private EditText secondPlayer;
	
	/**
	 * Button used to submit names and start game
	 */
	private Button submitButton;
	
	/**
	 * @see android.support.v7.app.ActionBarActivity
	 */
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    
        firstPlayer = (EditText)findViewById(R.id.firstPlayerEditText);
        secondPlayer = (EditText)findViewById(R.id.secondPlayerEditText);
        
        submitButton = (Button)findViewById(R.id.submitButton);
        submitButton.setOnClickListener(new OnClickListener() {
			@Override
			public void onClick(View view) {
				Intent intent = new Intent(MainActivity.this, GameActivity.class);
				intent.putExtra(FIRST_IDENTIFIER, firstPlayer.getText().toString());
				intent.putExtra(SECOND_IDENTIFIER, secondPlayer.getText().toString());
				startActivity(intent);
			}
        });
    }

    /**
	 * @see android.support.v7.app.ActionBarActivity
	 */
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.main, menu);
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
