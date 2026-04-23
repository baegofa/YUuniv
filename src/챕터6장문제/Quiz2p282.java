package 챕터6장문제;

class Apartment {
	String aptName, aptNum;
	Apartment(String aptName, String aptNum){
		this.aptName = aptName;
		this.aptNum = aptNum;
	}
	
	public boolean equals(Apartment p) {
		if(aptName.equals(p.aptName)) {
			return true;
		}
		else return false;
	}
	
	public String toString() {
		return aptName+" "+aptNum+"호";
	}
}
public class Quiz2p282 {
	public static void main(String[] args) {
		Apartment a = new Apartment("해바라기아파트","614");
		Apartment b = new Apartment("장미아파트","512");
		Apartment c = new Apartment("해바라기아파트","333");
		System.out.println(a);
		if(a.equals(b)) System.out.println("a and b live in same place");
		else System.out.println("a and b live in different place");
		if(a.equals(c)) System.out.println("a and c live in same place");
		else System.out.println("a and c live in different place");
		
	}

}
