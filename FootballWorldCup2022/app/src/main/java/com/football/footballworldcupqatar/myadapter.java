package com.football.footballworldcupqatar;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

public class myadapter extends FirebaseRecyclerAdapter<model,myadapter.myviewholder>
{
    public myadapter(@NonNull FirebaseRecyclerOptions<model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model model)
    {
        holder.text1.setText(model.getText1());
        holder.text2.setText(model.getText2());
        holder.text3.setText(model.getText3());
        holder.text4.setText(model.getText4());
        holder.text5.setText(model.getText5());

        Glide.with(holder.team1.getContext()).load(model.getTeam1()).into(holder.team1);
        Glide.with(holder.team2.getContext()).load(model.getTeam2()).into(holder.team2);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singleschedule,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView team1 ,team2;
        TextView text1,text2,text3,text4,text5;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            team1=(ImageView)itemView.findViewById(R.id.team1);
            team2=(ImageView)itemView.findViewById(R.id.team2);
            text1=(TextView)itemView.findViewById(R.id.text1);
            text2=(TextView)itemView.findViewById(R.id.text2);
            text3=(TextView)itemView.findViewById(R.id.text3);
            text4=(TextView)itemView.findViewById(R.id.text4);
            text5=(TextView)itemView.findViewById(R.id.text5);

        }
    }
}
