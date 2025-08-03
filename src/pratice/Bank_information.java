package pratice;

import java.util.Scanner;

public class Bank_information {

	public static void main(String[] args) {
		boolean run=true;
		int balance=0;
		Scanner scanner=new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1:예금 | 2:출금 | 3.잔고| 4.종료");
			System.out.println("----------------------------------");
			System.out.println("선택");
			int num = scanner.nextInt();
			
			
		switch(num) {
			case 1:
				int money;
				money=scanner.nextInt();
				balance+=money;
				System.out.println("예금액>"+balance);
				break;
			case 2:
				int money_1;
				money_1=scanner.nextInt();
			    balance-=money_1;
			    System.out.println("출금액>"+balance);
			    break;
			case 3:
				System.out.println("잔고>"+balance);
				break;
			case 4:
				run=false;
				System.out.println("프로그램 종료");
				break;
			
		}
	}

	}
}
