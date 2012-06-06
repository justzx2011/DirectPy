package com.Smxx;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.TypedArray;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;

import com.DirectPy.DirectPy;
import com.DirectPy.R;

public class Smxx extends Activity {
    
	/*Gallery中要显示的图片*/
	public   Integer[] myImageIds = 
	       {
			   R.drawable.b,
	           R.drawable.p,
	           R.drawable.m,
	           R.drawable.f,
	           R.drawable.d,
	           R.drawable.t,
	           R.drawable.n,
	           R.drawable.l,
	           R.drawable.g,
	           R.drawable.k,
	           R.drawable.h,
	           R.drawable.j,
	           R.drawable.q,
	           R.drawable.x,
	           R.drawable.zh,
	           R.drawable.ch,
	           R.drawable.sh,
	           R.drawable.r,
	           R.drawable.z,
	           R.drawable.c,
	           R.drawable.s,
	           R.drawable.y,
	           R.drawable.w,
	       }; 
	/*声母书写配音*/
	public  String[] myaudioIds = 
	       {
			"/sdcard/data/audio/directpy/sound/b.wav",
			"/sdcard/data/audio/directpy/sound/p.wav",
			"/sdcard/data/audio/directpy/sound/m.wav",
			"/sdcard/data/audio/directpy/sound/f.wav",
			"/sdcard/data/audio/directpy/sound/d.wav",
			"/sdcard/data/audio/directpy/sound/t.wav",
			"/sdcard/data/audio/directpy/sound/n.wav",
			"/sdcard/data/audio/directpy/sound/l.wav",
			"/sdcard/data/audio/directpy/sound/g.wav",
			"/sdcard/data/audio/directpy/sound/k.wav",
			"/sdcard/data/audio/directpy/sound/h.wav",
			"/sdcard/data/audio/directpy/sound/j.wav",
			"/sdcard/data/audio/directpy/sound/q.wav",
			"/sdcard/data/audio/directpy/sound/x.wav",
			"/sdcard/data/audio/directpy/sound/zh.wav",
			"/sdcard/data/audio/directpy/sound/ch.wav",
			"/sdcard/data/audio/directpy/sound/sh.wav",
			"/sdcard/data/audio/directpy/sound/r.wav",
			"/sdcard/data/audio/directpy/sound/z.wav",
			"/sdcard/data/audio/directpy/sound/c.wav",
			"/sdcard/data/audio/directpy/sound/s.wav",
			"/sdcard/data/audio/directpy/sound/y.wav",
			"/sdcard/data/audio/directpy/sound/w.wav",
	       };
	/*发音要绝*/
    public  Integer[] myImagetextIds = 
	       {
			   R.drawable.a1b,
	           R.drawable.a1p,
	           R.drawable.a1m,
	           R.drawable.a1f,
	           R.drawable.a1d,
	           R.drawable.a1t,
	           R.drawable.a1n,
	           R.drawable.a1l,
	           R.drawable.a1g,
	           R.drawable.a1k,
	           R.drawable.a1h,
	           R.drawable.a1j,
	           R.drawable.a1q,
	           R.drawable.a1x,
	           R.drawable.a1zh,
	           R.drawable.a1ch,
	           R.drawable.a1sh,
	           R.drawable.a1r,
	           R.drawable.a1z,
	           R.drawable.a1c,
	           R.drawable.a1s,
	           R.drawable.a1y,
	           R.drawable.a1w,
	       }; 
	/*声母书写动画*/
	public  String[] myflashIds = 
	       {
			"file:///mnt/sdcard/data/flash/directpy/letter/b.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/p.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/m.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/f.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/d.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/t.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/n.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/l.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/g.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/k.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/h.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/j.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/q.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/x.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/zh.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/ch.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/sh.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/r.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/z.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/c.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/s.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/y.swf",
			"file:///mnt/sdcard/data/flash/directpy/letter/w.swf",
	       };
	public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.smxx);
	    //--------------------------------------画册---------------------------------------
	   /*通过findViewById取得*/
       Gallery g = (Gallery) findViewById(R.id.myGallerySmxx);
       /*添加一个ImageAdapter并设置给Gallery对象*/
       g.setAdapter(new ImageAdapter(this));
       
       /*添加默认的图片*/
       
       /*设置一个itemclickListener并Toast被单击图片的位置*/
       g.setOnItemClickListener(new OnItemClickListener() 
       {
    	   public void onItemClick(AdapterView<?> parent, View v, int position, long id) 
	         {
    			 ImageView img=(ImageView)findViewById(R.id.imgviewSmxx);
    			 WebView mWebFlash = (WebView) findViewById(R.id.webViewSmxx);
    			 WebSettings settings = mWebFlash.getSettings();
    			 final MediaPlayer mp=new MediaPlayer();
    		     img.setImageResource(myImagetextIds[position]);
    		     settings.setPluginsEnabled(true);
    		     settings.setJavaScriptEnabled(true);
    		     settings.setAllowFileAccess(true);
    		     mWebFlash.loadUrl(myflashIds[position]);
   				 try{
   			        	mp.setDataSource(myaudioIds[position]);		//加载音频，进入Initialized状态。
   			        }catch(Exception e){e.printStackTrace();}
   			        try{
   			        	mp.prepare();							//进入prepared状态。
   			        }catch(Exception e){e.printStackTrace();}
   				 mp.start();										//播放音乐
	         }
	       });
     }
     /*改写BaseAdapter自定义一ImageAdapter class*/
     public class ImageAdapter extends BaseAdapter 
     {
       /*声明变量*/
       int mGalleryItemBackground;
       private Context mContext;
       
       /*ImageAdapter的构造器*/
       public ImageAdapter(Context c) 
       {
         mContext = c;
         /*使用在res/values/attrs.xml中的<declare-styleable>定义
         的Gallery属性*/
         TypedArray a = obtainStyledAttributes(R.styleable.Gallery);
         /*取得Gallery属性的Index id*/
         mGalleryItemBackground = a.getResourceId(
             R.styleable.Gallery_android_galleryItemBackground, 0);
         /*让对象的styleable属性能够反复使用*/ 
         a.recycle();
       }
       
       /*重写的方法getCount,返回图片数目*/
       public int getCount() 
       {
         return myImageIds.length;
       }
       /*重写的方法getItemId,返回图像的数组id*/
       public Object getItem(int position) 
       {
         return position;
       } 
       public long getItemId(int position) 
       {
         return position;
       }
       /*重写的方法getView,返回一View对象*/
       public View getView(int position, View convertView, ViewGroup parent) 
       {
         /*产生ImageView对象*/
         ImageView i = new ImageView(mContext);
         /*设置图片给imageView对象*/
         i.setImageResource(myImageIds[position]);
         /*重新设置图片的宽高*/
         i.setScaleType(ImageView.ScaleType.FIT_CENTER );
         /*重新设置Layout的宽高*/
         i.setLayoutParams(new Gallery.LayoutParams(200, 240));
         /*设置Gallery��背景图*/
         i.setBackgroundResource(mGalleryItemBackground);
         /*返回imageView对象*/
         return i; 
       }  
     }
	@Override
	public void onBackPressed() {
		// TODO Auto-generated method stub
//		mp.release();
        Intent intent = new Intent();
        intent.setClass(Smxx.this, DirectPy.class);
        startActivity(intent);
        Smxx.this.finish();
		super.onBackPressed();
	} 
}