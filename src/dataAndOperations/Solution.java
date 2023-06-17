package dataAndOperations;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		


	

			System.out.println("Welcome to Employee Database Project");
			System.out.println("==========================================================");
			Scanner s=new Scanner(System.in);
			EmployeeManagementSystem ems=new EmployeeManagementSystemImpl();
			while(true)
			{
			System.out.println("1.addEmployee\n2.DisplayEmployee\n3.DisplayAllEmpDetails\n4.RemoveEMP\n5.RemoveAll");
			System.out.println("6.UpdateData");
			System.out.println("Enter the Choice");
			int choice=s.nextInt();
			switch(choice)
			{
			case 1:ems.addEmployee();
			break;
			case 2:ems.displayEmployee();
			break;
			case 3:ems.diplayAllEmployee();
			break;
			case 4:ems.removeEmployee();
			break;
			case 5:ems.removeAll();
			break;
			case 6:ems.UpdateData();
			break;
			case 7:ems.sorttheData();
			break;
			
			default :System.out.println("Invalid choice");
			}
			
		}
	}
	

}
