package com.example.advancedconceptsinrecycleview.RecycleMultipleViewType;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.advancedconceptsinrecycleview.Model.Multiemail;
import com.example.advancedconceptsinrecycleview.R;

import java.util.ArrayList;

//houn lesh ma3mlna la generic type taba3 l appapter eno ykoun call viewholder?
//l2no ne7na 3am na3ml recycle view by3mel switsh been 2 view call,email
//fa ne7na subjected la na3mel 2 class viewholder extend Viewholder fa heda she by3ne eno ne7na 3am na3ml 2 viewholder wa7de lal call wa7de lal email 3ashn  heek ma fena n7ded viewholder lal call 2aw lal email la2 ne7na mn7ded bshakl 3am eno howe no3 l viewholder Recycleview.viewholder fa ne7na mn3ml bshakl 3am 3ashn ne2dar na3ml switsh ma fena n7ded wa7ad


public class MultipleTypeAddpter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private static int TYPE_CALL=1;
    private static int TYPE_EMAIL=2;
    private Context context;
    private ArrayList<Multiemail> employees;

    public MultipleTypeAddpter(Context context,ArrayList<Multiemail> employees){
        this.context=context;
        this.employees=employees;
    }

    @NonNull
    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view;
        if(viewType==TYPE_CALL){
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_call,parent,false);
            return new callViewholder(view);
        } else{
            view= LayoutInflater.from(parent.getContext()).inflate(R.layout.item_email,parent,false);
            return new emailViewHolder(view);
        }

    }

    @Override
    public int getItemViewType(int position) {
        if(TextUtils.isEmpty(employees.get(position).getEmail())){
            return TYPE_CALL;
        }else{
            return TYPE_EMAIL;
        }
    }

    @Override
    public void onBindViewHolder(@NonNull RecyclerView.ViewHolder holder, int position) {
        if(getItemViewType(position)==TYPE_CALL){
            ((callViewholder)holder).setCallDetails(employees.get(position));
        }else{
            ((emailViewHolder)holder).setEmailDetails(employees.get(position));

        }
    }

    @Override
    public int getItemCount() {
        return employees.size();
    }

    class callViewholder extends RecyclerView.ViewHolder{
        private TextView txtname;
        private TextView txtaddress;
        public callViewholder(@NonNull View itemView) {
            super(itemView);
            txtname=itemView.findViewById(R.id.txtName);
            txtaddress=itemView.findViewById(R.id.txtAddress);
        }

        void setCallDetails(Multiemail employee){
            txtname.setText(employee.getName());
            txtaddress.setText(employee.getAddress());
        }
    }

    class emailViewHolder extends RecyclerView.ViewHolder{
        private TextView txtname;
        private TextView txtaddress;

        public emailViewHolder(@NonNull View itemView) {
            super(itemView);
            txtname=itemView.findViewById(R.id.txtName);
            txtaddress=itemView.findViewById(R.id.txtAddress);
        }

        void setEmailDetails(Multiemail employee){
            txtname.setText(employee.getName());
            txtaddress.setText(employee.getAddress());
        }
    }

}
