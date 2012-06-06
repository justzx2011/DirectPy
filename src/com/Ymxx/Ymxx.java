package com.Ymxx;

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
import android.widget.BaseAdapter;
import android.widget.Gallery;
import android.widget.ImageView;
import android.widget.AdapterView.OnItemClickListener;

import com.DirectPy.DirectPy;
import com.DirectPy.R;

public class Ymxx extends Activity {
		public Integer[] myImageIds = 
		       {
				   R.drawable.a,
		           R.drawable.o,
		           R.drawable.e,
		           R.drawable.ai,
		           R.drawable.ei,
		           R.drawable.ao,
		           R.drawable.ou,
		           R.drawable.an,
		           R.drawable.en,
		           R.drawable.ang,
		           R.drawable.eng,
		           R.drawable.ong,
		           R.drawable.i,
		           R.drawable.ia,
		           R.drawable.ie,
		           R.drawable.iao,
		           R.drawable.ian,
		           R.drawable.in,
		           R.drawable.iang,
		           R.drawable.ing,
		           R.drawable.iong,
		           R.drawable.u,
		           R.drawable.ua,
		           R.drawable.uai,
		           R.drawable.uei,
		           R.drawable.iou,
		           R.drawable.uan,
		           R.drawable.uen,
		           R.drawable.uang,
		           R.drawable.ueng,
		           R.drawable.yu,
		           R.drawable.yue,
		           R.drawable.yuan,
		           R.drawable.yun,
		       };  	

		public Integer[] myImagetextIds = 
		       {
				   R.drawable.a1a,
		           R.drawable.a1o,
		           R.drawable.a1e,
		           R.drawable.a1ai,
		           R.drawable.a1ei,
		           R.drawable.a1ao,
		           R.drawable.a1ou,
		           R.drawable.a1an,
		           R.drawable.a1en,
		           R.drawable.a1ang,
		           R.drawable.a1eng,
		           R.drawable.a1ong,
		           R.drawable.a1i,
		           R.drawable.a1ia,
		           R.drawable.a1ie,
		           R.drawable.a1iao,
		           R.drawable.a1ian,
		           R.drawable.a1in,
		           R.drawable.a1iang,
		           R.drawable.a1ing,
		           R.drawable.a1iong,
		           R.drawable.a1u,
		           R.drawable.a1ua,
		           R.drawable.a1uai,
		           R.drawable.a1uei,
		           R.drawable.a1iou,
		           R.drawable.a1uan,
		           R.drawable.a1uen,
		           R.drawable.a1uang,
		           R.drawable.a1ueng,
		           R.drawable.a1yu,
		           R.drawable.a1yue,
		           R.drawable.a1yuan,
		           R.drawable.a1yun,
		       }; 
		public  String[] myflashIds = 
		       {
				"file:///mnt/sdcard/video/flash/letter/a.swf",
				"file:///mnt/sdcard/video/flash/letter/o.swf",
				"file:///mnt/sdcard/video/flash/letter/e.swf",
				"file:///mnt/sdcard/video/flash/letter/ai.swf",
				"file:///mnt/sdcard/video/flash/letter/ei.swf",
				"file:///mnt/sdcard/video/flash/letter/ao.swf",
				"file:///mnt/sdcard/video/flash/letter/ou.swf",
				"file:///mnt/sdcard/video/flash/letter/an.swf",
				"file:///mnt/sdcard/video/flash/letter/en.swf",
				"file:///mnt/sdcard/video/flash/letter/ang.swf",
				"file:///mnt/sdcard/video/flash/letter/eng.swf",
				"file:///mnt/sdcard/video/flash/letter/ong.swf",
				"file:///mnt/sdcard/video/flash/letter/i.swf",
				"file:///mnt/sdcard/video/flash/letter/ia.swf",
				"file:///mnt/sdcard/video/flash/letter/ie.swf",
				"file:///mnt/sdcard/video/flash/letter/iao.swf",
				"file:///mnt/sdcard/video/flash/letter/ian.swf",
				"file:///mnt/sdcard/video/flash/letter/in.swf",
				"file:///mnt/sdcard/video/flash/letter/iang.swf",
				"file:///mnt/sdcard/video/flash/letter/ing.swf",
				"file:///mnt/sdcard/video/flash/letter/iong.swf",
				"file:///mnt/sdcard/video/flash/letter/u.swf",
				"file:///mnt/sdcard/video/flash/letter/ua.swf",
				"file:///mnt/sdcard/video/flash/letter/uai.swf",
				"file:///mnt/sdcard/video/flash/letter/uei.swf",
				"file:///mnt/sdcard/video/flash/letter/iou.swf",
				"file:///mnt/sdcard/video/flash/letter/uan.swf",
				"file:///mnt/sdcard/video/flash/letter/uen.swf",
				"file:///mnt/sdcard/video/flash/letter/uang.swf",
				"file:///mnt/sdcard/video/flash/letter/ueng.swf",
				"file:///mnt/sdcard/video/flash/letter/yu.swf",
				"file:///mnt/sdcard/video/flash/letter/yue.swf",
				"file:///mnt/sdcard/video/flash/letter/yuan.swf",
				"file:///mnt/sdcard/video/flash/letter/yun.swf",
		       };
		/*声母书写配音*/
		public  String[] myaudioIds = 
		       {
				"/sdcard/sound/a.wav",
				"/sdcard/sound/o.wav",
				"/sdcard/sound/e.wav",
				"/sdcard/sound/ai.wav",
				"/sdcard/sound/ei.wav",
				"/sdcard/sound/ao.wav",
				"/sdcard/sound/ou.wav",
				"/sdcard/sound/an.wav",
				"/sdcard/sound/en.wav",
				"/sdcard/sound/ang.wav",
				"/sdcard/sound/eng.wav",
				"/sdcard/sound/ong.wav",
				"/sdcard/sound/i.wav",
				"/sdcard/sound/ia.wav",
				"/sdcard/sound/ie.wav",
				"/sdcard/sound/iao.wav",
				"/sdcard/sound/ian.wav",
				"/sdcard/sound/in.wav",
				"/sdcard/sound/iang.wav",
				"/sdcard/sound/ing.wav",
				"/sdcard/sound/iong.wav",
				"/sdcard/sound/u.wav",
				"/sdcard/sound/ua.wav",
				"/sdcard/sound/uai.wav",
				"/sdcard/sound/uei.wav",
				"/sdcard/sound/iou.wav",
				"/sdcard/sound/uan.wav",
				"/sdcard/sound/uen.wav",
				"/sdcard/sound/uang.wav",
				"/sdcard/sound/ueng.wav",
				"/sdcard/sound/yu.wav",
				"/sdcard/sound/yue.wav",
				"/sdcard/sound/yuan.wav",
				"/sdcard/sound/yun.wav",
		       };
		public void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.ymxx);
		    //--------------------------------------画册---------------------------------------
		   /*通过findViewById取得*/
	       Gallery g = (Gallery) findViewById(R.id.myGalleryYmxx);
	       /*添加一个ImageAdapter并设置给Gallery对象*/
	       g.setAdapter(new ImageAdapter(this));
	       
	       /*添加默认的图片*/
	       
	       /*设置一个itemclickListener并Toast被单击图片的位置*/
	       g.setOnItemClickListener(new OnItemClickListener() 
	       {
	    	   public void onItemClick(AdapterView<?> parent, View v, int position, long id) 
		         {
	    			 ImageView img=(ImageView)findViewById(R.id.imgviewYmxx);
	    			 WebView mWebFlash = (WebView) findViewById(R.id.webViewYmxx);
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
	         /*设置Gallery­背景图*/
	         i.setBackgroundResource(mGalleryItemBackground);
	         /*返回imageView对象*/
	         return i; 
	       }  
	     }
		@Override
		public void onBackPressed() {
			// TODO Auto-generated method stub
//			mp.release();
	        Intent intent = new Intent();
	        intent.setClass(Ymxx.this, DirectPy.class);
	        startActivity(intent);
	        Ymxx.this.finish();
			super.onBackPressed();
		} 
	}