package com.example.webviewwithviewpager.fragements

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.webkit.WebChromeClient
import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.fragment.app.Fragment
import com.example.webviewwithviewpager.R

class SecondFragment : Fragment() {


    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view: View? = inflater.inflate(R.layout.fragment_second, container, false)
        val webview = view!!.findViewById(R.id.Webview1) as WebView
        val settings = webview.settings
        webview.webChromeClient = WebChromeClient()
        webview.webViewClient = WebViewClient()
        settings.javaScriptEnabled = true
        webview.isScrollContainer = false
        webview.isVerticalScrollBarEnabled = false
        webview.isHorizontalScrollBarEnabled = false
        settings.builtInZoomControls = true
        settings.setSupportZoom(true)
        settings.displayZoomControls = false
        settings.loadWithOverviewMode = true
        settings.useWideViewPort = true
        webview.loadUrl("https://www.google.com/search?q=kotlin")
        return view
    }
}