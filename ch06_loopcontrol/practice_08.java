package ch06_loopcontrol;

import java.util.Scanner;

public class practice_08 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

		int column = sc.nextInt();
        int row = sc.nextInt();

        for (int i = 1; i <= column; i++) { 
            for (int j = 1; j <= row; j++) {
                System.out.print(j*i + " ");
            }
            System.out.println();
        }

	}

}
