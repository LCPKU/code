package test;

import java.util.Scanner;

public class wangyi3 {
	 public static int change(String Array)
	 {
		char[] array=Array.toCharArray();
		int girlindex=0;
		int boyindex=0;
		int girlcount=0;
		int boycount=0;
		for(int i=0;i<array.length;i++)
		{
			//System.out.println(array[i]);
			if(array[i]=='G')
			{
			     girlindex+=i-girlcount;
			     girlcount++;
			}
			if(array[i]=='B')
			{
			     boyindex+=i-boycount;
			     boycount++;
			}
		}
		return Math.min(boyindex, girlindex);
	 }

	 public static void main(String[] args) {
		 wangyi3 l=new wangyi3();

		   Scanner reader = new Scanner(System.in);
	  	  // int num=reader.nextInt();
	  	   String array=reader.next();

		   int a=l.change( array);
		   System.out.println(a);
		   
	}
}
