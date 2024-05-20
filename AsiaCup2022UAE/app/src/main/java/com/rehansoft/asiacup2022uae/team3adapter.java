package com.rehansoft.asiacup2022uae;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.firebase.ui.database.FirebaseRecyclerAdapter;
import com.firebase.ui.database.FirebaseRecyclerOptions;

import de.hdodenhof.circleimageview.CircleImageView;

public class team3adapter extends FirebaseRecyclerAdapter<team3model,team3adapter.myviewholder>
{
    public team3adapter(@NonNull FirebaseRecyclerOptions<team3model> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull team3model team3model)
    {
        holder.text1.setText(team3model.getText1());
        holder.text2.setText(team3model.getText2());
        holder.text3.setText(team3model.getText3());
        holder.text4.setText(team3model.getText4());
        holder.text5.setText(team3model.getText5());
        holder.text6.setText(team3model.getText6());
        Glide.with(holder.img.getContext()).load(team3model.getPlayer1()).into(holder.img);
        Glide.with(holder.img2.getContext()).load(team3model.getPlayer2()).into(holder.img2);
        Glide.with(holder.img3.getContext()).load(team3model.getPlayer3()).into(holder.img3);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.team3single,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        CircleImageView img ,img2 ,img3;
        TextView text1 ,text2 , text3, text4 , text5,text6;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=(CircleImageView)itemView.findViewById(R.id.img1);
            img2=(CircleImageView)itemView.findViewById(R.id.img2);
            img3=(CircleImageView)itemView.findViewById(R.id.img3);
            text1=(TextView)itemView.findViewById(R.id.text1);
            text2=(TextView)itemView.findViewById(R.id.text2);
            text3=(TextView)itemView.findViewById(R.id.text3);
            text4=(TextView)itemView.findViewById(R.id.text4);
            text5=(TextView)itemView.findViewById(R.id.text5);
            text6=(TextView)itemView.findViewById(R.id.text6);

        }
    }
}

