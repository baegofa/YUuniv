package 챕터5장문제;

import java.util.Scanner;

abstract class Shape2 {}
class Line2 extends Shape2{}
class Rect2 extends Shape2{}
class Circle2 extends Shape2{}

class Editor {
	public static final int NOEMPTYSPACE = -1;
	Scanner scanner;
	boolean quit;
	Shape2[] array;
	Editor(){
		quit = true;
		scanner = new Scanner(System.in);
		array = new Shape2[10];
	}
	
	int searchIndex() {
		for(int i=0;i<array.length;++i) {
			if(!(array[i] instanceof Shape2)) return i;
		}
		return NOEMPTYSPACE;
	}
	
	boolean insert() {
		System.out.println("도형 종류 Line(1), Rect(2), Circle(3)");
		if(searchIndex()==NOEMPTYSPACE) System.out.println("저장 공간이 가득 차 삽입할 수 없습니다.");;
		switch(scanner.nextInt()) {
		case 1:
			array[searchIndex()] = new Line2(); break;
		case 2:
			array[searchIndex()] = new Rect2(); break;
		case 3:
			array[searchIndex()] = new Circle2(); break;
		}
		return true;
	}

	void delete() {
		System.out.println("삭제할 도형의 위치>>");
		int deleteIndex = scanner.nextInt();
		if(!(array[deleteIndex] instanceof Shape2)) System.out.println("삭제할 수 없습니다.");
		else array[deleteIndex] = null;
	}
	void show() {
		for(Shape2 p:array) {
			if(p!=null)System.out.println(p.getClass().getSimpleName());
		}
	}

	
	void run() {
		while(quit) {
			System.out.println("삽입(1),삭제(2),모두 보기(3), 종료(4) >>");
			switch(scanner.nextInt()) {
			case 1:
				insert();
				break;
			case 2:
				delete();
				break;
			case 3:
				show();
				break;
			case 4:
				quit = false;
				System.out.println("프로그램을 종료합니다.");
				break;
			}
		}
	}
}

public class Quiz9p239 {
	public static void main(String[] args) {
		Editor ed = new Editor();
		ed.run();
		
	}
}
