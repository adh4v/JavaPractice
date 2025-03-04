package com.map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Objects;

class Book
{
	private int id;
	private String bk_name;
	private String author;
	public Book()
	{
		
	}
	public Book(int id, String bk_name, String author) {
		this.id = id;
		this.bk_name = bk_name;
		this.author = author;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBk_name() {
		return bk_name;
	}
	public void setBk_name(String bk_name) {
		this.bk_name = bk_name;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public int hashCode() {
		return Objects.hash(author, bk_name, id);
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
		return Objects.equals(author, other.author) && Objects.equals(bk_name, other.bk_name) && id == other.id;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", bk_name=" + bk_name + ", author=" + author + "]";
	}
	
	
}
public class Eg4 {
	public static void main(String[] args) {
		Map<String,List<Book>> b = new HashMap<>();
		List<Book> l = new ArrayList<>();
		l.add(new Book(101,"Rdr","James"));
		l.add(new Book(102,"Tvd","Jaxx"));
		l.add(new Book(103,"Jjk","Dave"));
		b.put("Book1", l);
		List<Book> l1 = new ArrayList<>();
		l1.add(new Book(201,"Java","Jp"));
		l1.add(new Book(202,"Oops","Morgan"));
		l1.add(new Book(202,"Sql","David"));
		b.put("Book2", l1);
		List<Book> l2 = new ArrayList<>();
		l2.add(new Book(301,"Onepiece","Ajkk"));
		l2.add(new Book(302,"Solo levelling","Ashsk"));
		l2.add(new Book(302,"Bleach","Askie"));
		b.put("Book3", l2);
		Iterator<Entry<String,List<Book>>> itr = b.entrySet().iterator();
		while(itr.hasNext())
		{
			Entry<String,List<Book>> e = itr.next();
			System.out.println("Book"+ e.getKey());
			for(Book bk : e.getValue())
			{
				System.out.println(bk.getId()+" | "+bk.getBk_name()+" | "+bk.getAuthor());
			}
		}
		b.forEach((t, u) -> System.out.println(t + " "+ u));
	}
}
