package com.day8;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;
import java.util.TreeSet;

class Book1 implements Comparable<Book1>
{
	private int id;
	private String name;
	private String author;
	private int price;
	public Book1()
	{
		
	}
	public Book1(int id, String name, String author, int price) {
		this.id = id;
		this.name = name;
		this.author = author;
		this.price = price;
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
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", author=" + author + ", price=" + price + "]";
	}

	@Override
	public int hashCode() {
		return Objects.hash(author, id, name, price);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book1 other = (Book1) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name)
				&& price == other.price;
	}

	@Override
	public int compareTo(Book1 o) {
		// TODO Auto-generated method stub
		return this.id-o.id;
	}
}
class NameComparator1 implements Comparator<Book1>
{

	@Override
	public int compare(Book1 o1, Book1 o2) {
		// TODO Auto-generated method stub
		return o1.getName().compareTo(o2.getName());
	}
	
}
public class Collct12 {
	public static void main(String[] args) {
		TreeSet<Book1> h = new TreeSet<>(new NameComparator1());
		h.add(new Book1(1,"RDR","John",2000));
		h.add(new Book1(1,"RDR","John",2000));
		h.add(new Book1(2,"TVD","Alex",4000));
		h.add(new Book1(11,"GOT","Jake",3000));
		h.add(new Book1(21,"JJK","James",1500));
		h.forEach(t ->System.out.println(t.getId()+" "+t.getName()+" "+t.getAuthor()+" "+t.getPrice()));
		//h.parallelStream().filter(t -> t.getPrice()<3000).forEach(t ->System.out.println(t.getId()+" "+t.getName()+" "+t.getAuthor()+" "+t.getPrice()));
		
	}
}
