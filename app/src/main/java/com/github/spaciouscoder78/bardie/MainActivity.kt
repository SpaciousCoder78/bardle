package com.github.spaciouscoder78.bardie

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.webkit.WebView
import android.webkit.WebViewClient

class MainActivity : AppCompatActivity(){
    //creating a webview object
    private lateinit var webView:WebView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        //looking for the webview id from android main
        webView = findViewById(R.id.webview)
        //transferring the control to webviewclient
        webView.webViewClient = WebViewClient()
        //loading the url
        webView.loadUrl("https://bard.google.com/chat")
        //enabling javascript so it actually works
        webView.settings.javaScriptEnabled=true
        //adding zoom support
        webView.settings.setSupportZoom(true)

    }
    override fun onBackPressed(){
        //allowing user to go back
        if(webView.canGoBack())
            webView.goBack()
        else
            super.onBackPressed()
    }
}