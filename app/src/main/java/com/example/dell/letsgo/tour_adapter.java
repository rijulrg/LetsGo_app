package com.example.dell.letsgo;

import java.util.ArrayList;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class tour_adapter extends ArrayAdapter {


    public tour_adapter(Context context, ArrayList<reqitems> data) {
        super(context, 0, data);
    }


    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View itemview = convertView;
        if (itemview == null) {
            itemview = LayoutInflater.from(getContext()).inflate(
                    R.layout.itempreview, parent, false);
        }
        reqitems current = (reqitems) getItem(position);

        TextView tvn = (TextView) itemview.findViewById(R.id.namebar);
        tvn.setText(current.get_name());
        TextView tva = (TextView) itemview.findViewById(R.id.addbar);
        tva.setText(current.get_address());

        ImageView ivi = (ImageView) itemview.findViewById(R.id.ipicture);
        if (current.image_available()) {
            ivi.setImageResource(current.get_imgid());
            ivi.setVisibility(View.VISIBLE);
        } else {
            ivi.setVisibility(View.GONE);
        }
        return itemview;
    }

}
