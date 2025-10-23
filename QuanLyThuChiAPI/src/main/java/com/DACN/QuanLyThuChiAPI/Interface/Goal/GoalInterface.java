package com.DACN.QuanLyThuChiAPI.Interface.Goal;

import com.DACN.QuanLyThuChiAPI.Request.Goal.DepositRequest;
import com.DACN.QuanLyThuChiAPI.Request.Goal.GoalRequest;
import com.DACN.QuanLyThuChiAPI.Request.Goal.UpdateGoalRequest;
import com.DACN.QuanLyThuChiAPI.Response.Api.ApiResponse;

import java.text.ParseException;

public interface GoalInterface {
    public ApiResponse<Object> getAllGoals(String username);
    public ApiResponse<Object> addGoal(String username, GoalRequest goalRequest) throws ParseException;
    public ApiResponse<Object> deleteGoal(String username, Long idGoal);
    public ApiResponse<Object> updateGoal(String username, UpdateGoalRequest updateGoalRequest, Long idGoal);

    public ApiResponse<Object> updateDeposit(String username, DepositRequest depositRequest, Long idGoal);
}
