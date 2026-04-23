package 챕터6장문제;

import java.util.Scanner;
import java.util.StringTokenizer;

class Sort{
	String input;
	Scanner sc;
	StringTokenizer st;
	String[] inputArray;
	int wrongIndex;
	
	Sort(){
		input = "";
		sc = new Scanner(System.in);
		int wrongIndex = 0;
	}
	
	//입력
	String receive() {
		System.out.print(">>");
		input = sc.nextLine();
		return input;
	}
	
	//문자열 배열로 쪼개는 메소드
	boolean devide() {
		inputArray = input.split(" ");
		return true;
	}
	//문자열 크기 비교 결과
	boolean decide() {
		for(int i=1;i<inputArray.length;++i) {
			if(Integer.parseInt(inputArray[i])>=Integer.parseInt(inputArray[i-1])) {
				continue;
			}
			else {
				wrongIndex = i+1;
				return false;
			}
		}
		return true;
	}
	//실행
	void run() {
		while(true) {
			receive();
			if(input.equals("그만")) break;
			devide();
			if(decide()) {
				System.out.println("정수들이 증가순으로 되어 있음!");
			}
			else {
				System.out.println("정수들이 증가순으로 되어 있지 않음!"+wrongIndex+"째 부터");
			}
		}
	}
}
//main
public class Quiz8p284 {
	public static void main(String[] args) {
		Sort s = new Sort();
		s.run();
	}

}
