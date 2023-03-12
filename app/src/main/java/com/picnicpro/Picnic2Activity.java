package com.picnicpro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.text.InputType;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Picnic2Activity extends Activity{
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.play2);
		final EditText e1=(EditText)findViewById(R.id.editText1);
		e1.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
		final EditText e2=(EditText)findViewById(R.id.editText2);
		e2.setInputType(InputType.TYPE_TEXT_VARIATION_PERSON_NAME);
        Button b=(Button)findViewById(R.id.button1);
        final ToggleButton t=(ToggleButton)findViewById(R.id.toggleButton1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(getApplicationContext(),PicnicplayActivity.class);
				i1.putExtra("Name1",e1.getText().toString());
				i1.putExtra("Name2",e2.getText().toString());
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
				String s2=e2.getText().toString();
				if(t.getText().toString().endsWith("N"))
				{
					i1.putExtra("s",true);
				}
				else
				{
					i1.putExtra("s",false);
				}
				if(s1!="" && s1!=null && s2!="" && s2!=null && s1.matches("([A-Z]{2,})|([A-Z][a-z]+)") && s2.matches("([A-Z]{2,})|([A-Z][a-z]+)") && rb1!=null && rb2!=null && rb1.getText().toString()!=rb2.getText().toString())
				{
				startActivity(i1);
				}
				else
				{
					Toast.makeText(getApplicationContext(),"Please enter/select all the values properly. Also make sure the color of marker for Player 1 is not the same as the color of marker for Player 2.", Toast.LENGTH_LONG).show();
				}
			}
		});
    }
}
