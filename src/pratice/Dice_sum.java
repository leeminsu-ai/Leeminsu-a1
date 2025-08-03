package pratice;

public class Dice_sum {

	public static void main(String[] args) {
		int sum=0;
		while(sum!=5)
		{
			int dice_1=(int)(Math.random() * 6) + 1;
			int dice_2=(int)(Math.random()*6)+1;
			
			sum=dice_1+dice_2;
			System.out.println("("+dice_1+","+dice_2+")");
		}
	}

}
