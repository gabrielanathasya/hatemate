package com.example.asus.hatematenew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class partner_profile extends AppCompatActivity {

    private Button message_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_partner_profile);

        message_btn = (Button)findViewById(R.id.chat_btn);
        message_btn.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), dateroom.class);
                startActivity(intent);
            }
        });

    }
}
