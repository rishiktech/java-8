package com.test.sorting;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

import com.test.pojo.Employee;

public class EmployeeListObjectSorting {

	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		employees.add(new Employee(10, "Ramesh", 30, 40000.0));
		employees.add(new Employee(20, "John", 29, 35000.0));
		employees.add(new Employee(30, "Tom", 30, 45000.0));
		employees.add(new Employee(40, "Pramod", 29, 50000.0));

		List<Employee> employeesSortedList2 = employees.stream().sorted(
				Comparator.comparingDouble(Employee::getSalary).thenComparing(Comparator.comparing(Employee::getName)))
				.collect(Collectors.toList()); // ascending order
		System.out.println(employeesSortedList2);
	}

}
