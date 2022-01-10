package com.hij.lib;

public class Car
{
	
}

class Firecar extends Car
{
	String name;
	
	public Firecar(String name)
	{
		this.name = name;
	}
	
	public String toString(Firecar a)
	{
		return name + " is a Firecar";
	}
}