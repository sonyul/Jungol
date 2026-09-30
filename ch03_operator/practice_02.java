package ch03_operator;

import java.util.Scanner;

public class practice_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int quot = a / b;
        int rem = a % b;

        System.out.printf("%d / %d = %d...%d", a, b, quot, rem);
        
        sc.close();

	}

}
