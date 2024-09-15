package com.example.advancedconceptsinrecycleview.Model;

import java.io.Serializable;

public class Employee implements Serializable {

    private boolean ischecked=false;
    private String name;



    public Employee( String name) {
        this.name = name;
    }

    public boolean isIschecked(){
        return ischecked;
    }

    public void setIschecked(boolean ischecked){
        this.ischecked=ischecked;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
