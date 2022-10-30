package com.example.proj1;
import java.util.Arrays;
import java.util.List;

import org.jvnet.hk2.annotations.Service;

@Service
public class Cservice implements custData {
	@Override
	
	public addcustomers getStudentById(int Customer_ID) 
	{
		return null;
	}
	@Override
	
	public List<addcustomers> getCust_name(String Customername)
	{
		return null;
	}
	@Override

	public List<addcustomers> getByemail(String email)
	{
		return null;
	}
	@Override

	public List<addcustomers> getBymobile(int mobile_no)
	{
		return null;
	}
	@Override

	public List<addcustomers> getByCity(String city)
	{
		return null;
	}
	
	
	private List<addcustomers> customerDetails() {
		return Arrays.asList(
				new addcustomers(1,"Jack","j@gg.com", 1012345,"Jaipur"), 
				new addcustomers(2,"Robin", "rob@gg.com",112345, "Delhi"),
				new addcustomers(3,"Kate","ka@gg.com", 1212345,"Goa"), 
				new addcustomers(4,"Rohan","ro@gg.com", 1312345,"Jaipur"), 
				new addcustomers(5,"Joo", "jt@gg.com",1412345, "Agra"));
			
	}
}
