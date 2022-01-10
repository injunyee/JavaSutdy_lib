package com.hij.lib.string;

public class StringMain
{
	public static void main(String args[])
	{
		String1 st = new String1();
		System.out.printf("%s\n", st.name);
		
		System.out.printf("===================================\n");
		
		int i;
		for(i=0; i<st.name.length(); i++)
		{
			System.out.printf("%c\n", st.name.charAt(i));
		}
		
		System.out.printf("===================================\n");
		
		st.indexOfTest();
		
		System.out.printf("===================================\n");
		
		int arr[] = new int[20];
		System.out.printf("%d\n", arr.length);
		
		System.out.printf("===================================\n");
		
		System.out.printf("%d\n", st.stringleng());
		
		System.out.printf("===================================\n");
		
		System.out.printf("확장자 나누기");
		String kind;
		kind = st.kinddivd();
		if(kind.equals("jpg") || kind.equals("gif") || kind.endsWith("png"))
		{
			System.out.printf("이미지 파일\n");
		}
		else
		{
			System.out.printf("확장자 알 수 없음\n");
		}
	}//main args end
}//StringMain end
