package 챕터6장문제;
class Point {
	private int x, y;
	Point (int x, int y) {
		this.x = x;
		this.y = y;
	}
	public String toString() {
		return"Point("+x+","+y+")";
	}
}

public class Quiz6_2 {
	public static void main(String[] args) {
		Point a = new Point(2,3);
		System.out.println(a.toString());
		System.out.println(a);
	}

}
