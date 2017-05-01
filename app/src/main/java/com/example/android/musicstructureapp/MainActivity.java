package com.example.android.musicstructureapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import android.widget.TextView;

import org.w3c.dom.Text;

import static com.example.android.musicstructureapp.R.drawable.redseas;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        View republic = (LinearLayout) findViewById(R.id.republic_book);
        republic.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent republic = new Intent(MainActivity.this, RepublicOfThieves.class);
                startActivity(republic);
            }
        });

        View redSeas = (LinearLayout) findViewById(R.id.redseas_book);
        redSeas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent redSeas = new Intent(MainActivity.this, RedSeas.class);
                startActivity(redSeas);
            }
        });

        View leanStartup = (LinearLayout) findViewById(R.id.lean_startup_book);
        leanStartup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent leanStartup = new Intent(MainActivity.this, LeanStartup.class);
                startActivity(leanStartup);
            }
        });

        ImageButton search = (ImageButton) findViewById(R.id.search_button);
        search.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent search = new Intent(MainActivity.this, SearchActivity.class);
                startActivity(search);
            }
        });

        Button store = (Button) findViewById(R.id.store_button);
        store.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent store = new Intent(MainActivity.this, StoreActivity.class);
                startActivity(store);
            }
        });
    }
}
