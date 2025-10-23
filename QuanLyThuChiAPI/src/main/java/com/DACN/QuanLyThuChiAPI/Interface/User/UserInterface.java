package com.DACN.QuanLyThuChiAPI.Interface.User;

import com.DACN.QuanLyThuChiAPI.Request.User.*;
import com.DACN.QuanLyThuChiAPI.Response.Login.LoginResponse;
import com.DACN.QuanLyThuChiAPI.Response.User.PasswordResponse;
import com.DACN.QuanLyThuChiAPI.Response.User.UserResponse;
import com.DACN.QuanLyThuChiAPI.Request.User.*;
import com.DACN.QuanLyThuChiAPI.Response.Api.ApiResponse;

public interface UserInterface {
    public UserResponse registerUser(UserRequest userRequest);

    public UserResponse getProfileUser(String username);

    public LoginResponse login(LoginRequest loginRequest);

    public ApiResponse<Object> getAllUser();

//    public LoginResponse refreshToken(String refreshToken);
    public PasswordResponse resetPassword(ResetPasswordRequest resetPasswordRequest);
    public PasswordResponse verifyCode(String codeRequest);
    public PasswordResponse forgotPass(ForgotPasswordRequest forgotPasswordRequest);

    public ApiResponse<Object> deleteAccountUser(Long id);
    public ApiResponse<Object> openAccountUser(Long id);

    public ApiResponse<Object> updateProfile(String username, UpdateProfileRequest updateProfileRequest);
}
