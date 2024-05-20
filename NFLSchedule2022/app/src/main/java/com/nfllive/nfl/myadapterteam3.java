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

public class myadapterteam3 extends FirebaseRecyclerAdapter<modelteam3,myadapterteam3.myviewholder>
{
    public myadapterteam3(@NonNull FirebaseRecyclerOptions<modelteam3> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull modelteam3 modelteam3)
    {
        holder.date.setText(modelteam3.getDate());
        holder.text1.setText(modelteam3.getText1());
        holder.text2.setText(modelteam3.getText2());
        holder.time.setText(modelteam3.getTime());
        holder.group.setText(modelteam3.getGroup());
        holder.stadium.setText(modelteam3.getStadium());
        Glide.with(holder.img.getContext()).load(modelteam3.getTeam1()).into(holder.img);
        Glide.with(holder.img2.getContext()).load(modelteam3.getTeam2()).into(holder.img2);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singleteam3,parent,false);
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

