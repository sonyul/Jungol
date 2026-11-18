package ch07_loopcontrol;

import java.util.Scanner;

public class practice_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int num = 1;

        for (int i = 0; i < n; i++) {

            for (int j = 0; j < 2 * i; j++) {
                System.out.print(" ");
            }

            for (int j = 0; j < n - i; j++) {
                System.out.print(num++ + " ");
            }

            System.out.println();
        }

        sc.close();

	}

}
