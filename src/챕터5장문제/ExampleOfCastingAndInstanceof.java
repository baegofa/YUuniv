package 챕터5장문제;
/*class Person {
	String name;
	String Id;
	
	public Person(String name) {
		this.name = name;
	}
}

class Student extends Person{
	String grade;
	String department;
	
	Student(String name){
		super(name);
	}
}

class Child extends Student{
	Child(String x){
		super(x);
	}
}

public class ExampleOfCastingAndInstanceof {
	public static void main(String[] args) {
		Person p;
		Student s = new Student("박건우");
		p = s;
		
		System.out.println(p.name);
		
		p.name = "박재민";
		System.out.println(p.name);
		System.out.println(s.name);			//같은 객체를 가르키고 있어서 p 에서 수정한 순간 그 객체의 내용이 바뀜!
		
		Student q;
		q = (Student)p;						//p = (Student)p; 는 성립 안됨 애초에 p 가 Person 타입이라 안들어감
		q.name = "강민호";					//q = (Student)p; 는 다운 캐스팅의 예시임
		System.out.println(q.name);
		
		System.out.println(p instanceof Person);
		System.out.println(p instanceof Student);
		System.out.println(p instanceof Child);
	}

}
*/