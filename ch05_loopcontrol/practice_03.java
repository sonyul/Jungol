package ch05_loopcontrol;

import java.util.Scanner;

public class practice_03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

        Scanner s = new Scanner(System.in);

        int sum = 0;
        double cnt = 0;

        while (true) {
            int num = s.nextInt(); 

            if (num < 0 || num > 100) { 
                break;
            } else {
            	sum += num;
                cnt++;

            }
        }

        System.out.println("sum : " + sum);
        System.out.printf("avg : %.1f", (sum / cnt));
        
        s.close();
	}

}
