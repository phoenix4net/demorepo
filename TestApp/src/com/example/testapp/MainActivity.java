package com.example.testapp;

import java.io.File;
import java.nio.Buffer;

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
		
		Buffer buffer = new Bundle();
		ImageView mImgView1 = (ImageView)findViewById(R.id.imageView);
		Bitmap bmp = BitmapFactory.decodeFile(f.getAbsolutePath());
		/*Edited by Aalap*/
		//mImgView1.setImageBitmap(bmp);
		
		// tis is test
		
		// new commite to test ingore feature.
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
