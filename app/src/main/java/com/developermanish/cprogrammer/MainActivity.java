package com.developermanish.cprogrammer;


import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.startapp.android.publish.StartAppSDK;


public class MainActivity extends ActionBarActivity {
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StartAppSDK.init(this, "104583501", "204414324", true);
        setContentView(R.layout.activity_main);

        ActionBar ab =getSupportActionBar();
        ab.setTitle("C Programmer");
        ab.setSubtitle("Powered by DreamGoogle");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.InterstitialAdUnitId));
        requestNewInterstitial();


    }
    private void requestNewInterstitial() {
        AdRequest adRequest = new AdRequest.Builder()
                .addTestDevice("YOUR_DEVICE_HASH")
                .build();

        mInterstitialAd.loadAd(adRequest);
    }
    public void Click1(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), GettingStarted.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), GettingStarted.class);
            startActivity(intent);
        }
    }
    public void Click2(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), Branching.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), Branching.class);
            startActivity(intent);
        }
    }
    public void Click3(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), Loop.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), Loop.class);
            startActivity(intent);
        }
    }
    public void Click4(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), Array.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), Array.class);
            startActivity(intent);
        }
    }
    public void Click5(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), Strings.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), Strings.class);
            startActivity(intent);
        }
    }
    public void Click6(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), Functions.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), Functions.class);
            startActivity(intent);
        }
    }
    public void Click7(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), Structure.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), Structure.class);
            startActivity(intent);
        }
    }
    public void Click8(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), Pointers.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), Pointers.class);
            startActivity(intent);
        }
    }
    public void Click9(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), file.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), file.class);
            startActivity(intent);
        }
    }
    public void Click10(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), preprocessor.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), preprocessor.class);
            startActivity(intent);
        }
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
        if (id == R.id.feedback) {
            Intent intent=new Intent(getApplicationContext(), Feedback.class);
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
