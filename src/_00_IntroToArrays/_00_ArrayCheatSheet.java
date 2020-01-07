package _00_IntroToArrays;

import java.util.Random;

public class _00_ArrayCheatSheet {
	public static void main(String[] args) {
		//1. make an array of 5 Strings
            String[] names = {"bobbethan","agatha","gillbert","fred","abcde"};
		//2. print the third element in the array
      	System.out.println(names[2]);
		//3. set the third element to a different value
		names[2] = "franed";
		//4. print the third element again
		System.out.println(names[2]);
		//5. use a for loop to set all the elements in the array to a string of your choice
		for (int i = 0; i < names.length; i++) {
			names[i]=" Agatha ";
		}
		//6. use a for loop to print all the values in the array
		//   BE SURE TO USE THE ARRAY'S length VARIABLE
		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i]);
		}
		//7. make an array of 50 integers
			int[] places = new int[50];
		//8. use a for loop to make every value of the integer array a random number
			Random jop  = new Random();
			
for (int i = 0; i < places.length; i++) {
	places[i] = jop.nextInt(50)+1;
	//System.out.println(places[i]);
}
System.out.println(  );
System.out.println(  );
System.out.println(  );
System.out.println(  );
		//9. without printing the entire array, print only the smallest number on the array

int smll = places[0];
for (int i = 0; i < places.length; i++) {
if (smll > places[i]) {
	smll = places[i];

}

}
System.out.println(smll);
System.out.println( );
System.out.println( );
System.out.println( );
System.out.println( );
		//10 print the entire array to see if step 8 was correct
for (int i = 0; i < places.length; i++) {
	System.out.println(places[i]);
}
		//11. print the largest number in the array.
System.out.println( );
System.out.println( );
System.out.println( );

int lrg = places[0];
for (int i = 0; i < places.length; i++) {
if (lrg < places[i]) {
	lrg = places[i];

}

}
System.out.println(lrg);
		//12. print only the last element in the array
System.out.println( );
System.out.println( );
System.out.println( );

		System.out.println(places[places.length-1]);
	}
}
