package 챕터5장문제;

class Phone{
	private String brand;
	Phone(String brand) {this.brand = brand;}
	protected String getBrand() {return brand;}
	protected void call() {System.out.println("띠리리리리링~~");}
}

class CalcPhone extends Phone{
	CalcPhone(String brand){
		super(brand);
	}
	double calc(String symbol,double a,double b) {
		switch(symbol) {
		case "+":
			return a + b;
		case "-":
			return a - b;
		case "*":
			return a * b;
		case "/":
			return a / b;
		}
		System.out.println("사칙연산자를 입력하지 않았습니다. 0을 출력합니다.");
		return 0;
	}
}

public class Quiz3p233 {
	public static void main(String[] args) {
		CalcPhone myPhone = new CalcPhone("Galaxy");
		System.out.println("저의 전화기는 "+myPhone.getBrand()+"입니다.");
		myPhone.call();
		System.out.println("계산도 됩니다. 2+3은 "+myPhone.calc("-",2,3));
	}

}
