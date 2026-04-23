package TestArray;

class a {
	void aa() {
		System.out.println("a method");
	}
}

class b extends a {
	void aa() {
		System.out.println("b method");
	}
}

public class testImprot {
	public static void main(String[] args) {
		a p = new b();
		b q = new b();
		p.aa();
		q.aa();
		Integer a = 10;
		int c = a.intValue();
		System.out.println(c);
		String str = "this is new show.";
		String[] ss;
		str = str.concat(" Hello!");
		System.out.println(str.contains("Hlelo"));
		System.out.println(str.replace("is", "are"));
		System.out.println(str.substring(5,7));
		ss = str.split(" ");
		System.out.println(ss[1]);
	}
}
