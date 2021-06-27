package com.tamatea.model.entity.impl.company;

import com.tamatea.model.entity.Entity;

import java.util.HashMap;

public class Company implements Entity {


    int ID;
    CompanyType companyType;
    int rating;
    String name;
    int director;
    int employees_hired;
    int employees_capacity;
    int daily_income;
    int daily_customers;
    int weekly_income;
    int weekly_customers;
    int days_old;
    HashMap<Integer, CompanyEmployee> employees;



    @Override
    public int id() {
        return ID;
    }
}
