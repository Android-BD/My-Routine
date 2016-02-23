package com.Rahat.myroutine;

import android.app.Activity;
import android.os.Bundle;
import android.text.util.Linkify;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;

public class AboutActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_about);
		
		EditText editText=(EditText) findViewById(R.id.editTextForAbout);
		editText.setText("MyRoutine is a simple app that shows class routine in classical style. "
				+ "\nSpecially designed for the student of BUET."
				+ "\n\nThe source code of this app is open for all and can be found at : https://github.com/frrahat/My-Routine "
				+ "\n\nFor feedback or bug fixing you may contact : fr.rahat@gmail.com"
				+ "\nThank you for using this app.");
		Linkify.addLinks(editText, Linkify.ALL);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.about, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		/*// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}*/
		return super.onOptionsItemSelected(item);
	}
}
