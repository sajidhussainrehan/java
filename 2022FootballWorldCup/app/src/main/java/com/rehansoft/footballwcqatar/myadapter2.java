package com.rehansoft.footballwcqatar;

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

public class myadapter2 extends FirebaseRecyclerAdapter<model2,myadapter2.myviewholder>
{
    public myadapter2(@NonNull FirebaseRecyclerOptions<model2> options) {
        super(options);
    }

    @Override
    protected void onBindViewHolder(@NonNull myviewholder holder, int position, @NonNull com.rehansoft.footballwcqatar.model2 model2)
    {
        holder.name.setText(model2.getName());
        holder.cap.setText(model2.getCap());
        Glide.with(holder.img.getContext()).load(model2.getImg()).into(holder.img);
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType)
    {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.stadium1,parent,false);
        return new myviewholder(view);
    }

    class myviewholder extends RecyclerView.ViewHolder
    {
        ImageView img;
        TextView name,cap;
        public myviewholder(@NonNull View itemView)
        {
            super(itemView);
            img=(ImageView)itemView.findViewById(R.id.img);
            name=(TextView)itemView.findViewById(R.id.name);
            cap=(TextView)itemView.findViewById(R.id.cap);

        }
    }
}
