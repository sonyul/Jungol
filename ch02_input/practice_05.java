package ch02_input;

import java.util.Scanner;

public class practice_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        
        System.out.print("yard? ");

        double yard = sc.nextDouble();
        double cm = (yard * 91.44);

        System.out.printf("%.1fyard = %.1fcm", yard, cm);

	}

}
