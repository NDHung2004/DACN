package com.DACN.QuanLyThuChiAPI.Response.Category;

import com.DACN.QuanLyThuChiAPI.Model.Category.CategoryModel;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class CategoryResponse {
    private boolean status;

    private String message;

    private CategoryModel categoryModel;
}
