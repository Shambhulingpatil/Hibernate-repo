package controller;

import java.util.Scanner;

import dao.AllMethods;

public class SwitchCase {
	public static void main(String[] args) {
		AllMethods a=new AllMethods();
		Scanner sc=new Scanner(System.in);
		boolean flag=true;
		while(flag) {
			System.out.println("1.Add\n2.Update\n3.Fetch\n4.Remove\n5.Exit");
			switch(sc.nextInt()) {
			case 1:{
				System.out.println("Enter name");
				String name=sc.next();
				System.out.println("Enter Address");
				String address=sc.next();
				System.out.println("Enter number");
				long number=sc.nextLong();
				a.add(name, address, number);
			}break;
			
			case 2:{
				System.out.println("Enter Id");
				int id=sc.nextInt();
				System.out.println("Enter new name");
				String newName=sc.next();
				a.update(id, newName);
			}break;
			case 3:{
				System.out.println("Enter id");
				int id=sc.nextInt();
				a.fetch(id);
			}break;
			
			case 4:{
				System.out.println("Enter id");
				int id=sc.nextInt();
				a.remove(id);
			}break;
			
			case 5:{
				flag=false;
				System.out.println("Ok prends byeee");
			}break;
			
			default:{
				System.out.println("Invalid option");
			}
			}
		}
	}

}
