package ch07_loopcontrol;

import java.util.Scanner;

public class practice_02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i*n < 100; i++) {
            if (i*n % 10 ==0) {
                System.out.print(i*n + " ");
                break;
            }
            System.out.print(i*n + " ");
        }

	}

}
