package 챕터5장문제;

abstract class Calculator {
	abstract int add(int a, int b);
	abstract int subtract(int a, int b);
	abstract double average(int[] a);
}

public class Quiz5_5 extends Calculator{
	@Override
	int add(int a, int b) {
		return a + b;
	}
	@Override
	int subtract(int a, int b) {
		return a-b;
	}
	@Override
	double average(int[] a) {
		int sum = 0;
		for(int k : a) {
			sum += k;
		}
		return sum/a.length;
	}
	
	public static void main(String[] args) {
		Quiz5_5 c = new Quiz5_5();
		System.out.println(c.add(2, 3));
		System.out.println(c.subtract(2, 3));
		System.out.println(c.average(new int[] {2,3,4}));
	}

}
