package com.hij.lib.string;
import java.util.*;

public class String1
{
	Scanner sc = new Scanner(System.in);
	String name = "hellow";
	String name2 = new String("hellow2");
	
	public void equaltest()
	{
		String st1 = "it class";
		String st2 = "it classroom";
		
		System.out.print(st1.equals(st2));
	}
	
	public void indexOfTest()
	{
		String msg = "mast da shi !";
		System.out.printf("%d\n", msg.indexOf(109));
		System.out.printf("%d\n", msg.indexOf(97));
		System.out.printf("%d\n", msg.indexOf(115));
		System.out.printf("%d\n", msg.indexOf(116));
	}
	
	public int stringleng()
	{
		String title = "West Side Story and Maple Story";
		int i, count;
		count = 0;
		String find = "W";
		
		for(i=0; i<title.length(); i++)
		{
			String s = Character.toString(title.charAt(i));
			if(find.equals(s) == true)
			{
				count = count + 1;
			}
		}
		return count;
	}
	
	public String kinddivd()
	{
		int i, index1;
		String ss = ".";
		index1 = 0;
		String file;
		System.out.printf("파일의 이름을 입력하세요(확장자까지 포함)\n");
		file = sc.next();
		for(i=0; i<file.length(); i++)
		{
			if(ss.charAt(0) == file.charAt(i))
			{
				index1 = i;
			}
		}
	return file.substring((index1)+1, (index1)+4);
	}
}







