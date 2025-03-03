package com.day7;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;

class Employee implements Comparable<Employee>
{
	private int id;
	private String name;
	private int salary;
	
	public Employee()
	{
		
	}
	public Employee(int id, String name, int salary)
	{
		this.id=id;
		this.name=name;
		this.salary=salary;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getId()
	{
		return id;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	public String toString()
	{
		return "Employee[id = "+id+", name = "+name+", salary = "+salary+"]";
	}
	public int compareTo(Employee e)
	{
		return this.id-e.id;
	}
	
}
class NameComparator implements Comparator<Employee>
{

	@Override
	public int compare(Employee o1, Employee o2) {
		return o1.getName().compareTo(o2.getName());
	}
	
}
public class Collct5 {
	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		l.add(new Employee(4,"Adhav",100000));
		l.add(new Employee(1,"Abi",180000));
		l.add(new Employee(3,"Deva",110000));
		l.add(new Employee(5,"Lin",90000));
		l.add(new Employee(2,"Aki",160000));
		Iterator<Employee>itr = l.iterator();
		System.out.println("Before Sorting");
		while(itr.hasNext())
		{
			Employee e = itr.next();
			System.out.println("ID : "+e.getId() + " Name : "+ e.getName() + " Salary : "+ e.getSalary());
		}
		Collections.sort(l);
		System.out.println("After Sorting");
		for(Employee e : l)
		{
			System.out.println("ID : "+e.getId() + " Name : "+ e.getName() + " Salary : "
		+e.getSalary());
		}
		System.out.println();
		System.out.println();
		Collections.sort(l,new NameComparator());
		System.out.println("After Sorting");
		for(Employee e : l)
		{
			System.out.println("ID : "+e.getId() + " Name : "+ e.getName() + " Salary : "
		+e.getSalary());
		}
	}
}
