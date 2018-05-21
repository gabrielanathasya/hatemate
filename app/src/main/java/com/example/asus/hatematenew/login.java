package com.example.asus.hatematenew;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class login extends AppCompatActivity {

    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
<<<<<<< HEAD
        button = (Button)findViewById(R.id.login_btn);
=======
        button = (Button) findViewById(R.id.login_btn);
>>>>>>> 097d7d58978cc52a13cc39de4a75cb7b115bb4e3
        button.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), menu.class);
                startActivity(intent);
            }
        });
    }
}
