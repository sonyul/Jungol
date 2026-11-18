package ch07_loopcontrol;

import java.util.Scanner;

public class practice_10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int k = 1;

        for ( int i = 0; i < n; i++ ) {
            for ( int j = 1; j <= n; j++ ) {
                if ( k % 2 == 1 ) {
                    System.out.print(k + " ");
                    k += 2;
                }

                if ( k > 10) {
                    k = k / 10;
                }
            }
            System.out.println();
        }
		
	}

}
