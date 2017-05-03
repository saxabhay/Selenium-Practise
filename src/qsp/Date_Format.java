package qsp;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Date_Format {

	public static void main(String[] args) {
		
		SimpleDateFormat s=new SimpleDateFormat("yyyy_MM_dd, hh_mm_ss");
		String date = s.format(new Date());
		
		System.out.println(date);
		
		

	}

}
