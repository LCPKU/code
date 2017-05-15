package test;

import java.util.List;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class wangyi4 {
	public static int[] deleterepeat(int num,int[] array)
	{
		int j=0;
		List<Integer> list=new ArrayList<Integer>();
		for(int i=num-1;i>=0;i--)
		{
			if(!list.contains(array[i]))
			{
				list.add(j, array[i]);
				j++;
			}
		}
		int[] a=new int[j];
		int i=0;
		for(int w=list.size()-1;w>=0;w--)
		{
			a[i]=list.get(w);
			i++;
		}
		return a;
		
	}
	
	public static void main(String[] args) {
		wangyi4 l=new wangyi4();

		   Scanner reader = new Scanner(System.in);
	  	   int num=reader.nextInt();
	  	   int[] array=new int[num];
	  	   for(int i=0;i<num;i++)
	  	   {
	  		 array[i]=reader.nextInt();
	  	   }
		   int[] a=l.deleterepeat(num, array);
	  	   for(int i=0;i<a.length;i++)
	  	   {
	  		 System.out.print(a[i]);	
	  		System.out.print(" ");
	  	   }   
	}

}
