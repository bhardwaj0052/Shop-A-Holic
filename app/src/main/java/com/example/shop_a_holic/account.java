package com.example.shop_a_holic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class account extends AppCompatActivity {
    Button categories,notification,home,cart,login,notificationsetting,help,languages;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_account);
        notificationsetting=findViewById(R.id.notisetting);
        help = findViewById(R.id.helpcentre);
        languages=findViewById(R.id.lang);
        login=findViewById(R.id.login);
        categories=findViewById(R.id.cat);
        notification=findViewById(R.id.noti);
        home=findViewById(R.id.home);
        cart=findViewById(R.id.cart);
        categories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i= new Intent(account.this, categories.class);
                startActivity(i);
            }
        });
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j= new Intent(account.this, MainActivity.class);
                startActivity(j);
            }
        });
        notification.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent k= new Intent(account.this, notification.class);
                startActivity(k);
            }
        });
        cart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent l=new Intent(account.this, cart.class);
                startActivity(l);
            }
        });
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent m=new Intent(account.this, loginpage.class);
                startActivity(m);
            }
        });
        notificationsetting.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent n=new Intent(account.this, Notiset.class);
                startActivity(n);
            }
        });
        help.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent o=new Intent(account.this, Help.class);
                startActivity(o);
            }
        });
        languages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent p=new Intent(account.this, Languages.class);
                startActivity(p);
            }
        });
    }
}