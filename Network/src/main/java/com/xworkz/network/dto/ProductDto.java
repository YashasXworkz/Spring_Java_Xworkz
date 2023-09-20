package com.xworkz.network.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductDto {
	private String prodName;
	private int ratings;
	private int prodPrice;
	private int quantity;
	private String reviews;
	private int totalPrice;
}
