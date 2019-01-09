package fms.common.tele;

import fms.util.UtilMethod;


public class HP_SampleTelegrams {

	public static String TEST_CUSTID = "sdsitest";
	public static String TEST_CUSTPW = "testtest";
	public static String REAL_CUSTID = "sdsitest";
	public static String REAL_CUSTPW = "1111111q";
	
	public static String TEST_SWID = "sdsiswsw";
	public static String TEST_SWTPW = "swswswsw";
	public static String REAL_SWID = "swswreal";
	public static String REAL_SWPW = "swswswsw";

	/*
	 * 휴대전화
	 */
//	public static String MOB_TGR_NO="999992";//휴대전화서비스 연번
//	public static String MOB_CON_APPLY  = "sdsitesttesttestswswtestswswswswMOBN" + UtilMethod.getToday() + MOB_TGR_NO + "201012141           7210251_01029906613 LG01056552640    7210251_01029906613 8103111231721      100                                                                                           fms test\r\n";
//	public static String MOB_CON_CANCEL_APPLY  = "sdsitesttesttestswswtestswswswswMOBC              201012141           7210251_01029906613 LG01056552640    7210251_01029906613 8103111231721      100                      10005196110520999992                                                 fms test\r\n";
//	public static String MOB_CON_SEARCH_APPLY  = "sdsitesttesttestswswtestswswswswMOBS" + "20101012" + MOB_TGR_NO + "201012141           7210251_01029906613 SK01029906613    7210251_01029906613 7210251348213      100                      20101214000013ACPGD0                                                 fms test\r\n";

	public static String MOB_TGR_NO="000001";//휴대전화서비스 연번
	
	public static String tt  = "sdsitest1111qqqqswswrealswswswswMOBN20150420000111hello01             헬로                LG01056552640    헬로                8103111            2000                                                                                                  \r\n";

	
	public static String MOB_CON_APPLY  = 
		"sdsitesttesttest" + 		//업체ID, 업체PW
		"swswtestswswswsw" + 		//프로그램업체ID, 프로그램업체PW
		"MOB" + 					//결제구분
		"N" + 						//업무구분
		UtilMethod.getToday() + 	//승인일
		(System.currentTimeMillis()+"").substring(7, 13) +		//휴대전화 서비스 연번 
		"1015327             " + 	//회원번호
		"홍길동              " + 	//회원명
		"SK" + 						//이통사
//		"01056552640    " +  		//LG 테스트용 결제전화번호
		"01011115523    " +  		//LG 테스트용 결제전화번호
		"홍길동              " + 	//결제명의자성명
		"8902082      " + 			//LG 테스트용 결제명의자주민번호
		"      " + 					//미사용
		"10        " + 				//승인신청금액
		"                                                                                    fms test\r\n";
	public static String MOB_CON_CANCEL_APPLY  = 
		"sdsitesttesttestswswtestswswswswMOBC              201012141           7210251_01029906613 LG01056552640    7210251_01029906613 8103111231721      100                      " +
		"10005196110520999994" + //승인키
		"                                                 fms test\r\n";
	
	public static String MOB_CON_CANCEL_APPLY2  =	"sdsitesttesttestswswtestswswswswMOBC                                                                                                                                       SK141128000005000001                                                         \r\n";
	
	public static String MOB_CON_SEARCH_APPLY  = "sdsitesttesttestswswtestswswswswMOBS" + "20150204" + MOB_TGR_NO + "201502041           7210251_01029906613 SK01029906613    7210251_01029906613 7210251348213      100                      20101214000013ACPGD0                                                 fms test\r\n";
	public static String MOB_Start_CON_APPLY  =	"SsdsitesttesttestswswtestswswswswCONA20110112                                                                                                                                          \r\n";
	public static String MOB_Start_PAY_RESULT =	"SsdsitesttesttestswswtestswswswswPAYR20150518                                                                                                                                          \r\n";
	
	public static String MOB_Start_MEM_RESULT =	"SsdsitesttesttestswswtestswswswswCOPS20150420100703                                                                                                                                    \r\n";
	
	
	public static String REAL_M_S =	"sdsitesttesttestswswtestswswswswMOBS20150513000901                                                                                                                                                                                                      \r\n";
	
	public static String HP_AUTH  = 
		"krsysars  krsy2314  " + 		//프로그램업체ID, 프로그램업체PW
		"kwangju0  gjars2999 " + 		//업체ID, 업체PW
		"5000" + 					//업무구분
		"100" + 					//작업구분
		UtilMethod.getToday() + 	//신청일
		(System.currentTimeMillis()+"").substring(7, 13) +		//휴대전화 서비스 연번 
		" " + 						//처리결과
		"    " + 					//결과코드
		"                              " +//결과메세지
		"fms test          " + 		//업체사용영역
		"LG" + 						//이통사
		"01056552640" + 			//휴대폰번호 [테스트용]
		"8103111231721" + 			//LG 테스트용 결제명의자주민번호
//		"LG" + 						//이통사
//		"01055857607" + 			//휴대폰번호
//		"6812071069515" + 			//LG 실제거래용
//		"SK" + 						//이통사
//		"0193951457 " + 			//휴대폰번호
//		"8307231300511" + 			//SK 테스트용 결제명의자주민번호
//		"KT" + 						//이통사
//		"01040384079" + 			//휴대폰번호
//		"8109291929416" + 			//KT 테스트용 결제명의자주민번호
		"          " ;				//명의자명
	
	public static String CARD_AUTH  = "sdsitest  testtest  swswtest  swswswsw  AUT201503161212121111111111111111201503121212121212        811104                                                                                                                                               \r\n";
	
	public static String ARS  = "SsdsitesttesttestswswtestswswswswMEMA20150318123132                                                                                                                                    \r\n";
	public static String ARS_Header  = "Hjhd112  1                                                                                                                                                                             \r\n";
	public static String ARS_Data = "Djhd111  WTN13131314            jyj                 0510000     999912310001039881524    홍길동              8111041                                                                   \r\n";
	public static String ARS_Tail  = "Tjhd111                                                                                                                                                                                \r\n";
	
	public static String REALPAY  = "SsdsitesttesttestswswtestswswswswTAXC20150317000001T                                                                                                                                                       \r\n";
	
	public static String MOB  = "sdsitesttesttestswswtestswswswswMOBN20150317123457123457              123457              SK01039111523    123457              8111041            1000                                                                                                  \r\n";
	
	//모바일 회원신청
	public static String MOB_S_MEM  = "Ssdsitest1111qqqqswswrealswswswswMEPA20150506000001                                                                                                                                    \r\n";
	//모바일 회원신청
	public static String MOB_S_H_MEM  = "Hsdsitest2                                                                                                                                                                             \r\n";
	public static String[] MOB_S_D_MEM  = {
		"DsdsitestHPN335003              홍길동              031000              1101939881234    홍길동              8102051                                                                   \r\n",
		"DsdsitestHPN335004              정맹지              031000              1101939881234    홍길동              8102051                                                                   \r\n",
	};
	//모바일 회원신청(소액결제)
	public static String[] MOB_S_D_MEP  = {
		"DsdsitestHPNPooh005             헬로p                                   1101011332255    헬로p               8809162      N                                                                                     \r\n",
		"DsdsitestHPNPooh006             헬로p2                                  1101011332255    헬로p2              8809162      N                                                                                     \r\n",
	};
	public static String MOB_S_T_MEM  = "Tsdsitest                                                                                                                                                                              \r\n";
	
	public static String MOB_S  = "SsdsitesttesttestswswtestswswswswCONA20150420000001                                                                                                                                    \r\n";
	
	public static String MOB_S2  = "SsdsitesttesttestswswtestswswswswMEMA20150420                                                                                                                                          \r\n";
	public static String MOB_S_H  = "Hsdsitest2                                                                                                                                                                             \r\n";
	public static String[] MOB_S_D  = {
		"DsdsitestHPNPooh005             홍길동              031000              1101931111234    홍길동              8102051                                                                   \r\n",
		"DsdsitestHPNPooh005             홍길동              031000              1101931111234    홍길동              8102051                                                                   \r\n",
	};
	public static String MOB_S_T  = "Tsdsitest                                                                                                                                                                              \r\n";
	
	public static String MOB_S_PAY  = "SsdsitesttesttestswswtestswswswswCOPA20150422000003                                                                                                                                    \r\n";
	public static String MOB_S_H_PAY  = "Hsdsitest2     8000                                                                                                                                                                    \r\n";
	//모바일 승인신청(회원 결제정보 이용)
	/*public static String[] MOB_S_D_PAY  = {
		"DsdsitestHPN335003              홍길동              000001                          5000                                                                                               \r\n",
		"DsdsitestHPN335003              홍길동              000002                          5000                                                                                               \r\n",
	};*/
	
	//모바일 승인신청(결제정보 포함)
	public static String[] MOB_S_D_PAY  = {
		"DsdsitestHPNPooh005             홍길동              000001      1101066666666    홍길동              8102041      Y456456                             4000                                                                                                   \r\n",
		"DsdsitestHPNPooh005             홍길동              000002      1101066666666    홍길동              8102041      Y456456                             4000                                                                                                   \r\n",
	};
	public static String MOB_S_T_PAY  = "Tsdsitest                                                                                                                                                                              \r\n";
	
	public static String MOB_CON_APPLY2  = 
			"sdsitesttesttest" + 		//업체ID, 업체PW
			"swswtestswswswsw" + 		//프로그램업체ID, 프로그램업체PW
			"MOB" + 					//결제구분
			"N" + 						//업무구분
			UtilMethod.getToday() + 	//승인일
			(System.currentTimeMillis()+"").substring(7, 13) +		//휴대전화 서비스 연번 
			"797979797979        " + 	//회원번호
			"7_79797979799906613 " + 	//회원명
			"KT" + 						//이통사
//			"01056552640    " +  		//LG 테스트용 결제전화번호
			"01039001524    " +  		//LG 테스트용 결제전화번호
			"테스트용            " + 	//결제명의자성명
			"8122011      " + 			//LG 테스트용 결제명의자주민번호
			"      " + 					//미사용
			"500       " + 				//승인신청금액
			"                                                                                    fms test\r\n";
	
}
