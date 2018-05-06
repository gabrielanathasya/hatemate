package com.example.asus.hatematenew;

import android.app.SearchManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.view.MenuItem;
import android.view.View;

public class hate_room extends AppCompatActivity {

    private CardView pemiluCard, kpopCard, animeCard, seranggaCard, seafoodCard;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hate_room);

        //defining cards
        pemiluCard = (CardView) findViewById(R.id.pemilu_topic_card);
        kpopCard = (CardView) findViewById(R.id.kpop_topic_card);
        animeCard = (CardView) findViewById(R.id.anime_topic_card);
        seranggaCard = (CardView) findViewById(R.id.serangga_topic_card);
        seafoodCard = (CardView) findViewById(R.id.seafood_topic_card);

        //add click listener to the cards
        pemiluCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });

        kpopCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });

        animeCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });

        seranggaCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });

        seafoodCard.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                openNextActivity(v);
            }
        });


        // SEARCH: Get the intent, verify the action and get the query
        Intent intent = getIntent();
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
           // doMySearch(query);
        }
    }

    public void openNextActivity(View v){
        Intent i;

        switch(v.getId()){
            case R.id.pemilu_topic_card : i = new Intent(this, topic_profile.class); startActivity(i); break;
            case R.id.kpop_topic_card : i = new Intent(this, topic_profile.class); startActivity(i); break;
            case R.id.anime_topic_card : i = new Intent(this, topic_profile.class); startActivity(i); break;
            case R.id.serangga_topic_card : i = new Intent(this, topic_profile.class); startActivity(i); break;
            case R.id.seafood_topic_card : i = new Intent(this, topic_profile.class); startActivity(i); break;
            default:break;
        }
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if(item.getTitle().equals("Search")) {
            //Toast.makeText(getApplicationContext(), "Search = "+onSearchRequested(), Toast.LENGTH_LONG).show();
            return onSearchRequested();
        } else {
            return false;
        }
    }
}


//******************copas snippet search dialog*************************
/*
public class hate_room extends ListActivity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d("SEARCH", "HERE");
        handleIntent(getIntent());
    }

    public void onNewIntent(Intent intent) {
        setIntent(intent);
        handleIntent(intent);
    }

    public void onListItemClick(ListView l, View v, int position, long id) {
        // call the appropriate detail activity
    }

    private void handleIntent(Intent intent) {
        if (Intent.ACTION_SEARCH.equals(intent.getAction())) {
            String query = intent.getStringExtra(SearchManager.QUERY);
            doSearch(query);
        }
    }

    private void doSearch(String queryStr) {
        Toast.makeText(getApplicationContext(), queryStr, Toast.LENGTH_LONG).show();
    }

}
*/
