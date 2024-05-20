package com.nfllive.nfl;

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

import de.hdodenhof.circleimageview.CircleImageView;

public class myadapterteam22 extends FirebaseRecyclerAdapter<modelteam22,myadapterteam22.myviewholder>
{
    public myadapterteam22(@NonNull FirebaseRecyclerOptions<modelteam22> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull modelteam22 modelteam22)
    {
        holder.date.setText(modelteam22.getDate());
        holder.text1.setText(modelteam22.getText1());
        holder.text2.setText(modelteam22.getText2());
        holder.time.setText(modelteam22.getTime());
        holder.group.setText(modelteam22.getGroup());
        holder.stadium.setText(modelteam22.getStadium());
        Glide.with(holder.img.getContext()).load(modelteam22.getTeam1()).into(holder.img);
        Glide.with(holder.img2.getContext()).load(modelteam22.getTeam2()).into(holder.img2);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singleteam22,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        CircleImageView img ,img2;
        TextView date ,time ,group ,stadium,text1,text2;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=(CircleImageView)itemView.findViewById(R.id.img1);
            img2=(CircleImageView)itemView.findViewById(R.id.img2);
            date=(TextView)itemView.findViewById(R.id.date);
            time=(TextView)itemView.findViewById(R.id.time);
            group=(TextView)itemView.findViewById(R.id.group);
            stadium=(TextView)itemView.findViewById(R.id.stadium);
            text1=(TextView)itemView.findViewById(R.id.text1);
            text2=(TextView)itemView.findViewById(R.id.text2);
        }
    }
}

