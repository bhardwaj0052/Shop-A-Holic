package com.example.shop_a_holic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class cart extends AppCompatActivity {
    Button categories,notification,account,home,grocery;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cart);
        grocery=findViewById(R.id.btn2);
        categories=findViewById(R.id.cat);
        notification=findViewById(R.id.noti);
        account=findViewById(R.id.acc);
        home=findViewById(R.id.home);
        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(cart.this, categories.class);
                startActivity(i);
            }
        });
        account.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j= new Intent(cart.this, account.class);
                startActivity(j);
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k= new Intent(cart.this, notification.class);
                startActivity(k);
            }
        });
       home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(cart.this, MainActivity.class);
                startActivity(l);
            }
        });
       grocery.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               Intent m=new Intent(cart.this, grocery.class);
               startActivity(m);
           }
       });
    }
}