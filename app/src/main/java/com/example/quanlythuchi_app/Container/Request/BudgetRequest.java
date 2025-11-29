package com.example.quanlythuchi_app.Container.Request;

import com.example.quanlythuchi_app.Model.CategoryModel;

public class BudgetRequest {

    private Long amount;

    private String description;



    public BudgetRequest( Long amount, String description) {
        this.amount = amount;

        this.description = description;
    }
}
