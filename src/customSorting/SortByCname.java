package customSorting;

import java.util.Comparator;

import dataAndOperations.Employee;

public class SortByCname implements Comparator<Employee> {
public int compare(Employee x,Employee y)
{
	return x.getCname().compareTo(y.getCname());
}
}
