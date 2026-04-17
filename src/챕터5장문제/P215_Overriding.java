package 챕터5장문제;

class SuperObject {
	void paint() {
		draw();
	}
	void draw() {
		draw();
		System.out.println("Super Object");
	}
}

class SubObject extends SuperObject{
	void paint() {
		super.draw();
	}
	void draw() {
		System.out.println("Sub Object");
	}
}

public class P215_Overriding {
	public static void main(String[] args) {
		SuperObject b = new SubObject();
		b.paint();
	}

}
