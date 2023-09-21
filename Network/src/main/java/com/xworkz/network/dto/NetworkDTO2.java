package com.xworkz.network.dto;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class NetworkDTO2 {
	private int id;
	private String nwkName;
	private String nwkType;
	private double nwkSpeed;
	private String ipAddess;
}
