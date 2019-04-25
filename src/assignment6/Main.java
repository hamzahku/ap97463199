package assignment6;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class assaignment6 {
   public static void main(String[] args) {
          Random rnd = new Random();
	  int x;
	  Scanner scan = new Scanner(System.in);
	  x=scan.nextInt();
	  int row = rnd.nextInt(x)+1;
	  ArrayListArrayList array = new ArrayListArrayList();
	  for(int i=0;irow;i++) {
		  ArrayListInteger arr = new ArrayListInteger();
		 int column = rnd.nextInt(x)+1;
		 for(int j=0;jcolumn;j++) {
			 int random = rnd.nextInt(x);
			 arr.add(random);
		 }
		 array.add(arr);
	  }
	  for(int i=0;iarray.size();i++) {
		  for(int j=0;jarray.get(i).size();j++) {
			  System.out.print(array.get(i).get(j)+ );
		  }
		  System.out.println( );
	  }
   }
}