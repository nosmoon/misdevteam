package fms.util;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TranFormat {
	public static String getStr2Byte2Str(String originStr, int offSet, int length) {
		try {
			byte[] byteStr = originStr.getBytes();
			return new String(byteStr, offSet, length);
		}
		catch (Exception e) {
			return "";
		}
	}
	
	public static String makeSpaceData(String originData, int byteLength) {
		int a = Integer.parseInt(originData)+1;
		String tempData = String.valueOf(a);
		while (tempData.getBytes().length < byteLength) {
			tempData = "0"+tempData;
		}
		return tempData;
	}
	public static String makeSpaceData3(int originData, int byteLength) {
		String tempData = String.valueOf(originData);
		while (tempData.getBytes().length < byteLength) {
			tempData = tempData + " ";
		}
		return tempData;
	}
	public static String makeSpaceData2(String originData) {
		String tempData = "";
	
		for (int ii = 0; ii < originData.getBytes().length-4; ii++) {
			tempData = tempData + "*";
		}
		tempData = tempData + originData.substring(originData.getBytes().length-4, originData.getBytes().length);
		return tempData;
	}	
	public static boolean isAllNumber(String sValue){
		for (int iPos = 0; iPos < sValue.length(); iPos++) {
			String strOne = sValue.substring(iPos, iPos + 1);
			if ("1234567890".indexOf(strOne) == -1) {
				return false;
			}
		}
		return true;
	}
	
	public static boolean isNumber(String _checkOne) {
		if ("1234567890".indexOf(_checkOne) == -1) {
			return false;
		}
		return true;
	}
	
	public static boolean isAlpha(String _checkOne) {
		String upCheckOne = _checkOne.toUpperCase();
		if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(upCheckOne) == -1) {
			return false;
		}
		return true;
	}
	
	public static boolean isSpecialWord(String parm){
		if ("'\"\\".indexOf(parm) == -1) {            //',",\
			return false;							//����
		}
		return true;								//��
	}
	
	public static boolean isAllAlpha(String sValue){
		for (int iPos = 0; iPos < sValue.length(); iPos++) {
			String strOne = sValue.substring(iPos, iPos + 1).toUpperCase();
			if ("ABCDEFGHIJKLMNOPQRSTUVWXYZ".indexOf(strOne) == -1) {
				return false;
			}
		}
		return true;
	}
	
//	public static boolean isExistTELCD(String _payKind, String _telCD) {
//		boolean boolTelCDExist = false;
//		
//		String[] arrTELCO = {"11","16","19"};
//		int iSize = arrTELCO.length;
//		
//		if (_telCD != null) {
//			if(_payKind.equals("WT")){
//				if(_telCD.equals("00")){
//					boolTelCDExist = true;
//				}
//			}else if(_payKind.equals("HP")){
//				for (int iLoop = 0; iLoop<iSize; iLoop++){
//					String oneTelCo = arrTELCO[iLoop];
//					if(_telCD.equalsIgnoreCase(oneTelCo)){
//						boolTelCDExist = true;
//					}
//				}
//			}			
//		}
//		return boolTelCDExist;
//	}
	
//	public static boolean existLocalTelNO(String _payKind, String _acctCd, String _acctNo){
//		String[] arrLC_CD_HP = {"010","011","017","016","018","019",};
//		
//		String[] arrLC_CD_WT = {"02","031","032","033","041","042",
//	             "043","051","052","053","054","055",
//	             "061","062","063","064"};
//		
//		String strTelNO1 = "";
//		if(_payKind.equalsIgnoreCase("HP")){
//			strTelNO1 = _acctNo.substring(0,3);				
//		}else if(_payKind.equalsIgnoreCase("WT")){
//			strTelNO1 = _acctNo.substring(0,2);
//			if(strTelNO1.equalsIgnoreCase("02")){
//				strTelNO1 = "02";
//			}else{
//				strTelNO1 = _acctNo.substring(0,3);
//			}
//		}else if(_payKind.equalsIgnoreCase("KT")){
//			strTelNO1 = _acctNo.substring(0,2);
//			if(strTelNO1.equalsIgnoreCase("02")){
//				strTelNO1 = "02";
//			}else{
//				strTelNO1 = _acctNo.substring(0,3);
//			}
//		}
//		
//		
//		if(_payKind.equalsIgnoreCase("HP")){
//			if(_acctCd.equalsIgnoreCase("11")||_acctCd.equalsIgnoreCase("16")||_acctCd.equalsIgnoreCase("19")){
//				int iSize = arrLC_CD_HP.length;
//				for(int iLoop = 0; iLoop < iSize; iLoop++){
//					if(strTelNO1.equalsIgnoreCase(arrLC_CD_HP[iLoop])){
//						return true;
//					}
//				}
//			}
//		}else if(_payKind.equalsIgnoreCase("WT")){
//			if(_acctCd.equalsIgnoreCase("00")){
//				int iSize = arrLC_CD_WT.length;
//				for(int iLoop = 0; iLoop < iSize; iLoop++){
//					if(strTelNO1.equalsIgnoreCase(arrLC_CD_WT[iLoop])){
//						return true;
//					}
//				}	
//			}
//		}else if(_payKind.equalsIgnoreCase("KT")){
//			if(_acctCd.equalsIgnoreCase("KT")){
//				int iSize = arrLC_CD_WT.length;
//				for(int iLoop = 0; iLoop < iSize; iLoop++){
//					if(strTelNO1.equalsIgnoreCase(arrLC_CD_WT[iLoop])){
//						return true;
//					}
//				}	
//			}
//		}
//		
//		return false;
//	}
	
	/**
	 * null���� üũ�ؼ� ������ ���ڿ��� ��ü.
	 *
	 * @param param ��ȯ�� ���ڿ�
	 * @param newParam ��ȯ�� ���ڿ�
	 * @return �� ��ü ���ڿ�
	 */
	public static String tranNvl(String param, String newParam) {

		if (param == null ||
			param.equals("") ||
			param.length() == 0 ||
			param.equals("null")) {

			String reParam = newParam;
			return reParam;
		}
		else {
			return param.trim();
		}
	}

	
	/**
	 * int -> String
	 * @param in_i
	 * @return
	 */
	public static String tranStr(int in_i) {
		String sTmp = "";

		sTmp = String.valueOf(in_i);
		return sTmp;
	}

	/**
	 * long -> String
	 * @param in_l
	 * @return
	 */
	public static String tranStr(long in_l) {
		String sTmp = "";

		sTmp = String.valueOf(in_l);
		return sTmp;
	}

	/**
	 * String -> int
	 * @param in_s
	 * @return
	 */
	public static int tranInt(String in_s) {
		DecimalFormat decimalformat = new DecimalFormat();
		int iTmp = 0;

		if (in_s == null) {
			in_s = "";
		}

		try {
			iTmp = decimalformat.parse(in_s).intValue();
		}
		catch (Exception e) {
			iTmp = 0;
		}

		return iTmp;
	}

	/**
	 * String -> long
	 * @param in_s
	 * @return
	 */
	public static long tranLong(String in_s) {
		DecimalFormat decimalformat = new DecimalFormat();
		long lTmp;

		if (in_s == null) {
			in_s = "";
		}

		try {
			lTmp = decimalformat.parse(in_s).longValue();
		}
		catch (Exception e) {
			lTmp = 0;
		}

		return lTmp;
	}

	/**
	 * ��Ʈ������ ������ ���ڿ��� ���ο� ���ڿ��� ��ġ�ϴ� �޼ҵ�
	 *
	 * @param source    ��Ʈ��
	 * @param before    �ٲٰ����ϴ� ���ڿ�
	 * @param after     �ٲ�� ���ڿ�
	 * @return ����� ���ڿ�
	 */
	public static String tranReplace(String source, String before, String after) {
		int i = 0;
		int j = 0;
		StringBuffer sb = new StringBuffer();

		while ( (j = source.indexOf(before, i)) >= 0) {
			sb.append(source.substring(i, j));
			sb.append(after);
			i = j + before.length();
		}

		sb.append(source.substring(i));
		return sb.toString();
	}

	/**
	 * �Ҽ��� ����
	 *
	 * @param source    ��Ʈ��
	 * @return ����� ���ڿ�
	 */
	public static String tranDelSpot(String source) {
		int i = 0;
		if ( (i = source.indexOf(".")) >= 0) {
			source = source.substring(0, i);
			if (source.length() > 1) {
				source = source.substring(0, source.length() - 1) + "0";
			}
		}
		return source;
	}

	/**
	 * ���ڸ��� ������ ���̸�ŭ Zero�� ä���� ��ȯ
	 *
	 * @param num ó���ϰ����ϴ·�
	 * @param len ���ڿ� ��ü����
	 * @return ����ȹ��ڿ�
	 */
	public static String tranFillZero(long num, int len) {
		StringBuffer sb = new StringBuffer(len);
		int zeroCount = len - ("" + num).length();
		for (int i = 0; i < zeroCount; i++) {
			sb.append(0);
		}
		sb.append(num);
		return sb.toString();
	}


	/**
	 * ���ڸ��� ������ ���̸�ŭ Zero�� ä���� ��ȯ
	 *
	 * @param num ó���ϰ����ϴ���Ƽ��
	 * @param len ���ڿ� ��ü����
	 * @return ����ȹ��ڿ�
	 */
	public static String tranFillZero(int num, int len) {
		StringBuffer sb = new StringBuffer(len);
		int zeroCount = len - ("" + num).length();
		for (int i = 0; i < zeroCount; i++) {
			sb.append(0);
		}
		sb.append(num);
		return sb.toString();
	}

	/**
	 * ���ڸ��� ������ ���̸�ŭ Zero�� ä���� ��ȯ
	 *
	 * @param num ó���ϰ����ϴ½�Ʈ��
	 * @param len ���ڿ� ��ü����
	 * @return ����ȹ��ڿ�
	 */
	public static String tranFillZero(String num, int len) {
		StringBuffer sb = new StringBuffer(len);
		int zeroCount = len - num.length();
		for (int i = 0; i < zeroCount; i++) {
			sb.append(0);
		}
		sb.append(num);
		return sb.toString();
	}
	/**
	 * 10������ 16���� 10�ڸ��� Zero�� ä���� ��ȯ-UPPPERCASE���
	 *
	 * @param num ó���ϰ����ϴ½�Ʈ��
	 * @param len ���ڿ� ��ü����
	 * @return ����ȹ��ڿ�
	 */
	public static String tranHex(String in_s, int len) {		
		String sTmp = "";
		sTmp = Long.toHexString(tranLong(in_s));
		sTmp = tranFillZero(sTmp.toUpperCase(), len);
		return sTmp.toUpperCase();
	}
	
//	public static boolean chkDateFormat(String _procDate){
//		int iLeap = 0;
//		
//		String strYYYY = _procDate.substring(0,4);
//		String strMM = _procDate.substring(4,6);
//		String strDD = _procDate.substring(6,8);
//		int iYYYY = Integer.parseInt(strYYYY);
//		int iMM = Integer.parseInt(strMM);
//		int iDD = Integer.parseInt(strDD);
//		
//		// 1) ��üũ
//		if ((iMM < 1) || (iMM > 12)) {
//			return false;
//		}
//		// 2) ��üũ
//		if (iDD < 1) {
//			return false;
//		}
//		
//		// 3) ����üũ
//		if ((iYYYY % 4 == 0) || (iYYYY % 100 == 0) || (iYYYY) % 400 == 0) {
//			iLeap = 1;
//		}
//		if ((iMM == 2) && (iLeap == 1) && (iDD > 29)) {
//			return false;
//		}
//		if ((iMM == 2) && (iLeap != 1) && (iDD > 28)) {
//			return false;
//		}
//		
//		// 4) ��������������
//		if ((iDD > 31) && ((strMM.equals("01")) || (strMM.equals("03")) || (strMM.equals("05")) || (strMM.equals("07")) || (strMM.equals("08")) || (strMM.equals("10")) || (strMM.equals("12")))) {
//			return false;
//		}
//		if ((iDD > 30) && ((strMM.equals("04")) || (strMM.equals("06")) || (strMM.equals("09")) || (strMM.equals("11")))) {
//			return false;
//		}
//		return true;
//	}
	
	 /**
     * �������ڷ� �����Ѵ�.
     * @param src �����Ұ�
     * @return String ����Ȱ�
     */
    public static String tranFullChar(String src) {
        // ��ȯ�� ���ڵ��� �׾Ƴ��� StringBuffer �� �����Ѵ�
        StringBuffer strBuf = new StringBuffer();
        char c = 0;
        int nSrcLength = src.length();

        for (int i = 0; i < nSrcLength; i++) {
            c = src.charAt(i);
            //�����̰ų� Ư�� ���� �ϰ��.
            if (c >= 0x21 && c <= 0x7e) {
                c += 0xfee0;
            } else if (c == 0x20) {
            	//������ ���
                c = 0x3000;
            }
            // ���ڿ� ���ۿ� ��ȯ�� ���ڸ� �״´�
            strBuf.append(c);
        }
        return strBuf.toString();
    }
    
    /**
	 *���糯¥�����Ѵ�.
	 */
	public static String getNowDate() {
		Calendar cal = Calendar.getInstance();
		String strNowDate = new SimpleDateFormat("yyyyMMdd").format(cal.getTime());
		String strYear = strNowDate.substring(0, 4);
		String strMonth = strNowDate.substring(4, 6);
		String strDate = strNowDate.substring(6, 8);
		return strNowDate;
	}
	
	/**
	 *����ð������Ѵ�.
	 */
	public static String getNowTime() {
		Calendar cal = Calendar.getInstance();
		String strNowTime = new SimpleDateFormat("HHmmss").format(cal.getTime());
		String strHour = strNowTime.substring(0, 2);
		String strMin = strNowTime.substring(2, 4);
		String strSec = strNowTime.substring(4, 6);
		return strNowTime;
	}
	
	/**
	 * ���ڷ� �̷�������� �˻�.
	 * @param strnum  -  �˻��� ���ڿ� 
	 * @param min - �ּ� �ڸ��� 
	 * @param max - �ִ� �ڸ��� 
	 * @return boolean
	 */
	public static boolean check_num_field(String strnum, int min, int max) {
		boolean isTrue=false;
		try {
			Pattern pattern = Pattern.compile("^[0-9]{"+min+","+max+"}$");
			Matcher match = pattern.matcher(strnum);
			if(match.find()) {
				isTrue = true;				
			}
		} catch (Exception e) {
		}
		return isTrue;		
	}	
}
