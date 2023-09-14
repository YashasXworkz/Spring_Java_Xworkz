package com.xworkz.aircondition.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class AirCondDto {
	private String name;
	private double price;
	private String brand;
	private String color;
}
