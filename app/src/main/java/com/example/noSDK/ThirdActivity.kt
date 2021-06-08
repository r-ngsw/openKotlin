package com.example.noSDK

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.webkit.HttpAuthHandler
import android.webkit.WebView
import android.webkit.WebViewClient

class ThirdActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_third)

        val myWebView: WebView = findViewById(R.id.webview)
        //ユーザーがクリックしたリンクをWebViewで開く
        myWebView.webViewClient = WebViewClient()
        //JavaScriptの許可
        myWebView.settings.javaScriptEnabled = true
        ///WebViewで開くURL(ベーシック認証がある場合は、http(s)://ユーザーID：パスワード@...)
        myWebView.loadUrl("http://www.yahoo.co.jp/")
    }
    fun onButtonTapped(view: View?){
        finish()
    }
}