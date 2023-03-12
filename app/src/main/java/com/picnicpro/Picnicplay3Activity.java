package com.picnicpro;

import java.util.Random;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Color;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;

public class Picnicplay3Activity extends Activity{
	public void play1(String pc,String pca,String pcb,boolean s)
	{
		final boolean so=s;
		final String pc1=pc;
		final String pc2=pca;
		final String pc3=pcb;
		final TextView pb1=(TextView)findViewById(R.id.pb1);
	    final TextView pb2=(TextView)findViewById(R.id.pb2);
	    final TextView pb3=(TextView)findViewById(R.id.pb3);
	    final TextView p1=(TextView)findViewById(R.id.p1);
	    final TextView p2=(TextView)findViewById(R.id.p2);
	    final TextView p3=(TextView)findViewById(R.id.p3);
	    final TextView i=(TextView)findViewById(R.id.i);
	    final TextView j=(TextView)findViewById(R.id.j);
	    final TextView k=(TextView)findViewById(R.id.k);
	    final TextView bo=(TextView)findViewById(R.id.bottom);
	    final TextView dt=(TextView)findViewById(R.id.dt);
	    final String Name1=getIntent().getExtras().getString("Name1");
	    final String Name2=getIntent().getExtras().getString("Name2");
	    final String Name3=getIntent().getExtras().getString("Name3");
		int ps1=Integer.parseInt(p1.getText().toString());
		int ps2=Integer.parseInt(p2.getText().toString());
		int ps3=Integer.parseInt(p3.getText().toString());
		int iv=Integer.parseInt(i.getText().toString());
		int jv=Integer.parseInt(j.getText().toString());
		int kv=Integer.parseInt(k.getText().toString());
		final RelativeLayout r1=(RelativeLayout)findViewById(R.id.linearLayout1);
		final TextView no1=(TextView)findViewById(R.id.no1);
        final TextView no2=(TextView)findViewById(R.id.no2);
		Random r=new Random();
		short d;
		d=(short) (r.nextInt(6)+1);
		if(so==true)
		{
			m.start();
		}
		int pba1,pba2,pba3;
		if(pb1.getText().toString()!="OUT")
		{
		pba1=Integer.parseInt(pb1.getText().toString ());
		}
		else
		{
			pba1=-1;
		}
		if(pb2.getText().toString()!="OUT")
		{
		pba2=Integer.parseInt(pb2.getText().toString ());
		}
		else
		{
			pba2=-1;
		}
		if(pb3.getText().toString()!="OUT")
		{
		pba3=Integer.parseInt(pb3.getText().toString ());
		}
		else
		{
			pba3=-1;
		}
		int dv=Integer.parseInt(dt.getText().toString ());
		if(ps1!=1 && ps1!=10 && ps1!=13 && ps1!=17 && ps1!=52 && ps1!=65 && ps1!=104 && ps1!=112 && ps1!=116 && ps1!=124 && ps1!=132 && ps1>=0 && (dv!=7 ||(ps1!=6 && ps1!=20 && ps1!=43 && ps1!=55 && ps1!=87 && ps1!=106 && ps1!=122 && ps1!=131 && ps1!=134)))
		{
			iv=0;
			i.setText(iv+"");
		if(ps1!=0 && ps1!=ps2 && ps1!=ps3)
		{
		TextView t=(TextView)r1.getChildAt(ps1);
		t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
		}
		else if(ps1==ps3 && ps1!=0)
		{
			TextView t=(TextView)r1.getChildAt(ps1);
			t.setBackgroundColor(Color.parseColor(pc3));
		}
		else if(ps1==ps2 && ps1!=0)
		{
			TextView t=(TextView)r1.getChildAt(ps1);
			t.setBackgroundColor(Color.parseColor(pc2));
		}
		if(ps1+d<=138)
		{
		ps1+=d;
		}
		else if(ps1==134)
		{
			if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
			{
				bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
			}
			else if(ps3!=138 && pb3.getText().toString()!="OUT" && ((ps3!=119)||kv==1) && ((ps3!=129)||kv==1))
			{
				jv=1;
				j.setText(jv+"");
				bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
			}
			else
			{
				jv=1;
				j.setText(jv+"");
				kv=1;
				k.setText(kv+"");
				bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
			}
			return;
		}
		if(ps1==5)
		{
			pba1-=20;
		}
		else if(ps1==8)
		{
			pba1-=50;
		}
		else if(ps1==15)
		{
			pba1-=30;
		}
		else if(ps1==23)
		{
			pba1-=100;
		}
		else if(ps1==25)
		{
			pba1-=50;
		}
		else if(ps1==29)
		{
			pba1+=100;
		}
		else if(ps1==33)
		{
			pba1-=30;
		}
		else if(ps1==35)
		{
			pba1-=100;
		}
		else if(ps1==37)
		{
			pba1-=30;
		}
		else if(ps1==40)
		{
			pba1+=100;
		}
		else if(ps1==42)
		{
			pba1-=50;
		}
		else if(ps1==45)
		{
			pba1-=50;
		}
		else if(ps1==48)
		{
			pba1-=30;
		}
		else if(ps1==50)
		{
			pba1-=50;
		}
		else if(ps1==52)
		{
			pba1-=100;
		}
		else if(ps1==54)
		{
			pba1-=50;
		}
		else if(ps1==57)
		{
			pba1+=200;
		}
		else if(ps1==68)
		{
			pba1-=100;
		}
		else if(ps1==71)
		{
			pba1-=50;
		}
		else if (ps1==74)
		{
			pba1-=100;
		}
		else if(ps1==77)
		{
			pba1-=50;
		}
		else if(ps1==79)
		{
			pba1-=100;
		}
		else if(ps1==80)
		{
			pba1+=200;
		}
		else if(ps1==81)
		{
			pba1-=100;
		}
		else if(ps1==83)
		{
			pba1-=100;
		}
		else if(ps1==85)
		{
			pba1-=50;
		}
		else if(ps1==89)
		{
			pba1+=50;
		}
		else if(ps1==94)
		{
			pba1-=50;
		}
		else if(ps1==97)
		{
			pba1-=50;
		}
		else if(ps1==99)
		{
			pba1-=50;
		}
		else if(ps1==101)
		{
			pba1-=100;
		}
		else if(ps1==102)
		{
			pba1-=10;
		}
		else if(ps1==109)
		{
			pba1-=30;
		}
		else if(ps1==116)
		{
			pba1-=20;
		}
		else if(ps1==127)
		{
			pba1-=20;
		}
		else if(ps1==129)
		{
			pba1-=20;
		}
		else if(ps1==6||ps1==20||ps1==43||ps1==55||ps1==87||ps1==106||ps1==122||ps1==131||ps1==134)
		{
			dv=r.nextInt(12)+1;
			dt.setText(dv+"");
			switch(dv)
			{
			case 1:
				AlertDialog alertDialog = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog.setTitle("Holiday Special!");
			    alertDialog.setMessage("Birth Day gifts from each player of Rs. 50/-");
			    alertDialog.setCanceledOnTouchOutside(true);
			    alertDialog.show();
			    if(pba2!=-1 && pba2>=50)
			    {
			    pba2-=50;
			    pba1+=50;
			    }
			    else if(pba2!=-1)
			    {
			    	pba2-=50;
			    }
			    if(pba3!=-1 && pba3>=50)
			    {
			    pba3-=50;
			    pba1+=50;
			    }
			    else if(pba3!=-1)
			    {
			    	pba3-=50;
			    }
				break;
			case 2:
				AlertDialog alertDialog2 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog2.setTitle("Holiday Special!");
			    alertDialog2.setMessage("Car Insurance Get Rs. 100/-");
			    alertDialog2.setCanceledOnTouchOutside(true);
			    alertDialog2.show();
			    pba1+=100;
				break;
			case 3:
				AlertDialog alertDialog3 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog3.setTitle("Holiday Special!");
			    alertDialog3.setMessage("FALGUNI TOYS \n Award of the best player of game Rs. 100/- \n Holiday Special");
			    alertDialog3.setCanceledOnTouchOutside(true);
			    alertDialog3.show();
			    pba1+=100;
				break;
			case 4:
				AlertDialog alertDialog4 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog4.setTitle("Holiday Special!");
			    alertDialog4.setMessage("Family Insurance Pay Rs. 200/-");
			    alertDialog4.setCanceledOnTouchOutside(true);
			    alertDialog4.show();
			    pba1-=200;
				break;
			case 5:
				final AlertDialog alertDialog5 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog5.setTitle("Holiday Special!");
			    alertDialog5.setMessage("Roll the dice and earn 50 times money of the given number");
			    alertDialog5.setCancelable(false);
			    alertDialog5.setButton("Roll", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog,int which) {
		            	Random r=new Random();
		            	int dr=r.nextInt(6)+1;
		            	if(so==true)
						{
							m.start();
						}
		            	alertDialog5.cancel();
		            	int pba1=Integer.parseInt(pb1.getText().toString());
		            	pba1=pba1+(50*dr);
		            	pb1.setText(pba1+"");
		            	int ps2=Integer.parseInt(p2.getText().toString());
		            	int ps3=Integer.parseInt(p3.getText().toString());
		            	int jv=Integer.parseInt(j.getText().toString());
		            	int kv=Integer.parseInt(k.getText().toString());
		            	if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
						{
							bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
						}
						else if(ps3!=138 && pb3.getText().toString()!="OUT" && ((ps3!=119)||kv==1) && ((ps3!=129)||kv==1))
						{
							jv=1;
							j.setText(jv+"");
							bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
						}
						else
						{
							jv=1;
							j.setText(jv+"");
							kv=1;
							k.setText(kv+"");
							bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
						}
		            	if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                    {
		            	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				dice.setTitle("After rolling, number on the dice:"+dr);
        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
     			            public void onClick(DialogInterface dialog,int which) {
     			            	dice.cancel();
     			            }
     			        });
	                    }
		            	else if(pb2.getText().toString()=="OUT")
		            	{
		            		final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("After rolling, number on the dice:"+dr);
	        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
		            	}
		            	else if(pb3.getText().toString()=="OUT")
		            	{
		            		final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("After rolling, number on the dice:"+dr);
	        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
		            	}
		            }
		        });
			    alertDialog5.show();
				break;
			case 6:
				AlertDialog alertDialog6 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog6.setTitle("Holiday Special!");
			    alertDialog6.setMessage("Car Servicing Charges Rs. 200/-");
			    alertDialog6.setCanceledOnTouchOutside(true);
			    alertDialog6.show();
			    pba1-=200;
				break;
			case 7:
				AlertDialog alertDialog7 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog7.setTitle("Holiday Special!");
			    alertDialog7.setMessage("Wait for six on die");
			    alertDialog7.setCanceledOnTouchOutside(true);
			    alertDialog7.show();
				break;
			case 8:
				AlertDialog alertDialog8 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog8.setTitle("Holiday Special!");
			    alertDialog8.setMessage("Installed car stereo system pay Rs. 250/-");
			    alertDialog8.setCanceledOnTouchOutside(true);
			    alertDialog8.show();
			    pba1-=250;
				break;
			case 9:
				AlertDialog alertDialog9 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog9.setTitle("Holiday Special!");
			    alertDialog9.setMessage("A pair of Designer Eye Glasses Pay Rs. 100/-");
			    alertDialog9.setCanceledOnTouchOutside(true);
			    alertDialog9.show();
			    pba1-=100;
				break;
			case 10:
				AlertDialog alertDialog10 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog10.setTitle("Holiday Special!");
			    alertDialog10.setMessage("Supporting Citizen for a clean Environment Get Rs. 200/-");
			    alertDialog10.setCanceledOnTouchOutside(true);
			    alertDialog10.show();
			    pba1+=200;
				break;
			case 11:
				AlertDialog alertDialog11 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog11.setTitle("Holiday Special!");
			    alertDialog11.setMessage("A Security Man to look after your Home Pay Rs. 100/-");
			    alertDialog11.setCanceledOnTouchOutside(true);
			    alertDialog11.show();
			    pba1-=100;
				break;
			default:
				AlertDialog alertDialog12 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog12.setTitle("Holiday Special!");
			    alertDialog12.setMessage("Sold your old car stereo system get Rs. 200/-");
			    alertDialog12.setCanceledOnTouchOutside(true);
			    alertDialog12.show();
			    pba1+=200;
			}
		}
		else if(ps1==58||ps1==60||ps1==62)
		{
			final Dialog dia= new Dialog(Picnicplay3Activity.this);
			dia.setContentView(R.layout.dialogno1);
			dia.setTitle("Dice Throw of Rs. 100");
			dia.setCancelable(false);
			final RadioGroup rg=(RadioGroup)dia.findViewById(R.id.radio);
			Button bd=(Button)dia.findViewById(R.id.button);
			bd.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					int ds=rg.getCheckedRadioButtonId();
					RadioButton rb=(RadioButton)dia.findViewById(ds);
					if(rb!=null)
					{
					dia.cancel();	
					if(rb.getText().toString().contains("2"))
					{
						no1.setText("2");
						final Dialog dia1= new Dialog(Picnicplay3Activity.this);
						dia1.setContentView(R.layout.dialog1);
						dia1.setTitle("Dice Throw of 0Rs. 100");
						dia1.setCancelable(false);
						final RadioGroup rg1=(RadioGroup)dia1.findViewById(R.id.radio);
						Button bd1=(Button)dia1.findViewById(R.id.button1);
						bd1.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								int ds1=rg1.getCheckedRadioButtonId();
								RadioButton rb1=(RadioButton)dia1.findViewById(ds1);
								if(rb1!=null)
								{
									dia1.cancel();
								if(rb1.getText().toString().contains("3"))
								{
									no2.setText("3");
								}
								else if(rb1.getText().toString().contains("4"))
								{
									no2.setText("4");
								}
								else if(rb1.getText().toString().contains("5"))
								{
									no2.setText("5");
								}
								 Random r=new Random();
				                    int rno=r.nextInt(6)+1;
				                    if(so==true)
	    							{
	    								m.start();
	    							}
				                    int n1=Integer.parseInt(no1.getText().toString());
				                    int n2=Integer.parseInt(no2.getText().toString());
				                    int pba1=Integer.parseInt(pb1.getText().toString());
				                    if(rno==n1 || rno==n2)
				                    {
				                    	pba1+=100;
				                    }
				                    else
				                    {
				                    	pba1-=100;
				                    }
				                    int pba3=Integer.parseInt(pb3.getText().toString());
				                    int pba2=Integer.parseInt(pb2.getText().toString());
				                    int ps3=Integer.parseInt(p3.getText().toString());
				                    int ps2=Integer.parseInt(p2.getText().toString());
				                    int ps1=Integer.parseInt(p1.getText().toString());
				                    int jv=Integer.parseInt(j.getText().toString());
				                    int kv=Integer.parseInt(k.getText().toString());
				                    if(pba1>=0)
									{
									pb1.setText(pba1+"");
									}
				                    else if(pba1==-1)
				            		{
				            		}
				                    else
				                    {
				                    	AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				over.setTitle("Player 1 Out!");
				        				over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
				        				over.setCanceledOnTouchOutside(true);
				        				over.show();
				        				pb1.setText("OUT");
				        				if(ps1==ps3)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps1);
				    						te.setBackgroundColor(Color.parseColor(pc3));
				    					}
				    					else if(ps1==ps2)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps1);
				    						te.setBackgroundColor(Color.parseColor(pc2));
				    					}
				    					else
				    					{
				    						TextView t=(TextView)r1.getChildAt(ps1);
					        				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				    					}
				        				p1.setText("-1");
				                    }
				                    if(pb2.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
									{
										AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
										over.setTitle("Game Over.");
										over.setMessage("1st Position:Player 3 Balance:Rs. "+pba3+"\n"+"2nd Position:Player 1, Player 2 : OUT");
										over.setButton("OK", new DialogInterface.OnClickListener() {
								            public void onClick(DialogInterface dialog,int which) {
								            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
												startActivity(i1);
								            }
								        });
										over.setCancelable(false);
										over.show();
									}
									else if(pb3.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
									{
										AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
										over.setTitle("Game Over.");
										over.setMessage("1st Position:Player 2 Balance:Rs. "+pba2+"\n"+"2nd Position:Player 1, Player 3 : OUT");
										over.setButton("OK", new DialogInterface.OnClickListener() {
								            public void onClick(DialogInterface dialog,int which) {
								            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
												startActivity(i1);
								            }
								        });
										over.setCancelable(false);
										over.show();
									}
									else
									{
										if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
										{
											bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
										}
										else if(ps3!=138 && pb3.getText().toString()!="OUT" && ((ps3!=119)||kv==1) && ((ps3!=129)||kv==1))
										{
											jv=1;
											j.setText(jv+"");
											bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
										}
										else
										{
											if(pb1.getText().toString()!="OUT")
											{
												jv=1;
												j.setText(jv+"");
												kv=1;
												k.setText(kv+"");
												bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
											}
											else if(ps2!=138 && pb2.getText().toString()!="OUT")
											{
												jv=1;
												j.setText(jv+"");
												kv=1;
												k.setText(kv+"");
												bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");	
											}
											else if(ps3!=138 && pb3.getText().toString()!="OUT")
											{
												jv=1;
												j.setText(jv+"");
												kv=1;
												k.setText(kv+"");
												bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
											}
											else
											{
												AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
												over.setTitle("Game Over.");
												over.setCancelable(false);
												if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
												{
													String max="", min="", mid="";
													if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
														}
													}
													else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
														}
													}
													else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
														{
															mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														}
														else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
														{
															mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
														}
													}
													else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
														mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
													}
													else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
													{
														max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
														mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
													}
													else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
													{
														max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
														mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
													}
													else
													{
														max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
													}
													over.setMessage(max+"\n"+mid+"\n"+min);
												}
												else if(pb2.getText().toString()=="OUT")
												{
													if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
													{
														over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
													}
													else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
													{
														over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
													}
												}
												else if(pb1.getText().toString()=="OUT")
												{
													if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
													}
													else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
													}
												}
												else
												{
													if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
													}
													else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
													}
												}
												over.setButton("OK", new DialogInterface.OnClickListener() {
										            public void onClick(DialogInterface dialog,int which) {
										            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
														startActivity(i1);
										            }
										        });
												over.show();
											}
										}
									}
				                    if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			        				dice.setTitle("Dice Thrown:"+rno);
			        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
			        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			     			            public void onClick(DialogInterface dialog,int which) {
			     			            	dice.cancel();
			     			            }
			     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				dice.setTitle("Dice Thrown:"+rno);
				        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
				        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
				     			            public void onClick(DialogInterface dialog,int which) {
				     			            	dice.cancel();
				     			            }
				     			        });	
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				dice.setTitle("Dice Thrown:"+rno);
				        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
				        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
				     			            public void onClick(DialogInterface dialog,int which) {
				     			            	dice.cancel();
				     			            }
				     			        });
				                    }
				                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				dice.setTitle("Dice Thrown:"+rno);
				        				dice.setMessage("Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
				        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
				     			            public void onClick(DialogInterface dialog,int which) {
				     			            	dice.cancel();
				     			            }
				     			        });
				                    }
								}
								else
								{
									Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
								}
							}
						});
						dia1.show();
					}
					else if(rb.getText().toString().contains("3"))
					{
						no1.setText("3");
						final Dialog dia2= new Dialog(Picnicplay3Activity.this);
						dia2.setContentView(R.layout.dialog2);
						dia2.setTitle("Dice Throw of Rs. 100");
						dia2.setCancelable(false);
						final RadioGroup rg2=(RadioGroup)dia2.findViewById(R.id.radio);
						Button bd2=(Button)dia2.findViewById(R.id.button1);
						bd2.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								int ds1=rg2.getCheckedRadioButtonId();
								RadioButton rb1=(RadioButton)dia2.findViewById(ds1);
								if(rb1!=null)
								{
									dia2.cancel();
									if(rb1.getText().toString().contains("3"))
									{
										no2.setText("3");
									}
									else if(rb1.getText().toString().contains("4"))
									{
										no2.setText("4");
									}
									else if(rb1.getText().toString().contains("5"))
									{
										no2.setText("5");
									}
									 Random r=new Random();
					                    int rno=r.nextInt(6)+1;
					                    if(so==true)
		    							{
		    								m.start();
		    							}
					                    int n1=Integer.parseInt(no1.getText().toString());
					                    int n2=Integer.parseInt(no2.getText().toString());
					                    int pba1=Integer.parseInt(pb1.getText().toString());
					                    if(rno==n1 || rno==n2)
					                    {
					                    	pba1+=100;
					                    }
					                    else
					                    {
					                    	pba1-=100;
					                    }
					                    int pba3=Integer.parseInt(pb3.getText().toString());
					                    int pba2=Integer.parseInt(pb2.getText().toString());
					                    int ps3=Integer.parseInt(p3.getText().toString());
					                    int ps2=Integer.parseInt(p2.getText().toString());
					                    int ps1=Integer.parseInt(p1.getText().toString());
					                    int jv=Integer.parseInt(j.getText().toString());
					                    int kv=Integer.parseInt(k.getText().toString());
					                    if(pba1>=0)
										{
										pb1.setText(pba1+"");
										}
					                    else if(pba1==-1)
					            		{
					            		}
					                    else
					                    {
					                    	AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				over.setTitle("Player 1 Out!");
					        				over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
					        				over.setCanceledOnTouchOutside(true);
					        				over.show();
					        				pb1.setText("OUT");
					        				if(ps1==ps3)
					    					{
					    						TextView te=(TextView)r1.getChildAt(ps1);
					    						te.setBackgroundColor(Color.parseColor(pc3));
					    					}
					    					else if(ps1==ps2)
					    					{
					    						TextView te=(TextView)r1.getChildAt(ps1);
					    						te.setBackgroundColor(Color.parseColor(pc2));
					    					}
					    					else
					    					{
					    						TextView t=(TextView)r1.getChildAt(ps1);
						        				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					    					}
					        				p1.setText("-1");
					                    }
					                    if(pb2.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
										{
											AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
											over.setTitle("Game Over.");
											over.setMessage("1st Position:Player 3 Balance:Rs. "+pba3+"\n"+"2nd Position:Player 1, Player 2 : OUT");
											over.setButton("OK", new DialogInterface.OnClickListener() {
									            public void onClick(DialogInterface dialog,int which) {
									            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
													startActivity(i1);
									            }
									        });
											over.setCancelable(false);
											over.show();
										}
										else if(pb3.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
										{
											AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
											over.setTitle("Game Over.");
											over.setMessage("1st Position:Player 2 Balance:Rs. "+pba2+"\n"+"2nd Position:Player 1, Player 3 : OUT");
											over.setButton("OK", new DialogInterface.OnClickListener() {
									            public void onClick(DialogInterface dialog,int which) {
									            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
													startActivity(i1);
									            }
									        });
											over.setCancelable(false);
											over.show();
										}
										else
										{
											if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
											{
												bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
											}
											else if(ps3!=138 && pb3.getText().toString()!="OUT" && ((ps3!=119)||kv==1) && ((ps3!=129)||kv==1))
											{
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
											}
											else
											{
												if(pb1.getText().toString()!="OUT")
												{
													jv=1;
													j.setText(jv+"");
													kv=1;
													k.setText(kv+"");
													bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
												}
												else if(ps2!=138 && pb2.getText().toString()!="OUT")
												{
													jv=1;
													j.setText(jv+"");
													kv=1;
													k.setText(kv+"");
													bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");	
												}
												else if(ps3!=138 && pb3.getText().toString()!="OUT")
												{
													jv=1;
													j.setText(jv+"");
													kv=1;
													k.setText(kv+"");
													bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
												}
												else
												{
													AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
													over.setTitle("Game Over.");
													over.setCancelable(false);
													if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
													{
														String max="", min="", mid="";
														if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
															{
																mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
																min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															}
															else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
															{
																mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
																min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															}
															else
															{
																mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
															}
														}
														else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
															{
																mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
																min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															}
															else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
															{
																mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
																min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															}
															else
															{
																mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
															}
														}
														else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
														{
															max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
															{
																mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
																min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															}
															else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
															{
																mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
																min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															}
															else
															{
																mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
															}
														}
														else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
															mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
														{
															max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
															mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
														}
														else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
														{
															max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
															mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
														}
														else
														{
															max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
														}
														over.setMessage(max+"\n"+mid+"\n"+min);
													}
													else if(pb2.getText().toString()=="OUT")
													{
														if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
														{
															over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
														}
														else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
														{
															over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
														}
														else
														{
															over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
														}
													}
													else if(pb1.getText().toString()=="OUT")
													{
														if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
														{
															over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
														}
														else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
														{
															over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
														}
														else
														{
															over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
														}
													}
													else
													{
														if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
														{
															over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
														}
														else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
														{
															over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
														}
														else
														{
															over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
														}
													}
													over.setButton("OK", new DialogInterface.OnClickListener() {
											            public void onClick(DialogInterface dialog,int which) {
											            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
															startActivity(i1);
											            }
											        });
													over.show();
												}
											}
										}
					                    if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
					                    {
					                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				dice.setTitle("Dice Thrown:"+rno);
				        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
				        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
				     			            public void onClick(DialogInterface dialog,int which) {
				     			            	dice.cancel();
				     			            }
				     			        });
					                    }
					                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
					                    {
					                    	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });	
					                    }
					                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
					                    {
					                    	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
					                    }
					                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
					                    {
					                    	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
					                    }
								}
								else
								{
									Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
								}
							}
						});
						dia2.show();
					}
					else if(rb.getText().toString().contains("4"))
					{
						no1.setText("4");
						final Dialog dia3= new Dialog(Picnicplay3Activity.this);
						dia3.setContentView(R.layout.dialog3);
						dia3.setTitle("Dice Throw of Rs. 100");
						dia3.setCancelable(false);
						final RadioGroup rg3=(RadioGroup)dia3.findViewById(R.id.radio);
						Button bd3=(Button)dia3.findViewById(R.id.button1);
						bd3.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								int ds1=rg3.getCheckedRadioButtonId();
								RadioButton rb1=(RadioButton)dia3.findViewById(ds1);
								if(rb1!=null)
								{
									dia3.cancel();
									if(rb1.getText().toString().contains("3"))
									{
										no2.setText("3");
									}
									else if(rb1.getText().toString().contains("4"))
									{
										no2.setText("4");
									}
									else if(rb1.getText().toString().contains("5"))
									{
										no2.setText("5");
									}
									 Random r=new Random();
					                    int rno=r.nextInt(6)+1;
					                    if(so==true)
		    							{
		    								m.start();
		    							}
					                    int n1=Integer.parseInt(no1.getText().toString());
					                    int n2=Integer.parseInt(no2.getText().toString());
					                    int pba1=Integer.parseInt(pb1.getText().toString());
					                    if(rno==n1 || rno==n2)
					                    {
					                    	pba1+=100;
					                    }
					                    else
					                    {
					                    	pba1-=100;
					                    }
					                    int pba3=Integer.parseInt(pb3.getText().toString());
					                    int pba2=Integer.parseInt(pb2.getText().toString());
					                    int ps3=Integer.parseInt(p3.getText().toString());
					                    int ps2=Integer.parseInt(p2.getText().toString());
					                    int ps1=Integer.parseInt(p1.getText().toString());
					                    int jv=Integer.parseInt(j.getText().toString());
					                    int kv=Integer.parseInt(k.getText().toString());
					                    if(pba1>=0)
										{
										pb1.setText(pba1+"");
										}
					                    else if(pba1==-1)
					            		{
					            		}
					                    else
					                    {
					                    	AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				over.setTitle("Player 1 Out!");
					        				over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
					        				over.setCanceledOnTouchOutside(true);
					        				over.show();
					        				pb1.setText("OUT");
					        				if(ps1==ps3)
					    					{
					    						TextView te=(TextView)r1.getChildAt(ps1);
					    						te.setBackgroundColor(Color.parseColor(pc3));
					    					}
					    					else if(ps1==ps2)
					    					{
					    						TextView te=(TextView)r1.getChildAt(ps1);
					    						te.setBackgroundColor(Color.parseColor(pc2));
					    					}
					    					else
					    					{
					    						TextView t=(TextView)r1.getChildAt(ps1);
						        				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					    					}
					        				p1.setText("-1");
					                    }
					                    if(pb2.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
										{
											AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
											over.setTitle("Game Over.");
											over.setMessage("1st Position:Player 3 Balance:Rs. "+pba3+"\n"+"2nd Position:Player 1, Player 2 : OUT");
											over.setButton("OK", new DialogInterface.OnClickListener() {
									            public void onClick(DialogInterface dialog,int which) {
									            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
													startActivity(i1);
									            }
									        });
											over.setCancelable(false);
											over.show();
										}
										else if(pb3.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
										{
											AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
											over.setTitle("Game Over.");
											over.setMessage("1st Position:Player 2 Balance:Rs. "+pba2+"\n"+"2nd Position:Player 1, Player 3 : OUT");
											over.setButton("OK", new DialogInterface.OnClickListener() {
									            public void onClick(DialogInterface dialog,int which) {
									            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
													startActivity(i1);
									            }
									        });
											over.setCancelable(false);
											over.show();
										}
										else
										{
											if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
											{
												bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
											}
											else if(ps3!=138 && pb3.getText().toString()!="OUT" && ((ps3!=119)||kv==1) && ((ps3!=129)||kv==1))
											{
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
											}
											else
											{
												if(pb1.getText().toString()!="OUT")
												{
													jv=1;
													j.setText(jv+"");
													kv=1;
													k.setText(kv+"");
													bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
												}
												else if(ps2!=138 && pb2.getText().toString()!="OUT")
												{
													jv=1;
													j.setText(jv+"");
													kv=1;
													k.setText(kv+"");
													bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");	
												}
												else if(ps3!=138 && pb3.getText().toString()!="OUT")
												{
													jv=1;
													j.setText(jv+"");
													kv=1;
													k.setText(kv+"");
													bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
												}
												else
												{
													AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
													over.setTitle("Game Over.");
													over.setCancelable(false);
													if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
													{
														String max="", min="", mid="";
														if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
															{
																mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
																min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															}
															else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
															{
																mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
																min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															}
															else
															{
																mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
															}
														}
														else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
															{
																mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
																min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															}
															else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
															{
																mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
																min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															}
															else
															{
																mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
															}
														}
														else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
														{
															max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
															{
																mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
																min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															}
															else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
															{
																mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
																min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															}
															else
															{
																mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
															}
														}
														else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
															mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
														{
															max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
															mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
														}
														else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
														{
															max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
															mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
														}
														else
														{
															max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
														}
														over.setMessage(max+"\n"+mid+"\n"+min);
													}
													else if(pb2.getText().toString()=="OUT")
													{
														if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
														{
															over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
														}
														else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
														{
															over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
														}
														else
														{
															over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
														}
													}
													else if(pb1.getText().toString()=="OUT")
													{
														if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
														{
															over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
														}
														else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
														{
															over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
														}
														else
														{
															over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
														}
													}
													else
													{
														if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
														{
															over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
														}
														else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
														{
															over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
														}
														else
														{
															over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
														}
													}
													over.setButton("OK", new DialogInterface.OnClickListener() {
											            public void onClick(DialogInterface dialog,int which) {
											            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
															startActivity(i1);
											            }
											        });
													over.show();
												}
											}
										}
					                    if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
					                    {
					                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				dice.setTitle("Dice Thrown:"+rno);
				        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
				        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
				     			            public void onClick(DialogInterface dialog,int which) {
				     			            	dice.cancel();
				     			            }
				     			        });
					                    }
					                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
					                    {
					                    	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });	
					                    }
					                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
					                    {
					                    	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
					                    }
					                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
					                    {
					                    	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
					                    }
								}
								else
								{
									Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
								}
							}
						});
						dia3.show();
					}
					else if(rb.getText().toString().contains("5"))
					{
						no1.setText("5");
						final Dialog dia4= new Dialog(Picnicplay3Activity.this);
						dia4.setContentView(R.layout.dialog4);
						dia4.setTitle("Dice Throw of Rs. 100");
						dia4.setCancelable(false);
						final RadioGroup rg4=(RadioGroup)dia4.findViewById(R.id.radio);
						Button bd4=(Button)dia4.findViewById(R.id.button1);
						bd4.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								int ds1=rg4.getCheckedRadioButtonId();
								RadioButton rb1=(RadioButton)dia4.findViewById(ds1);
								if(rb1!=null)
								{
									dia4.cancel();
									if(rb1.getText().toString().contains("3"))
									{
										no2.setText("3");
									}
									else if(rb1.getText().toString().contains("4"))
									{
										no2.setText("4");
									}
									else if(rb1.getText().toString().contains("5"))
									{
										no2.setText("5");
									}
									 Random r=new Random();
					                    int rno=r.nextInt(6)+1;
					                    if(so==true)
		    							{
		    								m.start();
		    							}
					                    int n1=Integer.parseInt(no1.getText().toString());
					                    int n2=Integer.parseInt(no2.getText().toString());
					                    int pba1=Integer.parseInt(pb1.getText().toString());
					                    if(rno==n1 || rno==n2)
					                    {
					                    	pba1+=100;
					                    }
					                    else
					                    {
					                    	pba1-=100;
					                    }
					                    int pba3=Integer.parseInt(pb3.getText().toString());
					                    int pba2=Integer.parseInt(pb2.getText().toString());
					                    int ps3=Integer.parseInt(p3.getText().toString());
					                    int ps2=Integer.parseInt(p2.getText().toString());
					                    int ps1=Integer.parseInt(p1.getText().toString());
					                    int jv=Integer.parseInt(j.getText().toString());
					                    int kv=Integer.parseInt(k.getText().toString());
					                    if(pba1>=0)
										{
										pb1.setText(pba1+"");
										}
					                    else if(pba1==-1)
					            		{
					            		}
					                    else
					                    {
					                    	AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				over.setTitle("Player 1 Out!");
					        				over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
					        				over.setCanceledOnTouchOutside(true);
					        				over.show();
					        				pb1.setText("OUT");
					        				if(ps1==ps3)
					    					{
					    						TextView te=(TextView)r1.getChildAt(ps1);
					    						te.setBackgroundColor(Color.parseColor(pc3));
					    					}
					    					else if(ps1==ps2)
					    					{
					    						TextView te=(TextView)r1.getChildAt(ps1);
					    						te.setBackgroundColor(Color.parseColor(pc2));
					    					}
					    					else
					    					{
					    						TextView t=(TextView)r1.getChildAt(ps1);
						        				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					    					}
					        				p1.setText("-1");
					                    }
					                    if(pb2.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
										{
											AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
											over.setTitle("Game Over.");
											over.setMessage("1st Position:Player 3 Balance:Rs. "+pba3+"\n"+"2nd Position:Player 1, Player 2 : OUT");
											over.setButton("OK", new DialogInterface.OnClickListener() {
									            public void onClick(DialogInterface dialog,int which) {
									            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
													startActivity(i1);
									            }
									        });
											over.setCancelable(false);
											over.show();
										}
										else if(pb3.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
										{
											AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
											over.setTitle("Game Over.");
											over.setMessage("1st Position:Player 2 Balance:Rs. "+pba2+"\n"+"2nd Position:Player 1, Player 3 : OUT");
											over.setButton("OK", new DialogInterface.OnClickListener() {
									            public void onClick(DialogInterface dialog,int which) {
									            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
													startActivity(i1);
									            }
									        });
											over.setCancelable(false);
											over.show();
										}
										else
										{
											if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
											{
												bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
											}
											else if(ps3!=138 && pb3.getText().toString()!="OUT" && ((ps3!=119)||kv==1) && ((ps3!=129)||kv==1))
											{
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
											}
											else
											{
												if(pb1.getText().toString()!="OUT")
												{
													jv=1;
													j.setText(jv+"");
													kv=1;
													k.setText(kv+"");
													bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
												}
												else if(ps2!=138 && pb2.getText().toString()!="OUT")
												{
													jv=1;
													j.setText(jv+"");
													kv=1;
													k.setText(kv+"");
													bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");	
												}
												else if(ps3!=138 && pb3.getText().toString()!="OUT")
												{
													jv=1;
													j.setText(jv+"");
													kv=1;
													k.setText(kv+"");
													bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
												}
												else
												{
													AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
													over.setTitle("Game Over.");
													over.setCancelable(false);
													if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
													{
														String max="", min="", mid="";
														if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
															{
																mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
																min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															}
															else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
															{
																mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
																min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															}
															else
															{
																mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
															}
														}
														else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
															{
																mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
																min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															}
															else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
															{
																mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
																min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															}
															else
															{
																mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
															}
														}
														else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
														{
															max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
															{
																mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
																min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															}
															else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
															{
																mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
																min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															}
															else
															{
																mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
															}
														}
														else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
															mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
														{
															max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
															mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
														}
														else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
														{
															max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
															mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
														}
														else
														{
															max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
														}
														over.setMessage(max+"\n"+mid+"\n"+min);
													}
													else if(pb2.getText().toString()=="OUT")
													{
														if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
														{
															over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
														}
														else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
														{
															over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
														}
														else
														{
															over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
														}
													}
													else if(pb1.getText().toString()=="OUT")
													{
														if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
														{
															over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
														}
														else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
														{
															over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
														}
														else
														{
															over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
														}
													}
													else
													{
														if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
														{
															over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
														}
														else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
														{
															over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
														}
														else
														{
															over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
														}
													}
													over.setButton("OK", new DialogInterface.OnClickListener() {
											            public void onClick(DialogInterface dialog,int which) {
											            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
															startActivity(i1);
											            }
											        });
													over.show();
												}
											}
										}
					                    if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
					                    {
					                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				dice.setTitle("Dice Thrown:"+rno);
				        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
				        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
				     			            public void onClick(DialogInterface dialog,int which) {
				     			            	dice.cancel();
				     			            }
				     			        });
					                    }
					                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
					                    {
					                    	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });	
					                    }
					                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
					                    {
					                    	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
					                    }
					                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
					                    {
					                    	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
					                    }
								}
								else
								{
									Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
								}
							}
						});
						dia4.show();
					}
					}
					else
					{
						Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
					}
				}
			});
			dia.show();
		}
		if(pba1>=0)
		{
		pb1.setText(pba1+"");
		}
		else if(pba1==-1)
		{
		}
		else
        {
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Player 1 Out!");
			over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
			over.setCanceledOnTouchOutside(true);
			over.show();
			pb1.setText("OUT");
			if(ps1==ps3)
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundColor(Color.parseColor(pc3));
			}
			else if(ps1==ps2)
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundColor(Color.parseColor(pc2));
			}
			else
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
			}
			p1.setText("-1");
        }
		if(pba2>=0)
		{
			pb2.setText(pba2+"");
		}
		else if(pba2==-1)
		{
		}
		else
        {
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Player 2 Out!");
			over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
			over.setCanceledOnTouchOutside(true);
			over.show();
			pb2.setText("OUT");
			if(ps1==ps2)
			{
				TextView te=(TextView)r1.getChildAt(ps2);
				te.setBackgroundColor(Color.parseColor(pc1));
			}
			else if(ps3==ps2)
			{
				TextView te=(TextView)r1.getChildAt(ps2);
				te.setBackgroundColor(Color.parseColor(pc3));
			}
			else
			{
				TextView te=(TextView)r1.getChildAt(ps2);
				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
			}
			p2.setText("-1");
        }
		if(pba3>=0)
		{
			pb3.setText(pba3+"");
		}
		else if(pba3==-1)
		{
		}
		else
		{
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Player 3 Out!");
			over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
			over.setCanceledOnTouchOutside(true);
			over.show();
			pb3.setText("OUT");
			if(ps2==ps3)
			{
				TextView te=(TextView)r1.getChildAt(ps3);
				te.setBackgroundColor(Color.parseColor(pc2));
			}
			else if(ps1==ps3)
			{
				TextView te=(TextView)r1.getChildAt(ps3);
				te.setBackgroundColor(Color.parseColor(pc1));
			}
			else
			{
				TextView te=(TextView)r1.getChildAt(ps3);
				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
			}
			p3.setText("-1");
		}
		if(p1.getText().toString()!="-1")
		{
		p1.setText(ps1+"");
		TextView t2=(TextView)r1.getChildAt(ps1);
		t2.setBackgroundColor(Color.parseColor(pc1));
		}
		}
		else if(ps1==13 || ps1==17)
		{
			if(ps1!=0 && ps1!=ps2 && ps1!=ps3)
			{
				TextView t=(TextView)r1.getChildAt(ps1);
				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
			}
			else if(ps1==ps3)
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundColor(Color.parseColor(pc3));
			}
			else if(ps1==ps2)
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundColor(Color.parseColor(pc2));
			}
			ps1=d;
			TextView te=(TextView)r1.getChildAt(ps1);
			te.setBackgroundColor(Color.parseColor(pc1));
			if(ps1==5)
			{
				pba1-=20;
			}
			else if(ps1==8)
			{
				pba1-=50;
			}
			else if(ps1==15)
			{
				pba1-=30;
			}
			else if(ps1==23)
			{
				pba1-=100;
			}
			else if(ps1==25)
			{
				pba1-=50;
			}
			else if(ps1==29)
			{
				pba1+=100;
			}
			else if(ps1==33)
			{
				pba1-=30;
			}
			else if(ps1==35)
			{
				pba1-=100;
			}
			else if(ps1==37)
			{
				pba1-=30;
			}
			else if(ps1==40)
			{
				pba1+=100;
			}
			else if(ps1==42)
			{
				pba1-=50;
			}
			else if(ps1==45)
			{
				pba1-=50;
			}
			else if(ps1==48)
			{
				pba1-=30;
			}
			else if(ps1==50)
			{
				pba1-=50;
			}
			else if(ps1==52)
			{
				pba1-=100;
			}
			else if(ps1==54)
			{
				pba1-=50;
			}
			else if(ps1==57)
			{
				pba1+=200;
			}
			else if(ps1==68)
			{
				pba1-=100;
			}
			else if(ps1==71)
			{
				pba1-=50;
			}
			else if (ps1==74)
			{
				pba1-=100;
			}
			else if(ps1==77)
			{
				pba1-=50;
			}
			else if(ps1==79)
			{
				pba1-=100;
			}
			else if(ps1==80)
			{
				pba1+=200;
			}
			else if(ps1==81)
			{
				pba1-=100;
			}
			else if(ps1==83)
			{
				pba1-=100;
			}
			else if(ps1==85)
			{
				pba1-=50;
			}
			else if(ps1==89)
			{
				pba1+=50;
			}
			else if(ps1==94)
			{
				pba1-=50;
			}
			else if(ps1==97)
			{
				pba1-=50;
			}
			else if(ps1==99)
			{
				pba1-=50;
			}
			else if(ps1==101)
			{
				pba1-=100;
			}
			else if(ps1==102)
			{
				pba1-=10;
			}
			else if(ps1==109)
			{
				pba1-=30;
			}
			else if(ps1==116)
			{
				pba1-=20;
			}
			else if(ps1==127)
			{
				pba1-=20;
			}
			else if(ps1==129)
			{
				pba1-=20;
			}
			else if(ps1==6||ps1==20||ps1==43||ps1==55||ps1==87||ps1==106||ps1==122||ps1==131||ps1==134)
			{
				dv=r.nextInt(12)+1;
				dt.setText(dv+"");
				switch(dv)
				{
				case 1:
					AlertDialog alertDialog = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog.setTitle("Holiday Special!");
				    alertDialog.setMessage("Birth Day gifts from each player of Rs. 50/-");
				    alertDialog.setCanceledOnTouchOutside(true);
				    alertDialog.show();
				    if(pba2!=-1 && pba2>=50)
				    {
				    pba2-=50;
				    pba1+=50;
				    }
				    else if(pba2!=-1)
				    {
				    	pba2-=50;
				    }
				    if(pba3!=-1 && pba3>=50)
				    {
				    pba3-=50;
				    pba1+=50;
				    }
				    else if(pba3!=-1)
				    {
				    	pba3-=50;
				    }
					break;
				case 2:
					AlertDialog alertDialog2 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog2.setTitle("Holiday Special!");
				    alertDialog2.setMessage("Car Insurance Get Rs. 100/-");
				    alertDialog2.setCanceledOnTouchOutside(true);
				    alertDialog2.show();
				    pba1+=100;
					break;
				case 3:
					AlertDialog alertDialog3 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog3.setTitle("Holiday Special!");
				    alertDialog3.setMessage("FALGUNI TOYS \n Award of the best player of game Rs. 100/- \n Holiday Special");
				    alertDialog3.setCanceledOnTouchOutside(true);
				    alertDialog3.show();
				    pba1+=100;
					break;
				case 4:
					AlertDialog alertDialog4 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog4.setTitle("Holiday Special!");
				    alertDialog4.setMessage("Family Insurance Pay Rs. 200/-");
				    alertDialog4.setCanceledOnTouchOutside(true);
				    alertDialog4.show();
				    pba1-=200;
					break;
				case 5:
					final AlertDialog alertDialog5 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog5.setTitle("Holiday Special!");
				    alertDialog5.setMessage("Roll the dice and earn 50 times money of the given number");
				    alertDialog5.setCancelable(false);
				    alertDialog5.setButton("Roll", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog,int which) {
			            	Random r=new Random();
			            	int dr=r.nextInt(6)+1;
			            	if(so==true)
							{
								m.start();
							}
			            	alertDialog5.cancel();
			            	int pba1=Integer.parseInt(pb1.getText().toString());
			            	pba1=pba1+(50*dr);
			            	pb1.setText(pba1+"");
			            	int ps2=Integer.parseInt(p2.getText().toString());
			            	int ps3=Integer.parseInt(p3.getText().toString());
			            	int jv=Integer.parseInt(j.getText().toString());
			            	int kv=Integer.parseInt(k.getText().toString());
			            	if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
							{
								bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
							}
							else if(ps3!=138 && pb3.getText().toString()!="OUT" && ((ps3!=119)||kv==1) && ((ps3!=129)||kv==1))
							{
								jv=1;
								j.setText(jv+"");
								bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
							}
							else
							{
								jv=1;
								j.setText(jv+"");
								kv=1;
								k.setText(kv+"");
								bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
							}
			            	if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
		                    {
			            	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("After rolling, number on the dice:"+dr);
	        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
		                    }
			            	else if(pb2.getText().toString()=="OUT")
			            	{
			            		final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("After rolling, number on the dice:"+dr);
		        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"f Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
			            	}
			            	else if(pb3.getText().toString()=="OUT")
			            	{
			            		final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("After rolling, number on the dice:"+dr);
		        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
			            	}
			            	}
			        });
				    alertDialog5.show();
					break;
				case 6:
					AlertDialog alertDialog6 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog6.setTitle("Holiday Special!");
				    alertDialog6.setMessage("Car Servicing Charges Rs. 200/-");
				    alertDialog6.setCanceledOnTouchOutside(true);
				    alertDialog6.show();
				    pba1-=200;
					break;
				case 7:
					AlertDialog alertDialog7 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog7.setTitle("Holiday Special!");
				    alertDialog7.setMessage("Wait for six on die");
				    alertDialog7.setCanceledOnTouchOutside(true);
				    alertDialog7.show();
					break;
				case 8:
					AlertDialog alertDialog8 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog8.setTitle("Holiday Special!");
				    alertDialog8.setMessage("Installed car stereo system pay Rs. 250/-");
				    alertDialog8.setCanceledOnTouchOutside(true);
				    alertDialog8.show();
				    pba1-=250;
					break;
				case 9:
					AlertDialog alertDialog9 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog9.setTitle("Holiday Special!");
				    alertDialog9.setMessage("A pair of Designer Eye Glasses Pay Rs. 100/-");
				    alertDialog9.setCanceledOnTouchOutside(true);
				    alertDialog9.show();
				    pba1-=100;
					break;
				case 10:
					AlertDialog alertDialog10 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog10.setTitle("Holiday Special!");
				    alertDialog10.setMessage("Supporting Citizen for a clean Environment Get Rs. 200/-");
				    alertDialog10.setCanceledOnTouchOutside(true);
				    alertDialog10.show();
				    pba1+=200;
					break;
				case 11:
					AlertDialog alertDialog11 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog11.setTitle("Holiday Special!");
				    alertDialog11.setMessage("A Security Man to look after your Home Pay Rs. 100/-");
				    alertDialog11.setCanceledOnTouchOutside(true);
				    alertDialog11.show();
				    pba1-=100;
					break;
				default:
					AlertDialog alertDialog12 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog12.setTitle("Holiday Special!");
				    alertDialog12.setMessage("Sold your old car stereo system get Rs. 200/-");
				    alertDialog12.setCanceledOnTouchOutside(true);
				    alertDialog12.show();
				    pba1+=200;
				}
			}
			if(pba1>=0)
			{
			pb1.setText(pba1+"");
			}
			else if(pba1==-1)
			{
			}
			else
            {
				AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				over.setTitle("Player 1 Out!");
				over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
				over.setCanceledOnTouchOutside(true);
				over.show();
				pb1.setText("OUT");
				if(ps1==ps3)
				{
					TextView t=(TextView)r1.getChildAt(ps1);
					t.setBackgroundColor(Color.parseColor(pc3));
				}
				else if(ps1==ps2)
				{
					TextView t=(TextView)r1.getChildAt(ps1);
					t.setBackgroundColor(Color.parseColor(pc2));
				}
				else
				{
					TextView t=(TextView)r1.getChildAt(ps1);
    				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
    			p1.setText("-1");
            }
			if(pba2>=0)
			{
			pb2.setText(pba2+"");
			}
			else if(pba2==-1)
			{
			}
			else
            {
				AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				over.setTitle("Player 2 Out!");
				over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
				over.setCanceledOnTouchOutside(true);
				over.show();
				pb2.setText("OUT");
				if(ps1==ps2)
				{
					TextView t=(TextView)r1.getChildAt(ps2);
					t.setBackgroundColor(Color.parseColor(pc1));
				}
				else if(ps3==ps2)
				{
					TextView t=(TextView)r1.getChildAt(ps2);
					t.setBackgroundColor(Color.parseColor(pc3));
				}
				else
				{
					TextView t=(TextView)r1.getChildAt(ps2);
    				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
    			p2.setText("-1");
            }
			if(pba3>=0)
			{
			pb3.setText(pba3+"");
			}
			else if(pba3==-1)
			{
			}
			else
            {
				AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				over.setTitle("Player 3 Out!");
				over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
				over.setCanceledOnTouchOutside(true);
				over.show();
				pb3.setText("OUT");
				if(ps3==ps2)
				{
					TextView t=(TextView)r1.getChildAt(ps3);
					t.setBackgroundColor(Color.parseColor(pc2));
				}
				else if(ps3==ps1)
				{
					TextView t=(TextView)r1.getChildAt(ps3);
					t.setBackgroundColor(Color.parseColor(pc1));
				}
				else
				{
					TextView t=(TextView)r1.getChildAt(ps3);
    				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
    			p3.setText("-1");
            }
			if(p1.getText().toString()!="-1")
			{
			p1.setText(ps1+"");
			TextView t2=(TextView)r1.getChildAt(ps1);
			t2.setBackgroundColor(Color.parseColor(pc1));
			}
		}
		else if(ps1==52)
		{
			if(d==2)
			{
				if(ps1!=0 && ps1!=ps2 && ps1!=ps3)
				{
					TextView t=(TextView)r1.getChildAt(ps1);
					t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
				else if(ps1==ps3)
				{
					TextView te=(TextView)r1.getChildAt(ps1);
					te.setBackgroundColor(Color.parseColor(pc3));
				}
				else if(ps1==ps2)
				{
					TextView te=(TextView)r1.getChildAt(ps1);
					te.setBackgroundColor(Color.parseColor(pc2));
				}
				if(ps1+d<=138)
				{
				ps1+=d;
				}
				if(ps1==5)
				{
					pba1-=20;
				}
				else if(ps1==8)
				{
					pba1-=50;
				}
				else if(ps1==15)
				{
					pba1-=30;
				}
				else if(ps1==23)
				{
					pba1-=100;
				}
				else if(ps1==25)
				{
					pba1-=50;
				}
				else if(ps1==29)
				{
					pba1+=100;
				}
				else if(ps1==33)
				{
					pba1-=30;
				}
				else if(ps1==35)
				{
					pba1-=100;
				}
				else if(ps1==37)
				{
					pba1-=30;
				}
				else if(ps1==40)
				{
					pba1+=100;
				}
				else if(ps1==42)
				{
					pba1-=50;
				}
				else if(ps1==45)
				{
					pba1-=50;
				}
				else if(ps1==48)
				{
					pba1-=30;
				}
				else if(ps1==50)
				{
					pba1-=50;
				}
				else if(ps1==52)
				{
					pba1-=100;
				}
				else if(ps1==54)
				{
					pba1-=50;
				}
				else if(ps1==57)
				{
					pba1+=200;
				}
				else if(ps1==68)
				{
					pba1-=100;
				}
				else if(ps1==71)
				{
					pba1-=50;
				}
				else if (ps1==74)
				{
					pba1-=100;
				}
				else if(ps1==77)
				{
					pba1-=50;
				}
				else if(ps1==79)
				{
					pba1-=100;
				}
				else if(ps1==80)
				{
					pba1+=200;
				}
				else if(ps1==81)
				{
					pba1-=100;
				}
				else if(ps1==83)
				{
					pba1-=100;
				}
				else if(ps1==85)
				{
					pba1-=50;
				}
				else if(ps1==89)
				{
					pba1+=50;
				}
				else if(ps1==94)
				{
					pba1-=50;
				}
				else if(ps1==97)
				{
					pba1-=50;
				}
				else if(ps1==99)
				{
					pba1-=50;
				}
				else if(ps1==101)
				{
					pba1-=100;
				}
				else if(ps1==102)
				{
					pba1-=10;
				}
				else if(ps1==109)
				{
					pba1-=30;
				}
				else if(ps1==116)
				{
					pba1-=20;
				}
				else if(ps1==127)
				{
					pba1-=20;
				}
				else if(ps1==129)
				{
					pba1-=20;
				}
				if(pba1>=0)
				{
				pb1.setText(pba1+"");
				}
				else if(pba1==-1)
				{
				}
				else
                {
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				over.setTitle("Player 1 Out!");
    				over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
    				over.setCanceledOnTouchOutside(true);
    				over.show();
    				pb1.setText("OUT");
    				if(ps1==ps3)
					{
						TextView te=(TextView)r1.getChildAt(ps1);
						te.setBackgroundColor(Color.parseColor(pc3));
					}
					else if(ps1==ps2)
					{
						TextView te=(TextView)r1.getChildAt(ps1);
						te.setBackgroundColor(Color.parseColor(pc2));
					}
					else
					{
						TextView te=(TextView)r1.getChildAt(ps1);
        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					}
        			p1.setText("-1");
                }
				if(p1.getText().toString()!="-1")
				{
				p1.setText(ps1+"");
				TextView t2=(TextView)r1.getChildAt(ps1);
				t2.setBackgroundColor(Color.parseColor(pc1));
				}
			}
		}
		else
		{
			if(d==6)
			{
				dv=0;
				dt.setText(dv+"");
				if(ps1!=0 && ps1!=ps2 && ps1!=ps3)
				{
				TextView t=(TextView)r1.getChildAt(ps1);
				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
				else if(ps1==ps3)
				{
					TextView t=(TextView)r1.getChildAt(ps1);
					t.setBackgroundColor(Color.parseColor(pc3));
				}
				else if(ps1==ps2)
				{
					TextView t=(TextView)r1.getChildAt(ps1);
					t.setBackgroundColor(Color.parseColor(pc2));
				}
				if(ps1+d<=138)
				{
				ps1+=d;
				}
				if(ps1==5)
				{
					pba1-=20;
				}
				else if(ps1==8)
				{
					pba1-=50;
				}
				else if(ps1==15)
				{
					pba1-=30;
				}
				else if(ps1==23)
				{
					pba1-=100;
				}
				else if(ps1==25)
				{
					pba1-=50;
				}
				else if(ps1==29)
				{
					pba1+=100;
				}
				else if(ps1==33)
				{
					pba1-=30;
				}
				else if(ps1==35)
				{
					pba1-=100;
				}
				else if(ps1==37)
				{
					pba1-=30;
				}
				else if(ps1==40)
				{
					pba1+=100;
				}
				else if(ps1==42)
				{
					pba1-=50;
				}
				else if(ps1==45)
				{
					pba1-=50;
				}
				else if(ps1==48)
				{
					pba1-=30;
				}
				else if(ps1==50)
				{
					pba1-=50;
				}
				else if(ps1==52)
				{
					pba1-=100;
				}
				else if(ps1==54)
				{
					pba1-=50;
				}
				else if(ps1==57)
				{
					pba1+=200;
				}
				else if(ps1==68)
				{
					pba1-=100;
				}
				else if(ps1==71)
				{
					pba1-=50;
				}
				else if (ps1==74)
				{
					pba1-=100;
				}
				else if(ps1==77)
				{
					pba1-=50;
				}
				else if(ps1==79)
				{
					pba1-=100;
				}
				else if(ps1==80)
				{
					pba1+=200;
				}
				else if(ps1==81)
				{
					pba1-=100;
				}
				else if(ps1==83)
				{
					pba1-=100;
				}
				else if(ps1==85)
				{
					pba1-=50;
				}
				else if(ps1==89)
				{
					pba1+=50;
				}
				else if(ps1==94)
				{
					pba1-=50;
				}
				else if(ps1==97)
				{
					pba1-=50;
				}
				else if(ps1==99)
				{
					pba1-=50;
				}
				else if(ps1==101)
				{
					pba1-=100;
				}
				else if(ps1==102)
				{
					pba1-=10;
				}
				else if(ps1==109)
				{
					pba1-=30;
				}
				else if(ps1==116)
				{
					pba1-=20;
				}
				else if(ps1==127)
				{
					pba1-=20;
				}
				else if(ps1==129)
				{
					pba1-=20;
				}
				else if(ps1==6||ps1==20||ps1==43||ps1==55||ps1==87||ps1==106||ps1==122||ps1==131||ps1==134)
				{
					dv=r.nextInt(12)+1;
					dt.setText(dv+"");
					switch(dv)
					{
					case 1:
						AlertDialog alertDialog = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog.setTitle("Holiday Special!");
    				    alertDialog.setMessage("Birth Day gifts from each player of Rs. 50/-");
    				    alertDialog.setCanceledOnTouchOutside(true);
    				    alertDialog.show();
    				    if(pba2!=-1 && pba2>=50)
    				    {
    				    pba2-=50;
    				    pba1+=50;
    				    }
    				    else if(pba2!=-1)
    				    {
    				    	pba2-=50;
    				    }
    				    if(pba3!=-1 && pba3>=50)
    				    {
    				    pba3-=50;
    				    pba1+=50;
    				    }
    				    else if(pba3!=-1)
    				    {
    				    	pba3-=50;
    				    }
						break;
					case 2:
						AlertDialog alertDialog2 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog2.setTitle("Holiday Special!");
    				    alertDialog2.setMessage("Car Insurance Get Rs. 100/-");
    				    alertDialog2.setCanceledOnTouchOutside(true);
    				    alertDialog2.show();
    				    pba1+=100;
						break;
					case 3:
						AlertDialog alertDialog3 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog3.setTitle("Holiday Special!");
    				    alertDialog3.setMessage("FALGUNI TOYS \n Award of the best player of game Rs. 100/- \n Holiday Special");
    				    alertDialog3.setCanceledOnTouchOutside(true);
    				    alertDialog3.show();
    				    pba1+=100;
						break;
					case 4:
						AlertDialog alertDialog4 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog4.setTitle("Holiday Special!");
    				    alertDialog4.setMessage("Family Insurance Pay Rs. 200/-");
    				    alertDialog4.setCanceledOnTouchOutside(true);
    				    alertDialog4.show();
    				    pba1-=200;
						break;
					case 5:
						final AlertDialog alertDialog5 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog5.setTitle("Holiday Special!");
    				    alertDialog5.setMessage("Roll the dice and earn 50 times money of the given number");
    				    alertDialog5.setCancelable(false);
    				    alertDialog5.setButton("Roll", new DialogInterface.OnClickListener() {
    			            public void onClick(DialogInterface dialog,int which) {
    			            	Random r=new Random();
    			            	int dr=r.nextInt(6)+1;
    			            	if(so==true)
    							{
    								m.start();
    							}
    			            	alertDialog5.cancel();
    			            	int pba1=Integer.parseInt(pb1.getText().toString());
    			            	pba1=pba1+(50*dr);
    			            	pb1.setText(pba1+"");
    			            	int ps2=Integer.parseInt(p2.getText().toString());
    			            	int ps3=Integer.parseInt(p3.getText().toString());
    			            	int jv=Integer.parseInt(j.getText().toString());
    			            	int kv=Integer.parseInt(k.getText().toString());
    			            	if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
    							{
    								bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
    							}
    							else if(ps3!=138 && pb3.getText().toString()!="OUT" && ((ps3!=119)||kv==1) && ((ps3!=129)||kv==1))
    							{
    								jv=1;
    								j.setText(jv+"");
    								bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
    							}
    							else
    							{
    								jv=1;
    								j.setText(jv+"");
    								kv=1;
    								k.setText(kv+"");
    								bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
    							}
    			            	if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
    		                    {
    			            	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    	        				dice.setTitle("After rolling, number on the dice:"+dr);
    	        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
    	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
    	     			            public void onClick(DialogInterface dialog,int which) {
    	     			            	dice.cancel();
    	     			            }
    	     			        });
    		                    }
    			            	else if(pb2.getText().toString()=="OUT")
    			            	{
    			            		final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    		        				dice.setTitle("After rolling, number on the dice:"+dr);
    		        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"f Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
    		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
    		     			            public void onClick(DialogInterface dialog,int which) {
    		     			            	dice.cancel();
    		     			            }
    		     			        });
    			            	}
    			            	else if(pb3.getText().toString()=="OUT")
    			            	{
    			            		final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    		        				dice.setTitle("After rolling, number on the dice:"+dr);
    		        				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
    		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
    		     			            public void onClick(DialogInterface dialog,int which) {
    		     			            	dice.cancel();
    		     			            }
    		     			        });
    			            	}
    			            	}
    			        });
    				    alertDialog5.show();
						break;
					case 6:
						AlertDialog alertDialog6 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog6.setTitle("Holiday Special!");
    				    alertDialog6.setMessage("Car Servicing Charges Rs. 200/-");
    				    alertDialog6.setCanceledOnTouchOutside(true);
    				    alertDialog6.show();
    				    pba1-=200;
						break;
					case 7:
						AlertDialog alertDialog7 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog7.setTitle("Holiday Special!");
    				    alertDialog7.setMessage("Wait for six on die");
    				    alertDialog7.setCanceledOnTouchOutside(true);
    				    alertDialog7.show();
						break;
					case 8:
						AlertDialog alertDialog8 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog8.setTitle("Holiday Special!");
    				    alertDialog8.setMessage("Installed car stereo system pay Rs. 250/-");
    				    alertDialog8.setCanceledOnTouchOutside(true);
    				    alertDialog8.show();
    				    pba1-=250;
						break;
					case 9:
						AlertDialog alertDialog9 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog9.setTitle("Holiday Special!");
    				    alertDialog9.setMessage("A pair of Designer Eye Glasses Pay Rs. 100/-");
    				    alertDialog9.setCanceledOnTouchOutside(true);
    				    alertDialog9.show();
    				    pba1-=100;
						break;
					case 10:
						AlertDialog alertDialog10 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog10.setTitle("Holiday Special!");
    				    alertDialog10.setMessage("Supporting Citizen for a clean Environment Get Rs. 200/-");
    				    alertDialog10.setCanceledOnTouchOutside(true);
    				    alertDialog10.show();
    				    pba1+=200;
						break;
					case 11:
						AlertDialog alertDialog11 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog11.setTitle("Holiday Special!");
    				    alertDialog11.setMessage("A Security Man to look after your Home Pay Rs. 100/-");
    				    alertDialog11.setCanceledOnTouchOutside(true);
    				    alertDialog11.show();
    				    pba1-=100;
						break;
					default:
						AlertDialog alertDialog12 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog12.setTitle("Holiday Special!");
    				    alertDialog12.setMessage("Sold your old car stereo system get Rs. 200/-");
    				    alertDialog12.setCanceledOnTouchOutside(true);
    				    alertDialog12.show();
    				    pba1+=200;
					}
				}
				if(pba1>=0)
				{
				pb1.setText(pba1+"");
				}
				else if(pba1==-1)
				{
				}
				else
                {
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				over.setTitle("Player 1 Out!");
    				over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
    				over.setCanceledOnTouchOutside(true);
    				over.show();
    				pb1.setText("OUT");
    				if(ps1==ps3)
					{
						TextView te=(TextView)r1.getChildAt(ps1);
						te.setBackgroundColor(Color.parseColor(pc3));
					}
					else if(ps1==ps2)
					{
						TextView te=(TextView)r1.getChildAt(ps1);
						te.setBackgroundColor(Color.parseColor(pc2));
					}
					else
					{
						TextView te=(TextView)r1.getChildAt(ps1);
        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					}
        			p1.setText("-1");
                }
				if(pba2>=0)
				{
				pb2.setText(pba2+"");
				}
				else if(pba2==-1)
				{
				}
				else
                {
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				over.setTitle("Player 2 Out!");
    				over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
    				over.setCanceledOnTouchOutside(true);
    				over.show();
    				pb2.setText("OUT");
    				if(ps1==ps2)
					{
						TextView te=(TextView)r1.getChildAt(ps2);
						te.setBackgroundColor(Color.parseColor(pc1));
					}
					else if(ps3==ps2)
					{
						TextView te=(TextView)r1.getChildAt(ps2);
						te.setBackgroundColor(Color.parseColor(pc3));
					}
					else
					{
						TextView te=(TextView)r1.getChildAt(ps2);
        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					}
        			p2.setText("-1");
                }
				if(pba3>=0)
				{
				pb3.setText(pba3+"");
				}
				else if(pba3==-1)
				{
				}
				else
                {
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				over.setTitle("Player 3 Out!");
    				over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
    				over.setCanceledOnTouchOutside(true);
    				over.show();
    				pb3.setText("OUT");
    				if(ps2==ps3)
					{
						TextView te=(TextView)r1.getChildAt(ps3);
						te.setBackgroundColor(Color.parseColor(pc2));
					}
					else if(ps1==ps3)
					{
						TextView te=(TextView)r1.getChildAt(ps3);
						te.setBackgroundColor(Color.parseColor(pc1));
					}
					else
					{
						TextView te=(TextView)r1.getChildAt(ps3);
        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					}
        			p3.setText("-1");
                }
				if(p1.getText().toString()!="-1")
				{
				p1.setText(ps1+"");
				TextView t2=(TextView)r1.getChildAt(ps1);
				t2.setBackgroundColor(Color.parseColor(pc1));
				}
			}
		}
		if(pb2.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
		{
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Game Over.");
			over.setMessage("1st Position:Player 3 Balance:Rs. "+pba3+"\n"+"2nd Position:Player 1, Player 2 : OUT");
			over.setButton("OK", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog,int which) {
	            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
					startActivity(i1);
	            }
	        });
			over.setCancelable(false);
			over.show();
		}
		else if(pb3.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
		{
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Game Over.");
			over.setMessage("1st Position:Player 2 Balance:Rs. "+pba2+"\n"+"2nd Position:Player 1, Player 3 : OUT");
			over.setButton("OK", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog,int which) {
	            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
					startActivity(i1);
	            }
	        });
			over.setCancelable(false);
			over.show();
		}
		else
		{
			if(!(((ps1!=6 && ps1!=20 && ps1!=43 && ps1!=55 && ps1!=87 && ps1!=106 && ps1!=122 && ps1!=131 && ps1!=134) || (dv!=5)) && ps1!=58 && ps1!=60 && ps1!=62))
			{
				bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
				if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				dice.setTitle("Dice Thrown:"+d);
				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog,int which) {
			            	dice.cancel();
			            }
			        });
                }
                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                {
                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				dice.setTitle("Dice Thrown:"+d);
    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
 			            public void onClick(DialogInterface dialog,int which) {
 			            	dice.cancel();
 			            }
 			        });	
                }
                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				dice.setTitle("Dice Thrown:"+d);
    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
 			            public void onClick(DialogInterface dialog,int which) {
 			            	dice.cancel();
 			            }
 			        });
                }
                else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                {
                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				dice.setTitle("Dice Thrown:"+d);
    				dice.setMessage("Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
 			            public void onClick(DialogInterface dialog,int which) {
 			            	dice.cancel();
 			            }
 			        });
                }
			}
			else if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
			{
				bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
				if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				dice.setTitle("Dice Thrown:"+d);
				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog,int which) {
			            	dice.cancel();
			            }
			        });
                }
                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                {
                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				dice.setTitle("Dice Thrown:"+d);
    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
 			            public void onClick(DialogInterface dialog,int which) {
 			            	dice.cancel();
 			            }
 			        });	
                }
                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				dice.setTitle("Dice Thrown:"+d);
    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
 			            public void onClick(DialogInterface dialog,int which) {
 			            	dice.cancel();
 			            }
 			        });
                }
                else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                {
                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				dice.setTitle("Dice Thrown:"+d);
    				dice.setMessage("Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
 			            public void onClick(DialogInterface dialog,int which) {
 			            	dice.cancel();
 			            }
 			        });
                }
			}
			else if(ps3!=138 && pb3.getText().toString()!="OUT" && ((ps3!=119)||kv==1) && ((ps3!=129)||kv==1))
			{
				jv=1;
				j.setText(jv+"");
				bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
				if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				dice.setTitle("Dice Thrown:"+d);
				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog,int which) {
			            	dice.cancel();
			            }
			        });
                }
                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                {
                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				dice.setTitle("Dice Thrown:"+d);
    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
 			            public void onClick(DialogInterface dialog,int which) {
 			            	dice.cancel();
 			            }
 			        });	
                }
                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				dice.setTitle("Dice Thrown:"+d);
    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
 			            public void onClick(DialogInterface dialog,int which) {
 			            	dice.cancel();
 			            }
 			        });
                }
                else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                {
                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				dice.setTitle("Dice Thrown:"+d);
    				dice.setMessage("Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
 			            public void onClick(DialogInterface dialog,int which) {
 			            	dice.cancel();
 			            }
 			        });
                }
			}
			else
			{
				if(pb1.getText().toString()!="OUT" && ps1!=138 && ((ps1!=119)||iv==1) && ((ps1!=129)||iv==1))
				{
					jv=1;
					j.setText(jv+"");
					kv=1;
					k.setText(kv+"");
					bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
					if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					dice.setTitle("Dice Thrown:"+d);
					dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
					 dice.setButton("OK", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog,int which) {
				            	dice.cancel();
				            }
				        });
	                }
	                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                {
	                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });	
	                }
	                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });
	                }
	                else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                {
	                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });
	                }
				}
				else if(ps2!=138 && pb2.getText().toString()!="OUT")
				{
					jv=1;
					j.setText(jv+"");
					kv=1;
					k.setText(kv+"");
					iv=1;
					i.setText(iv+"");
					bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
					if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					dice.setTitle("Dice Thrown:"+d);
					dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
					 dice.setButton("OK", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog,int which) {
				            	dice.cancel();
				            }
				        });
	                }
	                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                {
	                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });	
	                }
	                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });
	                }
	                else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                {
	                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });
	                }
				}
				else if(ps3!=138 && pb3.getText().toString()!="OUT")
				{
					kv=1;
					k.setText(kv+"");
					iv=1;
					i.setText(iv+"");
					bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
					if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					dice.setTitle("Dice Thrown:"+d);
					dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
					 dice.setButton("OK", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog,int which) {
				            	dice.cancel();
				            }
				        });
	                }
	                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                {
	                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });	
	                }
	                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });
	                }
	                else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                {
	                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });
	                }
				}
				else if(ps1!=138 && pb1.getText().toString()!="OUT")
				{
					iv=1;
					i.setText(iv+"");
					bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
					if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					dice.setTitle("Dice Thrown:"+d);
					dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
					 dice.setButton("OK", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog,int which) {
				            	dice.cancel();
				            }
				        });
	                }
	                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                {
	                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT");
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });	
	                }
	                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });
	                }
	                else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                {
	                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString());
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });
	                }
				}
				else
				{
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					over.setTitle("Game Over.");
					over.setCancelable(false);
					if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
					{
						String max="", min="", mid="";
						if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
						{
							max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
							if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
							{
								mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
								min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
							}
							else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
							{
								mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
								min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
							}
							else
							{
								mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
							}
						}
						else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
						{
							max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
							if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
							{
								mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
								min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
							}
							else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
							{
								mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
								min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
							}
							else
							{
								mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
							}
						}
						else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
						{
							max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
							if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
							{
								mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
								min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
							}
							else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
							{
								mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
								min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
							}
							else
							{
								mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
							}
						}
						else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
						{
							max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
							mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
						}
						else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
						{
							max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
							mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
						}
						else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
						{
							max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
							mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
						}
						else
						{
							max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
						}
						over.setMessage(max+"\n"+mid+"\n"+min);
					}
					else if(pb2.getText().toString()=="OUT")
					{
						if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
						{
							over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
						}
						else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
						{
							over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
						}
						else
						{
							over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
						}
					}
					else if(pb1.getText().toString()=="OUT")
					{
						if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
						{
							over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
						}
						else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
						{
							over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
						}
						else
						{
							over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
						}
					}
					else
					{
						if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
						{
							over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
						}
						else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
						{
							over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
						}
						else
						{
							over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
						}
					}
					over.setButton("OK", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog,int which) {
			            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
							startActivity(i1);
			            }
			        });
					over.show();
				}
			}
		}
	}
	public void play2(String pc,String pca,String pcb,boolean s)
	{
		final boolean so=s;
		final String pc1=pc;
		final String pc2=pca;
		final String pc3=pcb;
		final TextView pb1=(TextView)findViewById(R.id.pb1);
	    final TextView pb2=(TextView)findViewById(R.id.pb2);
	    final TextView pb3=(TextView)findViewById(R.id.pb3);
	    final TextView p1=(TextView)findViewById(R.id.p1);
	    final TextView p2=(TextView)findViewById(R.id.p2);
	    final TextView p3=(TextView)findViewById(R.id.p3);
	    final TextView i=(TextView)findViewById(R.id.i);
	    final TextView j=(TextView)findViewById(R.id.j);
	    final TextView k=(TextView)findViewById(R.id.k);
	    final TextView bo=(TextView)findViewById(R.id.bottom);
	    final TextView dt2=(TextView)findViewById(R.id.dt2);
	    final String Name1=getIntent().getExtras().getString("Name1");
	    final String Name2=getIntent().getExtras().getString("Name2");
	    final String Name3=getIntent().getExtras().getString("Name3");
		int ps1=Integer.parseInt(p1.getText().toString());
		int ps2=Integer.parseInt(p2.getText().toString());
		int ps3=Integer.parseInt(p3.getText().toString());
		int iv=Integer.parseInt(i.getText().toString());
		int jv=Integer.parseInt(j.getText().toString());
		int kv=Integer.parseInt(k.getText().toString());
		final RelativeLayout r1=(RelativeLayout)findViewById(R.id.linearLayout1);
		final TextView no1=(TextView)findViewById(R.id.no1);
        final TextView no2=(TextView)findViewById(R.id.no2);
		Random r=new Random();
		short d;
		d=(short) (r.nextInt(6)+1);
		if(so==true)
		{
			m.start();
		}
		int pba1,pba2,pba3;
		if(pb1.getText().toString()!="OUT")
		{
		pba1=Integer.parseInt(pb1.getText().toString ());
		}
		else
		{
			pba1=-1;
		}
		if(pb2.getText().toString()!="OUT")
		{
		pba2=Integer.parseInt(pb2.getText().toString ());
		}
		else
		{
			pba2=-1;
		}
		if(pb3.getText().toString()!="OUT")
		{
		pba3=Integer.parseInt(pb3.getText().toString ());
		}
		else
		{
			pba3=-1;
		}
		int dv2=Integer.parseInt(dt2.getText().toString ());
		if(ps2!=1 && ps2!=10 && ps2!=13 && ps2!=17 && ps2!=52 && ps2!=65 && ps2!=104 && ps2!=112 && ps2!=116 && ps2!=124 && ps2!=132 && (dv2!=7 ||(ps2!=6 && ps2!=20 && ps2!=43 && ps2!=55 && ps2!=87 && ps2!=106 && ps2!=122 && ps2!=131 && ps2!=134)))
		{
			jv=0;
			j.setText(jv+"");
		if(ps2!=0 && ps1!=ps2 && ps2!=ps3)
		{
		TextView t=(TextView)r1.getChildAt(ps2);
		t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
		}
		else if(ps2==ps3 && ps2!=0)
		{
			TextView t=(TextView)r1.getChildAt(ps2);
			t.setBackgroundColor(Color.parseColor(pc3));
		}
		else if(ps1==ps2 && ps2!=0)
		{
			TextView t=(TextView)r1.getChildAt(ps2);
			t.setBackgroundColor(Color.parseColor(pc1));
		}
		if(ps2+d<=138)
		{
		ps2+=d;
		}
		else if(ps2==134)
		{
			if(ps3!=138 && pb3.getText().toString()!="OUT" && (ps3!=119||kv==1) && (ps3!=129||kv==1))
			{
				bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
			}
			else if(ps1!=138 && pb1.getText().toString()!="OUT" && (ps1!=119||iv==1) && (ps1!=129||iv==1))
			{
				kv=1;
				k.setText(kv+"");
				bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
			}
			else
			{
				kv=1;
				k.setText(kv+"");
				iv=1;
				i.setText(iv+"");
				bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
			}
			return;
		}
		if(ps2==5)
		{
			pba2-=20;
		}
		else if(ps2==8)
		{
			pba2-=50;
		}
		else if(ps2==15)
		{
			pba2-=30;
		}
		else if(ps2==23)
		{
			pba2-=100;
		}
		else if(ps2==25)
		{
			pba2-=50;
		}
		else if(ps2==29)
		{
			pba2+=100;
		}
		else if(ps2==33)
		{
			pba2-=30;
		}
		else if(ps2==35)
		{
			pba2-=100;
		}
		else if(ps2==37)
		{
			pba2-=30;
		}
		else if(ps2==40)
		{
			pba2+=100;
		}
		else if(ps2==42)
		{
			pba2-=50;
		}
		else if(ps2==45)
		{
			pba2-=50;
		}
		else if(ps2==48)
		{
			pba2-=30;
		}
		else if(ps2==50)
		{
			pba2-=50;
		}
		else if(ps2==52)
		{
			pba2-=100;
		}
		else if(ps2==54)
		{
			pba2-=50;
		}
		else if(ps2==57)
		{
			pba2+=200;
		}
		else if(ps2==68)
		{
			pba2-=100;
		}
		else if(ps2==71)
		{
			pba2-=50;
		}
		else if (ps2==74)
		{
			pba2-=100;
		}
		else if(ps2==77)
		{
			pba2-=50;
		}
		else if(ps2==79)
		{
			pba2-=100;
		}
		else if(ps2==80)
		{
			pba2+=200;
		}
		else if(ps2==81)
		{
			pba2-=100;
		}
		else if(ps2==83)
		{
			pba2-=100;
		}
		else if(ps2==85)
		{
			pba2-=50;
		}
		else if(ps2==89)
		{
			pba2+=50;
		}
		else if(ps2==94)
		{
			pba2-=50;
		}
		else if(ps2==97)
		{
			pba2-=50;
		}
		else if(ps2==99)
		{
			pba2-=50;
		}
		else if(ps2==101)
		{
			pba2-=100;
		}
		else if(ps2==102)
		{
			pba2-=10;
		}
		else if(ps2==109)
		{
			pba2-=30;
		}
		else if(ps2==116)
		{
			pba2-=20;
		}
		else if(ps2==127)
		{
			pba2-=20;
		}
		else if(ps2==129)
		{
			pba2-=20;
		}
		else if(ps2==6||ps2==20||ps2==43||ps2==55||ps2==87||ps2==106||ps2==122||ps2==131||ps2==134)
		{
			dv2=r.nextInt(12)+1;
			dt2.setText(dv2+"");
			switch(dv2)
			{
			case 1:
				AlertDialog alertDialog = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog.setTitle("Holiday Special!");
			    alertDialog.setMessage("Birth Day gifts from each player of Rs. 50/-");
			    alertDialog.setCanceledOnTouchOutside(true);
			    alertDialog.show();
			    if(pba1!=-1 && pba1>=50)
			    {
			    pba2+=50;
			    pba1-=50;
			    }
			    else if(pba1!=-1)
			    {
			    	pba1-=50;
			    }
			    if(pba3!=-1 && pba3>=50)
			    {
			    pba2+=50;
			    pba3-=50;
			    }
			    else if(pba3!=-1)
			    {
			    	pba3-=50;
			    }
				break;
			case 2:
				AlertDialog alertDialog2 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog2.setTitle("Holiday Special!");
			    alertDialog2.setMessage("Car Insurance Get Rs. 100/-");
			    alertDialog2.setCanceledOnTouchOutside(true);
			    alertDialog2.show();
			    pba2+=100;
				break;
			case 3:
				AlertDialog alertDialog3 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog3.setTitle("Holiday Special!");
			    alertDialog3.setMessage("FALGUNI TOYS \n Award of the best player of game Rs. 100/- \n Holiday Special");
			    alertDialog3.setCanceledOnTouchOutside(true);
			    alertDialog3.show();
			    pba2+=100;
				break;
			case 4:
				AlertDialog alertDialog4 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog4.setTitle("Holiday Special!");
			    alertDialog4.setMessage("Family Insurance Pay Rs. 200/-");
			    alertDialog4.setCanceledOnTouchOutside(true);
			    alertDialog4.show();
			    pba2-=200;
				break;
			case 5:
				final AlertDialog alertDialog5 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog5.setTitle("Holiday Special!");
			    alertDialog5.setMessage("Roll the dice and earn 50 times money of the given number");
			    alertDialog5.setCancelable(false);
			    alertDialog5.setButton("Roll", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog,int which) {
		            	Random r=new Random();
		            	int dr=r.nextInt(6)+1;
		            	if(so==true)
						{
							m.start();
						}
		            	alertDialog5.cancel();
		            	int pba2=Integer.parseInt(pb2.getText().toString());
		            	pba2=pba2+(50*dr);
		            	pb2.setText(pba2+"");
		            	int ps1=Integer.parseInt(p1.getText().toString());
		            	int ps3=Integer.parseInt(p3.getText().toString());
		            	int kv=Integer.parseInt(k.getText().toString());
		            	int iv=Integer.parseInt(i.getText().toString());
		            	if(ps3!=138 && pb3.getText().toString()!="OUT" && (ps3!=119||kv==1) && (ps3!=129||kv==1))
						{
							bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
						}
						else if(ps1!=138 && pb1.getText().toString()!="OUT" && (ps1!=119||iv==1) && (ps1!=129||iv==1))
						{
							kv=1;
							k.setText(kv+"");
							bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
						}
						else
						{
							kv=1;
							k.setText(kv+"");
							iv=1;
							i.setText(iv+"");
							bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
						}
		            	if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
		                {
		            	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				dice.setTitle("After rolling, number on the dice:"+dr);
        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
     			            public void onClick(DialogInterface dialog,int which) {
     			            	dice.cancel();
     			            }
     			        });
		                }
		                else if(pb1.getText().toString()=="OUT")
		                {
		                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("After rolling, number on the dice:"+dr);
	        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
		                }
		                else if(pb3.getText().toString()=="OUT")
		                {
		                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("After rolling, number on the dice:"+dr);
	        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
		                }
		            	}
		        });
			    alertDialog5.show();
				break;
			case 6:
				AlertDialog alertDialog6 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog6.setTitle("Holiday Special!");
			    alertDialog6.setMessage("Car Servicing Charges Rs. 200/-");
			    alertDialog6.setCanceledOnTouchOutside(true);
			    alertDialog6.show();
			    pba2-=200;
				break;
			case 7:
				AlertDialog alertDialog7 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog7.setTitle("Holiday Special!");
			    alertDialog7.setMessage("Wait for six on die");
			    alertDialog7.setCanceledOnTouchOutside(true);
			    alertDialog7.show();
				break;
			case 8:
				AlertDialog alertDialog8 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog8.setTitle("Holiday Special!");
			    alertDialog8.setMessage("Installed car stereo system pay Rs. 250/-");
			    alertDialog8.setCanceledOnTouchOutside(true);
			    alertDialog8.show();
			    pba2-=250;
				break;
			case 9:
				AlertDialog alertDialog9 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog9.setTitle("Holiday Special!");
			    alertDialog9.setMessage("A pair of Designer Eye Glasses Pay Rs. 100/-");
			    alertDialog9.setCanceledOnTouchOutside(true);
			    alertDialog9.show();
			    pba2-=100;
				break;
			case 10:
				AlertDialog alertDialog10 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog10.setTitle("Holiday Special!");
			    alertDialog10.setMessage("Supporting Citizen for a clean Environment Get Rs. 200/-");
			    alertDialog10.setCanceledOnTouchOutside(true);
			    alertDialog10.show();
			    pba2+=200;
				break;
			case 11:
				AlertDialog alertDialog11 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog11.setTitle("Holiday Special!");
			    alertDialog11.setMessage("A Security Man to look after your Home Pay Rs. 100/-");
			    alertDialog11.setCanceledOnTouchOutside(true);
			    alertDialog11.show();
			    pba2-=100;
				break;
			default:
				AlertDialog alertDialog12 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog12.setTitle("Holiday Special!");
			    alertDialog12.setMessage("Sold your old car stereo system get Rs. 200/-");
			    alertDialog12.setCanceledOnTouchOutside(true);
			    alertDialog12.show();
			    pba2+=200;
			}
		}
		else if(ps2==58||ps2==60||ps2==62)
		{
			final Dialog dia= new Dialog(Picnicplay3Activity.this);
			dia.setContentView(R.layout.dialogno1);
			dia.setTitle("Dice Throw of Rs. 100");
			dia.setCancelable(false);
			final RadioGroup rg=(RadioGroup)dia.findViewById(R.id.radio);
			Button bd=(Button)dia.findViewById(R.id.button);
			bd.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					Integer ds=rg.indexOfChild(dia.findViewById(rg.getCheckedRadioButtonId()));
					if(ds!=null && ds!=-1)
					{
						dia.cancel();
					if(ds==0)
					{
						no1.setText("2");
						final Dialog dia1= new Dialog(Picnicplay3Activity.this);
						dia1.setContentView(R.layout.dialog1);
						dia1.setTitle("Dice Throw of Rs. 100");
						dia1.setCancelable(false);
						final RadioGroup rg1=(RadioGroup)dia1.findViewById(R.id.radio);
						Button bd1=(Button)dia1.findViewById(R.id.button1);
						bd1.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								int ds1=rg1.indexOfChild(dia1.findViewById(rg1.getCheckedRadioButtonId()));
								if(ds1!=-1)
								{
									dia1.cancel();
								if(ds1==0)
								{
									no2.setText("3");
								}
								else if(ds1==1)
								{
									no2.setText("4");
								}
								else if(ds1==2)
								{
									no2.setText("5");
								}
								 Random r=new Random();
				                    int rno=r.nextInt(6)+1;
				                    if(so==true)
	    							{
	    								m.start();
	    							}
				                    int n1=Integer.parseInt(no1.getText().toString());
				                    int n2=Integer.parseInt(no2.getText().toString());
				                    int pba2=Integer.parseInt(pb2.getText().toString());
				                    int pba1=Integer.parseInt(pb1.getText().toString());
				                    int pba3=Integer.parseInt(pb3.getText().toString());
				                    int ps2=Integer.parseInt(p2.getText().toString());
				                    int ps1=Integer.parseInt(p1.getText().toString());
				                    int ps3=Integer.parseInt(p3.getText().toString());
				                    int kv=Integer.parseInt(k.getText().toString());
				                    int iv=Integer.parseInt(i.getText().toString());
				                    if(rno==n1 || rno==n2)
				                    {
				                    	pba2+=100;
				                    }
				                    else
				                    {
				                    	pba2-=100;
				                    }
				                    if(pba2>=0)
									{
									pb2.setText(pba2+"");
									}
				                    else if(pba2==-1)
				            		{
				            		}
				                    else
				                    {
				                    	AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				over.setTitle("Player 2 Out!");
				        				over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
				        				over.setCanceledOnTouchOutside(true);
				        				over.show();
				        				pb2.setText("OUT");
				        				if(ps2==ps1)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps2);
				    						te.setBackgroundColor(Color.parseColor(pc1));
				    					}
				    					else if(ps3==ps2)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps2);
				    						te.setBackgroundColor(Color.parseColor(pc3));
				    					}
				    					else
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps2);
					        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				    					}
				        				p2.setText("-1");
				                    }
				                    if(pb2.getText().toString()=="OUT" && pb3.getText().toString()=="OUT")
				    				{
				    					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				    					over.setTitle("Game Over.");
				    					over.setMessage("1st Position:Player 1 Balance:Rs. "+pba1+"\n"+"2nd Position:Player 2, Player 3 : OUT");
				    					over.setButton("OK", new DialogInterface.OnClickListener() {
				    			            public void onClick(DialogInterface dialog,int which) {
				    			            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
				    							startActivity(i1);
				    			            }
				    			        });
				    					over.setCancelable(false);
				    					over.show();
				    				}
				    				else if(pb2.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
				    				{
				    					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				    					over.setTitle("Game Over.");
				    					over.setMessage("1st Position:Player 3 Balance:Rs. "+pba3+"\n"+"2nd Position:Player 1, Player 2 : OUT");
				    					over.setButton("OK", new DialogInterface.OnClickListener() {
				    			            public void onClick(DialogInterface dialog,int which) {
				    			            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
				    							startActivity(i1);
				    			            }
				    			        });
				    					over.setCancelable(false);
				    					over.show();
				    				}
				    				else
				    				{
				    					if(ps3!=138 && pb3.getText().toString()!="OUT" && (ps3!=119||kv==1) && (ps3!=129||kv==1))
				    					{
				    						bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
				    					}
				    					else if(ps1!=138 && pb1.getText().toString()!="OUT" && (ps1!=119||iv==1) && (ps1!=129||iv==1))
				    					{
				    						kv=1;
				    						k.setText(kv+"");
				    						bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
				    					}
				    					else
				    					{
				    						if(ps2!=138 && pb2.getText().toString()!="OUT")
				    						{
				    							kv=1;
					    						k.setText(kv+"");
					    						iv=1;
					    						i.setText(iv+"");
				    							bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
				    						}
				    						else if(ps3!=138 && pb3.getText().toString()!="OUT")
											{
				    							kv=1;
					    						k.setText(kv+"");
					    						iv=1;
					    						i.setText(iv+"");
												bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");	
											}
											else if(ps1!=138 && pb1.getText().toString()!="OUT")
											{
												kv=1;
					    						k.setText(kv+"");
					    						iv=1;
					    						i.setText(iv+"");
												bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
											}
				    						else
				    						{
				    							AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				    							over.setTitle("Game Over.");
				    							over.setCancelable(false);
				    							if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				    							{
				    								String max="", min="", mid="";
				    								if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    								{
				    									max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    									if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    										min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    									}
				    									else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    										min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    									}
				    									else
				    									{
				    										mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
				    									}
				    								}
				    								else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    								{
				    									max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    									if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    										min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    									}
				    									else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    										min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    									}
				    									else
				    									{
				    										mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
				    									}
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
				    								{
				    									max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    									if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
				    									{
				    										mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    										min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    									}
				    									else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
				    									{
				    										mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    										min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    									}
				    									else
				    									{
				    										mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
				    									}
				    								}
				    								else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    								{
				    									max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
				    									mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
				    								{
				    									max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
				    									mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
				    								{
				    									max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
				    									mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
				    								}
				    								else
				    								{
				    									max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
				    								}
				    								over.setMessage(max+"\n"+mid+"\n"+min);
				    							}
				    							else if(pb2.getText().toString()=="OUT")
				    							{
				    								if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
				    								}
				    								else
				    								{
				    									over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
				    								}
				    							}
				    							else if(pb1.getText().toString()=="OUT")
				    							{
				    								if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
				    								}
				    								else
				    								{
				    									over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
				    								}
				    							}
				    							else
				    							{
				    								if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
				    								}
				    								else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
				    								}
				    								else
				    								{
				    									over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
				    								}
				    							}
				    							over.setButton("OK", new DialogInterface.OnClickListener() {
				    					            public void onClick(DialogInterface dialog,int which) {
				    					            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
				    									startActivity(i1);
				    					            }
				    					        });
				    							over.show();
				    						}
				    					}
				    				}
				                    if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
					                {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			        				dice.setTitle("Dice Thrown:"+rno);
			        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
			        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			     			            public void onClick(DialogInterface dialog,int which) {
			     			            	dice.cancel();
			     			            }
			     			        });
					                }
				                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        		dice.setTitle("Dice Thrown:"+rno);
					        		dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
					        		dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			    public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
								}
								else
								{
									Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
								}
							}
						});
						dia1.show();
					}
					else if(ds==1)
					{
						no1.setText("3");
						final Dialog dia2= new Dialog(Picnicplay3Activity.this);
						dia2.setContentView(R.layout.dialog2);
						dia2.setTitle("Dice Throw of Rs. 100");
						dia2.setCancelable(false);
						final RadioGroup rg2=(RadioGroup)dia2.findViewById(R.id.radio);
						Button bd2=(Button)dia2.findViewById(R.id.button1);
						bd2.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								int ds2=rg2.indexOfChild(dia2.findViewById(rg2.getCheckedRadioButtonId()));
								if(ds2!=-1)
								{
									dia2.cancel();
								if(ds2==0)
								{
									no2.setText("3");
								}
								else if(ds2==1)
								{
									no2.setText("4");
								}
								else if(ds2==2)
								{
									no2.setText("5");
								}
								 Random r=new Random();
				                    int rno=r.nextInt(6)+1;
				                    if(so==true)
	    							{
	    								m.start();
	    							}
				                    int n1=Integer.parseInt(no1.getText().toString());
				                    int n2=Integer.parseInt(no2.getText().toString());
				                    int pba2=Integer.parseInt(pb2.getText().toString());
				                    int pba1=Integer.parseInt(pb1.getText().toString());
				                    int pba3=Integer.parseInt(pb3.getText().toString());
				                    int ps2=Integer.parseInt(p2.getText().toString());
				                    int ps1=Integer.parseInt(p1.getText().toString());
				                    int ps3=Integer.parseInt(p3.getText().toString());
				                    int kv=Integer.parseInt(k.getText().toString());
				                    int iv=Integer.parseInt(i.getText().toString());
				                    if(rno==n1 || rno==n2)
				                    {
				                    	pba2+=100;
				                    }
				                    else
				                    {
				                    	pba2-=100;
				                    }
				                    if(pba2>=0)
									{
									pb2.setText(pba2+"");
									}
				                    else if(pba2==-1)
				            		{
				            		}
				                    else
				                    {
				                    	AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				over.setTitle("Player 2 Out!");
				        				over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
				        				over.setCanceledOnTouchOutside(true);
				        				over.show();
				        				pb2.setText("OUT");
				        				if(ps2==ps1)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps2);
				    						te.setBackgroundColor(Color.parseColor(pc1));
				    					}
				    					else if(ps3==ps2)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps2);
				    						te.setBackgroundColor(Color.parseColor(pc3));
				    					}
				    					else
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps2);
					        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				    					}
				        				p2.setText("-1");
				                    }
				                    if(pb2.getText().toString()=="OUT" && pb3.getText().toString()=="OUT")
				    				{
				    					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				    					over.setTitle("Game Over.");
				    					over.setMessage("1st Position:Player 1 Balance:Rs. "+pba1+"\n"+"2nd Position:Player 2, Player 3 : OUT");
				    					over.setButton("OK", new DialogInterface.OnClickListener() {
				    			            public void onClick(DialogInterface dialog,int which) {
				    			            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
				    							startActivity(i1);
				    			            }
				    			        });
				    					over.setCancelable(false);
				    					over.show();
				    				}
				    				else if(pb2.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
				    				{
				    					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				    					over.setTitle("Game Over.");
				    					over.setMessage("1st Position:Player 3 Balance:Rs. "+pba3+"\n"+"2nd Position:Player 1, Player 2 : OUT");
				    					over.setButton("OK", new DialogInterface.OnClickListener() {
				    			            public void onClick(DialogInterface dialog,int which) {
				    			            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
				    							startActivity(i1);
				    			            }
				    			        });
				    					over.setCancelable(false);
				    					over.show();
				    				}
				    				else
				    				{
				    					if(ps3!=138 && pb3.getText().toString()!="OUT" && (ps3!=119||kv==1) && (ps3!=129||kv==1))
				    					{
				    						bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
				    					}
				    					else if(ps1!=138 && pb1.getText().toString()!="OUT" && (ps1!=119||iv==1) && (ps1!=129||iv==1))
				    					{
				    						kv=1;
				    						k.setText(kv+"");
				    						bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
				    					}
				    					else
				    					{
				    						if(ps2!=138 && pb2.getText().toString()!="OUT")
				    						{
				    							kv=1;
					    						k.setText(kv+"");
					    						iv=1;
					    						i.setText(iv+"");
				    							bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
				    						}
				    						else if(ps3!=138 && pb3.getText().toString()!="OUT")
											{
				    							kv=1;
					    						k.setText(kv+"");
					    						iv=1;
					    						i.setText(iv+"");
												bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");	
											}
											else if(ps1!=138 && pb1.getText().toString()!="OUT")
											{
												kv=1;
					    						k.setText(kv+"");
					    						iv=1;
					    						i.setText(iv+"");
												bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
											}
				    						else
				    						{
				    							AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				    							over.setTitle("Game Over.");
				    							over.setCancelable(false);
				    							if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				    							{
				    								String max="", min="", mid="";
				    								if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    								{
				    									max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    									if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    										min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    									}
				    									else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    										min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    									}
				    									else
				    									{
				    										mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
				    									}
				    								}
				    								else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    								{
				    									max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    									if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    										min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    									}
				    									else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    										min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    									}
				    									else
				    									{
				    										mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
				    									}
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
				    								{
				    									max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    									if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
				    									{
				    										mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    										min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    									}
				    									else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
				    									{
				    										mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    										min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    									}
				    									else
				    									{
				    										mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
				    									}
				    								}
				    								else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    								{
				    									max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
				    									mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
				    								{
				    									max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
				    									mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
				    								{
				    									max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
				    									mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
				    								}
				    								else
				    								{
				    									max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
				    								}
				    								over.setMessage(max+"\n"+mid+"\n"+min);
				    							}
				    							else if(pb2.getText().toString()=="OUT")
				    							{
				    								if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
				    								}
				    								else
				    								{
				    									over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
				    								}
				    							}
				    							else if(pb1.getText().toString()=="OUT")
				    							{
				    								if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
				    								}
				    								else
				    								{
				    									over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
				    								}
				    							}
				    							else
				    							{
				    								if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
				    								}
				    								else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
				    								}
				    								else
				    								{
				    									over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
				    								}
				    							}
				    							over.setButton("OK", new DialogInterface.OnClickListener() {
				    					            public void onClick(DialogInterface dialog,int which) {
				    					            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
				    									startActivity(i1);
				    					            }
				    					        });
				    							over.show();
				    						}
				    					}
				    				}
				                    if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
					                {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			        				dice.setTitle("Dice Thrown:"+rno);
			        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
			        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			     			            public void onClick(DialogInterface dialog,int which) {
			     			            	dice.cancel();
			     			            }
			     			        });
					                }
				                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        		dice.setTitle("Dice Thrown:"+rno);
					        		dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
					        		dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			    public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
								}
								else
								{
									Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
								}
							}
						});
						dia2.show();
					}
					else if(ds==2)
					{
						no1.setText("4");
						final Dialog dia3= new Dialog(Picnicplay3Activity.this);
						dia3.setContentView(R.layout.dialog3);
						dia3.setTitle("Dice Throw of Rs. 100");
						dia3.setCancelable(false);
						final RadioGroup rg3=(RadioGroup)dia3.findViewById(R.id.radio);
						Button bd3=(Button)dia3.findViewById(R.id.button1);
						bd3.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								int ds3=rg3.indexOfChild(dia3.findViewById(rg3.getCheckedRadioButtonId()));
								if(ds3!=-1)
								{
									dia3.cancel();
								if(ds3==0)
								{
									no2.setText("3");
								}
								else if(ds3==1)
								{
									no2.setText("4");
								}
								else if(ds3==2)
								{
									no2.setText("5");
								}
								 Random r=new Random();
				                    int rno=r.nextInt(6)+1;
				                    if(so==true)
	    							{
	    								m.start();
	    							}
				                    int n1=Integer.parseInt(no1.getText().toString());
				                    int n2=Integer.parseInt(no2.getText().toString());
				                    int pba2=Integer.parseInt(pb2.getText().toString());
				                    int pba1=Integer.parseInt(pb1.getText().toString());
				                    int pba3=Integer.parseInt(pb3.getText().toString());
				                    int ps2=Integer.parseInt(p2.getText().toString());
				                    int ps1=Integer.parseInt(p1.getText().toString());
				                    int ps3=Integer.parseInt(p3.getText().toString());
				                    int kv=Integer.parseInt(k.getText().toString());
				                    int iv=Integer.parseInt(i.getText().toString());
				                    if(rno==n1 || rno==n2)
				                    {
				                    	pba2+=100;
				                    }
				                    else
				                    {
				                    	pba2-=100;
				                    }
				                    if(pba2>=0)
									{
									pb2.setText(pba2+"");
									}
				                    else if(pba2==-1)
				            		{
				            		}
				                    else
				                    {
				                    	AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				over.setTitle("Player 2 Out!");
				        				over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
				        				over.setCanceledOnTouchOutside(true);
				        				over.show();
				        				pb2.setText("OUT");
				        				if(ps2==ps1)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps2);
				    						te.setBackgroundColor(Color.parseColor(pc1));
				    					}
				    					else if(ps3==ps2)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps2);
				    						te.setBackgroundColor(Color.parseColor(pc3));
				    					}
				    					else
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps2);
					        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				    					}
				        				p2.setText("-1");
				                    }
				                    if(pb2.getText().toString()=="OUT" && pb3.getText().toString()=="OUT")
				    				{
				    					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				    					over.setTitle("Game Over.");
				    					over.setMessage("1st Position:Player 1 Balance:Rs. "+pba1+"\n"+"2nd Position:Player 2, Player 3 : OUT");
				    					over.setButton("OK", new DialogInterface.OnClickListener() {
				    			            public void onClick(DialogInterface dialog,int which) {
				    			            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
				    							startActivity(i1);
				    			            }
				    			        });
				    					over.setCancelable(false);
				    					over.show();
				    				}
				    				else if(pb2.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
				    				{
				    					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				    					over.setTitle("Game Over.");
				    					over.setMessage("1st Position:Player 3 Balance:Rs. "+pba3+"\n"+"2nd Position:Player 1, Player 2 : OUT");
				    					over.setButton("OK", new DialogInterface.OnClickListener() {
				    			            public void onClick(DialogInterface dialog,int which) {
				    			            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
				    							startActivity(i1);
				    			            }
				    			        });
				    					over.setCancelable(false);
				    					over.show();
				    				}
				    				else
				    				{
				    					if(ps3!=138 && pb3.getText().toString()!="OUT" && (ps3!=119||kv==1) && (ps3!=129||kv==1))
				    					{
				    						bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
				    					}
				    					else if(ps1!=138 && pb1.getText().toString()!="OUT" && (ps1!=119||iv==1) && (ps1!=129||iv==1))
				    					{
				    						kv=1;
				    						k.setText(kv+"");
				    						bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
				    					}
				    					else
				    					{
				    						if(ps2!=138 && pb2.getText().toString()!="OUT")
				    						{
				    							kv=1;
					    						k.setText(kv+"");
					    						iv=1;
					    						i.setText(iv+"");
				    							bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
				    						}
				    						else if(ps3!=138 && pb3.getText().toString()!="OUT")
											{
				    							kv=1;
					    						k.setText(kv+"");
					    						iv=1;
					    						i.setText(iv+"");
												bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");	
											}
											else if(ps1!=138 && pb1.getText().toString()!="OUT")
											{
												kv=1;
					    						k.setText(kv+"");
					    						iv=1;
					    						i.setText(iv+"");
												bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
											}
				    						else
				    						{
				    							AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				    							over.setTitle("Game Over.");
				    							over.setCancelable(false);
				    							if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				    							{
				    								String max="", min="", mid="";
				    								if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    								{
				    									max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    									if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    										min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    									}
				    									else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    										min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    									}
				    									else
				    									{
				    										mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
				    									}
				    								}
				    								else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    								{
				    									max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    									if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    										min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    									}
				    									else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    										min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    									}
				    									else
				    									{
				    										mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
				    									}
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
				    								{
				    									max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    									if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
				    									{
				    										mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    										min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    									}
				    									else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
				    									{
				    										mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    										min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    									}
				    									else
				    									{
				    										mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
				    									}
				    								}
				    								else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    								{
				    									max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
				    									mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
				    								{
				    									max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
				    									mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
				    								{
				    									max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
				    									mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
				    								}
				    								else
				    								{
				    									max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
				    								}
				    								over.setMessage(max+"\n"+mid+"\n"+min);
				    							}
				    							else if(pb2.getText().toString()=="OUT")
				    							{
				    								if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
				    								}
				    								else
				    								{
				    									over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
				    								}
				    							}
				    							else if(pb1.getText().toString()=="OUT")
				    							{
				    								if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
				    								}
				    								else
				    								{
				    									over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
				    								}
				    							}
				    							else
				    							{
				    								if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
				    								}
				    								else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
				    								}
				    								else
				    								{
				    									over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
				    								}
				    							}
				    							over.setButton("OK", new DialogInterface.OnClickListener() {
				    					            public void onClick(DialogInterface dialog,int which) {
				    					            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
				    									startActivity(i1);
				    					            }
				    					        });
				    							over.show();
				    						}
				    					}
				    				}
				                    if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
					                {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			        				dice.setTitle("Dice Thrown:"+rno);
			        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
			        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			     			            public void onClick(DialogInterface dialog,int which) {
			     			            	dice.cancel();
			     			            }
			     			        });
					                }
				                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        		dice.setTitle("Dice Thrown:"+rno);
					        		dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
					        		dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			    public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
								}
								else
								{
									Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
								}
							}
						});
						dia3.show();
					}
					else if(ds==3)
					{
						no1.setText("5");
						final Dialog dia4= new Dialog(Picnicplay3Activity.this);
						dia4.setContentView(R.layout.dialog4);
						dia4.setTitle("Dice Throw of Rs. 100");
						dia4.setCancelable(false);
						final RadioGroup rg4=(RadioGroup)dia4.findViewById(R.id.radio);
						Button bd4=(Button)dia4.findViewById(R.id.button1);
						bd4.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								int ds4=rg4.indexOfChild(dia4.findViewById(rg4.getCheckedRadioButtonId()));
								if(ds4!=-1)
								{
									dia4.cancel();
								if(ds4==0)
								{
									no2.setText("3");
								}
								else if(ds4==1)
								{
									no2.setText("4");
								}
								else if(ds4==2)
								{
									no2.setText("5");
								}
								 Random r=new Random();
				                    int rno=r.nextInt(6)+1;
				                    if(so==true)
	    							{
	    								m.start();
	    							}
				                    int n1=Integer.parseInt(no1.getText().toString());
				                    int n2=Integer.parseInt(no2.getText().toString());
				                    int pba2=Integer.parseInt(pb2.getText().toString());
				                    int pba1=Integer.parseInt(pb1.getText().toString());
				                    int pba3=Integer.parseInt(pb3.getText().toString());
				                    int ps2=Integer.parseInt(p2.getText().toString());
				                    int ps1=Integer.parseInt(p1.getText().toString());
				                    int ps3=Integer.parseInt(p3.getText().toString());
				                    int kv=Integer.parseInt(k.getText().toString());
				                    int iv=Integer.parseInt(i.getText().toString());
				                    if(rno==n1 || rno==n2)
				                    {
				                    	pba2+=100;
				                    }
				                    else
				                    {
				                    	pba2-=100;
				                    }
				                    if(pba2>=0)
									{
									pb2.setText(pba2+"");
									}
				                    else if(pba2==-1)
				            		{
				            		}
				                    else
				                    {
				                    	AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				over.setTitle("Player 2 Out!");
				        				over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
				        				over.setCanceledOnTouchOutside(true);
				        				over.show();
				        				pb2.setText("OUT");
				        				if(ps2==ps1)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps2);
				    						te.setBackgroundColor(Color.parseColor(pc1));
				    					}
				    					else if(ps3==ps2)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps2);
				    						te.setBackgroundColor(Color.parseColor(pc3));
				    					}
				    					else
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps2);
					        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				    					}
				        				p2.setText("-1");
				                    }
				                    if(pb2.getText().toString()=="OUT" && pb3.getText().toString()=="OUT")
				    				{
				    					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				    					over.setTitle("Game Over.");
				    					over.setMessage("1st Position:Player 1 Balance:Rs. "+pba1+"\n"+"2nd Position:Player 2, Player 3 : OUT");
				    					over.setButton("OK", new DialogInterface.OnClickListener() {
				    			            public void onClick(DialogInterface dialog,int which) {
				    			            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
				    							startActivity(i1);
				    			            }
				    			        });
				    					over.setCancelable(false);
				    					over.show();
				    				}
				    				else if(pb2.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
				    				{
				    					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				    					over.setTitle("Game Over.");
				    					over.setMessage("1st Position:Player 3 Balance:Rs. "+pba3+"\n"+"2nd Position:Player 1, Player 2 : OUT");
				    					over.setButton("OK", new DialogInterface.OnClickListener() {
				    			            public void onClick(DialogInterface dialog,int which) {
				    			            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
				    							startActivity(i1);
				    			            }
				    			        });
				    					over.setCancelable(false);
				    					over.show();
				    				}
				    				else
				    				{
				    					if(ps3!=138 && pb3.getText().toString()!="OUT" && (ps3!=119||kv==1) && (ps3!=129||kv==1))
				    					{
				    						bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
				    					}
				    					else if(ps1!=138 && pb1.getText().toString()!="OUT" && (ps1!=119||iv==1) && (ps1!=129||iv==1))
				    					{
				    						kv=1;
				    						k.setText(kv+"");
				    						bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
				    					}
				    					else
				    					{
				    						if(ps2!=138 && pb2.getText().toString()!="OUT")
				    						{
				    							kv=1;
					    						k.setText(kv+"");
					    						iv=1;
					    						i.setText(iv+"");
				    							bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
				    						}
				    						else if(ps3!=138 && pb3.getText().toString()!="OUT")
											{
				    							kv=1;
					    						k.setText(kv+"");
					    						iv=1;
					    						i.setText(iv+"");
												bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");	
											}
											else if(ps1!=138 && pb1.getText().toString()!="OUT")
											{
												kv=1;
					    						k.setText(kv+"");
					    						iv=1;
					    						i.setText(iv+"");
												bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
											}
				    						else
				    						{
				    							AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				    							over.setTitle("Game Over.");
				    							over.setCancelable(false);
				    							if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				    							{
				    								String max="", min="", mid="";
				    								if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    								{
				    									max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    									if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    										min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    									}
				    									else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    										min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    									}
				    									else
				    									{
				    										mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
				    									}
				    								}
				    								else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    								{
				    									max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    									if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    										min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    									}
				    									else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
				    									{
				    										mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    										min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    									}
				    									else
				    									{
				    										mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
				    									}
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
				    								{
				    									max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
				    									if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
				    									{
				    										mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    										min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    									}
				    									else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
				    									{
				    										mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
				    										min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
				    									}
				    									else
				    									{
				    										mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
				    									}
				    								}
				    								else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
				    								{
				    									max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
				    									mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
				    								{
				    									max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
				    									mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
				    								{
				    									max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
				    									mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
				    								}
				    								else
				    								{
				    									max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
				    								}
				    								over.setMessage(max+"\n"+mid+"\n"+min);
				    							}
				    							else if(pb2.getText().toString()=="OUT")
				    							{
				    								if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
				    								}
				    								else
				    								{
				    									over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
				    								}
				    							}
				    							else if(pb1.getText().toString()=="OUT")
				    							{
				    								if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
				    								}
				    								else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
				    								}
				    								else
				    								{
				    									over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
				    								}
				    							}
				    							else
				    							{
				    								if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
				    								}
				    								else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
				    								{
				    									over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
				    								}
				    								else
				    								{
				    									over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
				    								}
				    							}
				    							over.setButton("OK", new DialogInterface.OnClickListener() {
				    					            public void onClick(DialogInterface dialog,int which) {
				    					            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
				    									startActivity(i1);
				    					            }
				    					        });
				    							over.show();
				    						}
				    					}
				    				}
				                    if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
					                {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			        				dice.setTitle("Dice Thrown:"+rno);
			        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
			        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			     			            public void onClick(DialogInterface dialog,int which) {
			     			            	dice.cancel();
			     			            }
			     			        });
					                }
				                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        		dice.setTitle("Dice Thrown:"+rno);
					        		dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
					        		dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			    public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
								}
								else
								{
									Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
								}
							}
						});
						dia4.show();
					}
					}
					else
					{
						Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
					}
				}
			});
			dia.show();
		}
		if(pba2>=0)
		{
		pb2.setText(pba2+"");
		}
		else if(pba2==-1)
		{
		}
		else
        {
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Player 2 Out!");
			over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
			over.setCanceledOnTouchOutside(true);
			over.show();
			pb2.setText("OUT");
			if(ps2==ps1)
			{
				TextView te=(TextView)r1.getChildAt(ps2);
				te.setBackgroundColor(Color.parseColor(pc1));
			}
			else if(ps3==ps2)
			{
				TextView te=(TextView)r1.getChildAt(ps2);
				te.setBackgroundColor(Color.parseColor(pc3));
			}
			else
			{
				TextView te=(TextView)r1.getChildAt(ps2);
				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
			}
			p2.setText("-1");
        }
		if(pba1>=0)
		{
			pb1.setText(pba1+"");
		}
		else if(pba1==-1)
		{
		}
		else
        {
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Player 1 Out!");
			over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
			over.setCanceledOnTouchOutside(true);
			over.show();
			pb1.setText("OUT");
			if(ps3==ps1)
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundColor(Color.parseColor(pc3));
			}
			else if(ps1==ps2)
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundColor(Color.parseColor(pc2));
			}
			else
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
			}
			p1.setText("-1");
        }
		if(pba3>=0)
		{
			pb3.setText(pba3+"");
		}
		else if(pba3==-1)
		{
		}
		else
        {
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Player 3 Out!");
			over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
			over.setCanceledOnTouchOutside(true);
			over.show();
			pb3.setText("OUT");
			if(ps2==ps3)
			{
				TextView te=(TextView)r1.getChildAt(ps3);
				te.setBackgroundColor(Color.parseColor(pc2));
			}
			else if(ps3==ps1)
			{
				TextView te=(TextView)r1.getChildAt(ps3);
				te.setBackgroundColor(Color.parseColor(pc1));
			}
			else
			{
				TextView te=(TextView)r1.getChildAt(ps3);
				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
			}
			p3.setText("-1");
        }
		if(p2.getText().toString()!="-1")
		{
		p2.setText(ps2+"");
		TextView t2=(TextView)r1.getChildAt(ps2);
		t2.setBackgroundColor(Color.parseColor(pc2));
		}
		}
		else if(ps2==13 || ps2==17)
		{
			if(ps2!=0 && ps1!=ps2 && ps2!=ps3)
			{
				TextView t=(TextView)r1.getChildAt(ps2);
				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
			}
			else if(ps2==ps1)
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundColor(Color.parseColor(pc1));
			}
			else if(ps3==ps2)
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundColor(Color.parseColor(pc3));
			}
			ps2=d;
			TextView te=(TextView)r1.getChildAt(ps2);
			te.setBackgroundColor(Color.parseColor(pc2));
			if(ps2==5)
			{
				pba2-=20;
			}
			else if(ps2==8)
			{
				pba2-=50;
			}
			else if(ps2==15)
			{
				pba2-=30;
			}
			else if(ps2==23)
			{
				pba2-=100;
			}
			else if(ps2==25)
			{
				pba2-=50;
			}
			else if(ps2==29)
			{
				pba2+=100;
			}
			else if(ps2==33)
			{
				pba2-=30;
			}
			else if(ps2==35)
			{
				pba2-=100;
			}
			else if(ps2==37)
			{
				pba2-=30;
			}
			else if(ps2==40)
			{
				pba2+=100;
			}
			else if(ps2==42)
			{
				pba2-=50;
			}
			else if(ps2==45)
			{
				pba2-=50;
			}
			else if(ps2==48)
			{
				pba2-=30;
			}
			else if(ps2==50)
			{
				pba2-=50;
			}
			else if(ps2==52)
			{
				pba2-=100;
			}
			else if(ps2==54)
			{
				pba2-=50;
			}
			else if(ps2==57)
			{
				pba2+=200;
			}
			else if(ps2==68)
			{
				pba2-=100;
			}
			else if(ps2==71)
			{
				pba2-=50;
			}
			else if (ps2==74)
			{
				pba2-=100;
			}
			else if(ps2==77)
			{
				pba2-=50;
			}
			else if(ps2==79)
			{
				pba2-=100;
			}
			else if(ps2==80)
			{
				pba2+=200;
			}
			else if(ps2==81)
			{
				pba2-=100;
			}
			else if(ps2==83)
			{
				pba2-=100;
			}
			else if(ps2==85)
			{
				pba2-=50;
			}
			else if(ps2==89)
			{
				pba2+=50;
			}
			else if(ps2==94)
			{
				pba2-=50;
			}
			else if(ps2==97)
			{
				pba2-=50;
			}
			else if(ps2==99)
			{
				pba2-=50;
			}
			else if(ps2==101)
			{
				pba2-=100;
			}
			else if(ps2==102)
			{
				pba2-=10;
			}
			else if(ps2==109)
			{
				pba2-=30;
			}
			else if(ps2==116)
			{
				pba2-=20;
			}
			else if(ps2==127)
			{
				pba2-=20;
			}
			else if(ps2==129)
			{
				pba2-=20;
			}
			else if(ps2==6||ps2==20||ps2==43||ps2==55||ps2==87||ps2==106||ps2==122||ps2==131||ps2==134)
			{
				dv2=r.nextInt(12)+1;
				dt2.setText(dv2+"");
				switch(dv2)
				{
				case 1:
					AlertDialog alertDialog = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog.setTitle("Holiday Special!");
				    alertDialog.setMessage("Birth Day gifts from each player of Rs. 50/-");
				    alertDialog.setCanceledOnTouchOutside(true);
				    alertDialog.show();
				    if(pba1!=-1 && pba1>=50)
				    {
				    pba2+=50;
				    pba1-=50;
				    }
				    else if(pba1!=-1)
				    {
				    	pba1-=50;
				    }
				    if(pba3!=-1 && pba3>=50)
				    {
				    pba2+=50;
				    pba3-=50;
				    }
				    else if(pba3!=-1)
				    {
				    	pba3-=50;
				    }
					break;
				case 2:
					AlertDialog alertDialog2 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog2.setTitle("Holiday Special!");
				    alertDialog2.setMessage("Car Insurance Get Rs. 100/-");
				    alertDialog2.setCanceledOnTouchOutside(true);
				    alertDialog2.show();
				    pba2+=100;
					break;
				case 3:
					AlertDialog alertDialog3 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog3.setTitle("Holiday Special!");
				    alertDialog3.setMessage("FALGUNI TOYS \n Award of the best player of game Rs. 100/- \n Holiday Special");
				    alertDialog3.setCanceledOnTouchOutside(true);
				    alertDialog3.show();
				    pba2+=100;
					break;
				case 4:
					AlertDialog alertDialog4 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog4.setTitle("Holiday Special!");
				    alertDialog4.setMessage("Family Insurance Pay Rs. 200/-");
				    alertDialog4.setCanceledOnTouchOutside(true);
				    alertDialog4.show();
				    pba2-=200;
					break;
				case 5:
					final AlertDialog alertDialog5 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog5.setTitle("Holiday Special!");
				    alertDialog5.setMessage("Roll the dice and earn 50 times money of the given number");
				    alertDialog5.setCancelable(false);
				    alertDialog5.setButton("Roll", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog,int which) {
			            	Random r=new Random();
			            	int dr=r.nextInt(6)+1;
			            	if(so==true)
							{
								m.start();
							}
			            	alertDialog5.cancel();
			            	int pba2=Integer.parseInt(pb2.getText().toString());
			            	pba2=pba2+(50*dr);
			            	pb2.setText(pba2+"");
			            	int ps1=Integer.parseInt(p1.getText().toString());
			            	int ps3=Integer.parseInt(p3.getText().toString());
			            	int kv=Integer.parseInt(k.getText().toString());
			            	int iv=Integer.parseInt(i.getText().toString());
			            	if(ps3!=138 && pb3.getText().toString()!="OUT" && (ps3!=119||kv==1) && (ps3!=129||kv==1))
							{
								bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
							}
							else if(ps1!=138 && pb1.getText().toString()!="OUT" && (ps1!=119||iv==1) && (ps1!=129||iv==1))
							{
								kv=1;
								k.setText(kv+"");
								bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
							}
							else
							{
								kv=1;
								k.setText(kv+"");
								iv=1;
								i.setText(iv+"");
								bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
							}
			            	if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
			                {
			            	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("After rolling, number on the dice:"+dr);
	        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
			                }
			                else if(pb1.getText().toString()=="OUT")
			                {
			                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("After rolling, number on the dice:"+dr);
		        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
			                }
			                else if(pb3.getText().toString()=="OUT")
			                {
			                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("After rolling, number on the dice:"+dr);
		        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
			                }
			            	}
			        });
				    alertDialog5.show();
					break;
				case 6:
					AlertDialog alertDialog6 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog6.setTitle("Holiday Special!");
				    alertDialog6.setMessage("Car Servicing Charges Rs. 200/-");
				    alertDialog6.setCanceledOnTouchOutside(true);
				    alertDialog6.show();
				    pba2-=200;
					break;
				case 7:
					AlertDialog alertDialog7 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog7.setTitle("Holiday Special!");
				    alertDialog7.setMessage("Wait for six on die");
				    alertDialog7.setCanceledOnTouchOutside(true);
				    alertDialog7.show();
					break;
				case 8:
					AlertDialog alertDialog8 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog8.setTitle("Holiday Special!");
				    alertDialog8.setMessage("Installed car stereo system pay Rs. 250/-");
				    alertDialog8.setCanceledOnTouchOutside(true);
				    alertDialog8.show();
				    pba2-=250;
					break;
				case 9:
					AlertDialog alertDialog9 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog9.setTitle("Holiday Special!");
				    alertDialog9.setMessage("A pair of Designer Eye Glasses Pay Rs. 100/-");
				    alertDialog9.setCanceledOnTouchOutside(true);
				    alertDialog9.show();
				    pba2-=100;
					break;
				case 10:
					AlertDialog alertDialog10 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog10.setTitle("Holiday Special!");
				    alertDialog10.setMessage("Supporting Citizen for a clean Environment Get Rs. 200/-");
				    alertDialog10.setCanceledOnTouchOutside(true);
				    alertDialog10.show();
				    pba2+=200;
					break;
				case 11:
					AlertDialog alertDialog11 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog11.setTitle("Holiday Special!");
				    alertDialog11.setMessage("A Security Man to look after your Home Pay Rs. 100/-");
				    alertDialog11.setCanceledOnTouchOutside(true);
				    alertDialog11.show();
				    pba2-=100;
					break;
				default:
					AlertDialog alertDialog12 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog12.setTitle("Holiday Special!");
				    alertDialog12.setMessage("Sold your old car stereo system get Rs. 200/-");
				    alertDialog12.setCanceledOnTouchOutside(true);
				    alertDialog12.show();
				    pba2+=200;
			}
			}
			if(pba2>=0)
			{
			pb2.setText(pba2+"");
			}
			else if(pba2==-1)
			{
			}
			else
            {
				AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				over.setTitle("Player 2 Out!");
				over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
				over.setCanceledOnTouchOutside(true);
				over.show();
				pb2.setText("OUT");
				if(ps2==ps1)
				{
					TextView t=(TextView)r1.getChildAt(ps2);
					t.setBackgroundColor(Color.parseColor(pc1));
				}
				else if(ps3==ps2)
				{
					TextView t=(TextView)r1.getChildAt(ps2);
					t.setBackgroundColor(Color.parseColor(pc3));
				}
				else
				{
					TextView t=(TextView)r1.getChildAt(ps2);
    				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
				p2.setText("-1");
            }
			if(pba1>=0)
			{
			pb1.setText(pba1+"");
			}
			else if(pba1==-1)
			{
			}
			else
            {
				AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				over.setTitle("Player 1 Out!");
				over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
				over.setCanceledOnTouchOutside(true);
				over.show();
				pb1.setText("OUT");
				if(ps3==ps1)
				{
					TextView t=(TextView)r1.getChildAt(ps1);
					t.setBackgroundColor(Color.parseColor(pc3));
				}
				else if(ps1==ps2)
				{
					TextView t=(TextView)r1.getChildAt(ps1);
					t.setBackgroundColor(Color.parseColor(pc2));
				}
				else
				{
					TextView t=(TextView)r1.getChildAt(ps1);
    				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
				p1.setText("-1");
            }
			if(pba3>=0)
			{
			pb3.setText(pba3+"");
			}
			else if(pba3==-1)
			{
			}
			else
            {
				AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				over.setTitle("Player 3 Out!");
				over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
				over.setCanceledOnTouchOutside(true);
				over.show();
				pb3.setText("OUT");
				if(ps2==ps3)
				{
					TextView t=(TextView)r1.getChildAt(ps3);
					t.setBackgroundColor(Color.parseColor(pc2));
				}
				else if(ps3==ps1)
				{
					TextView t=(TextView)r1.getChildAt(ps3);
					t.setBackgroundColor(Color.parseColor(pc1));
				}
				else
				{
					TextView t=(TextView)r1.getChildAt(ps3);
    				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}TextView t=(TextView)r1.getChildAt(ps3);
				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				p3.setText("-1");
            }
			if(p2.getText().toString()!="-1")
			{
			p2.setText(ps2+"");
			TextView t2=(TextView)r1.getChildAt(ps2);
			t2.setBackgroundColor(Color.parseColor(pc2));
			}
		}
		else if(ps2==52)
		{
			if(d==2)
			{
				if(ps2!=0 && ps1!=ps2 && ps2!=ps3)
				{
					TextView t=(TextView)r1.getChildAt(ps2);
					t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
				else if(ps2==ps1)
				{
					TextView te=(TextView)r1.getChildAt(ps1);
					te.setBackgroundColor(Color.parseColor(pc1));
				}
				else if(ps3==ps2)
				{
					TextView te=(TextView)r1.getChildAt(ps1);
					te.setBackgroundColor(Color.parseColor(pc3));
				}
				if(ps2+d<=138)
				{
				ps2+=d;
				}
				TextView te=(TextView)r1.getChildAt(ps2);
				te.setBackgroundColor(Color.parseColor(pc2));
				if(ps2==5)
				{
					pba2-=20;
				}
				else if(ps2==8)
				{
					pba2-=50;
				}
				else if(ps2==15)
				{
					pba2-=30;
				}
				else if(ps2==23)
				{
					pba2-=100;
				}
				else if(ps2==25)
				{
					pba2-=50;
				}
				else if(ps2==29)
				{
					pba2+=100;
				}
				else if(ps2==33)
				{
					pba2-=30;
				}
				else if(ps2==35)
				{
					pba2-=100;
				}
				else if(ps2==37)
				{
					pba2-=30;
				}
				else if(ps2==40)
				{
					pba2+=100;
				}
				else if(ps2==42)
				{
					pba2-=50;
				}
				else if(ps2==45)
				{
					pba2-=50;
				}
				else if(ps2==48)
				{
					pba2-=30;
				}
				else if(ps2==50)
				{
					pba2-=50;
				}
				else if(ps2==52)
				{
					pba2-=100;
				}
				else if(ps2==54)
				{
					pba2-=50;
				}
				else if(ps2==57)
				{
					pba2+=200;
				}
				else if(ps2==68)
				{
					pba2-=100;
				}
				else if(ps2==71)
				{
					pba2-=50;
				}
				else if (ps2==74)
				{
					pba2-=100;
				}
				else if(ps2==77)
				{
					pba2-=50;
				}
				else if(ps2==79)
				{
					pba2-=100;
				}
				else if(ps2==80)
				{
					pba2+=200;
				}
				else if(ps2==81)
				{
					pba2-=100;
				}
				else if(ps2==83)
				{
					pba2-=100;
				}
				else if(ps2==85)
				{
					pba2-=50;
				}
				else if(ps2==89)
				{
					pba2+=50;
				}
				else if(ps2==94)
				{
					pba2-=50;
				}
				else if(ps2==97)
				{
					pba2-=50;
				}
				else if(ps2==99)
				{
					pba2-=50;
				}
				else if(ps2==101)
				{
					pba2-=100;
				}
				else if(ps2==102)
				{
					pba2-=10;
				}
				else if(ps2==109)
				{
					pba2-=30;
				}
				else if(ps2==116)
				{
					pba2-=20;
				}
				else if(ps2==127)
				{
					pba2-=20;
				}
				else if(ps2==129)
				{
					pba2-=20;
				}
				if(pba2>=0)
				{
				pb2.setText(pba2+"");
				}
				else if(pba2==-1)
        		{
        		}
				else
                {
						AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				over.setTitle("Player 2 Out!");
        				over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
        				over.setCanceledOnTouchOutside(true);
        				over.show();
        				pb2.setText("OUT");
        				TextView t=(TextView)r1.getChildAt(ps2);
        				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
        				p2.setText("-1");
                }
				if(p2.getText().toString()!="-1")
				{
				p2.setText(ps2+"");
				TextView t2=(TextView)r1.getChildAt(ps2);
				t2.setBackgroundColor(Color.parseColor(pc2));
				}
			}
		}
		else
		{
			if(d==6)
			{
				dv2=0;
				dt2.setText(dv2+"");
				if(ps2!=0 && ps1!=ps2 && ps2!=ps3)
				{
				TextView t=(TextView)r1.getChildAt(ps2);
				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
				else if(ps2==ps1)
				{
					TextView t=(TextView)r1.getChildAt(ps2);
					t.setBackgroundColor(Color.parseColor(pc1));
				}
				else if(ps3==ps2)
				{
					TextView t=(TextView)r1.getChildAt(ps2);
					t.setBackgroundColor(Color.parseColor(pc3));
				}
				if(ps2+d<=138)
				{
				ps2+=d;
				}
				if(ps2==5)
				{
					pba2-=20;
				}
				else if(ps2==8)
				{
					pba2-=50;
				}
				else if(ps2==15)
				{
					pba2-=30;
				}
				else if(ps2==23)
				{
					pba2-=100;
				}
				else if(ps2==25)
				{
					pba2-=50;
				}
				else if(ps2==29)
				{
					pba2+=100;
				}
				else if(ps2==33)
				{
					pba2-=30;
				}
				else if(ps2==35)
				{
					pba2-=100;
				}
				else if(ps2==37)
				{
					pba2-=30;
				}
				else if(ps2==40)
				{
					pba2+=100;
				}
				else if(ps2==42)
				{
					pba2-=50;
				}
				else if(ps2==45)
				{
					pba2-=50;
				}
				else if(ps2==48)
				{
					pba2-=30;
				}
				else if(ps2==50)
				{
					pba2-=50;
				}
				else if(ps2==52)
				{
					pba2-=100;
				}
				else if(ps2==54)
				{
					pba2-=50;
				}
				else if(ps2==57)
				{
					pba2+=200;
				}
				else if(ps2==68)
				{
					pba2-=100;
				}
				else if(ps2==71)
				{
					pba2-=50;
				}
				else if (ps2==74)
				{
					pba2-=100;
				}
				else if(ps2==77)
				{
					pba2-=50;
				}
				else if(ps2==79)
				{
					pba2-=100;
				}
				else if(ps2==80)
				{
					pba2+=200;
				}
				else if(ps2==81)
				{
					pba2-=100;
				}
				else if(ps2==83)
				{
					pba2-=100;
				}
				else if(ps2==85)
				{
					pba2-=50;
				}
				else if(ps2==89)
				{
					pba2+=50;
				}
				else if(ps2==94)
				{
					pba2-=50;
				}
				else if(ps2==97)
				{
					pba2-=50;
				}
				else if(ps2==99)
				{
					pba2-=50;
				}
				else if(ps2==101)
				{
					pba2-=100;
				}
				else if(ps2==102)
				{
					pba2-=10;
				}
				else if(ps2==109)
				{
					pba2-=30;
				}
				else if(ps1==116)
				{
					pba2-=20;
				}
				else if(ps2==127)
				{
					pba2-=20;
				}
				else if(ps2==129)
				{
					pba2-=20;
				}
				else if(ps2==6||ps2==20||ps2==43||ps2==55||ps2==87||ps2==106||ps2==122||ps2==131||ps2==134)
				{
					dv2=r.nextInt(12)+1;
					dt2.setText(dv2+"");
					switch(dv2)
					{
					case 1:
						AlertDialog alertDialog = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog.setTitle("Holiday Special!");
    				    alertDialog.setMessage("Birth Day gifts from each player of Rs. 50/-");
    				    alertDialog.setCanceledOnTouchOutside(true);
    				    alertDialog.show();
    				    if(pba1!=-1 && pba1>=50)
    				    {
    				    pba2+=50;
    				    pba1-=50;
    				    }
    				    else if(pba1!=-1)
    				    {
    				    	pba1-=50;
    				    }
    				    if(pba3!=-1 && pba3>=50)
    				    {
    				    pba2+=50;
    				    pba3-=50;
    				    }
    				    else if(pba3!=-1)
    				    {
    				    	pba3-=50;
    				    }
						break;
					case 2:
						AlertDialog alertDialog2 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog2.setTitle("Holiday Special!");
    				    alertDialog2.setMessage("Car Insurance Get Rs. 100/-");
    				    alertDialog2.setCanceledOnTouchOutside(true);
    				    alertDialog2.show();
    				    pba2+=100;
						break;
					case 3:
						AlertDialog alertDialog3 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog3.setTitle("Holiday Special!");
    				    alertDialog3.setMessage("FALGUNI TOYS \n Award of the best player of game Rs. 100/- \n Holiday Special");
    				    alertDialog3.setCanceledOnTouchOutside(true);
    				    alertDialog3.show();
    				    pba2+=100;
						break;
					case 4:
						AlertDialog alertDialog4 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog4.setTitle("Holiday Special!");
    				    alertDialog4.setMessage("Family Insurance Pay Rs. 200/-");
    				    alertDialog4.setCanceledOnTouchOutside(true);
    				    alertDialog4.show();
    				    pba2-=200;
						break;
					case 5:
						final AlertDialog alertDialog5 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog5.setTitle("Holiday Special!");
    				    alertDialog5.setMessage("Roll the dice and earn 50 times money of the given number");
    				    alertDialog5.setCancelable(false);
    				    alertDialog5.setButton("Roll", new DialogInterface.OnClickListener() {
    			            public void onClick(DialogInterface dialog,int which) {
    			            	Random r=new Random();
    			            	int dr=r.nextInt(6)+1;
    			            	if(so==true)
    							{
    								m.start();
    							}
    			            	alertDialog5.cancel();
    			            	int pba2=Integer.parseInt(pb2.getText().toString());
    			            	pba2=pba2+(50*dr);
    			            	pb2.setText(pba2+"");
    			            	int ps1=Integer.parseInt(p1.getText().toString());
    			            	int ps3=Integer.parseInt(p3.getText().toString());
    			            	int kv=Integer.parseInt(k.getText().toString());
    			            	int iv=Integer.parseInt(i.getText().toString());
    			            	if(ps3!=138 && pb3.getText().toString()!="OUT" && (ps3!=119||kv==1) && (ps3!=129||kv==1))
    							{
    								bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
    							}
    							else if(ps1!=138 && pb1.getText().toString()!="OUT" && (ps1!=119||iv==1) && (ps1!=129||iv==1))
    							{
    								kv=1;
    								k.setText(kv+"");
    								bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
    							}
    							else
    							{
    								kv=1;
    								k.setText(kv+"");
    								iv=1;
    								i.setText(iv+"");
    								bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
    							}
    			            	if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
    			                {
    			            	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    	        				dice.setTitle("After rolling, number on the dice:"+dr);
    	        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
    	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
    	     			            public void onClick(DialogInterface dialog,int which) {
    	     			            	dice.cancel();
    	     			            }
    	     			        });
    			                }
    			                else if(pb1.getText().toString()=="OUT")
    			                {
    			                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    		        				dice.setTitle("After rolling, number on the dice:"+dr);
    		        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
    		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
    		     			            public void onClick(DialogInterface dialog,int which) {
    		     			            	dice.cancel();
    		     			            }
    		     			        });
    			                }
    			                else if(pb3.getText().toString()=="OUT")
    			                {
    			                	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    		        				dice.setTitle("After rolling, number on the dice:"+dr);
    		        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
    		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
    		     			            public void onClick(DialogInterface dialog,int which) {
    		     			            	dice.cancel();
    		     			            }
    		     			        });
    			                }
    			            	}
    			        });
    				    alertDialog5.show();
						break;
					case 6:
						AlertDialog alertDialog6 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog6.setTitle("Holiday Special!");
    				    alertDialog6.setMessage("Car Servicing Charges Rs. 200/-");
    				    alertDialog6.setCanceledOnTouchOutside(true);
    				    alertDialog6.show();
    				    pba2-=200;
						break;
					case 7:
						AlertDialog alertDialog7 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog7.setTitle("Holiday Special!");
    				    alertDialog7.setMessage("Wait for six on die");
    				    alertDialog7.setCanceledOnTouchOutside(true);
    				    alertDialog7.show();
						break;
					case 8:
						AlertDialog alertDialog8 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog8.setTitle("Holiday Special!");
    				    alertDialog8.setMessage("Installed car stereo system pay Rs. 250/-");
    				    alertDialog8.setCanceledOnTouchOutside(true);
    				    alertDialog8.show();
    				    pba2-=250;
						break;
					case 9:
						AlertDialog alertDialog9 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog9.setTitle("Holiday Special!");
    				    alertDialog9.setMessage("A pair of Designer Eye Glasses Pay Rs. 100/-");
    				    alertDialog9.setCanceledOnTouchOutside(true);
    				    alertDialog9.show();
    				    pba2-=100;
						break;
					case 10:
						AlertDialog alertDialog10 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog10.setTitle("Holiday Special!");
    				    alertDialog10.setMessage("Supporting Citizen for a clean Environment Get Rs. 200/-");
    				    alertDialog10.setCanceledOnTouchOutside(true);
    				    alertDialog10.show();
    				    pba2+=200;
						break;
					case 11:
						AlertDialog alertDialog11 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog11.setTitle("Holiday Special!");
    				    alertDialog11.setMessage("A Security Man to look after your Home Pay Rs. 100/-");
    				    alertDialog11.setCanceledOnTouchOutside(true);
    				    alertDialog11.show();
    				    pba2-=100;
						break;
					default:
						AlertDialog alertDialog12 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog12.setTitle("Holiday Special!");
    				    alertDialog12.setMessage("Sold your old car stereo system get Rs. 200/-");
    				    alertDialog12.setCanceledOnTouchOutside(true);
    				    alertDialog12.show();
    				    pba2+=200;
					}
				}
				if(pba2>=0)
				{
				pb2.setText(pba2+"");
				}
				else if(pba2==-1)
				{
				}
				else
                {
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				over.setTitle("Player 2 Out!");
    				over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
    				over.setCanceledOnTouchOutside(true);
    				over.show();
    				pb2.setText("OUT");
    				if(ps2==ps3)
					{
						TextView te=(TextView)r1.getChildAt(ps3);
						te.setBackgroundColor(Color.parseColor(pc2));
					}
					else if(ps3==ps1)
					{
						TextView te=(TextView)r1.getChildAt(ps3);
						te.setBackgroundColor(Color.parseColor(pc1));
					}
					else
					{
						TextView te=(TextView)r1.getChildAt(ps3);
        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					}
    				p2.setText("-1");
                }
				if(pba1>=0)
				{
				pb1.setText(pba1+"");
				}
				else if(pba1==-1)
				{
				}
				else
                {
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				over.setTitle("Player 1 Out!");
    				over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
    				over.setCanceledOnTouchOutside(true);
    				over.show();
    				pb1.setText("OUT");
    				if(ps3==ps1)
					{
						TextView t=(TextView)r1.getChildAt(ps1);
						t.setBackgroundColor(Color.parseColor(pc3));
					}
					else if(ps1==ps2)
					{
						TextView t=(TextView)r1.getChildAt(ps1);
						t.setBackgroundColor(Color.parseColor(pc2));
					}
					else
					{
						TextView t=(TextView)r1.getChildAt(ps1);
        				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					}
    				p1.setText("-1");
                }
				if(pba3>=0)
				{
				pb3.setText(pba3+"");
				}
				else if(pba3==-1)
				{
				}
				else
                {
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				over.setTitle("Player 3 Out!");
    				over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
    				over.setCanceledOnTouchOutside(true);
    				over.show();
    				pb3.setText("OUT");
    				if(ps2==ps3)
					{
						TextView te=(TextView)r1.getChildAt(ps3);
						te.setBackgroundColor(Color.parseColor(pc2));
					}
					else if(ps3==ps1)
					{
						TextView te=(TextView)r1.getChildAt(ps3);
						te.setBackgroundColor(Color.parseColor(pc1));
					}
					else
					{
						TextView te=(TextView)r1.getChildAt(ps3);
        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					}
    				p3.setText("-1");
                }
				if(p2.getText().toString()!="-1")
				{
				p2.setText(ps2+"");
				TextView t2=(TextView)r1.getChildAt(ps2);
				t2.setBackgroundColor(Color.parseColor(pc2));
				}
			}
		}
		 if(pb2.getText().toString()=="OUT" && pb3.getText().toString()=="OUT")
			{
				AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				over.setTitle("Game Over.");
				over.setMessage("1st Position:Player 1 Balance:Rs. "+pba1+"\n"+"2nd Position:Player 2, Player 3 : OUT");
				over.setButton("OK", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog,int which) {
		            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
						startActivity(i1);
		            }
		        });
				over.setCancelable(false);
				over.show();
			}
			else if(pb2.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
			{
				AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				over.setTitle("Game Over.");
				over.setMessage("1st Position:Player 3 Balance:Rs. "+pba3+"\n"+"2nd Position:Player 1, Player 2 : OUT");
				over.setButton("OK", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog,int which) {
		            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
						startActivity(i1);
		            }
		        });
				over.setCancelable(false);
				over.show();
			}
			else
			{
				if(!(((ps2!=119)||jv==1) && ((ps2!=129)||jv==1) && ((ps2!=6 && ps2!=20 && ps2!=43 && ps2!=55 && ps2!=87 && ps2!=106 && ps2!=122 && ps2!=131 && ps2!=134) || (dv2!=5)) && ps2!=58 && ps2!=60 && ps2!=62))
				{
					bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
					if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                    {
                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				dice.setTitle("Dice Thrown:"+d);
    				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
 			            public void onClick(DialogInterface dialog,int which) {
 			            	dice.cancel();
 			            }
 			        });
                    }
                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                    {
                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
                    }
                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                    {
                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
                    }
                    else if(pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                    {
                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
                    }
				}
				else if(ps3!=138 && pb3.getText().toString()!="OUT" && (ps3!=119||kv==1) && (ps3!=129||kv==1))
				{
					bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
					if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				dice.setTitle("Dice Thrown:"+d);
    				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
 			            public void onClick(DialogInterface dialog,int which) {
 			            	dice.cancel();
 			            }
 			        });
	                }
                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                    {
                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        		dice.setTitle("Dice Thrown:"+d);
	        		dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
	        		dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			    public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
                    }
                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                    {
                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
                    }
                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                    {
                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
                    }
				}
				else if(ps1!=138 && pb1.getText().toString()!="OUT" && (ps1!=119||iv==1) && (ps1!=129||iv==1))
				{
					kv=1;
					k.setText(kv+"");
					bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
					if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				dice.setTitle("Dice Thrown:"+d);
    				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
 			            public void onClick(DialogInterface dialog,int which) {
 			            	dice.cancel();
 			            }
 			        });
	                }
                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                    {
                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        		dice.setTitle("Dice Thrown:"+d);
	        		dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
	        		dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			    public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
                    }
                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                    {
                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
                    }
                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                    {
                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
                    }
				}
				else
				{
					if(ps2!=138 && pb2.getText().toString()!="OUT" && (ps2!=119||jv==1) && (ps2!=129||jv==1))
					{
						kv=1;
						k.setText(kv+"");
						iv=1;
						i.setText(iv+"");
						bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
						if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
		                {
	                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });
		                }
	                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                    {
	                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        		dice.setTitle("Dice Thrown:"+d);
		        		dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
		        		dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			    public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
	                    }
	                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                    {
	                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("Dice Thrown:"+d);
		        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
	                    }
	                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                    {
	                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("Dice Thrown:"+d);
		        				dice.setMessage("Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
	                    }
					}
					else if(ps3!=138 && pb3.getText().toString()!="OUT")
					{
						kv=1;
						k.setText(kv+"");
						iv=1;
						i.setText(iv+"");
						jv=1;
						j.setText(jv+"");
						bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");	
						if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
		                {
	                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });
		                }
	                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                    {
	                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        		dice.setTitle("Dice Thrown:"+d);
		        		dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
		        		dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			    public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
	                    }
	                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                    {
	                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("Dice Thrown:"+d);
		        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
	                    }
	                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                    {
	                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("Dice Thrown:"+d);
		        				dice.setMessage("Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
	                    }
					}
					else if(ps1!=138 && pb1.getText().toString()!="OUT")
					{
						iv=1;
						i.setText(iv+"");
						jv=1;
						j.setText(jv+"");
						bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
						if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
		                {
	                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });
		                }
	                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                    {
	                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        		dice.setTitle("Dice Thrown:"+d);
		        		dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
		        		dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			    public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
	                    }
	                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                    {
	                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("Dice Thrown:"+d);
		        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
	                    }
	                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                    {
	                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("Dice Thrown:"+d);
		        				dice.setMessage("Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
	                    }
					}
					else if(ps2!=138 && pb2.getText().toString()!="OUT")
					{
						jv=1;
						j.setText(jv+"");
						bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
						if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
		                {
	                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	    				dice.setTitle("Dice Thrown:"+d);
	    				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
	    				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	 			            public void onClick(DialogInterface dialog,int which) {
	 			            	dice.cancel();
	 			            }
	 			        });
		                }
	                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                    {
	                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        		dice.setTitle("Dice Thrown:"+d);
		        		dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
		        		dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			    public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
	                    }
	                    else if(pb3.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                    {
	                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("Dice Thrown:"+d);
		        				dice.setMessage("Balance of Player 2:Rs. "+pb2.getText().toString()+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT");
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
	                    }
	                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                    {
	                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("Dice Thrown:"+d);
		        				dice.setMessage("Player 2:OUT"+"\n"+"Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString());
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
	                    }
					}
					else
					{
						AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
						over.setTitle("Game Over.");
						over.setCancelable(false);
						if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
						{
							String max="", min="", mid="";
							if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
							{
								max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
								if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
								{
									mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
									min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
								}
								else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
								{
									mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
									min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
								}
								else
								{
									mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
								}
							}
							else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
							{
								max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
								if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
								{
									mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
									min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
								}
								else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
								{
									mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
									min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
								}
								else
								{
									mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
								}
							}
							else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
							{
								max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
								if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
								{
									mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
									min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
								}
								else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
								{
									mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
									min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
								}
								else
								{
									mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
								}
							}
							else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
							{
								max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
								mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
							}
							else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
							{
								max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
								mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
							}
							else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
							{
								max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
								mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
							}
							else
							{
								max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
							}
							over.setMessage(max+"\n"+mid+"\n"+min);
						}
						else if(pb2.getText().toString()=="OUT")
						{
							if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
							{
								over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
							}
							else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
							{
								over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
							}
							else
							{
								over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
							}
						}
						else if(pb1.getText().toString()=="OUT")
						{
							if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
							{
								over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
							}
							else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
							{
								over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
							}
							else
							{
								over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
							}
						}
						else
						{
							if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
							{
								over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
							}
							else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
							{
								over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
							}
							else
							{
								over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
							}
						}
						over.setButton("OK", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog,int which) {
				            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
								startActivity(i1);
				            }
				        });
						over.show();
					}
				}
			}	
	}
	public void play3(String pc,String pca,String pcb,boolean s)
	{
		final boolean so=s;
		final String pc1=pc;
		final String pc2=pca;
		final String pc3=pcb;
		final TextView pb1=(TextView)findViewById(R.id.pb1);
	    final TextView pb2=(TextView)findViewById(R.id.pb2);
	    final TextView pb3=(TextView)findViewById(R.id.pb3);
	    final TextView p1=(TextView)findViewById(R.id.p1);
	    final TextView p2=(TextView)findViewById(R.id.p2);
	    final TextView p3=(TextView)findViewById(R.id.p3);
	    final TextView i=(TextView)findViewById(R.id.i);
	    final TextView j=(TextView)findViewById(R.id.j);
	    final TextView k=(TextView)findViewById(R.id.k);
	    final TextView bo=(TextView)findViewById(R.id.bottom);
	    final TextView dt3=(TextView)findViewById(R.id.dt3);
	    final String Name1=getIntent().getExtras().getString("Name1");
	    final String Name2=getIntent().getExtras().getString("Name2");
	    final String Name3=getIntent().getExtras().getString("Name3");
		int ps1=Integer.parseInt(p1.getText().toString());
		int ps2=Integer.parseInt(p2.getText().toString());
		int ps3=Integer.parseInt(p3.getText().toString());
		int iv=Integer.parseInt(i.getText().toString());
		int jv=Integer.parseInt(j.getText().toString());
		int kv=Integer.parseInt(k.getText().toString());
		final RelativeLayout r1=(RelativeLayout)findViewById(R.id.linearLayout1);
		final TextView no1=(TextView)findViewById(R.id.no1);
        final TextView no2=(TextView)findViewById(R.id.no2);
		Random r=new Random();
		short d;
		d=(short) (r.nextInt(6)+1);
		if(so==true)
		{
			m.start();
		}
		int pba1,pba2,pba3;
		if(pb1.getText().toString()!="OUT")
		{
		pba1=Integer.parseInt(pb1.getText().toString ());
		}
		else
		{
			pba1=-1;
		}
		if(pb2.getText().toString()!="OUT")
		{
		pba2=Integer.parseInt(pb2.getText().toString ());
		}
		else
		{
			pba2=-1;
		}
		if(pb3.getText().toString()!="OUT")
		{
		pba3=Integer.parseInt(pb3.getText().toString ());
		}
		else
		{
			pba3=-1;
		}
		int dv3=Integer.parseInt(dt3.getText().toString ());
		if(ps3!=1 && ps3!=10 && ps3!=13 && ps3!=17 && ps3!=52 && ps3!=65 && ps3!=104 && ps3!=112 && ps3!=116 && ps3!=124 && ps3!=132 && ps3>=0 && (dv3!=7 ||(ps3!=6 && ps3!=20 && ps3!=43 && ps3!=55 && ps3!=87 && ps3!=106 && ps3!=122 && ps3!=131 && ps3!=134)))
		{
			kv=0;
			k.setText(kv+"");
		if(ps3!=0 && ps3!=ps2 && ps1!=ps3)
		{
		TextView t=(TextView)r1.getChildAt(ps3);
		t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
		}
		else if(ps2==ps3 && ps3!=0)
		{
			TextView t=(TextView)r1.getChildAt(ps3);
			t.setBackgroundColor(Color.parseColor(pc2));
		}
		else if(ps1==ps3 && ps3!=0)
		{
			TextView t=(TextView)r1.getChildAt(ps3);
			t.setBackgroundColor(Color.parseColor(pc1));
		}
		if(ps3+d<=138)
		{
		ps3+=d;
		}
		else if(ps3==134)
		{
			if(ps1!=138 && pb1.getText().toString()!="OUT" && ((ps1!=119)||iv==1) && ((ps1!=129)||iv==1))
			{
				bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
			}
			else if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
			{
				iv=1;
				i.setText(iv+"");
				bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
			}
			else
			{
				iv=1;
				i.setText(iv+"");
				jv=1;
				j.setText(jv+"");
				bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
			}
			return;
		}
		if(ps3==5)
		{
			pba3-=20;
		}
		else if(ps3==8)
		{
			pba3-=50;
		}
		else if(ps3==15)
		{
			pba3-=30;
		}
		else if(ps3==23)
		{
			pba3-=100;
		}
		else if(ps3==25)
		{
			pba3-=50;
		}
		else if(ps3==29)
		{
			pba3+=100;
		}
		else if(ps3==33)
		{
			pba3-=30;
		}
		else if(ps3==35)
		{
			pba3-=100;
		}
		else if(ps3==37)
		{
			pba3-=30;
		}
		else if(ps3==40)
		{
			pba3+=100;
		}
		else if(ps3==42)
		{
			pba3-=50;
		}
		else if(ps3==45)
		{
			pba3-=50;
		}
		else if(ps3==48)
		{
			pba3-=30;
		}
		else if(ps3==50)
		{
			pba3-=50;
		}
		else if(ps3==52)
		{
			pba3-=100;
		}
		else if(ps3==54)
		{
			pba3-=50;
		}
		else if(ps3==57)
		{
			pba3+=200;
		}
		else if(ps3==68)
		{
			pba3-=100;
		}
		else if(ps3==71)
		{
			pba3-=50;
		}
		else if (ps3==74)
		{
			pba3-=100;
		}
		else if(ps3==77)
		{
			pba3-=50;
		}
		else if(ps3==79)
		{
			pba3-=100;
		}
		else if(ps3==80)
		{
			pba3+=200;
		}
		else if(ps3==81)
		{
			pba3-=100;
		}
		else if(ps3==83)
		{
			pba3-=100;
		}
		else if(ps3==85)
		{
			pba3-=50;
		}
		else if(ps3==89)
		{
			pba3+=50;
		}
		else if(ps3==94)
		{
			pba3-=50;
		}
		else if(ps3==97)
		{
			pba3-=50;
		}
		else if(ps3==99)
		{
			pba3-=50;
		}
		else if(ps3==101)
		{
			pba3-=100;
		}
		else if(ps3==102)
		{
			pba3-=10;
		}
		else if(ps3==109)
		{
			pba3-=30;
		}
		else if(ps3==116)
		{
			pba3-=20;
		}
		else if(ps3==127)
		{
			pba3-=20;
		}
		else if(ps3==129)
		{
			pba3-=20;
		}
		else if(ps3==6||ps3==20||ps3==43||ps3==55||ps3==87||ps3==106||ps3==122||ps3==131||ps3==134)
		{
			dv3=r.nextInt(12)+1;
			dt3.setText(dv3+"");
			switch(dv3)
			{
			case 1:
				AlertDialog alertDialog = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog.setTitle("Holiday Special!");
			    alertDialog.setMessage("Birth Day gifts from each player of Rs. 50/-");
			    alertDialog.setCanceledOnTouchOutside(true);
			    alertDialog.show();
			    if(pba2!=-1 && pba2>=50)
			    {
			    pba3+=50;
			    pba2-=50;
			    }
			    else if(pba2!=-1)
			    {
			    	pba2-=50;
			    }
			    if(pba1!=-1 && pba1>=50)
			    {
			    pba3+=50;
			    pba1-=50;
			    }
			    else if(pba1!=-1)
			    {
			    	pba1-=50;
			    }
				break;
			case 2:
				AlertDialog alertDialog2 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog2.setTitle("Holiday Special!");
			    alertDialog2.setMessage("Car Insurance Get Rs. 100/-");
			    alertDialog2.setCanceledOnTouchOutside(true);
			    alertDialog2.show();
			    pba3+=100;
				break;
			case 3:
				AlertDialog alertDialog3 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog3.setTitle("Holiday Special!");
			    alertDialog3.setMessage("FALGUNI TOYS \n Award of the best player of game Rs. 100/- \n Holiday Special");
			    alertDialog3.setCanceledOnTouchOutside(true);
			    alertDialog3.show();
			    pba3+=100;
				break;
			case 4:
				AlertDialog alertDialog4 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog4.setTitle("Holiday Special!");
			    alertDialog4.setMessage("Family Insurance Pay Rs. 200/-");
			    alertDialog4.setCanceledOnTouchOutside(true);
			    alertDialog4.show();
			    pba3-=200;
				break;
			case 5:
				final AlertDialog alertDialog5 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog5.setTitle("Holiday Special!");
			    alertDialog5.setMessage("Roll the dice and earn 50 times money of the given number");
			    alertDialog5.setCancelable(false);
			    alertDialog5.setButton("Roll", new DialogInterface.OnClickListener() {
		            public void onClick(DialogInterface dialog,int which) {
		            	Random r=new Random();
		            	int dr=r.nextInt(6)+1;
		            	if(so==true)
						{
							m.start();
						}
		            	alertDialog5.cancel();
		            	int pba3=Integer.parseInt(pb3.getText().toString());
		            	pba3=pba3+(50*dr);
		            	pb3.setText(pba3+"");
		            	int ps2=Integer.parseInt(p2.getText().toString());
		            	int ps1=Integer.parseInt(p1.getText().toString());
		            	int iv=Integer.parseInt(i.getText().toString());
		            	int jv=Integer.parseInt(j.getText().toString());
		            	if(ps1!=138 && pb1.getText().toString()!="OUT" && ((ps1!=119)||iv==1) && ((ps1!=129)||iv==1))
						{
							bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
						}
						else if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
						{
							iv=1;
							i.setText(iv+"");
							bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
						}
						else
						{
							iv=1;
							i.setText(iv+"");
							jv=1;
							j.setText(jv+"");
							bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
						}
		            	if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                    {
		            	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				dice.setTitle("After rolling, number on the dice:"+dr);
        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
     			            public void onClick(DialogInterface dialog,int which) {
     			            	dice.cancel();
     			            }
     			        });
	                    }
		            	else if(pb1.getText().toString()=="OUT")
		            	{
		            		final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("After rolling, number on the dice:"+dr);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
		            	}
		            	else if(pb2.getText().toString()=="OUT")
		            	{
		            		final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("After rolling, number on the dice:"+dr);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
		            	}
		            }
		        });
			    alertDialog5.show();
				break;
			case 6:
				AlertDialog alertDialog6 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog6.setTitle("Holiday Special!");
			    alertDialog6.setMessage("Car Servicing Charges Rs. 200/-");
			    alertDialog6.setCanceledOnTouchOutside(true);
			    alertDialog6.show();
			    pba3-=200;
				break;
			case 7:
				AlertDialog alertDialog7 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog7.setTitle("Holiday Special!");
			    alertDialog7.setMessage("Wait for six on die");
			    alertDialog7.setCanceledOnTouchOutside(true);
			    alertDialog7.show();
				break;
			case 8:
				AlertDialog alertDialog8 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog8.setTitle("Holiday Special!");
			    alertDialog8.setMessage("Installed car stereo system pay Rs. 250/-");
			    alertDialog8.setCanceledOnTouchOutside(true);
			    alertDialog8.show();
			    pba3-=250;
				break;
			case 9:
				AlertDialog alertDialog9 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog9.setTitle("Holiday Special!");
			    alertDialog9.setMessage("A pair of Designer Eye Glasses Pay Rs. 100/-");
			    alertDialog9.setCanceledOnTouchOutside(true);
			    alertDialog9.show();
			    pba3-=100;
				break;
			case 10:
				AlertDialog alertDialog10 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog10.setTitle("Holiday Special!");
			    alertDialog10.setMessage("Supporting Citizen for a clean Environment Get Rs. 200/-");
			    alertDialog10.setCanceledOnTouchOutside(true);
			    alertDialog10.show();
			    pba3+=200;
				break;
			case 11:
				AlertDialog alertDialog11 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog11.setTitle("Holiday Special!");
			    alertDialog11.setMessage("A Security Man to look after your Home Pay Rs. 100/-");
			    alertDialog11.setCanceledOnTouchOutside(true);
			    alertDialog11.show();
			    pba3-=100;
				break;
			default:
				AlertDialog alertDialog12 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
				alertDialog12.setTitle("Holiday Special!");
			    alertDialog12.setMessage("Sold your old car stereo system get Rs. 200/-");
			    alertDialog12.setCanceledOnTouchOutside(true);
			    alertDialog12.show();
			    pba3+=200;
			}
		}
		else if(ps3==58||ps3==60||ps3==62)
		{
			final Dialog dia= new Dialog(Picnicplay3Activity.this);
			dia.setContentView(R.layout.dialogno1);
			dia.setTitle("Dice Throw of Rs. 100");
			dia.setCancelable(false);
			final RadioGroup rg=(RadioGroup)dia.findViewById(R.id.radio);
			Button bd=(Button)dia.findViewById(R.id.button);
			bd.setOnClickListener(new OnClickListener() {
				
				@Override
				public void onClick(View v) {
					// TODO Auto-generated method stub
					int ds=rg.getCheckedRadioButtonId();
					RadioButton rb=(RadioButton)dia.findViewById(ds);
					if(rb!=null)
					{
					dia.cancel();	
					if(rb.getText().toString().contains("2"))
					{
						no1.setText("2");
						final Dialog dia1= new Dialog(Picnicplay3Activity.this);
						dia1.setContentView(R.layout.dialog1);
						dia1.setTitle("Dice Throw of Rs. 100");
						dia1.setCancelable(false);
						final RadioGroup rg1=(RadioGroup)dia1.findViewById(R.id.radio);
						Button bd1=(Button)dia1.findViewById(R.id.button1);
						bd1.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								int ds1=rg1.getCheckedRadioButtonId();
								RadioButton rb1=(RadioButton)dia1.findViewById(ds1);
								if(rb1!=null)
								{
									dia1.cancel();
								if(rb1.getText().toString().contains("2"))
								{
									no2.setText("2");
								}
								else if(rb1.getText().toString().contains("3"))
								{
									no2.setText("3");
								}
								else if(rb1.getText().toString().contains("4"))
								{
									no2.setText("4");
								}
								 Random r=new Random();
				                    int rno=r.nextInt(6)+1;
				                    if(so==true)
	    							{
	    								m.start();
	    							}
				                    int n1=Integer.parseInt(no1.getText().toString());
				                    int n2=Integer.parseInt(no2.getText().toString());
				                    int pba3=Integer.parseInt(pb3.getText().toString());
				                    int pba2=Integer.parseInt(pb2.getText().toString());
				                    int pba1=Integer.parseInt(pb1.getText().toString());
				                    if(rno==n1 || rno==n2)
				                    {
				                    	pba3+=100;
				                    }
				                    else
				                    {
				                    	pba3-=100;
				                    }
				                    int ps1=Integer.parseInt(p1.getText().toString());
				                    int ps2=Integer.parseInt(p2.getText().toString());
				                    int ps3=Integer.parseInt(p3.getText().toString());
				                    int iv=Integer.parseInt(i.getText().toString());
				                    int jv=Integer.parseInt(j.getText().toString());
				                    if(pba3>=0)
									{
									pb3.setText(pba3+"");
									}
				                    else if(pba3==-1)
				            		{
				            		}
				                    else
				                    {
				                    	AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				over.setTitle("Player 3 Out!");
				        				over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
				        				over.setCanceledOnTouchOutside(true);
				        				over.show();
				        				pb3.setText("OUT");
				        				if(ps2==ps3)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps3);
				    						te.setBackgroundColor(Color.parseColor(pc2));
				    					}
				    					else if(ps3==ps1)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps3);
				    						te.setBackgroundColor(Color.parseColor(pc1));
				    					}
				    					else
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps3);
					        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				    					}
				        				p3.setText("-1");
				                    }
				                    if(pb2.getText().toString()=="OUT" && pb3.getText().toString()=="OUT")
									{
										AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
										over.setTitle("Game Over.");
										over.setCancelable(false);
										over.setMessage("1st Position:Player 1 Balance:Rs. "+pba1+"\n"+"2nd Position:Player 2, Player 3 : OUT");
										over.setButton("OK", new DialogInterface.OnClickListener() {
								            public void onClick(DialogInterface dialog,int which) {
								            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
												startActivity(i1);
								            }
								        });
										over.show();
									}
									else if(pb3.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
									{
										AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
										over.setTitle("Game Over.");
										over.setCancelable(false);
										over.setMessage("1st Position:Player 2 Balance:Rs. "+pba2+"\n"+"2nd Position:Player 1, Player 3 : OUT");
										over.setButton("OK", new DialogInterface.OnClickListener() {
								            public void onClick(DialogInterface dialog,int which) {
								            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
												startActivity(i1);
								            }
								        });
										over.show();
									}
									else
									{
										if(ps1!=138 && pb1.getText().toString()!="OUT" && ((ps1!=119)||iv==1) && ((ps1!=129)||iv==1))
										{
											bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
										}
										else if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
										{
											iv=1;
											i.setText(iv+"");
											bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
										}
										else
										{
											if(pb3.getText().toString()!="OUT")
											{
												iv=1;
												i.setText(iv+"");
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
											}
											else if(ps1!=138 && pb1.getText().toString()!="OUT")
											{
												iv=1;
												i.setText(iv+"");
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");	
											}
											else if(ps2!=138 && pb2.getText().toString()!="OUT")
											{
												iv=1;
												i.setText(iv+"");
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
											}
											else
											{
												AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
												over.setTitle("Game Over.");
												over.setCancelable(false);
												if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
												{
													String max="", min="", mid="";
													if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
														}
													}
													else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
														}
													}
													else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
														{
															mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														}
														else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
														{
															mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
														}
													}
													else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
														mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
													}
													else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
													{
														max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
														mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
													}
													else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
													{
														max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
														mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
													}
													else
													{
														max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
													}
													over.setMessage(max+"\n"+mid+"\n"+min);
												}
												else if(pb2.getText().toString()=="OUT")
												{
													if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
													{
														over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
													}
													else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
													{
														over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
													}
												}
												else if(pb1.getText().toString()=="OUT")
												{
													if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
													}
													else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
													}
												}
												else
												{
													if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
													}
													else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
													}
												}
												over.setButton("OK", new DialogInterface.OnClickListener() {
										            public void onClick(DialogInterface dialog,int which) {
										            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
														startActivity(i1);
										            }
										        });
												over.show();
											}
										}
									}
				                    if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			        				dice.setTitle("Dice Thrown:"+rno);
			        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
			        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			     			            public void onClick(DialogInterface dialog,int which) {
			     			            	dice.cancel();
			     			            }
			     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
								}
								else
								{
									Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
								}
							}
						});
						dia1.show();
					}
					else if(rb.getText().toString().contains("3"))
					{
						no1.setText("3");
						final Dialog dia2= new Dialog(Picnicplay3Activity.this);
						dia2.setContentView(R.layout.dialog2);
						dia2.setTitle("Dice Throw of Rs. 100");
						dia2.setCancelable(false);
						final RadioGroup rg2=(RadioGroup)dia2.findViewById(R.id.radio);
						Button bd2=(Button)dia2.findViewById(R.id.button1);
						bd2.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								int ds1=rg2.getCheckedRadioButtonId();
								RadioButton rb1=(RadioButton)dia2.findViewById(ds1);
								if(rb1!=null)
								{
									dia2.cancel();
								if(rb1.getText().toString().contains("2"))
								{
									no2.setText("2");
								}
								else if(rb1.getText().toString().contains("3"))
								{
									no2.setText("3");
								}
								else if(rb1.getText().toString().contains("4"))
								{
									no2.setText("4");
								}
								 Random r=new Random();
				                    int rno=r.nextInt(6)+1;
				                    if(so==true)
	    							{
	    								m.start();
	    							}
				                    int n1=Integer.parseInt(no1.getText().toString());
				                    int n2=Integer.parseInt(no2.getText().toString());
				                    int pba3=Integer.parseInt(pb3.getText().toString());
				                    int pba2=Integer.parseInt(pb2.getText().toString());
				                    int pba1=Integer.parseInt(pb1.getText().toString());
				                    if(rno==n1 || rno==n2)
				                    {
				                    	pba3+=100;
				                    }
				                    else
				                    {
				                    	pba3-=100;
				                    }
				                    int ps1=Integer.parseInt(p1.getText().toString());
				                    int ps2=Integer.parseInt(p2.getText().toString());
				                    int ps3=Integer.parseInt(p3.getText().toString());
				                    int iv=Integer.parseInt(i.getText().toString());
				                    int jv=Integer.parseInt(j.getText().toString());
				                    if(pba3>=0)
									{
									pb3.setText(pba3+"");
									}
				                    else if(pba3==-1)
				            		{
				            		}
				                    else
				                    {
				                    	AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				over.setTitle("Player 3 Out!");
				        				over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
				        				over.setCanceledOnTouchOutside(true);
				        				over.show();
				        				pb3.setText("OUT");
				        				if(ps2==ps3)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps3);
				    						te.setBackgroundColor(Color.parseColor(pc2));
				    					}
				    					else if(ps3==ps1)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps3);
				    						te.setBackgroundColor(Color.parseColor(pc1));
				    					}
				    					else
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps3);
					        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				    					}
				        				p3.setText("-1");
				                    }
				                    if(pb2.getText().toString()=="OUT" && pb3.getText().toString()=="OUT")
									{
										AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
										over.setTitle("Game Over.");
										over.setCancelable(false);
										over.setMessage("1st Position:Player 1 Balance:Rs. "+pba1+"\n"+"2nd Position:Player 2, Player 3 : OUT");
										over.setButton("OK", new DialogInterface.OnClickListener() {
								            public void onClick(DialogInterface dialog,int which) {
								            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
												startActivity(i1);
								            }
								        });
										over.show();
									}
									else if(pb3.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
									{
										AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
										over.setTitle("Game Over.");
										over.setCancelable(false);
										over.setMessage("1st Position:Player 2 Balance:Rs. "+pba2+"\n"+"2nd Position:Player 1, Player 3 : OUT");
										over.setButton("OK", new DialogInterface.OnClickListener() {
								            public void onClick(DialogInterface dialog,int which) {
								            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
												startActivity(i1);
								            }
								        });
										over.show();
									}
									else
									{
										if(ps1!=138 && pb1.getText().toString()!="OUT" && ((ps1!=119)||iv==1) && ((ps1!=129)||iv==1))
										{
											bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
										}
										else if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
										{
											iv=1;
											i.setText(iv+"");
											bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
										}
										else
										{
											if(pb3.getText().toString()!="OUT")
											{
												iv=1;
												i.setText(iv+"");
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
											}
											else if(ps1!=138 && pb1.getText().toString()!="OUT")
											{
												iv=1;
												i.setText(iv+"");
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");	
											}
											else if(ps2!=138 && pb2.getText().toString()!="OUT")
											{
												iv=1;
												i.setText(iv+"");
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
											}
											else
											{
												AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
												over.setTitle("Game Over.");
												over.setCancelable(false);
												if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
												{
													String max="", min="", mid="";
													if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
														}
													}
													else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
														}
													}
													else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
														{
															mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														}
														else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
														{
															mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
														}
													}
													else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
														mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
													}
													else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
													{
														max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
														mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
													}
													else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
													{
														max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
														mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
													}
													else
													{
														max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
													}
													over.setMessage(max+"\n"+mid+"\n"+min);
												}
												else if(pb2.getText().toString()=="OUT")
												{
													if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
													{
														over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
													}
													else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
													{
														over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
													}
												}
												else if(pb1.getText().toString()=="OUT")
												{
													if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
													}
													else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
													}
												}
												else
												{
													if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
													}
													else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
													}
												}
												over.setButton("OK", new DialogInterface.OnClickListener() {
										            public void onClick(DialogInterface dialog,int which) {
										            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
														startActivity(i1);
										            }
										        });
												over.show();
											}
										}
									}
				                    if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			        				dice.setTitle("Dice Thrown:"+rno);
			        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
			        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			     			            public void onClick(DialogInterface dialog,int which) {
			     			            	dice.cancel();
			     			            }
			     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
								}
								else
								{
									Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
								}
							}
						});
						dia2.show();
					}
					else if(rb.getText().toString().contains("4"))
					{
						no1.setText("4");
						final Dialog dia3= new Dialog(Picnicplay3Activity.this);
						dia3.setContentView(R.layout.dialog3);
						dia3.setTitle("Dice Throw of Rs. 100");
						dia3.setCancelable(false);
						final RadioGroup rg3=(RadioGroup)dia3.findViewById(R.id.radio);
						Button bd3=(Button)dia3.findViewById(R.id.button1);
						bd3.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								int ds1=rg3.getCheckedRadioButtonId();
								RadioButton rb1=(RadioButton)dia3.findViewById(ds1);
								if(rb1!=null)
								{
									dia3.cancel();
								if(rb1.getText().toString().contains("2"))
								{
									no2.setText("2");
								}
								else if(rb1.getText().toString().contains("3"))
								{
									no2.setText("3");
								}
								else if(rb1.getText().toString().contains("4"))
								{
									no2.setText("4");
								}
								 Random r=new Random();
				                    int rno=r.nextInt(6)+1;
				                    if(so==true)
	    							{
	    								m.start();
	    							}
				                    int n1=Integer.parseInt(no1.getText().toString());
				                    int n2=Integer.parseInt(no2.getText().toString());
				                    int pba3=Integer.parseInt(pb3.getText().toString());
				                    int pba2=Integer.parseInt(pb2.getText().toString());
				                    int pba1=Integer.parseInt(pb1.getText().toString());
				                    if(rno==n1 || rno==n2)
				                    {
				                    	pba3+=100;
				                    }
				                    else
				                    {
				                    	pba3-=100;
				                    }
				                    int ps1=Integer.parseInt(p1.getText().toString());
				                    int ps2=Integer.parseInt(p2.getText().toString());
				                    int ps3=Integer.parseInt(p3.getText().toString());
				                    int iv=Integer.parseInt(i.getText().toString());
				                    int jv=Integer.parseInt(j.getText().toString());
				                    if(pba3>=0)
									{
									pb3.setText(pba3+"");
									}
				                    else if(pba3==-1)
				            		{
				            		}
				                    else
				                    {
				                    	AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				over.setTitle("Player 3 Out!");
				        				over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
				        				over.setCanceledOnTouchOutside(true);
				        				over.show();
				        				pb3.setText("OUT");
				        				if(ps2==ps3)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps3);
				    						te.setBackgroundColor(Color.parseColor(pc2));
				    					}
				    					else if(ps3==ps1)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps3);
				    						te.setBackgroundColor(Color.parseColor(pc1));
				    					}
				    					else
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps3);
					        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				    					}
				        				p3.setText("-1");
				                    }
				                    if(pb2.getText().toString()=="OUT" && pb3.getText().toString()=="OUT")
									{
										AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
										over.setTitle("Game Over.");
										over.setCancelable(false);
										over.setMessage("1st Position:Player 1 Balance:Rs. "+pba1+"\n"+"2nd Position:Player 2, Player 3 : OUT");
										over.setButton("OK", new DialogInterface.OnClickListener() {
								            public void onClick(DialogInterface dialog,int which) {
								            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
												startActivity(i1);
								            }
								        });
										over.show();
									}
									else if(pb3.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
									{
										AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
										over.setTitle("Game Over.");
										over.setCancelable(false);
										over.setMessage("1st Position:Player 2 Balance:Rs. "+pba2+"\n"+"2nd Position:Player 1, Player 3 : OUT");
										over.setButton("OK", new DialogInterface.OnClickListener() {
								            public void onClick(DialogInterface dialog,int which) {
								            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
												startActivity(i1);
								            }
								        });
										over.show();
									}
									else
									{
										if(ps1!=138 && pb1.getText().toString()!="OUT" && ((ps1!=119)||iv==1) && ((ps1!=129)||iv==1))
										{
											bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
										}
										else if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
										{
											iv=1;
											i.setText(iv+"");
											bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
										}
										else
										{
											if(pb3.getText().toString()!="OUT")
											{
												iv=1;
												i.setText(iv+"");
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
											}
											else if(ps1!=138 && pb1.getText().toString()!="OUT")
											{
												iv=1;
												i.setText(iv+"");
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");	
											}
											else if(ps2!=138 && pb2.getText().toString()!="OUT")
											{
												iv=1;
												i.setText(iv+"");
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
											}
											else
											{
												AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
												over.setTitle("Game Over.");
												over.setCancelable(false);
												if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
												{
													String max="", min="", mid="";
													if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
														}
													}
													else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
														}
													}
													else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
														{
															mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														}
														else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
														{
															mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
														}
													}
													else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
														mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
													}
													else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
													{
														max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
														mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
													}
													else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
													{
														max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
														mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
													}
													else
													{
														max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
													}
													over.setMessage(max+"\n"+mid+"\n"+min);
												}
												else if(pb2.getText().toString()=="OUT")
												{
													if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
													{
														over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
													}
													else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
													{
														over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
													}
												}
												else if(pb1.getText().toString()=="OUT")
												{
													if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
													}
													else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
													}
												}
												else
												{
													if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
													}
													else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
													}
												}
												over.setButton("OK", new DialogInterface.OnClickListener() {
										            public void onClick(DialogInterface dialog,int which) {
										            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
														startActivity(i1);
										            }
										        });
												over.show();
											}
										}
									}
				                    if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			        				dice.setTitle("Dice Thrown:"+rno);
			        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
			        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			     			            public void onClick(DialogInterface dialog,int which) {
			     			            	dice.cancel();
			     			            }
			     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
								}
								else
								{
									Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
								}
							}
						});
						dia3.show();
					}
					else if(rb.getText().toString().contains("5"))
					{
						no1.setText("5");
						final Dialog dia4= new Dialog(Picnicplay3Activity.this);
						dia4.setContentView(R.layout.dialog4);
						dia4.setTitle("Dice Throw of Rs. 100");
						dia4.setCancelable(false);
						final RadioGroup rg4=(RadioGroup)dia4.findViewById(R.id.radio);
						Button bd4=(Button)dia4.findViewById(R.id.button1);
						bd4.setOnClickListener(new OnClickListener() {
							
							@Override
							public void onClick(View v) {
								// TODO Auto-generated method stub
								int ds1=rg4.getCheckedRadioButtonId();
								RadioButton rb1=(RadioButton)dia4.findViewById(ds1);
								if(rb1!=null)
								{
									dia4.cancel();
								if(rb1.getText().toString().contains("2"))
								{
									no2.setText("2");
								}
								else if(rb1.getText().toString().contains("3"))
								{
									no2.setText("3");
								}
								else if(rb1.getText().toString().contains("4"))
								{
									no2.setText("4");
								}
								 Random r=new Random();
				                    int rno=r.nextInt(6)+1;
				                    if(so==true)
	    							{
	    								m.start();
	    							}
				                    int n1=Integer.parseInt(no1.getText().toString());
				                    int n2=Integer.parseInt(no2.getText().toString());;
				                    int pba3=Integer.parseInt(pb3.getText().toString());
				                    int pba2=Integer.parseInt(pb2.getText().toString());
				                    int pba1=Integer.parseInt(pb1.getText().toString());
				                    if(rno==n1 || rno==n2)
				                    {
				                    	pba3+=100;
				                    }
				                    else
				                    {
				                    	pba3-=100;
				                    }
				                    int ps1=Integer.parseInt(p1.getText().toString());
				                    int ps2=Integer.parseInt(p2.getText().toString());
				                    int ps3=Integer.parseInt(p3.getText().toString());
				                    int iv=Integer.parseInt(i.getText().toString());
				                    int jv=Integer.parseInt(j.getText().toString());
				                    if(pba3>=0)
									{
									pb3.setText(pba3+"");
									}
				                    else if(pba3==-1)
				            		{
				            		}
				                    else
				                    {
				                    	AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				        				over.setTitle("Player 3 Out!");
				        				over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
				        				over.setCanceledOnTouchOutside(true);
				        				over.show();
				        				pb3.setText("OUT");
				        				if(ps2==ps3)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps3);
				    						te.setBackgroundColor(Color.parseColor(pc2));
				    					}
				    					else if(ps3==ps1)
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps3);
				    						te.setBackgroundColor(Color.parseColor(pc1));
				    					}
				    					else
				    					{
				    						TextView te=(TextView)r1.getChildAt(ps3);
					        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				    					}
				        				p3.setText("-1");
				                    }
				                    if(pb2.getText().toString()=="OUT" && pb3.getText().toString()=="OUT")
									{
										AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
										over.setTitle("Game Over.");
										over.setCancelable(false);
										over.setMessage("1st Position:Player 1 Balance:Rs. "+pba1+"\n"+"2nd Position:Player 2, Player 3 : OUT");
										over.setButton("OK", new DialogInterface.OnClickListener() {
								            public void onClick(DialogInterface dialog,int which) {
								            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
												startActivity(i1);
								            }
								        });
										over.show();
									}
									else if(pb3.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
									{
										AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
										over.setTitle("Game Over.");
										over.setCancelable(false);
										over.setMessage("1st Position:Player 2 Balance:Rs. "+pba2+"\n"+"2nd Position:Player 1, Player 3 : OUT");
										over.setButton("OK", new DialogInterface.OnClickListener() {
								            public void onClick(DialogInterface dialog,int which) {
								            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
												startActivity(i1);
								            }
								        });
										over.show();
									}
									else
									{
										if(ps1!=138 && pb1.getText().toString()!="OUT" && ((ps1!=119)||iv==1) && ((ps1!=129)||iv==1))
										{
											bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
										}
										else if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
										{
											iv=1;
											i.setText(iv+"");
											bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
										}
										else
										{
											if(pb3.getText().toString()!="OUT")
											{
												iv=1;
												i.setText(iv+"");
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
											}
											else if(ps1!=138 && pb1.getText().toString()!="OUT")
											{
												iv=1;
												i.setText(iv+"");
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");	
											}
											else if(ps2!=138 && pb2.getText().toString()!="OUT")
											{
												iv=1;
												i.setText(iv+"");
												jv=1;
												j.setText(jv+"");
												bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
											}
											else
											{
												AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
												over.setTitle("Game Over.");
												over.setCancelable(false);
												if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
												{
													String max="", min="", mid="";
													if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
														}
													}
													else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														}
														else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
														{
															mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
															min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
														}
													}
													else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
														if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
														{
															mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
															min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
														}
														else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
														{
															mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
															min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
														}
														else
														{
															mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
														}
													}
													else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
													{
														max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
														mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
													}
													else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
													{
														max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
														mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
													}
													else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
													{
														max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
														mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
													}
													else
													{
														max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
													}
													over.setMessage(max+"\n"+mid+"\n"+min);
												}
												else if(pb2.getText().toString()=="OUT")
												{
													if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
													{
														over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
													}
													else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
													{
														over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
													}
												}
												else if(pb1.getText().toString()=="OUT")
												{
													if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
													}
													else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
													}
												}
												else
												{
													if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
													}
													else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
													{
														over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
													}
													else
													{
														over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
													}
												}
												over.setButton("OK", new DialogInterface.OnClickListener() {
										            public void onClick(DialogInterface dialog,int which) {
										            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
														startActivity(i1);
										            }
										        });
												over.show();
											}
										}
									}
				                    if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			        				dice.setTitle("Dice Thrown:"+rno);
			        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
			        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			     			            public void onClick(DialogInterface dialog,int which) {
			     			            	dice.cancel();
			     			            }
			     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
				                    else if(pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
				                    {
				                    	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					        				dice.setTitle("Dice Thrown:"+rno);
					        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
					        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
					     			            public void onClick(DialogInterface dialog,int which) {
					     			            	dice.cancel();
					     			            }
					     			        });
				                    }
								}
								else
								{
									Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
								}
							}
						});
						dia4.show();
					}
					}
					else
					{
						Toast.makeText(getApplicationContext(),"Please select any one choice before clicking the button.",Toast.LENGTH_LONG).show();
					}
				}
			});
			dia.show();
		}
		if(pba3>=0)
		{
		pb3.setText(pba3+"");
		}
		else if(pba3==-1)
		{
		}
		else
        {
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Player 3 Out!");
			over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
			over.setCanceledOnTouchOutside(true);
			over.show();
			pb3.setText("OUT");
			if(ps2==ps3)
			{
				TextView te=(TextView)r1.getChildAt(ps3);
				te.setBackgroundColor(Color.parseColor(pc2));
			}
			else if(ps3==ps1)
			{
				TextView te=(TextView)r1.getChildAt(ps3);
				te.setBackgroundColor(Color.parseColor(pc1));
			}
			else
			{
				TextView te=(TextView)r1.getChildAt(ps3);
				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
			}
			p3.setText("-1");
        }
		if(pba2>=0)
		{
			pb2.setText(pba2+"");
		}
		else if(pba2==-1)
		{
		}
		else
        {
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Player 2 Out!");
			over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
			over.setCanceledOnTouchOutside(true);
			over.show();
			pb2.setText("OUT");
			if(ps2==ps1)
			{
				TextView te=(TextView)r1.getChildAt(ps2);
				te.setBackgroundColor(Color.parseColor(pc1));
			}
			else if(ps3==ps2)
			{
				TextView te=(TextView)r1.getChildAt(ps2);
				te.setBackgroundColor(Color.parseColor(pc3));
			}
			else
			{
				TextView te=(TextView)r1.getChildAt(ps2);
				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
			}
			p2.setText("-1");
        }
		if(pba1>=0)
		{
			pb3.setText(pba3+"");
		}
		else if(pba1==-1)
		{
		}
		else
		{
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Player 1 Out!");
			over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
			over.setCanceledOnTouchOutside(true);
			over.show();
			pb1.setText("OUT");
			if(ps3==ps1)
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundColor(Color.parseColor(pc3));
			}
			else if(ps2==ps1)
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundColor(Color.parseColor(pc2));
			}
			else
			{
				TextView te=(TextView)r1.getChildAt(ps1);
				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
			}
			p1.setText("-1");
		}
		if(p3.getText().toString()!="-1")
		{
		p3.setText(ps3+"");
		TextView t2=(TextView)r1.getChildAt(ps3);
		t2.setBackgroundColor(Color.parseColor(pc3));
		}
		}
		else if(ps3==13 || ps3==17)
		{
			if(ps3!=0 && ps3!=ps2 && ps1!=ps3)
			{
				TextView t=(TextView)r1.getChildAt(ps3);
				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
			}
			else if(ps2==ps3)
			{
				TextView te=(TextView)r1.getChildAt(ps2);
				te.setBackgroundColor(Color.parseColor(pc2));
			}
			else if(ps1==ps3)
			{
				TextView te=(TextView)r1.getChildAt(ps3);
				te.setBackgroundColor(Color.parseColor(pc1));
			}
			ps3=d;
			TextView te=(TextView)r1.getChildAt(ps3);
			te.setBackgroundColor(Color.parseColor(pc3));
			if(ps3==5)
			{
				pba3-=20;
			}
			else if(ps3==8)
			{
				pba3-=50;
			}
			else if(ps3==15)
			{
				pba3-=30;
			}
			else if(ps3==23)
			{
				pba3-=100;
			}
			else if(ps3==25)
			{
				pba3-=50;
			}
			else if(ps3==29)
			{
				pba3+=100;
			}
			else if(ps3==33)
			{
				pba3-=30;
			}
			else if(ps3==35)
			{
				pba3-=100;
			}
			else if(ps3==37)
			{
				pba3-=30;
			}
			else if(ps3==40)
			{
				pba3+=100;
			}
			else if(ps3==42)
			{
				pba3-=50;
			}
			else if(ps3==45)
			{
				pba3-=50;
			}
			else if(ps3==48)
			{
				pba3-=30;
			}
			else if(ps3==50)
			{
				pba3-=50;
			}
			else if(ps3==52)
			{
				pba3-=100;
			}
			else if(ps3==54)
			{
				pba3-=50;
			}
			else if(ps3==57)
			{
				pba3+=200;
			}
			else if(ps3==68)
			{
				pba3-=100;
			}
			else if(ps3==71)
			{
				pba3-=50;
			}
			else if (ps3==74)
			{
				pba3-=100;
			}
			else if(ps3==77)
			{
				pba3-=50;
			}
			else if(ps3==79)
			{
				pba3-=100;
			}
			else if(ps3==80)
			{
				pba3+=200;
			}
			else if(ps3==81)
			{
				pba3-=100;
			}
			else if(ps3==83)
			{
				pba3-=100;
			}
			else if(ps3==85)
			{
				pba3-=50;
			}
			else if(ps3==89)
			{
				pba3+=50;
			}
			else if(ps3==94)
			{
				pba3-=50;
			}
			else if(ps3==97)
			{
				pba3-=50;
			}
			else if(ps3==99)
			{
				pba3-=50;
			}
			else if(ps3==101)
			{
				pba3-=100;
			}
			else if(ps3==102)
			{
				pba3-=10;
			}
			else if(ps3==109)
			{
				pba3-=30;
			}
			else if(ps3==116)
			{
				pba3-=20;
			}
			else if(ps3==127)
			{
				pba3-=20;
			}
			else if(ps3==129)
			{
				pba3-=20;
			}
			else if(ps3==6||ps3==20||ps3==43||ps3==55||ps3==87||ps3==106||ps3==122||ps3==131||ps3==134)
			{
				dv3=r.nextInt(12)+1;
				dt3.setText(dv3+"");
				switch(dv3)
				{
				case 1:
					AlertDialog alertDialog = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog.setTitle("Holiday Special!");
				    alertDialog.setMessage("Birth Day gifts from each player of Rs. 50/-");
				    alertDialog.setCanceledOnTouchOutside(true);
				    alertDialog.show();
				    if(pba2!=-1 && pba2>=50)
				    {
				    pba3+=50;
				    pba2-=50;
				    }
				    else if(pba2!=-1)
				    {
				    	pba2-=50;
				    }
				    if(pba1!=-1 && pba1>=50)
				    {
				    pba3+=50;
				    pba1-=50;
				    }
				    else if(pba1!=-1)
				    {
				    	pba1-=50;
				    }
					break;
				case 2:
					AlertDialog alertDialog2 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog2.setTitle("Holiday Special!");
				    alertDialog2.setMessage("Car Insurance Get Rs. 100/-");
				    alertDialog2.setCanceledOnTouchOutside(true);
				    alertDialog2.show();
				    pba3+=100;
					break;
				case 3:
					AlertDialog alertDialog3 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog3.setTitle("Holiday Special!");
				    alertDialog3.setMessage("FALGUNI TOYS \n Award of the best player of game Rs. 100/- \n Holiday Special");
				    alertDialog3.setCanceledOnTouchOutside(true);
				    alertDialog3.show();
				    pba3+=100;
					break;
				case 4:
					AlertDialog alertDialog4 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog4.setTitle("Holiday Special!");
				    alertDialog4.setMessage("Family Insurance Pay Rs. 200/-");
				    alertDialog4.setCanceledOnTouchOutside(true);
				    alertDialog4.show();
				    pba3-=200;
					break;
				case 5:
					final AlertDialog alertDialog5 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog5.setTitle("Holiday Special!");
				    alertDialog5.setMessage("Roll the dice and earn 50 times money of the given number");
				    alertDialog5.setCancelable(false);
				    alertDialog5.setButton("Roll", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog,int which) {
			            	Random r=new Random();
			            	int dr=r.nextInt(6)+1;
			            	if(so==true)
							{
								m.start();
							}
			            	alertDialog5.cancel();
			            	int pba3=Integer.parseInt(pb3.getText().toString());
			            	pba3=pba3+(50*dr);
			            	pb3.setText(pba3+"");
			            	int ps2=Integer.parseInt(p2.getText().toString());
			            	int ps1=Integer.parseInt(p1.getText().toString());
			            	int iv=Integer.parseInt(i.getText().toString());
			            	int jv=Integer.parseInt(j.getText().toString());
			            	if(ps1!=138 && pb1.getText().toString()!="OUT" && ((ps1!=119)||iv==1) && ((ps1!=129)||iv==1))
							{
								bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
							}
							else if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
							{
								iv=1;
								i.setText(iv+"");
								bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
							}
							else
							{
								iv=1;
								i.setText(iv+"");
								jv=1;
								j.setText(jv+"");
								bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
							}
			            	if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
		                    {
			            	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("After rolling, number on the dice:"+dr);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
		                    }
			            	else if(pb1.getText().toString()=="OUT")
			            	{
			            		final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("After rolling, number on the dice:"+dr);
		        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
			            	}
			            	else if(pb2.getText().toString()=="OUT")
			            	{
			            		final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
		        				dice.setTitle("After rolling, number on the dice:"+dr);
		        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
		     			            public void onClick(DialogInterface dialog,int which) {
		     			            	dice.cancel();
		     			            }
		     			        });
			            	}
			            	}
			        });
				    alertDialog5.show();
					break;
				case 6:
					AlertDialog alertDialog6 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog6.setTitle("Holiday Special!");
				    alertDialog6.setMessage("Car Servicing Charges Rs. 200/-");
				    alertDialog6.setCanceledOnTouchOutside(true);
				    alertDialog6.show();
				    pba3-=200;
					break;
				case 7:
					AlertDialog alertDialog7 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog7.setTitle("Holiday Special!");
				    alertDialog7.setMessage("Wait for six on die");
				    alertDialog7.setCanceledOnTouchOutside(true);
				    alertDialog7.show();
					break;
				case 8:
					AlertDialog alertDialog8 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog8.setTitle("Holiday Special!");
				    alertDialog8.setMessage("Installed car stereo system pay Rs. 250/-");
				    alertDialog8.setCanceledOnTouchOutside(true);
				    alertDialog8.show();
				    pba1-=250;
					break;
				case 9:
					AlertDialog alertDialog9 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog9.setTitle("Holiday Special!");
				    alertDialog9.setMessage("A pair of Designer Eye Glasses Pay Rs. 100/-");
				    alertDialog9.setCanceledOnTouchOutside(true);
				    alertDialog9.show();
				    pba3-=100;
					break;
				case 10:
					AlertDialog alertDialog10 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog10.setTitle("Holiday Special!");
				    alertDialog10.setMessage("Supporting Citizen for a clean Environment Get Rs. 200/-");
				    alertDialog10.setCanceledOnTouchOutside(true);
				    alertDialog10.show();
				    pba3+=200;
					break;
				case 11:
					AlertDialog alertDialog11 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog11.setTitle("Holiday Special!");
				    alertDialog11.setMessage("A Security Man to look after your Home Pay Rs. 100/-");
				    alertDialog11.setCanceledOnTouchOutside(true);
				    alertDialog11.show();
				    pba3-=100;
					break;
				default:
					AlertDialog alertDialog12 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
					alertDialog12.setTitle("Holiday Special!");
				    alertDialog12.setMessage("Sold your old car stereo system get Rs. 200/-");
				    alertDialog12.setCanceledOnTouchOutside(true);
				    alertDialog12.show();
				    pba3+=200;
				}
			}
			if(pba3>=0)
			{
			pb1.setText(pba3+"");
			}
			else if(pba3==-1)
			{
			}
			else
            {
				AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				over.setTitle("Player 3 Out!");
				over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
				over.setCanceledOnTouchOutside(true);
				over.show();
				pb3.setText("OUT");
				if(ps2==ps3)
				{
					TextView t=(TextView)r1.getChildAt(ps3);
					t.setBackgroundColor(Color.parseColor(pc2));
				}
				else if(ps3==ps1)
				{
					TextView t=(TextView)r1.getChildAt(ps3);
					t.setBackgroundColor(Color.parseColor(pc1));
				}
				else
				{
					TextView t=(TextView)r1.getChildAt(ps3);
    				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
    			p3.setText("-1");
            }
			if(pba2>=0)
			{
			pb2.setText(pba2+"");
			}
			else if(pba2==-1)
			{
			}
			else
            {
				AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				over.setTitle("Player 2 Out!");
				over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
				over.setCanceledOnTouchOutside(true);
				over.show();
				pb2.setText("OUT");
				if(ps2==ps1)
				{
					TextView t=(TextView)r1.getChildAt(ps2);
					t.setBackgroundColor(Color.parseColor(pc1));
				}
				else if(ps3==ps2)
				{
					TextView t=(TextView)r1.getChildAt(ps2);
					t.setBackgroundColor(Color.parseColor(pc3));
				}
				else
				{
					TextView t=(TextView)r1.getChildAt(ps2);
    				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
    			p2.setText("-1");
            }
			if(pba1>=0)
			{
			pb1.setText(pba1+"");
			}
			else if(pba1==-1)
			{
			}
			else
            {
				AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				over.setTitle("Player 1 Out!");
				over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
				over.setCanceledOnTouchOutside(true);
				over.show();
				pb1.setText("OUT");
				if(ps3==ps1)
				{
					TextView t=(TextView)r1.getChildAt(ps1);
					t.setBackgroundColor(Color.parseColor(pc3));
				}
				else if(ps2==ps1)
				{
					TextView t=(TextView)r1.getChildAt(ps1);
					t.setBackgroundColor(Color.parseColor(pc2));
				}
				else
				{
					TextView t=(TextView)r1.getChildAt(ps1);
    				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
    			p1.setText("-1");
            }
			if(p3.getText().toString()!="-1")
			{
			p3.setText(ps3+"");
			TextView t2=(TextView)r1.getChildAt(ps3);
			t2.setBackgroundColor(Color.parseColor(pc3));
			}
		}
		else if(ps3==52)
		{
			if(d==2)
			{
				if(ps3!=0 && ps3!=ps2 && ps1!=ps3)
				{
					TextView t=(TextView)r1.getChildAt(ps3);
					t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
				else if(ps2==ps3)
				{
					TextView te=(TextView)r1.getChildAt(ps2);
					te.setBackgroundColor(Color.parseColor(pc2));
				}
				else if(ps1==ps3)
				{
					TextView te=(TextView)r1.getChildAt(ps3);
					te.setBackgroundColor(Color.parseColor(pc1));
				}
				if(ps3+d<=138)
				{
				ps3+=d;
				}
				if(ps3==5)
				{
					pba3-=20;
				}
				else if(ps3==8)
				{
					pba3-=50;
				}
				else if(ps3==15)
				{
					pba3-=30;
				}
				else if(ps3==23)
				{
					pba3-=100;
				}
				else if(ps3==25)
				{
					pba3-=50;
				}
				else if(ps3==29)
				{
					pba3+=100;
				}
				else if(ps3==33)
				{
					pba3-=30;
				}
				else if(ps3==35)
				{
					pba3-=100;
				}
				else if(ps3==37)
				{
					pba3-=30;
				}
				else if(ps3==40)
				{
					pba3+=100;
				}
				else if(ps3==42)
				{
					pba3-=50;
				}
				else if(ps3==45)
				{
					pba3-=50;
				}
				else if(ps3==48)
				{
					pba3-=30;
				}
				else if(ps3==50)
				{
					pba3-=50;
				}
				else if(ps3==52)
				{
					pba3-=100;
				}
				else if(ps3==54)
				{
					pba3-=50;
				}
				else if(ps3==57)
				{
					pba3+=200;
				}
				else if(ps3==68)
				{
					pba3-=100;
				}
				else if(ps3==71)
				{
					pba3-=50;
				}
				else if (ps3==74)
				{
					pba3-=100;
				}
				else if(ps3==77)
				{
					pba3-=50;
				}
				else if(ps3==79)
				{
					pba3-=100;
				}
				else if(ps3==80)
				{
					pba3+=200;
				}
				else if(ps3==81)
				{
					pba3-=100;
				}
				else if(ps3==83)
				{
					pba3-=100;
				}
				else if(ps3==85)
				{
					pba3-=50;
				}
				else if(ps3==89)
				{
					pba3+=50;
				}
				else if(ps3==94)
				{
					pba3-=50;
				}
				else if(ps3==97)
				{
					pba3-=50;
				}
				else if(ps3==99)
				{
					pba3-=50;
				}
				else if(ps3==101)
				{
					pba3-=100;
				}
				else if(ps3==102)
				{
					pba3-=10;
				}
				else if(ps3==109)
				{
					pba3-=30;
				}
				else if(ps3==116)
				{
					pba3-=20;
				}
				else if(ps3==127)
				{
					pba3-=20;
				}
				else if(ps3==129)
				{
					pba3-=20;
				}
				if(pba3>=0)
				{
				pb3.setText(pba3+"");
				}
				else if(pba3==-1)
         		{
         		}
				else
                {
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				over.setTitle("Player 3 Out!");
    				over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
    				over.setCanceledOnTouchOutside(true);
    				over.show();
    				pb3.setText("OUT");
    				if(ps2==ps1)
					{
						TextView te=(TextView)r1.getChildAt(ps2);
						te.setBackgroundColor(Color.parseColor(pc1));
					}
					else if(ps3==ps2)
					{
						TextView te=(TextView)r1.getChildAt(ps2);
						te.setBackgroundColor(Color.parseColor(pc3));
					}
					else
					{
						TextView te=(TextView)r1.getChildAt(ps2);
        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					}
        			p3.setText("-1");
                }
				if(p3.getText().toString()!="-1")
				{
				p3.setText(ps3+"");
				TextView t2=(TextView)r1.getChildAt(ps3);
				t2.setBackgroundColor(Color.parseColor(pc3));
				}
			}
		}
		else
		{
			if(d==6)
			{
				dv3=0;
				dt3.setText(dv3+"");
				if(ps3!=0 && ps3!=ps2 && ps1!=ps3)
				{
				TextView t=(TextView)r1.getChildAt(ps3);
				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
				}
				else if(ps2==ps3)
				{
					TextView t=(TextView)r1.getChildAt(ps2);
					t.setBackgroundColor(Color.parseColor(pc2));
				}
				else if(ps1==ps3)
				{
					TextView t=(TextView)r1.getChildAt(ps1);
					t.setBackgroundColor(Color.parseColor(pc1));
				}
				if(ps3+d<=138)
				{
				ps3+=d;
				}
				if(ps3==5)
				{
					pba3-=20;
				}
				else if(ps3==8)
				{
					pba3-=50;
				}
				else if(ps3==15)
				{
					pba3-=30;
				}
				else if(ps3==23)
				{
					pba3-=100;
				}
				else if(ps3==25)
				{
					pba3-=50;
				}
				else if(ps3==29)
				{
					pba3+=100;
				}
				else if(ps3==33)
				{
					pba3-=30;
				}
				else if(ps3==35)
				{
					pba3-=100;
				}
				else if(ps3==37)
				{
					pba3-=30;
				}
				else if(ps3==40)
				{
					pba3+=100;
				}
				else if(ps3==42)
				{
					pba3-=50;
				}
				else if(ps3==45)
				{
					pba3-=50;
				}
				else if(ps3==48)
				{
					pba3-=30;
				}
				else if(ps3==50)
				{
					pba3-=50;
				}
				else if(ps3==52)
				{
					pba3-=100;
				}
				else if(ps3==54)
				{
					pba3-=50;
				}
				else if(ps3==57)
				{
					pba3+=200;
				}
				else if(ps3==68)
				{
					pba3-=100;
				}
				else if(ps3==71)
				{
					pba3-=50;
				}
				else if (ps3==74)
				{
					pba3-=100;
				}
				else if(ps3==77)
				{
					pba3-=50;
				}
				else if(ps3==79)
				{
					pba3-=100;
				}
				else if(ps3==80)
				{
					pba3+=200;
				}
				else if(ps3==81)
				{
					pba3-=100;
				}
				else if(ps3==83)
				{
					pba3-=100;
				}
				else if(ps3==85)
				{
					pba3-=50;
				}
				else if(ps3==89)
				{
					pba3+=50;
				}
				else if(ps3==94)
				{
					pba3-=50;
				}
				else if(ps3==97)
				{
					pba3-=50;
				}
				else if(ps3==99)
				{
					pba3-=50;
				}
				else if(ps3==101)
				{
					pba3-=100;
				}
				else if(ps3==102)
				{
					pba3-=10;
				}
				else if(ps3==109)
				{
					pba3-=30;
				}
				else if(ps3==116)
				{
					pba3-=20;
				}
				else if(ps3==127)
				{
					pba3-=20;
				}
				else if(ps3==129)
				{
					pba3-=20;
				}
				else if(ps3==6||ps3==20||ps3==43||ps3==55||ps3==87||ps3==106||ps3==122||ps3==131||ps3==134)
				{
					dv3=r.nextInt(12)+1;
					dt3.setText(dv3+"");
					switch(dv3)
					{
					case 1:
						AlertDialog alertDialog = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog.setTitle("Holiday Special!");
    				    alertDialog.setMessage("Birth Day gifts from each player of Rs. 50/-");
    				    alertDialog.setCanceledOnTouchOutside(true);
    				    alertDialog.show();
    				    if(pba2!=-1 && pba2>=50)
    				    {
    				    pba3+=50;
    				    pba2-=50;
    				    }
    				    else if(pba2!=-1)
    				    {
    				    	pba2-=50;
    				    }
    				    if(pba1!=-1 && pba1>=50)
    				    {
    				    pba3+=50;
    				    pba1-=50;
    				    }
    				    else if(pba1!=-1)
    				    {
    				    	pba1-=50;
    				    }
						break;
					case 2:
						AlertDialog alertDialog2 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog2.setTitle("Holiday Special!");
    				    alertDialog2.setMessage("Car Insurance Get Rs. 100/-");
    				    alertDialog2.setCanceledOnTouchOutside(true);
    				    alertDialog2.show();
    				    pba3+=100;
						break;
					case 3:
						AlertDialog alertDialog3 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog3.setTitle("Holiday Special!");
    				    alertDialog3.setMessage("FALGUNI TOYS \n Award of the best player of game Rs. 100/- \n Holiday Special");
    				    alertDialog3.setCanceledOnTouchOutside(true);
    				    alertDialog3.show();
    				    pba3+=100;
						break;
					case 4:
						AlertDialog alertDialog4 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog4.setTitle("Holiday Special!");
    				    alertDialog4.setMessage("Family Insurance Pay Rs. 200/-");
    				    alertDialog4.setCanceledOnTouchOutside(true);
    				    alertDialog4.show();
    				    pba3-=200;
						break;
					case 5:
						final AlertDialog alertDialog5 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog5.setTitle("Holiday Special!");
    				    alertDialog5.setMessage("Roll the dice and earn 50 times money of the given number");
    				    alertDialog5.setCancelable(false);
    				    alertDialog5.setButton("Roll", new DialogInterface.OnClickListener() {
    			            public void onClick(DialogInterface dialog,int which) {
    			            	Random r=new Random();
    			            	int dr=r.nextInt(6)+1;
    			            	alertDialog5.cancel();
    			            	int pba3=Integer.parseInt(pb3.getText().toString());
    			            	pba3=pba3+(50*dr);
    			            	if(so==true)
    							{
    								m.start();
    							}
    			            	pb3.setText(pba3+"");
    			            	int ps1=Integer.parseInt(p1.getText().toString());
    			            	int ps2=Integer.parseInt(p2.getText().toString());
    			            	int iv=Integer.parseInt(i.getText().toString());
    			            	int jv=Integer.parseInt(j.getText().toString());
    			            	if(ps1!=138 && pb1.getText().toString()!="OUT" && ((ps1!=119)||iv==1) && ((ps1!=129)||iv==1))
    							{
    								bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
    							}
    							else if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
    							{
    								iv=1;
    								i.setText(iv+"");
    								bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
    							}
    							else
    							{
    								iv=1;
    								i.setText(iv+"");
    								jv=1;
    								j.setText(jv+"");
    								bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
    							}
    			            	if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
    		                    {
    			            	final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    	        				dice.setTitle("After rolling, number on the dice:"+dr);
    	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
    	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
    	     			            public void onClick(DialogInterface dialog,int which) {
    	     			            	dice.cancel();
    	     			            }
    	     			        });
    		                    }
    			            	else if(pb1.getText().toString()=="OUT")
    			            	{
    			            		final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    		        				dice.setTitle("After rolling, number on the dice:"+dr);
    		        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
    		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
    		     			            public void onClick(DialogInterface dialog,int which) {
    		     			            	dice.cancel();
    		     			            }
    		     			        });
    			            	}
    			            	else if(pb2.getText().toString()=="OUT")
    			            	{
    			            		final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    		        				dice.setTitle("After rolling, number on the dice:"+dr);
    		        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
    		        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
    		     			            public void onClick(DialogInterface dialog,int which) {
    		     			            	dice.cancel();
    		     			            }
    		     			        });
    			            	}
    			            	}
    			        });
    				    alertDialog5.show();
						break;
					case 6:
						AlertDialog alertDialog6 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog6.setTitle("Holiday Special!");
    				    alertDialog6.setMessage("Car Servicing Charges Rs. 200/-");
    				    alertDialog6.setCanceledOnTouchOutside(true);
    				    alertDialog6.show();
    				    pba3-=200;
						break;
					case 7:
						AlertDialog alertDialog7 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog7.setTitle("Holiday Special!");
    				    alertDialog7.setMessage("Wait for six on die");
    				    alertDialog7.setCanceledOnTouchOutside(true);
    				    alertDialog7.show();
						break;
					case 8:
						AlertDialog alertDialog8 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog8.setTitle("Holiday Special!");
    				    alertDialog8.setMessage("Installed car stereo system pay Rs. 250/-");
    				    alertDialog8.setCanceledOnTouchOutside(true);
    				    alertDialog8.show();
    				    pba3-=250;
						break;
					case 9:
						AlertDialog alertDialog9 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog9.setTitle("Holiday Special!");
    				    alertDialog9.setMessage("A pair of Designer Eye Glasses Pay Rs. 100/-");
    				    alertDialog9.setCanceledOnTouchOutside(true);
    				    alertDialog9.show();
    				    pba3-=100;
						break;
					case 10:
						AlertDialog alertDialog10 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog10.setTitle("Holiday Special!");
    				    alertDialog10.setMessage("Supporting Citizen for a clean Environment Get Rs. 200/-");
    				    alertDialog10.setCanceledOnTouchOutside(true);
    				    alertDialog10.show();
    				    pba3+=200;
						break;
					case 11:
						AlertDialog alertDialog11 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog11.setTitle("Holiday Special!");
    				    alertDialog11.setMessage("A Security Man to look after your Home Pay Rs. 100/-");
    				    alertDialog11.setCanceledOnTouchOutside(true);
    				    alertDialog11.show();
    				    pba3-=100;
						break;
					default:
						AlertDialog alertDialog12 = new AlertDialog.Builder(Picnicplay3Activity.this).create();
    					alertDialog12.setTitle("Holiday Special!");
    				    alertDialog12.setMessage("Sold your old car stereo system get Rs. 200/-");
    				    alertDialog12.setCanceledOnTouchOutside(true);
    				    alertDialog12.show();
    				    pba3+=200;
					}
				}
				if(pba3>=0)
				{
				pb3.setText(pba3+"");
				}
				else if(pba3==-1)
				{
				}
				else
                {
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				over.setTitle("Player 3 Out!");
    				over.setMessage(Name3+" could not pay the required amount and so the player has gone out of the game.");
    				over.setCanceledOnTouchOutside(true);
    				over.show();
    				pb3.setText("OUT");
    				if(ps2==ps1)
					{
						TextView te=(TextView)r1.getChildAt(ps2);
						te.setBackgroundColor(Color.parseColor(pc1));
					}
					else if(ps3==ps2)
					{
						TextView te=(TextView)r1.getChildAt(ps2);
						te.setBackgroundColor(Color.parseColor(pc3));
					}
					else
					{
						TextView te=(TextView)r1.getChildAt(ps2);
        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					}
        			p3.setText("-1");
                }
				if(pba2>=0)
				{
				pb2.setText(pba2+"");
				}
				else if(pba2==-1)
				{
				}
				else
                {
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				over.setTitle("Player 2 Out!");
    				over.setMessage(Name2+" could not pay the required amount and so the player has gone out of the game.");
    				over.setCanceledOnTouchOutside(true);
    				over.show();
    				pb2.setText("OUT");
    				if(ps2==ps1)
					{
						TextView t=(TextView)r1.getChildAt(ps2);
						t.setBackgroundColor(Color.parseColor(pc1));
					}
					else if(ps3==ps2)
					{
						TextView t=(TextView)r1.getChildAt(ps2);
						t.setBackgroundColor(Color.parseColor(pc3));
					}
					else
					{
						TextView t=(TextView)r1.getChildAt(ps2);
        				t.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					}
        			p2.setText("-1");
                }
				if(pba1>=0)
				{
				pb1.setText(pba1+"");
				}
				else if(pba1==-1)
				{
				}
				else
                {
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
    				over.setTitle("Player 1 Out!");
    				over.setMessage(Name1+" could not pay the required amount and so the player has gone out of the game.");
    				over.setCanceledOnTouchOutside(true);
    				over.show();
    				pb1.setText("OUT");
    				if(ps3==ps1)
					{
						TextView te=(TextView)r1.getChildAt(ps1);
						te.setBackgroundColor(Color.parseColor(pc3));
					}
					else if(ps2==ps1)
					{
						TextView te=(TextView)r1.getChildAt(ps1);
						te.setBackgroundColor(Color.parseColor(pc2));
					}
					else
					{
						TextView te=(TextView)r1.getChildAt(ps1);
        				te.setBackgroundDrawable(getResources().getDrawable(R.drawable.textview));
					}
        			p1.setText("-1");
                }
				if(p3.getText().toString()!="-1")
				{
				p3.setText(ps3+"");
				TextView t2=(TextView)r1.getChildAt(ps3);
				t2.setBackgroundColor(Color.parseColor(pc3));
				}
			}
		}
		if(pb2.getText().toString()=="OUT" && pb3.getText().toString()=="OUT")
		{
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Game Over.");
			over.setCancelable(false);
			over.setMessage("1st Position:Player 1 Balance:Rs. "+pba3+"\n"+"2nd Position:Player 2, Player 3 : OUT");
			over.setButton("OK", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog,int which) {
	            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
					startActivity(i1);
	            }
	        });
			over.show();
		}
		else if(pb3.getText().toString()=="OUT" && pb1.getText().toString()=="OUT")
		{
			AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
			over.setTitle("Game Over.");
			over.setCancelable(false);
			over.setMessage("1st Position:Player 2 Balance:Rs. "+pba3+"\n"+"2nd Position:Player 1, Player 3 : OUT");
			over.setButton("OK", new DialogInterface.OnClickListener() {
	            public void onClick(DialogInterface dialog,int which) {
	            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
					startActivity(i1);
	            }
	        });
			over.show();
		}
		else
		{
			if(!(((ps3!=6 && ps3!=20 && ps3!=43 && ps3!=55 && ps3!=87 && ps3!=106 && ps3!=122 && ps3!=131 && ps3!=134) || (dv3!=5)) && ps3!=58 && ps3!=60 && ps3!=62))
			{
				bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
				if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				dice.setTitle("Dice Thrown:"+d);
				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog,int which) {
			            	dice.cancel();
			            }
			        });
                }
                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                {
                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				dice.setTitle("Dice Thrown:"+d);
        				dice.setMessage("Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
     			            public void onClick(DialogInterface dialog,int which) {
     			            	dice.cancel();
     			            }
     			        });
                }
                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				dice.setTitle("Dice Thrown:"+d);
        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
     			            public void onClick(DialogInterface dialog,int which) {
     			            	dice.cancel();
     			            }
     			        });
                }
                else if(pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				dice.setTitle("Dice Thrown:"+d);
        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
     			            public void onClick(DialogInterface dialog,int which) {
     			            	dice.cancel();
     			            }
     			        });
                }
			}
			else if(ps1!=138 && pb1.getText().toString()!="OUT" && ((ps1!=119)||iv==1) && ((ps1!=129)||iv==1))
			{
				bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
				if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				dice.setTitle("Dice Thrown:"+d);
				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog,int which) {
			            	dice.cancel();
			            }
			        });
                }
                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                {
                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				dice.setTitle("Dice Thrown:"+d);
        				dice.setMessage("Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
     			            public void onClick(DialogInterface dialog,int which) {
     			            	dice.cancel();
     			            }
     			        });
                }
                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				dice.setTitle("Dice Thrown:"+d);
        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
     			            public void onClick(DialogInterface dialog,int which) {
     			            	dice.cancel();
     			            }
     			        });
                }
                else if(pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				dice.setTitle("Dice Thrown:"+d);
        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
     			            public void onClick(DialogInterface dialog,int which) {
     			            	dice.cancel();
     			            }
     			        });
                }
			}
			else if(ps2!=138 && pb2.getText().toString()!="OUT" && ((ps2!=119)||jv==1) && ((ps2!=129)||jv==1))
			{
				iv=1;
				i.setText(iv+"");
				bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
				if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
				dice.setTitle("Dice Thrown:"+d);
				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
				 dice.setButton("OK", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog,int which) {
			            	dice.cancel();
			            }
			        });
                }
                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
                {
                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				dice.setTitle("Dice Thrown:"+d);
        				dice.setMessage("Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
     			            public void onClick(DialogInterface dialog,int which) {
     			            	dice.cancel();
     			            }
     			        });
                }
                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				dice.setTitle("Dice Thrown:"+d);
        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
     			            public void onClick(DialogInterface dialog,int which) {
     			            	dice.cancel();
     			            }
     			        });
                }
                else if(pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
                {
                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
        				dice.setTitle("Dice Thrown:"+d);
        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
     			            public void onClick(DialogInterface dialog,int which) {
     			            	dice.cancel();
     			            }
     			        });
                }
			}
			else
			{
				if(pb3.getText().toString()!="OUT" && ((ps3!=119)||kv==1) && ((ps3!=129)||kv==1))
				{
					iv=1;
					i.setText(iv+"");
					jv=1;
					j.setText(jv+"");
					bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
					if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					dice.setTitle("Dice Thrown:"+d);
					dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
					 dice.setButton("OK", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog,int which) {
				            	dice.cancel();
				            }
				        });
	                }
	                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                {
	                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
	                }
	                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
	                }
	                else if(pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
	                }
				}
				else if(ps1!=138 && pb1.getText().toString()!="OUT")
				{
					iv=1;
					i.setText(iv+"");
					jv=1;
					j.setText(jv+"");
					kv=1;
					k.setText(kv+"");
					bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
					if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					dice.setTitle("Dice Thrown:"+d);
					dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
					 dice.setButton("OK", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog,int which) {
				            	dice.cancel();
				            }
				        });
	                }
	                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                {
	                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
	                }
	                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
	                }
	                else if(pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
	                }
				}
				else if(ps2!=138 && pb2.getText().toString()!="OUT")
				{
					jv=1;
					j.setText(jv+"");
					kv=1;
					k.setText(kv+"");
					bo.setText("Balance of\n"+Name2+": \n Rs."+pb2.getText().toString()+"\n Turn");
					if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					dice.setTitle("Dice Thrown:"+d);
					dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
					 dice.setButton("OK", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog,int which) {
				            	dice.cancel();
				            }
				        });
	                }
	                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                {
	                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
	                }
	                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
	                }
	                else if(pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
	                }
				}
				else if(ps3!=138 && pb3.getText().toString()!="OUT")
				{
					kv=1;
					k.setText(kv+"");
					bo.setText("Balance of\n"+Name3+": \n Rs."+pb3.getText().toString()+"\n Turn");
					if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					dice.setTitle("Dice Thrown:"+d);
					dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
					 dice.setButton("OK", new DialogInterface.OnClickListener() {
				            public void onClick(DialogInterface dialog,int which) {
				            	dice.cancel();
				            }
				        });
	                }
	                else if(pb1.getText().toString()!="OUT" && pb2.getText().toString()!="OUT")
	                {
	                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Player 3:OUT"+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
	                }
	                else if(pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Balance of Player 1:Rs. "+pb1.getText().toString()+"\n"+"Player 2:OUT");
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
	                }
	                else if(pb2.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
	                {
	                	 final AlertDialog dice=new AlertDialog.Builder(Picnicplay3Activity.this).create();
	        				dice.setTitle("Dice Thrown:"+d);
	        				dice.setMessage("Balance of Player 3:Rs. "+pb3.getText().toString()+"\n"+"Player 1:OUT"+"\n"+"Balance of Player 2:Rs. "+pb2.getText().toString());
	        				 dice.setButton("OK", new DialogInterface.OnClickListener() {
	     			            public void onClick(DialogInterface dialog,int which) {
	     			            	dice.cancel();
	     			            }
	     			        });
	                }
				}
				else
				{
					AlertDialog over=new AlertDialog.Builder(Picnicplay3Activity.this).create();
					over.setTitle("Game Over.");
					over.setCancelable(false);
					if(pb2.getText().toString()!="OUT" && pb1.getText().toString()!="OUT" && pb3.getText().toString()!="OUT")
					{
						String max="", min="", mid="";
						if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
						{
							max="1st Position:Player 1 Balance:Rs. "+pb1.getText().toString();
							if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
							{
								mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
								min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
							}
							else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb3.getText().toString()))
							{
								mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
								min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
							}
							else
							{
								mid="2nd Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
							}
						}
						else if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb3.getText().toString()))
						{
							max="1st Position:Player 2 Balance:Rs. "+pb2.getText().toString();
							if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
							{
								mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
								min="3rd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
							}
							else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb3.getText().toString()))
							{
								mid="2nd Position:Player 3 Balance:Rs. "+pb3.getText().toString();
								min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
							}
							else
							{
								mid="2nd Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
							}
						}
						else if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
						{
							max="1st Position:Player 3 Balance:Rs. "+pb3.getText().toString();
							if(Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
							{
								mid="2nd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
								min="3rd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
							}
							else if(Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
							{
								mid="2nd Position:Player 1 Balance:Rs. "+pb1.getText().toString();
								min="3rd Position:Player 2 Balance:Rs. "+pb2.getText().toString();
							}
							else
							{
								mid="2nd Position:Player 1, Player 2 Balance:Rs. "+pb2.getText().toString();
							}
						}
						else if(Integer.parseInt(pb1.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb3.getText().toString()))
						{
							max="1st Position:Player 1, Player 2 Balance:Rs. "+pb1.getText().toString();
							mid="2nd Position:Player 3 Balance Rs. "+pb3.getText().toString();
						}
						else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb2.getText().toString()) && Integer.parseInt(pb2.getText().toString())>Integer.parseInt(pb1.getText().toString()))
						{
							max="1st Position:Player 2, Player 3 Balance:Rs. "+pb2.getText().toString();
							mid="2nd Position:Player 1 Balance Rs. "+pb1.getText().toString();
						}
						else if(Integer.parseInt(pb3.getText().toString())==Integer.parseInt(pb1.getText().toString()) && Integer.parseInt(pb2.getText().toString())<Integer.parseInt(pb1.getText().toString()))
						{
							max="1st Position:Player 1, Player 3 Balance:Rs. "+pb1.getText().toString();
							mid="2nd Position:Player 2 Balance Rs. "+pb2.getText().toString();
						}
						else
						{
							max="1st Position:Player 1, Player 2, Player 3 Balance:Rs. "+pb1.getText().toString();
						}
						over.setMessage(max+"\n"+mid+"\n"+min);
					}
					else if(pb2.getText().toString()=="OUT")
					{
						if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb1.getText().toString()))
						{
							over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
						}
						else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb1.getText().toString()))
						{
							over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 2 OUT");
						}
						else
						{
							over.setMessage("1st Position:Player 1, Player 3 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 OUT");
						}
					}
					else if(pb1.getText().toString()=="OUT")
					{
						if(Integer.parseInt(pb3.getText().toString())>Integer.parseInt(pb2.getText().toString()))
						{
							over.setMessage("1st Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
						}
						else if(Integer.parseInt(pb3.getText().toString())<Integer.parseInt(pb2.getText().toString()))
						{
							over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 Balance Rs. "+pb3.getText().toString()+"\n"+"3rd Position:Player 1 OUT");
						}
						else
						{
							over.setMessage("1st Position:Player 2, Player 3 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 OUT");
						}
					}
					else
					{
						if(Integer.parseInt(pb1.getText().toString())>Integer.parseInt(pb2.getText().toString()))
						{
							over.setMessage("1st Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"2nd Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
						}
						else if(Integer.parseInt(pb1.getText().toString())<Integer.parseInt(pb2.getText().toString()))
						{
							over.setMessage("1st Position:Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 1 Balance Rs. "+pb1.getText().toString()+"\n"+"3rd Position:Player 3 OUT");
						}
						else
						{
							over.setMessage("1st Position:Player 1, Player 2 Balance Rs. "+pb2.getText().toString()+"\n"+"2nd Position:Player 3 OUT");
						}
					}
					over.setButton("OK", new DialogInterface.OnClickListener() {
			            public void onClick(DialogInterface dialog,int which) {
			            	Intent i1=new Intent(getApplicationContext(),PicnicActivity.class);
							startActivity(i1);
			            }
			        });
					over.show();
				}
			}
		}
	}
	
   MediaPlayer m;
	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
    	super.onCreate(savedInstanceState);
    	requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.play);
        final String pc1;
        final String pc2;
        final String pc3;
        final String Name1=getIntent().getExtras().getString("Name1");
        final String Color1=getIntent().getExtras().getString("Radio1");
        if(Color1.startsWith("P"))
        {
        	pc1="#FF00FF";
        }
        else if(Color1.startsWith("G"))
        {
        	pc1="#00FF00";
        }
        else if(Color1.startsWith("R"))
        {
        pc1="#FF0000";
        }
        else
        {
        	pc1="#0000FF";
        }
        final String Color2=getIntent().getExtras().getString("Radio2");
        if(Color2.startsWith("P"))
        {
        	pc2="#FF00FF";
        }
        else if(Color2.startsWith("G"))
        {
        	pc2="#00FF00";
        }
        else if(Color2.startsWith("B"))
        {
        pc2="#0000FF";
        }
        else
        {
        	pc2="#FF0000";
        }
        final String Color3=getIntent().getExtras().getString("Radio3");
        if(Color3.startsWith("P"))
        {
        	pc3="#FF00FF";
        }
        else if(Color3.startsWith("G"))
        {
        	pc3="#00FF00";
        }
        else if(Color3.startsWith("B"))
        {
        pc3="#0000FF";
        }
        else
        {
        	pc3="#FF0000";
        }
        final boolean so=getIntent().getExtras().getBoolean("s");
        m=MediaPlayer.create(getApplicationContext(), R.raw.diceroll);
        final TextView bo=(TextView)findViewById(R.id.bottom);
        final TextView pb1=(TextView)findViewById(R.id.pb1);
        bo.setText("Balance of\n"+Name1+": \n Rs."+pb1.getText().toString()+"\n Turn");
        final TextView bo2=(TextView)findViewById(R.id.bottom2);
        bo2.setVisibility(0);
        Button dice=(Button)findViewById(R.id.dice);
        dice.setOnClickListener(new OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				String str=bo.getText().toString();
				if(str.contains("Player 1"))
				{
					play1(pc1,pc2,pc3,so);
				}
				else if(str.contains("Player 2"))
				{
					play2(pc1,pc2,pc3,so);
				}
				else
				{
					play3(pc1,pc2,pc3,so);
				}
			}
		});
}
}
