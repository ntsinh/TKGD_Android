package sinhntpk00491_lab6;

import android.app.Activity;
import android.app.Dialog;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import tkgd_android.com.R;

public class lab6 extends Activity{
	Dialog dialogRegister;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.lab6);
		
		Button dk = (Button) findViewById(R.id.btnRegister);
		dk.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				DialogDangky();
				
			}

			
			
		});
		
	}
	public void DialogDangky() {
		try{
		dialogRegister = new Dialog(this);
		dialogRegister.requestWindowFeature(dialogRegister.getWindow().FEATURE_NO_TITLE);
		dialogRegister.setContentView(R.layout.lab6_register); 
		final TextView Notifi;
		final EditText Password;
		final EditText repass;
		final EditText username;
		Button close = (Button) dialogRegister.findViewById(R.id.btnClose);
		Button register = (Button) dialogRegister.findViewById(R.id.btnRegister);
		Notifi=(TextView) dialogRegister.findViewById(R.id.txtnotifi);
		username=(EditText) dialogRegister.findViewById(R.id.txtUsername);
		Password=(EditText) dialogRegister.findViewById(R.id.txtPassword);
		repass=(EditText) dialogRegister.findViewById(R.id.txtRepass);
		dialogRegister.show();
		close.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				dialogRegister.dismiss();
				
			}
		});
		register.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				String Users = username.getText().toString();
				String Pass = Password.getText().toString();
				String Repass = repass.getText().toString();
				
				if((Users.equals("")) || (Pass.equals(""))){
					Notifi.setText("Bạn chưa nhập tài khoản");
				}else if((Pass.equals(Repass))){
					Notifi.setText("Đăng kí thành công");
				}else{
					Notifi.setText("Mật khẩu không khớp");
		 		}
				
			}
		});
		
		}
		catch(Exception e){
			Toast.makeText(getApplicationContext(), "a"+e, Toast.LENGTH_LONG).show();
		}
	}
}
