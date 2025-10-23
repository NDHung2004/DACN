package com.DACN.QuanLyThuChiAPI.Response.Login;

import com.DACN.QuanLyThuChiAPI.Model.User.UserInfoModel;
import lombok.Builder;
import lombok.Data;

@Builder
@Data
public class LoginResponse {
    private boolean status;
    private String message;

    private String accessToken;

    private Long expiresIn;

    private String refreshToken;

    private UserInfoModel userInfoModel;
}
