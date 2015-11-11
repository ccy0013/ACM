/*************************************************************************
    > File Name: Main.java
    > Author: Chengyu Cui
    > Mail: ccy604080969@gmail.com 
    > Created Time: Wed Nov 11 11:42:46 2015
 ************************************************************************/

import java.util.Scanner;
import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		double sum = 0;

		Scanner sc = new Scanner(System.in);

		while(sc.hasNext()) {
			sum += sc.nextDouble(); 
		}

		sc.close();

		DecimalFormat dc = new DecimalFormat("#.##");
		System.out.println("$" + dc.format(sum/12));
	}
}
