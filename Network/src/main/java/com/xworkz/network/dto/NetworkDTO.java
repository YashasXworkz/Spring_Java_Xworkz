package com.xworkz.network.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class NetworkDTO {
	private String name;
	private String email;
	private long phoneNo;
	private String address;
	private String qualification;
}
