package ch03_operator;

import java.util.Scanner;

public class practice_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        System.out.printf("%d %d \n", ++a, b--);
        System.out.printf("%d %d", a, b);

        sc.close();

	}

}
