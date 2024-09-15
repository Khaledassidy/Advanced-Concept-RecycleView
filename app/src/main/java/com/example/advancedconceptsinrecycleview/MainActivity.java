
package com.example.advancedconceptsinrecycleview;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.advancedconceptsinrecycleview.RecyleMultipleSelectionitem.MultipleSelectionActivity;
import com.example.advancedconceptsinrecycleview.RecycleMultipleViewType.MultipleViewTypeActivity;
import com.example.advancedconceptsinrecycleview.RecycleViewwithsingleitemselected.RecycleviewwithsingleitemselectedActivity;
import com.example.advancedconceptsinrecycleview.Recycleviewwithcardview.RecyclewithcardActivity;
import com.example.advancedconceptsinrecycleview.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        binding.recyclewithcardview.setOnClickListener(v->{
            Intent intent=new Intent(this, RecyclewithcardActivity.class);
            startActivity(intent);
        });

        binding.recyclewithsingleitemselected.setOnClickListener(v->{
            Intent intent=new Intent(this, RecycleviewwithsingleitemselectedActivity.class);
            startActivity(intent);

        });

        binding.recyclewithmultipleviewtype.setOnClickListener(v->{
            Intent intent=new Intent(this, MultipleViewTypeActivity.class);
            startActivity(intent);
        });

        binding.recyclewithmultipleselectionitem.setOnClickListener(v->{
            Intent intent=new Intent(this, MultipleSelectionActivity.class);
            startActivity(intent);
        });


        //la nest5dem l swipe mnest3mel hay library:    implementation(libs.swipe.reveal.layout)





    }
}