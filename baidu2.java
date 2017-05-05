package test;

import java.util.Scanner;

public class baidu2 {
	 public  int least(int num,int [] arrays)
     {
		 if(num<=1)
		 {
			 return 0;
		 }
    	
    	 int sum=0;
    	 int localmin=20000;
		 if(num<=1)
		 {
			 return sum;
		 }
    	 for(int i=1;i<num-1;i++)
    	 {
    		 sum=0;
    		 //System.out.println(i);
    		 int j=0;
    		 while(j<=num-2)
    		 {
    			 if(j+1==i)
    			 {
    				 sum=sum+Math.abs(arrays[j+2]-arrays[j]);
    				 j=j+2;
    			 }
    			 else
    			 {
    				 sum=sum+Math.abs(arrays[j+1]-arrays[j]);
    				 j++;
    			 }
    		 }
    		// System.out.println(sum);
    		 if(sum<localmin)
    		 {
    			 localmin=sum;
    		 }	 
    	 }
    	 return localmin;
     }
     public static void main(String [] args)
     {
    	 baidu2 l=new baidu2();
    	 int[] array = new int[50];
    	// int num=4;
    	 
    	 Scanner reader = new Scanner(System.in);
    	 int num=reader.nextInt();
    	 for(int i=0;i<num;i++){
    	       array[i]=reader.nextInt();
    	 }
    	 //int []array={1,4,-1,3};
    	 int a=l.least(num,array);
    	 System.out.println(a);
     }
}
