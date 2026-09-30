package ch02_input;

import java.util.Scanner;

public class practice_04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.printf("sum = %d", a+b+c);
        
        sc.close();
	}

}
