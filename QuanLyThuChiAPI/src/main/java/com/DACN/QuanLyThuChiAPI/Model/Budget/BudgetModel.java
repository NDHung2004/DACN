package com.DACN.QuanLyThuChiAPI.Model.Budget;


import com.DACN.QuanLyThuChiAPI.Model.Category.CategoryModel;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.DACN.QuanLyThuChiAPI.Model.User.UserInfoModel;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Builder
@Data
@Entity
@Table(name = "budgets")
@NoArgsConstructor
@AllArgsConstructor

public class BudgetModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "user_id")
    @JsonIgnore
    private UserInfoModel userInfoModel;

    @ManyToOne(fetch =FetchType.EAGER)
    @JoinColumn(name = "category_id")
    private CategoryModel categoryModel;

    @NonNull
    @Column(name = "amount")
    private Long amount;

    @NonNull
    @Column(name = "fromdate")
    private Date fromdate;

    @NonNull
    @Column(name = "todate")
    private Date todate;

    @NonNull
    @Column(name = "description")
    private String description;
}
