package 챕터6장문제;

import java.util.Scanner;
import java.util.StringTokenizer;

class Sort{
	String input;
	Scanner sc;
	StringTokenizer st;
	String[] inputArray;
	int wrongIndex,count;
	
	Sort(){
		input = "";
		sc = new Scanner(System.in);
		wrongIndex = 0;
		count = 0;
	}
	
	//입력
	String receive() {
		System.out.print(">>");
		input = sc.nextLine();
		return input;
	}
	
	//토큰으로 쪼개는 메소드
	boolean devide() {
		st = new StringTokenizer(input," ");
		return true;
	}
	//문자열 크기 비교 결과
	boolean decide() {
		String tem1, tem2;
		count = 1;
		tem1 = st.nextToken();
		while(st.hasMoreTokens()) {
			tem2 = st.nextToken();
			if(Integer.parseInt(tem1)>=Integer.parseInt(tem2)) {
				return false;
			}
			else {
				++count;
				tem1 = tem2;
				continue;
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
				System.out.println("no problem");
			}
			else {
				System.out.println("증가순으로 안되어 있음."+(count+1)+"째 부터");
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
