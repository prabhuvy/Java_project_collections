package customSorting;

import java.util.Comparator;

import dataAndOperations.Employee;

public class SortByName implements Comparator<Employee> {
	public int compare(Employee x,Employee y)
	{
		return x.getName().compareTo(y.getCname());
	}

}
