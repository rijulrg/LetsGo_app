package com.example.dell.letsgo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

import java.util.ArrayList;

public class list extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list);

        Bundle bundle = getIntent().getExtras();
        int posno = bundle.getInt(getString(com.example.dell.letsgo.R.string.iposition));

        if (posno == 0) {
            final ArrayList<reqitems> data = new ArrayList<>();
            data.add(new reqitems(getString(R.string.r1name), getString(R.string.r1add), R.drawable.r1));
            data.add(new reqitems(getString(R.string.r2name), getString(R.string.r2add), R.drawable.r2));
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.r3name), getString(com.example.dell.letsgo.R.string.r3add), R.drawable.r3));
            tour_adapter adapter1 = new tour_adapter(this, data);
            ListView show = (ListView) findViewById(R.id.viewitemlist);
            show.setAdapter(adapter1);

        }

        if (posno == 1) {
            final ArrayList<reqitems> data = new ArrayList<>();
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.m1name), getString(com.example.dell.letsgo.R.string.m1add), R.drawable.sm1));
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.m2name), getString(com.example.dell.letsgo.R.string.m2add), R.drawable.sm2));
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.m3name), getString(com.example.dell.letsgo.R.string.m3add), R.drawable.sm3));
            tour_adapter adapter1 = new tour_adapter(this, data);
            ListView show = (ListView) findViewById(R.id.viewitemlist);
            show.setAdapter(adapter1);

        }

        if (posno == 2) {
            final ArrayList<reqitems> data = new ArrayList<>();
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.h1name), getString(com.example.dell.letsgo.R.string.h1add), R.drawable.h1));
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.h2name), getString(com.example.dell.letsgo.R.string.h2add), R.drawable.h2));
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.h3name), getString(com.example.dell.letsgo.R.string.h3add), R.drawable.h3));
            tour_adapter adapter1 = new tour_adapter(this, data);
            ListView show = (ListView) findViewById(R.id.viewitemlist);
            show.setAdapter(adapter1);

        }

        if (posno == 3) {
            final ArrayList<reqitems> data = new ArrayList<>();
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.c1name), getString(com.example.dell.letsgo.R.string.c1add), R.drawable.c1));
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.c2name), getString(com.example.dell.letsgo.R.string.c2add), R.drawable.c2));
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.c3name), getString(com.example.dell.letsgo.R.string.c3add), R.drawable.c3));
            tour_adapter adapter1 = new tour_adapter(this, data);
            ListView show = (ListView) findViewById(R.id.viewitemlist);
            show.setAdapter(adapter1);

        }

        if (posno == 4) {
            final ArrayList<reqitems> data = new ArrayList<>();
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.s1name), getString(com.example.dell.letsgo.R.string.s1add), R.drawable.s1));
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.s2name), getString(com.example.dell.letsgo.R.string.s2add), R.drawable.s2));
            data.add(new reqitems(getString(com.example.dell.letsgo.R.string.s3name), getString(com.example.dell.letsgo.R.string.s3add), R.drawable.s3));
            tour_adapter adapter1 = new tour_adapter(this, data);
            ListView show = (ListView) findViewById(R.id.viewitemlist);
            show.setAdapter(adapter1);

        }


    }
}
