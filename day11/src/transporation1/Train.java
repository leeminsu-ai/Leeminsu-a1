package transporation1;

public class Train extends Transporation implements Reserve {
	void move()
	{
		System.out.println("기차가 움직입니다");
		
	}
	public void reserve()
	{
		System.out.println("예약을 할수있습니다");
	}
}	
