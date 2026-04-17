package 챕터5장문제;
class A{
	A(){
		System.out.println("생성자 A");
	}
	A(int x){
		System.out.println("매개변수 생성자 A");
	}
}
class B extends A{
	B(){
		System.out.println("생성자 B");
	}
	B(int x){
		System.out.println("매개변수 생성자 B");
	}
}
class C extends B{
	C(){
		System.out.println("생성자 C");
	}
	C(int x){
		System.out.println("매개변수 생성자 C");
	}
	
	public void good() {
		
	}
}

public class SuperConstructorPriority {
	public static void main(String[] args) {
		C c;
		c = new C(3);
		c.good();
	}

}
