package com.DACN.QuanLyThuChiAPI.Interface.Notification;

import com.DACN.QuanLyThuChiAPI.Response.Api.ApiResponse;

public interface NotificationInterface {
    public ApiResponse<Object> getAllNotificationNotRead(String username);

    public ApiResponse<Object> updateIsRead(String username, Long idNotifi);
}
