package com.hij.lib;
import java.util.*;

public class Test1Main
{
	public static void main(String args[])
	{
		ObjectStudy1 obs1 = new ObjectStudy1();
		
		obs1.study1();
		System.out.print(obs1.ob + "\n");
		
		int a;
		a = obs1.ob.hashCode();
		System.out.print(a + "\n");
		
		System.out.printf("==============================\n");
		
		String st;
		st = obs1.toString();
		System.out.print(st + "\n");
		String st2;
		st2 = obs1.ob.toString();
		System.out.print(st2 + "\n");
		
		System.out.printf("==============================\n");
		
		Car car = new Car();
		System.out.print(car.toString() + "\n");
		System.out.printf("%s\n", car.toString());
		System.out.printf("%s\n", car);
		
		System.out.printf("==============================\n");
		
		Firecar fcar = new Firecar("fcar");
		System.out.printf("%s\n", fcar);
		System.out.printf("%S\n", fcar.toString(fcar));
		
	}//main args end
}







