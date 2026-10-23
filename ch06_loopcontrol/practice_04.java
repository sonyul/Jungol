package ch06_loopcontrol;

import java.util.Scanner;

public class practice_04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int cnt = sc.nextInt();
        int sum = 0;

        for (int i = 1; i <= cnt; i++) {
            int N = sc.nextInt();
            sum += N;
        }

        double avg = (double)sum / cnt ;

        System.out.printf("%.2f", avg);

	}

}
