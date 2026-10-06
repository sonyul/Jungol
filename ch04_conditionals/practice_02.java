package ch04_conditionals;

import java.util.Scanner;

public class practice_02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();

        if (a > 0) {
            System.out.print("plus");
        } else if (a == 0) {
            System.out.print("zero");
        } else {
            System.out.print("minus");
        }

        sc.close();

	}

}
