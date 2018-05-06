package com.example.asus.hatematenew;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBar;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.MenuItem;
import android.view.View;

public class menu extends AppCompatActivity {

    private CardView findpartnerCard, hateroomCard, dateCard, topicsCard;
    private DrawerLayout mDrawerLayout;
    private ActionBarDrawerToggle mToggle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionbar = getSupportActionBar();
        actionbar.setDisplayHomeAsUpEnabled(true);
        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);

        //------sideBar

        mDrawerLayout = (DrawerLayout) findViewById(R.id.drawerLayout);

        NavigationView navigationView = findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });
        /*
        mToggle = new ActionBarDrawerToggle(this, mDrawerLayout, R.string.open, R.string.close);

        mDrawerLayout.addDrawerListener(mToggle);
        mToggle.syncState();
        */
        //----end-SideBar

        //defining cards
        findpartnerCard = (CardView) findViewById(R.id.findpartner_card);
        hateroomCard = (CardView) findViewById(R.id.hateroom_card);
        dateCard = (CardView) findViewById(R.id.date_card);
        topicsCard = (CardView) findViewById(R.id.topics_card);

        //add click listener to the cards
        findpartnerCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });

        hateroomCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });

        dateCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });

        topicsCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });
    }

    public void openNextActivity(View v){
        Intent i;

        switch(v.getId()){
            case R.id.findpartner_card : i = new Intent(this, find_partner.class); startActivity(i); break;
            case R.id.hateroom_card : i = new Intent(this, hate_room.class); startActivity(i); break;
            case R.id.date_card : i = new Intent(this, date.class); startActivity(i); break;
            case R.id.topics_card : i = new Intent(this, hate_topics.class); startActivity(i); break;
            default:break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                mDrawerLayout.openDrawer(GravityCompat.START);
                return true;
        }
        return super.onOptionsItemSelected(item);
    }
}
