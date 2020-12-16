package SecurePay.securepay;

import java.util.Arrays;

import org.fluttercode.datafactory.ContentDataValues;
import org.fluttercode.datafactory.impl.DataFactory;
import org.fluttercode.datafactory.impl.DefaultContentDataValues;
import org.junit.Test;

public class TestData  {
	
	
	
				public String FirstName() {
					
						DataFactory data = new DataFactory();
						String name = data.getFirstName();
						return name;
					}
			
				
				public String LastName() {
					
					DataFactory data = new DataFactory();
					String Lname = data.getLastName();
					return Lname;
				}
				
				
				public String WorkEmail() {
					
					DataFactory data = new DataFactory();
					String email = data.getEmailAddress();
					return email;
				}
				
				public String PhoneNum() {
					
					DataFactory data = new DataFactory();
					int Pnum = data.getNumberUpTo(50000000);
					String phnum = Integer.toString(Pnum);
					return phnum;
				}
				
				
				public  String CompanyName() {
					
					DataFactory data = new DataFactory();
					String Bname = data.getBusinessName();
					return Bname;
				}
				
				public String WebUrl() {
				
					DataFactory data = new DataFactory();
					data.setNameDataValues(new TestDataWeb());
			
					
				/*	for (int i=0; i<3; i++) {
						
						System.out.println(data.getName().replaceAll(" ",""));
					}
				*/	
					return data.getName().replaceAll(" ","");
				}
				
			
	
	
	

}
