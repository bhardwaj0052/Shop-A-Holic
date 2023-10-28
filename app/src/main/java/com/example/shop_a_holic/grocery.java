package com.example.shop_a_holic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class grocery extends AppCompatActivity {
    Button categories,notification,account,home,elect;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_grocery);
        elect=findViewById(R.id.btn1);
        categories=findViewById(R.id.cat);
        notification=findViewById(R.id.noti);
        account=findViewById(R.id.acc);
        home=findViewById(R.id.home);
        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(grocery.this, categories.class);
                startActivity(i);
            }
        });
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j= new Intent(grocery.this, account.class);
                startActivity(j);
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k= new Intent(grocery.this, notification.class);
                startActivity(k);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(grocery.this, MainActivity.class);
                startActivity(l);
            }
        });
        elect.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(grocery.this, cart.class);
                startActivity(m);
            }
        });
    }
}