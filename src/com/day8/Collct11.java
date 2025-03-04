package com.day8;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Objects;

class Book
{
	private int id;
	private String name;
	private String author;
	private int price;
	public Book()
	{
		
	}
	
	public Book(int id, String name, String author, int price) {
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
		Book other = (Book) obj;
		return Objects.equals(author, other.author) && id == other.id && Objects.equals(name, other.name)
				&& price == other.price;
	}
}
public class Collct11 {
	public static void main(String[] args) {
		HashSet<Book> hs = new HashSet<>();
		hs.add(new Book(1,"RDR","John",2000));
		//hs.add(new Book(2,"TVD","Alex",4000));
		hs.add(new Book(1,"RDR","John",2000));
		hs.add(new Book(2,"TVD","Alex",4000));
		hs.add(new Book(11,"GOT","Jake",3000));
		hs.add(new Book(21,"JJK","James",1500));
		hs.forEach(t ->System.out.println(t.getId()+" "+t.getName()+" "+t.getAuthor()+" "+t.getPrice()));
		hs.parallelStream().filter(t -> t.getPrice()<3000).forEach(t ->System.out.println(t.getId()+" "+t.getName()+" "+t.getAuthor()+" "+t.getPrice()));
		
	}
}
