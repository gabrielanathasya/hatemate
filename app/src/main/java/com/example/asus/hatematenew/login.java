package com.example.asus.hatematenew;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.AsyncTask;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import org.json.*;

import com.example.asus.hatematenew.Model.Login;
import com.example.asus.hatematenew.Model.User;
import com.example.asus.hatematenew.Rest.ApiClient;
import com.example.asus.hatematenew.Rest.ApiInterface;
import com.loopj.android.http.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.net.URLConnection;

import cz.msebera.android.httpclient.Header;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class login extends AppCompatActivity {
    ApiInterface mApiInterface;
    private Button button;
    private Button btnregist;
    private EditText mUsername;
    private EditText mPassword;
    TextView txtJson;
    ProgressDialog pd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        mApiInterface = ApiClient.getClient().create(ApiInterface.class);
        button = (Button)findViewById(R.id.login_btn);
        mUsername = (EditText)findViewById(R.id.username);
        mPassword = (EditText)findViewById(R.id.password);
        button.setOnClickListener(new View.OnClickListener(){

            @Override
            public void onClick(final View v){

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
                Login user = new Login();
                user.Email = mUsername.getText().toString();
                user.Password = mPassword.getText().toString();
                Log.d("test", mUsername.getText().toString());
                Call<ResponseBody> login = mApiInterface.Login(user);
                login.enqueue(new Callback<ResponseBody>() {
                    @Override
                    public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                        Log.d("Login", response.message());
                        if(response.isSuccessful())
                        {
                            Intent intent = new Intent(v.getContext(), menu.class);
                            startActivity(intent);
                        }
                    }

                    @Override
                    public void onFailure(Call<ResponseBody> call, Throwable t) {
                        Log.e("Login", "Login Error", t);
                    }
                });

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
