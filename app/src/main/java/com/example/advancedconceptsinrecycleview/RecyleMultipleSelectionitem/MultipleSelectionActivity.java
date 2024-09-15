package com.example.advancedconceptsinrecycleview.RecyleMultipleSelectionitem;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.example.advancedconceptsinrecycleview.Model.Employee;
import com.example.advancedconceptsinrecycleview.R;
import com.example.advancedconceptsinrecycleview.databinding.ActivityMultipleSelectionBinding;
import com.example.advancedconceptsinrecycleview.databinding.ActivityRecycleviewwithsingleitemselectedBinding;

import java.util.ArrayList;

public class MultipleSelectionActivity extends AppCompatActivity {

    ActivityMultipleSelectionBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding=ActivityMultipleSelectionBinding .inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        ArrayList<Employee> arrayList=new ArrayList<>();
        arrayList.add(new Employee("khaled"));
        arrayList.add(new Employee("ahmad"));
        arrayList.add(new Employee("ali"));
        arrayList.add(new Employee("arnabet"));
        arrayList.add(new Employee("nancy"));
        arrayList.add(new Employee("hsein"));
        arrayList.add(new Employee("lama"));
        arrayList.add(new Employee("adel"));
        arrayList.add(new Employee("imad"));
        MultiAddapter addapter=new MultiAddapter(arrayList);

        binding.recyclewithmultipleseletitem.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));
        binding.recyclewithmultipleseletitem.setAdapter(addapter);
        binding.selecteditem.setOnClickListener(v->{
            StringBuilder stringBuilder=new StringBuilder();
            for(int i=0;i<addapter.getselected().size();i++){
                stringBuilder.append(addapter.getselected().get(i).getName());
                stringBuilder.append("\n");
            }
            //trim() method bel string btemna3 aye space ykoun 2awl she w 2e5er she exmple "  hello, world  "->"hello, word"
            showtoast(stringBuilder.toString().trim());
        });


    }

    private void showtoast(String msg) {
        Toast.makeText(this, ""+msg, Toast.LENGTH_SHORT).show();
    }
}