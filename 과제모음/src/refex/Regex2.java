package refex;
import java.util.Scanner;
public class Regex2 {
	public static void main(String args[]) {	
		 { 
			Scanner sc = new Scanner(System.in);
			
			System.out.print("생년월일을 입력하세");
			String birth = sc.next();
			String regex="^(?:19[0-9]{2}|2[0-9]{3})-(?:(0[13578]|1[02])-(0[1-9]|[12][0-9]|3[01])|(0[469]|11)-(0[1-9]|[12][0-9]|30)|02-(0[1-9]|1[0-9]|2[0-8]))$";
			boolean birth_hit=birth.matches(regex);
			
			 if(birth_hit) {
				 System.out.println(regex+"입니다");
			 }
			 else {
				 System.out.println("잘못입력하셨습니다");
			 }

			
		
	}

}
}