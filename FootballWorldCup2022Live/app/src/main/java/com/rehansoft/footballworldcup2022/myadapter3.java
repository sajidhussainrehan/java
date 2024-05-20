package com.rehansoft.footballworldcup2022;

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

public class myadapter3 extends FirebaseRecyclerAdapter<model3,myadapter3.myviewholder>
{
    public myadapter3(@NonNull FirebaseRecyclerOptions<model3> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model3 model3)
    {

        holder.text1.setText(model3.getText1());
        holder.text2.setText(model3.getText2());

        Glide.with(holder.img.getContext()).load(model3.getTeam1()).into(holder.img);
        Glide.with(holder.img2.getContext()).load(model3.getTeam2()).into(holder.img2);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.channel1,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img ,img2;
        TextView text1,text2;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.image1);
            img2=(ImageView)itemView.findViewById(R.id.image2);
            text1=(TextView)itemView.findViewById(R.id.text3);
            text2=(TextView)itemView.findViewById(R.id.text4);
        }
    }
}

