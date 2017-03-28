/**
*Author : Zoe Xu
*Date March 3rd

b. find a sum of first N odd numbers using for loop

c. print the first N number of series of Fibonacci numbe

 */

import java.util.Scanner;
public class Factorial {

	public static void main(String[] args) {
	
		int i ;
		int j = 1;
		int x = 1;
		int count = 0;
		
		Scanner sc = new Scanner(System.in);
		
		while(count < 3){
			// can enter three times 
		System.out.println("Enter a number: ");
		i = sc.nextInt();
			
					while (j<=i){
						x *= j;
						j++;
					}
			        System.out.println(x);     
			}
	    count++;	    
    
	}

	}


