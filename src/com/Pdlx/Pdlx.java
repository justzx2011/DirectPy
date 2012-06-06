package com.Pdlx;

import com.DirectPy.DirectPy;
import com.DirectPy.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Environment;
import android.webkit.WebSettings.PluginState;
import android.webkit.WebView;

public class Pdlx extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdlx);
        WebView wv = (WebView)findViewById(R.id.webViewPdlx);
//        String url ="file:///mnt/sdcard/video/b1.swf";
        //String url = "file://" + Environment.getExternalStorageDirectory().getPath() + "/" + "b1.swf";
        //System.out.println(url);
        wv.getSettings().setPluginsEnabled(true);
        wv.getSettings().setPluginState(PluginState.ON);
        wv.getSettings().setAllowFileAccess(true);
        wv.getSettings().setJavaScriptEnabled(true);
        //wv.loadUrl("http://www.5dhz.com/mh/home_mh.html");
        //wv.loadUrl("http://www.5dhz.com/mh/home_mh.html");
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
        Intent intent = new Intent();
        intent.setClass(Pdlx.this, DirectPy.class);
        startActivity(intent);
        Pdlx.this.finish();
		super.onBackPressed();
	}
}