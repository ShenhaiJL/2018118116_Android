package com.example.recyclerviewtest;

import android.nfc.tech.NfcBarcode;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;
import org.w3c.dom.Text;
import java.util.List;

public class NbaAdapter extends RecyclerView.Adapter<NbaAdapter.ViewHolder> {

    private List<NBA> mnbaList;

    static class ViewHolder extends RecyclerView.ViewHolder{     //内部类
        View nbaView;
        ImageView nbaImage;
        TextView nbaName;

        public ViewHolder(View view){
            super(view);
            nbaView=view;
            nbaImage=(ImageView) view.findViewById(R.id.team_image);
            nbaName=(TextView) view.findViewById(R.id.team_name);
        }
    }

    public NbaAdapter(List<NBA> nbaList){
        mnbaList=nbaList;
    }

    @Override
    public ViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        View view= LayoutInflater.from(parent.getContext())
                .inflate(R.layout.nba_team,parent,false);
        final ViewHolder holder=new ViewHolder(view);
        holder.nbaView.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position=holder.getAdapterPosition();
                NBA nba=mnbaList.get(position);
                Toast.makeText(v.getContext(),"you clicked view"+nba.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        holder.nbaImage.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v){
                int position=holder.getAdapterPosition();
                NBA nba=mnbaList.get(position);
                Toast.makeText(v.getContext(),"you clicked image"+nba.getName(),
                        Toast.LENGTH_SHORT).show();
            }
        });
        return holder;
    }

    @Override
    public void onBindViewHolder(ViewHolder holder,int position){
        NBA nba=mnbaList.get(position);
        holder.nbaImage.setImageResource(nba.getImageId());
        holder.nbaName.setText(nba.getName());
    }

    @Override
    public  int getItemCount(){
        return mnbaList.size();
    }

}
