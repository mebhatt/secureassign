package SecurePay.securepay;

import org.fluttercode.datafactory.ContentDataValues;
import org.fluttercode.datafactory.NameDataValues;
import org.fluttercode.datafactory.impl.DefaultContentDataValues;
import org.fluttercode.datafactory.impl.DefaultNameDataValues;
import org.junit.Test;

public class TestDataWeb implements NameDataValues{
	
	
		String[] LastNames = {".com",".live.in",".gov.au",".com.au" };
		
		
		
		NameDataValues Url = new DefaultNameDataValues();

		
			
		
		
		

		

		
		


		
		public String[] getFirstNames() {
			// TODO Auto-generated method stub
			return Url.getFirstNames();
		}



	
		public String[] getLastNames() {
			// TODO Auto-generated method stub
			return LastNames;
			
		}



	
		public String[] getPrefixes() {
			// TODO Auto-generated method stub
			return Url.getPrefixes();
		}




		
		public String[] getSuffixes() {
			// TODO Auto-generated method stub
			return Url.getSuffixes();
		}
		
		
}
