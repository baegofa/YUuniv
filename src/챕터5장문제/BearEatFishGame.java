package 챕터5장문제;

import java.util.Scanner;
import java.lang.Math;

abstract class GameObject{
	protected int distance;
	protected int x, y;
	//생성자
	public GameObject(int startX, int startY, int distance) {
		this.x = startX;
		this.y = startY;
		this.distance = distance;
	}
	//구현 메소드
	public int getX() {return x;}
	public int getY() {return y;}
	public boolean collide(GameObject p) {
		if(this.x == p.getX() && this.y == p.getY())
			return true;
		else
			return false;
	}
	//추상 메소드
	protected abstract void move();
	protected abstract char getShape();
}

//곰 구현
class Bear extends GameObject{
	Scanner scanner;;
	String bearMoving;
	Bear() {
		super(0,0,1);
		scanner = new Scanner(System.in);
	}
	
	protected void move() {
		System.out.println("위쪽(W),왼쪽(A),아래쪽(S),오른쪽(D) 중 하나를 입력하세요>>");
		bearMoving = scanner.next().toLowerCase();
		switch (bearMoving) {
		case "a":
			x -= distance;
			break;
		case "d":
			x += distance;
			break;
		case "w":
			y -= distance;
			break;
		case "s":
			y += distance;
			break;
		}
	}
	protected char getShape() {
		return 'B';
	}
}

//물고기 구현
class Fish extends GameObject{
	Fish(int firstX, int firstY) {
		super(10, 10,1);
		x = firstX;
		y = firstY;
	}
	
	protected void move() {
		int fishMoving = (int)(Math.random()*4);
		switch (fishMoving) {
		case 0:
			x -= (x!=0) ? distance : 0;
			break;
		case 1:
			x += (x!=19) ? distance : 0;
			break;
		case 2:
			y -= (y!=0) ? distance : 0;
			break;
		case 3:
			y += (y!=9) ? distance : 0;
			break;
		}
	}
	protected char getShape() {
		return '@';
	}
}

class Backgraound{
	char[][] field;
	
	public Backgraound() {
		field = new char[10][20];
		for(int i=0;i<field.length;++i) {
			for (int j=0;j<field[i].length;++j) {
				field[i][j] = '-';
			}
		}
	}	
}

//게임 구현
class Game{
	char[][] field;
	Fish fish;
	Bear bear;
	int fishFirstX, fishFirstY;
	boolean[] fishMove;
	
	//생성자
	Game(){
		//물고기 랜덤 시작 위치
		fishFirstX = (int)(Math.random()*20);
		fishFirstY = (int)(Math.random()*10);
		//곰, 물고기 생성
		bear = new Bear();
		fish = new Fish(fishFirstX,fishFirstY);
		//물고기 move 타임 생성
		fishMove = fishMovingTime();
	}
	
	//필드 생성
	void makeField() {
		field = new char[10][20];
		for(int i=0;i<field.length;++i) {
			for (int j=0;j<field[i].length;++j) {
				field[i][j] = '-';
			}
		}
	}
	
	//필드 출력
	void printField() {
		for(int i=0;i<field.length;++i) {
			for (int j=0;j<field[i].length;++j) {
				System.out.print(field[i][j]);
			}
			System.out.println();
		}
	}
	
	//물고기가 움직일 순간 생성
		boolean[] fishMovingTime() {
			int count = 0;
			boolean[] box = new boolean[5];
			for (int i =0;i<box.length;++i) {
				box[i] = false;
			}
			int checkNum = -1;
			while(count < 2) {
				int num = (int)(Math.random()*5);
				if (checkNum != num) ++count;
				checkNum = num;
				box[num] = true;
			}
			return box;
		}
	
	//게임 실행
	void run() {
		int count = 0;
		System.out.println("Bear의 Fish 먹기 게임을 시작합니다.");
		makeField();
		field[bear.getY()][bear.getX()] = bear.getShape();
		field[fish.getY()][fish.getX()] = fish.getShape();
		do {
			printField();
			if (count == 5) {
				count = 0;
				fishMove = fishMovingTime();
			}
			field[bear.getY()][bear.getX()] = '-';
			bear.move();
			if(fishMove[count]) {
				field[fish.getY()][fish.getX()] = '-';
				fish.move();
			}
			field[bear.getY()][bear.getX()] = bear.getShape();
			field[fish.getY()][fish.getX()] = fish.getShape();
			++count;
		}while(!bear.collide(fish));
		System.out.println("GameOver");
	}
}

public class BearEatFishGame {
	public static void main(String[] args) {
		Game game = new Game();
		game.run();
		
	}
}
