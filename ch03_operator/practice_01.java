package ch03_operator;

import java.util.Scanner;

public class practice_01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        int sum = a + b + c + d;
        double avg = sum/4;

        System.out.printf("sum %d \n", sum);
        System.out.printf("avg %.0f", avg);
        
        sc.close();

	}

}
