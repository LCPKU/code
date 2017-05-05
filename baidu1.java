package test;

import java.util.Scanner;

public class baidu1 {
     public  int judge(int num,int [] arrays)
     {
    	 int a[]=new int[3];
    	 a[0]=1000;
    	 a[1]=1000;
    	 a[2]=1000;
    	 for(int i=0;i<num;i++)
    	 {
    		 if(arrays[i]<a[0])
    		 {
    			 if(arrays[i]==a[0])
    			 {
    				 continue;
    			 }
    			 int temp1=a[0];
    			 int temp2=a[1];
    			 a[0]=arrays[i];
    			 a[1]=temp1;
    			 a[2]=temp2;			 
    		 }
    		 else if(arrays[i]>a[0]&&arrays[i]<a[1])
    		 {
    			 if(arrays[i]==a[1])
    			 {
    				 continue;
    			 }
    			 int temp=a[1];
    			 a[2]=temp;
    			 a[1]=arrays[i];
    					 
    		 }
    		 else if(arrays[i]>a[1]&&arrays[i]<a[2])
    		 {
    			 if(arrays[i]==a[2])
    			 {
    				 continue;
    			 }
    			 a[2]=arrays[i];
    		 }
    		 for(int j=0;j<3;j++)
    		 {
    			// System.out.println(a[j]);
    		 }
    	 }
    	 return a[2];
     }
     public static void main(String [] args)
     {
    	baidu1 l=new baidu1();
    	 int[] array = new int[10];
    	 int num=0;
    	 
    	 Scanner reader = new Scanner(System.in);
    	 num=reader.nextInt();
    	 for(int i=0;i<num;i++){
    	       array[i]=reader.nextInt();
    	 }
    	 int a=l.judge(num,array);
    	 System.out.println(a);
     }
}
