/*************************************************************************
    > File Name: Main.java
    > Author: Chengyu Cui
    > Mail: ccy604080969@gmail.com 
    > Created Time: Wed Nov 11 11:59:08 2015
 ************************************************************************/

import java.util.Scanner;
import java.math.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num = sc.nextInt();

		int[] result = new int[num];
		int N = 0;

		while(sc.hasNext()) {
			float x = sc.nextFloat();
			float y = sc.nextFloat();

			int year = 0;

			float area = 0;

			while( x*x + y*y > area/Math.PI ) {
				area += 100;
				year++;
			}
			result[N++] = year;			
		}

		sc.close();

		for(int i=0; i<num; i++) {
			System.out.println("Property " + (i+1) + ": This property will begin eroding in year " + result[i] + '.');
		}
		System.out.println("END OF OUTPUT.");
	}
}
