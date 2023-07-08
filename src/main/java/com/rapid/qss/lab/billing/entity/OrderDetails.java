package com.rapid.qss.lab.billing.entity;

import java.util.Date;
import java.util.List;

import org.springframework.format.annotation.DateTimeFormat;

import com.rapid.qss.lab.billing.common.SharedConstants.OrderStatus;
import com.rapid.qss.lab.billing.common.SharedConstants.PadType;
import com.rapid.qss.lab.billing.common.SharedConstants.PaymentStatus;

public class OrderDetails {

	private String orderId;

	private Customer customer;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date orderDate;

	@DateTimeFormat(pattern = "dd/MM/yyyy")
	private Date modifiedDate;

	private String remark1;

	private String remark2;

	private double totalAmount;

	private double remainingAmount;

	private PaymentStatus paymentStatus;

	private OrderStatus orderStatus;

	private List<OrderPayments> orderPaymentsList;

	private PadType padType;
}
