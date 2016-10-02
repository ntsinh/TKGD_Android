package sinhntpk00491_lab1;

import android.app.Activity;
import android.os.Bundle;
import android.webkit.WebView;
import tkgd_android.com.R;

public class lab1 extends Activity{
 @Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.lab1);
	
	String doc="https://drive.google.com/file/d/0B8NvXF4xlrMlSHdCcEpqbEp2Ykk/view";
	WebView wv = (WebView)findViewById(R.id.Wv);
	wv.getSettings().setJavaScriptEnabled(true);
	wv.getSettings().setAllowFileAccess(true);
	wv.getSettings().setLoadsImagesAutomatically(true);
	wv.loadUrl(doc);
}
}
