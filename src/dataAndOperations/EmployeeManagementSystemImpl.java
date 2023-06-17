package dataAndOperations;
import java.util.*;
import java.util.Scanner;

import customException.EmployeeNotFoundException;
import customSorting.SortByAge;
import customSorting.SortByCname;
import customSorting.SortById;
import customSorting.SortByName;

public class EmployeeManagementSystemImpl implements EmployeeManagementSystem {

	Scanner s1=new Scanner(System.in);
	Map<String,Employee> db=new LinkedHashMap<String,Employee>();

	@Override
	public void addEmployee() {
		System.out.println("Enter Emp name:");
		String name=s1.next();
		System.out.println("Enter Age");
		int age=s1.nextInt();
		System.out.println("Enter the CompanyName");
		String cname=s1.next();
		Employee e=new Employee(name,age,cname);
		db.put(e.getId(),e);
		System.out.println("Employee Details Added Sucessfully");
		System.out.println("Employee Id id:"+e.getId());
		System.out.println("-------------------");

	}

	@Override
	public void displayEmployee() {
		System.out.println("Enter Employee Id ");
		String id=s1.next();
		id=id.toUpperCase();
		System.out.println(id);
		if(db.containsKey(id))
		{
			Employee e1=db.get(id);
			System.out.println("Employee Details are as follows");
			System.out.println(e1.getName());
			System.out.println(e1.getAge());
			System.out.println(e1.getCname());
			System.out.println("------------------------");
			System.out.println(e1);
		}
		else
		{
			System.out.println("--------------------");
			try {
				String message="Employee Id:"+id+"Is not Avaliable";
				throw new EmployeeNotFoundException(message);
			}
			catch( EmployeeNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}

	}

	@Override
	public void diplayAllEmployee() {
		System.out.println("All Details");
		if(db.size()>0)
		{
			Set<String>keys=db.keySet();
			for (String string : keys) {
				System.out.println(db.get(string));

			}
		}
		else
		{
			try {
				String message="No Sufficient Record To Disply ";
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e)
			{
				System.out.println(e.getMessage());
			}

		}


	}

	@Override
	public void removeEmployee() {
		System.out.println("Enter Id to be deleted");
		String id=s1.next().toUpperCase();
		if(db.containsKey(id))
		{   System.out.println("Employee detail found");
		System.out.println(db.get(id));
		db.remove(id);
		System.out.println("Data Deleted Sucessfully");
		}
		else
		{
			try {
				String message="Employee Id :"+id+"not found";
				throw new EmployeeNotFoundException(message);
			}
			catch(EmployeeNotFoundException e)
			{
				System.out.println(e.getMessage());
			}
		}
	}

	@Override
	public void removeAll() {
		if(db.size()>0)
		{
			System.out.println("No of Employees recors:"+db.size());
			db.clear();
			System.out.println("All Data Deleted Sucessfully");
		}
		else
		{
			System.out.println("Not Deleted");
		}

	}


	public void UpdateData() {
		System.out.println("Enter the Employee Id ");
		String id=s1.next().toUpperCase();
		if(db.containsKey(id));
		{    Employee emp=db.get(id);
		System.out.println("1.updateName\n2.updateAge\n3.updateCompanyName");
		System.out.println("Enter the choice for updating ");
		int choice=s1.nextInt();
		switch(choice)
		{
		case 1:System.out.println("Enter the name:");
		emp.setName(s1.next());
		System.out.println("Name Updated sucessfully");
		break;
		case 2:System.out.println("Enter Age: ");
		emp.setAge(s1.nextInt());
		System.out.println("Age Updated Sucessfully");
		break;
		case 3:System.out.println("Enter the companyName");
		emp.setCname(s1.next());
		System.out.println("Company name Updated Sucessfully");
		break;
		//				default:System.out.println("Invalid choice");
		}
		}

		//		else
		//		{
		//			try {
		//				String message="Employee Id :"+id+"not found";
		//				throw new EmployeeNotFoundException(message);
		//			}
		//			catch(EmployeeNotFoundException e)
		//			{
		//				System.out.println(e.getMessage());
		//			}
		//		}






	}

	@Override
	public void sorttheData() {
		if(!db.isEmpty())
		{

			Set<String> keys=db.keySet();

			List<Employee> list=new ArrayList();
			for(String key:keys)
			{
				list.add(db.get(key));
			}
			System.out.println("1.SortById:/n2.SortByName/n3.SortByAge/n4SortByCname");
			System.out.println("Enter the Chpoice");
			int choice=s1.nextInt();
			switch(choice)
			{
			case 1:Collections.sort(list,new SortById());
			for (Employee employee : list) {
				System.out.println(employee);
			}
			break;
			case 2:Collections.sort(list,new SortByName());
			for(Employee e:list)
			{
				System.out.println(e);
			}
			break;
			case 3:Collections.sort(list,new SortByAge());
			for(Employee e1:list)
			{
				System.out.println(e1);
			}
			break;
			
			case 4:Collections.sort(list,new SortByCname());
			for(Employee e2:list)
			{
				System.out.println(e2);
			}
			break;
			default:try {
				String message="Not Sufficient Data for Sorting";
				throw new EmployeeNotFoundException(message);
			}
			catch( EmployeeNotFoundException e)
			{
				System.out.println(e.getMessage());
			}

			}

		}
		else
		{
			try {
				String message="Invalid Choice";
				throw new EmployeeNotFoundException(message);
			}
			catch( EmployeeNotFoundException e)
			{
				System.out.println(e.getMessage());
	
		}


	}


}
}


