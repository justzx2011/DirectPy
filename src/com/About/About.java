package com.About;

import com.DirectPy.DirectPy;
import com.DirectPy.R;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class About extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.pdlx);
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
        Intent intent = new Intent();
        intent.setClass(About.this, DirectPy.class);
        startActivity(intent);
        About.this.finish();
		super.onBackPressed();
	}
}