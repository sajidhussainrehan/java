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

public class myadapterteams1 extends FirebaseRecyclerAdapter<modelteam1,myadapterteams1.myviewholder>
{
    public myadapterteams1(@NonNull FirebaseRecyclerOptions<modelteam1> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull modelteam1 modelteam1)
    {
        holder.text1.setText(modelteam1.getText1());
        holder.text2.setText(modelteam1.getText2());
        holder.text3.setText(modelteam1.getText3());
        holder.text4.setText(modelteam1.getText4());
        holder.text5.setText(modelteam1.getText5());
        holder.text6.setText(modelteam1.getText6());
        holder.text7.setText(modelteam1.getText7());
        holder.text8.setText(modelteam1.getText8());
        holder.text9.setText(modelteam1.getText9());

        Glide.with(holder.img1.getContext()).load(modelteam1.getTeam1()).into(holder.img1);
        Glide.with(holder.img2.getContext()).load(modelteam1.getTeam2()).into(holder.img2);
        Glide.with(holder.img3.getContext()).load(modelteam1.getTeam3()).into(holder.img3);
        Glide.with(holder.img4.getContext()).load(modelteam1.getTeam4()).into(holder.img4);
        Glide.with(holder.img5.getContext()).load(modelteam1.getTeam5()).into(holder.img5);
        Glide.with(holder.img6.getContext()).load(modelteam1.getTeam6()).into(holder.img6);
        Glide.with(holder.img7.getContext()).load(modelteam1.getTeam7()).into(holder.img7);
        Glide.with(holder.img8.getContext()).load(modelteam1.getTeam8()).into(holder.img8);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.singleteam1,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img1 ,img2 ,img3 ,img4 ,img5 ,img6 ,img7 ,img8;
        TextView text1,text2,text3,text4,text5,text6,text7,text8,text9;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img1=(ImageView)itemView.findViewById(R.id.img1);
            img2=(ImageView)itemView.findViewById(R.id.img2);
            img3=(ImageView)itemView.findViewById(R.id.img3);
            img4=(ImageView)itemView.findViewById(R.id.img4);
            img5=(ImageView)itemView.findViewById(R.id.img5);
            img6=(ImageView)itemView.findViewById(R.id.img6);
            img7=(ImageView)itemView.findViewById(R.id.img7);
            img8=(ImageView)itemView.findViewById(R.id.img8);
            text1=(TextView)itemView.findViewById(R.id.text1);
            text2=(TextView)itemView.findViewById(R.id.text2);
            text3=(TextView)itemView.findViewById(R.id.text3);
            text4=(TextView)itemView.findViewById(R.id.text4);
            text5=(TextView)itemView.findViewById(R.id.text5);
            text6=(TextView)itemView.findViewById(R.id.text6);
            text7=(TextView)itemView.findViewById(R.id.text7);
            text8=(TextView)itemView.findViewById(R.id.text8);
            text9=(TextView)itemView.findViewById(R.id.text9);
        }
    }
}
