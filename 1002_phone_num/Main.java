/*************************************************************************
    > File Name: Main.java
    > Author: Chengyu Cui
    > Mail: ccy604080969@gmail.com 
    > Created Time: Tue Nov 10 01:12:43 2015
 ************************************************************************/

import java.util.Scanner;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;

public class Main {
	public static void main(String[] args) {

		boolean flag = true;
		Scanner sc = new Scanner(System.in);
		HashMap<String, Integer>  map = new HashMap<String, Integer>();
		HashMap<Character, Character> keyboard = new HashMap<Character, Character>();

		for(int i=0; i<25; i++) {
			if(i=='Q'-'A')
				continue;
			else if(i<'Q'-'A')
				keyboard.put((char)('A'+i), (char)('0'+ (2+i/3)));
			else
				keyboard.put((char)('A'+i), (char)('0'+(2+(i-1)/3)));
		}

		int counter = sc.nextInt();

		while(counter>0) {
			counter--;

			StringBuilder sb = new StringBuilder();
			
			String s = sc.next().trim();

			if(s.equals("end"))
				break;

			if(s.length()<7)
				continue;

			for(int i=0; i<s.length(); i++) {
				char c = s.charAt(i);

				if(c=='-')
					continue;
				else if(Character.isDigit(c))
					sb.append(c);
				else if(keyboard.containsKey(c))
					sb.append(keyboard.get(c));
				else
					break;
			}

			if(sb.length()!=7)
				continue;

			String ans = sb.substring(0,3) + '-' + sb.substring(3);
			
			if(map.containsKey(ans))
				map.put(ans, map.get(ans)+1);
			else
				map.put(ans, 1);
		}

		ArrayList<String> list = new ArrayList<String>(map.keySet());
		Collections.sort(list);

		for(String s : list) {
			if(map.get(s)>1) {
				flag = false;
				System.out.println(s + ' ' + map.get(s));
			}
		}

		if(flag)
			System.out.println("No duplicates.");
	}
}
