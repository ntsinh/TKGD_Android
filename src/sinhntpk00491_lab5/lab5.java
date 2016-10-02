package sinhntpk00491_lab5;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import tkgd_android.com.R;

public class lab5 extends TabActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tabhost);
		
		TabHost tabhost = getTabHost();
		
		TabSpec tab1 = tabhost.newTabSpec("first");
		TabSpec tab2 = tabhost.newTabSpec("second");
		
		tab1.setIndicator("Giới thiệu");
		tab1.setContent(new Intent(this,Tab1.class));
		tab2.setIndicator("Liên hệ");
		tab2.setContent(new Intent(this,Tab2.class));
		
		tabhost.addTab(tab1);
		tabhost.addTab(tab2);
	}
}
