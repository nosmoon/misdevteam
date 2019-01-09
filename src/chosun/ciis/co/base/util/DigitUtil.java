package chosun.ciis.co.base.util;

import java.util.StringTokenizer;


public final class DigitUtil {
	
	 
	public static String nf_format(Integer value){
		
		if(value == null) return "0";
		
		return nf_format(value.intValue());
		
	}
	public static String nf_format(double value) {
		java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance();
		return nf.format(value); 
	}
	public static String nf_format(long value) {
		java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance();
		return nf.format(value); 
	}
	/**
	 * 
	 * 1222333444 => 1,222,333,444ë¡? encoding
	 * 
	 * @param digit
	 * @return
	 */
	
	public static String nf_format(String digit){
		return nf_format(digit, ",");
	}
	
	public static final String nf_format( String digit, String sep ){
		String source = (digit == null ? "" : digit ) ;
	
		boolean isMinus = source.startsWith( "-" ) ;
		if( isMinus ) {
			source = source.substring( 1 ) ;
		}
		
		StringBuffer	sb = new StringBuffer() ;
	
		int n = -1 ;
	
		int underPoint = source.indexOf( "." ) ;
		
		String underDigit = null ;
		String decimal = null ;
		
		if( underPoint != -1 ){
			decimal = source.substring( 0, underPoint ) ;
			underDigit = source.substring( underPoint ) ;
		}
		else{
			decimal = source ;
		}
		
		for( int  len = decimal.length(), i = len-1 ; i > -1 ; i -- ){
			char c = decimal.charAt( i ) ;
			
			++n ;
			
			if( n != 0 && (n % 3 == 0) ) {
				sb.insert( 0, sep ) ;
				sb.insert( 0, c ) ;
			}
			else
				sb.insert(0, c) ;
		}
	
		if( underDigit != null ){
			sb.append( underDigit ) ;
		}
	
		if( isMinus ){
			sb.insert( 0 , "-" ) ;
		}
	
		return sb.toString() ;
	}
	/**
	 * 
	 * digit??¤ì?? totalLenê°? ??????ë¡? blankChar??? append
	 * 
	 * @param source
	 * @param totalLen
	 * @param blankChar
	 * @return
	 */
	public static final String appendChar( String source, int totalLen, char blankChar ){
		String s = (source == null ? "" : source) ;
	
		boolean isMinus = s.startsWith( "-" ) ;
		if( isMinus ) {
//			s = s.substring( 1 ) ;
		}
	
		int len = s.length() ;
		
		if( totalLen < len ){
			return source ;
		}
		
		char[] ch = new char[totalLen] ;
	
		System.arraycopy( s.toCharArray(), 0, ch, 0, len ) ;
		
		for( int i = len ; i < totalLen ; i ++ ){
			ch[i] = blankChar ;
		}
	
		String newString = new String( ch ) ;
		
		return newString;
		//return (isMinus ? new StringBuffer( "-" ).append( newString ).toString() : newString ) ;
			
	}
	/**
	 * ????????? cutIndex???ë¦¬ì????? ??¤ì?? ??«ì??ê°? 5??´ì????? ë°???¬ë¦¼???ê³? ??´í????? ???ë¥¸ë??.
	 *
	 * @param src  ???????????? ??¬í?¨í????? String
	 * @param cutIndex  ????????? cutIndex ???ë¦¬ì????? ë°???¬ë¦¼??? ???ì¹?
	 * @return  cutIndex??? ?????? ë°???¬ë¦¼??? String
	 */
	public static final String cutUnderPoint( String src, int cutIndex ){
		
		if("".equals(StringUtil.nvl(src))) return src;
		
		return cutUnderPoint(Double.parseDouble(src), cutIndex) ;	
	}
	/**
	 * ????????? cutIndex???ë¦¬ì????? ??¤ì?? ??«ì??ê°? 5??´ì????? ë°???¬ë¦¼???ê³? ??´í????? ???ë¥¸ë??.
	 *
	 * @param src  ???????????? ??¬í?¨í????? String
	 * @param cutIndex  ????????? cutIndex ???ë¦¬ì????? ë°???¬ë¦¼??? ???ì¹?
	 * @return  cutIndex??? ?????? ë°???¬ë¦¼??? String 
	 */
	public static final String cutUnderPoint(double src, int cutIndex ){
		
		
			
		if(cutIndex < 0) return String.valueOf(src) ;
	
		String s = roundDouble(src, cutIndex) ;
	
		String returnValue = null ;
		
		int pIndex = s.indexOf( "." ) ;
		
		if(pIndex == -1 ){
			returnValue = new StringBuffer(s).append( "." ).toString() ;
			returnValue = appendChar(returnValue, returnValue.length()+cutIndex, '0' ) ;
		}
		else{
			returnValue = s ;
			returnValue = appendChar(returnValue, pIndex+ cutIndex+1, '0') ;
		}
	
		if(cutIndex == 0 && returnValue != null && returnValue.length() >= 1 ){
			returnValue = returnValue.substring( 0, returnValue.length()-1) ;
		}
	
		return returnValue ;
	
	}	
	/**
	 * 
	 * source??? ?????? totalLen ê°? ??????ë¡? blankCharë¥? insert...
	 * 
	 * @param source
	 * @param totalLen
	 * @param blankChar
	 * @return
	 */
	public static String insertChar( String source, int totalLen, char blankChar ){
		if( totalLen < 1 ){
			return source ;
		}
		
		String s = (source == null ? "" : source ) ;
	
		boolean isMinus = s.startsWith( "-" ) ;
		if( isMinus ) {
			s = s.substring( 1 ) ;
		}
		
		int sLen = s.length() ;
		
		if( totalLen < sLen ){
			return source ;
		}
	
		char[] ch = new char[totalLen] ;
	
		int loop = totalLen-sLen ;
		for( int i = 0 ; i < loop ; i ++ ){
			ch[i] = blankChar ;
		}
	
		System.arraycopy( s.toCharArray(), 0, ch, loop, sLen ) ;
	
		String newString = new String( ch ) ;
		
		return (isMinus ? new StringBuffer("-").append( newString ).toString() : newString ) ;
	}
	public static boolean isNumber(char c)  {
		if (c < '0' || c > '9') return false;
		return true;
	}
	public static boolean isNumber(String s)  {
		int len = s.length();
		for (int i = 0; i < len; i++) {
			if (!isNumber(s.charAt(i))) return false;
		}
		return true;
	}
	/**
	 * 
	 * source??? ?????? curChar ???ê±?
	 * 
	 * @param source
	 * @param cutChar
	 * @return
	 */
	public static String removeChar( String source, char cutChar ){
		String s = source == null ? "" : source ;
	
		int len = s.length() ;
	
		if( len == 0 ){
			return s;
		}
	
		char[] ch = new char[len] ;
		int index = 0 ;
		
		for( int i = 0 ; i < len ; i ++ ){
			char c = s.charAt( i ) ;
			
			if( c != cutChar ){
				ch[index++] = c ;
			}
		}
	
		if( index == 0 ){
			return s ;
		}
		char[] newChar = new char[index] ;
		System.arraycopy( ch, 0, newChar, 0, index ) ;
	
		return new String( newChar ) ;
	}
	/**
	 * 1,222,333,444 => 1222333444 ë¡? Decoding
	 *
	 * @param digit
	 * @param sep
	 * @return
	 */
	public static final String removeNumberComma( String digit, String sep ){
		int len = digit == null ? 0 : digit.length() ;
	
		if( len == 0 ) return digit ;
		
		StringTokenizer token = new StringTokenizer( digit, sep ) ;
	
		char[] decoded = new char[ len ] ;
		
		int n = 0 ;
		while( token.hasMoreTokens() ){
			char[] ch = token.nextToken().toCharArray() ;
			int size = ch.length ;
			System.arraycopy( ch, 0, decoded, n, size ) ;
	
			n += size ;
		}
			
		return new String( decoded, 0, n ) ;
	}
	/**
	 * source??? ?????? ????????? ???ê±?...
	 * 
	 * @param source
	 * @return
	 */
	public static String removePoint( String source ){
		return removeChar( source, '.' ) ;
	}
	/**
	 * source??? ?????? ????????????ê±?
	 * ????????? ???ê±°ì?? ???ì§???? ???ë¦¬ì?? totalDecimalLen ë§???? ?????? blankCharë¥? insert ë°? ????????? ???ë¦¬ì?? blankChar append
	 * 
	 * @param source
	 * @param totalDecimalLen
	 * @param totalPointLen
	 * @param blankChar
	 * @return
	 */
	public static String removePoint( String source, int totalDecimalLen, int totalPointLen, char blankChar ){
		String s = source == null ? "" : source ;
	
		boolean isMinus = s.startsWith( "-" ) ;
		if( isMinus ) {
			s = s.substring( 1 ) ;
		}
	
		int len = s.length();
		
		if( len == 0 ){
			return s ;
		}
		
		int point = s.indexOf( '.' ) ;
	
		boolean hasPoint = ( point > -1 );
	
		String decimal = null ;
		String underPoint = null ;
	
		if( hasPoint ){
			decimal = s.substring( 0, point ) ;
			underPoint = s.substring( point + 1 ) ;
		}
		else{
			decimal = s ;
		}
	
		StringBuffer sb = new StringBuffer() ;
		
		sb.append( insertChar( decimal, totalDecimalLen, blankChar ) );
	
		if( underPoint != null ){
			sb.append( appendChar( underPoint, totalPointLen, blankChar )) ;	
		}
	
		return (isMinus ? sb.insert(0, "-").toString() : sb.toString() ) ;
	}
	
	public static String roundDouble(double value, int maxFractionDigits) {
		java.text.NumberFormat nf = java.text.NumberFormat.getNumberInstance();
		nf.setMaximumFractionDigits(maxFractionDigits);//ìµ???? ?????????ë¦? ??¤ì?? 
		String sValue = nf.format(value); 
	
		String dot = ".";
		for (int i = 0; i < maxFractionDigits; i++) {
			dot += "0";
		}
		if (sValue.indexOf(dot) > 0) {
			sValue = sValue.substring(0, sValue.indexOf("."));
		}
		return sValue;
	}
}
