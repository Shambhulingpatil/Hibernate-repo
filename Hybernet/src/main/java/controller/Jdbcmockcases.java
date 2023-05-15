package controller;

import java.io.FileInputStream;
import java.util.Scanner;

import dao.Jdbcmockmethods;

public class Jdbcmockcases {

		public static void main(String[] args) throws Exception 
		{
			Jdbcmockmethods s1=new Jdbcmockmethods();
		  Scanner sc=new Scanner(System.in);
		  boolean flag=true;
		  
		  while(flag)
		  {
			System.out.println(" 1. Add\n 2.Fetch upon aadharno\n 3. Remove upon aadharno\n 4. Fetch all except seifie and address\n 5. Delete all\n 6. Exit");  
			  switch(sc.nextInt())
			  {
			  case 1:
			  {
				  System.out.println("Enter Aadhar no ");
				  Long aadharno=sc.nextLong();
				  System.out.println("Enter name");
				  String name=sc.next();
				  System.out.println("enter address");
				  String address=sc.next();
				  System.out.println("Enter selfie path ");
				  FileInputStream f1=new FileInputStream(sc.next());
				  byte[] selfie=new byte[f1.available()];
				  f1.read(selfie);
				  System.out.println("Enter mock rating :");
				  String jdbc_mock_rating=sc.next();
				  System.out.print("Enter secret key:");
				  String secret=sc.next();
				 
				s1.add(name, selfie, aadharno, address, jdbc_mock_rating);
			  }break;
			  
			  case 2:
			  {
				  System.out.print("Enter aadharno ");
				  long aadharno=sc.nextLong();
				  s1.fetch(aadharno);
				  
			  }break;
			  case 3:
			  {
				  System.out.print("Enter aadharno");
				  long aadharno=sc.nextLong();
				  s1.remove(aadharno);
			  }break;
			  case 4:
			  {
				  System.out.print("Enter aadharno");
				  long aadharno=sc.nextLong();
				  s1.fetch2(aadharno);
			  }break;
			  case 5:
			  {
				  System.out.print("Enter aadharno");
				  long aadharno=sc.nextLong();
				  s1.delete(aadharno);
			  }break;
			  case 6:
			  {
				  flag=false;
				  System.out.println("thank you...");
			  }break;
			  default:
			  {
				  System.out.println("invalid option..");
			  }break;

			  }
			 }

		}

	}


