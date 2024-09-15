package com.example.advancedconceptsinrecycleview.RecyleMultipleSelectionitem;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advancedconceptsinrecycleview.Model.Employee;
import com.example.advancedconceptsinrecycleview.R;

import java.util.ArrayList;

public class MultiAddapter extends RecyclerView.Adapter<MultiAddapter.MultiViewholder> {
    ArrayList<Employee> employees;


    public MultiAddapter(ArrayList<Employee> arrayList){
        this.employees=arrayList;
    }

    @NonNull
    @Override
    public MultiViewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_employee,parent,false);
        return new MultiViewholder(view);

    }

    @Override
    public void onBindViewHolder(@NonNull MultiViewholder holder, int position) {
            holder.bind(employees.get(position));
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }


    class MultiViewholder extends RecyclerView.ViewHolder{
        private TextView textView;
        public ImageView imageView;
        public MultiViewholder(@NonNull View itemView) {
            super(itemView);
            textView=itemView.findViewById(R.id.emp_name);
            imageView=itemView.findViewById(R.id.imageviewy);

        }



        void bind(Employee employee){
            imageView.setVisibility(employee.isIschecked()?View.VISIBLE:View.GONE);
            textView.setText(employee.getName());
            itemView.setOnClickListener(v->{
                employee.setIschecked(!employee.isIschecked());
                imageView.setVisibility(employee.isIschecked()?View.VISIBLE:View.GONE);

            });
        }


    }
    public ArrayList<Employee> getselected(){
        ArrayList<Employee> selected=new ArrayList<>();
        for(int i=0;i<employees.size();i++){
            if(employees.get(i).isIschecked()){
                selected.add(employees.get(i));
            }
        }
        return selected;
    }

    public ArrayList<Employee> getAll(){
        return employees;
    }





}
