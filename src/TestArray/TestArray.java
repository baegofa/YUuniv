package TestArray;

public class TestArray {
	public static void main(String[] args) {
		String[][] a = {{"***"},{"***"},{"***"},{"***"},{"***"},{"***"},{"***"},{"***"}};
		for (int i = 0 ; i<a.length;++i) {
			for (int j = 0 ; j<a[i].length;++j) {
				System.out.println(a[i][j]);
			}
		}
	}

}
