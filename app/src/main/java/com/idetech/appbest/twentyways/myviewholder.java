package com.idetech.appbest.twentyways;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class myviewholder extends RecyclerView.ViewHolder {
    ImageView img;
    TextView t1;


    public myviewholder(@NonNull View itemView) {
        super(itemView);
        img=itemView.findViewById(R.id.img1);
        t1=itemView.findViewById(R.id.t1);
    }
}
