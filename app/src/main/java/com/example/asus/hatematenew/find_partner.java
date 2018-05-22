package com.example.asus.hatematenew;

import android.content.Intent;
import android.support.v4.view.GravityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import java.util.ArrayList;

public class find_partner extends AppCompatActivity {

    private CardView partnerCard;
    //private CardView partnerCard1, partnerCard2, partnerCard3, partnerCard4, partnerCard5;
    private RecyclerView recyclerView;
    private partnerAdapter adapter;
    private ArrayList<partnerClass> partnerArrayList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_partner);

        addData();

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        adapter = new partnerAdapter(partnerArrayList);

        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(find_partner.this);

        recyclerView.setLayoutManager(layoutManager);

        recyclerView.setAdapter(adapter);

        //defining cards
        partnerCard = (CardView) findViewById(R.id.partner_card);
        /*
        partnerCard1 = (CardView) findViewById(R.id.partner_card_1);
        partnerCard2 = (CardView) findViewById(R.id.partner_card_2);
        partnerCard3 = (CardView) findViewById(R.id.partner_card_3);
        partnerCard4 = (CardView) findViewById(R.id.partner_card_4);
        partnerCard5 = (CardView) findViewById(R.id.partner_card_5);
        */

        //add click listener to the cards
        partnerCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                Intent intent = new Intent(v.getContext(), partner_profile.class);
                startActivity(intent);
            }
        });
        /*
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
        */
    }

    void addData(){
        partnerArrayList = new ArrayList<>();
        partnerArrayList.add(new partnerClass("Cara Delevigne", "I'm a model from London", "86%", "","@drawable/cara"));
        partnerArrayList.add(new partnerClass("Emma Stone", "Have you seen La La Land?", "80%", "","@drawable/emma_stone"));
        partnerArrayList.add(new partnerClass("Miley Cyrus", "Coolest girl you'll ever meet", "75%", "","@drawable/miley_cyrus"));
        partnerArrayList.add(new partnerClass("Beyonce", "Queen bee", "71%", "","@drawable/beyonce"));
        partnerArrayList.add(new partnerClass("Emma Watson", "Feminist", "66%", "","@drawable/emma_watson"));
    }

    /*
    public void openNextActivity(View v){
        Intent i;

        switch(v.getId()){
            case R.id.partner_card : i = new Intent(this, partner_profile.class); startActivity(i); break;

            case R.id.partner_card_1 : i = new Intent(this, partner_profile.class); startActivity(i); break;
            case R.id.partner_card_2 : i = new Intent(this, partner_profile.class); startActivity(i); break;
            case R.id.partner_card_3 : i = new Intent(this, partner_profile.class); startActivity(i); break;
            case R.id.partner_card_4 : i = new Intent(this, partner_profile.class); startActivity(i); break;
            case R.id.partner_card_5 : i = new Intent(this, partner_profile.class); startActivity(i); break;

            default:break;
        }
    }
    */
}
