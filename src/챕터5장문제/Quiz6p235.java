package 챕터5장문제;
import java.util.Scanner;

abstract class Player {
	protected String shape[] = {"가위","바위","보"};
	private String name;
	Player(String name){this.name = name;}
	String getName() {return name;}
	abstract String turn();
}

class MachinePlayer extends Player{
	MachinePlayer(String name){
		super(name);
	}
	String turn() {
		return shape[(int)Math.random()*3];
	}
	
}

class HumanPlayer extends Player{
	Scanner scanner;
	
	HumanPlayer(String name){
		super(name);
		scanner = new Scanner(System.in);
	}
	String turn() {
		String input;
		System.out.print("황기태님, 무엇을 내시겠습니까?");
		input = scanner.next();
		return input;
	}
}

public class Quiz6p235 {
	public static void main(String[] args) {
		Player machine = new MachinePlayer("터미네이터");
		Player human = new HumanPlayer("황기태");
		String m = machine.turn();
		String h = human.turn();
		System.out.println(machine.getName() + ":" + m + ", "+ human.getName()+":"+h);
		
		if(h.equals(m)) {
			System.out.println(machine.getName()+"승리");
		}
		else {
			System.out.println(human.getName()+"승리");
		}
	}

}
