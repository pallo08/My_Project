package com.flp.ems.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
 
public class Validate{
	
  private Pattern pattern;
  private Matcher matcher;
 
  private static String DATE_PATTERN = 
          "(0?[1-9]|[12][0-9]|3[01])/(0?[1-9]|1[012])/((19|20)\\d\\d)";
  
  private static String EMAIL_PATTERN = 
			"^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
			+ "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
	  
  private static String NAME_PATTERN="^[A-Z][a-zA-Z\\s]*$";
  
  private static String KIN_ID="[0-9]{5}";
  
  private static String PHONE="[0-9]{10}";
	  
   public boolean valid_Date(String date){
	 pattern = Pattern.compile(DATE_PATTERN);  
     matcher = pattern.matcher(date);

     if(matcher.matches()){
			 
	 matcher.reset();
			  
	 if(matcher.find()){
	
             String day = matcher.group(1);
	     String month = matcher.group(2);
	     int year = Integer.parseInt(matcher.group(3));
				 
	     if (day.equals("31") && 
		  (month.equals("4") || month .equals("6") || month.equals("9") ||
                  month.equals("11") || month.equals("04") || month .equals("06") ||
                  month.equals("09"))) {
			return false; // only 1,3,5,7,8,10,12 has 31 days
	     } else if (month.equals("2") || month.equals("02")) {
                  //leap year
		  if(year % 4==0){
			  if(day.equals("30") || day.equals("31")){
				  return false;
			  }else{
				  return true;
			  }
		  }else{
		         if(day.equals("29")||day.equals("30")||day.equals("31")){
				  return false;
		         }else{
				  return true;
			  }
		  }
	      }else{				 
		return true;				 
	      }
	   }else{
    	      return false;
	   }		  
     }else{
	  return false;
     }			    
   }
   
   public boolean validateName(String Name)
   {
	   pattern=Pattern.compile(NAME_PATTERN);
	   matcher=pattern.matcher(Name);
      return matcher.matches();
   }

  
		public boolean validateEmail(String email) {

			pattern = Pattern.compile(EMAIL_PATTERN);
			matcher = pattern.matcher(email);
			return matcher.matches();
		}
		
		public boolean validateKinid(String id) {

			pattern = Pattern.compile(KIN_ID);
			matcher = pattern.matcher(id);
			return matcher.matches();
		}
		
		public boolean validatephone(String ph) {

			pattern = Pattern.compile(PHONE);
			matcher = pattern.matcher(ph);
			return matcher.matches();
		}
}

