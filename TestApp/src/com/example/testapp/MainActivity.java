package com.example.testapp;

import java.io.File;

import android.app.Activity;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.Menu;
import android.widget.ImageView;

public class MainActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		// this is added after importing from git and than in eclipse
		
		// this is added after one commite in local
		
		File f = new File("/mnt/sdcard/url.jpg");
		ImageView mImgView1 = (ImageView)findViewById(R.id.imageView);
		Bitmap bmp = BitmapFactory.decodeFile(f.getAbsolutePath());
		mImgView1.setImageBitmap(bmp);
	}

	
	
	///fasdfjsjkfl
	
	//sdfasdff
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

}
