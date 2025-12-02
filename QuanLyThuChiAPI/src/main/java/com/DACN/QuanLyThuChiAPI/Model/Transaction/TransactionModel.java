package com.DACN.QuanLyThuChiAPI.Model.Transaction;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.DACN.QuanLyThuChiAPI.Model.Card.CardModel;
import com.DACN.QuanLyThuChiAPI.Model.Category.CategoryModel;
import com.DACN.QuanLyThuChiAPI.Model.User.UserInfoModel;
import lombok.*;

import javax.persistence.*;
import java.sql.Date;

@Builder
@Data
@Entity
@Table(name = "transactions")
@AllArgsConstructor
@NoArgsConstructor
public class TransactionModel {

}
