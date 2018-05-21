package com.example.asus.hatematenew;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;

public class find_partner extends AppCompatActivity {

    private CardView partnerCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_partner);

        //defining cards
        partnerCard = (CardView) findViewById(R.id.partner_card);
        partnerCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), partner_profile.class);
                startActivity(intent);
            }
        });
    }
/*
    public void openNextActivity(View v){
        Intent i;

        switch(v.getId()){
            case R.id.partner_card : i = new Intent(this, partner_profile.class); startActivity(i); break;
            default:break;
        }
    }
*/
}
