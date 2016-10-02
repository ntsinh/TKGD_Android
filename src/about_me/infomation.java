package about_me;

import android.app.Activity;
import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import tkgd_android.com.R;

public class infomation extends TabActivity{
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.about_me);
		
		TabHost tabHost = getTabHost();
		TabSpec tab1 = tabHost.newTabSpec("first");
        TabSpec tab2 = tabHost.newTabSpec("second");
        tab1.setIndicator("Giới thiệu");
        tab1.setContent(new Intent(this,info.class));
        
        tab2.setIndicator("Liên hệ");
        tab2.setContent(new Intent(this,contact.class));
        
        tabHost.addTab(tab1);
        tabHost.addTab(tab2);
	}
}
