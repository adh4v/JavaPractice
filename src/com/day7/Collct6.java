package com.day7;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

class Student //implements Comparable<Student>
{
	private int id;
	private String name;
	private int age;
	public Student()
	{
		
	}
	public Student(int id, String name, int age)
	{
		this.id=id;
		this.name=name;
		this.age=age;
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
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}
//	@Override
//	public int compareTo(Student o) {
//		return this.id-o.id;
//	}
	
}
public class Collct6 {
	public static void main(String[] args) {
		List<Student> s = new ArrayList<>();
		s.add(new Student(2,"Adhav",21));
		s.add(new Student(1,"Abi",20));
		s.add(new Student(4,"Aki",19));
		s.add(new Student(3,"Deva",21));
		s.add(new Student(5,"Praveen",20));
		
		System.out.println("Before Sorting");
		s.forEach(std->System.out.println("ID : "+std.getId()+ "| Name : "+std.getName()+"| Age : "+std.getAge()));
		//Stream API
		System.out.println();
		List<Student> data = s.stream().sorted(Comparator.comparing(Student :: getId)).collect(Collectors.toList());
		data.forEach(std->System.out.println("ID : "+std.getId()+ "| Name : "+std.getName()+"| Age : "+std.getAge()));
		System.out.println();
		List<Student> d = s.stream().sorted(Comparator.comparing(Student :: getId).thenComparing(Student ::getName)).collect(Collectors.toList());
		d.forEach(std->System.out.println("ID : "+std.getId()+ "| Name : "+std.getName()+"| Age : "+std.getAge()));
				
	}
}
