package 챕터5장문제;

interface PhoneInterface {
	public static final int TIMEOUT = 10000;
	void sendCall();
	void receiveCall();
	default void printLogo() {
		System.out.println("**Phone**");
	}
}

interface ManageSchedule {
	default void schedule() {
		System.out.println("일정 관리합니다.");
	}
}

class Calc {
	public int calculate(int x, int y) {return x + y;}
}

class SamsungPhone extends Calc implements PhoneInterface,ManageSchedule {
	@Override
	public void sendCall() {
		System.out.println("띠리리리링");
	}
	@Override
	public void receiveCall() {
		System.out.println("전화가 왔습니다.");
	}
	void flash() {
		System.out.println("전화기에 불이 켜졌습니다.");
	}
}

public class Quiz5_6 {
	public static void main(String[] args) {
		SamsungPhone a = new SamsungPhone();
		a.printLogo();
		a.sendCall();
		a.receiveCall();
		a.flash();
		a.schedule();
		
		System.out.println("3과 5를 더하면 "+a.calculate(3, 5));
		System.out.println(PhoneInterface.TIMEOUT);
	}
}
