package com.DACN.QuanLyThuChiAPI.Interface.Card;

import com.DACN.QuanLyThuChiAPI.Model.Card.CardModel;
import com.DACN.QuanLyThuChiAPI.Model.Transaction.TransactionModel;
import com.DACN.QuanLyThuChiAPI.Request.Card.CardRequest;
import com.DACN.QuanLyThuChiAPI.Response.Api.ApiResponse;

import java.util.List;

public interface CardInterface {
    public CardModel getCard(String username, Long cardId);
    public Iterable<CardModel> getAllCard(String username);
    public ApiResponse<Object> updateCard(String username, CardRequest cardRequest, Long idCard);
    public ApiResponse<Object> addCard(String username, CardRequest cardRequest);

    public ApiResponse<Object> deleteCard(String username, Long idCard);
    public List<TransactionModel> getTransactionByCard(String username, Long idCard);
}
