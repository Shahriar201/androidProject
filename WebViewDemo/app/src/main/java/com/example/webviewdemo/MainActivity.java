package com.example.webviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity extends AppCompatActivity {

    private WebView webView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        webView = findViewById(R.id.webViewId);
        WebSettings webSettings =webView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        //all content run in this app
        webView.setWebViewClient(new WebViewClient());
        webView.loadUrl("https://www.mit.edu/");
    }
}