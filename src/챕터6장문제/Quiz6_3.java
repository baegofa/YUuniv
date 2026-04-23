package 챕터6장문제;

class Point2 {
	private int x, y;
	Point2 (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public boolean equals(Object obj) {
		if(!(obj instanceof Point2)) return false;
		Point2 p = (Point2)obj;
		if(x == p.x && y == p.y) return true;
		else return false;
	}
}

public class Quiz6_3 {
	public static void main(String[] args) {
		Point2 a = new Point2(2,3);
		Point2 b = new Point2(2,3);
		Point2 c = new Point2(3,4);
		
		if(a==b) System.out.println("a==b");
		if(a.equals(b)) System.out.println("a.equals(b)");
		if(a.equals(c)) System.out.println("a.equals(c)");
	}

}
