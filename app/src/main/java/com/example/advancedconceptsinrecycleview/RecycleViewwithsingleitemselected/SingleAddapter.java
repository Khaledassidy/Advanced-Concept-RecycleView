package com.example.advancedconceptsinrecycleview.RecycleViewwithsingleitemselected;

import android.provider.ContactsContract;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advancedconceptsinrecycleview.Model.Employee;
import com.example.advancedconceptsinrecycleview.R;
import com.example.advancedconceptsinrecycleview.databinding.TheCostumeLayout2Binding;

import java.util.ArrayList;

public class SingleAddapter extends RecyclerView.Adapter<SingleAddapter.myviewholder> {
    private ArrayList<Employee> arrayList;
    private int checkedpostion=0;

    public SingleAddapter(ArrayList<Employee> arrayList) {
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public myviewholder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view= LayoutInflater.from(parent.getContext()).inflate(R.layout.the_costume_layout2,parent,false);

        return new myviewholder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull myviewholder holder, int position) {
        holder.setBinding(arrayList.get(position));
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    class myviewholder extends RecyclerView.ViewHolder{
        TheCostumeLayout2Binding binding;
        public myviewholder(@NonNull View itemView) {
            super(itemView);
            binding=TheCostumeLayout2Binding.bind(itemView);
        }

        void setBinding(Employee employee){
            if(checkedpostion==-1){
                binding.imageplanet.setVisibility(View.GONE);
            }else{
                if(checkedpostion==getAdapterPosition()){
                    binding.imageplanet.setVisibility(View.VISIBLE);
                }else{
                    binding.imageplanet.setVisibility(View.GONE);
                }
            }
            binding.planetname.setText(employee.getName());
            itemView.setOnClickListener(v->{
                binding.imageplanet.setVisibility(View.VISIBLE);
                if(checkedpostion!=getAdapterPosition()){
                    notifyItemChanged(checkedpostion);
                    checkedpostion=getAdapterPosition();

                }
            });
        }






    }

    public Employee getselected(){
        if(checkedpostion!=-1){
            return arrayList.get(checkedpostion);
        }else{
            return null;
        }
    }
}
