package reservation;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
public class Reservation1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("예약 날짜를 설정해주세요->yyyy-MM-dd"); // yyyy-MM-dd
		String reservationDay=sc.next();
		sc.close();
		
		int year=Integer.parseInt(reservationDay.substring(0, 4));
		int month=Integer.parseInt(reservationDay.substring(5,7));
		int day=Integer.parseInt(reservationDay.substring(8, 10));
		
		
		Calendar c = Calendar.getInstance();
    	c.set(year, month - 1, day);
    	
    	Calendar d = Calendar.getInstance(); 
    	
    	
    	int NowYear = d.get(Calendar.YEAR);
    	int NowMonth = d.get(Calendar.MONTH);  
    	int NowDay = d.get(Calendar.DATE);
		
    	if (year < NowYear || 
    			   (year == NowYear && month < NowMonth + 1) || 
    			   (year == NowYear && month == NowMonth + 1 && day <= NowDay)) {
    			    System.out.println("오늘은 예약불가");
    			    
    			    return;
    			}
    	int dayOfWeek = c.get(Calendar.DAY_OF_WEEK); 
    	if (dayOfWeek == 1 || dayOfWeek == 7) {
    	    System.out.println("주말에는 예약이 불가능합니다.");
    	    return;

    	}
    	System.out.println("예약이 확정되었습니다~");
		
		
		
	}

}
