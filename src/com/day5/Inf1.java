package com.day5;

interface Inf3
{
	void hello();
	void bye();
}
interface Inf4
{
	void hey();
	void tata();
}
interface Inf5
{
	void hi();
	void seeya();
}
interface Inf6 extends Inf3,Inf4,Inf5
{
	void greet();
}
class Inf7 implements Inf6,Inf5,Inf4,Inf3 {

	@Override
	public void hello() {
		System.out.println("Inf3");
		
	}

	@Override
	public void bye() {
		System.out.println("Inf4");
		
	}

	@Override
	public void hey() {
		System.out.println("Inf5");
		
	}

	@Override
	public void tata() {
		System.out.println("Inf6");
		
	}

	@Override
	public void hi() {
		System.out.println("Inf7");
	}

	@Override
	public void seeya() {
		System.out.println("Inf8");
		
	}

	@Override
	public void greet() {
		System.out.println("Inf9");
		
	}
	
}
public class Inf1
{
	public static void main(String[] args) {
		Inf7 i=new Inf7();
		i.hello();
		i.bye();
		i.hey();
		i.tata();
		i.hi();
		i.seeya();
		i.greet(); 
	}
}
