package com.power.testcases;

import org.testng.annotations.Test;

import com.power.qa.base.TestBase;
import com.power.qa.pages.date_picker;

public class test_date_picker extends TestBase{

	//	public static void main(String[] args) {
			
		
//		
//			String expectedDate="October 17 2022";
//			String joinString = null;
//		//	String[] actualDate = null;
//			
//			String[] splitString = expectedDate.split(" ");
//			for(int i=0;i<splitString.length-2;i++) {
//				String actualDate=splitString[i]; 
//				joinString= splitString[i+1]+" "+ splitString[i]+" " + splitString[i+2];
//			//	System.out.println("splitString : " + splitString[i]);
//				System.out.println(joinString);
//			}
//			
			
		
			@Test
			public void testLikes() throws InterruptedException {
				date_picker like=new date_picker(getDriver());
				like.likesCount();
			
			}
			
//			char[] arr=expectedDate.toCharArray();
//			for(int i=0;i<arr.length;i++) {
//			if(arr.equals(" ")) {
//				
//			}
//			}	
//			if(expectedDate.equals(" ")) {
//				String s1=expectedDate.substring(0, 7);
//				System.out.println(s1+" ");
//				
//			}
//			
//		
//			
//			String s2=expectedDate.substring(8, 10);
//			System.out.println(s2+" ");
//			String s3=expectedDate.substring(11, 15);
//			System.out.println(s3);
//			
//			System.out.println("expectedDate : "+ expectedDate);
//			System.out.println(s2+" " + s1+" " + s3);
			
			
		}
		
	//}


