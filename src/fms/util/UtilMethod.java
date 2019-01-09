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
	 * ������ �Ѱ��� masking(*)ó���Ѵ�.
	 * @param src maskingó���� ���ڿ�
	 * @param masking�� ������ġ
	 * @param masking�� ����
	 * @return maskingó���� ���ڿ�
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
	 * ������ �ΰ��� masking(*)ó���Ѵ�.
	 * @param src maskingó���� ���ڿ�
	 * @param masking�� ������ġ
	 * @param masking�� ����
	 * @param masking�� ������ġ
	 * @param masking�� ����
	 * @return maskingó���� ���ڿ�
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
	 * �Է°��� ���ʿ� ������ ���̸�ŭ Zero�� ä���� ��ȯ
	 *
	 * @param num ó���ϰ����ϴ� integer
	 * @param len ���ڿ� ��ü����
	 * @return ����ȹ��ڿ�
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
	
	//maxLength���� �� �Է¹��ڱ��̸� ������ ������ ���̸�ŭ �Է¹��� �����ʿ� �����Ǽ��ڸ� ä��
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
	
	//maxLength���� �� �Է¹��ڱ��̸� ������ ������ ���̸�ŭ �Է¹��� �����ʿ� �����Ǽ��ڸ� ä��
	public static String fillRndNum(int srcValue, int maxLimitLength){
		return fillRndNum(String.valueOf(srcValue), maxLimitLength);
	}
	
	//maxLength���� �� �Է¹��ڱ��̸� ������ ������ ���̸�ŭ �Է¹��� �����ʿ� ������ ä��
	public static String fillSpace(int srcData, int maxLength){
		char [] data = new char[maxLength];
		String str = srcData+"";
		if(str.length()>maxLength)return "";
		for(int i=0;i<str.length();i++){
			data[i]=str.charAt(i);
		}
		
		return new String(data);
	}
	
	//maxLength���� �� �Է¹��ڱ��̸� ������ ������ ���̸�ŭ �Է¹��� �����ʿ� ������ ä��
	public static String fillSpace(String srcData, int maxLength){
		int srcLength = srcData.getBytes().length;
		if(srcLength>maxLength)return "";
		byte [] data = new byte[maxLength-srcLength];
		String resultData=srcData + new String(data);
		return resultData;
	}
	
	//maxLength���� �� �Է¹��ڱ��̸� ������ ������ ���̸�ŭ �Է¹��� �����ʿ� ������ ä��  
	public static String fillSpace(long srcData, int maxLength){
		char [] data = new char[maxLength];
		String str = srcData+"";
		if(str.length()>maxLength)return "";
		
		for(int i=0;i<str.length();i++){
			data[i]=str.charAt(i);
		}
		
		return new String(data);
	}
	
	//�Ϳ����� ���ϱ�
	public static void getNextNormalDay(GregorianCalendar c){

		if(c.get(GregorianCalendar.DAY_OF_WEEK)==6)
			c.add(GregorianCalendar.DATE, 3);
		else if(c.get(GregorianCalendar.DAY_OF_WEEK)==7)
			c.add(GregorianCalendar.DATE, 2);
		else 
			c.add(GregorianCalendar.DATE, 1);
	}
	
	//�������� ���ϱ�
	public static GregorianCalendar getPreNormalDay(GregorianCalendar c){
		

		if(c.get(GregorianCalendar.DAY_OF_WEEK)==1)
			c.add(GregorianCalendar.DATE, -2);
		else if(c.get(GregorianCalendar.DAY_OF_WEEK)==2)
			c.add(GregorianCalendar.DATE, -3);
		else 
			c.add(GregorianCalendar.DATE, -1);
		
		return c;
	}
	
	//10������ 16������ ��ȯ
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
	
	//10������ 16������ ��ȯ
	/*public static String decimalToHexaDecimal(String decimal){
		return decimalToHexaDecimal(Long.parseLong(decimal.trim()));
	}
	
	//���ڷθ� �����Ǿ��ִ��� �˻�
	public static boolean isAllNumber(String str){
		return Pattern.matches("[0-9]+", str.trim());		
	}
	
	//���ĺ����θ� �����Ǿ��ִ��� �˻�
	public static boolean isAllAlphabet(String str){
		return Pattern.matches("[a-zA-Z]+", str.trim());		
	}*/
	

	//���� ��¥��  ��ȯ
	public static int getToday(){
		return Integer.parseInt(new SimpleDateFormat("yyyyMMdd").format(new Date()));
	}
	
	
	//����ð��� ��ȯ(24�ð�����)
	public static int getCurrentTime(){
		return Integer.parseInt(new SimpleDateFormat("HHmm").format(new Date()));
	}
	
	
	//�����ϴ� ��¥���� üũ
	public static boolean toBeDate(String chkDate){
		chkDate=chkDate.trim();
		int yyyy = Integer.parseInt(chkDate.substring(0, 4));
		int mm = Integer.parseInt(chkDate.substring(4, 6));
		int dd = Integer.parseInt(chkDate.substring(6));
	
		GregorianCalendar calendar = new GregorianCalendar(yyyy, mm - 1, dd, 0, 0, 0);
		String destDate = new SimpleDateFormat("yyyyMMdd").format(calendar.getTime());
		
		return destDate.equals(chkDate);
	}
	
	//�Է°��� '  "  \ ��(Ư������ 3����) �ִ��� üũ
//	public static boolean hasSpecialWord(String src){
//		return Pattern.compile("[\\\\'\"]+").matcher(src.trim()).find();
//	}
//	
//	//���� �Ǵ� �������θ� �����Ǿ� �ִ��� üũc
//	public static boolean isNumberOrAlphabet(String src){
//		return !Pattern.compile("[^0-9a-zA-Z]+").matcher(src.trim()).find();
//	}
	
	//���� �Ǵ� �������θ� �����Ǿ� �ִ��� üũ
	public static int i(int i){
		return i;
	}
	
	public static String loof(int i){
		String[] CMS_PAY_N_DATA_V2_B = new String[20000];
		for(int j=0; j<20000 ;j++){
			
			CMS_PAY_N_DATA_V2_B[i] = "Dsdsitest  Nmh_test0004         �׽�Ʈ              "+TranFormat.makeSpaceData(String.valueOf(i), 6)+"           10   01022223333                                                                                                                                                                                                                     \r\n";
		}
		return CMS_PAY_N_DATA_V2_B[i];
	}
}