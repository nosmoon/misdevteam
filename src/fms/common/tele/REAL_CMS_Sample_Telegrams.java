package fms.common.tele;

import fms.util.UtilMethod;


public class REAL_CMS_Sample_Telegrams {	
	/** TEST **/
	/*
	 * 실시간CMS 건별
	 */
	// ****공통부 0-100
	public static String REALCMS_COMMON = 
			"sdsitest  " +
			"testtest  " +
			"swswtest  " +
			"swswswsw  " +
			(UtilMethod.getToday()-20000000)+						//거래일자
			"1000" +
			"100" +													// 일반
			"066888" +												//연번
			"                                         "; 	//FMS 설정영역(전송일자,전송시간,응답결과,응답코드, FMS사용영역)
	// 일반
	public static String REALCMS_PAY_APPLY =
		REALCMS_COMMON +
		// 출금신청 개별부	
		"34" + 														// 은행코드
		"841101154874111" +											// 계좌번호
		"871123       " +											// 계좌주생년월일
		"배치테스트2         " +									//예금주명
		"00011634            " +									//회원번호
		"000000000010000" +											//출금금액
		"01" +														//납입회차
		"                                                                                                                            fms test ";
	
	public static String REALCMS_ACCT_SEARCH_ONE = "sdsitesttesttestswswtestswswswsw1410161000300000001                                                 1112345679800    801212       테스트                                                                                                                                      ";
	public static String REALCMS_ACCT_SEARCH_ONE_AA = "SsdsitesttesttestswswtestswswswswPAYS20150330                                                                                                                                          \r\n";
	
	public static String REALCMS_PAY_RESULT =
			"sdsitesttesttestswswtestswswswsw" +
			(UtilMethod.getToday()-20000000)+						//송신일자
			"1000" +												//전문구분
			"200" + 												//업무구분
			"      " + 												//연번 (결과조회시는 미사용)
			"                                                 " + 
			"141016" +												//원거래건 거래일자 
			"000001" + 												//원거래건 연번
			"                                                                                                                                                           fms";

}
