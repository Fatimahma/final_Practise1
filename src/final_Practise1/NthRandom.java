package final_Practise1;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class NthRandom {
	
	public int[] random() {
		Random rnd = new Random();
		int random[] = new int[500];
		for (int i = 0; i < 500; i++) {
			random[i] = rnd.nextInt(999);
		}
		return random;

	}

	public int readUserInput() {
		int userNumber = 0;
		System.out.println("enter a number smaller than 500");
		Scanner sc = new Scanner(System.in);
		userNumber = sc.nextInt();
		return userNumber;
	}

	public int nthNumber(int nthnumber, int[] randomNumber) {
		Arrays.sort(randomNumber);

		return randomNumber[nthnumber - 1];
	}

	public static void main(String[] args) {

		NthRandom rthrnd = new NthRandom();
		int rnd[] = rthrnd.random();
		int nth = rthrnd.readUserInput();
		if (nth > 500) {
			System.out.println("wrong number which is bigger than 500");
		} else {
			int result = rthrnd.nthNumber(nth, rnd);
			System.out.println("the " + nth + "th smallest number is " + result);
		}
	}

}
