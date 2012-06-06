package com.Yjlx;

import com.DirectPy.DirectPy;
import com.DirectPy.R;
import com.Smxx.Smxx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class Yjlx extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yjlx);
	}
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
        Intent intent = new Intent();
        intent.setClass(Yjlx.this, DirectPy.class);
        startActivity(intent);
        Yjlx.this.finish();
		super.onBackPressed();
	}
}