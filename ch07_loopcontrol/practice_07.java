package ch07_loopcontrol;

import java.util.Scanner;

public class practice_07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        char ch = 'A';
        int num = 0;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {

                if (j < n - i) {
                    System.out.print(ch++);
                } else {
                    System.out.print(num++);
                }

                System.out.print(" ");
            }
            System.out.println();
        }

	}

}
