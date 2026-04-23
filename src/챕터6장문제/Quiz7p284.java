package 챕터6장문제;

import java.util.Scanner;
import java.util.StringTokenizer;

class Grade {
	String line;
	Scanner sc;
	StringTokenizer st;
	boolean inputError = false;
	int sum, average;
	
	Grade(){
		line = "";
		sc = new Scanner(System.in);
		sum = 0;
		average = 0;
	}
	
	void receiveGrade() {
		System.out.print("여러 과목의 학점을 빈 칸으로 분리입력>>");
		line = sc.nextLine();
	}
	
	int calcGrade() {
		st = new StringTokenizer(line, " ");
		sum = 0;
		String tem = "";
		inputError = false;
		int count = st.countTokens();
		
		while(st.hasMoreTokens()) {
			tem = st.nextToken().toLowerCase();
			switch(tem) {
			case "a":
				sum += 90;
				break;
			case "b":
				sum += 80;
				break;
			case "c":
				sum += 70;
				break;
			case "d":
				sum += 60;
				break;
			case "f":
				break;
			default:
				System.out.println("입력오류: "+tem);
				inputError = true;
				break;
			}
		}
		average = sum/count;
		return average;
	}
	
	void run() {
		while(true) {
			receiveGrade();
			if(line.equals("그만")) break;
			calcGrade();
			if(!inputError) System.out.println("평균은 "+average);
		}
	}
}
public class Quiz7p284 {
	public static void main(String[] args) {
		Grade a = new Grade();
		a.run();
	}

}
