package 챕터6장문제;

class student {
	String name, major;
	String[] studentInfo;
	
	public student(String name, String major) {
		this.name = name;
		this.major = major;
		studentInfo = new String[2];
		studentInfo[0] = name;
		studentInfo[1] = major;
	}
	
	public String toString() {
		return "["+name+","+major+"]";
	}
}
public class Quiz1p281 {
	public static void main(String[] args) {
		student st = new student("황기태", "컴퓨터공학과");
		System.out.println(st);
	}

}
