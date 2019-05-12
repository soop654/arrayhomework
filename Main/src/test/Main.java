package test;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		
		Calendar cal = Calendar.getInstance();
		
		//사번에 들어갈 String 
		String date = "mx";
		
		//년도 YYYY
		int year = cal.get(Calendar.YEAR);
		
		date +=year; 
		
		//순번
		// 순번같은경우는 select로 몇번째 데이터인지 체크해서 
		// 넣어줘야 할거같은데 카운트로 데이터가 몇개인지 체크해서
		// 1의자리 10의자리 100의자리 순으로 넣어야 할거같음
		int test = 1100;	// 이놈이 카운트 몇개인지 가져온 변수로했을 때
		if(test < 10) {
			date +="000"+test; 
		}else if(test >=10 && test<100) {
			date +="00"+test;
		}else if(test >=100 && test < 1000) {
			date +="0"+test;
		}else
		{
			date +=test;
		}
		System.out.println(date);
	}
}
