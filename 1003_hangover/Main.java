/*************************************************************************
    > File Name: Main.java
    > Author: Chengyu Cui
    > Mail: ccy604080969@gmail.com 
    > Created Time: Wed Nov 11 01:37:43 2015
 ************************************************************************/

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Iterator;
//import java.text.DecimalFormat;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<Integer> list = new ArrayList<Integer>();

		//DecimalFormat df = new DecimalFormat("#.##");

		while(sc.hasNextFloat()) {
			float num = sc.nextFloat();

			if(num==0.0f)
				break;

			float sum = 0;

			int cardNum = 0, i = 2;
			while(sum<num) {
				sum += 1/(float)i++;
				cardNum++;
			}

			list.add(cardNum);
		}

		Iterator<Integer> itr = list.iterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.next() + " card(s)");
		}
	}
}

