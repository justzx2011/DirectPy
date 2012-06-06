package com.DirectPy;

import javax.security.auth.PrivateCredentialPermission;

import android.app.Activity;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;
import com.Smxx.Smxx;
import com.Ymxx.Ymxx;
import com.Pdlx.Pdlx;
import com.Yjlx.Yjlx;
import com.About.About;
public class DirectPy extends Activity {
	
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
    
        /*相应的按钮事件*/
//        Button Smxx =(Button) findViewById(R.id.smxxbtn);
//        Button Ymxx =(Button) findViewById(R.id.ymxxbtn);
//        Button Pdlx =(Button) findViewById(R.id.pdlxbtn);
//        Button Yjlx =(Button) findViewById(R.id.yjlxbtn);
//        Button About =(Button) findViewById(R.id.about);
//        Smxx.setOnClickListener(new Button.OnClickListener()
//        {
//        	public void onClick(View v)
//            {
//        	   Intent intent = new Intent();
//        	   intent.setClass(DirectPy.this, Smxx.class);
//        	
//        	   startActivity(intent);
//        	   DirectPy.this.finish();
//            
//            }
//    });
//        Ymxx.setOnClickListener(new Button.OnClickListener()
//        {
//        	public void onClick(View v)
//            {
//        	   Intent intent = new Intent();
//        	   intent.setClass(DirectPy.this, Ymxx.class);
//        	
//        	   startActivity(intent);
//        	   DirectPy.this.finish();
//            
//            }
//    });
//        Pdlx.setOnClickListener(new Button.OnClickListener()
//        {
//        	public void onClick(View v)
//            {
//        	   Intent intent = new Intent();
//        	   intent.setClass(DirectPy.this, Pdlx.class);
//        	
//        	   startActivity(intent);
//        	   DirectPy.this.finish();
//            
//            }
//    });
//        Yjlx.setOnClickListener(new Button.OnClickListener()
//        {
//        	public void onClick(View v)
//            {
//        	   Intent intent = new Intent();
//        	   intent.setClass(DirectPy.this, Yjlx.class);
//        	
//        	   startActivity(intent);
//        	   DirectPy.this.finish();
//            
//            }
//    });
//        About.setOnClickListener(new Button.OnClickListener()
//        {
//        	public void onClick(View v)
//            {
//        	   Intent intent = new Intent();
//        	   intent.setClass(DirectPy.this, About.class);
//        	
//        	   startActivity(intent);
//        	   DirectPy.this.finish();
//            
//            }
//    });
        
  }
	@Override
	public boolean onTouchEvent(MotionEvent event) {
		// TODO Auto-generated method stub
		//获得触摸的坐标
	
		float x = event.getX();
		float y = event.getY(); 
     	String strOpt = "您的坐标是" + x + " * " + y;	
		//TextView view1=(TextView) findViewById(R.id);
		//view1.setText(strOpt);
		//Toast.makeText(DirectPy.this, strOpt,Toast.LENGTH_SHORT).show();
		
		
		/*模拟器下的坐标*/
		switch (event.getAction()) 
		{
		case MotionEvent.ACTION_DOWN:
//			if((x>46&&x<113)&&(y>103&&y<128))
//			{
//				   Intent intent = new Intent();
//	        	   intent.setClass(DirectPy.this, Smxx.class);     	
//	        	   startActivity(intent);
//	        	   DirectPy.this.finish();
//			}
//			if((x>46&&x<113)&&(y>136&&y<158))
//			{
//	        	   Intent intent = new Intent();
//	        	   intent.setClass(DirectPy.this, Ymxx.class);	        	
//	        	   startActivity(intent);
//	        	   DirectPy.this.finish();
//			}
//			if((x>46&&x<113)&&(y>166&&y<188))
//			{
//	        	   Intent intent = new Intent();
//	        	   intent.setClass(DirectPy.this, Pdlx.class);  	
//	        	   startActivity(intent);
//	        	   DirectPy.this.finish();
//			}
//			if((x>46&&x<113)&&(y>196&&y<218))
//			{
//	        	   Intent intent = new Intent();
//	        	   intent.setClass(DirectPy.this, Yjlx.class);
//	        	   startActivity(intent);
//	        	   DirectPy.this.finish();
//			}
//			if((x>46&&x<113)&&(y>226&&y<248))
//			{
//	        	   Intent intent = new Intent();
//	        	   intent.setClass(DirectPy.this, About.class);
//	        	   startActivity(intent);
//	        	   DirectPy.this.finish();
//			}
//			if((x>660&&x<765)&&(y>362&&y<455))
//			{
//				System.exit(0);
//			}
			
			/*n900下的坐标*/
			if((x>82&&x<187)&&(y>197&&y<243))
			{
				   Intent intent = new Intent();
	        	   intent.setClass(DirectPy.this, Smxx.class);     	
	        	   startActivity(intent);
	        	   DirectPy.this.finish();
			}
			if((x>82&&x<187)&&(y>255&&y<302))
			{
	        	   Intent intent = new Intent();
	        	   intent.setClass(DirectPy.this, Ymxx.class);	        	
	        	   startActivity(intent);
	        	   DirectPy.this.finish();
			}
			if((x>82&&x<187)&&(y>315&&y<361))
			{
	        	   Intent intent = new Intent();
	        	   intent.setClass(DirectPy.this, Pdlx.class);  	
	        	   startActivity(intent);
	        	   DirectPy.this.finish();
			}
			if((x>82&&x<187)&&(y>375&&y<420))
			{
	        	   Intent intent = new Intent();
	        	   intent.setClass(DirectPy.this, Yjlx.class);
	        	   startActivity(intent);
	        	   DirectPy.this.finish();
			}
			if((x>82&&x<187)&&(y>493&&y<537))
			{
	        	   Intent intent = new Intent();
	        	   intent.setClass(DirectPy.this, About.class);
	        	   startActivity(intent);
	        	   DirectPy.this.finish();
			}
			if((x>663&&x<756)&&(y>456&&y<576))
			{
				System.exit(0);
			}
			
			break;
		}
		return false;
	}
        
}