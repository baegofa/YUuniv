package 챕터5장문제;

class Box {
	private int width, height;
	private char fillChar=' ';
	protected char[][] charMap = null;
	//생성자
	Box(int height, int width){
		this.width = width;
		this.height = height;
		charMap = new char[height][width];
	}
	int getWidth() {return width;}
	int getHeight() {return height;}
	void fill(char fillChar) {this.fillChar = fillChar;}
	void makeCharMap() {
		for(int i=0;i<height;++i) {
			for(int j=0;j<width;++j) {
				charMap[i][j] = fillChar;
			}
		}
	}
	void paint() {
		makeCharMap();
		for(int i=0;i<height;++i) {
			for(int j=0;j<width;++j) {
				System.out.print(charMap[i][j]);
			}
			System.out.println();
		}
	}
}

class BorderBox extends Box{
	char borderChar;
	BorderBox(int width, int height){
		super(width,height);
	}
	void setBorder(char borderChar) {this.borderChar = borderChar;}
	void makeCharMap() {
		super.makeCharMap();
		for(int i=0;i<getHeight();++i) {
			charMap[i][0] = borderChar;
			charMap[i][getWidth()-1] = borderChar;
		}
		for(int i=0;i<getWidth();++i) {
			charMap[0][i] = borderChar;
			charMap[getHeight()-1][i] = borderChar;
		}
	}
}

public class Quiz8p237 {
	public static void main(String[] args) {
		Box box = new Box(4,15);
		box.fill('^');
		box.paint();
		System.out.println();
		
		BorderBox bBox = new BorderBox(4,15);
		bBox.fill('^');
		bBox.setBorder('@');
		bBox.paint();
	}

}
