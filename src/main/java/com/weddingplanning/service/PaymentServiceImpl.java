package com.weddingplanning.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.weddingplanning.dao.PaymentDao;
import com.weddingplanning.entity.Payment;

@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	private PaymentDao paymentDao;

	@Override
	public Payment addPayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentDao.save(payment);
	}

}
