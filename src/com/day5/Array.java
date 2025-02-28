package com.day5;

class Arr
{
	int id;
	String name;
	String city;
	public Arr(int id, String name, String city) {
		this.id=id;
		this.name=name;
		this.city=city;
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
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String toString()
	{
		return "Student [id="+id+",name="+name+",city="+city+"]";
	}
}
public class Array {
	public static void main(String[] args) {
		Arr a=new Arr(3, "Adh", "cbe");
		a.setId(1);
		a.setName("Bibin");
		a.setCity("Chn");
		Arr b=new Arr(2,"Arv","Cbe");
		Arr[] stdData= {a,b};
		for(int i=0;i<stdData.length;i++)
		{
			System.out.println(stdData[i]);
		}
	}
}
