package chosun.ciis.co.base.util;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

public class DateUtil {
	
    public static String getTime()
    {
        Date oDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH시 mm분 ss초");
        return sdf.format(oDate);
    }
    public static String getTime(String format)
    {
        Date oDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(oDate);
    }
    public static String getTime(Calendar c, String format){
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(c.getTime());
    }

    public static String getCurrentDate()
    {
        return getCurrentDate("yyyyMMdd");
    }

    
    public static String getCurrentDate(String format)
    {
        Date oDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat(format);
        return sdf.format(oDate);
    }

    public static String getThisMonth()
    {
        Date oDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("MM");
        return sdf.format(oDate);
    }
    
    //현재날짜
    public static String getThisDay()
    {
        Date oDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("dd");
        return sdf.format(oDate);
    }
    
    public static String getThisYear()
    {
        Date oDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");
        return sdf.format(oDate);
    }

    public static String getCurrentTime()
    {
        Date oDate = new Date();
        SimpleDateFormat sdf = new SimpleDateFormat("HHmmss");
        return sdf.format(oDate);
    }
    

    /**
     * 첫번째월을 구한다.
     * 
     * @param month
     * @return
     */
    public static String getFirstMonthOfYear(String format){

		Calendar calendar = Calendar.getInstance( Locale.KOREA );
		calendar.set(Calendar.YEAR, Integer.parseInt(getThisYear()));
		calendar.set(Calendar.MONTH, 0);
		calendar.set(Calendar.DATE, 1);
		
		SimpleDateFormat sdf = new SimpleDateFormat(format);
		
		return sdf.format(calendar.getTime());
    }    
    /**
     * 특정월의 마지막일자를 구한다.
     * 
     * @param month
     * @return
     */
    public static String getMonthLastDate(String date){

		int year = Integer.parseInt(date.substring(0,4));
		int mon  = Integer.parseInt(date.substring(4,6));
		
		Calendar calendar = Calendar.getInstance( Locale.KOREA );
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH,mon);
		calendar.set(Calendar.DATE, 1);
		
		calendar.add(Calendar.DATE, -1);
		
		return String.valueOf(calendar.get(Calendar.DATE));
    }

	public static String convertDateType(String date) {
		return date.length() != 8 ? date : (new StringBuffer(date.substring(0,4)).append("/").append(date.substring(4,6)).append("/").append(date.substring(6)).toString());
	}
	static String getAmPm(Calendar c) {
		return (c.get( Calendar.HOUR_OF_DAY) <= 12) ? "AM" : "PM";
	}
	/**
	 * 날짜를 format 형태로 리턴. yyyy-MM-dd HH:mm:ss ap
	 */	
	public static String getClock(String format) {
		return getFromatClock(Calendar.getInstance(DateUtil.getUserTimeZone()), format);
	}
	public static String getDate(Calendar c) {
		String s = String.valueOf(c.get( Calendar.DATE));
		return (s.length() == 1)  ?  ( "0"+ s )  :  s;		
	}
	/**
	 * 현재로부터 dateGap일 차의 날짜를 format 형태로 리턴.
	 */
	public static String getDateByGap(int dateGap, String format) {
		Calendar c = Calendar.getInstance(DateUtil.getUserTimeZone());
		c.add(Calendar.DATE, dateGap);
		return getFromatClock(c, format);
	}
	/**
	 * yyyyMMdd날자로 부터로부터 dateGap일 차의 날짜를 format 형태로 리턴.
	 */
	public static String getDateByGap(int dateGap, String format, String yyyyMMdd) {
		Calendar c = Calendar.getInstance(DateUtil.getUserTimeZone());
		c.set(Integer.parseInt( yyyyMMdd.substring(0, 4)), Integer.parseInt(yyyyMMdd.substring(4,6)) -1, Integer.parseInt(yyyyMMdd.substring(6)));
		c.add(Calendar.DATE, dateGap);
		return getFromatClock(c, format);
	}
	
	public static String getMonthByGap(int monthGap, String format, String yyyyMM) {
		
		Calendar c = Calendar.getInstance(DateUtil.getUserTimeZone());
		c.set(Integer.parseInt( yyyyMM.substring(0, 4)), Integer.parseInt(yyyyMM.substring(4)) -1, 1);
		c.add(Calendar.MONTH, monthGap);
		return getFromatClock(c, format);
	}	
	/**
	 * 오늘의 요일을 일월화수목금토 : 1234567
	 */	
	public final static int getDayOfWeek() {
		Calendar cal = Calendar.getInstance(DateUtil.getUserTimeZone());
		return cal.get(java.util.Calendar.DAY_OF_WEEK);
	}
	
	static String getFromatClock(Calendar c, String format) {
		if (format.indexOf("yyyy") > -1) {
			format = StringUtil.replaceString(format, "yyyy", DateUtil.getYear(c));
		}
		if (format.indexOf("MM") > -1) {
			format = StringUtil.replaceString(format, "MM", DateUtil.getMonth(c));
		}
		if (format.indexOf("dd") > -1) {
			format = StringUtil.replaceString(format, "dd", DateUtil.getDate(c));
		}
		if (format.indexOf("HH") > -1) {
			format = StringUtil.replaceString(format, "HH", DateUtil.getHour(c));
		}
		if (format.indexOf("mm") > -1) {
			format = StringUtil.replaceString(format, "mm", DateUtil.getMinute(c));
		}
		if (format.indexOf("ss") > -1) {
			format = StringUtil.replaceString(format, "ss", DateUtil.getSecond(c));
		}
		if (format.indexOf("ap") > -1) {
			format = StringUtil.replaceString(format, "ap", DateUtil.getAmPm(c));
		}
		return format;
	}
	/**
	 * 두 날짜 사이의 차이를 리턴.
	 */
	public static int getGapTwoDate(String yyyyMMdd1, String yyyyMMdd2) {
		return getGapTwoDateTime(yyyyMMdd1, "000000", yyyyMMdd2, "000000")[0];
	}
	/**
	 * 날짜와 시분초 사이의 차이를 리턴  
	 * return {Day차이, Hour차이, Minute차이, Second차이};
	 */
	public static int [] getGapTwoDateTime(String yyyyMMdd1, String HHmmss1, String yyyyMMdd2, String HHmmss2) {
		int nYear1= Integer.parseInt(yyyyMMdd1.substring(0, 4));
		int nMonth1= Integer.parseInt(yyyyMMdd1.substring(4, 6));
		int nDate1= Integer.parseInt(yyyyMMdd1.substring(6));
		int nHour_of_Day1= Integer.parseInt(HHmmss1.substring(0, 2));
		int nMinute1= Integer.parseInt(HHmmss1.substring(2, 4));
		int nSecond1= Integer.parseInt(HHmmss1.substring(4));
	 																	   
		int nYear2 = Integer.parseInt(yyyyMMdd2.substring(0, 4));
		int nMonth2 = Integer.parseInt(yyyyMMdd2.substring(4, 6));
		int nDate2 = Integer.parseInt(yyyyMMdd2.substring(6));
		int nHour_of_Day2 = Integer.parseInt(HHmmss2.substring(0, 2));
		int nMinute2 = Integer.parseInt(HHmmss2.substring(2, 4));
		int nSecond2 = Integer.parseInt(HHmmss2.substring(4));
	
		Calendar cal = Calendar.getInstance(DateUtil.getUserTimeZone());
	
		int nTotalDate1 = 0, nTotalDate2 = 0, nDiffOfYear = 0, nDiffOfDay = 0;
		int process_day = 0, process_hour = 0, process_minute = 0, process_second = 0;
	
		if (nYear1 > nYear2) {
			for(int i=nYear2; i < nYear1; i++) {
				cal.set(i,12,0);
				nDiffOfYear+=cal.get(Calendar.DAY_OF_YEAR);
			}
			nTotalDate1+=nDiffOfYear;
		}
		else if (nYear1 < nYear2) {
			for(int i=nYear1; i < nYear2; i++) {
				cal.set(i,12,0);
				nDiffOfYear+=cal.get(Calendar.DAY_OF_YEAR);
			}
			nTotalDate2+=nDiffOfYear;
		}
	
		cal.set(nYear1,nMonth1-1,nDate1);
		nDiffOfDay=cal.get(Calendar.DAY_OF_YEAR);
		nTotalDate1+=nDiffOfDay;
	
		cal.set(nYear2,nMonth2-1,nDate2);
		nDiffOfDay=cal.get(Calendar.DAY_OF_YEAR);
		nTotalDate2+=nDiffOfDay;
	
		process_day = nTotalDate1-nTotalDate2; // n 일차
	
		if ( process_day >= 0 ) {
			if (nSecond1 < nSecond2) {
				process_second = nSecond1 + 60 - nSecond2;
				--nMinute1;
			}
			else {
				process_second = nSecond1 - nSecond2;
			}
	
			if (nMinute1 < nMinute2) {
				process_minute = nMinute1 + 60 - nMinute2;
				--nHour_of_Day1;
			}
			else {
				process_minute = nMinute1 - nMinute2;
			}
				
			if (nHour_of_Day1 < nHour_of_Day2) {
				process_hour = nHour_of_Day1 + 24 - nHour_of_Day2;
				--process_day;
			}
			else {
				process_hour = nHour_of_Day1 - nHour_of_Day2;
			}
		}
		else {
			if (nSecond1 > nSecond2) {
				process_second = -(nSecond2 + 60 - nSecond1);
				--nMinute2;
			}
			else {
				process_second = -(nSecond2 - nSecond1);
			}
	
			if (nMinute1 > nMinute2) {
				process_minute = -(nMinute2 + 60 - nMinute1);
				--nHour_of_Day2;
			}
			else {
				process_minute = -(nMinute2 - nMinute1);
			}
				
			if (nHour_of_Day1 > nHour_of_Day2) {
				process_hour = -(nHour_of_Day2 + 24 - nHour_of_Day1);
				++process_day;
			}
			else {
				process_hour = -(nHour_of_Day2 - nHour_of_Day1);
			}
		}
		return new int[] { process_day, process_hour, process_minute, process_second };
	}
	static String getHour(Calendar c) {
		String s = String.valueOf(c.get( Calendar.HOUR_OF_DAY));
		return (s.length() == 1)  ?  ( "0"+ s )  :  s;		
	}
	static String getMinute(Calendar c) {
		String s = String.valueOf(c.get( Calendar.MINUTE));
		return (s.length() == 1)  ?  ( "0"+ s )  :  s;		
	}
	public static String getMonth(Calendar c) {
		String s = String.valueOf(c.get( Calendar.MONTH)+1);
		return (s.length() == 1)  ?  ( "0"+ s )  :  s;		
	}
	static String getSecond(Calendar c) {
		String s = String.valueOf(c.get( Calendar.SECOND));
		return (s.length() == 1)  ?  ( "0"+ s )  :  s;		
	}
	public static TimeZone getUserTimeZone() {
		TimeZone tz = TimeZone.getDefault();
		tz.setRawOffset(60*60*1000*9);
		TimeZone.setDefault(tz);
		return tz;
	}
	/**
	 * 금주가 월의 몇번째 주인지를 리턴
	 */	
	public final static int getWeekOfMonth() {
		Calendar cal = Calendar.getInstance(DateUtil.getUserTimeZone());
		return cal.get(java.util.Calendar.WEEK_OF_MONTH);
	}
	/**
	 * 설정된 일자가 해당 월의 몇번째 주인지를 리턴
	 */	
	public final static int getWeekOfMonth(int year, int month, int date) {
		Calendar cal = Calendar.getInstance(DateUtil.getUserTimeZone());
		cal.set(year, month, date);
		return cal.get(java.util.Calendar.WEEK_OF_MONTH);
	}
	/**
	 * 설정된 일자가 해당 주의 요일을 리턴
	 */	
	
	static String[] strArrDay = new String[]{"","일","월","화","수","목","금","토"};
	
	public final static String getDayOfWeek(int year, int month, int date) {
		Calendar cal = Calendar.getInstance(DateUtil.getUserTimeZone());
		cal.set(year, month, date);
		return strArrDay[cal.get(java.util.Calendar.DAY_OF_WEEK)];
	}	
	public final static int iGetDayOfWeek(int year, int month, int date) {
		Calendar cal = Calendar.getInstance(DateUtil.getUserTimeZone());
		cal.set(year, month, date);
		return cal.get(java.util.Calendar.DAY_OF_WEEK);
	}		
	
	public final static String getDayOfWeek(String strDate){
		 if(strDate.length() != 8) {
			 return strDate;		 
		 }
		 return getDayOfWeek(Integer.parseInt(strDate.substring(0,4)),Integer.parseInt(strDate.substring(4,6))-1,Integer.parseInt(strDate.substring(6)));
	}
	public final static int iGetDayOfWeek(String strDate){
		 if(strDate.length() != 8) {
			 return 0;		 
		 }
		 return iGetDayOfWeek(Integer.parseInt(strDate.substring(0,4)),Integer.parseInt(strDate.substring(4,6))-1,Integer.parseInt(strDate.substring(6)));
	}	
	/**
	 * 금주가 년도의 몇번째 주인지를 리턴
	 */	
	public final static int getWeekOfYear() {
		Calendar cal = Calendar.getInstance(DateUtil.getUserTimeZone());
		return cal.get(java.util.Calendar.WEEK_OF_YEAR);
	}
	/**
	 * 설정된 일자가 해당  년도의 몇번째 주인지를 리턴
	 */	
	public final static int getWeekOfYear(int year, int month, int date) {
		Calendar cal = Calendar.getInstance(DateUtil.getUserTimeZone());
		cal.set(year, month-1, date);
		return cal.get(java.util.Calendar.WEEK_OF_YEAR);
	}
	public final static int getWeekOfYear(String str) {
		
		int year  = StringUtil.toNumber(str.substring(0,4));
		int month = StringUtil.toNumber(str.substring(4,6));
		int date  = StringUtil.toNumber(str.substring(6));
		
		return getWeekOfYear(year, month, date);
	}
	
	public static String getYear(Calendar c) {
		return String.valueOf(c.get( Calendar.YEAR));
	} 
	public static String getToday(){
		Calendar cal = Calendar.getInstance(DateUtil.getUserTimeZone());		
		return getYear(cal) + getMonth(cal) + getDate(cal);
	}
	public static int getCurrentHour(){
		Calendar cal = Calendar.getInstance(DateUtil.getUserTimeZone());
		return cal.get(Calendar.HOUR_OF_DAY);
	}
	
	public static ArrayList getMonthRange(String from, String to){
		
		Calendar from_cal = Calendar.getInstance();
		Calendar to_cal   = Calendar.getInstance();

		int from_yyyy = StringUtil.toNumber(from.substring(0,4));
		int from_mm   = StringUtil.toNumber(from.substring(4));
		int to_yyyy   = StringUtil.toNumber(to.substring(0,4));
		int to_mm     = StringUtil.toNumber(to.substring(4));
		
		from_cal.set(from_yyyy, from_mm-1, 1);
		to_cal.set(to_yyyy, to_mm, 1);

		ArrayList rangeList = new ArrayList();
		while(from_cal.before(to_cal)){
			
			int    i_yyyy = from_cal.get(Calendar.YEAR);
			int    i_mm   = from_cal.get(Calendar.MONTH)+1;
			String yyyy   = String.valueOf(i_yyyy);
			String mm     = i_mm < 10 ? "0"+i_mm : String.valueOf(i_mm);	
						
			rangeList.add(yyyy + mm);
								
			from_cal.add(Calendar.MONTH, 1);
		}
		return rangeList;
	}	
	/**
	 * 설정된 일자가 해당  년도의 몇번째 주인지를 리턴
	 */	
	
	public static ArrayList getDateRange(int year, int weekOfYear){

		Calendar ca = Calendar.getInstance(); 
		ca.set(Calendar.YEAR,year); 
		ca.set(Calendar.WEEK_OF_YEAR,weekOfYear); 

		int month       = ca.get(Calendar.MONTH); 
		int firstmonth  = 0; // 해당 주차가 월이 겹치는 경우를 가정해서 월을 첫째와 둘째 각각 받기로 함. 
		int secondmonth = 0; 
		int temp        = 0; 

		int[] m_table = {31,28,31,30,31,30,31,31,30,31,30,31}; 
//		 윤달 체크 
		if(year%4 == 0 && year%100 !=0 || year%400 == 0){ 
			m_table[1]=29; 
		} 

//		해당 주에 첫째 날짜를 구한다. 
//      일요일부터 시작이면 -1, 월요일부터시작이면 -2
		int firstday = ca.get(Calendar.DAY_OF_MONTH) -	(ca.get(Calendar.DAY_OF_WEEK) - 2); 
		if(firstday <= 0){//만약 해당 주차가 월이 겹치는 주일경우 
			if(month == 0){//1주차가 이전 년도의 마지막 월과 겹칠 때 
				firstday   = m_table[11] - Math.abs(firstday); 
				firstmonth = 12; 
			}else{ 
				firstday   = m_table[month-1] - Math.abs(firstday); 
				firstmonth = month; 
			} 
		}else{ 
			firstmonth = month + 1; 
		} 

//		해당 주에 마지막 날짜를 구한다. 
//      토요일까지 +5;		
		int lastday = firstday + 5; 
		if(lastday > m_table[month]){//만약 해당 주차가 월이 겹치는 주일경우 
			temp = ca.get(Calendar.MONTH); 
			ca.set(Calendar.WEEK_OF_YEAR,weekOfYear+1); 
			lastday = ca.get(Calendar.DAY_OF_MONTH) - ca.get(Calendar.DAY_OF_WEEK); 
			if(temp == ca.get(Calendar.MONTH)) 
				secondmonth = month + 1; 
			else 
				secondmonth = month + 2; 
		}else{ 
			secondmonth = month + 1; 
		} 
		
		String from = year + (firstmonth < 10 ? "0"+firstmonth: String.valueOf(firstmonth)) + (firstday < 10 ? "0"+firstday: String.valueOf(firstday));
		String to   = year + (secondmonth < 10 ? "0"+secondmonth: String.valueOf(secondmonth)) + (lastday < 10 ? "0"+lastday: String.valueOf(lastday));
		
		return getDateRange(from, to);
	}

	public static ArrayList getDateRange(String from, String to){

		Calendar from_cal = Calendar.getInstance();
		Calendar to_cal   = Calendar.getInstance();

		int f_yyyy = StringUtil.toNumber(from.substring(0,4));
		int f_mm   = StringUtil.toNumber(from.substring(4,6));
		int f_dd   = StringUtil.toNumber(from.substring(6));
		int t_yyyy = StringUtil.toNumber(to.substring(0,4));
		int t_mm   = StringUtil.toNumber(to.substring(4,6));
		int t_dd   = StringUtil.toNumber(to.substring(6));
		
		from_cal.set(f_yyyy, f_mm-1, f_dd);
		to_cal.set(t_yyyy, t_mm-1, t_dd);
		
		ArrayList rangeList = new ArrayList();
		while(from_cal.before(to_cal)){
			
			int    i_yyyy = from_cal.get(Calendar.YEAR);
			int    i_mm   = from_cal.get(Calendar.MONTH)+1;
			int    i_dd   = from_cal.get(Calendar.DATE);
			String yyyy   = String.valueOf(i_yyyy);
			String mm     = i_mm < 10 ? "0"+i_mm : String.valueOf(i_mm);
			String dd     = i_dd < 10 ? "0"+i_dd : String.valueOf(i_dd);	
			
			rangeList.add(yyyy + mm + dd);
			from_cal.add(Calendar.DATE, 1);
		}
		
		rangeList.add(to);
		
		return rangeList;
		
	}
	
	public static ArrayList getWeeklyRange(String from, String to){

		Calendar from_cal = Calendar.getInstance();
		Calendar to_cal   = Calendar.getInstance();

		int f_yyyy = StringUtil.toNumber(from.substring(0,4));
		int f_mm   = StringUtil.toNumber(from.substring(4,6));
		int f_dd   = StringUtil.toNumber(from.substring(6));
		int t_yyyy = StringUtil.toNumber(to.substring(0,4));
		int t_mm   = StringUtil.toNumber(to.substring(4,6));
		int t_dd   = StringUtil.toNumber(to.substring(6));
		
		from_cal.set(f_yyyy, f_mm-1, f_dd);
		to_cal.set(t_yyyy, t_mm-1, t_dd);
		
		ArrayList rangeList = new ArrayList();
		while(from_cal.before(to_cal)){
			
			int    i_yyyy = from_cal.get(Calendar.YEAR);
			int    i_mm   = from_cal.get(Calendar.MONTH)+1;
			int    i_dd   = from_cal.get(Calendar.DATE);
			String yyyy   = String.valueOf(i_yyyy);
			String mm     = i_mm < 10 ? "0"+i_mm : String.valueOf(i_mm);
			String dd     = i_dd < 10 ? "0"+i_dd : String.valueOf(i_dd);	
			
			rangeList.add(yyyy + mm + dd);
			from_cal.add(Calendar.DATE, 7);
		}
		
		rangeList.add(to);
		
		return rangeList;
	}	


    public String getMonthLastFriday(String date){

		int year = Integer.parseInt(date.substring(0,4));
		int mon  = Integer.parseInt(date.substring(4,6));
		
		Calendar calendar = Calendar.getInstance( Locale.KOREA );
		calendar.set(Calendar.YEAR, year);
		calendar.set(Calendar.MONTH,mon);
		calendar.set(Calendar.DATE, 1);
		
		calendar.add(Calendar.DATE, -1);
		
		int day_of_week = calendar.get(Calendar.DAY_OF_WEEK);

//		일월화수목금토 : 1234567

		if(day_of_week == 1){
			calendar.add(Calendar.DATE, -2);
		}else if(day_of_week == 7){
			calendar.add(Calendar.DATE, -1);
		}
		
		return String.valueOf(calendar.get(Calendar.DATE));
    }
    
	
}
