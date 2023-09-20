package com.xworkz.network.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class StudentDto {
	private String studName;
	private int[] marks;
	private int totMarks;
	private double percentage;
	private int highestMarks;
	private int lowestMarks;
}
