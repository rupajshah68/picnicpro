package com.picnicpro;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;


public class PicnicActivity extends Activity {
	/** Called when the activity is first created. */
	LinearLayout l, l1, l2, l3;
	TextView t, ts1, ts2, ts3;
	Button b1, b2, b3, b4, b5;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.main);
		l=(LinearLayout)findViewById(R.id.LinearLayout);
		l.setBackgroundDrawable(getResources().getDrawable(R.drawable.background));
		t=new TextView(getApplicationContext());
		LinearLayout.LayoutParams pt=new LinearLayout.LayoutParams(getWindowManager().getDefaultDisplay().getWidth(),getWindowManager().getDefaultDisplay().getHeight()/4);
        t.setLayoutParams(pt);
        t.setGravity(Gravity.CENTER);
        t.setText("PICNIC");
		t.setTextColor(Color.parseColor("#FF00FF"));
        t.setTextSize(50);
        l.addView(t);
        l1=new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams p1=new LinearLayout.LayoutParams(getWindowManager().getDefaultDisplay().getWidth(),(int)((getWindowManager().getDefaultDisplay().getHeight()*0.75-90)/3));
        l1.setLayoutParams(p1);
        b1=new Button(getApplicationContext());
        int v;
        if(getWindowManager().getDefaultDisplay().getWidth()/3>(int)(getWindowManager().getDefaultDisplay().getHeight()*2.0/9.0))
        {
            v=(int)(getWindowManager().getDefaultDisplay().getHeight()*2.0/9.0);
        }
        else
        {
            v=getWindowManager().getDefaultDisplay().getWidth()/3;
        }
        LinearLayout.LayoutParams bp1=new LinearLayout.LayoutParams(v,v);
        bp1.gravity=Gravity.LEFT|Gravity.CENTER_VERTICAL;
        bp1.setMargins(15,15,15,15);
        b1.setLayoutParams(bp1);
        b1.setHeight(v);
        b1.setWidth(v);
        b1.setGravity(Gravity.CENTER);
        b1.setText("PLAY AGAINST COMPUTER");
        b1.setBackgroundDrawable(getResources().getDrawable(R.drawable.homebutton));
        b1.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i1=new Intent(getApplicationContext(),PicniccActivity.class);
				startActivity(i1);
			}
		});
        l1.addView(b1);
        ts1=new TextView(getApplicationContext());
        LinearLayout.LayoutParams bts1=new LinearLayout.LayoutParams(getWindowManager().getDefaultDisplay().getWidth()-2*v-60,v);
        ts1.setLayoutParams(bts1);
        ts1.setWidth(getWindowManager().getDefaultDisplay().getWidth()-2*v-60);
        ts1.setHeight(v);
        l1.addView(ts1);
        b2=new Button(getApplicationContext());
        LinearLayout.LayoutParams bp2=new LinearLayout.LayoutParams(v,v);
        bp2.gravity=Gravity.CENTER_VERTICAL;
        bp2.setMargins(15,15,15,15);
        b2.setLayoutParams(bp2);
        b2.setGravity(Gravity.CENTER);
        b2.setText("2 PLAYERS");
        b2.setBackgroundDrawable(getResources().getDrawable(R.drawable.homebutton));
        b2.setOnClickListener(new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			Intent i1=new Intent(getApplicationContext(),Picnic2Activity.class);
			startActivity(i1);
		}
	});
        l1.addView(b2);
        l.addView(l1);
        l2=new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams p2=new LinearLayout.LayoutParams(getWindowManager().getDefaultDisplay().getWidth(),(int)((getWindowManager().getDefaultDisplay().getHeight()*0.75-90)/3));
        l2.setLayoutParams(p2);
        l2.setOrientation(LinearLayout.VERTICAL);
        b5=new Button(getApplicationContext());
        LinearLayout.LayoutParams bp5=new LinearLayout.LayoutParams(v,v);
        bp5.gravity=Gravity.CENTER_HORIZONTAL;
        b5.setLayoutParams(bp5);
        b5.setText("HELP");
        b5.setBackgroundDrawable(getResources().getDrawable(R.drawable.homebutton));
        b5.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i1=new Intent(getApplicationContext(),PicnicrulesActivity.class);
                startActivity(i1);
            }
        });
        l2.addView(b5);
        l.addView(l2);
        l3=new LinearLayout(getApplicationContext());
        LinearLayout.LayoutParams p3=new LinearLayout.LayoutParams(getWindowManager().getDefaultDisplay().getWidth(),(int)((getWindowManager().getDefaultDisplay().getHeight()*0.75-90)/3));
        l1.setLayoutParams(p3);
        b3=new Button(getApplicationContext());
        LinearLayout.LayoutParams bp3=new LinearLayout.LayoutParams(v,v);
        bp3.gravity=Gravity.LEFT|Gravity.CENTER_VERTICAL;
        bp3.setMargins(15,15,15,15);
        b3.setLayoutParams(bp3);
        b3.setHeight(v);
        b3.setWidth(v);
        b3.setGravity(Gravity.CENTER);
        b3.setText("3 PLAYERS");
        b3.setBackgroundDrawable(getResources().getDrawable(R.drawable.homebutton));
        b3.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i1=new Intent(getApplicationContext(),Picnic3Activity.class);
                startActivity(i1);
            }
        });
        l3.addView(b3);
        ts3=new TextView(getApplicationContext());
        LinearLayout.LayoutParams bts3=new LinearLayout.LayoutParams(getWindowManager().getDefaultDisplay().getWidth()-2*v-60,v);
        ts3.setLayoutParams(bts3);
        ts3.setWidth(getWindowManager().getDefaultDisplay().getWidth()-2*v-60);
        ts3.setHeight(v);
        l3.addView(ts3);
        b4=new Button(getApplicationContext());
        LinearLayout.LayoutParams bp4=new LinearLayout.LayoutParams(v,v);
        bp4.gravity=Gravity.CENTER_VERTICAL;
        bp4.setMargins(15,15,15,15);
        b4.setLayoutParams(bp2);
        b4.setGravity(Gravity.CENTER);
        b4.setText("4 PLAYERS");
        b4.setBackgroundDrawable(getResources().getDrawable(R.drawable.homebutton));
        b4.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub
                Intent i1=new Intent(getApplicationContext(),Picnic4Activity.class);
                startActivity(i1);
            }
        });
        l3.addView(b4);
        l.addView(l3);
    }
}