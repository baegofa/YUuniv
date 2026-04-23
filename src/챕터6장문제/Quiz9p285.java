package 챕터6장문제;

import java.util.Scanner;

class Shuffle{
	String[] inputArray;
	String input;
	Scanner sc;
	
	Shuffle(){
		sc = new Scanner(System.in);
		input = "";
	}
	
	void receive() {
		System.out.println("문자열을 입력하세요. 콤마로 분리하고 영어 한글 모두 됩니다.");
		System.out.print(">>");
		input = sc.nextLine();
	}
	
	void devide() {
		inputArray = input.split(",");
	}
	
	void print() {
		String tem;
		for(int i=0;i<inputArray.length;++i) {
			
			//문자열 셔플
			tem = inputArray[0];
			for(int j=1;j<inputArray.length;++j) {
				inputArray[j-1] = inputArray[j];
			}
			inputArray[inputArray.length-1] = tem;
			
			//출력
			for(int k =0;k<inputArray.length;++k) {
				System.out.print(inputArray[k]+",");
			}
			System.out.println();
		}
	}
	
	void run() {
		while(true) {
			receive();
			if(input.equals("그만")) break;
			devide();
			print();
		}
	}
}

public class Quiz9p285 {
	public static void main(String[] args) {
		Shuffle s = new Shuffle();
		s.run();
	}

}
