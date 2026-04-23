package 챕터6장문제;

class Rect{
	private int width, height;
	Rect(int width, int height){
		this.width = width;
		this.height = height;
	}
	
	public boolean equals(Object obj) {
		if(!(obj instanceof Rect)) return false;
		Rect r = (Rect)obj;
		if(r.width*r.height == width*height) return true;
		else return false;
	}
}

public class Quiz6_4 {
	public static void main(String[] args) {
		Rect a = new Rect(2,3);
		Rect b = new Rect(2,3);
		Rect c = new Rect(4,5);
		
		if(a==b) System.out.println("a==b");
		if(a.equals(b)) System.out.println("a.equals(b)");
		if(a.equals(c)) System.out.println("a.equals(c)");
		if(b.equals(c)) System.out.println("b.equals(c)");
	}

}
