package com.kma.constants;

public class Messages {
	
	public static String imageSizeError = "File Size Exceed!!!";
	
	//---------------------------------Success-------------------------------------------------------
	public static String success(){
		return "Registration Sucessfull";
	}
	
	public static String paymentsuccess(){
		return "payment Sucessfully reg";
	}
	
	public static String registrationID(){
		return "Your Registration ID : ";
	}
	//------------------------------------------------------------------------------------------------
	
	
	//-------------------------Inavlid Entry Format---------------------------------------------------
	public static String invalidEmailID(){
		return "Invalid Email ID";
	}
	
	public static String invalidContactNo(){
		return "Number Should start from 7 or 8 or 9 and must be 10 digit";
	}
	
	public static String invalidDBEntry(){
		return "\n\nInvalid Entry\nRegistration not successful";
	}
	//------------------------------------------------------------------------------------------------
	
	
	
	//------------------------------Dulpicate Entry---------------------------------------------------
	public static String emailIDExist(){
		return "Email ID already exist";
	}
	
	public static String contactnoExist(){
		return "Number already exist";
	}
	//------------------------------------------------------------------------------------------------
	
	
	
	//-------------------------------Missing Data-----------------------------------------------------
	public static String noName(){
		return "Please enter your name";
	}
	
	public static String noGender(){
		return "Please select your gender";
	}
	
	public static String noDoB(){
		return "Please select your Birth Date";
	}
	
	public static String noEmailID(){
		return "Please enter your Email ID";
	}
	//--------------------------------------------------------------------------------------------------
	
}
