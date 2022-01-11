package com.hij.lang.Buffer;
import java.util.*;

public class BufferMain
{
	public static void main(String args[])
	{
		String str = new String("korea");
		Date date = new Date();
		
		System.out.printf("%s\n", str.toString());
		System.out.printf("%s\n", date.toString());
		
		System.out.printf("========================================\n");
		
		System.out.printf("%s\n", System.identityHashCode(str));
		System.out.printf("%s\n", System.identityHashCode(date));
		
		System.out.printf("========================================\n");
		
		int arr[] = new int[10];
		System.out.printf("%s\n", arr.toString());
		System.out.printf("%s\n", System.identityHashCode(arr));
	}// main args end
}