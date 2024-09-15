package com.example.advancedconceptsinrecycleview.Recycleviewwithcardview;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advancedconceptsinrecycleview.Model.Planet;
import com.example.advancedconceptsinrecycleview.R;
import com.example.advancedconceptsinrecycleview.databinding.ActivityRecyclewithcardBinding;

import java.util.ArrayList;

public class RecyclewithcardActivity extends AppCompatActivity {
    ActivityRecyclewithcardBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRecyclewithcardBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Planet> arrayList=new ArrayList<>();
        arrayList.add(new Planet("khaled",R.drawable.image1,300,20));
        arrayList.add(new Planet("ahmad",R.drawable.image2,350,30));
        arrayList.add(new Planet("ali",R.drawable.image3,400,40));
        arrayList.add(new Planet("sami",R.drawable.image4,500,50));
        CardAdapter cardAdapter=new CardAdapter(arrayList);
        binding.recyelewithcard.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL,false));
        binding.recyelewithcard.setAdapter(cardAdapter);




    }
}