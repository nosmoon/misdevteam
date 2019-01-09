package fms.common;


public class Property {	
	/**
	 * 배치CMS 서비스
	 */
	public static String BATCH_CMS_IP = "121.134.74.90";	// 또는 121.134.74.70
	public static int CMS_TEST_PORT = 11000;
	
	/**
	 * 실시간CMS 서비스
	 */
	/*public static String REAL_CMS_IP = "121.134.74.90";	// 또는 121.134.74.70
	public static int REAL_CMS_TEST_PORT = 14000;*/
	
	/**
	 * 실시간CMS 서비스
	 */
	public static String YELLOW_REALCMS_REAL_IP ="sdsireal.efnc.co.kr"; 
	
	public static String YELLOW_REALCMS_TEST_IP = "121.134.74.90";
	public static String REALCMS_BLUE_IP = "121.134.74.101";		//실시간CMS
	
	public static int YELLOW_REALCMS_TEST_PORT = 14000;				//실시간CMS 모든업무 공통(테스트)
	public static int REAL_CMS_ONE_PAY_APPLY_TEST_PORT = 11031;		//실시간 건별 출금 신청(테스트)
	public static int REAL_CMS_ONE_PAY_RESULT_TEST_PORT = 11032;	//실시간 건별 출금 결과 조회, 집계업무(테스트)
	public static int REAL_CMS_BATCH_PAY_RESUT_TEST_PORT = 11034;	//실시간 배치 출금결과 조회, 대사업무(테스트)
	public static int REAL_CMS_ONE_ACCT_SEARCH_TEST_PORT = 11061;	//실시간 건별 계좌조회(테스트)
	public static int REAL_CMS_ONE_ACCT_SEARCH_REAL_PORT = 13385;	//실시간 건별 계좌조회(운영)
	public static int REAL_CMS_ONE_PAY_RESULT_REAL_PORT = 13382;	//실시간 건별 출금 결과(운영)
	public static int REAL_CMS_ONE_PAY_APPLY_REAL_PORT = 13381;		//실시간 건별 출금 신청(운영)
	public static int REAL_CMS_ONE_CONFIRM_REAL_PORT = 13382;		//실시간 건별 대사(운영)
	public static int YELLOW_REALCMS_REAL_PORT = 24000;				//실시간CMS 모든업무 공통(운영)
	public static int YELLOW_CARD_TEST_PORT = 51001;				//카드 건별 테스트 포트(운영)
	public static int YELLOW_CARD_REAL_PORT = 51000;				//카드 건별 리얼 포트(운영)
	
	/**
	 * SDSI가상계좌 서비스
	 */
	public static String VIRTUAL_IP = "121.134.74.90";	// 또는 121.134.74.70
	public static int VIRTUAL_TEST_PORT = 16000;
	public static int VIRTUAL_REAL_PORT = 26000;
	
	/**
	 * CARD 서비스
	 */
	public static String CARD_IP = "121.134.74.90";	// 또는 121.134.74.70
	public static String CARD_TEST_IP = "121.134.74.90";	//"121.134.74.70";	//sdsitest.efnc.co.kr";	// 또는 121.134.74.70
	public static int CARD_TEST_PORT = 51001;
	public static int CARD_REAL_PORT = 51000;
	
	/**
	 * 한길 서비스
	 */
	public static String HANGIL_IP = "121.134.74.90";	// 또는 121.134.74.70
	public static int HANGIL_INFO_TEST_PORT = 11200; //업체
	public static int HANGIL_TRANSFER_TEST_PORT = 11105; //이관
	//public static int HANGIL_REAL_PORT = 51000;
	
	/**
	 * 휴대전화 서비스
	 */
	public static String MOB_IP = "121.134.74.70";
	public static int MOB_ONE_TEST_PORT = 12100; //휴대전화(건별) 승인,승인취소,승인조회 신청 [테스트]
	public static int MOB_ONE_REAL_PORT = 22100; //휴대전화(건별) 승인,승인취소,승인조회 신청 [운영]
	public static int MOB_BATCH_REAL_PORT = 22000; //휴대전화(배치)  [운영]
	public static int MOB_BATCH_TEST_PORT = 12000; //휴대전화(배치)  [테스트]
	
	/**
	 * 휴대전화 가입자인증
	 */
	public static String HPAUTH_IP = "121.134.74.70";
	public static int HPAUTH_TEST_PORT = 19070; //휴대전화 가입자인증 [테스트]
	public static int HPAUTH_REAL_PORT = 19080; //휴대전화 가입자인증 [운영]
	
	/**
	 * 금결원 서비스
	 */
	public static String KFTC_IP = "121.134.74.70";
	public static int KFTC_REAL_PORT = 27000; //KFTC [운영]
	public static int KFTC_TEST_PORT = 17000;
	
	/**
	 * ARS 서비스
	 */
	public static String ARS_IP = "121.134.74.70";
	
	//건별 ARS
	public static int ARS_ONE_TEST_PORT = 13100; //휴대전화(건별) 승인,승인취소,승인조회 신청 [테스트]
	public static int ARS_ONE_REAL_PORT = 23100; //휴대전화(건별) 승인,승인취소,승인조회 신청 [운영]

	
	//배치 ARS
	public static int ARS_TEST_PORT = 13000;
	public static int ARS_REAL_PORT = 23000;
}
