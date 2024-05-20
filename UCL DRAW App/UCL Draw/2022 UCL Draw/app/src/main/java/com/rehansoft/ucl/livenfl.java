package com.rehansoft.ucl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import android.util.Log;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.facebook.ads.Ad;
import com.facebook.ads.AdError;
import com.facebook.ads.AudienceNetworkAds;
import com.facebook.ads.InterstitialAd;
import com.facebook.ads.InterstitialAdListener;


public class livenfl extends AppCompatActivity {
    WebView webView;
    ProgressBar progressBar;
    ProgressDialog progressDialog;
    RelativeLayout relativeLayout;
    Button button1;
    SwipeRefreshLayout swipeRefreshLayout;
    private InterstitialAd interstitialAd;
    private final String TAG = livenfl.class.getSimpleName();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        AudienceNetworkAds.initialize(this);
        setContentView(R.layout.activity_livenfl);
        interstitialAd = new InterstitialAd(this, "504311400926081_504315720925649");
        InterstitialAdListener interstitialAdListener = new InterstitialAdListener() {
            @Override
            public void onInterstitialDisplayed(Ad ad) {
                // Interstitial ad displayed callback
                Log.e(TAG, "Interstitial ad displayed.");
            }

            @Override
            public void onInterstitialDismissed(Ad ad) {
                // Interstitial dismissed callback
                Log.e(TAG, "Interstitial ad dismissed.");
            }

            @Override
            public void onError(Ad ad, AdError adError) {
                // Ad error callback

            }

            @Override
            public void onAdLoaded(Ad ad) {
                // Interstitial ad is loaded and ready to be displayed
                Log.d(TAG, "Interstitial ad is loaded and ready to be displayed!");
                // Show the ad
                interstitialAd.show();
            }

            @Override
            public void onAdClicked(Ad ad) {
                // Ad clicked callback
                Log.d(TAG, "Interstitial ad clicked!");
            }

            @Override
            public void onLoggingImpression(Ad ad) {
                // Ad impression logged callback
                Log.d(TAG, "Interstitial ad impression logged!");
            }
        };
        interstitialAd.loadAd(
                interstitialAd.buildLoadAdConfig()
                        .withAdListener(interstitialAdListener)
                        .build());

        getSupportActionBar().setTitle("LIVE SCORE");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);

        webView=(WebView)findViewById(R.id.liveAuction);
        webView.loadUrl("https://www.google.com/search?q=nfl+2021&sxsrf=ALeKk039einerEq69ex2M2zf4ISZMkLXSQ%3A1627355600051&ei=0Hn_YIfQArij1fAP5PifyAo&oq=nfl+2021&gs_lcp=Cgdnd3Mtd2l6EAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsANKBAhBGABQpagDWOCpA2DgqwNoAXACeACAAe4CiAHwBJIBBTItMS4xmAEAoAEBqgEHZ3dzLXdpesgBCMABAQ&sclient=gws-wiz&ved=0ahUKEwiH-NqDpILyAhW4URUIHWT8B6kQ4dUDCA8&uact=5#sie=lg;/g/11nym9rnk6;6;/m/059yj;mt;fp;1;;");
        webView.setWebViewClient(new WebViewController());
        progressBar=(ProgressBar)findViewById(R.id.progressBar2);
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Loading PLZ Wait...");
// part 1
        button1=(Button)findViewById(R.id.btnnoconnection);
        relativeLayout=(RelativeLayout)findViewById(R.id.relativelayout);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swiperefresh);
        swipeRefreshLayout.setColorSchemeColors(Color.BLUE,Color.YELLOW,Color.GREEN);

        swipeRefreshLayout.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() {
            @Override
            public void onRefresh() {
                webView.reload();
            }
        });
        checkconnection();

        webView.getSettings().setJavaScriptEnabled(true);

        webView.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() {
            @Override
            public void onScrollChanged() {
                if (webView.getScrollY() == 0) {
                    swipeRefreshLayout.setEnabled(true);
                } else {
                    swipeRefreshLayout.setEnabled(false);
                }
            }
        });

        webView.setWebViewClient(new WebViewClient(){

            //
            @Override
            public void onPageFinished(WebView view, String url) {
                swipeRefreshLayout.setRefreshing(false);
                super.onPageFinished(view, url);
            }
            @Override
            public boolean shouldOverrideUrlLoading(WebView view, String url) {
                view.loadUrl(url);
                return true;
            }
        });



        webView.setWebChromeClient(new WebChromeClient() {
            @Override
            public void onProgressChanged(WebView view, int newProgress) {

                progressBar.setVisibility(View.VISIBLE);
                setTitle("Loading....");
                progressDialog.show();
                progressBar.setProgress(newProgress);

                if (newProgress==100){
                    progressBar.setVisibility(View.GONE);
                    setTitle(view.getTitle());
                    progressDialog.dismiss();
                }
                super.onProgressChanged(view, newProgress);
            }
        });

        // part 2

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkconnection();
            }
        });



    }
    @Override
    public void onBackPressed()
    {

        if (webView.canGoBack()) {
            webView.goBack();
        }else
            super.onBackPressed();
    }



    public void checkconnection() {

        ConnectivityManager connectivityManager=(ConnectivityManager)
                this.getSystemService(Context.CONNECTIVITY_SERVICE);

        NetworkInfo wifi = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_WIFI);
        NetworkInfo mobileNetwork = connectivityManager.getNetworkInfo(ConnectivityManager.TYPE_MOBILE);


        if(wifi.isConnected()){
            webView.loadUrl("https://www.google.com/search?q=nfl+2021&sxsrf=ALeKk039einerEq69ex2M2zf4ISZMkLXSQ%3A1627355600051&ei=0Hn_YIfQArij1fAP5PifyAo&oq=nfl+2021&gs_lcp=Cgdnd3Mtd2l6EAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsANKBAhBGABQpagDWOCpA2DgqwNoAXACeACAAe4CiAHwBJIBBTItMS4xmAEAoAEBqgEHZ3dzLXdpesgBCMABAQ&sclient=gws-wiz&ved=0ahUKEwiH-NqDpILyAhW4URUIHWT8B6kQ4dUDCA8&uact=5#sie=lg;/g/11nym9rnk6;6;/m/059yj;mt;fp;1;;");
            webView.setVisibility(View.VISIBLE);
            relativeLayout.setVisibility(View.GONE);


        }
        else if (mobileNetwork.isConnected()){
            webView.loadUrl("https://www.google.com/search?q=nfl+2021&sxsrf=ALeKk039einerEq69ex2M2zf4ISZMkLXSQ%3A1627355600051&ei=0Hn_YIfQArij1fAP5PifyAo&oq=nfl+2021&gs_lcp=Cgdnd3Mtd2l6EAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsAMyBwgAEEcQsANKBAhBGABQpagDWOCpA2DgqwNoAXACeACAAe4CiAHwBJIBBTItMS4xmAEAoAEBqgEHZ3dzLXdpesgBCMABAQ&sclient=gws-wiz&ved=0ahUKEwiH-NqDpILyAhW4URUIHWT8B6kQ4dUDCA8&uact=5#sie=lg;/g/11nym9rnk6;6;/m/059yj;mt;fp;1;;");
            webView.setVisibility(View.VISIBLE);
            relativeLayout.setVisibility(View.GONE);
        }
        else{

            webView.setVisibility(View.GONE);
            relativeLayout.setVisibility(View.VISIBLE);

        }
    }

    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();
        return true;
    }
    @Override
    protected void onDestroy() {
        if (interstitialAd != null) {
            interstitialAd.destroy();
        }
        super.onDestroy();
    }
}

