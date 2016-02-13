package com.developermanish.cprogrammer;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.startapp.android.publish.StartAppSDK;

public class Feedback extends ActionBarActivity {

    private WebView webview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StartAppSDK.init(this, "104583501", "204414324", true);
        setContentView(R.layout.activity_feedback);

        ActionBar ab =getSupportActionBar();
        ab.setTitle("Feedback");
        ab.setSubtitle("Powered by DreamGoogle");

        webview = (WebView) findViewById(R.id.webView);
        WebSettings webSettings=webview.getSettings();
        webSettings.setJavaScriptEnabled(true);
        webSettings.setBuiltInZoomControls(true);
        webview.setWebViewClient(new Callback());
        webview.loadUrl("http://goo.gl/forms/LrYovFX6wQ");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

    }

    private class Callback extends WebViewClient{
        public boolean shouldOverrideUrlLoading(WebView view, String url)
        {
            return false;
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_feedback, menu);
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
        if (id == R.id.about) {
            Intent intent=new Intent(getApplicationContext(), About.class);
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
