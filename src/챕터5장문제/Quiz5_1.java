package 챕터5장문제;
class Point {
	private int x,y;
	
	Point(){
		this.x = this.y = 0;
	}
	
	Point(int x,int y){
		this.x = x;
		this.y = y;
	}
	public void showPoint() {
		System.out.println("(" + x + "," + y + ")");
	}
}

class ColorPoint extends Point{
	private String color;
	
	ColorPoint(int x, int y, String colorInfo){
		super(x,y);
		color = colorInfo;
	}
	
	public void showColorPoint() {
		System.out.print(color);
		showPoint();
	}
}

public class Quiz5_1 {
	public static void main(String[] args) {
		
		ColorPoint cp = new ColorPoint(3,4,"red");
		cp.showColorPoint();
	}

}
