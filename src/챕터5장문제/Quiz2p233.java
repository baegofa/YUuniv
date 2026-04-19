package 챕터5장문제;

class Book {
	private String title;
	protected Book(String title) {this.title = title;}
	protected String getTitle() {return title;}
}

class EBook extends Book{
	int inch;
	EBook(String title, int inch){
		super(title);
		this.inch = inch;
	}
	void printInfo() {
		System.out.println(getTitle()+"은 "+inch+"인치 전자책입니다.");
	}
	void text2Speech(int pageNum) {
		System.out.println(pageNum+"쪽을 음성 출력합니다.");
	}
}

public class Quiz2p233 {
	public static void main(String[] args) {
		EBook javaBook = new EBook("자바에센셜-전자책", 14);
		javaBook.printInfo();
		javaBook.text2Speech(3);
	}

}
