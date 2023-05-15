package controller;

import java.io.FileInputStream;
import java.util.Scanner;

import dao.AllMethods;
import dao.Tablemethod;
import dto.Table1;

public class Tablecases {
	public static void main(String[] args) throws Exception {
		Tablemethod t=new Tablemethod();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("1.Add\n2.Update Name By Id\n3.Remove by Id\n4.Fetch only video by Id\n5.Fetch all the details except video by Id\n6.Fetch Id and name of all the persons\n7.Exit");
			switch(sc.nextInt()) {
			case 1:{
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter Address");
				String address=sc.next();
				System.out.println("Enter Key");
				String key=sc.next();
				System.out.println("Enter mobile number");
				long phonenumber=sc.nextLong();
				System.out.println("Enter the path");
				String path=sc.next();
				t.add(name, address,key, phonenumber,path);
				}
			break;
			case 2:{
				System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter new name");
				String newName=sc.next();
				t.update(id, newName);
			}
			break;
            case 3:{
            	System.out.println("Enter id");
				int id=sc.nextInt();
				t.remove(id);
				
			}
			break;
            case 4:{
            	System.out.println("Enter id");
				int id=sc.nextInt();
				System.out.println("Enter new path");
				String newpath=sc.next();
				t.fetchVideo(id,newpath);
				
			}
			break;
            case 5:{
            	System.out.println("Enter id");
            	int id=sc.nextInt();
            	System.out.println("Enter key");
            	String key=sc.next();
            	t.fetch(id,key);
				
			}
			break;
            case 6:{
            	t.fetchAll();
				
			}
			break;
            case 7:{
				flag=false;
				System.out.println("Ok prends byee");
			}
			break;
			default:{
				System.out.println("Invalid option");
			}break;
			

}
}
	}
}
	
