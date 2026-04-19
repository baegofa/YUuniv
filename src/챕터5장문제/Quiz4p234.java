package 챕터5장문제;

class Point2 {
	private int x,y;
	Point2(int x, int y) {
		this.x = x;
		this.y = y;
	}
	protected int getX() {return x;}
	protected int getY() {return y;}
	protected void move(int x, int y) {this.x = x; this.y = y;}
}

class EasyPoint extends Point2{
	int distanceX,distanceY;
	//생성자
	EasyPoint(int x, int y, int distanceX,int distanceY){
		super(x,y);
		this.distanceX = distanceX;
		this.distanceY = distanceY;
	}
	
	void moveUp() {
		move(getX(),getY()+distanceY);
	}
	void moveDown() {
		move(getX(),getY()-distanceY);
	}
	void moveRight() {
		move(getX()+distanceX,getY());
	}
	void moveLeft() {
		move(getX()-distanceX,getY());
	}
	void show() {
		System.out.println("("+getX()+","+getY()+")");
	}
}

public class Quiz4p234 {
	public static void main(String[] args) {
		EasyPoint ep = new EasyPoint(3,5,2,2);
		
		ep.moveUp();
		ep.moveRight();
		ep.show();
		
		ep.moveDown();
		ep.moveLeft();
		ep.show();
	}
}
