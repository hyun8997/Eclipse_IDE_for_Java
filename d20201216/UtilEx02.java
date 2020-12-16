package d20201216;

import java.time.LocalDate;
import java.util.Calendar;
import java.util.Date;


//날짜 
public class UtilEx02 {
	public static void main(String[] args) {
		
		Date date = new Date();
		System.out.println(date);  //현재 시간 나옴.
		
		Date date2 = new Date(2020,12,16);	//객체에 줄 가해져 있는것 deprecated -> 곧 사라진다.
		System.out.println(date2);
		
		
		
//		String time = sdf.format(d);
//		System.out.println(time);
		
		System.out.println(LocalDate.now());
		
		//Calendar
		Calendar cal = Calendar.getInstance();	//abstract임
		System.out.println(cal);
		
		//getter나 상수로 호출해서 사용
		int week = cal.get(Calendar.WEEK_OF_YEAR);
		System.out.println("이번주는 올해의 "+ week + " 번째 주입니다.");
		
		//ex) Serial Number 등과 같은 정보 생성시 많이 사용
		
		//년, 월, 일, 시, 분, 초 출력해보세요		//GregorianCalendar 그레고리력이고, 1월부터가 아니고 0~11월임!
		int year = cal.get(Calendar.YEAR);
		int month = cal.get(Calendar.MONTH)+1;	//1월부터가 아니고 0~11월임!
		int day = cal.get(Calendar.DATE);
		int hour = cal.get(Calendar.HOUR_OF_DAY);
		int min = cal.get(Calendar.MINUTE);
		int sec = cal.get(Calendar.SECOND);
		
		System.out.println(""+year+"년 "+month+"월 "+day+"일 "+hour+"시 "+min+"분 "+sec+"초");
		
		
		
	}
}
