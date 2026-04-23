package TestArray;

public class TestArray {
	public static void main(String[] args) {
		
		String aaa = new String(" a b c ");
		String bbb = "a b c ";
		String ccc = "a b c ";
		
		if(aaa == bbb) System.out.println("aaa == bbb");
		if(bbb == ccc) System.out.println("bbb == ccc");
		if(aaa.equals(bbb)) System.out.println("aaa.equals bbb");
		
		bbb = aaa.trim();
		System.out.println(bbb);
		System.out.println(bbb.charAt(0));
		System.out.println(bbb.length());
		System.out.println(bbb.replace('a','w'));
		System.out.println(bbb.substring(2,4));
		
	}

}
