package JavaMidtermPractice;

import java.util.Scanner;
import java.util.Iterator;
import java.util.HashMap;
import java.util.Set;

//도서관 시스템
class Library{
	//멤버 변수 & 상수 선언 & 객체 생성
	public static final int NO_BOOK = 0;
	public static final int PRINT_ALL = 1;
	public static final int PRINT_ONE = 2;
	public static final boolean DEBUG = false;
	
	Scanner scanner;
	HashMap<String,Integer> bookLibrary;
	Set<String> keys;
	Iterator<String> it;	
	
	Library (){
		scanner = new Scanner(System.in);												//Scanner scanner = new Scanner(System.in);을 썼었는데 안되는 이유는 생성자 안의 scanner은 레퍼런스 변수라 stack 메모리에
		bookLibrary = new HashMap<String,Integer>();										//저장되어 메소드를 벗어나면 사라짐 따라서 생성자 안에서 만들어진 객체는 가비지가 되어버림 생성자 바깥에 선언을 하는 이유!!!
	}
	
	//책 등록
	public boolean registerBook(String title, Integer bookNum) {
		if(bookLibrary.containsKey(title)) {
			System.out.println("해당하는 책은 이미 도서관에 존재합니다.");
			return false;
	    }  
		bookLibrary.put(title, bookNum);
		System.out.println("등록되었습니다.");
		printBookDB(title,PRINT_ALL);
		return true;
	}
	
	//책 대여.
	public void leaseBook(String title) {	
		if (!bookLibrary.containsKey(title)) {
			System.out.println("해당 책은 도서관에 없습니다.");
		}
		else {
			bookLibrary.put(title, bookLibrary.get(title)-1);
			System.out.println("대여 되었습니다.");
			printBookDB(title,PRINT_ONE);
			if(bookLibrary.get(title)==0) {
				bookLibrary.remove(title);
			}
		}
	}
	
	//도서 관리 현황 출력
	public void printBookDB(String title, int mode) {
		Set<String> keys = bookLibrary.keySet();
		Iterator<String> it = keys.iterator();
		if(mode == PRINT_ALL) {
			System.out.println("[도서 현황]");
			while(it.hasNext()) {
				String key = it.next();
				int value = bookLibrary.get(key);
				System.out.println(key+"는 "+value+"권 있습니다.");
			}
			
			System.out.println("----------------------");
		}
		if(mode == PRINT_ONE) {
			try {																			//존재하지 않는 책에 접근하면 get(title)이 null 이 되어 Exception 발생 따라서 예외 처리
				if(bookLibrary.get(title)==NO_BOOK) {
					System.out.println('\''+title+"\'은 도서관에 없습니다.");
				}
				else {
					System.out.println(title+"은 "+bookLibrary.get(title)+"권 있습니다.");
				}
			}catch(NullPointerException e) {
				System.out.println('\''+title+"\'은 도서관에 없습니다.");
			}
		}
	}
	
	//도서관 시스템 동작 
	public void runSystem() {
		String userOrder = "",title = "";
		Integer bookNum;
		while(userOrder.equals("종료") == false) {
			
			System.out.println("찾기,등록,대여,종료 중 하나를 입력하세요>>");
			userOrder = scanner.next();
			
			if(userOrder.equals("찾기")) {
				System.out.println("찾고자 하는 도서의 제목을 입력하세요>>");
				title = scanner.next();
				printBookDB(title,PRINT_ONE);
			}
			else if(userOrder.equals("등록")){
				System.out.println("등록할 도서의 제목과 권 수를 입력하세요>>");
				title = scanner.next();
				bookNum = scanner.nextInt();
				registerBook(title, bookNum);
			}
			else if(userOrder.equals("대여")) {
				System.out.println("대여할 도서의 제목을 입력하세요>>");
				title = scanner.next();
				leaseBook(title);
			}
		}
	}
}

public class hashMapLibrary {
	public static void main(String[] args) {
		Library library = new Library();
		library.runSystem();
	}
}