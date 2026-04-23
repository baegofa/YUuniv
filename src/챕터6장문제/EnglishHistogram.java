package 챕터6장문제;

import java.util.Scanner;
import java.util.StringTokenizer;

//입력받아 token 으로 쪼개고 histogram class 에 저장
class Input{
	StringTokenizer st;
	String text;
	Input(){
	}
	
	boolean getToken(String text){
		st = new StringTokenizer(text," !@#$%^&*()[{]}:\'\",<.>/?\\-_=+");
		if(text.contains(";")) return true;
		else return false;
	}
	
	char[] getCharArray (String p) {
		p = p.toLowerCase();
		char[] charArray = p.toCharArray();
		return charArray;
	}
	
}

//히스토그램 배열 관리와 출력
class Histogram {
	Object[][] histogram;
	//생성자
	Histogram (){
		histogram = new Object[26][2]; 				//0열은 String으로 문자, 1열은 빈도로 Integer로 관리
		for (int i = 0; i<histogram.length;++i) {
			histogram[i][0] = (Character)((char)(97+i));
			histogram[i][1] = Integer.valueOf(0);
		}
	}
	
	void frequency(char[] textToken) {
		for(char k:textToken) {
			Character tem = k;
			for(int i =0;i<histogram.length;++i) {
				if(histogram[i][0].equals(tem)) {
					Integer num = (Integer) histogram[i][1];
					histogram[i][1] = num + 1;
				}
			}
		}
		
	}
	
	void printHistogram() {
		StringBuffer printText;
		System.out.println("히스토그램을 그립니다.");
		for(int i = 0; i<histogram.length;++i) {
			StringBuffer raw = new StringBuffer("");
			printText = new StringBuffer((char)(histogram[i][0])+"("+(int)histogram[i][1]+")"+"          ");
			for(int j=0;j<(int)histogram[i][1];++j) {
				raw.append("-");
			}
			printText.insert(7, raw);
			System.out.println(printText);
			System.out.println();
		}
	}
}

//시스템 실행
class FrequencySystem {
	Scanner scanner;
	Input input;
	Histogram graph;
	
	FrequencySystem(){
		scanner = new Scanner(System.in);
		input = new Input();
		graph = new Histogram();
	}
	
	void run() {
		String plainText;
		do {
			plainText = scanner.nextLine();
			if(input.getToken(plainText)) break;
			while(input.st.hasMoreTokens()) {
				graph.frequency(input.getCharArray(input.st.nextToken()));
			}
		}while(true);
		graph.printHistogram();
	}
}

public class EnglishHistogram {
	public static void main(String[] args) {
		FrequencySystem p = new FrequencySystem();
		p.run();
	}

}
