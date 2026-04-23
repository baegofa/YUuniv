package 챕터6장문제;

class threeRandom{
	int num1, num2, num3;
	threeRandom(){
		num1 = 0;
		num2 = 1;
		num3 = 2;
	}
	
	boolean decideWin() {
		num1 = (int)(Math.random()*3)+1;
		num2 = (int)(Math.random()*3)+1;
		num3 = (int)(Math.random()*3)+1;
		if(num1 == num2 && num2 == num3) {
			return true;
		}
		return false;
	}
	
	void run() {
		while(!decideWin()) {
			System.out.println(num1 + " "+num2+" "+num3);
		}
		System.out.println(num1 + " "+num2+" "+num3);
		System.out.println("성공");
	}
}
public class Quiz5p283 {
	public static void main(String[] args) {
		threeRandom r = new threeRandom();
		r.run();
	}

}
