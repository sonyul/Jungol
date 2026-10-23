package ch06_loopcontrol;

import java.util.Scanner;

public class practice_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int N = sc.nextInt();
        int sum = 0;

        for (int i = 1; 5*i <= N; i++) {
            sum += 5*i;
        }

        System.out.print(sum);

	}

}
