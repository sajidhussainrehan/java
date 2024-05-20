package com.eurocup.uefaeuro2021;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.app.ProgressDialog;
import android.content.Context;
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
import com.google.firebase.analytics.FirebaseAnalytics;

import java.util.Map;

public class Live extends AppCompatActivity
{
    WebView webView;
    RelativeLayout relativeLayout;
    Button button1;
    ProgressDialog progressDialog;
    FirebaseAnalytics analytics;
    SwipeRefreshLayout swipeRefreshLayout;
    private String webUrl = "https://www.google.com/search?q=fifa+world+cup+2022+fixtures&rlz=1C1YTUH_enPK1007PK1007&sxsrf=ALiCzsaKjQ_RvbW2XHRJZM_EgRdEr2898A%3A1658491341262&ei=zZHaYte0D4uX9u8P5p-giAI&oq=fifa+world+cup+2022+&gs_lcp=Cgdnd3Mtd2l6EAEYBDIECCMQJzIECCMQJzIECCMQJzIECAAQQzIECAAQQzIECAAQQzIECAAQQzIECAAQQzIHCAAQyQMQQzIECAAQQzoHCCMQsAMQJzoHCAAQRxCwAzoHCAAQsAMQQzoKCAAQ5AIQsAMYAToMCC4QyAMQsAMQQxgCOg8ILhDUAhDIAxCwAxBDGAJKBAhBGABKBAhGGAFQigtYigtg4x9oAXABeACAAfEBiAHxAZIBAzItMZgBAKABAcgBE8ABAdoBBggBEAEYCdoBBggCEAEYCA&sclient=gws-wiz#sie=lg;/m/0fp_8fm;2;/m/030q7;mt;fp;1;;";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_live);
        getSupportActionBar().setTitle("Live Score");


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


}