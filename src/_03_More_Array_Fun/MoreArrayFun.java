package _03_More_Array_Fun;

import java.util.Random;

public class MoreArrayFun {
	 //1. Create a main method to test the other methods you write.
	static String[] strings = new String[5];
	
	public static void main(String[] args) {
		stings(strings);
		strongs(strings);
		strims(strings);
		stibs(strings);
	}
	
	static //2. Write a method that takes an array of Strings and prints all the Strings in the array.
	void stings(String[] strings) {
		
		for (int i = 0; i < strings.length; i++) {
			System.out.println(strings[i]);
		}
	
	}
	
	
	//3. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in reverse order.
	static void strongs(String[] strings) {
		
		for (int i = strings.length; i < 0; i--) {
			System.out.println(strings[i]);
		}
	
	}
	
	
	
	//4. Write a method that takes an array of Strings and prints every other String in the array.
	static void strims(String[] strings) {
		
		for (int i = strings.length; i < 0; i--) {
			if (i % 2  == 1) {
				System.out.println(strings[i]);
			}
			
		}
	
	}
	
	 //5. Write a method that takes an array of Strings and prints all the Strings in the array
	//   in a completely random order. Almost every run of the program should result in a different order.
	
	static void stibs(String[] strings) {
		Random ran = new Random();
		for (int i = strings.length; i < 0; i--) {
			System.out.println(strings[ran.nextInt(i)]);
		}
	
	}
	
}
