package test;

import java.util.Arrays;


public class baidu4 {
	public static int count(int[] array)
	{
		int counta=0;
		int[] copy=new int[array.length]; 
		for(int i=0;i<array.length;i++)
		{
			copy[i]=array[i];
		}
		for(int i=0;i<array.length;i++)
		{
			System.out.println(copy[i]);
		}
		Arrays.sort(array);
		for(int i=0;i<array.length;i++)
		{
			System.out.println(array[i]);
		}
		for(int i=0;i<array.length;i++)
		{
			if(copy[counta]==array[i])
			{
				counta++;
				if(counta==array.length)
				{
					break;
				}
			}
		}
		return array.length-counta;
	}
	public  int[] quicksort(int [] array,int start,int end)
	{
		if(start<end)
		{
			int middle=getmiddle(array,start,end);
			quicksort(array,start,middle-1);
			quicksort(array,middle+1,end);
		}
		return array;
	}
	public  int getmiddle(int [] array,int start,int end)
	{
            //int temp;
            int base=array[start];
            while(start<end)
            {
            	while(start<end&&array[end]>base)
            	{
            		end--;
            	}
            	array[start]=array[end];
            	while(start<end&&array[start]<base)
            	{
            		start++;
            	}
            	array[end]=array[start];	
            }
            array[start]=base;
            return start;        
	}
	public  int[] guibing(int [] array,int low,int high)
	{
		int mid=(low+high)/2;
		if(low<high)
		{
			guibing(array,low,mid);
			guibing(array,mid+1,high);
			merge(array,low,mid,high);
		}
		return array;
	}
	public  void merge(int [] array,int low,int mid,int high)
	{
        int[] temp= new int[high-low+1];
        int i=low;
        int j=mid+1;
        int k=0;
         while( i<=mid&&j<=high)
         {
        	 if(array[i]<array[j])
        	 {
        		 temp[k++]=array[i++];
        	 }
        	 else
        	 {
        		 temp[k++]=array[j++];
        	 }
         }
         while(i<=mid)
         {
        	 temp[k++]=array[i++];
         }
         while(j<=high)
         {
        	 temp[k++]=array[j++];
         }
         for(int w=0;w<temp.length;w++)
         {
        	 array[w+low]=temp[w];
         }
	}
	public static void main(String[] args) {
		int[] array={19,7,8,25};
		baidu4 l=new baidu4();
		/*int[] b=l.quicksort(array, 0, array.length-1);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(b[i]);
		}
		System.out.println();
		int[] c=l.guibing(array, 0, array.length-1);
		for(int i=0;i<b.length;i++)
		{
			System.out.print(c[i]);
		}*/
		System.out.println();
		int a=l.count(array);
		System.out.println(a);
		
	}
}
