package com.example.asus.hatematenew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class main_welcome extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_welcome);
        button = (Button) findViewById(R.id.next_btn);
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity();
            }
        });
    }
    public void openNextActivity(){
        Intent intent = new Intent(this, login.class);
        startActivity(intent);
    }
}



