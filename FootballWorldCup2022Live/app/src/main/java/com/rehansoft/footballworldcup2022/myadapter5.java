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

public class myadapter5 extends FirebaseRecyclerAdapter<model5,myadapter5.myviewholder>
{
    public myadapter5(@NonNull FirebaseRecyclerOptions<model5> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull model5 model5)
    {

        holder.text1.setText(model5.getText1());
        holder.text2.setText(model5.getText2());
        holder.text3.setText(model5.getText3());
        Glide.with(holder.img.getContext()).load(model5.getTeam1()).into(holder.img);

    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.statss,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView text1,text2 ,text3;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.image1);
            text3=(TextView)itemView.findViewById(R.id.text1);
            text1=(TextView)itemView.findViewById(R.id.text3);
            text2=(TextView)itemView.findViewById(R.id.text4);
        }
    }
}

