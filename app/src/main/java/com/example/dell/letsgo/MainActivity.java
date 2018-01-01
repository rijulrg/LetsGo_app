package com.example.dell.letsgo;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView tv_restaurant = (TextView) findViewById(R.id.rest);
        tv_restaurant.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent rest = new Intent(MainActivity.this, list.class);
                rest.putExtra(getString(com.example.dell.letsgo.R.string.iposition), 0);
                startActivity(rest);
            }
        });

        TextView tv_shopping_mall = (TextView) findViewById(R.id.shopp);
        tv_shopping_mall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent shopp = new Intent(MainActivity.this, list.class);
                shopp.putExtra(getString(com.example.dell.letsgo.R.string.iposition), 1);
                startActivity(shopp);
            }
        });

        TextView tv_hotel = (TextView) findViewById(R.id.hote);
        tv_hotel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent hote = new Intent(MainActivity.this, list.class);
                hote.putExtra(getString(com.example.dell.letsgo.R.string.iposition), 2);
                startActivity(hote);
            }
        });

        TextView tv_cafe = (TextView) findViewById(R.id.caf);
        tv_cafe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent caf = new Intent(MainActivity.this, list.class);
                caf.putExtra(getString(com.example.dell.letsgo.R.string.iposition), 3);
                startActivity(caf);
            }
        });

        TextView tv_school = (TextView) findViewById(R.id.scho);
        tv_school.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent scho = new Intent(MainActivity.this, list.class);
                scho.putExtra(getString(com.example.dell.letsgo.R.string.iposition), 4);
                startActivity(scho);
            }
        });

    }
}
