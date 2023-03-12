package com.picnicpro;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class PicnicrulesActivity extends Activity{
	 /** Called when the activity is first created. */
     LinearLayout l;
    TextView t;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.rules);
        l=(LinearLayout)findViewById(R.id.l);
        t=new TextView(getApplicationContext());
        LinearLayout.LayoutParams pt=new LinearLayout.LayoutParams(getWindowManager().getDefaultDisplay().getWidth(),LinearLayout.LayoutParams.WRAP_CONTENT);
        pt.setMargins(15,15,15,15);
        l.setLayoutParams(pt);
        t.setLayoutParams(pt);
        t.setGravity(Gravity.CENTER);
        t.setText("PICNIC");
        t.setTextColor(Color.parseColor("#FF00FF"));
        t.setTextSize(50);
        l.addView(t);
        Button b1=(Button)findViewById(R.id.button1);
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i3=new Intent(getApplicationContext(),PicnicActivity.class);
				startActivity(i3);
			}
		});
    }
}
