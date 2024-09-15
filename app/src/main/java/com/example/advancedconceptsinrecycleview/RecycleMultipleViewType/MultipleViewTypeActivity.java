package com.example.advancedconceptsinrecycleview.RecycleMultipleViewType;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.advancedconceptsinrecycleview.Model.Multiemail;
import com.example.advancedconceptsinrecycleview.databinding.ActivityMultipleViewTypeBinding;

import java.util.ArrayList;

public class MultipleViewTypeActivity extends AppCompatActivity {
    ActivityMultipleViewTypeBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMultipleViewTypeBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Multiemail> arrayList=new ArrayList<>();
        //phone item
        Multiemail multiemail=new Multiemail();
        multiemail.setName("khaled");
        multiemail.setAddress("newyork");
        multiemail.setPhone("+0234433333233");
        arrayList.add(multiemail);

        //email
        Multiemail multiemail1=new Multiemail();
        multiemail1.setName("khaled");
        multiemail1.setAddress("newyork");
        multiemail.setEmail("ka@hotmail.com");
        arrayList.add(multiemail1);

        //phone item
        Multiemail multiemail3=new Multiemail();
        multiemail3.setName("ahamd");
        multiemail3.setAddress("leabnon");
        multiemail3.setPhone("+044444444444");
        arrayList.add(multiemail);

        //email
        Multiemail multiemail4=new Multiemail();
        multiemail4.setName("ahamd");
        multiemail4.setAddress("leabnon");
        multiemail4.setEmail("ka@hotmail.com");
        arrayList.add(multiemail1);

        MultipleTypeAddpter addpter=new MultipleTypeAddpter(this,arrayList);
        binding.multipletyperecycle.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.multipletyperecycle.setAdapter(addpter);




    }
}