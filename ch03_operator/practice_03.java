package ch03_operator;

import java.util.Scanner;

public class practice_03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

        int width = a + 5;
        int length = b * 2;
        int area = width * length;

        System.out.printf("width = %d \nlength = %d \narea = %d", width, length, area);
        
        sc.close();

	}

}
