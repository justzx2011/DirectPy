package com.Yjlx;

import com.DirectPy.DirectPy;
import com.DirectPy.R;
import com.Smxx.Smxx;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Yjlx extends Activity {
	@Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.yjlx);
	
	//@Override
	
	//public void onBackPressed() {
		// TODO Auto-generated method stub
		Button mybutton =(Button)findViewById(R.id.button2);
		mybutton.setOnClickListener(new Button.OnClickListener()
		{
			public void onClick(View v)
			{
				Intent intent = new Intent();
		        intent.setClass(Yjlx.this, DirectPy.class);
		        startActivity(intent);
		        Yjlx.this.finish();
				//super.onBackPressed();	
			}
		});
        
	}
}