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

public class myadapterteams extends FirebaseRecyclerAdapter<modelteams,myadapterteams.myviewholder>
{
    public myadapterteams(@NonNull FirebaseRecyclerOptions<modelteams> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull modelteams modelteams)
    {
        holder.text1.setText(modelteams.getText1());
        holder.text2.setText(modelteams.getText2());
        holder.text3.setText(modelteams.getText3());
        holder.text4.setText(modelteams.getText4());
        holder.text5.setText(modelteams.getText5());

         Glide.with(holder.img1.getContext()).load(modelteams.getTeam1()).into(holder.img1);
        Glide.with(holder.img2.getContext()).load(modelteams.getTeam2()).into(holder.img2);
        Glide.with(holder.img3.getContext()).load(modelteams.getTeam3()).into(holder.img3);
        Glide.with(holder.img4.getContext()).load(modelteams.getTeam4()).into(holder.img4);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singleteams,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img1 ,img2 ,img3 ,img4;
        TextView text1,text2,text3,text4,text5;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img1=(ImageView)itemView.findViewById(R.id.img1);
            img2=(ImageView)itemView.findViewById(R.id.img2);
            img3=(ImageView)itemView.findViewById(R.id.img3);
            img4=(ImageView)itemView.findViewById(R.id.img4);
            text1=(TextView)itemView.findViewById(R.id.text1);
            text2=(TextView)itemView.findViewById(R.id.text2);
            text3=(TextView)itemView.findViewById(R.id.text3);
            text4=(TextView)itemView.findViewById(R.id.text4);
            text5=(TextView)itemView.findViewById(R.id.text5);
        }
    }
}
