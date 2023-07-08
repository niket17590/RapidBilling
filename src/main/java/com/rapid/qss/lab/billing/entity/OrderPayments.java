package com.rapid.qss.lab.billing.entity;

import java.util.Date;

import com.rapid.qss.lab.billing.common.SharedConstants.PaymentMode;

public class OrderPayments {
	private int paymentOrder;
	private Date paymentDate;
	private double paymentAmount;
	private PaymentMode paymentMode;
	private String paymentRemark;
}
