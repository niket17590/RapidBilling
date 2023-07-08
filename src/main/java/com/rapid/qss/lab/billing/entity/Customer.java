package com.rapid.qss.lab.billing.entity;

import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder(setterPrefix = "set")
@Document("customer")
public class Customer {

	private String name;
	private String city;
	private String mobile;
	private String ownerName;

}

