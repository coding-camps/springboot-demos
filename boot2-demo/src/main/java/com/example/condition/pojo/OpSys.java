package com.example.condition.pojo;

//import lombok.AllArgsConstructor;
//import lombok.Setter;
//import lombok.ToString;
//
//@ToString
//@Setter
//@AllArgsConstructor
public class OpSys {
    private String name;

    public OpSys() {
    }

    public OpSys(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "OS{" +
                "name='" + name + '\'' +
                '}';
    }
}
