package org.example;

import java.util.ArrayList;
import java.util.List;

public class Employee {
    private Integer id;
    private Long phoneNumber;
    private String name;
    private Integer experience;

    public Employee(Integer id,Long phoneNumber,String name,Integer experience){
        this.id = id;
        this.phoneNumber = phoneNumber;
        this.name = name;
        this.experience = experience;
    }
    public Integer getId() {
        return id;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public String getName() {
        return name;
    }

    public Integer getExperience() {
        return experience;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "personnelNumber=" + id +
                ", phoneNumber=" + phoneNumber +
                ", name='" + name + '\'' +
                ", experience=" + experience +
                '}';
    }

}
