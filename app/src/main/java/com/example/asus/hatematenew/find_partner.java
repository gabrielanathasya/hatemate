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

    private CardView partnerCard1, partnerCard2, partnerCard3, partnerCard4, partnerCard5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_partner);

        //defining cards
        partnerCard1 = (CardView) findViewById(R.id.partner_card_1);
        partnerCard2 = (CardView) findViewById(R.id.partner_card_2);
        partnerCard3 = (CardView) findViewById(R.id.partner_card_3);
        partnerCard4 = (CardView) findViewById(R.id.partner_card_4);
        partnerCard5 = (CardView) findViewById(R.id.partner_card_5);

        //add click listener to the cards
        partnerCard1.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });

        partnerCard2.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });

        partnerCard3.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });

        partnerCard4.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });

        partnerCard5.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });

    }

    public void openNextActivity(View v){
        Intent i;

        switch(v.getId()){
            case R.id.partner_card_1 : i = new Intent(this, partner_profile.class); startActivity(i); break;
            case R.id.partner_card_2 : i = new Intent(this, partner_profile.class); startActivity(i); break;
            case R.id.partner_card_3 : i = new Intent(this, partner_profile.class); startActivity(i); break;
            case R.id.partner_card_4 : i = new Intent(this, partner_profile.class); startActivity(i); break;
            case R.id.partner_card_5 : i = new Intent(this, partner_profile.class); startActivity(i); break;
            default:break;
        }
    }
}
