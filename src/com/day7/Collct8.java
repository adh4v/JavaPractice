package com.day7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Employee1
{
	private int id;
	private String name;
	private int age;
	private String gender;
	private int doj;
	private int salary;
	public Employee1()
	{
		
	}
	public Employee1(int id, String name, int age, String gender, int doj, int salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.doj = doj;
		this.salary = salary;
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
	public int getDoj() {
		return doj;
	}
	public void setDoj(int doj) {
		this.doj = doj;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee1 [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", doj=" + doj
				+ ", salary=" + salary + "]";
	}
	
}

public class Collct8 {
	public static void main(String[] args) {
		List<Employee1> l = new ArrayList<>();
		l.add(new Employee1(1,"Adhav",21,"Male",2021,30000));
		l.add(new Employee1(3,"Aki",20,"Male",2020,20000));
		l.add(new Employee1(4,"Deva",21,"Male",2022,35000));
		l.add(new Employee1(4,"Deva",21,"Male",2022,35000));
		l.add(new Employee1(2,"Zoro",19,"Male",2019,40000));
		l.add(new Employee1(6,"Sora",21,"Male",2021,25000));
		l.add(new Employee1(6,"Omen",21,"Male",2019,40000));
		l.stream().filter(ls->ls.getName().contains("A")).forEach(ls->System.out.println(ls));
		System.out.println();
		l.stream().filter(ls->ls.getDoj()>2020).sorted(Comparator.comparing(Employee1 :: getId)).forEach(ls->System.out.println(ls));
		
		System.out.println();
		List<Employee1>la =l.stream().sorted(Comparator.comparing(Employee1 :: getName)).collect(Collectors.toList());
		la.forEach(ls->System.out.println("Id : "+ls.getId()+"|"+" Name : "+ls.getName()+"|"+" Age : "+ls.getAge()+"|"+" Gender : "+ls.getGender()+"|"+" Year of Joining : "+ls.getDoj()+"|"+" Salary : "+ls.getSalary()));	
		System.out.println();
		
		la.stream().collect(Collectors.toList()).forEach(ls->System.out.println(ls.getName()));
		List<String>lb=l.stream().filter(t ->t.getName().length()>10).map(t -> t.getName()).toList();
		System.out.println();
		lb.stream().distinct().forEach(ls->System.out.println(ls));
		System.out.println(la.stream().count());
		//lz.forEach(lz->System.out.println("Id : "+lz.getId()+"|"+" Name : "+lz.getName()+"|"+" Age : "+lz.getAge()+"|"+" Gender : "+lz.getGender()+"|"+" Year of Joining : "+lz.getDoj()+"|"+" Salary : "+lz.getSalary()));
		
	}
}
