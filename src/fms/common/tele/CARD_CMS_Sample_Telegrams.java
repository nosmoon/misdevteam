package fms.common.tele;

/** BATCH CMS V2.0 **/
public class CARD_CMS_Sample_Telegrams {	
	/** TEST **/
	/* START 전문 */
	//신청	※ 처리일자 수정해줘야함
	public static String CARD_START_MEM_APPLY   = "sdsitest  testtest  swswtest  swswswsw  CARDN20150406123123Nfmsfmsm22           홍길동              123145646456    20150205                                              5000      0103131313  kkkkkk@naver.com                                                                                                                                                                                              \r\n";
	public static String CARD_START_PAY_APPLY1   = "Ssdsitest  testtest  swswtest  swswswsw  PAYA20140616                                                                                                                                                                                                                                                     \r\n";
	public static String CARD_START_MEM_RESULT  = "Ssdsitest  testtest  swswtest  swswswsw  MEMR20140514                                                                                                                                                                                                                                                     \r\n";
	public static String CARD_START_MEM_SEARCH  = "Ssdsitest  testtest  swswtest  swswswsw  MEMS20140522                                                                                                                                                                                                                                                     \r\n";
	public static String CARD_ONE_PAY_SEARCH1  = "Ssdsitest  testtest  swswtest  swswswsw  PAYS20140507                                                                                                                                                                                                                                                     \r\n";
	
	public static String CARD_SEARCH_APPLY   = "sdsitest  testtest  swswtest  swswswsw  CARDS20150407000001                                                                                                                                                                                                                                                                                                                                                   \r\n";
	
	public static String CARD_CANCEL_APPLY   = "sdsitest  testtest  swswtest  swswswsw  CARDC20150407000001                                                                                                                                                                                                      61721195                                                                                                                                     \r\n";
	
	//카드 출금신청(배치)
	public static String CARD_START_PAY_APPLY   = "Ssdsitest  testtest  swswtest  swswswsw  CONA20150521000005                                                                                                                                                                                                                                                                                       \r\n";
	/* HARDER 전문*/
	public static String CARD_HEADER_PAY_APPLY  = "Hsdsitest  1     1000                                                                                                                                                                                                                                                                                                                             \r\n";
	/* DATA 전문*/
	public static String[] CARD_DATA_PAY_APPLY = 
	{ 
	/* 신규 N */
    "Dsdsitest  CARDNNfmsratm2211         홍길동              0000011110949565901971201806810204                                          1000      01039001524                                                                                                                                                                                        \r\n",
	};
	/* TAIL 전문*/
	public static String CARD_TAIL_PAY_APPLY        = "Tsdsitest                                                                                                                                                                                                                                                                                                                                         \r\n";
	
	//출금 결과(배치)
	public static String CARD_PAY_RESULT_BATCH  = "Ssdsitest  testtest  swswtest  swswswsw  CONR20150521000005                                                                                                                                                                                                                                                                                       \r\n";
	
	//카드 인증(건별)
	public static String CARD_AUTH  = "sdsitest  testtest  swswtest  swswswsw  AUT201505210000011234567812345678201805홍길동              810204                                                                                                                                               \r\n";
	
	//카드 출금(건별)
	public static String CARD_ONE_PAY_APPLY = "sdsitest  testtest  swswtest  swswswsw  CARDN20150521000001Nfms5656             홍길동              1212121212121122201508800506       12121212121212                     1000      01031313131                                                                                                                                                                                                               \r\n";
	
	//카드 조회(건별)
	public static String CARD_ONE_PAY_SEARCH  = "sdsitest  testtest  swswtest  swswswsw  CARDS20150521000005                                                                                                                                                                                                                                                                                                                                                   \r\n";
	
	//카드 조회(건별)
	public static String CARD_ONE_PAY_CANCEL  = "sdsitest  testtest  swswtest  swswswsw  CARDC20150521000005                                                                                                                                                                                                                                                                                                                                                   \r\n";
}
