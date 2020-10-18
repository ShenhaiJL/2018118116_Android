package com.example.listviewtest;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import org.w3c.dom.Text;

import java.util.List;

public class NbaAdapter extends ArrayAdapter<NBA> {

    private int resourceId;

    public NbaAdapter(@NonNull Context context, int textViewResourceId, List<NBA> objects) {
        super(context, textViewResourceId, objects);
        resourceId=textViewResourceId;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent){
        NBA nba=getItem(position);
        View view;
        if(convertView==null){
            view=LayoutInflater.from(getContext()).inflate(resourceId,parent,false);}
        else{
            view=convertView; }
        ImageView teamImage=(ImageView) view.findViewById(R.id.team_image);
        TextView teamName=(TextView) view.findViewById(R.id.team_name);
        teamImage.setImageResource(nba.getImageId());
        teamName.setText(nba.getName());
        return view;
    }
}
