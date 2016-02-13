package com.developermanish.cprogrammer;

import android.content.Intent;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.startapp.android.publish.StartAppSDK;
import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Loop extends ActionBarActivity {
    private InterstitialAd mInterstitialAd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        StartAppSDK.init(this, "104583501", "204414324", true);
        setContentView(R.layout.activity_loop);

        ActionBar ab =getSupportActionBar();
        ab.setTitle("Looping");
        ab.setSubtitle("Powered by DreamGoogle");

        mInterstitialAd = new InterstitialAd(this);
        mInterstitialAd.setAdUnitId(getString(R.string.InterstitialAdUnitId));
        requestNewInterstitial();

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);
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
                    Intent intent=new Intent(getApplicationContext(), loop01.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop01.class);
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
                    Intent intent=new Intent(getApplicationContext(), loop02.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop02.class);
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
                    Intent intent=new Intent(getApplicationContext(), loop03.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop03.class);
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
                    Intent intent=new Intent(getApplicationContext(), loop04.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop04.class);
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
                    Intent intent=new Intent(getApplicationContext(), loop05.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop05.class);
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
                    Intent intent=new Intent(getApplicationContext(), loop06.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop06.class);
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
                    Intent intent=new Intent(getApplicationContext(), loop07.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop07.class);
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
                    Intent intent=new Intent(getApplicationContext(), loop08.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop08.class);
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
                    Intent intent=new Intent(getApplicationContext(), loop09.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop09.class);
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
                    Intent intent=new Intent(getApplicationContext(), loop10.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop10.class);
            startActivity(intent);
        }
    }
    public void Click11(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop11.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop11.class);
            startActivity(intent);
        }
    }
    public void Click12(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop12.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop12.class);
            startActivity(intent);
        }
    }
    public void Click13(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop13.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop13.class);
            startActivity(intent);
        }
    }
    public void Click14(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop14.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop14.class);
            startActivity(intent);
        }
    }
    public void Click15(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop15.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop15.class);
            startActivity(intent);
        }
    }
    public void Click16(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop16.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop16.class);
            startActivity(intent);
        }
    }
    public void Click17(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop17.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop17.class);
            startActivity(intent);
        }
    }
    public void Click18(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop18.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop18.class);
            startActivity(intent);
        }
    }
    public void Click19(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop19.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop19.class);
            startActivity(intent);
        }
    }
    public void Click20(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop20.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop20.class);
            startActivity(intent);
        }
    }
    public void Click21(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop21.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop21.class);
            startActivity(intent);
        }
    }
    public void Click22(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop22.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop22.class);
            startActivity(intent);
        }
    }
    public void Click23(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop23.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop23.class);
            startActivity(intent);
        }
    }
    public void Click24(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop24.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop24.class);
            startActivity(intent);
        }
    }
    public void Click25(View view)
    {
        if (mInterstitialAd.isLoaded()) {
            mInterstitialAd.show();
            mInterstitialAd.setAdListener(new AdListener() {
                @Override
                public void onAdClosed() {
                    requestNewInterstitial();
                    Intent intent=new Intent(getApplicationContext(), loop25.class);
                    startActivity(intent);
                }
            });
        } else {
            Intent intent=new Intent(getApplicationContext(), loop25.class);
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
