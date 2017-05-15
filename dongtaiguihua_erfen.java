package test;

import java.util.Scanner;

public class dongtaiguihua_erfen {
   public static int equalnum(int num,int[] array)
   {
	   int sum=0;
	   for(int i=0;i<num;i++)
	   {
		   array[i]=array[i];
		   sum=sum+array[i];
		   
	   }
	   int[][] v=new int[num][(sum/2)+1];
	   for(int i=0;i<num;i++)
	   {
		   for(int j=0;j<(sum/2);j++)
		   {
			   v[i][j]=0;
		   }
	   }
	   int half=(sum/2);
	   v[1][array[0]]=array[0];
	   for(int i=1;i<num;i++)
	   {
		  for(int j=array[i];j<=half;j++)
		  {
			  System.out.println(v[i-1][j-array[i]]+array[i]);
			  System.out.println(v[i-1][j]);
			  v[i][j]=Math.max(v[i-1][j-array[i]]+array[i],v[i-1][j]);
		  }
	   }
	  for(int i=0;i<num;i++)
	   {
		  for(int j=0;j<=half;j++)
		  {
			  System.out.print(v[i][j]);
		  }
		  System.out.println();
	   }
	   
	   return sum-v[num-1][half];
   }
   public static void main(String[] args) {
	   dongtaiguihua_erfen l=new dongtaiguihua_erfen();

	   Scanner reader = new Scanner(System.in);
  	   int num=reader.nextInt();
  	   int[] array=new int[num];
  	   for(int i=0;i<num;i++)
  	   {
  		 array[i]=reader.nextInt();
  	   }
	   int a=l.equalnum(num, array);
	   System.out.println(a);
	   
}
}
