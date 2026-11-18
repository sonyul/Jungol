package ch07_loopcontrol;

import java.util.Scanner;

public class practice_01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int sum = 0;
        int count = 0;

        for (int i = 0; i < 20; i++) {
            int num = sc.nextInt();

            if (num == 0) {
                break;
            }

            sum += num;
            count++;
        }

        System.out.print(sum + " " + sum / count);

	}

}
