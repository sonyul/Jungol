package ch06_loopcontrol;

import java.util.Scanner;

public class practice_06 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int sum = 0;
        int cnt = 0;

        int big;
        int small;

        if (a >= b) {
            big = a;
            small = b;
        } else {
            big = b;
            small = a;
        }

        for (int i = small; i <= big; i++) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
                cnt++;
            }            
        }

        double avg = (double)sum / cnt; 

        System.out.printf("sum : %d \navg : %.1f", sum, avg);

	}

}
