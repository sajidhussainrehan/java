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

public class myadapter2 extends FirebaseRecyclerAdapter<com.football.footballworldcupqatar.model2,myadapter2.myviewholder>
{
    public myadapter2(@NonNull FirebaseRecyclerOptions<com.football.footballworldcupqatar.model2> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull com.football.footballworldcupqatar.model2 model2)
    {
        holder.team.setText(model2.getTeam());
        holder.text.setText(model2.getText());
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.lineup1,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        TextView team,text;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            team=(TextView)itemView.findViewById(R.id.team);
            text=(TextView)itemView.findViewById(R.id.text);

        }
    }
}

