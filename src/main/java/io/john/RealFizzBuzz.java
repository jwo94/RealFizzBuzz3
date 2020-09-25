package io.john;

public class RealFizzBuzz {

	public static void computeFizzBuzz(int max) {
		/* array to keep track of fizzbuzz counts
		   0 = fizz, 1 = buzz, 2 = fizzbuzz, 3 = lucky, 4 = integer */
		int fizzbuzzCount[] = new int[5];
		
		for (int num = 1; num <= max; num++) {
			
			// place a space between numbers
			if (num != 1) {
				System.out.print(" ");
			}

			// convert number to string to check if it contains '3'
			boolean contains3 = (String.valueOf(num).indexOf('3') > -1);
			
			boolean divisibleBy3 = (num % 3 == 0);
			boolean divisibleBy5 = (num % 5 == 0);

			if (contains3) {
				System.out.print("lucky");
				fizzbuzzCount[3]++;
			} else if (divisibleBy3 && divisibleBy5) {
				System.out.print("fizzbuzz");
				fizzbuzzCount[2]++;
			} else if (divisibleBy3) {
				System.out.print("fizz");
				fizzbuzzCount[0]++;
			} else if (divisibleBy5) {
				System.out.print("buzz");
				fizzbuzzCount[1]++;
			} else {
				System.out.print(num);
				fizzbuzzCount[4]++;
			}
			
			//end with linebreak
			if (num == max) {
				System.out.println();
			}
		}
		
		System.out.println("fizz: " + fizzbuzzCount[0]);
		System.out.println("buzz: " + fizzbuzzCount[1]);
		System.out.println("fizzbuzz: " + fizzbuzzCount[2]);
		System.out.println("lucky: " + fizzbuzzCount[3]);
		System.out.println("integer: " + fizzbuzzCount[4]);
	}
}