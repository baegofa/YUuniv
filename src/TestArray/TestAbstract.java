package TestArray;

interface rr {
	static void func() {
		System.out.println("인터페이스 스태틱 메소드");
	}
}

abstract class gg {
	static void func() {
		System.out.println("추상 클래스 일반 메소드");
	}
}

public class TestAbstract extends gg implements rr{
	public static void main(String[] args) {
		rr.func();
	}

}
