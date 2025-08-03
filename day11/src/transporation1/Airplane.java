package transporation1;

public class Airplane extends Transporation implements Flyable, Reserve {
	void move()
	{
		System.out.println("비행기가 움직입니다");
	}
	public void reserve()
	{
		System.out.println("예약이 가능합니다");
	}
	public void flyable()
	{
		System.out.println("하늘을 납니다");
	}
}
