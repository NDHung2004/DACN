package com.DACN.QuanLyThuChiAPI.Interface.Category;

import com.DACN.QuanLyThuChiAPI.Model.Category.CategoryModel;
import com.DACN.QuanLyThuChiAPI.Request.Category.CategoryRequest;
import com.DACN.QuanLyThuChiAPI.Response.Api.ApiResponse;

import java.util.List;
import java.util.Map;

public interface CategoryInterface {
    public ApiResponse<Object> addCategory(String username, CategoryRequest categoryRequest);

    public ApiResponse<Object> updateCategory(String username, CategoryRequest categoryRequest, Long idCategory);
    public CategoryModel getCategory(String username, Long categoryId);
    public Iterable<CategoryModel> getAllCategory(String username);
    public List<CategoryModel> expenseCategory(String username);

    public ApiResponse<Object> deleteCategory(String username, Long categoryId);
    public List<CategoryModel> imcomeCategory(String username);
}
