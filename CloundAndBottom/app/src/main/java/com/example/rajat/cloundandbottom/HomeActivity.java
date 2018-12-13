package com.example.rajat.cloundandbottom;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.drawable.GradientDrawable;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class HomeActivity extends AppCompatActivity {
    ImageButton ibtn[]=new ImageButton[8];
    EditText edt;
    Button submit;
    int icon_num=0;
    SharedPreferences preferences; //saves the reference of the location/reference of the saved shared file.
    SharedPreferences.Editor editor; //to edit data

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        preferences= getSharedPreferences("CloudBottom", Context.MODE_PRIVATE);
        editor= preferences.edit();
        for(int i=0;i<8;i++)
            ibtn[i]= (ImageButton) findViewById(R.id.ib1+i);
        edt= (EditText) findViewById(R.id.nameu);
        submit= (Button) findViewById(R.id.sub_button);
        for(int i=0;i<8;i++)
        {
            final int finalI = i;
            ibtn[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    icon_num= finalI+1;
                    ibtn[icon_num-1].setBackgroundResource(R.drawable.button_bg_non);
//                    GradientDrawable drawable = (GradientDrawable)view.getBackground();
//                    drawable.setStroke(3, Color.parseColor("#00B8E6")); // set stroke width and stroke color
                    //ibtn[0].setImageResource(R.drawable.button_bg);
                    for(int j=0;j<8;j++)
                    {
                        if(j!=icon_num-1)
                            ibtn[j].setBackgroundResource(R.drawable.button_bg);
                    }
                }
            });
        }
        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name1;
                name1=edt.getText().toString();
                editor.putInt("Image",icon_num);
                editor.putString("User_name",name1);
                editor.commit();
                Intent i = new Intent(HomeActivity.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });
    }
}
