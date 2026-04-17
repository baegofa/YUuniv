package 챕터5장문제;

abstract class Shape {
	 void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape{
	 void draw() {
		System.out.println("Line");
	}
}
class Rect extends Shape{
	 void draw() {
		System.out.println("Rect");
	}
}
class Circle extends Shape{
	 void draw() {
		System.out.println("Circle");
		super.draw();
	}
}
public class Quiz5_4 {
	static void paint (Shape p) {
		p.draw();
	}
	
	public static void main(String[] args) {
		Shape line = new Line();
		paint(line);					//paint 의 파라미터로 Shape 타입을 썻지만 객체라 Line 객체라 draw() 메소드가 오버라이딩됨
		
		paint(new Line());			//객체에 맞게 출력 오버라이딩
		paint(new Rect());			//객체에 맞게 출력 오버라이딩
		paint(new Circle());			//객체에 맞게 출력 오버라이딩
	}
}
