package com.example.rajat.cloundandbottom;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.AsyncTask;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class SplashActivity extends AppCompatActivity {
    int open_count=0;
    SharedPreferences preferences; //saves the reference of the location/reference of the saved shared file.
    SharedPreferences.Editor editor; //to edit data
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();
        preferences= getSharedPreferences("CloudBottom", Context.MODE_PRIVATE);
        editor= preferences.edit();
        open_count = preferences.getInt("counter",0);
        if(open_count==0)
        {
            open_count=1;
            editor.putInt("counter",open_count);
            editor.commit();
            new Handler().postDelayed(new Runnable() {  //Handling the class or task.
                @Override
                public void run() {
                    Intent i = new Intent(SplashActivity.this,HomeActivity.class);
                    //Toast.makeText(SplashActivity.this, "pehele baar", Toast.LENGTH_SHORT).show();
                    startActivity(i);
                    finish();                       //to remove the back press coming here.
                }
            },10000);
        }
        else
            new MyTask().execute();
    }
    class MyTask extends AsyncTask<String,String,String>
    {
        //int k=0;
        @Override
        protected void onPreExecute() {
            //Toast.makeText(SplashActivity.this, "Hi"+k, Toast.LENGTH_SHORT).show();
            super.onPreExecute();
        }
        @Override
        protected String doInBackground(String... strings) {
            for(int i=0;i<321368721;i++);
            for(int i=0;i<321368721;i++);
            //k=10;
            return null;
        }
        @Override
        protected void onPostExecute(String s) {
            //pd.dismiss();
            //Toast.makeText(SplashActivity.this, ""+k, Toast.LENGTH_SHORT).show();
            Intent i = new Intent(SplashActivity.this,MainActivity.class);
            startActivity(i);
            super.onPostExecute(s);
            finish();                       //to remove the back press coming here.
        }
    }
}
