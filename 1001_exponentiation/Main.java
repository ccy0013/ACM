/*************************************************************************
    > File Name: Main.java
    > Author: Chengyu Cui
    > Mail: ccy604080969@gmail.com 
    > Created Time: Wed Nov 11 02:02:07 2015
 ************************************************************************/

import java.util.Scanner;
import java.util.ArrayList;
import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		ArrayList<String> resultList = new ArrayList<String>();
		//int count=0;

		while(sc.hasNext()) {
			//count++;
			BigDecimal num = new BigDecimal(sc.next());

			int exp = sc.nextInt();

			String s = num.pow(exp).toPlainString();

			//Trim leading and trailing 0s
			int start = 0, end = s.length()-1;
			for(int i=0; i<s.length(); i++) {
				if(s.charAt(i)!='0') {
					start = i;
					break;
				}
			}

			for(int i=s.length()-1; i>=0; i--) {
				if(s.charAt(i)!='0') {
					end = i;
					break;
				}
			}

			s = s.charAt(end)=='.' ? s.substring(start, end) : s.substring(start, end+1);

			resultList.add(s);

			// if(count==6)
			// 	break;
		}

		for(int i=0; i<resultList.size(); i++) {
			System.out.println(resultList.get(i));
		}
	}
}
