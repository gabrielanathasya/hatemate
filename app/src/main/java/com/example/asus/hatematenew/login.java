package com.example.asus.hatematenew;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import org.json.*;
import com.loopj.android.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import cz.msebera.android.httpclient.Header;

public class login extends AppCompatActivity {

    private Button button;
    private Button btnregist;
    TextView txtJson;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        button = (Button)findViewById(R.id.login_btn);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(View v){

                //----------START API
                /*
                API.post("/GetUser", null, new JsonHttpResponseHandler() {
                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONObject response) {
                        // If the response is JSONObject instead of expected JSONArray
                    }

                    @Override
                    public void onSuccess(int statusCode, Header[] headers, JSONArray asd) {
                        // Pull out the first event on the public timeline
                        System.out.println("ini cuy: " + asd);

                        //JONObject firstEvent = timeline.get(0);
                        //String tweetText = firstEvent.getString("text");

                        // Do something with the response
                        //System.out.println(tweetText);
                    }

                });
                */
                //-------end API

                Intent intent = new Intent(v.getContext(), menu.class);
                startActivity(intent);
            }

        });

        btnregist = (Button)findViewById(R.id.signin_btn);
        btnregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(v.getContext(), register.class);
                startActivity(intent);
            }
        });
    }
}
