package com.example.proj1;
import java.util.List;
import com.example.proj1.addcustomers;
public interface custData {
	
	addcustomers getStudentById(int Customer_ID) ;
	
	List<addcustomers> getCust_name(String Customername);
	List<addcustomers> getByemail(String email);
	List<addcustomers> getBymobile(int mobile_no);
	List<addcustomers> getByCity(String city);
	List<addcustomers> getAll();

}