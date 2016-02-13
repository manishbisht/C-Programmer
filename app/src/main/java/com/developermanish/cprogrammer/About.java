package com.developermanish.cprogrammer;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

import com.startapp.android.publish.StartAppAd;
import com.startapp.android.publish.StartAppSDK;

public class About extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        ActionBar ab =getSupportActionBar();
        ab.setTitle("About");
        ab.setSubtitle("Powered by DreamGoogle");

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_about, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.home) {
            Intent intent=new Intent(getApplicationContext(), MainActivity.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.feedback) {
            Intent intent=new Intent(getApplicationContext(), Feedback.class);
            startActivity(intent);
            return true;
        }
        if (id == R.id.share) {
            Intent shareIntent = new Intent(Intent.ACTION_SEND);
            shareIntent.setType("text/plain");
            shareIntent.putExtra(Intent.EXTRA_TEXT, "I have just Discovered a Woundeful Application for C Programming : C Pogrammer\n" +
                    "Download it from Amazon App Store : http://goo.gl/zjbKpZ\n" +
                    "Download it from Google Drive : http://goo.gl/n2OmRH\n");
            startActivity(Intent.createChooser(shareIntent, "Share Application..."));
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}
