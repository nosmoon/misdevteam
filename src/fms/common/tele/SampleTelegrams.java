package fms.common.tele;

import fms.util.UtilMethod;


public class SampleTelegrams {

	public static String TEST_CUSTID = "sdsitest";
	public static String TEST_CUSTPW = "testtest";
	public static String REAL_CUSTID = "sdsitest";
	public static String REAL_CUSTPW = "1111qqqq";
	
	public static String TEST_SWID = "sdsiswsw";
	public static String TEST_SWTPW = "swswswsw";
	public static String REAL_SWID = "swswreal";
	public static String REAL_SWPW = "swswswsw";
	
	public static String NSDSI_TEST_SWID = "swswtest";
	public static String NSDSI_TEST_SWTPW = "swswswsw";
	public static String NSDSI_REAL_SWID = "swswreal";
	public static String NSDSI_REAL_SWPW = "swswswsw";

	/*
	 * 휴대전화
	 */
//	public static String MOB_TGR_NO="999992";//휴대전화서비스 연번
//	public static String MOB_CON_APPLY  = "sdsitesttesttestswswtestswswswswMOBN" + UtilMethod.getToday() + MOB_TGR_NO + "201012141           7210251_01029906613 LG01056552640    7210251_01029906613 8103111231721      100                                                                                           fms test\r\n";
//	public static String MOB_CON_CANCEL_APPLY  = "sdsitesttesttestswswtestswswswswMOBC              201012141           7210251_01029906613 LG01056552640    7210251_01029906613 8103111231721      100                      10005196110520999992                                                 fms test\r\n";
//	public static String MOB_CON_SEARCH_APPLY  = "sdsitesttesttestswswtestswswswswMOBS" + "20101012" + MOB_TGR_NO + "201012141           7210251_01029906613 SK01029906613    7210251_01029906613 7210251348213      100                      20101214000013ACPGD0                                                 fms test\r\n";

	public static String MOB_TGR_NO="999994";//휴대전화서비스 연번
	
	public static String MOB_CON_APPLY  = 
		"sdsitesttesttest" + 		//업체ID, 업체PW
		"swswtestswswswsw" + 		//프로그램업체ID, 프로그램업체PW
		"MOB" + 					//결제구분
		"N" + 						//업무구분
		UtilMethod.getToday() + 	//승인일
		(System.currentTimeMillis()+"").substring(7, 13) +		//휴대전화 서비스 연번 
		"201012141           " + 	//회원번호
		"7210251_01029906613 " + 	//회원명
		"LG" + 						//이통사
		"01056552640    " +  		//LG 테스트용 결제전화번호
		"7210251_01029906613 " + 	//결제명의자성명
		"8103111231721" + 			//LG 테스트용 결제명의자주민번호
		"      " + 					//미사용
		"500       " + 				//승인신청금액
		"                                                                                    fms test\r\n";
	public static String MOB_CON_CANCEL_APPLY  = 
		"sdsitesttesttestswswtestswswswswMOBC              201012141           7210251_01029906613 LG01056552640    7210251_01029906613 8103111231721      100                      " +
		"10005196110520999994" + //승인키
		"                                                 fms test\r\n";
	public static String MOB_CON_SEARCH_APPLY  = "sdsitesttesttestswswtestswswswswMOBS" + "20101012" + MOB_TGR_NO + "201012141           7210251_01029906613 SK01029906613    7210251_01029906613 7210251348213      100                      20101214000013ACPGD0                                                 fms test\r\n";
	public static String MOB_Start_CON_APPLY  =	"SsdsitesttesttestswswtestswswswswCONA20110112                                                                                                                                          \r\n";
	public static String MOB_Start_PAY_RESULT =	"SsdsitesttesttestswswtestswswswswPAYR20110831                                                                                                                                          \r\n";
	
	
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
		 
	
	
	/*
	 * BestCMS
	 */
	//회원데이터 이관요청전문
	public static String BestCMS_Cobfah_MemData_REQ = "testtest  pbg5924   pbgtax11bizon       2000100                                                     \r\n";
	
	//업체데이터 이관요청전문
	public static String BestCMS_Cobfah_CustData_REQ = "testtest  pbg5924   pbgtax11bizon       1000100                                                     \r\n";

	//출금
	public static String BestCMS_Start_PAY_Apply = "Ssdsitest  testtest  testtest  hantaxsw  PAYA20110413                                                                                                                                          \r\n";
	
	
	
	/*
	 * 배치CMS
	 */
	public static String CMS_Start_MEM_APPLY  = "SsdsitesttesttestswswtestswswswswMEMA20131001                                                                                                                                     fms  \r\n";
	public static String CMS_Start_MEM_APPLY_REAL  = "SsdsitesttesttestswswtestswswswswMEMA20130430                                                                                                                                     fms  \r\n";
	
	public static String CMS_Start_MEM_SEARCH =	"SsdsitesttesttestswswtestswswswswMEMS20101001                                                                                                                                          \r\n";
	public static String CMS_Start_MEM_RESULT =	"SsdsitesttesttestswswtestswswswswMEMR20111111                                                                                                                                          \r\n";
	
	public static String CMS_Start_PAY_APPLY  =	"SsdsitesttesttestswswtestswswswswPAYA20130617                                                                                                                                          \r\n";
	public static String CMS_Start_PAY_SEARCH =	"SsdsitesttesttestswswtestswswswswPAYS20110104                                                                                                                                          \r\n";
	public static String CMS_Start_PAY_RESULT =	"SsdsitesttesttestswswtestswswswswPAYR20111102                                                                                                                                          \r\n";
	
	
	public static String CMS_MEM_HEADER 	= "Hsdsitest1                                                                                                                                                                             \r\n";
	public static String CMS_MEM_HEADER_REAL 	= "Hsdsitest4                                                                                                                                                                             \r\n";
	
	public static String CMS_MEM_N_DATA 	= "DsdsitestN0110000001          홍길동☆            010000000000999912312632504546060    홍길동              8307121300512                                                               \r\n";
	public static String CMS_MEM_U_DATA 	= "DsdsitestU0000000002          홍길동              01000000000099991231115248056845     김길동              8505301545514                                                               \r\n";
	public static String CMS_MEM_D_DATA 	= "DsdsitestD0000000003          홍길동                                                                                                                                                   \r\n";
	public static String CMS_MEM_N_REAL     = "DsdsitestNP000000001          부분출              010000000000999912310202085516456739 홍길동              8307191332711                                                               \r\n";
	public static String CMS_MEM_N_REAL2     = "DsdsitestNP000000002          부분출              010000000000999912310202085516456738 홍길동              8307191332711                                                               \r\n";
	public static String CMS_MEM_N_REAL3     = "DsdsitestNP000000003          부분출              010000000000999912310202085516456739 홍길동              8207191332711                                                               \r\n";
	public static String CMS_MEM_N_REAL4     = "DsdsitestNP000000004          부분출              010000000000999912310202085516456719 홍길동              8107191332711                                                               \r\n";
	public static String CMS_MEM_TAIL		= "Tsdsitest                                                                                                                                                                              \r\n";
	public static String CMS_MEM_TAIL_REAL		= "Tsdsitest                                                                                                                                                                              \r\n";
	
	
	
	public static String CMS_PAY_HEADER		= "Hsdsitest1     140000                                                                                                                                                                  \r\n";
	public static String [] CMS_PAY_N_DATA 	= {
		"DsdsitestNs0002               신화에릭            000001      140000                                                                                                                   \r\n",		
		//"DsdsitestN201108190562        최보스              000002      30000                                                                                                                    \r\n",
		//"DsdsitestN201108240596        최명월              000003      40000                                                                                                                    \r\n",
		//"DsdsitestN201108190557        은설씨              000003      40000                                                                                                                    \r\n"
	};
	
	public static String CMS_PAY_TAIL 		= "Tsdsitest                                                                                                                                                                              \r\n";
	
	
	/*
	 * 현금영수증
	 */
	public static String TAX_Sart =		"SsdsitesttesttestswswtestswswswswTAXR20100105000001                                                                                                                                                        \r\n";
	public static String TAX_Cust_Req =	"SsdsitesttesttestswswtestswswswswTAXD20100223000001                                                                                                                                                        \r\n";
	public static String TAX_Header =	"Hsdsitest0000010000000000500000000000000000000000000                                                                                                                                                       \r\n";
	public static String TAX_Data = 	"Dsdsitest000000100000000500000193951457                                                                                         위태준                                                                     ";
	public static String TAX_Tail =		"Tsdsitest000001000000000050000000000000000000000000000000000000000000000                                                                                                                                   \r\n";
	
	
	/*
	 * 가상계좌
	 */
	//public static String Virtual_Mem_Start 			= 	"Ssdsitesttesttestswswtestswswswsw1000
	public static String Virtual_Mem_Start 			= 	"Ssdsitesttesttestswswtestswswswsw1000                                                                                                  ";
	public static String Virtual_Deposit_Start 		= 	"Ssdsitesttesttestswswtestswswswsw2000                                                                                                  ";
	
	public static String Virtual_Mem_Apply 			= 	"Rsdsitest1000100                                                                mem_j11150          37에프엠에            Y100000      ";
	//public static String Virtual_Mem_Delete 		= 	"Rsdsitest1000200                                                                mem_id006           00wtj00000          Y10000         ";
	public static String Virtual_Mem_Delete 		= 	"Rsdsitest1000200                                                                jyj_i0122           37wtj00000          Y10000         ";
	public static String Virtual_Mem_Modify 		= 	"Rsdsitest1000300                                                                mem_j11147            변경예금주          N1113        ";
	public static String Virtual_Mem_Search 		= 	"Rsdsitest1000400                                                                aaw4                                                   ";
	public static String Virtual_Mem_Bank_Modify 	= 	"Rsdsitest1000500                                                                mem_j11147          N37                                ";
	
	//입금내역수신(날짜지정)
	public static String Virtual_Deposit_Search_D 	= 	"Rsdsitest2000100                                                                D20130715                                              ";
	//입금내역수신(미수신)
	public static String Virtual_Deposit_Search_A 	= 	"Rsdsitest2000100                                                                A                                                      ";
	
	public static String Virtual_Header 			= 	"Hsdsitest10001001                                                                                                     \r\n";
	public static String Virtual_Data				= 	"Dsdsitest1000100wtj000000           04sdsitest            62069078080734                                              \r\n";
	public static String Virtual_Tail				= 	"Tsdsitest10001001                                                                                                     \r\n";
	
	public static String Virtual_Mem_ReturnTail 	= 	"Tsdsitest1000100                                                                                                      \r\n";
	public static String Virtual_Deposit_ReturnTail = 	"Tsdsitest2000100                                                                                                      \r\n";
	
	//public static String Virtual_Mem_End 		= 	"Esdsitest1000                                                                                                                          ";
	public static String Virtual_Mem_End 		= 	"Esdsitest1000                                                                                                                          ";
	
	/*
	 * 실시간CMS 건별 -ssign 이용
	 */
	public static String REALCMS_PAY_SSIGN =
			"fffff1021111qqqqsdsitest11111111" +
					(UtilMethod.getToday()-20000000)+						//거래일자
					"1000" +
					"110" +
					"000001"+
					//(System.currentTimeMillis()+"").substring(7, 13) +		//연번
					"                                                 " + 	//FMS 설정영역(전송일자,전송시간,응답결과,응답코드, FMS사용영역)
					//개별부	
					"10019963201209110001" + 
					"mem-01              " +                                 //회원번호
					"davidcho            " +                                 //예금주명
					"000000000001000" +										//출금금액
					"01" +													//납입회차
					"               "+										//출금금액
					"               "+										//수수료
					"0000002000"+											//일출금한도
					"0000002000"+											//월출금한도
					"             "+
					"                              ";
	
	
	
	
	/*
	 * 실시간CMS 건별
	 */
	public static String REALCMS_PAY_APPLY_REAL = 
			"sdsitesttesttestswswtestswswswsw" +
			(UtilMethod.getToday()-20000000)+						//거래일자
			"1000" +
			"100" +
			(System.currentTimeMillis()+"").substring(7, 13) +		//연번
			"                                                 " + 	//FMS 설정영역(전송일자,전송시간,응답결과,응답코드, FMS사용영역)
			//개별부	
			"35" + 
			"5002200360     " +
			"8307191332711" +
			"위태준              " +											//예금주명
			"mem-01              " +								//회원번호
			"000000000000100" +										//출금금액
			"01" +													//납입회차
			"                                                                          fms test ";
	
	
	
	
	public static String REALCMS_PAY_APPLY = 
		"sdsites1testtestswswtestswswswsw" +
		(UtilMethod.getToday()-20000000)+						//거래일자
		"1000" +
		"100" +
		(System.currentTimeMillis()+"").substring(7, 13) +		//연번
		"                                                 " + 	//FMS 설정영역(전송일자,전송시간,응답결과,응답코드, FMS사용영역)
		//개별부	
		"04" + 
		"806240390839   " +
		"8307231400513" +
		"위태준              " +											//예금주명
		"mem-01              " +								//회원번호
		"000000000005000" +										//출금금액
		"01" +													//납입회차
		"                                                                          fms test ";
	public static String RealCMS_One_Pay =
		"sdsitesttesttestsdsiswswswswswsw"+
		(UtilMethod.getToday()-20000000)+   //거래일자
		"1000" +							//전문구분
		"100" + 							//업무구분
		"000023" + 							//연번
		"                                                 09123712377014   8206182340711이미연                                  000000000028500                                                                                  fms";
	
	public static String RealCMS_One_Pay_Result =
		REAL_CUSTID+REAL_CUSTPW+REAL_SWID+REAL_SWPW+
		(UtilMethod.getToday()-20000000)+						//송신일자
		"1000" +												//전문구분
		"200" + 												//업무구분
		"      " + 												//연번 (결과조회시는 미사용)
		"                                                 " + 
		"130704" +												//원거래건 거래일자 
		"121976" + 												//원거래건 연번
		"                                                                                                                                                           fms";
	//실시간 건별 대사(집계)
	public static String RealCMS_One_Confirm =
		REAL_CUSTID+REAL_CUSTPW+REAL_SWID+REAL_SWPW+
		(UtilMethod.getToday()-20000000)+						//송신일자
		"6000" +												//전문구분
		"100" + 												//업무구분
		(System.currentTimeMillis()+"").substring(7, 13) + 		//연번 (결과조회시는 미사용)
		"                                                 " +	//FMS영역
		"121206" +												//원거래건 거래일자 
		"000052" + 												//원거래건 연번
		"                                                                                                                                                           fms";
	
	//실시간 배치일대사
	public static String RealCMS_Batch_Confirm = 
		"SsdsitesttesttestswswtestswswswswSUMA20111214                                                                                                                                                              \r\n";
	
	
	/*
	 * 배치ARS
	 */
	public static String ARS_Start_MEM_APPLY  = "SsdsitesttesttestswswtestswswswswMEMA20110401                                                                                                                                          \r\n";
	
	
	//카드 해지 테스트
		//실시간 건별 대사(집계)
			public static String CARD_EXPIRE_TEST =
				TEST_CUSTID+"  "+TEST_CUSTPW+"  "+NSDSI_TEST_SWID+"  "+NSDSI_TEST_SWTPW+"  "+
				"CARD"+						//송신일자
				"E" +												//전문구분
				"               " + 												//업무구분
				"sdsd0202            " + 		//연번 (결과조회시는 미사용)
				"                                                  " +	//FMS영역
				"                                                  " +	//FMS영역
				"                                                  " +	//FMS영역
				"                                                  " +	//FMS영역
				"                                                  " +	//FMS영역
				"             " +	//FMS영역
				" " +	//FMS영역
				"    " +	//FMS영역
				"                                                  " +	//FMS영역
				"\r\n";
			
			public static String CARD_EXPIRE_TEST2 = "NSI"+
					TEST_CUSTID+"  "+TEST_CUSTPW+"  "+NSDSI_TEST_SWID+"  "+NSDSI_TEST_SWTPW+"  "+
					"CARD"+						//송신일자
					"E" +												//전문구분
					"               " + 												//업무구분
					"sdsd0202            " + 		//연번 (결과조회시는 미사용)
					"                                                  " +	//FMS영역
					"                                                  " +	//FMS영역
					"                                                  " +	//FMS영역
					"                                                  " +	//FMS영역
					"                                                  " +	//FMS영역
					"             " +	//FMS영역
					" " +	//FMS영역
					"    " +	//FMS영역
					"                                                  " +	//FMS영역
					"\r\n";
	
	
	
	
}
