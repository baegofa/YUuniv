package 챕터5장문제;

import java.util.Scanner;

abstract class Box2 {
	protected int size;
	public Box2(int size) {
		this.size = size;
	}
	public boolean isEmpty() {return size == 0;}
	public abstract boolean consume();
	public abstract void print();
}

class IngredientBox extends Box2 {
	String name;
	public IngredientBox (String name, int size) {
		super(size);
		this.name = name;
	}
	public boolean consume() {
		if(size == 0) return false;
		--size;
		return true;
	}
	public void print() {
		System.out.println(name+" *****"+size);
	}
}

class SystemRun {
	Scanner scanner;
	IngredientBox coffee;
	IngredientBox cream;
	IngredientBox sugar;
	
	SystemRun(){
		coffee = new IngredientBox("coffee", 5);
		cream = new IngredientBox("cream", 5);
		sugar = new IngredientBox("sugar", 5);
		scanner = new Scanner(System.in);
	}
	
	void ingredientTable() {
		coffee.print();
		cream.print();
		sugar.print();
	}
	
	boolean exhaustIngredient() {
		if(coffee.isEmpty()||cream.isEmpty()||sugar.isEmpty()) {
			System.out.println("원료가 부족합니다.");
			return true;
			}
		return false;
	}
	
	void run() {
		int input = 0;
		boolean stop = true;
		System.out.println("청춘 커피 자판기입니다.");
		while(stop) {
			System.out.println("다방커피:1, 설탕 커피:2, 블랙 커피:3, 종료:4>>");
			input = scanner.nextInt();
			if(exhaustIngredient()) {}
			switch(input) {
			case 1:
				coffee.consume();
				cream.consume();
				sugar.consume();
				ingredientTable();
				break;
			case 2:
				coffee.consume();
				sugar.consume();
				ingredientTable();
				break;
			case 3:
				coffee.consume();
				ingredientTable();
				break;
			case 4:
				stop = false;
				System.out.println("종료합니다.");
				break;
			}
		}
	}
	
}
public class Quiz10p240 {
	public static void main(String[] args) {
		SystemRun s = new SystemRun();
		s.run();
	}
}
