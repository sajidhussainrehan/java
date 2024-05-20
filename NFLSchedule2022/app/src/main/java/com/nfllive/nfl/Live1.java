package com.nfllive.nfl;

import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;

import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.Color;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;

import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;
import com.applovin.sdk.AppLovinSdk;
import com.applovin.sdk.AppLovinSdkConfiguration;
import com.google.firebase.analytics.FirebaseAnalytics;


public class Live1 extends AppCompatActivity implements MaxAdListener {
    WebView webView;
    RelativeLayout relativeLayout;
    Button button1;
    ProgressDialog progressDialog;
    private MaxInterstitialAd interstitialAd;
    FirebaseAnalytics analytics;
    SwipeRefreshLayout swipeRefreshLayout;
    private String webUrl = "https://www.google.com/search?q=NFL+2022&rlz=1C1YTUH_enPK1007PK1007&sxsrf=ALiCzsbK4dX731S6dcSZMKUWpIMa6QZ-IA%3A1662035931922&ei=26cQY7f5N8W9xc8Pi6uioAI&ved=0ahUKEwj30s2qzvP5AhXFXvEDHYuVCCQQ4dUDCA4&uact=5&oq=NFL+2022&gs_lcp=Cgdnd3Mtd2l6EAMyCQgjECcQRhD9ATIECCMQJzIECCMQJzIECAAQQzIFCAAQgAQyBAgAEEMyBAgAEEMyBQgAEIAEMgUIABCABDIECAAQQzoHCAAQRxCwAzoHCAAQsAMQQzoMCC4QyAMQsAMQQxgBOgsILhCxAxCDARCRAjoFCAAQkQI6CAguELEDEIMBOggIABCxAxCDAToRCC4QgAQQsQMQgwEQxwEQ0QM6CAguEIAEENQCOgsIABCABBCxAxCDAToNCC4QsQMQgwEQ1AIQQzoHCAAQsQMQQzoOCC4QsQMQgwEQ1AIQkQI6CAgAEIAEELEDSgQIQRgASgQIRhgAULMXWLMmYLQraANwAXgAgAGWBIgB5R2SAQU0LTYuMpgBAKABAcgBC7gBA8ABAdoBBAgBGAg&sclient=gws-wiz#sie=lg;/g/11rktxc7nd;6;/m/059yj;st;fp;1;;;";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live1);
        getSupportActionBar().setTitle("Standings");

        AppLovinSdk.getInstance( Live1.this ).setMediationProvider( "max" );
        AppLovinSdk.initializeSdk( Live1.this, new AppLovinSdk.SdkInitializationListener() {
            @Override
            public void onSdkInitialized(final AppLovinSdkConfiguration configuration)
            {
                loadads();
            }
        } );

        analytics = FirebaseAnalytics.getInstance(this);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        webView=(WebView)findViewById(R.id.liveAuction);
        webView.loadUrl(webUrl);
        button1=(Button)findViewById(R.id.btnnoconnection);
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Loading PLZ Wait...");
        relativeLayout=(RelativeLayout)findViewById(R.id.relativelayout);
        swipeRefreshLayout = (SwipeRefreshLayout) findViewById(R.id.swiperefresh);
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


                progressDialog.show();

                if (newProgress==100){
                    progressDialog.dismiss();
                }
                super.onProgressChanged(view, newProgress);
            }
        });

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                checkconnection();
            }
        });
    }

    private void loadads() {
        interstitialAd = new MaxInterstitialAd( "7fed54904167e4a4", this );
        interstitialAd.setListener( this );

        // Load the first ad
        interstitialAd.loadAd();



        if ( interstitialAd.isReady() )
        {
            interstitialAd.showAd();
        }

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
            webView.loadUrl(webUrl);
            webView.setVisibility(View.VISIBLE);
            relativeLayout.setVisibility(View.GONE);
        }
        else if (mobileNetwork.isConnected()){
            webView.loadUrl(webUrl);
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
    public void onAdLoaded(MaxAd ad) {

    }

    @Override
    public void onAdDisplayed(MaxAd ad) {

    }

    @Override
    public void onAdHidden(MaxAd ad) {

    }

    @Override
    public void onAdClicked(MaxAd ad) {

    }

    @Override
    public void onAdLoadFailed(String adUnitId, MaxError error) {

    }

    @Override
    public void onAdDisplayFailed(MaxAd ad, MaxError error) {

    }
}