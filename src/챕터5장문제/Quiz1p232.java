package 챕터5장문제;

class CCTV{
	private String resolution;
	CCTV(String resolution) {
		this.resolution = resolution;
	}
	protected String getResolution() {
		return resolution;
	}
}

class AICCTV extends CCTV{
	boolean faceRecognition;
	String resolution;
	
	AICCTV(String resolution, boolean tr){
		super(resolution);
		faceRecognition = tr;
		this.resolution = resolution;
	}
	
	void printInfo() {
		if(faceRecognition) {
			System.out.println("CCTV는 "+resolution+"이며, 현재 얼굴인식 작동 중");
		}
		else {
			System.out.println("CCTV는 "+resolution+"이며, 현재 얼굴인식 작동 안함");
		}
	}
}

public class Quiz1p232 {
	public static void main(String[] args) {
		AICCTV ai = new AICCTV("FHD", true);
		ai.printInfo();
	}

}
