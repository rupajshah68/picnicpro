package com.picnicpro;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.Toast;
import android.widget.ToggleButton;

public class Picnic3Activity extends Activity{
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.play3);
        Button b=(Button)findViewById(R.id.button1);
        final ToggleButton t=(ToggleButton)findViewById(R.id.toggleButton1);
        b.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(getApplicationContext(),Picnicplay3Activity.class);
				i1.putExtra("Name1","Player 1");
				i1.putExtra("Name2","Player 2");
				i1.putExtra("Name3","Player 3");
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
				RadioGroup r3 = (RadioGroup) findViewById(R.id.radioGroup3);
				int id3=r3.getCheckedRadioButtonId();
				RadioButton rb3=(RadioButton)findViewById(id3);
				if(rb3!=null)
				{
					i1.putExtra("Radio3", rb3.getText().toString());
				}
				if(t.getText().toString().endsWith("N"))
				{
					i1.putExtra("s",true);
				}
				else
				{
					i1.putExtra("s",false);
				}
				if(rb1!=null && rb2!=null && rb3!=null && rb1.getText().toString()!=rb2.getText().toString() && rb2.getText().toString()!=rb3.getText().toString() && rb1.getText().toString()!=rb3.getText().toString())
				{
				startActivity(i1);
				}
				else
				{
					Toast.makeText(getApplicationContext(),"Please select all the values. Also make sure the color of markers for Player 1, Player 2 and Player 3 are different.", Toast.LENGTH_LONG).show();
				}
			}
		});
    }
}
