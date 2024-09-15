package com.example.advancedconceptsinrecycleview.RecycleViewwithsingleitemselected;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;


import com.example.advancedconceptsinrecycleview.Model.Employee;
import com.example.advancedconceptsinrecycleview.R;
import com.example.advancedconceptsinrecycleview.databinding.ActivityRecycleviewwithsingleitemselectedBinding;

import java.util.ArrayList;

public class RecycleviewwithsingleitemselectedActivity extends AppCompatActivity {
    ActivityRecycleviewwithsingleitemselectedBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityRecycleviewwithsingleitemselectedBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Employee> arrayList=new ArrayList<>();
        arrayList.add(new Employee("khaled"));
        arrayList.add(new Employee("ahmad"));
        arrayList.add(new Employee("ali"));
        arrayList.add(new Employee("omar"));
        arrayList.add(new Employee("mhammad"));
        arrayList.add(new Employee("hsein"));
        arrayList.add(new Employee("jad"));
        arrayList.add(new Employee("jawad"));
        arrayList.add(new Employee("adel"));
        arrayList.add(new Employee("imad"));
        SingleAddapter addapter=new SingleAddapter(arrayList);
        binding.recycleviewwithsingleitemselected.addItemDecoration(new DividerItemDecoration(this,DividerItemDecoration.VERTICAL));
        binding.recycleviewwithsingleitemselected.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.recycleviewwithsingleitemselected.setAdapter(addapter);

        binding.toastselected.setOnClickListener(v->{
            if(addapter.getselected()!=null){
                showtoast(addapter.getselected().getName());
            }
            else{
                showtoast("no selection");
            }
        });
    }

    private void showtoast(String name) {
        Toast.makeText(this, ""+name, Toast.LENGTH_SHORT).show();

    }
}