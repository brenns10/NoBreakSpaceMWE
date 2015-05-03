package com.stephen_brennan.nobreakspacemwe;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void sendWithNBSP(View view) {
        EditText phoneText =  (EditText) findViewById(R.id.phoneText);
        String phoneNumber = phoneText.getText().toString();
        if (phoneNumber.length() == 10) {
            String modified = "(" + phoneNumber.substring(0, 3) + ")\u00A0" + phoneNumber.substring(3);
            String message = "test text message, please ignore";
            SmsManager.getDefault().sendTextMessage(modified, null, message, null, null);
        }
    }

    public void sendWithoutNBSP(View view) {
        EditText phoneText =  (EditText) findViewById(R.id.phoneText);
        String phoneNumber = phoneText.getText().toString();
        if (phoneNumber.length() == 10) {
            String modified = "(" + phoneNumber.substring(0, 3) + ") " + phoneNumber.substring(3);
            String message = "test text message, please ignore";
            SmsManager.getDefault().sendTextMessage(modified, null, message, null, null);
        }
    }
}
