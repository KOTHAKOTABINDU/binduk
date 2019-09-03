package com.genpact.exception;

import java.io.BufferedReader;
import java.util.Scanner;


public class PasswordExceptionApplication {
	static void validatePassword(String word) throws PasswordException {
	char passwordArray[]=word.toCharArray();
	if(passwordArray.length>=8) {
		int isDigit=0;
		int isSpl=0;
	for(char value:passwordArray) {	
		if(Character.isDigit(value)) {
			isDigit=1;
		}
	}	
	for(char value1:passwordArray) {
		if(Character.compare(value1, '*')==0 |Character.compare(value1, '!')==0|Character.compare(value1, '#')==0|Character.compare(value1, '@')==0 ) {
			isSpl=1;
		}
	}
if(isDigit==0) {
	 throw new PasswordException("Length should contain atleast 1 number");
}else if(isSpl==0) {
	throw new PasswordException("Length should spcl characters(#,@,$,!)");
}else {
	System.out.println("valid password");
}
	
	}else {
		throw new PasswordException("Length should be minimum 8 characters");
	}
	}
	public static void main(String[] args) throws PasswordException {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
System.out.println("Enter password:");
String word=sc.next();
validatePassword(word);
	}

}
