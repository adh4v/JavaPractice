package com.map;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

class Employee
{
	private int id;
	private String name;
	private int age;
	private String gender;
	private String dept;
	private int yoj;
	private double slary;
	public Employee()
	{
		
	}
	public Employee(int id, String name, int age, String gender, String dept, int yoj, double slary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.yoj = yoj;
		this.slary = slary;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public int getYoj() {
		return yoj;
	}
	public void setYoj(int yoj) {
		this.yoj = yoj;
	}
	public double getSlary() {
		return slary;
	}
	public void setSlary(double slary) {
		this.slary = slary;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", yoj=" + yoj + ", slary=" + slary + "]";
	}
}
public class Eg5 {
	//1.Find count of male and female employee in the org
	public static void getCountofMaleFemale(List<Employee> emp)
	{
		Map<String,Long> m = emp.stream().collect(Collectors.groupingBy(Employee :: getGender,Collectors.counting()));
		System.out.println(m);
	}
	//2.Write a program to print the name of all the departments
	public static void getDepartmentNames(List<Employee> emp)
	{
		emp.stream().map(Employee ::getDept).distinct().forEach(t -> System.out.println(t));
	}
	//3.Find the average age of male and female
	public static void getAvgAge(List<Employee> emp)
	{
		Map<String,Double> m = emp.stream().collect(Collectors.groupingBy(Employee :: getGender,Collectors.averagingDouble(Employee :: getAge)));
		System.out.println(m);
	}
	//4.Get the name of employees who joined after 2020
	public static void getYearofJoiningAfter2020(List<Employee> emp)
	{
		emp.stream().filter(t -> t.getYoj()>2020).map(Employee :: getName).forEach(t -> System.out.println(t));
	}
	//5.Count no.of emp from each dept
	public static void countNoEmpFromDept(List<Employee> emp)
	{
		Map<String,Long> m = emp.stream().collect(Collectors.groupingBy(Employee :: getDept,Collectors.counting()));
		m.forEach((t, u) ->System.out.println(t + " -> " + u));
	}
	//6.Find out the average salary of each dept
	public static void avgSalary(List<Employee> emp)
	{
		Map<String,Double> m = emp.stream().collect(Collectors.groupingBy(Employee :: getDept,Collectors.averagingDouble(Employee::getSlary)));
		m.forEach((t, u) ->System.out.println(t + " -> " + u));
	}
	//7.Find out the oldest employee's Age and Dept
	public static void oldestEmp(List<Employee> emp)
	{
		Optional<Employee> oldEmp = emp.stream().max(Comparator.comparing(Employee :: getAge));
		Employee empData = oldEmp.get();
		System.out.println("Name : "+empData.getName()+" "+" Age : "+empData.getAge()+" "+" Dept : "+empData.getDept());
	}
	//8.Find out average and total salary of the company
	public static void avgNTotalSal(List<Employee> emp)
	{
		DoubleSummaryStatistics stat = emp.stream().collect(Collectors.summarizingDouble(Employee :: getSlary));
		System.out.println("Average Salary of the Company -> "+ stat.getAverage());
		System.out.println("Total Salary of the Company -> "+ stat.getSum());
		
	}
	//9.List down the Employees from each dept
	public static void empDept(List<Employee> emp)
	{
		Map<String,List<Employee>> empList = emp.stream().collect(Collectors.groupingBy(Employee ::getDept));
		for(String k:empList.keySet())
		{
			System.out.println("Department : "+ k);
			List<Employee> em = empList.get(k);
			for(Employee e : em)
			{
				System.out.println(e);
			}
		}
	}
	//10. Find out the highest experience emp in the company
	public static void getExpEmp(List<Employee> emp)
	{
		Optional<Employee> s = emp.stream().sorted(Comparator.comparing(Employee::getYoj)).findFirst();
		Employee empData = s.get();
		System.out.println("Senior Employee of the Company");
		System.out.println("ID : "+empData.getId()+"| Name : "+empData.getName()+"| Age : "+empData.getAge());
	}
	
	public static void main(String[] args) {
		List<Employee> l = new ArrayList<>();
		l.add(new Employee(101,"Adhav",21,"Male","HR",2021,50000.0));
		l.add(new Employee(102,"Aki",28,"Male","Designer",2011,80000.0));
		l.add(new Employee(103,"Adhi",26,"Male","Dev",2017,45000.0));
		l.add(new Employee(104,"Deva",27,"Male","Analyst",2019,39000.0));
		l.add(new Employee(105,"Zoro",21,"Male","Dev",2022,28000.0));
		l.add(new Employee(106,"Vini",36,"Female","Dev",2015,70000.0));
		l.add(new Employee(107,"Sora",32,"Male","Sales",2016,60000.0));
		l.add(new Employee(108,"Rev",38,"Female","HR",2014,80000.0));
		l.add(new Employee(109,"Anisha",20,"Female","Sales",2022,24000.0));
		l.add(new Employee(110,"Prakash",21,"Male","HR",2020,43000.0));
		Eg5.getCountofMaleFemale(l);
		Eg5.getDepartmentNames(l);
		Eg5.getAvgAge(l);
		Eg5.getYearofJoiningAfter2020(l);
		Eg5.countNoEmpFromDept(l);
		Eg5.avgSalary(l);
		Eg5.oldestEmp(l);
		Eg5.avgNTotalSal(l);
		Eg5.empDept(l);
		Eg5.getExpEmp(l);
	}
}
