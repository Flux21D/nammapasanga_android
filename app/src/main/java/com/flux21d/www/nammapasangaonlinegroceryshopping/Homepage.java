package com.flux21d.www.nammapasangaonlinegroceryshopping;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.animation.OvershootInterpolator;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
//import android.webkit.WebChromeClient;
//import android.widget.ProgressBar;



import java.net.URI;

public class Homepage extends AppCompatActivity {
    WebView myWebView;
    //private ProgressBar progress;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homepage);
        myWebView = (WebView) findViewById(R.id.webview);
        WebView myWebView = (WebView) findViewById(R.id.webview);
        //myWebView.loadUrl("http://onlineshopping.nammapasanga.com/");
        myWebView.setWebViewClient(new MyBrowser());
       // myWebView.setWebChromeClient(new MyWebViewClient());
        WebSettings webSettings = myWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);




        myWebView.loadUrl("http://onlineshopping.nammapasanga.com/");

    }


    private class MyBrowser extends WebViewClient {

        public boolean shouldOverrideUrlLoading1(WebView view, String url) {
            view.loadUrl(url);
            return true;
        }
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        // Check if the key event was the Back button and if there's history
        if ((keyCode == KeyEvent.KEYCODE_BACK) && myWebView.canGoBack()) {
            myWebView.goBack();
            return true;
        }
        // If it wasn't the Back key or there's no web page history, bubble up to the default
        // system behavior (probably exit the activity)
        return super.onKeyDown(keyCode, event);
    }



}

