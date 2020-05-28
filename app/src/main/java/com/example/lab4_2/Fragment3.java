package com.example.lab4_2;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment3 extends Fragment {

    public static Fragment3 newInstance() {
        
        Bundle args = new Bundle();
        
        Fragment3 fragment = new Fragment3();
        fragment.setArguments(args);
        return fragment;
    }

    public Fragment3() {
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_3, container, false);
        WebView webView = (WebView) v.findViewById(R.id.web);
        webView.getSettings().setJavaScriptEnabled(true); // enable javascript
        webView.setWebViewClient(new WebViewClient()); // important to open url in your app
        webView.loadUrl("https://github.com/");
        return v;
    }
}
