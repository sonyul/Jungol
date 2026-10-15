package ch05_loopcontrol;

import java.util.Scanner;

public class practice_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);

        int num = s.nextInt();
        int i = 1;

        while (i <= num) {

            System.out.print(i + " ");

            i++;

        }
		
	}
}
