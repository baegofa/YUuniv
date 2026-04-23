package 챕터6장문제;

import java.util.Scanner;
import java.util.StringTokenizer;

class Calculator {
	String inputMsg;
	Scanner sc;
	int sum;
	StringTokenizer st;
	
	Calculator() {
		inputMsg = "";
		sc = new Scanner(System.in);
		sum = 0;
		st = new StringTokenizer(inputMsg, "+");
	}
	
	void receiveMsg() {
		System.out.print(">>");
		inputMsg = sc.nextLine();
	}
	
	int calc() {
		sum = 0;
		st = new StringTokenizer(inputMsg, "+");
		while(st.hasMoreTokens()) {
			sum += Integer.parseInt(st.nextToken().trim());
		}
		return sum;
	}
	
	void run() {
		while(true) {
			receiveMsg();
			if(inputMsg.equals("그만")) break;
			calc();
			System.out.println("합은 "+sum);
		}
	}
}
public class Quiz6p283 {
	public static void main(String[] args) {
		Calculator c = new Calculator();
		c.run();
	}

}
