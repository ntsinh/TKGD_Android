package sinhntpk00491_lab3;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import tkgd_android.com.R;

public class lab3 extends Activity{
	TextView Register,Forgot;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lab3);
		Register = (TextView) findViewById(R.id.register);
		Forgot = (TextView) findViewById(R.id.forgot);
		
		Register.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),lab3_1.class);
				startActivity(intent);
				
			}
		});
		Forgot.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Intent intent = new Intent(getApplicationContext(),lab3_2.class);
				startActivity(intent);
				
			}
		});
	}
}
