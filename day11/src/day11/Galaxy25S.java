package day11;

public class Galaxy25S extends Phone {

	public Galaxy25S(int number, char data, char color) {
		super(number, data, color);
	}

	@Override
	void show(int number, char color) {
		System.out.println(number+ color);
	}

	@Override
	void sms() {
		System.out.println("갤럭시 25s문자 기능 실행");
	}
	 void samsungPay()
	 {
		 System.out.println("갤럭시 25s 삼성페이 기능실행");
	 }
	 
	 void bixby()
	 {
		 System.out.println("갤럭시 25s음성인식 기능실행");
	 }

}
