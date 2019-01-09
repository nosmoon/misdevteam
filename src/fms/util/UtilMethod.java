package fms.util;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;
import java.util.Scanner;
/*import java.util.regex.Pattern;*/

import fms.common.tele.BATCH_CMS_Sample_Telegrams_New;

import fms.process.CMS.BatchCMS_V2.PAYMENT_TEST.CMS_PAY_APPLY_New;
import fms.util.TranFormat;


public class UtilMethod {
	private static SimpleDateFormat logFormat = new SimpleDateFormat("[yyyy-MM-dd HH:mm:ss] ");
	
	/**
	 * 전문의 한곳을 masking(*)처리한다.
	 * @param src masking처리할 문자열
	 * @param masking할 시작위치
	 * @param masking할 길이
	 * @return masking처리된 문자열
	 */
	public static String masking(String src, int startIndex, int length){
		byte [] b_src = src.getBytes();
		if(src==null || b_src.length<1||startIndex>=b_src.length||b_src.length<(startIndex+length)){
			throw new IllegalArgumentException();
		}
		byte [] b = new byte[length];
		for(int i=0;i<length;i++){
			b[i]=(byte)'*';
		}
		System.arraycopy(b, 0, b_src, startIndex, length);
		return new String(b_src);
	}
	
	/**
	 * 전문의 두곳을 masking(*)처리한다.
	 * @param src masking처리할 문자열
	 * @param masking할 시작위치
	 * @param masking할 길이
	 * @param masking할 시작위치
	 * @param masking할 길이
	 * @return masking처리된 문자열
	 */
	/*public static String masking(String src, int firstIndex, int firstLength, int secIndex, int secLength){
		if(src==null || src.length()<1||firstIndex>=src.length()||secIndex>=src.length()||
				src.length()<(firstIndex+firstLength)||src.length()<(secIndex+secLength)){
			throw new IllegalArgumentException();
		}
		
		StringBuffer sb = new StringBuffer(src);
		
		for(int i=0;i<firstLength;i++){
			sb.delete(firstIndex+i, firstIndex+i+1);
			sb.insert(firstIndex+i, '*');
		}
		
		for(int i=0;i<secLength;i++){
			sb.delete(secIndex+i, secIndex+i+1);
			sb.insert(secIndex+i, '*');
		}
		
		return sb.toString();
	}*/
	
	/**
	 * 입력값의 왼쪽에 지정한 길이만큼 Zero를 채워서 반환
	 *
	 * @param num 처리하고자하는 integer
	 * @param len 문자열 전체길이
	 * @return 변경된문자열
	 */
/*	public static String fillZero(int num, int len) {
		StringBuffer sb = new StringBuffer(len);
		int zeroCount = len - ("" + num).length();
		for (int i = 0; i < zeroCount; i++) {
			sb.append(0);
		}
		sb.append(num);
		return sb.toString();
	}*/
	
	//maxLength길이 중 입력문자길이를 제외한 나머지 길이만큼 입력문자 오른쪽에 임의의숫자를 채움
	public static String fillRndNum(String srcValue, int maxLimitLength){
		
		int inputLength=srcValue.length();
		int fillLength = maxLimitLength - inputLength;
		
		if(fillLength>0){
			Random rnd = new Random();
			int fillValue=0;
			do{
				fillValue=rnd.nextInt((int)Math.pow(10, fillLength)-1);
			}while(fillValue<=(int)Math.pow(10, fillLength-1));
			
			return srcValue+fillValue;
			
		}else if(fillLength<0){
			fillLength*=-1;
			return srcValue.substring(fillLength);
		}else{
			return srcValue;
		}
	}
	
	//maxLength길이 중 입력문자길이를 제외한 나머지 길이만큼 입력문자 오른쪽에 임의의숫자를 채움
	public static String fillRndNum(int srcValue, int maxLimitLength){
		return fillRndNum(String.valueOf(srcValue), maxLimitLength);
	}
	
	//maxLength길이 중 입력문자길이를 제외한 나머지 길이만큼 입력문자 오른쪽에 공백을 채움
	public static String fillSpace(int srcData, int maxLength){
		char [] data = new char[maxLength];
		String str = srcData+"";
		if(str.length()>maxLength)return "";
		for(int i=0;i<str.length();i++){
			data[i]=str.charAt(i);
		}
		
		return new String(data);
	}
	
	//maxLength길이 중 입력문자길이를 제외한 나머지 길이만큼 입력문자 오른쪽에 공백을 채움
	public static String fillSpace(String srcData, int maxLength){
		int srcLength = srcData.getBytes().length;
		if(srcLength>maxLength)return "";
		byte [] data = new byte[maxLength-srcLength];
		String resultData=srcData + new String(data);
		return resultData;
	}
	
	//maxLength길이 중 입력문자길이를 제외한 나머지 길이만큼 입력문자 오른쪽에 공백을 채움  
	public static String fillSpace(long srcData, int maxLength){
		char [] data = new char[maxLength];
		String str = srcData+"";
		if(str.length()>maxLength)return "";
		
		for(int i=0;i<str.length();i++){
			data[i]=str.charAt(i);
		}
		
		return new String(data);
	}
	
	//익영업일 구하기
	public static void getNextNormalDay(GregorianCalendar c){

		if(c.get(GregorianCalendar.DAY_OF_WEEK)==6)
			c.add(GregorianCalendar.DATE, 3);
		else if(c.get(GregorianCalendar.DAY_OF_WEEK)==7)
			c.add(GregorianCalendar.DATE, 2);
		else 
			c.add(GregorianCalendar.DATE, 1);
	}
	
	//전영업일 구하기
	public static GregorianCalendar getPreNormalDay(GregorianCalendar c){
		

		if(c.get(GregorianCalendar.DAY_OF_WEEK)==1)
			c.add(GregorianCalendar.DATE, -2);
		else if(c.get(GregorianCalendar.DAY_OF_WEEK)==2)
			c.add(GregorianCalendar.DATE, -3);
		else 
			c.add(GregorianCalendar.DATE, -1);
		
		return c;
	}
	
	//10진수를 16진수로 반환
	/*public static String decimalToHexaDecimal(long decimal){
		StringBuffer hex = new StringBuffer();
		
		char chr;
		while(decimal>=16){
			chr = (char)(decimal % 16 + 48);
			decimal = decimal / 16;
			if(chr>'9')chr += 7;
			hex.insert(0, chr);
		}
		
		chr = (char)(decimal + 48);
		if(chr>'9')chr += 7;
		hex.insert(0, chr);
		
		return hex.toString();
	}*/
	
	//10진수를 16진수로 반환
	/*public static String decimalToHexaDecimal(String decimal){
		return decimalToHexaDecimal(Long.parseLong(decimal.trim()));
	}
	
	//숫자로만 구성되어있는지 검사
	public static boolean isAllNumber(String str){
		return Pattern.matches("[0-9]+", str.trim());		
	}
	
	//알파벳으로만 구성되어있는지 검사
	public static boolean isAllAlphabet(String str){
		return Pattern.matches("[a-zA-Z]+", str.trim());		
	}*/
	

	//오늘 날짜를  반환
	public static int getToday(){
		return Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()));
	}
	
	
	//현재시간을 반환(24시간형식)
	public static int getCurrentTime(){
		return Integer.parseInt(new SimpleDateFormat("HHmm").format(new Date()));
	}
	
	
	//존재하는 날짜인지 체크
	public static boolean toBeDate(String chkDate){
		chkDate=chkDate.trim();
		int yyyy = Integer.parseInt(chkDate.substring(0, 4));
		int mm = Integer.parseInt(chkDate.substring(4, 6));
		int dd = Integer.parseInt(chkDate.substring(6));
	
		GregorianCalendar calendar = new GregorianCalendar(yyyy, mm - 1, dd, 0, 0, 0);
		String destDate = new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
		
		return destDate.equals(chkDate);
	}
	
	//입력값에 '  "  \ 가(특수문자 3가지) 있는지 체크
//	public static boolean hasSpecialWord(String src){
//		return Pattern.compile("[\\\\'\"]+").matcher(src.trim()).find();
//	}
//	
//	//숫자 또는 영문으로만 구성되어 있는지 체크c
//	public static boolean isNumberOrAlphabet(String src){
//		return !Pattern.compile("[^0-9a-zA-Z]+").matcher(src.trim()).find();
//	}
	
	//숫자 또는 영문으로만 구성되어 있는지 체크
	public static int i(int i){
		return i;
	}
	
	public static String loof(int i){
		String[] CMS_PAY_N_DATA_V2_B = new String[20000];
		for(int j=0; j<20000 ;j++){
			
			CMS_PAY_N_DATA_V2_B[i] = "Dsdsitest  Nmh_test0004         테스트              "+TranFormat.makeSpaceData(String.valueOf(i), 6)+"           10   01022223333                                                                                                                                                                                                                     \r\n";
		}
		return CMS_PAY_N_DATA_V2_B[i];
	}
}