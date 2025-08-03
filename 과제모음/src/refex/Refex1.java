package refex;
import java.util.Scanner;
public class Refex1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("생년월일을 입력하세요");
		String birth=sc.next();
		 String regex="^(19[0-9][0-9]|20[0-9][0-9])-(0[1-9]|1[0-2])-(0[0-9]|1[0-9]|2[0-9]|3[0-1])$";
		 
		 boolean birth_hit=birth.matches(regex);
		 
		 if(birth_hit) {
			 System.out.println(regex+"입니다");
		 }
		 else {
			 System.out.println("잘못입력하셨습니다");
		 }
		 
	}

}
