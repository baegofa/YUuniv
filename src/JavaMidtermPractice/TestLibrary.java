package JavaMidtermPractice;

import java.util.Scanner;

class Book{
	private String name;
	private int bookNum;
	
	Book(String name, int bookNum){
		this.name = name;
		this.bookNum = bookNum;
	}
	
	String getName() {
		return name;
	}
	int getBookNum() {
		return bookNum;
	}
	boolean leaseBook() {
		if(bookNum == 0) return false;
		else{
			bookNum -= 1;
			return true;
		}
	}
}

class LibrarySystem{
	public static final int NO_BOOK = -1;
	Scanner sc;
	Book[] bookDB;
	String name;
	int bookNum;
	
	LibrarySystem(){
		sc = new Scanner(System.in);
		bookDB = new Book[5];
		name = "";
		bookNum = 0;
	}
	
	int search(String name) {
		for (int i=0;i<bookDB.length;++i) {
			if(!(bookDB[i] instanceof Book)) continue;
			else {
				if(bookDB[i].getName().equals(name)) return i;
			}
		}
		return NO_BOOK;
	}
	
	boolean add() {
		System.out.print("저장할 책과 개수를 입력하세요>>");
		name = sc.next();
		bookNum = sc.nextInt();
		if(search(name)==NO_BOOK) {
			for(int i=0;i<bookDB.length;++i) {
				if(bookDB[i] instanceof Book) continue;
				else {
					bookDB[i] = new Book(name,bookNum);
					break;
				}
			}
			return true;
		}
		else {
			System.out.println("이미 중복된 책이 있습니다.");
			return false;
		}
	}
	
	boolean lease() {
		System.out.println("대여할 책을 입력하세요>>");
		name = sc.next();
		if(search(name)==NO_BOOK) {
			System.out.println("해당 책은 도서관에 없습니다."); return false;
		}
		else {
			if(!bookDB[search(name)].leaseBook()) {
				System.out.println("해당 책은 더이상 없습니다.");
				bookDB[search(name)] = null;
			}
			System.out.println("대여가 완료되었습니다.");
			return true;
		}
	}
	
	void printBook() {
		for(int i=0;i<bookDB.length;++i) {
			if(bookDB[i] instanceof Book) System.out.println(bookDB[i].getName()+": "+bookDB[i].getBookNum()+"권");
		}
	}
	
	void printBook(String name) {
		if(search(name) == NO_BOOK) {
			System.out.println("not found in system");
		}
		else {
			System.out.println(bookDB[search(name)].getName()+": "+bookDB[i].getBookNum()+"권");
		}
	}
	
	void run() {
		boolean quit = true;
		while(quit) {
			String input;
			System.out.print("저장,대여,목록,종료 중 하나를 입력하세요>>");
			input = sc.next();
			switch(input) {
			case "저장":
				add();
				break;
			case "대여":
				lease();
				break;
			case "목록":
				printBook();
				break;
			case "그만":
				quit = false;
				break;
			}
		}
	}
}


public class TestLibrary{
	public static void main(String[] args) {
		LibrarySystem a = new LibrarySystem();
		a.run();
		
	}

}
