package somo.framework.util;

import java.io.*;
import java.text.*;
import java.lang.*;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.servlet.http.*;

import somo.framework.expt.*;
import somo.framework.log.*;

/**
 *
 * <p>Company: (주)소프트온모바일</p>
 * <p>@version 1.0</p>
 * <p>@author SI 팀</p>
 * 범용적인 유틸리티 클래스<BR>
 * 상속을 허락하지 않고, static 타입의 메소드를 가진다.
 *
 */
public final class Util{

  final static int rawOffset = 9 * 60 * 60 * 1000;
  final static Locale currentLocale = Locale.KOREA;
  final static NumberFormat numberFormatter = NumberFormat.getNumberInstance(currentLocale);

  /**
   * 1일의 밀리세컨드.
   */
  final static long DAY_SECOND = 1000 * 60 * 60 * 24;

  /**
   * 현재시간을 매개변수의 날짜및시간 포맷에 맞게 변환하여 문자열로 리턴한다.
   *  (예) 매개변수가 "yyyyMMddhh" 이면 "2003010112"로 리턴
   * @param format SimpleDateFormat 타입의 날짜및시간 포맷
   * @return 포맷에 맞게 변환된 문자열
   */
  public static String getKST(String format){
    int millisPerHour = 60 * 60 * 1000;
    SimpleDateFormat fmt = new SimpleDateFormat(format);

    SimpleTimeZone timeZone = new SimpleTimeZone(9 * millisPerHour, "KST");
    fmt.setTimeZone(timeZone);

    long time = System.currentTimeMillis();
    String str = fmt.format(new java.util.Date(time));
    return str;
  }

  /**
   * 날짜시간표현 문자열을 매개변수로 받아서 첫번째 날짜시간포맷으로 변환한 뒤에 일자를 더한 후 두번째 날짜시간포맷으로 변환하여 리턴한다.
   * @param s 날짜시간표현 문자열
   * @param day 더할 일자
   * @param format1 변환하고 일자를 더할 날짜시간포맷
   * @param format2 변한하여 리턴할 날짜시간포맷
   * @return
   */
  public static String addDays(String s, int day, String format1,
                               String format2){
    java.text.SimpleDateFormat formatter1 =
        new java.text.SimpleDateFormat(format1, Util.currentLocale);
    java.text.SimpleDateFormat formatter2 =
        new java.text.SimpleDateFormat(format2, Util.currentLocale);

    java.util.Date date = null;
    try{
      date = formatter1.parse(s);
    } catch(java.text.ParseException e){
      FWLogManager.getInstance().log("Util.java", "addDays()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 java.text.SimpleDataFormat으로 변환가능해야 합니다.",
                                     "매개변수는 " + s + " 입니다.", false);
    }
    date.setTime(date.getTime() + ((long)day * 1000 * 60 * 60 * 24));
    return formatter2.format(date);
  }

  /**
   * 두 날짜 사이의 일자수를 리턴한다.
   * @param from 기준시작일자
   * @param to 기준종료일자
   * @param format1 기준시작일자를 변환할 날짜시간포맷
   * @param format2 기준종료일자를 변환할 날짜시간포맷
   * @return
   */
  public static int daysBetween(String from, String to, String format1,
                                String format2){
    java.text.SimpleDateFormat formatter1 =
        new java.text.SimpleDateFormat(format1, Util.currentLocale);
    java.text.SimpleDateFormat formatter2 =
        new java.text.SimpleDateFormat(format2, Util.currentLocale);

    java.util.Date d1 = null;
    java.util.Date d2 = null;

    try{
      d1 = formatter1.parse(from);
      d2 = formatter2.parse(to);
    } catch(java.text.ParseException e){
      FWLogManager.getInstance().log("Util.java", "daysBetween()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 java.text.SimpleDataFormat으로 변환가능해야 합니다.",
                                     "매개변수는 " + from + " 과 " + to + " 입니다.", false);
    }

    long duration = d2.getTime() - d1.getTime();

    return(int)(duration / (1000 * 60 * 60 * 24));
  }

  /**
   * 문자열의 길이가 기준 size크기가 되도록 '0'을 문자열앞에 덧붙인다.<BR>
   * 문자열의 길이기 기준 size보다 크거나 같으면 변화 없다.
   * @param str 입력 문자열
   * @param size 기준 크기
   * @return 변경 문자열
   */
  public static String addZero(String str, int size){
    String result = "";

    if(size <= str.length())
      return str;

    for(int i = 0; i < size - str.length(); i++)
      result = result + "0";

    return result + str;
  }

  /**
   * 매개변수 문자열이 null이면 ""를 리턴하고 null이 아니면 앞뒤의 공백문자를 제거한다.
   * @param str 입력 문자열
   * @return 변경 문자열
   */
  public static String checkString(String str){
    if(str != null)
      return replace(replace(replace(str.trim(),"	"," "),"&amp;","&"),"&quot;","\"");
    else
      return "";
  }

  /**
   * 매개변수 문자열에 포함된 특정문자의 수를 리턴한다.
   * @param str 입력문자열
   * @param ch 특정문자
   * @return 문자열에 포함된 특정문자의 갯수
   */
  public static int countChar(String str, char ch){
    int i;
    int count = 0;

    for(i = 0; i < str.length(); i++)
      if(str.charAt(i) == ch)
        count++;

    return count;
  }

  /**
   * 일반문자열을 ASCII 문자열로 변환한다.
   * @param str 입력문자열
   * @return ASCII 문자열
   */
  public static String escape(String str){
    String sTmp = "";
    char[] textArray = str.toCharArray();
    int iCnt = java.lang.reflect.Array.getLength(textArray);
    for(int i = 0; i < iCnt; i++){
      sTmp = sTmp + "/u" + (Integer.toHexString((int)textArray[i])).toUpperCase();
    }
    return sTmp;
  }

  /**
   * ASCII 문자열을 일반문자열로 변환한다.
   * @param str 입력 ASCII 문자열
   * @return 일반문자열
   */
  public static String unescape(String str){
    String sTmp = "";

    StringTokenizer st = new StringTokenizer(str, "/u");

    while(st.hasMoreTokens()){
      sTmp = sTmp + (char)Integer.parseInt(st.nextToken(), 16);
    }
    return sTmp;
  }

  /**
   * 8859_1 인코딩 문자열을 KSC5601 문자열로 변환한다.
   * @param uniStr 8859_1 문자열
   * @return KSC5601 문자열
   */
  public static String Uni2Ksc(String uniStr){
    String ret = null;
    try{
      String strEncoded = new String(uniStr.getBytes("8859_1"));
      if(uniStr.length() == strEncoded.getBytes("8859_1").length){
        ret = uniStr;
      }else{
        ret = new String(uniStr.getBytes("8859_1"), "KSC5601");
      }
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "Uni2Ksc()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 null이 아니어야 하고, 인코딩이 변환가능해야 합니다.",
                                     "null이 return 되었으며 매개변수는 " + uniStr +
                                     " 입니다.", false);
    }
    return ret;
  }

  /**
   * KSC5601 인코딩 문자열을 8859_1 문자열로 변환한다.
   * @param KscStr KSC5601 문자열
   * @return 8859_1 문자열
   */
  public static String Ksc2Uni(String KscStr){
    String ret = null;
    try{
      ret = new String(KscStr.getBytes("KSC5601"), "8859_1");
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "Ksc2Uni()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 null이 아니어야 하고, 인코딩이 변환가능해야 합니다.",
                                     "null이 return 되었으며 매개변수는 " + KscStr +
                                     " 입니다.", false);
    }
    return ret;
  }

  /**
   * 8859_1 인코딩 문자열을 euc-kr 문자열로 변환한다.
   * @param str 8859_1 문자열
   * @return euc-kr 문자열
   */
  public static String Uni2Euc(String uniStr){
    String ret = null;
    try{
      String strEncoded = new String(uniStr.getBytes("8859_1"));
      if(uniStr.length() == strEncoded.getBytes("8859_1").length){
        ret = uniStr;
      }else{
        ret = new String(uniStr.getBytes("8859_1"), "euc-kr");
      }
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "Uni2Euc()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 null이 아니어야 하고, 인코딩이 변환가능해야 합니다.",
                                     "null이 return 되었으며 매개변수는 " + uniStr +
                                     " 입니다.", false);
    }
    return ret;
  }

  /**
   * 8859_1 인코딩 문자열을 euc-kr 문자열로 변환한다.
   * @param str euc-kr 문자열
   * @return 8859_1 문자열
   */
  public static String Euc2Uni(String eucStr){
    String ret = null;
    try{
      ret = new String(eucStr.getBytes("euc-kr"), "8859_1");
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "Euc2Uni()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 null이 아니어야 하고, 인코딩이 변환가능해야 합니다.",
                                     "null이 return 되었으며 매개변수는 " + eucStr +
                                     " 입니다.", false);
    }
    return ret;
  }

  /**
   * 문자 하나(16byte)의 한글여부를 검사한다.<BR>
   * 자음한자 또는 모음한자는 한글판별이 되지 않으면, 완성된 글자(최소 : 자음 + 모음)이상만이 판별된다.
   * @param c 입력문자
   * @return 예/아니오
   */
  private static boolean isHangul(char c){
    if(c < 0xAC00 || 0xD7A3 < c){
      return false;
    } else{
      return true;
    }
  }

  /**
   * 문자열의 한글여부를 검사한다.<BR>
   * @param str 입력문자열
   * @return 예/아니오
   */
  public static boolean isHangul(String str){
    int len;

    if(str == null)
      return false;

    len = str.length();
    if(len == 0)
      return false;

    for(int i = 0; i < len; i++)
      if(!isHangul(str.charAt(i)))
        return false;

    return true;
  }

  /**
   * 정수값을 받아서 천단위 쉼표가 포함된 문자열을 리턴한다.
   * @param temp 입력 숫자
   * @return 변경 문자열
   */
  public static String formatNumber(int temp){
    String ret = null;
    try{
      ret = NumberFormat.getInstance().format(temp);
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "formatNumber()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 숫자로 표현되어야 합니다.",
                                     "매개변수는 " + temp + " 입니다. null이 리턴됩니다.", false);
    }
    return ret;
  }

  /**
   * long 타입의 값을 받아서 천단위 쉼표가 포함된 문자열을 리턴한다.
   * @param temp 입력 숫자
   * @return 변경 문자열
   */
  public static String formatNumber(long temp){
    String ret = null;
    try{
      ret = NumberFormat.getInstance().format(temp);
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "formatNumber()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 숫자로 표현되어야 합니다.",
                                     "매개변수는 " + temp + " 입니다. null이 리턴됩니다.", false);
    }
    return ret;
  }

  /**
   * double 타입의 값을 받아서 천단위 쉼표가 포함된 문자열을 리턴한다.
   * @param temp 입력 숫자
   * @return 변경 문자열
   */
  public static String formatNumber(double temp){
    String ret = null;
    try{
      ret = NumberFormat.getInstance().format(temp);
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "formatNumber()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 숫자로 표현되어야 합니다.",
                                     "매개변수는 " + temp + " 입니다. null이 리턴됩니다.", false);
    }
    return ret;
  }

  /**
   * double 타입의 값을 입력받아서 구분값이 "USD"이면 .00 포맷으로 변경하고 나머지는 소숫점이 없는 포맷으로 변경한다.<BR>
   * 정수부분은 천단위 쉼표를 삽입한다.
   * @param gubun 구분값
   * @param temp 입력 숫자
   * @return 변경 문자열
   */
  public static String formatNumber(String gubun, double temp){
    String ret = null;
    try{
      if(gubun.equals("USD")){
        DecimalFormat df = new DecimalFormat(",##0.00");
        ret = df.format(temp);
      } else{
        DecimalFormat df = new DecimalFormat(",##0");
        ret = df.format(temp);
      }
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "formatNumber()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 숫자로 표현되어야 합니다.",
                                     "매개변수는 " + temp + " 입니다. null이 리턴됩니다.", false);
    }
    return ret;
  }

  /**
   * long 타입의 값을 입력받아서 구분값이 "USD"이면 .00 포맷으로 변경하고 나머지는 소숫점이 없는 포맷으로 변경한다.<BR>
   * 정수부분은 천단위 쉼표를 삽입한다.
   * @param gubun 구분값
   * @param temp 입력 숫자
   * @return 변경 문자열
   */
  public static String formatNumber(String gubun, long temp){
    String ret = null;
    try{
      if(gubun.equals("USD")){
        DecimalFormat df = new DecimalFormat(",##0.00");
        ret = df.format(temp);
      } else{
        DecimalFormat df = new DecimalFormat(",##0");
        ret = df.format(temp);
      }
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "formatNumber()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 숫자로 표현되어야 합니다.",
                                     "매개변수는 " + temp + " 입니다. null이 리턴됩니다.", false);
    }
    return ret;
  }

  /**
   * 구분자( : , - . / )를 포함한 문자열을 입력받아 구분자를 제거한 문자열을 리턴한다.
   * @param str 입력 문자열
   * @return 변경 문자열
   */
  public static String unFormatDate(String str){
    StringBuffer strDate = new StringBuffer();

    if(str == null || str.length() == 0)
      return "";

    for(int i = 0; i < str.length(); i++){
      if(str.charAt(i) == '-' || str.charAt(i) == ':' || str.charAt(i) == '/')
        continue;
      strDate.append(str.charAt(i));
    }

    return strDate.toString();
  }

  /**
   * 입력문자열에서 숫자를 찾아서 int 타입으로 변환하여 리턴한다.<BR>
   * 문자열이 숫자로 시작되어야 하고, 최초의 숫자표현 문자들만 숫자로 인식된다.
   * @param str 입력문자열
   * @return 변경 숫자
   */
  public static int unFormatInt(String str){
    int ret = 0;
    try{
      ret = NumberFormat.getInstance().parse(str).intValue();
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "unFormatInt()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 숫자로 시작되어야 합니다.",
                                     "매개변수는 " + str + " 입니다. 0 이 리턴됩니다.", false);
    }
    return ret;
  }

  /**
   * 입력문자열에서 숫자를 찾아서 long 타입으로 변환하여 리턴한다.<BR>
   * 문자열이 숫자로 시작되어야 하고, 최초의 숫자표현 문자들만 숫자로 인식된다.
   * @param str 입력문자열
   * @return 변경 숫자
   */
  public static long unFormatLong(String str){
    long ret = 0;
    try{
      ret = NumberFormat.getInstance().parse(str).longValue();
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "unFormatInt()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 숫자로 시작되어야 합니다.",
                                     "매개변수는 " + str + " 입니다. 0 이 리턴됩니다.", false);
    }
    return ret;
  }

  /**
   * 입력문자열에서 숫자를 찾아서 double 타입으로 변환하여 리턴한다.<BR>
   * 문자열이 숫자로 시작되어야 하고, 최초의 숫자표현 문자들만 숫자로 인식된다.
   * @param str 입력문자열
   * @return 변경 숫자
   */
  public static double unFormatDouble(String str){
    double ret = 0;
    try{
      ret = NumberFormat.getInstance().parse(str).doubleValue();
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "unFormatInt()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 숫자로 시작되어야 합니다.",
                                     "매개변수는 " + str + " 입니다. 0 이 리턴됩니다.", false);
    }
    return ret;
  }

  /**
   * 13자리 주민등록번호 문자열을 입력받아 주민등록번호 구분자(-)를 포함한 문자열로 변경하여 리턴한다.
   * @param str 입력 문자열
   * @return 변경 문자열
   */
  public static String FormatJumin(String str){
    String ret = null;
    try{
      int iLen = str.length();
      if(iLen == 13){
        ret = str.substring(0, 6) + "-" + str.substring(6);

      } else if(iLen == 14){
        ret = str;
      } else{
        throw new Exception();
      }
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "FormatJumin()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 13 또는 14자리 문자열이어야 합니다.",
                                     "매개변수는 " + str + " 입니다. null 이 리턴됩니다.", false);
    }
    return ret;
  }

  /**
   * 주민등록번호 구분자(-)를 포함한 문자열을 입력받아서 구분자를 제거한 문자열을 리턴한다.
   * @param str 입력 문자열
   * @return 변경 문자열
   */
  public static String unFormatJumin(String str){
    String ret = null;
    try{
      int iLen = str.length();
      if(iLen == 14){
        ret = str.substring(0, 6) + str.substring(7);

      } else if(iLen == 13){
        ret = str;
      } else{
        throw new Exception();
      }
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "unFormatJumin()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 13 또는 14자리 문자열이어야 합니다.",
                                     "매개변수는 " + str + " 입니다. null 이 리턴됩니다.", false);
    }
    return ret;
  }

  /**
   * 10자리 사업자등록번호 문자열을 입력받아 사업자등록번호 구분자(-)를 포함한 문자열로 변경하여 리턴한다.
   * @param str 입력 문자열
   * @return 변경 문자열
   */
  public static String FormatBiz(String str){
    String ret = null;
    try{
      int iLen = str.length();
      if(iLen == 10){
        ret = str.substring(0, 3) + "-" + str.substring(3, 5) + "-" +
            str.substring(5);

      } else if(iLen == 12){
        ret = str;
      } else{
        throw new Exception();
      }
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "FormatBiz()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 10 또는 12자리 문자열이어야 합니다.",
                                     "매개변수는 " + str + " 입니다. null 이 리턴됩니다.", false);
    }
    return ret;
  }

  /**
   * 사업자등록번호 구분자(-)를 포함한 문자열을 입력받아서 구분자를 제거한 문자열을 리턴한다.
   * @param str 입력 문자열
   * @return 변경 문자열
   */
  public static String unFormatBiz(String str){
    String ret = null;
    try{
      int iLen = str.length();
      if(iLen == 12){
        ret = str.substring(0, 3) + str.substring(4, 6) + str.substring(7);

      } else if(iLen == 10){
        ret = str;
      } else{
        throw new Exception();
      }
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "unFormatBiz()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 10 또는 12자리 문자열이어야 합니다.",
                                     "매개변수는 " + str + " 입니다. null 이 리턴됩니다.", false);
    }
    return ret;
  }

  /**
   * 입력문자열에서 Carrige-Return값을 찾아  <BR> 로 변경된 문자열을 리턴한다
   * @param input 입력 문자열
   * @return 변경 문자열
   */
  public static String ConRnToBr(String input){

    String str = null;

    byte b[] = input.getBytes();

    int offset = 0;
    for(int i = 0; i < b.length; i++){
      if(b[i] == 13 && b[i + 1] == 10){
        int len = i - offset;
        str += new String(b, offset, len) + "<br>";
        i = i + 1;
        offset = i;
      }
    }

    if(offset < b.length){
      int len = b.length - offset;
      str += new String(b, offset, len);
    }

    return str;
  }
  /**
   * 한글 인코딩이 필요한 경우 encoding 처리 한다.
   * @param str
   * @return String
   */
  public static String toKsc(String str){
    String ret = null;
    try{

      String strEncoded = new String(str.getBytes("8859_1"));
      if(str.length() == strEncoded.getBytes("8859_1").length){
        ret = str;
      } else{
        ret = Uni2Euc(str);
      }
    }catch(UnsupportedEncodingException e){
      FWLogManager.getInstance().log("Util.java", "toKor()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수가 null이 아니어야 하고, 인코딩이 변환가능해야 합니다.",
                                     "null이 return 되었으며 매개변수는 " + str +
                                     " 입니다.", false);
    }
    return ret;
  }

  /**
   * Timestamp 타입을 기본형식의 날짜포맷(yyyy/MM/dd) 문자열으로 변환하여 리턴한다.
   * @param stamp   변환할 Timestamp 객체
   * @return        변환된 문자열
   */
  public static String Timestamp2Str(java.sql.Timestamp stamp){
    if(stamp != null){
      return Timestamp2Str(stamp, null);
    } else{
      return "";
    }
  }

  /**
   * Timestamp 타입을 특정 형식의 날짜포맷 문자열으로 변환하여 리턴한다.
   * @param stamp     변환할 Timestamp 객체
   * @param dateType  변환기준 날짜 표현 포맷
   * @return          변환된 문자열
   */
  public static String Timestamp2Str(java.sql.Timestamp stamp,  String dateType){
    if(stamp == null){
      return "";
    }else{
      String strDate = null;
      if(dateType == null || "".equals(dateType)){
        dateType = "yyyy/MM/dd";
      }
      java.text.SimpleDateFormat formatter = new java.text.SimpleDateFormat(
          dateType, Util.currentLocale);
      strDate = formatter.format(stamp);
      if(strDate == null){
        strDate = "";
      }
      return strDate;
    }
  }

  /**
   * Date 타입을 기본형식의 날짜포맷(yyyy/MM/dd) 문자열으로 변환하여 리턴한다.
   * @param       변환할 Date 객체
   * @return      변환된 문자열
   */
  public static String Date2Str(java.util.Date date){
    return Date2Str(date, null);
  }

  /**
   * Date 타입을 특정 형식의 날짜포맷 문자열으로 변환하여 리턴한다.
   * @param date      변환할 Date 객체
   * @param dateType  변환기준 날짜 표현 포맷
   * @return          변환된 문자열
   */
  public static String Date2Str(java.util.Date date, String dateType){
    String strDate = null;
    if(dateType == null || "".equals(dateType))
      dateType = "yyyy/MM/dd";
    java.text.SimpleDateFormat formatter =
        new java.text.SimpleDateFormat(dateType, Util.currentLocale);
    strDate = formatter.format(date);
    if(strDate == null){
      strDate = "";
    }
    return strDate;
  }



  /**
   * 문자열을 Calendar 객체로 변환한다.
   * @param	dateStr 데이트 스트링
   * @param	format 포맷
   *			예 - 'yyyyMMdd'
   * @return	Calendar
   */
  public static Calendar toCalendar(String dateStr, String format){
    Calendar cal = null;
    Date date = toDate(dateStr, format);
    cal = Calendar.getInstance();
    cal.setTime(date);
    return cal;
  }

  /**
   * 문자열을 Date 객체로 변환한다.
   * @param	dateStr 데이트 스트링
   * @param	format 포맷
   *			예 - 'yyyyMMdd'
   * @return	Date
   */
  public static Date toDate(String dateStr, String format){
    SimpleDateFormat sdf = null;
    Date date = null;
    try{
      sdf = new SimpleDateFormat(format, Locale.KOREA);
      date = sdf.parse(dateStr);
    } catch(java.text.ParseException e){
      FWLogManager.getInstance().log("Util.java", "toDate()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수는 날짜표현 포맷이어야 합니다.",
          "null이 return 되었으며 매개변수는 " + dateStr +
          " 입니다.", false);
    }
    return date;
  }


  /**
   * from date 부터 offset 만큼 더한 일을 리턴한다.
   *
   * @param	from date. 'YYYYMMDD' 형식이다.
   * @param	offset.
   * @return	to date. 'YYYYMMDD' 형식이다.
   * @exception	java.text.ParseException
   */
  public static String addDate(String fromDt, int offset)
  throws java.text.ParseException {
          return	addDate(fromDt, Calendar.DATE, offset);
  }
  /**
   * from date 부터 offset 만큼의 월을 더한 일을 리턴한다.
   *  (예) addMonth("20040101", 3) return "20040401"
   * @param fromDt
   * @param offset
   * @return
   * @throws java.text.ParseException
   */
  public static String addMonth(String fromDt, int offset) throws java.text.ParseException{
    String strDate = null;
    try{
      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
      Date fromDate = sdf.parse(fromDt);
      Calendar cal = Calendar.getInstance();
      cal.setTime(fromDate);
      cal.add(Calendar.MONTH, offset);
      Date toDate = cal.getTime();
      strDate = sdf.format(toDate);
    } catch(java.text.ParseException e){
      FWLogManager.getInstance().log("Util.java", "addMonth()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수는 날짜표현 포맷이어야 합니다.",
          "null이 return 되었으며 매개변수는 " + fromDt +
          " 입니다.", false);
    }
    return strDate;
  }
  /**
   * 시작일자표현 문자열에서 field 의 offset 만큼 떨어진 일자표현 문자열을 리턴한다.
   * @param	from date. 'YYYYMMDD' 형식이다.
   * @param	field.
   * @param	offset.
   * @return	to date. 'YYYYMMDD' 형식이다.
   */
  public static String addDate(String fromDt, int field, int offset){
    String strDate = null;
    try{
      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);
      Date fromDate = sdf.parse(fromDt);
      Calendar cal = Calendar.getInstance();
      cal.setTime(fromDate);
      cal.add(field, offset);
      Date toDate = cal.getTime();
      strDate = sdf.format(toDate);
    } catch(java.text.ParseException e){
      FWLogManager.getInstance().log("Util.java", "addDate()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수는 날짜표현 포맷이어야 합니다.",
          "null이 return 되었으며 매개변수는 " + fromDt +
          " 입니다.", false);
    }
    return strDate;
  }

  /**
   * 일 수를 구한다.
   *
   * @param	From 일. 형식은 'YYYYMMDD'이다.
   * @param	To 일. 형식은 'YYYYMMDD'이다.
   * @return	일 수.
   * @exception	java.text.ParseException
   */
  public static int getDays(String fromDt, String toDt){
    int days = 0;
    try{
      SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMdd", Locale.KOREA);

      Date d1 = sdf.parse(fromDt);
      Date d2 = sdf.parse(toDt);

      long from = d1.getTime();
      long to = d2.getTime();
      long times = to - from;

      days = (int)(times / DAY_SECOND);
    } catch(java.text.ParseException e){
      FWLogManager.getInstance().log("Util.java", "getDays()", e,
          "유틸리티 메소드를 호출하는 과정에서 예외가 발생했습니다. 매개변수는 날짜표현 포맷이어야 합니다.",
          "0 이 return 되었으며 매개변수는 " + fromDt + ", "+ toDt + " 입니다.", false);
    }
    return days;
  }


  /**
   * 날짜 문자열을 입력받아 알맞은 형태로 날짜를 반환한다.
   * @param format  날짜 포맷 문자열
   * @param field   년, 월, 일 구분자
   * @param offset  변환치
   * @return String 변경된 날짜 문자열
   */
  public static String getFormatDate(String format, int field, int offset){
    SimpleTimeZone stz = new SimpleTimeZone(rawOffset, "KST");
    Calendar rightNow = Calendar.getInstance(stz);

    if(offset != 0){
      rightNow.add(field, offset);
    }

    Date rightDate = rightNow.getTime();
    SimpleDateFormat sdf = new SimpleDateFormat(format);
    sdf.setTimeZone(stz);

    return sdf.format(rightDate);
  }


  /**
   * 현재일에서 offset 만큼 더하거나 뺀 년월일을 yyyyMMdd 포맷으로 리턴한다
   * @param offset offset
   * @return String yyyyMMdd 포맷의 년월일
   */
  public static String getDate2(int offset) {
    return getFormatDate("yyyyMMdd", Calendar.DATE, offset);
  }

  public static String getMonth2(int offset) {
    return getFormatDate("yyyyMMdd", Calendar.MONTH, offset);
  }

  public static String getYear2(int offset) {
    return getFormatDate("yyyyMMdd", Calendar.YEAR, offset);
  }

  public static String getDay() {
    return getFormatDate("dd", 0, 0);
  }

  /**
   * 현재 년월일을 yyyyMMdd 포맷으로 리턴한다
   * @return String yyyyMMdd 포맷의 년월일
   */
  public static String getDate() {
    return getFormatDate("yyyyMMdd", 0, 0);
  }

  /**
   * 현재 년월일을 yyyy/MM/dd 포맷으로 리턴한다
   * @return String yyyy/MM/dd 포맷의 년월일
   */
  public static String getDate2() {
    return getFormatDate("yyyy/MM/dd", 0, 0);
  }

  /**
   * 현재 년월일을 yyyy/MM/dd HH:mm 포맷으로 리턴한다
   * @return String yyyy/MM/dd HH:mm 포맷의 년월일
   */
  public static String getDate3() {
    return getFormatDate("yyyy/MM/dd HH:mm", 0, 0);
  }

  /**
   * 현재 년을 yyyy 포맷으로 리턴한다
   *
   * @return String yyyy 포맷의 년
   */
  public static String getYear() {
    return getFormatDate("yyyy", 0, 0);
  }

  /**
   * 현재 월을 MM 포맷으로 리턴한다
   * @return String MM
   */
  public static String getMonth() {
    return getFormatDate("MM", 0, 0);
  }

  /**
   * 현재 월을 M 포맷으로 리턴한다
   * @return String M
   */
  public static String getMonth2() {
    return getFormatDate("M", 0, 0);
  }

  /**
   * 현재 년월을 yyyyMM 포맷으로 리턴한다
   * @return String yyyy\MM 포맷의 년월
   */
  public static String getYyyyMm() {
    return getFormatDate("yyyyMM", 0, 0);
  }

  /**
   * 현재 시각을 HH:mm 포맷으로 리턴한다
   * @return String HH:mm 포맷의 시각
   */
  public static String getTime() {
    return getFormatDate("HH:mm", 0, 0);
  }

  /**
   * 숫자에 3자리마다 comma를 붙인다.
   * @param	number
   * @return	String
   */
  public static String comma(int number) {
    return numberFormatter.format(number);
  }

  /**
   * 숫자에 3자리마다 comma를 붙인다.
   * @param	number
   * @return	String
   */
  public static String comma(long number) {
    return numberFormatter.format(number);
  }

  /**
   * 숫자에 3자리마다 comma를 붙인다.
   * @param	number
   * @return	String
   */
  public static String comma(double number) {
    DecimalFormat doubleFormatter = new DecimalFormat("###,##0.####");
    return doubleFormatter.format(number);
  }

  /**
   * 숫자에 3자리마다 comma를 붙인다.
   * @param	number
   * @return	String
   */
  public static String comma(Object number) {
    DecimalFormat doubleFormatter = new DecimalFormat("###,##0.####");
    return doubleFormatter.format(number);
  }

  /**
   * 숫자에 3자리마다 comma를 붙인다.
   * 소수 2자리까지 표현한다.
   * @param	number
   * @return	String
   */
  public static String comma2(double number) {
    DecimalFormat doubleFormatter = new DecimalFormat("###,##0.00");
    return doubleFormatter.format(number);
  }

  /**
   * 숫자에 3자리마다 comma를 붙인다.
   * 소수 3자리까지 표현한다.
   * @param	number
   * @return	String
   */
  public static String comma3(double number) {
    DecimalFormat doubleFormatter = new DecimalFormat("###,##0.000");
    return doubleFormatter.format(number);
  }

  /**
   * 숫자에 3자리마다 comma를 붙인다.
   * 소수 4자리까지 표현한다.
   * @param	number
   * @return	String
   */
  public static String comma4(double number) {
    DecimalFormat doubleFormatter = new DecimalFormat("###,##0.0000");
    return doubleFormatter.format(number);
  }

  /**
   * number를 좌측에서 0으로 채움.
   * @param	number
   * @return	String
   */
  public static String lpad(int number) {
    DecimalFormat intFormatter = new DecimalFormat("000");
    return intFormatter.format(number);
  }

  /**
   * 문자열을 입력받아 문자열 중 개행문자를 <BR>문자열로 변환하여 리턴한다.
   * @param str       입력 문자열
   * @param replace   입력문자열이 null일 경우 대신 리턴할 문자열
   * @return          변환된 문자열
   */
  public static String N2BR(String str, String replace){
    StringBuffer tempStr = new StringBuffer("");
    char tempChar;
    if(str == null){
      return replace;
    }
    for(int index = 0; index < str.length(); index++){
      tempChar = str.charAt(index);
      if(tempChar == '\n')
        tempStr.append("<BR>");
      else
        tempStr.append(tempChar);
    }
    return tempStr.toString();
  }

  /**
   * 문자열을 입력받아 문자열 중 개행문자를 &nbsp; 문자열로 변환하여 리턴한다.
   * @param str   입력 문자열
   * @return      변환된 문자열
   */
  public static String N2NBSP(String str) {
    StringBuffer tempStr = new StringBuffer("");
    char tempChar;
    if(str == null){
      return new String("&nbsp;");
    }
    for(int index = 0; index < str.length(); index++){
      tempChar = str.charAt(index);
      if(tempChar == '\n')
        tempStr.append("<BR>");
      else
        tempStr.append(tempChar);
    }

    return tempStr.toString();
  }

  /**
   * 여부(Y/N)에 대해 "예", "아니오"로 바꾸어 준다.
   * @param	Y 또는 N 문자열
   * @return	Y -> 예, N -> 아니오, null -> "", 기타 -> 변경없음
   */
  public static String convertYn(String str){
    String yesno = null;
    if(str == null){
      yesno = "";
    }

    if(str.equals("Y")){
      yesno = "예";
    } else if(str.equals("N")){
      yesno = "아니오";
    }

    return yesno;
  }

  /**
   * Y/N 또는 1/0 에 대해 str1, str2로 바꾸어 준다.
   * @param str   입력문자열
   * @param str1  입력문자열이 Y 또는 1 인경우 변경될 문자열
   * @param str2  입력문자열이 N 또는 0 인경우 변경될 문자열
   * @return      Y 또는 1 인경우 str1, N 또는 0 인경우 str2
   */
  public static String convertYn(String str, String str1, String str2){
    String yesno = null;
    if(str == null){
      yesno = "";
    }

    if(str.equals("Y") || str.equals("1")){
      yesno = str1;
    } else if(str.equals("N") || str.equals("0")){
      yesno = str2;
    }

    return yesno;
  }

  /**
   * 날짜 표현 중 중간구분문자를 제외한 8자리 문자열을 리턴한다.
   * 입력문자열이 8자리보가 길어야 하며, 작거나 같으면 그대로 리턴한다.
   * 2002/01/01 -> 20020101
   * @param date  입력 날짜 표현 문자열
   * @return      구분문자를 제외한 문자열 (YYYYMMDD)
   */
  public static String trimDate(String date) {
    String str = null;
    if(date == null){
      str = "";
    }
    date = date.trim();
    if(date.length() > 8){
      str = date.substring(0, 4) + date.substring(5, 7) + date.substring(8);
    }
    return str;
  }

  /**
   * 8자리 날짜표현 문자열을 구분자를 포함하는 문자열로 변환한다.
   * 입력문자열이 8자리가 아닌경우는 그대로 리턴한다.
   * @param	8자리 날짜표현 문자열
   * @param	구분자 문자열) ( - , / , : 기타)
   * @return	구분자를 포함한 문자열
   */
  public static String convertDate(String date, String division) {
    String str = null;
    if(date == null){
      str = "";
    }
    date = date.trim();
    if(date.length() == 8){
      str = date.substring(0, 4) + division + date.substring(4, 6) + division +
          date.substring(6);
    }else{
      str = date;
    }
    return str;
  }

  /**
   * 8자리 문자열을 / 구분자를 포함하여 리턴한다.
   * 20020101 --> 2002/01/01
   * @param	입력문자열
   * @return	/ 포함문자열
   */
  public static String convertS(String date) {
    return convertDate(date, "/");
  }

  /**
   * 8자리 문자열을 - 구분자를 포함하여 리턴한다.
   * 20020101 --> 2002-01-01
   * @param	입력문자열
   * @return	- 포함문자열
   */
  public static String convertD(String date) {
    return convertDate(date, "-");
  }

  /**
   * 8자리 문자열을 : 구분자를 포함하여 리턴한다.
   * 20020101 --> 2002:01:01
   * @param	입력문자열
   * @return	: 포함문자열
   */
  public static String convertC(String date) {
    return convertDate(date, ":");
  }

  /**
   * 시스템 날짜에 해당하는 분기를 리턴.
   * @return	1, 2, 3 또는 4
   */
  public static String getQuarter(){
    String yyyyMm = getYyyyMm();
    String mm = yyyyMm.substring(4, 6);
    String quarter = new String();
    if(mm.equals("01") || mm.equals("02") || mm.equals("03")){
      quarter = "1";
    } else if(mm.equals("04") || mm.equals("05") || mm.equals("06")){
      quarter = "2";
    } else if(mm.equals("07") || mm.equals("08") || mm.equals("09")){
      quarter = "3";
    } else if(mm.equals("10") || mm.equals("11") || mm.equals("12")){
      quarter = "4";
    }
    return quarter;
  }

  /**
   * 두자리 숫자(월)에 해당하는 분기를 리턴
   * @param mm  월 을 표현하는 2자리 숫자
   * @return    해당월의 분기숫자 1, 2, 3 또는 4
   */
  public static String getQuarter(String mm){

    String quarter = null;
    if(mm.equals("01") || mm.equals("02") || mm.equals("03")){
      quarter = "1";
    } else if(mm.equals("04") || mm.equals("05") || mm.equals("06")){
      quarter = "2";
    } else if(mm.equals("07") || mm.equals("08") || mm.equals("09")){
      quarter = "3";
    } else if(mm.equals("10") || mm.equals("11") || mm.equals("12")){
      quarter = "4";
    }
    return quarter;
  }

  /**
   *  콤마달린 숫자를 문자열로써 받아서 콤마가 제거된 문자열로 넘긴다
   * @param   콤마 포함 문자열
   * @return  콤마 제거 문자열
   */
  public static String deComma(String str){

    StringTokenizer st = new StringTokenizer(str, ",");
    StringBuffer temp = new StringBuffer();
    while(st.hasMoreTokens()){
      temp.append(st.nextToken());

    }
    str = temp.toString();
    return str;
  }

  /**
   * 입력문자열의 날짜가 속하는 달의 마지막일자를 리턴한다.
   * @param	8자리 'YYYYMMDD' 문자열
   * @return	28, 29, 30, 31 해당 달으 마지막 일자
   */
  public static String getLastDay(String date){
    int iyear = Integer.parseInt(date.substring(0, 4));
    int imonth = Integer.parseInt(date.substring(4, 6));
    int lastDayOfMonth = 0;
    String rDate = null;

    if(iyear < 1 || imonth < 1 || imonth > 12){
      return "";
    }

    switch(imonth){
      case 1:
      case 3:
      case 5:
      case 7:
      case 8:
      case 10:
      case 12:
        lastDayOfMonth = 31;
        break;
      case 4:
      case 6:
      case 9:
      case 11:
        lastDayOfMonth = 30;
        break;
      case 2:
        lastDayOfMonth = (((iyear % 4 == 0) && (iyear % 100 != 0)) ||
                          (iyear % 400 == 0)) ? 29 : 28;
        break;
    }

    rDate = ((iyear < 10) ? ("000" + String.valueOf(iyear)) :
             ((iyear < 100) ? ("00" + String.valueOf(iyear)) :
              ((iyear < 1000) ? ("0" + String.valueOf(iyear)) :
               String.valueOf(iyear))))
        +
        ((imonth < 10) ? ("0" + String.valueOf(imonth)) : String.valueOf(imonth))
        +
        ((lastDayOfMonth < 10) ? ("0" + String.valueOf(lastDayOfMonth)) :
         String.valueOf(lastDayOfMonth));
    return rDate;
  }

   /**
   * @param	str		절단할 문자열
   * @param	index	절단된 문자열이 저장될 배열의 인덱스(리턴배열)
   * @param	cnt		절단된 토큰이 저장될 배열의 크기
   * @return		String
   */
  public static String returnToken(String str, int index, int cnt){

          String[] s = new String[cnt];
          int i = 0;
          StringTokenizer st = new StringTokenizer(str,":");
          while (st.hasMoreTokens()) {
                  s[i] = st.nextToken();
                  i++;
          }
          return s[index];
  }

  /**
   * 특정길이만큼 특정문자를 채운 문자열을 리턴한다.
   * @param	입력문자열
   * @param	채워질 문자열
   * @param	채워질 길이
   * @return	String	문자
   *
   */
  public static String getFormStr(String str, String format, int num){
    String temp = "";
    if(str == null){
      str = "";
    }
    byte[] b = str.getBytes();
    int len = num - b.length;
    for(int i = 0; i < len; i++){
      temp += format;
    }
    if(format == "0"){
      str = temp + str;
    } else{
      str = str + temp;
    }
    return str;
  }


  /**
   * 특정길이만큼 공백문자를 채운 문자열을 리턴한다.
   * @param	채워질 길이
   * @return	공백문자로 채워진 문자열
   *
   */
  public static String getFormSpace(int num){
          String	temp = "";
            for (int i=0; i < num; i++){
              temp += " ";
          }

          return temp;
  }

  /**
   * 소숫점 숫자를 소숫점숫자로 반올림한다.
   * @param	숫자
   * @param	자리수
   * @return	double
   */
  public static double round(double d, int p) {
          long tmp = (long)Math.pow(10, p);
          double num = Math.round(d * tmp);
          num /= tmp;
          return	num;
  }

  /**
   * 소숫점 숫자를 소숫점숫자로 절상한다.
   * @param	숫자
   * @param	자리수
   * @return	double
   */
  public static double ceil(double d, int p) {
          long tmp = (long)Math.pow(10, p);
          double num = Math.ceil(d * tmp);
          num /= tmp;
          return	num;
  }

  /**
   * 소숫점 숫자를 소숫점숫자로 절사한다.
   * @param	숫자
   * @param	자리수
   * @return	double
   */
  public static double floor(double d, int p) {
          long tmp = (long)Math.pow(10, p);
          double num = Math.floor(d * tmp);
          num /= tmp;
          return	num;
  }

  /**
   * 외화금액에 대하여 단수처리한다.(소수 3자리 반올림)
   *
   * @param	amt 금액
   * @return	double
   */
  public static double formatAmtF(double amt) {
          return	round(amt, 2);
  }

  /**
   * 원화금액에 대하여 단수처리한다.(원미만 절사)
   *
   * @param	amt 금액
   * @return	double
   */
  public static long formatAmtW(double amt) {
          return	(long)floor(amt, 0);
  }

  /**
   * 문자열중의 특정스트링을 변환하는 함수
   *
   * @param	str		원래문자열
   * @param	token	바뀔문자열
   * @param 	to		바꿀문자열
   * @return	String
   */
  public static String replace(String str, String token, String to) {
          String resultStr = "";
          int idx = -1;
          while((idx = str.indexOf(token)) != -1) {
                  resultStr += str.substring(0, idx) + to;
                  str = str.substring(idx + token.length());
          }
          resultStr += str;

          return resultStr;
  }

  /**
   * 문자에서 Hyphen을 없앤다.
   *
   * @param	str
   * @return	String
   */
  public static String deleteHyphen(String str) {
          String temp = "";

          if(str == null || str.equals("")) {
                   return str;
           }

          for (int i = 0; i < str.length() ; i++) {
                  if (str.charAt(i) == '-') {
                          continue;
                  } else {
                          temp += str.charAt(i);
                  }
          }

          return	temp;
  }


  /**
   * 소숫점 숫자를 정수로 반올림한다.
   *
   * @param	숫자
   * @param	자리수
   * @return	반올림된 정수
   */
  public static long roundL(double d, int p) {
          double tmp = Math.pow(10, p);
          return Math.round(d / tmp) * (long)tmp;
  }

  /**
   * 소숫점 숫자를 정수로 절상한다.
   *
   * @param	숫자
   * @param	자리수
   * @return	절상된 정수
   */
  public static long ceilL(double d, int p) {
          double tmp = Math.pow(10, p);
          return (long)Math.ceil(d / tmp) * (long)tmp;
  }

  /**
   * 소숫점 숫자를 정수로 절사한다.
   *
   * @param	숫자
   * @param	자리수
   * @return	절사된 정수
   */
  public static long floorL(double d, int p) {
          double tmp = Math.pow(10, p);
          return (long)Math.floor(d / tmp) * (long)tmp;
  }


  /**
   * 숫자표현 금액문자열을 한글표현 금액문자열로로 변환하여 리턴한다.
   * 1234 일천2백삼십사
   * @param	입력문자열
   * @return	한글표현 문자열
   */
  public static String convPrice(String amt)
  {
          String danwee = "";
          String price = "";
          String flag = "N";
          int amtLen = amt.length();

           for(int i = 1; i <= amtLen; i++) {

                  switch (amt.charAt(amtLen - i)) {

                          case '1' :
                                  danwee = "일";
                                  break;
                          case '2' :
                                  danwee = "이";
                                  break;
                          case '3' :
                                  danwee = "삼";
                                  break;
                          case '4' :
                                  danwee = "사";
                                  break;
                          case '5' :
                                  danwee = "오";
                                  break;
                          case '6' :
                                  danwee = "육";
                                  break;
                          case '7' :
                                  danwee = "칠";
                                  break;
                          case '8' :
                                  danwee = "팔";
                                  break;
                          case '9' :
                                  danwee = "구";
                                  break;
                          case '0' :
                                  continue;
                  }

                  if (i == 1) {
                          price = danwee;
                          continue;
                  }

                  switch ((i - 1) % 4) {
                          case 1 :
                                  danwee = danwee + "십";
                                  break;
                          case 2 :
                                  danwee = danwee + "백";
                                  break;
                          case 3 :
                                  danwee = danwee + "천";
                                  break;
                          case 0 :
                                  break;
                  }

                  if (i > 4 && i < 9 && !flag.equals("M")) {
                          danwee = danwee + "만";
                          flag = "M";
                  }
                  if (i >= 9 && i < 13 && !flag.equals("U")) {
                          danwee = danwee + "억";
                          flag = "U";
                  }
                  if (i >= 13 && !flag.equals("J")) {
                          danwee = danwee + "조";
                          flag = "J";
                  }

                  price = danwee + price;
          }

          return	price;
  }

  /**
   * 6자리 년월 표현 문자열을 특정구분자를 포함하는 문자열로 변환하여 리턴한다.
   * 200007 --> 2000[]07
   * @param	입력문자열
   * @param	년월 구분자
   * @return	구분자 포함 문자열
   */
  public static String convertMonth(String date, String division) {

          if (date == null) {
                  return	"";
          }

          date = date.trim();

          if (date.length() != 6) {
                  return	date;
          }

          return	date.substring(0, 4) + division + date.substring(4, 6);
  }

  /**
   * 6자리 년월 표현 문자열을 / 포함문자열로 변환하여 리턴한다.
   * 200007 --> 2000/07
   *
   * @param	입력문자열
   * @return	/ 포함 문자열
   */
  public static String convertMonthS(String date) {
          return	convertMonth(date, "/");
  }

  /**
   * 8자리 문자열을 한글 포함 문자열로 변환하여 리턴한다.
   * 20030723 --> 2003년 7월 23일
   * 20030101 --> 2003년 1월 1일
   * 20031231 --> 2003년 12월 31일
   *
   * @param   입력문자열
   * @retuurn 한글포함 문자열
   */
  public static String convertDate4(String date) {

          if (date == null) {
                  return	"";
          }

          date = date.trim();

          if (date.length() != 8) {
                  return	date;
          }

          String compareM = date.substring(4, 5);
          String compareD = date.substring(6, 7);
          String dateYM;
          if (compareM.equals("0")) {
                  dateYM=date.substring(0, 4) + "년 " + date.substring(5, 6) + "월 ";
                  if (compareD.equals("0")) {
                          date=dateYM + date.substring(7, 8) + "일";
                  } else{
                          date=dateYM + date.substring(6, 8) + "일";
                  }
                  return	date;
          } else{
                  dateYM=date.substring(0, 4) + "년 " + date.substring(4, 6) + "월 ";
                  if (compareD.equals("0")) {
                          date=dateYM + date.substring(7, 8) + "일";
                  } else{
                          date=dateYM + date.substring(6, 8) + "일";
                  }
                  return	date;
          }

  }

  /**
   * 첫번째 매개변수 입력문자열이 "", null, "NULL", ("Null", "nUll"... 경우 포함) 이면
   * 두번째 매개변수 문자열을 리턴하고, 입력문자열이 위 경우에 해당하지 않으면 원래 문자열을 리턴한다.
   * @param 입력 문자열
   * @param 변경 문자열
   * @return 처리 후 문자열
   */
  public static String convertNull(String str, String rep){
    String ret = null;
    String upperNull = Util.checkString(str).toUpperCase();
    if("NULL".equals(upperNull) || "".equals(upperNull)){
      ret = rep;
    }else{
      ret = str;
    }
    return ret;
  }

  /**
   *  문자열 세개와 delimiter 를 받아 null이거나 "" 인 문자열을 제외하고
   *  delimiter로 연결된 문자열을 리턴한다.
   *  예)  "101", "", "102" 이고, delimiter가 "-" 일경우
   *      "101-102" 을 리턴한다.
   *  @param str1
   *  @param str2
   *  @param str3
   *  @param delimiter
   */
  public static String getChainStr(String str1, String str2, String str3, String delimiter){

    delimiter = (delimiter == null)? "" : delimiter;

    StringBuffer sb = new StringBuffer("");

    if(str1 != null && !"".equals(str1) && str1.length() > 1){
      sb.append(delimiter);
      sb.append(str1);
    }
    if(str2 != null && !"".equals(str2) && str2.length() > 1){
      sb.append(delimiter);
      sb.append(str2);
    }
    if(str3 != null && !"".equals(str3) && str3.length() > 1){
      sb.append(delimiter);
      sb.append(str3);
    }
    if(sb.length() > delimiter.length() ) sb.delete(0,delimiter.length());
    return sb.toString();
  }
  /**
   *  문자열과, 길이를 입력받아 길이보다 긴 문자열은 문자열의 길이가 입력길이가 되도록 뒤를 잘라낸 뒤
   *  문자열을 리턴한다. 문자열의 길이가 입력길이보다 작거나 같은 경우는 원 문자열을 그대로 리턴한다.
   *  입력문자열이 null이면 "" 이 리턴된다.
   *  @param 입력문자열
   *  @param 입력길이
   */

  public static String getCutStr(String str, int l){
    String ret = null;
    if(str == null){
      return "";
    }
    int length = str.length();
    if(length > l){
      ret = str.substring(0, l);
    }else{
      ret = str;
    }
    return ret;
  }

  /**
   * 문자열과 Byte 수를 입력받아 문자열의 왼쪽을 기준으로 해당 바이트 수만큼 문자열을 잘라 리턴한다.
   * @param str
   * @param maxBytes
   * @return
   */
  public static String leftKscStrB(String str, int maxBytes){
      if(str == null && "".equals(str) || maxBytes <= 1) return "";
      //홀수 Byte는 - 1 로 간주하고, 문자열 길이를 초과하는 byte 수의 경우 문자열 길이에 맞춘다.
    if(maxBytes % 2 > 0){
          maxBytes--;
      }else if(str.length() < maxBytes/2 ){
          maxBytes = str.length() * 2;
      }
      String strTemp = "";
      try{
          if(str.getBytes().length <= maxBytes)
              strTemp = str;
          else
              strTemp = new String(str.getBytes(), 0, maxBytes, "KSC5601");
      } catch(UnsupportedEncodingException ex){
          ex.printStackTrace();
      }
      return strTemp;
  }

  public static String leftKscStrB2(String uniStr,int maxBytes){
      if(uniStr == null && "".equals(uniStr) || maxBytes <= 1) return "";
      //홀수 Byte는 - 1 로 간주하고, 문자열 길이를 초과하는 byte 수의 경우 문자열 길이에 맞춘다.
      if(maxBytes % 2 > 0){
          maxBytes--;
      }else if(uniStr.length() < maxBytes/2 ){
          maxBytes = uniStr.length() * 2;
      }

    	String ret = null;
	    try{
	      uniStr = Ksc2Uni(uniStr);
	      String strEncoded = new String(uniStr.getBytes("8859_1"));
	      if(strEncoded.getBytes("8859_1").length <= maxBytes){
	        ret = uniStr;
	      }else{
	        ret = new String(uniStr.getBytes("8859_1"),0,maxBytes, "KSC5601");
	      }
	    } catch(Exception e){
	      FWLogManager.getInstance().log("Util.java", "leftKscStrB2()", e,
	          "leftKscStrB2 에서 에러 발생.",  "에러 ", false);
	    }
	    return ret;
	  }
  
  
  /**
   * String 배열과 구분자를 파라미터로 받아서, 구분자로 연결된 문자열을 반환한다.
   * @param src 연결될 항목을 가진 문자열 배열
   * @param delim 구분자
   * @return 연결된 문자열
   */
  public static String getConcatString(String[] src, String delim) {
      if(src == null) return "";
      if(src.length == 1) return src[0];

      String ret = "";
      for(int i=0; i<src.length; i++) {
          ret = ret + delim + src[i];
      }
      return ret.substring(delim.length());
  }
  /**
   * 세션으로부터 특정 항목의 값을 얻어온다.
   * 세션이 존재하지 않을 경우는 SysException이 발생한다.
   * 세션이 존재하고 세션에서 찾는 값이 존재하지 않을 경우 시스템에러로 처리할 경우는 required를 true로,
   * 존재하지 않을 경우 ""으로 처리할 경우는 required를 false로 전달한다.
   * @param req HttpServletRequest
   * @param param 세션에서 찾는 항목의 이름
   * @param required 필수(true)/선택(false) 구분자
   * @return 세션에서 찾는 항목의 값
   */
  public static String getSessionParameterValue(HttpServletRequest req, String param, boolean required) {
      String retStr = null;
      HttpSession session = req.getSession(false);
      if(session==null) { // 세션이 없을 경우
          throw new SysException(new Exception("해당 session 을 찾을 수 없습니다."));
      }
      retStr = (String)session.getAttribute(param);
      if(required){
              if(retStr==null || retStr.equals("")) {
                  throw new SysException(new Exception("필수 항목( "+param+" )의 값을 세션에서 얻을 수 없습니다."));
              }
          }else{
              if(retStr==null) {
                  retStr = "";
              }

          }
      return retStr;
  }

/**
 * @param str String
 * @return 특수문제 제거된 문자열
 */
	public static String charFilter(String str){
		// 필터목록. 사용불가능한 문자.
		String[] strFilter={"\\|", ";","\\$", "%","'","\"","\'","\\\"","\\<","\\>","\\+","\r","\n","\\\\"/*,"@","$","&",",","\\(","\\)"*/};
		for (String tmp_str : strFilter){
			str = str.replaceAll(tmp_str, "");
		}
		return str; 
	}
	
	public static String xssFilter(String str){
		String []regs = {"<script[^>]*>.*?<\\/script[^>]*>", "<style[^>]*>.*?<\\/style[^>]*>", "<iframe[^>]*>.*?<\\/iframe[^>]*>", "<frame[^>]*>.*?<\\/frame[^>]*>", "<script[^>]*>", "<style[^>]*>", "<iframe[^>]*>", "<frame[^>]*>"};
		for(int i=0; i < regs.length; i++){
			str = str.replaceAll(regs[i], " ");
		}
		return str;
	}
	

	public static String securityXSS4(String s) {
		ArrayList arr = new ArrayList();
		arr.add("script");
		arr.add("iframe");
		arr.add("link");
		String[] aTag = (String[]) arr.toArray(new String[0]);
		StringBuffer bf = new StringBuffer();

		for (int j = 0; j < aTag.length; j++) {
			if (aTag[j] != null && aTag[j].length() > 0) {
				Pattern p = Pattern.compile("<( )*?(/*)( )*?" + aTag[j]
						+ "( )*?([^>])*?>", Pattern.DOTALL);
				Matcher m = p.matcher(s);
				s = m.replaceAll(" ");
			}
		}

		s = s.replaceAll("(?m)(?s)<!--(.*)-->", "");
		s = s.replaceAll("<!-{2,}|-{2,}>", "");
		return s;
	}
	
	/*
	public static void main(String[] args) {
		String testStr = "<script language=\"javascript\">alert(\'TEST\');</script><iframe src=\"http://www.chosun.com\"></iframe>%$#&!";
		System.out.println("1: "+somo.framework.util.Util.charFilter(testStr)+"\n");
		System.out.println("2: "+somo.framework.util.Util.xssFilter(testStr)+"\n");
		System.out.println("3: "+somo.framework.util.Util.securityXSS4(testStr)+"\n");
		
		System.out.println("4: "+somo.framework.util.Util.charFilter(securityXSS4(xssFilter(testStr)))+"\n");
	}
	*/
	
}
