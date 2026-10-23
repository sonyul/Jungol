package ch06_loopcontrol;

import java.util.Scanner;

public class practice_09 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                System.out.printf("(%d, %d) ", i, j);
            }
            System.out.println();
        }

	}

}
