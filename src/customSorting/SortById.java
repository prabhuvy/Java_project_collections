package customSorting;

import java.util.Comparator;

import dataAndOperations.Employee;

public class SortById implements Comparator<Employee>{
	public int compare(Employee x,Employee y)
	{
		return x.getId().compareTo(y.getId());
	}

}
