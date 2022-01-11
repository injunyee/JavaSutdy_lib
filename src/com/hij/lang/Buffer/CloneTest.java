package com.hij.lang.Buffer;

public class CloneTest
{
	public static void main(String args[])
	{
		Cts cts = new Cts();
		Object ob = new Object();
		Object ob2 = null;
		
	}
}

class Cts implements Cloneable
{
	int num1, num2, num3;
	
	public void clone1()
	{
		super.clone();
	}
}