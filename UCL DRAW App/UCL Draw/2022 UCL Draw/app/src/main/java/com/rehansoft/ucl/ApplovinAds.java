package com.rehansoft.ucl;

import android.app.Activity;
import android.util.Log;

import com.applovin.mediation.MaxAd;
import com.applovin.mediation.MaxAdListener;
import com.applovin.mediation.MaxError;
import com.applovin.mediation.ads.MaxInterstitialAd;

class ApplovinAds {
    public static MaxInterstitialAd interstitialAd;
    private int retryAttempt;


    public static void createInterstitialAd(Activity act) {
        interstitialAd = new MaxInterstitialAd(act.getString(R.string.applovin_interstitial), act);
        interstitialAd.setListener(new MaxAdListener() {
            @Override
            public void onAdLoaded(MaxAd ad) {
                Log.e("Applovin", "ADS SID LOADED");
            }

            @Override
            public void onAdDisplayed(MaxAd ad) {

            }

            @Override
            public void onAdHidden(MaxAd ad) {
                interstitialAd.loadAd();
                Log.e("Applovin", "ADS SID onAdHidden");
            }

            @Override
            public void onAdClicked(MaxAd ad) {

            }

            @Override
            public void onAdLoadFailed(String adUnitId, MaxError error) {
                Log.e("Applovin", "ADS SID onAdLoadFailed");
            }

            @Override
            public void onAdDisplayFailed(MaxAd ad, MaxError error) {
                Log.e("Applovin", "ADS SID onAdDisplayFailed" + error.getMessage() + " :: " + error.getCode());
            }
        });
        // Load the first ad
        interstitialAd.loadAd();
    }

    public static void showInterstitial() {

        if (interstitialAd.isReady()) {
            interstitialAd.showAd();
        }

    }


}
