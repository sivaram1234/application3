package com.example.kalyan.application;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class ece_tt_Activity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ece_tt_);
         WebView mywebview = (WebView) findViewById(R.id.webView1);
        mywebview.getSettings().setBuiltInZoomControls(true);
        mywebview.loadUrl("https://veravasi.000webhostapp.com/tt/ece_tt.html");


    }

}
