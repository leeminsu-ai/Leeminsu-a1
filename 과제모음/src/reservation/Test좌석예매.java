package reservation;

import java.util.Scanner;
import java.util.TreeSet;
import java.util.Set;

public class Test좌석예매 {

	public static void main(String[] args) {	
		Set<String> seat=new TreeSet<String>();
	String possible="^[A-Z](?:[1-9]|[1-2][0-9]|30)$";
	String reservationSeat; //선택할 좌
	Scanner sc=new Scanner(System.in);


	while(true) {
		System.out.println("예매할 좌석 입력");
		reservationSeat=sc.nextLine();
		if(reservationSeat.equals("종료")) {
			System.out.println("총 ["+seat.size()+"]개의 좌석선택이 완료되었습니다. 결제 화면으로 이동합니다.");
			System.out.println("선택된 좌석");
			for(String s:seat) {
				System.out.println("-"+s);
			}
			System.out.println("이용해주셔서 감사합니다");
			break;
		}
		if(reservationSeat.matches(possible)==false) {
			System.out.println("입력을 정확히 해주세요");
			continue;
		}
		if(seat.contains(reservationSeat)) {
			System.out.print("["+reservationSeat+"]"+"은 이미 선택하신 좌석입니다.");
			System.out.println("선택을 해제하겠습니까?(Y/N)");
			String yesOrNo=sc.nextLine();
			
			if(yesOrNo.equals("Y")) {
			System.out.print(reservationSeat+" 좌석이 선택 해제되었습니다");
			seat.remove(reservationSeat);
			System.out.println("(현재 선택된 좌석"+seat.size()+"개)");
			}
			else {
				System.out.println("다시 입력해주세요");
				
			}
			continue;
		}
		
		System.out.print("["+reservationSeat+"] 좌석을 선택하셨습니다");
	seat.add(reservationSeat);
		System.out.println("현재 선택된 좌석:"+seat.size()+"개");
		
		
	}
	
	}

}
