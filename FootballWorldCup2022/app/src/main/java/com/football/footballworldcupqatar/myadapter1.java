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

import de.hdodenhof.circleimageview.CircleImageView;

public class myadapter1 extends FirebaseRecyclerAdapter<com.football.footballworldcupqatar.model1,myadapter1.myviewholder>
{
    public myadapter1(@NonNull FirebaseRecyclerOptions<com.football.footballworldcupqatar.model1> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull com.football.footballworldcupqatar.model1 model1)
    {
        holder.player.setText(model1.getPlayer());
        Glide.with(holder.img.getContext()).load(model1.getImg()).into(holder.img);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.team1single,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView player;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.img);
            player=(TextView)itemView.findViewById(R.id.player);

        }
    }
}

