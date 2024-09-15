package com.example.advancedconceptsinrecycleview.Recycleviewwithcardview;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advancedconceptsinrecycleview.Model.Planet;
import com.example.advancedconceptsinrecycleview.R;
import com.example.advancedconceptsinrecycleview.databinding.TheCostumeLayoutBinding;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

public class CardAdapter extends RecyclerView.Adapter<CardAdapter.PlanetHolder> {
    ArrayList<Planet> arrayList;


    public CardAdapter(ArrayList<Planet> arrayList){
        this.arrayList=arrayList;
    }

    @NonNull
    @Override
    public PlanetHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.the_costume_layout,parent,false);

        return new PlanetHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull PlanetHolder holder, int position) {
        Picasso.get().load(arrayList.get(position).getImage()).resize(100,90).centerCrop().error(R.drawable.ic_launcher_background).placeholder(R.drawable.ic_launcher_background).into(holder.binding.imageplanet);
        holder.binding.planetname.setText(arrayList.get(position).getPlanetname());
        holder.binding.distancefromsun.setText(String.valueOf(arrayList.get(position).getDistancefromsun()));
        holder.binding.gravityofplanet.setText(String.valueOf(arrayList.get(position).getGravity()));

    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class PlanetHolder extends RecyclerView.ViewHolder{
        TheCostumeLayoutBinding binding;
        public PlanetHolder(@NonNull View itemView) {
            super(itemView);
            binding=TheCostumeLayoutBinding.bind(itemView);
        }
    }
}
