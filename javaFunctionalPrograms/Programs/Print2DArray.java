package com.bridgeit.javaFunctionalPrograms.Programs;

import java.util.Scanner;

import com.bridgeit.javaFunctionalPrograms.Utility.Utility;

public class Print2DArray {
	

	 public static void main(String[]args)
	 {
	   Scanner scanner=new Scanner(System.in);
	   System.out.print("Enter number of rows: ");
	   int rows=scanner.nextInt();
	   System.out.print("Enter number of columns: ");
	   int columns=scanner.nextInt();
		 Object []arryOfElements=new Object[rows*columns];
		   for (int i=0;i<rows*columns;i++)
		    {
		     System.out.println("Elements : ");   
		     arryOfElements[i]=scanner.next();
		       
		    }

	   Utility.print2DArray(arryOfElements,columns);
	   scanner.close();
	 }
}
