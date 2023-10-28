package com.example.shop_a_holic;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Addcart extends AppCompatActivity {
    Button back,conti;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_addcart);
        conti=findViewById(R.id.cont);
        back = findViewById(R.id.back1);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(Addcart.this, MainActivity.class);
                startActivity(i);
            }
        });
        conti.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent j=new Intent(Addcart.this, Order.class);
                startActivity(j);
            }
        });
    }
}