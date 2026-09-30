package ch03_operator;

import java.util.Scanner;

public class practice_05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);

        int m_height = sc.nextInt();
        int m_weight = sc.nextInt();

        int g_height = sc.nextInt();
        int g_weight = sc.nextInt();

        if (m_height > g_height && m_weight > g_weight) {
            System.out.println("1");
        } else {
            System.out.println(0);
        }

        sc.close();

	}

}
