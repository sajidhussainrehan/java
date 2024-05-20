package com.rehansoft.nfllive;
import androidx.appcompat.app.AppCompatActivity;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import android.app.ProgressDialog;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Bundle;
import android.view.View;
import android.view.ViewTreeObserver;
import android.webkit.WebChromeClient;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.RelativeLayout;
public class NflShop extends AppCompatActivity {
    WebView webView;
    ProgressDialog progressDialog;
    RelativeLayout relativeLayout;
    Button button1;
    private String webUrl = "https://kickcric.com/nfl-shop";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nfl_shop);
        getSupportActionBar().setTitle("NFL Shop");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        webView=(WebView)findViewById(R.id.liveAuction);
        progressDialog=new ProgressDialog(this);
        progressDialog.setMessage("Loading Please Wait...");
        webView.loadUrl(webUrl);
        button1=(Button)findViewById(R.id.btnnoconnection);
        relativeLayout=(RelativeLayout)findViewById(R.id.relativelayout);
        checkconnection();
        webView.getSettings().setJavaScriptEnabled(true);
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

