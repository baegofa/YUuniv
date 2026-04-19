package 챕터5장문제;

interface IBook{
	int NOEMPTYSPACE = -1, NAMESECTION = 0, NUMBERSECTION = 1, NOINDEX = -1;
	String NONAME = "등록되어 있지 않은 이름입니다.";
	boolean DEBUG = true;
	void add(String name, String value);
	void delete(String name);
	String search(String name);
	int getLength();
	void printAll();
}

class PhoneBook implements IBook{
	int size;
	String[][] storePhoneInfo;
	PhoneBook(int size){
		this.size = size;
		storePhoneInfo = new String[size][2];
		for(int i =0; i<size;++i) {
			storePhoneInfo[i][NUMBERSECTION] = "null";
		}
	}
	//등록
	public void add(String name, String value) {
		if(searchEmptyIndex() == NOEMPTYSPACE) {System.out.println("저장공간이 없습니다");}
		else {
			storePhoneInfo[searchEmptyIndex()][NAMESECTION] = name;
			storePhoneInfo[searchEmptyIndex()][NUMBERSECTION] = value;
			System.out.println("저장되었습니다.");
		}
	}
	//삭제
	public void delete(String name) {
		int index = searchNameIndex(name);
		if(index==NOINDEX) {
			System.out.println(NONAME);
		}
		else {
			storePhoneInfo[index][NAMESECTION] = "null";
			storePhoneInfo[index][NUMBERSECTION] = "null";
			System.out.println("삭제되었습니다.");
		}
	}
	//이름으로 저장 인덱스 찾기
	public int searchNameIndex(String name) {
		for(int i = 0; i<size;++i) {
			if(storePhoneInfo[i][NAMESECTION].equals(name)) {return i;}
		}
		return NOINDEX;
	}
	//이름으로 전화번호 찾기
	public String search(String name) {
		for(int i = 0; i<size;++i) {
			if(storePhoneInfo[i][NAMESECTION].equals(name)) {
				return storePhoneInfo[i][NUMBERSECTION];
				}
		}
		return NONAME;
	}
	//빈 저장공간 반환하는 메소드
	public int searchEmptyIndex() {
		for(int i = 0; i<size;++i) {
			if(storePhoneInfo[i][NUMBERSECTION].equals("null")) {return i;}
		}
		return NOEMPTYSPACE;
	}
	
	public int getLength() {
		int count = 0;
		for(int i = 0; i<size;++i) {
			if(!storePhoneInfo[i][NUMBERSECTION].equals("null")) {++count;}
		}
		return count;
	}
	
	public void printAll() {
		for(int i = 0; i<size;++i) {
			if(!storePhoneInfo[i][NUMBERSECTION].equals("null")) {System.out.print(storePhoneInfo[i][NAMESECTION]+":"+storePhoneInfo[i][NUMBERSECTION]+" ");}
		}
	}
}

public class Quiz7p236 {
	public static void main(String[] args) {
		IBook pBook = new PhoneBook(3);
		pBook.add("황기태", "1111");
		pBook.add("한지운", "2222");
		pBook.add("박채원", "3333");
		pBook.add("옥지윤", "4444");
		
		System.out.println("저장된 항목 수는 : " + pBook.getLength());
		pBook.delete("한지운");
		System.out.println("박채원의 전화번호는 : " + pBook.search("박채원"));
		pBook.printAll();
	}

}
