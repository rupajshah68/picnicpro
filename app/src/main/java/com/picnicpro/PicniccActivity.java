package com.picnicpro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class PicniccActivity extends Activity{
	/** Called when the activity is first created. */
	LinearLayout l, l1, l2;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.playc);
		l=(LinearLayout)findViewById(R.id.l);
        l1=new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams p1=new LinearLayout.LayoutParams(getWindowManager().getDefaultDisplay().getWidth(),getWindowManager().getDefaultDisplay().getHeight()/4);
        l1.setLayoutParams(p1);
        l2=new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams p2=new LinearLayout.LayoutParams(getWindowManager().getDefaultDisplay().getWidth(),getWindowManager().getDefaultDisplay().getHeight()/4);
        l1.setLayoutParams(p2);
        Button b=(Button)findViewById(R.id.button1);
        final ToggleButton t=(ToggleButton)findViewById(R.id.toggleButton1);
        b.setOnClickListener(new OnClickListener() {

			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(getApplicationContext(),PicnicplaycActivity.class);
				EditText e1=(EditText)findViewById(R.id.editText1);
                i1.putExtra("Name1",e1.getText().toString());
				i1.putExtra("Name2","Computer");
				RadioGroup r1 = (RadioGroup) findViewById(R.id.radioGroup);
				int id1=r1.getCheckedRadioButtonId();
				RadioButton rb1=(RadioButton)findViewById(id1);
				if(rb1!=null)
				{
				i1.putExtra("Radio1", rb1.getText().toString());
				}
				RadioGroup r2 = (RadioGroup) findViewById(R.id.radioGroup2);
				int id2=r2.getCheckedRadioButtonId();
				RadioButton rb2=(RadioButton)findViewById(id2);
				if(rb2!=null)
				{
					i1.putExtra("Radio2", rb2.getText().toString());
				}
				String s1=e1.getText().toString();
				if(t.getText().toString().endsWith("N"))
				{
					i1.putExtra("s",true);
				}
				else
				{
					i1.putExtra("s",false);
				}
				if(s1!="" && s1!=null && s1.matches("([A-Z]{2,})|([A-Z][a-z]+)")&& rb1!=null && rb2!=null && rb1.getText().toString()!=rb2.getText().toString())
				{
				startActivity(i1);
				}
				else
				{
					Toast.makeText(getApplicationContext(),"Please enter/select all the values properly. Also make sure the color of your marker is not the same as the color of marker for Computer.", Toast.LENGTH_LONG).show();
				}
			}
        });
        }
    }
