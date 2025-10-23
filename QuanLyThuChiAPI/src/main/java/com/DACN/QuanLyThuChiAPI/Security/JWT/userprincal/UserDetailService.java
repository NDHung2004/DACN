package com.DACN.QuanLyThuChiAPI.Security.JWT.userprincal;

import com.DACN.QuanLyThuChiAPI.Model.User.AccountModel;
import com.DACN.QuanLyThuChiAPI.Model.User.UserInfoModel;
import com.DACN.QuanLyThuChiAPI.Repository.User.AccountRepository;
import com.DACN.QuanLyThuChiAPI.Repository.User.UserInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class UserDetailService implements UserDetailsService {

    @Autowired
    AccountRepository accountRepository;

    @Autowired
    UserInfoRepository userInfoRepository;
    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
        AccountModel accountModel = accountRepository.findAccountModelByUsername(username);
        if(accountModel == null || accountModel.getId() <= 0)
        {
            throw new UsernameNotFoundException("Không tìm thấy tài khoản" + username);
        }
        UserInfoModel userInfoModel = userInfoRepository.findUserInfoModelByAccountModel(accountModel);

        return UserPrinciple.build(userInfoModel);
    }
}
