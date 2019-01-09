package chosun.ciis.pl.base.util;

import java.util.StringTokenizer;

public class StringUtil {
	/**
	 * NULL => ""
	 * 
	 * @param str
	 * @return
	 */
	public static String nvl(String str)
	{
		return nvl(str, ""); 
	}
	/**
	 * NULL값을 지정한 문자열로 변환
	 * 
	 * @param str
	 * @param str1
	 * @return
	 */
	public static String nvl(String str, String str1)
	{
		if(str == null || "".equals(str)) return str1;
		
		return str.trim();
	}
	
	public static String printArray(String[] arr){
		
		if(arr == null) return "";
		
		StringBuffer sb = new StringBuffer();
		for(int i=0; i<arr.length; i++){
			sb.append(arr[i]);
			if(i<arr.length-1){
				sb.append(",");
			}
		}
		return sb.toString();
	}
	public static String[] toArray(String str, String sep){

		String[] temp = new String[0];

		try{
			StringTokenizer st = new StringTokenizer(str, sep);
			temp = new String[st.countTokens()];
			int index = 0;
			while(st.hasMoreTokens()){
				temp[index++] = st.nextToken().trim();
			}
		}catch(Exception e){
			e.printStackTrace();
		}

		return temp;
	}
	
	public static double toDouble(String str){
		
		double rv = 0;
		
		if(str == null || "".equals(str)) return rv;
		
		String temp = strip(str.trim(), ",");
		
		try{
			rv = Double.parseDouble(temp);
		}catch(NumberFormatException nfe){
		}
		
		return rv;
	}
	public static long toLong(String str){
		
		long rv = 0;
		
		if(str == null || "".equals(str)) return rv;
		
		String temp = strip(str.trim(), ",");
		
		try{
			rv = Long.parseLong(temp);
		}catch(NumberFormatException nfe){
		}
		
		return rv;
	}
	public static int toNumber(String str){
		
		int rv = 0;
		
		if(str == null || "".equals(str)) return rv;
		
		String temp = strip(str.trim(), ",");
		
		try{
			rv = Integer.parseInt(temp);
		}catch(NumberFormatException nfe){
		}
		
		return rv;
	}

	
    /**
     * 문자열에서 해당문자 제거
     * 
     * @param str
     * @param str1
     * @return
     */
    public static String strip(String str, String str1){
    	
    	if(str == null || "".equals(str.trim())) return "";
    	
	    String temp = str;
		int pos = -1;
		while((pos = temp.indexOf(str1, pos)) != -1) {
			String left = temp.substring(0, pos);
			String right = temp.substring(pos + 1, temp.length());
			temp = left + "" + right;
			pos += 1;
		}		
		return temp;    	
    }

    public static String strip(String str){
    	return strip(str, "-");
    }
	
	public static String replaceString(String s, String from, String to) {
		int sp = 0;
		int ep = 0;
		String smallStr = s;

		while (s.indexOf(from) >= 0) {
			sp = 0;
			ep = 0;
			smallStr = s;
			
			while (ep <= smallStr.length()) {
				ep = smallStr.indexOf(from, sp);
				sp = ep + to.length();

				if (ep < 0) {
					return s;
				} 
				else {
					s = s.substring(0, ep) + to + s.substring(ep+from.length());
					smallStr = smallStr.substring(0, ep) + to + smallStr.substring(ep+from.length());
				}
			}
		}
		return s;
	}		
	

    public static String substr(String str, int s, int e){
    	String rv = "";
    	if(str == null) return rv;
    	try{
    		rv = str.substring(s, e);
    	}catch(Exception ex){
    		
    	}
    	return rv;
    }
   
    public static String[] toArray(String str, int length){
    	
    	int size = str.length() / length;
    	String[] rv = new String[size];
    	int idx  = 0;

    	for(int i=0; i<str.length(); i += length){
    		try{
	    		rv[idx++] = str.substring(i, i+length);
    		}catch(Exception e){
    			break;
    		}
    	}
    	
    	return rv;
    }
    
}
