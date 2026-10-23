package ch06_loopcontrol;

import java.util.Scanner;

public class practice_05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int even_cnt = 0;
        int odd_cnt = 0;

        for (int i = 0; i < 10; i++) {
            int n = sc.nextInt();
            if (n % 2 == 0) {
                even_cnt++;
            } else {
                odd_cnt++;
            }
        }

        System.out.printf("even : %d \nodd : %d", even_cnt, odd_cnt);

	}

}
