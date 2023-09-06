/*
 * Created by: Jacob Roe
 * Created On: 10/17/2022
 * 
 * Modification Log
 * Date			Programmer		Description
 * 10/17/2022	Jacob Roe		Initial Implementation
 * 
 * Description: A program to prompt the user to input 10 integers storing them in an array and using the Array in different ways
 */
package manipulation;


import java.util.Arrays;
import java.util.Scanner;


public class ArrayStuff {

	public static void main(String[] args) {
		
		//Create scanner object
		Scanner keyboard = new Scanner(System.in);
		
		//Create the Array and set its size
		int[] num = new int[10];
		
		//For loop to prompt the user to enter 10 Integers
		for(int i = 0; i <num.length; i++) {
			
			//Prompt user for an integer input
			System.out.println("Please Enter an integer: ");
			
			//Set the Array index as the inputed integer
			num[i] = keyboard.nextInt();
			
		}
		
		sortAscending(num);
		
		integers(num);
		
		reverse(num);
		
		sum(num);
		
		lessThan12(num);
		
		aboveAverage(num);
		
	}
		//Method to sort the Array in ascending order
		public static void sortAscending(int[] num) {
			Arrays.sort(num);// Sort the array
		}
			
		//Method to display the integers
		public static void integers(int[] num) {
				
			System.out.println("Array displayed in ascending order: " + Arrays.toString(num));
			
		}
			
			//Method to display all the integers in reverse order
			public static void reverse(int[] num) {
				
				//Display for symmetry
				System.out.print("Array displayed in reverse order: [");
				
				//for loop that reads and displays the array in reverse order
				for (int i = num.length-1; i >= 0; i--) {  
					
					System.out.print(num[i] + ", ");
					
		        }
				
				//Display for symmetry
				System.out.println("]");
			}
			
			//Method to display the sum of the Integers
			public static int sum(int[] num) {
				
				//for loop to execute the calculation within the array
				//int sum = 0;
				//for( int value: num) {
					//sum += value;
				//}
				
				//Use Stream API to get the sum of the integers within the array
				int sum = Arrays.stream(num).sum();
				System.out.println("Sum of integers within the array: " + sum);
				return sum;
			}
			
			//Method to display all values less than 12 or a message if none are less than 12
			public static void lessThan12(int[] num) {
				//Create counter variable
				int counter = 10;
				//Display context
				System.out.println("Integers that are below 12: ");
				
				//For loop to check the whole array
				for(int i = 0; i < num.length; i++) {
					
					//if loop to check each array index to see if it is smaller than 12
					if(num[i] < 12) {
						
						//Print the integer contained within the index
						System.out.println(num[i]);
						
					}
					else {
						
						//Decrease the counter variable
						counter = counter - 1;
					}
			
				}
				
				//if then statement to check the counter variable to see if any variables were less than 12
				if (counter == 0) {
					
					//Print that there are no integers less than 12
					System.out.println("No integers in the array are less than 12");
					
				}
					
			}
			
			//Method to display all values that are higher than the calculated average value
			public static void aboveAverage(int[] num) {
				
				//Calculate the average of the array integers
				double average = Arrays.stream(num).average().orElse(Double.NaN);
				
				//Display context
				System.out.println("Integers that are above average: ");
				
				//For loop to check the whole array
				for(int i = 0; i < num.length; i++) {
					
					//if loop to check each array index to see if it is larger than the average
					if(num[i] > average) {
						
						//Print the integer contained within the index
						System.out.println(num[i]);
						
					}
					
				}
				
			}
			
}
