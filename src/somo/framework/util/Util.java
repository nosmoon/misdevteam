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
 * <p>Company: (��)����Ʈ�¸����</p>
 * <p>@version 1.0</p>
 * <p>@author SI ��</p>
 * �������� ��ƿ��Ƽ Ŭ����<BR>
 * ����� ������� �ʰ�, static Ÿ���� �޼ҵ带 ������.
 *
 */
public final class Util{

  final static int rawOffset = 9 * 60 * 60 * 1000;
  final static Locale currentLocale = Locale.KOREA;
  final static NumberFormat numberFormatter = NumberFormat.getNumberInstance(currentLocale);

  /**
   * 1���� �и�������.
   */
  final static long DAY_SECOND = 1000 * 60 * 60 * 24;

  /**
   * ����ð��� �Ű������� ��¥�׽ð� ���˿� �°� ��ȯ�Ͽ� ���ڿ��� �����Ѵ�.
   *  (��) �Ű������� "yyyyMMddhh" �̸� "2003010112"�� ����
   * @param format SimpleDateFormat Ÿ���� ��¥�׽ð� ����
   * @return ���˿� �°� ��ȯ�� ���ڿ�
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
   * ��¥�ð�ǥ�� ���ڿ��� �Ű������� �޾Ƽ� ù��° ��¥�ð��������� ��ȯ�� �ڿ� ���ڸ� ���� �� �ι�° ��¥�ð��������� ��ȯ�Ͽ� �����Ѵ�.
   * @param s ��¥�ð�ǥ�� ���ڿ�
   * @param day ���� ����
   * @param format1 ��ȯ�ϰ� ���ڸ� ���� ��¥�ð�����
   * @param format2 �����Ͽ� ������ ��¥�ð�����
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� java.text.SimpleDataFormat���� ��ȯ�����ؾ� �մϴ�.",
                                     "�Ű������� " + s + " �Դϴ�.", false);
    }
    date.setTime(date.getTime() + ((long)day * 1000 * 60 * 60 * 24));
    return formatter2.format(date);
  }

  /**
   * �� ��¥ ������ ���ڼ��� �����Ѵ�.
   * @param from ���ؽ�������
   * @param to ������������
   * @param format1 ���ؽ������ڸ� ��ȯ�� ��¥�ð�����
   * @param format2 �����������ڸ� ��ȯ�� ��¥�ð�����
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� java.text.SimpleDataFormat���� ��ȯ�����ؾ� �մϴ�.",
                                     "�Ű������� " + from + " �� " + to + " �Դϴ�.", false);
    }

    long duration = d2.getTime() - d1.getTime();

    return(int)(duration / (1000 * 60 * 60 * 24));
  }

  /**
   * ���ڿ��� ���̰� ���� sizeũ�Ⱑ �ǵ��� '0'�� ���ڿ��տ� �����δ�.<BR>
   * ���ڿ��� ���̱� ���� size���� ũ�ų� ������ ��ȭ ����.
   * @param str �Է� ���ڿ�
   * @param size ���� ũ��
   * @return ���� ���ڿ�
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
   * �Ű����� ���ڿ��� null�̸� ""�� �����ϰ� null�� �ƴϸ� �յ��� ���鹮�ڸ� �����Ѵ�.
   * @param str �Է� ���ڿ�
   * @return ���� ���ڿ�
   */
  public static String checkString(String str){
    if(str != null)
      return replace(replace(replace(str.trim(),"	"," "),"&amp;","&"),"&quot;","\"");
    else
      return "";
  }

  /**
   * �Ű����� ���ڿ��� ���Ե� Ư�������� ���� �����Ѵ�.
   * @param str �Է¹��ڿ�
   * @param ch Ư������
   * @return ���ڿ��� ���Ե� Ư�������� ����
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
   * �Ϲݹ��ڿ��� ASCII ���ڿ��� ��ȯ�Ѵ�.
   * @param str �Է¹��ڿ�
   * @return ASCII ���ڿ�
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
   * ASCII ���ڿ��� �Ϲݹ��ڿ��� ��ȯ�Ѵ�.
   * @param str �Է� ASCII ���ڿ�
   * @return �Ϲݹ��ڿ�
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
   * 8859_1 ���ڵ� ���ڿ��� KSC5601 ���ڿ��� ��ȯ�Ѵ�.
   * @param uniStr 8859_1 ���ڿ�
   * @return KSC5601 ���ڿ�
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� null�� �ƴϾ�� �ϰ�, ���ڵ��� ��ȯ�����ؾ� �մϴ�.",
                                     "null�� return �Ǿ����� �Ű������� " + uniStr +
                                     " �Դϴ�.", false);
    }
    return ret;
  }

  /**
   * KSC5601 ���ڵ� ���ڿ��� 8859_1 ���ڿ��� ��ȯ�Ѵ�.
   * @param KscStr KSC5601 ���ڿ�
   * @return 8859_1 ���ڿ�
   */
  public static String Ksc2Uni(String KscStr){
    String ret = null;
    try{
      ret = new String(KscStr.getBytes("KSC5601"), "8859_1");
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "Ksc2Uni()", e,
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� null�� �ƴϾ�� �ϰ�, ���ڵ��� ��ȯ�����ؾ� �մϴ�.",
                                     "null�� return �Ǿ����� �Ű������� " + KscStr +
                                     " �Դϴ�.", false);
    }
    return ret;
  }

  /**
   * 8859_1 ���ڵ� ���ڿ��� euc-kr ���ڿ��� ��ȯ�Ѵ�.
   * @param str 8859_1 ���ڿ�
   * @return euc-kr ���ڿ�
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� null�� �ƴϾ�� �ϰ�, ���ڵ��� ��ȯ�����ؾ� �մϴ�.",
                                     "null�� return �Ǿ����� �Ű������� " + uniStr +
                                     " �Դϴ�.", false);
    }
    return ret;
  }

  /**
   * 8859_1 ���ڵ� ���ڿ��� euc-kr ���ڿ��� ��ȯ�Ѵ�.
   * @param str euc-kr ���ڿ�
   * @return 8859_1 ���ڿ�
   */
  public static String Euc2Uni(String eucStr){
    String ret = null;
    try{
      ret = new String(eucStr.getBytes("euc-kr"), "8859_1");
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "Euc2Uni()", e,
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� null�� �ƴϾ�� �ϰ�, ���ڵ��� ��ȯ�����ؾ� �մϴ�.",
                                     "null�� return �Ǿ����� �Ű������� " + eucStr +
                                     " �Դϴ�.", false);
    }
    return ret;
  }

  /**
   * ���� �ϳ�(16byte)�� �ѱۿ��θ� �˻��Ѵ�.<BR>
   * �������� �Ǵ� �������ڴ� �ѱ��Ǻ��� ���� ������, �ϼ��� ����(�ּ� : ���� + ����)�̻��� �Ǻ��ȴ�.
   * @param c �Է¹���
   * @return ��/�ƴϿ�
   */
  private static boolean isHangul(char c){
    if(c < 0xAC00 || 0xD7A3 < c){
      return false;
    } else{
      return true;
    }
  }

  /**
   * ���ڿ��� �ѱۿ��θ� �˻��Ѵ�.<BR>
   * @param str �Է¹��ڿ�
   * @return ��/�ƴϿ�
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
   * �������� �޾Ƽ� õ���� ��ǥ�� ���Ե� ���ڿ��� �����Ѵ�.
   * @param temp �Է� ����
   * @return ���� ���ڿ�
   */
  public static String formatNumber(int temp){
    String ret = null;
    try{
      ret = NumberFormat.getInstance().format(temp);
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "formatNumber()", e,
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� ���ڷ� ǥ���Ǿ�� �մϴ�.",
                                     "�Ű������� " + temp + " �Դϴ�. null�� ���ϵ˴ϴ�.", false);
    }
    return ret;
  }

  /**
   * long Ÿ���� ���� �޾Ƽ� õ���� ��ǥ�� ���Ե� ���ڿ��� �����Ѵ�.
   * @param temp �Է� ����
   * @return ���� ���ڿ�
   */
  public static String formatNumber(long temp){
    String ret = null;
    try{
      ret = NumberFormat.getInstance().format(temp);
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "formatNumber()", e,
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� ���ڷ� ǥ���Ǿ�� �մϴ�.",
                                     "�Ű������� " + temp + " �Դϴ�. null�� ���ϵ˴ϴ�.", false);
    }
    return ret;
  }

  /**
   * double Ÿ���� ���� �޾Ƽ� õ���� ��ǥ�� ���Ե� ���ڿ��� �����Ѵ�.
   * @param temp �Է� ����
   * @return ���� ���ڿ�
   */
  public static String formatNumber(double temp){
    String ret = null;
    try{
      ret = NumberFormat.getInstance().format(temp);
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "formatNumber()", e,
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� ���ڷ� ǥ���Ǿ�� �մϴ�.",
                                     "�Ű������� " + temp + " �Դϴ�. null�� ���ϵ˴ϴ�.", false);
    }
    return ret;
  }

  /**
   * double Ÿ���� ���� �Է¹޾Ƽ� ���а��� "USD"�̸� .00 �������� �����ϰ� �������� �Ҽ����� ���� �������� �����Ѵ�.<BR>
   * �����κ��� õ���� ��ǥ�� �����Ѵ�.
   * @param gubun ���а�
   * @param temp �Է� ����
   * @return ���� ���ڿ�
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� ���ڷ� ǥ���Ǿ�� �մϴ�.",
                                     "�Ű������� " + temp + " �Դϴ�. null�� ���ϵ˴ϴ�.", false);
    }
    return ret;
  }

  /**
   * long Ÿ���� ���� �Է¹޾Ƽ� ���а��� "USD"�̸� .00 �������� �����ϰ� �������� �Ҽ����� ���� �������� �����Ѵ�.<BR>
   * �����κ��� õ���� ��ǥ�� �����Ѵ�.
   * @param gubun ���а�
   * @param temp �Է� ����
   * @return ���� ���ڿ�
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� ���ڷ� ǥ���Ǿ�� �մϴ�.",
                                     "�Ű������� " + temp + " �Դϴ�. null�� ���ϵ˴ϴ�.", false);
    }
    return ret;
  }

  /**
   * ������( : , - . / )�� ������ ���ڿ��� �Է¹޾� �����ڸ� ������ ���ڿ��� �����Ѵ�.
   * @param str �Է� ���ڿ�
   * @return ���� ���ڿ�
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
   * �Է¹��ڿ����� ���ڸ� ã�Ƽ� int Ÿ������ ��ȯ�Ͽ� �����Ѵ�.<BR>
   * ���ڿ��� ���ڷ� ���۵Ǿ�� �ϰ�, ������ ����ǥ�� ���ڵ鸸 ���ڷ� �νĵȴ�.
   * @param str �Է¹��ڿ�
   * @return ���� ����
   */
  public static int unFormatInt(String str){
    int ret = 0;
    try{
      ret = NumberFormat.getInstance().parse(str).intValue();
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "unFormatInt()", e,
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� ���ڷ� ���۵Ǿ�� �մϴ�.",
                                     "�Ű������� " + str + " �Դϴ�. 0 �� ���ϵ˴ϴ�.", false);
    }
    return ret;
  }

  /**
   * �Է¹��ڿ����� ���ڸ� ã�Ƽ� long Ÿ������ ��ȯ�Ͽ� �����Ѵ�.<BR>
   * ���ڿ��� ���ڷ� ���۵Ǿ�� �ϰ�, ������ ����ǥ�� ���ڵ鸸 ���ڷ� �νĵȴ�.
   * @param str �Է¹��ڿ�
   * @return ���� ����
   */
  public static long unFormatLong(String str){
    long ret = 0;
    try{
      ret = NumberFormat.getInstance().parse(str).longValue();
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "unFormatInt()", e,
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� ���ڷ� ���۵Ǿ�� �մϴ�.",
                                     "�Ű������� " + str + " �Դϴ�. 0 �� ���ϵ˴ϴ�.", false);
    }
    return ret;
  }

  /**
   * �Է¹��ڿ����� ���ڸ� ã�Ƽ� double Ÿ������ ��ȯ�Ͽ� �����Ѵ�.<BR>
   * ���ڿ��� ���ڷ� ���۵Ǿ�� �ϰ�, ������ ����ǥ�� ���ڵ鸸 ���ڷ� �νĵȴ�.
   * @param str �Է¹��ڿ�
   * @return ���� ����
   */
  public static double unFormatDouble(String str){
    double ret = 0;
    try{
      ret = NumberFormat.getInstance().parse(str).doubleValue();
    } catch(Exception e){
      FWLogManager.getInstance().log("Util.java", "unFormatInt()", e,
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� ���ڷ� ���۵Ǿ�� �մϴ�.",
                                     "�Ű������� " + str + " �Դϴ�. 0 �� ���ϵ˴ϴ�.", false);
    }
    return ret;
  }

  /**
   * 13�ڸ� �ֹε�Ϲ�ȣ ���ڿ��� �Է¹޾� �ֹε�Ϲ�ȣ ������(-)�� ������ ���ڿ��� �����Ͽ� �����Ѵ�.
   * @param str �Է� ���ڿ�
   * @return ���� ���ڿ�
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� 13 �Ǵ� 14�ڸ� ���ڿ��̾�� �մϴ�.",
                                     "�Ű������� " + str + " �Դϴ�. null �� ���ϵ˴ϴ�.", false);
    }
    return ret;
  }

  /**
   * �ֹε�Ϲ�ȣ ������(-)�� ������ ���ڿ��� �Է¹޾Ƽ� �����ڸ� ������ ���ڿ��� �����Ѵ�.
   * @param str �Է� ���ڿ�
   * @return ���� ���ڿ�
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� 13 �Ǵ� 14�ڸ� ���ڿ��̾�� �մϴ�.",
                                     "�Ű������� " + str + " �Դϴ�. null �� ���ϵ˴ϴ�.", false);
    }
    return ret;
  }

  /**
   * 10�ڸ� ����ڵ�Ϲ�ȣ ���ڿ��� �Է¹޾� ����ڵ�Ϲ�ȣ ������(-)�� ������ ���ڿ��� �����Ͽ� �����Ѵ�.
   * @param str �Է� ���ڿ�
   * @return ���� ���ڿ�
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� 10 �Ǵ� 12�ڸ� ���ڿ��̾�� �մϴ�.",
                                     "�Ű������� " + str + " �Դϴ�. null �� ���ϵ˴ϴ�.", false);
    }
    return ret;
  }

  /**
   * ����ڵ�Ϲ�ȣ ������(-)�� ������ ���ڿ��� �Է¹޾Ƽ� �����ڸ� ������ ���ڿ��� �����Ѵ�.
   * @param str �Է� ���ڿ�
   * @return ���� ���ڿ�
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� 10 �Ǵ� 12�ڸ� ���ڿ��̾�� �մϴ�.",
                                     "�Ű������� " + str + " �Դϴ�. null �� ���ϵ˴ϴ�.", false);
    }
    return ret;
  }

  /**
   * �Է¹��ڿ����� Carrige-Return���� ã��  <BR> �� ����� ���ڿ��� �����Ѵ�
   * @param input �Է� ���ڿ�
   * @return ���� ���ڿ�
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
   * �ѱ� ���ڵ��� �ʿ��� ��� encoding ó�� �Ѵ�.
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� null�� �ƴϾ�� �ϰ�, ���ڵ��� ��ȯ�����ؾ� �մϴ�.",
                                     "null�� return �Ǿ����� �Ű������� " + str +
                                     " �Դϴ�.", false);
    }
    return ret;
  }

  /**
   * Timestamp Ÿ���� �⺻������ ��¥����(yyyy/MM/dd) ���ڿ����� ��ȯ�Ͽ� �����Ѵ�.
   * @param stamp   ��ȯ�� Timestamp ��ü
   * @return        ��ȯ�� ���ڿ�
   */
  public static String Timestamp2Str(java.sql.Timestamp stamp){
    if(stamp != null){
      return Timestamp2Str(stamp, null);
    } else{
      return "";
    }
  }

  /**
   * Timestamp Ÿ���� Ư�� ������ ��¥���� ���ڿ����� ��ȯ�Ͽ� �����Ѵ�.
   * @param stamp     ��ȯ�� Timestamp ��ü
   * @param dateType  ��ȯ���� ��¥ ǥ�� ����
   * @return          ��ȯ�� ���ڿ�
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
   * Date Ÿ���� �⺻������ ��¥����(yyyy/MM/dd) ���ڿ����� ��ȯ�Ͽ� �����Ѵ�.
   * @param       ��ȯ�� Date ��ü
   * @return      ��ȯ�� ���ڿ�
   */
  public static String Date2Str(java.util.Date date){
    return Date2Str(date, null);
  }

  /**
   * Date Ÿ���� Ư�� ������ ��¥���� ���ڿ����� ��ȯ�Ͽ� �����Ѵ�.
   * @param date      ��ȯ�� Date ��ü
   * @param dateType  ��ȯ���� ��¥ ǥ�� ����
   * @return          ��ȯ�� ���ڿ�
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
   * ���ڿ��� Calendar ��ü�� ��ȯ�Ѵ�.
   * @param	dateStr ����Ʈ ��Ʈ��
   * @param	format ����
   *			�� - 'yyyyMMdd'
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
   * ���ڿ��� Date ��ü�� ��ȯ�Ѵ�.
   * @param	dateStr ����Ʈ ��Ʈ��
   * @param	format ����
   *			�� - 'yyyyMMdd'
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� ��¥ǥ�� �����̾�� �մϴ�.",
          "null�� return �Ǿ����� �Ű������� " + dateStr +
          " �Դϴ�.", false);
    }
    return date;
  }


  /**
   * from date ���� offset ��ŭ ���� ���� �����Ѵ�.
   *
   * @param	from date. 'YYYYMMDD' �����̴�.
   * @param	offset.
   * @return	to date. 'YYYYMMDD' �����̴�.
   * @exception	java.text.ParseException
   */
  public static String addDate(String fromDt, int offset)
  throws java.text.ParseException {
          return	addDate(fromDt, Calendar.DATE, offset);
  }
  /**
   * from date ���� offset ��ŭ�� ���� ���� ���� �����Ѵ�.
   *  (��) addMonth("20040101", 3) return "20040401"
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� ��¥ǥ�� �����̾�� �մϴ�.",
          "null�� return �Ǿ����� �Ű������� " + fromDt +
          " �Դϴ�.", false);
    }
    return strDate;
  }
  /**
   * ��������ǥ�� ���ڿ����� field �� offset ��ŭ ������ ����ǥ�� ���ڿ��� �����Ѵ�.
   * @param	from date. 'YYYYMMDD' �����̴�.
   * @param	field.
   * @param	offset.
   * @return	to date. 'YYYYMMDD' �����̴�.
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� ��¥ǥ�� �����̾�� �մϴ�.",
          "null�� return �Ǿ����� �Ű������� " + fromDt +
          " �Դϴ�.", false);
    }
    return strDate;
  }

  /**
   * �� ���� ���Ѵ�.
   *
   * @param	From ��. ������ 'YYYYMMDD'�̴�.
   * @param	To ��. ������ 'YYYYMMDD'�̴�.
   * @return	�� ��.
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
          "��ƿ��Ƽ �޼ҵ带 ȣ���ϴ� �������� ���ܰ� �߻��߽��ϴ�. �Ű������� ��¥ǥ�� �����̾�� �մϴ�.",
          "0 �� return �Ǿ����� �Ű������� " + fromDt + ", "+ toDt + " �Դϴ�.", false);
    }
    return days;
  }


  /**
   * ��¥ ���ڿ��� �Է¹޾� �˸��� ���·� ��¥�� ��ȯ�Ѵ�.
   * @param format  ��¥ ���� ���ڿ�
   * @param field   ��, ��, �� ������
   * @param offset  ��ȯġ
   * @return String ����� ��¥ ���ڿ�
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
   * �����Ͽ��� offset ��ŭ ���ϰų� �� ������� yyyyMMdd �������� �����Ѵ�
   * @param offset offset
   * @return String yyyyMMdd ������ �����
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
   * ���� ������� yyyyMMdd �������� �����Ѵ�
   * @return String yyyyMMdd ������ �����
   */
  public static String getDate() {
    return getFormatDate("yyyyMMdd", 0, 0);
  }

  /**
   * ���� ������� yyyy/MM/dd �������� �����Ѵ�
   * @return String yyyy/MM/dd ������ �����
   */
  public static String getDate2() {
    return getFormatDate("yyyy/MM/dd", 0, 0);
  }

  /**
   * ���� ������� yyyy/MM/dd HH:mm �������� �����Ѵ�
   * @return String yyyy/MM/dd HH:mm ������ �����
   */
  public static String getDate3() {
    return getFormatDate("yyyy/MM/dd HH:mm", 0, 0);
  }

  /**
   * ���� ���� yyyy �������� �����Ѵ�
   *
   * @return String yyyy ������ ��
   */
  public static String getYear() {
    return getFormatDate("yyyy", 0, 0);
  }

  /**
   * ���� ���� MM �������� �����Ѵ�
   * @return String MM
   */
  public static String getMonth() {
    return getFormatDate("MM", 0, 0);
  }

  /**
   * ���� ���� M �������� �����Ѵ�
   * @return String M
   */
  public static String getMonth2() {
    return getFormatDate("M", 0, 0);
  }

  /**
   * ���� ����� yyyyMM �������� �����Ѵ�
   * @return String yyyy\MM ������ ���
   */
  public static String getYyyyMm() {
    return getFormatDate("yyyyMM", 0, 0);
  }

  /**
   * ���� �ð��� HH:mm �������� �����Ѵ�
   * @return String HH:mm ������ �ð�
   */
  public static String getTime() {
    return getFormatDate("HH:mm", 0, 0);
  }

  /**
   * ���ڿ� 3�ڸ����� comma�� ���δ�.
   * @param	number
   * @return	String
   */
  public static String comma(int number) {
    return numberFormatter.format(number);
  }

  /**
   * ���ڿ� 3�ڸ����� comma�� ���δ�.
   * @param	number
   * @return	String
   */
  public static String comma(long number) {
    return numberFormatter.format(number);
  }

  /**
   * ���ڿ� 3�ڸ����� comma�� ���δ�.
   * @param	number
   * @return	String
   */
  public static String comma(double number) {
    DecimalFormat doubleFormatter = new DecimalFormat("###,##0.####");
    return doubleFormatter.format(number);
  }

  /**
   * ���ڿ� 3�ڸ����� comma�� ���δ�.
   * @param	number
   * @return	String
   */
  public static String comma(Object number) {
    DecimalFormat doubleFormatter = new DecimalFormat("###,##0.####");
    return doubleFormatter.format(number);
  }

  /**
   * ���ڿ� 3�ڸ����� comma�� ���δ�.
   * �Ҽ� 2�ڸ����� ǥ���Ѵ�.
   * @param	number
   * @return	String
   */
  public static String comma2(double number) {
    DecimalFormat doubleFormatter = new DecimalFormat("###,##0.00");
    return doubleFormatter.format(number);
  }

  /**
   * ���ڿ� 3�ڸ����� comma�� ���δ�.
   * �Ҽ� 3�ڸ����� ǥ���Ѵ�.
   * @param	number
   * @return	String
   */
  public static String comma3(double number) {
    DecimalFormat doubleFormatter = new DecimalFormat("###,##0.000");
    return doubleFormatter.format(number);
  }

  /**
   * ���ڿ� 3�ڸ����� comma�� ���δ�.
   * �Ҽ� 4�ڸ����� ǥ���Ѵ�.
   * @param	number
   * @return	String
   */
  public static String comma4(double number) {
    DecimalFormat doubleFormatter = new DecimalFormat("###,##0.0000");
    return doubleFormatter.format(number);
  }

  /**
   * number�� �������� 0���� ä��.
   * @param	number
   * @return	String
   */
  public static String lpad(int number) {
    DecimalFormat intFormatter = new DecimalFormat("000");
    return intFormatter.format(number);
  }

  /**
   * ���ڿ��� �Է¹޾� ���ڿ� �� ���๮�ڸ� <BR>���ڿ��� ��ȯ�Ͽ� �����Ѵ�.
   * @param str       �Է� ���ڿ�
   * @param replace   �Է¹��ڿ��� null�� ��� ��� ������ ���ڿ�
   * @return          ��ȯ�� ���ڿ�
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
   * ���ڿ��� �Է¹޾� ���ڿ� �� ���๮�ڸ� &nbsp; ���ڿ��� ��ȯ�Ͽ� �����Ѵ�.
   * @param str   �Է� ���ڿ�
   * @return      ��ȯ�� ���ڿ�
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
   * ����(Y/N)�� ���� "��", "�ƴϿ�"�� �ٲپ� �ش�.
   * @param	Y �Ǵ� N ���ڿ�
   * @return	Y -> ��, N -> �ƴϿ�, null -> "", ��Ÿ -> �������
   */
  public static String convertYn(String str){
    String yesno = null;
    if(str == null){
      yesno = "";
    }

    if(str.equals("Y")){
      yesno = "��";
    } else if(str.equals("N")){
      yesno = "�ƴϿ�";
    }

    return yesno;
  }

  /**
   * Y/N �Ǵ� 1/0 �� ���� str1, str2�� �ٲپ� �ش�.
   * @param str   �Է¹��ڿ�
   * @param str1  �Է¹��ڿ��� Y �Ǵ� 1 �ΰ�� ����� ���ڿ�
   * @param str2  �Է¹��ڿ��� N �Ǵ� 0 �ΰ�� ����� ���ڿ�
   * @return      Y �Ǵ� 1 �ΰ�� str1, N �Ǵ� 0 �ΰ�� str2
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
   * ��¥ ǥ�� �� �߰����й��ڸ� ������ 8�ڸ� ���ڿ��� �����Ѵ�.
   * �Է¹��ڿ��� 8�ڸ����� ���� �ϸ�, �۰ų� ������ �״�� �����Ѵ�.
   * 2002/01/01 -> 20020101
   * @param date  �Է� ��¥ ǥ�� ���ڿ�
   * @return      ���й��ڸ� ������ ���ڿ� (YYYYMMDD)
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
   * 8�ڸ� ��¥ǥ�� ���ڿ��� �����ڸ� �����ϴ� ���ڿ��� ��ȯ�Ѵ�.
   * �Է¹��ڿ��� 8�ڸ��� �ƴѰ��� �״�� �����Ѵ�.
   * @param	8�ڸ� ��¥ǥ�� ���ڿ�
   * @param	������ ���ڿ�) ( - , / , : ��Ÿ)
   * @return	�����ڸ� ������ ���ڿ�
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
   * 8�ڸ� ���ڿ��� / �����ڸ� �����Ͽ� �����Ѵ�.
   * 20020101 --> 2002/01/01
   * @param	�Է¹��ڿ�
   * @return	/ ���Թ��ڿ�
   */
  public static String convertS(String date) {
    return convertDate(date, "/");
  }

  /**
   * 8�ڸ� ���ڿ��� - �����ڸ� �����Ͽ� �����Ѵ�.
   * 20020101 --> 2002-01-01
   * @param	�Է¹��ڿ�
   * @return	- ���Թ��ڿ�
   */
  public static String convertD(String date) {
    return convertDate(date, "-");
  }

  /**
   * 8�ڸ� ���ڿ��� : �����ڸ� �����Ͽ� �����Ѵ�.
   * 20020101 --> 2002:01:01
   * @param	�Է¹��ڿ�
   * @return	: ���Թ��ڿ�
   */
  public static String convertC(String date) {
    return convertDate(date, ":");
  }

  /**
   * �ý��� ��¥�� �ش��ϴ� �б⸦ ����.
   * @return	1, 2, 3 �Ǵ� 4
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
   * ���ڸ� ����(��)�� �ش��ϴ� �б⸦ ����
   * @param mm  �� �� ǥ���ϴ� 2�ڸ� ����
   * @return    �ش���� �б���� 1, 2, 3 �Ǵ� 4
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
   *  �޸��޸� ���ڸ� ���ڿ��ν� �޾Ƽ� �޸��� ���ŵ� ���ڿ��� �ѱ��
   * @param   �޸� ���� ���ڿ�
   * @return  �޸� ���� ���ڿ�
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
   * �Է¹��ڿ��� ��¥�� ���ϴ� ���� ���������ڸ� �����Ѵ�.
   * @param	8�ڸ� 'YYYYMMDD' ���ڿ�
   * @return	28, 29, 30, 31 �ش� ���� ������ ����
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
   * @param	str		������ ���ڿ�
   * @param	index	���ܵ� ���ڿ��� ����� �迭�� �ε���(���Ϲ迭)
   * @param	cnt		���ܵ� ��ū�� ����� �迭�� ũ��
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
   * Ư�����̸�ŭ Ư�����ڸ� ä�� ���ڿ��� �����Ѵ�.
   * @param	�Է¹��ڿ�
   * @param	ä���� ���ڿ�
   * @param	ä���� ����
   * @return	String	����
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
   * Ư�����̸�ŭ ���鹮�ڸ� ä�� ���ڿ��� �����Ѵ�.
   * @param	ä���� ����
   * @return	���鹮�ڷ� ä���� ���ڿ�
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
   * �Ҽ��� ���ڸ� �Ҽ������ڷ� �ݿø��Ѵ�.
   * @param	����
   * @param	�ڸ���
   * @return	double
   */
  public static double round(double d, int p) {
          long tmp = (long)Math.pow(10, p);
          double num = Math.round(d * tmp);
          num /= tmp;
          return	num;
  }

  /**
   * �Ҽ��� ���ڸ� �Ҽ������ڷ� �����Ѵ�.
   * @param	����
   * @param	�ڸ���
   * @return	double
   */
  public static double ceil(double d, int p) {
          long tmp = (long)Math.pow(10, p);
          double num = Math.ceil(d * tmp);
          num /= tmp;
          return	num;
  }

  /**
   * �Ҽ��� ���ڸ� �Ҽ������ڷ� �����Ѵ�.
   * @param	����
   * @param	�ڸ���
   * @return	double
   */
  public static double floor(double d, int p) {
          long tmp = (long)Math.pow(10, p);
          double num = Math.floor(d * tmp);
          num /= tmp;
          return	num;
  }

  /**
   * ��ȭ�ݾ׿� ���Ͽ� �ܼ�ó���Ѵ�.(�Ҽ� 3�ڸ� �ݿø�)
   *
   * @param	amt �ݾ�
   * @return	double
   */
  public static double formatAmtF(double amt) {
          return	round(amt, 2);
  }

  /**
   * ��ȭ�ݾ׿� ���Ͽ� �ܼ�ó���Ѵ�.(���̸� ����)
   *
   * @param	amt �ݾ�
   * @return	double
   */
  public static long formatAmtW(double amt) {
          return	(long)floor(amt, 0);
  }

  /**
   * ���ڿ����� Ư����Ʈ���� ��ȯ�ϴ� �Լ�
   *
   * @param	str		�������ڿ�
   * @param	token	�ٲ��ڿ�
   * @param 	to		�ٲܹ��ڿ�
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
   * ���ڿ��� Hyphen�� ���ش�.
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
   * �Ҽ��� ���ڸ� ������ �ݿø��Ѵ�.
   *
   * @param	����
   * @param	�ڸ���
   * @return	�ݿø��� ����
   */
  public static long roundL(double d, int p) {
          double tmp = Math.pow(10, p);
          return Math.round(d / tmp) * (long)tmp;
  }

  /**
   * �Ҽ��� ���ڸ� ������ �����Ѵ�.
   *
   * @param	����
   * @param	�ڸ���
   * @return	����� ����
   */
  public static long ceilL(double d, int p) {
          double tmp = Math.pow(10, p);
          return (long)Math.ceil(d / tmp) * (long)tmp;
  }

  /**
   * �Ҽ��� ���ڸ� ������ �����Ѵ�.
   *
   * @param	����
   * @param	�ڸ���
   * @return	����� ����
   */
  public static long floorL(double d, int p) {
          double tmp = Math.pow(10, p);
          return (long)Math.floor(d / tmp) * (long)tmp;
  }


  /**
   * ����ǥ�� �ݾ׹��ڿ��� �ѱ�ǥ�� �ݾ׹��ڿ��η� ��ȯ�Ͽ� �����Ѵ�.
   * 1234 ��õ2���ʻ�
   * @param	�Է¹��ڿ�
   * @return	�ѱ�ǥ�� ���ڿ�
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
                                  danwee = "��";
                                  break;
                          case '2' :
                                  danwee = "��";
                                  break;
                          case '3' :
                                  danwee = "��";
                                  break;
                          case '4' :
                                  danwee = "��";
                                  break;
                          case '5' :
                                  danwee = "��";
                                  break;
                          case '6' :
                                  danwee = "��";
                                  break;
                          case '7' :
                                  danwee = "ĥ";
                                  break;
                          case '8' :
                                  danwee = "��";
                                  break;
                          case '9' :
                                  danwee = "��";
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
                                  danwee = danwee + "��";
                                  break;
                          case 2 :
                                  danwee = danwee + "��";
                                  break;
                          case 3 :
                                  danwee = danwee + "õ";
                                  break;
                          case 0 :
                                  break;
                  }

                  if (i > 4 && i < 9 && !flag.equals("M")) {
                          danwee = danwee + "��";
                          flag = "M";
                  }
                  if (i >= 9 && i < 13 && !flag.equals("U")) {
                          danwee = danwee + "��";
                          flag = "U";
                  }
                  if (i >= 13 && !flag.equals("J")) {
                          danwee = danwee + "��";
                          flag = "J";
                  }

                  price = danwee + price;
          }

          return	price;
  }

  /**
   * 6�ڸ� ��� ǥ�� ���ڿ��� Ư�������ڸ� �����ϴ� ���ڿ��� ��ȯ�Ͽ� �����Ѵ�.
   * 200007 --> 2000[]07
   * @param	�Է¹��ڿ�
   * @param	��� ������
   * @return	������ ���� ���ڿ�
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
   * 6�ڸ� ��� ǥ�� ���ڿ��� / ���Թ��ڿ��� ��ȯ�Ͽ� �����Ѵ�.
   * 200007 --> 2000/07
   *
   * @param	�Է¹��ڿ�
   * @return	/ ���� ���ڿ�
   */
  public static String convertMonthS(String date) {
          return	convertMonth(date, "/");
  }

  /**
   * 8�ڸ� ���ڿ��� �ѱ� ���� ���ڿ��� ��ȯ�Ͽ� �����Ѵ�.
   * 20030723 --> 2003�� 7�� 23��
   * 20030101 --> 2003�� 1�� 1��
   * 20031231 --> 2003�� 12�� 31��
   *
   * @param   �Է¹��ڿ�
   * @retuurn �ѱ����� ���ڿ�
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
                  dateYM=date.substring(0, 4) + "�� " + date.substring(5, 6) + "�� ";
                  if (compareD.equals("0")) {
                          date=dateYM + date.substring(7, 8) + "��";
                  } else{
                          date=dateYM + date.substring(6, 8) + "��";
                  }
                  return	date;
          } else{
                  dateYM=date.substring(0, 4) + "�� " + date.substring(4, 6) + "�� ";
                  if (compareD.equals("0")) {
                          date=dateYM + date.substring(7, 8) + "��";
                  } else{
                          date=dateYM + date.substring(6, 8) + "��";
                  }
                  return	date;
          }

  }

  /**
   * ù��° �Ű����� �Է¹��ڿ��� "", null, "NULL", ("Null", "nUll"... ��� ����) �̸�
   * �ι�° �Ű����� ���ڿ��� �����ϰ�, �Է¹��ڿ��� �� ��쿡 �ش����� ������ ���� ���ڿ��� �����Ѵ�.
   * @param �Է� ���ڿ�
   * @param ���� ���ڿ�
   * @return ó�� �� ���ڿ�
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
   *  ���ڿ� ������ delimiter �� �޾� null�̰ų� "" �� ���ڿ��� �����ϰ�
   *  delimiter�� ����� ���ڿ��� �����Ѵ�.
   *  ��)  "101", "", "102" �̰�, delimiter�� "-" �ϰ��
   *      "101-102" �� �����Ѵ�.
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
   *  ���ڿ���, ���̸� �Է¹޾� ���̺��� �� ���ڿ��� ���ڿ��� ���̰� �Է±��̰� �ǵ��� �ڸ� �߶� ��
   *  ���ڿ��� �����Ѵ�. ���ڿ��� ���̰� �Է±��̺��� �۰ų� ���� ���� �� ���ڿ��� �״�� �����Ѵ�.
   *  �Է¹��ڿ��� null�̸� "" �� ���ϵȴ�.
   *  @param �Է¹��ڿ�
   *  @param �Է±���
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
   * ���ڿ��� Byte ���� �Է¹޾� ���ڿ��� ������ �������� �ش� ����Ʈ ����ŭ ���ڿ��� �߶� �����Ѵ�.
   * @param str
   * @param maxBytes
   * @return
   */
  public static String leftKscStrB(String str, int maxBytes){
      if(str == null && "".equals(str) || maxBytes <= 1) return "";
      //Ȧ�� Byte�� - 1 �� �����ϰ�, ���ڿ� ���̸� �ʰ��ϴ� byte ���� ��� ���ڿ� ���̿� �����.
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
      //Ȧ�� Byte�� - 1 �� �����ϰ�, ���ڿ� ���̸� �ʰ��ϴ� byte ���� ��� ���ڿ� ���̿� �����.
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
	          "leftKscStrB2 ���� ���� �߻�.",  "���� ", false);
	    }
	    return ret;
	  }
  
  
  /**
   * String �迭�� �����ڸ� �Ķ���ͷ� �޾Ƽ�, �����ڷ� ����� ���ڿ��� ��ȯ�Ѵ�.
   * @param src ����� �׸��� ���� ���ڿ� �迭
   * @param delim ������
   * @return ����� ���ڿ�
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
   * �������κ��� Ư�� �׸��� ���� ���´�.
   * ������ �������� ���� ���� SysException�� �߻��Ѵ�.
   * ������ �����ϰ� ���ǿ��� ã�� ���� �������� ���� ��� �ý��ۿ����� ó���� ���� required�� true��,
   * �������� ���� ��� ""���� ó���� ���� required�� false�� �����Ѵ�.
   * @param req HttpServletRequest
   * @param param ���ǿ��� ã�� �׸��� �̸�
   * @param required �ʼ�(true)/����(false) ������
   * @return ���ǿ��� ã�� �׸��� ��
   */
  public static String getSessionParameterValue(HttpServletRequest req, String param, boolean required) {
      String retStr = null;
      HttpSession session = req.getSession(false);
      if(session==null) { // ������ ���� ���
          throw new SysException(new Exception("�ش� session �� ã�� �� �����ϴ�."));
      }
      retStr = (String)session.getAttribute(param);
      if(required){
              if(retStr==null || retStr.equals("")) {
                  throw new SysException(new Exception("�ʼ� �׸�( "+param+" )�� ���� ���ǿ��� ���� �� �����ϴ�."));
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
 * @return Ư������ ���ŵ� ���ڿ�
 */
	public static String charFilter(String str){
		// ���͸��. ���Ұ����� ����.
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
