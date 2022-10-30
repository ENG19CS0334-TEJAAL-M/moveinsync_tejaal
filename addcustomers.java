package com.example.proj1;


	import lombok.AllArgsConstructor;
	import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

	@Getter
	@Setter
	@AllArgsConstructor
	@NoArgsConstructor
	@Data
	@ToString
	public class addcustomers {
		private Integer  Customer_ID;
		private String Customername;
		private String email;
		private Integer mobile_no;
		private String city;
		

	}

