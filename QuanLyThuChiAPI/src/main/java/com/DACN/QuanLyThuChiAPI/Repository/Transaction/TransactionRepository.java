package com.DACN.QuanLyThuChiAPI.Repository.Transaction;

import com.DACN.QuanLyThuChiAPI.Model.Transaction.TransactionModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.Date;
import java.util.List;

@Repository
public interface TransactionRepository extends JpaRepository<TransactionModel, Long> {


}
