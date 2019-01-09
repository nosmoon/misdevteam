package fms.common.tele;

import fms.util.UtilMethod;

/** BATCH CMS V2.0 **/
public class BATCH_CMS_Sample_Telegrams_New {	
	/** TEST **/
	/* START 전문 */
	//신청	※ 처리일자 수정해줘야함
	public static String CMS_START_MEM_APPLY_New   = "Ssdsitest  testtest  swswtest  swswswsw  MEMA20150519                                                                                                                                                                                                                                                     \r\n";
	public static String CMS_START_PAY_APPLY_New   = "Ssdsitest  testtest  swswtest  swswswsw  PAYA20150423                                                                                                                                                                                                                                                     \r\n";
	public static String CMS_START_MEM_RESULT_New  = "Ssdsitest  testtest  swswtest  swswswsw  MEMR20150420                                                                                                                                                                                                                                                     \r\n";
	public static String CMS_START_PAY_RESULT_New  = "Ssdsitest  testtest  swswtest  swswswsw  PAYR20150312                                                                                                                                                                                                                                                     \r\n";
	public static String CMS_START_MEM_SEARCH_New  = "Ssdsitest  testtest  swswtest  swswswsw  MEMS20150326                                                                                                                                                                                                                                                     \r\n";
	public static String CMS_START_PAY_SEARCH_New  = "Ssdsitest  testtest  swswtest  swswswsw  PAYS20140507                                                                                                                                                                                                                                                     \r\n";

	// 회원인증 배치
	public static String CMS_START_AUTH_New        = "Ssdsitest  testtest  swswtest  swswswsw  MEMT20150326                                                                                                                                                                                                                                                     \r\n";
	
	// 회원인증 건별
	public static String CMS_REAL_AUTH_New         = "Asdsitest  testtest  swswtest  swswswsw  20150327jhhrrrr9967                                                                                                                                                                                                                                              \r\n";
	
	/* HEADER 전문 */	
	// 회원 헤더 신청건수는 데이터전문 총 건수
	public static String CMS_MEM_HEADER_New        = "Hsdsitest  1                                                                                                                                                                                                                                                                                              \r\n";
	// 출금 헤더 신청건수/금액은 데이터전문 총 건수 와 총금액 합
	/*public static String CMS_PAY_HEADER_V2        = "Hsdsitest  10000 100000                                                                                                                                                                                                                                                                                   \r\n";*/
	public static String CMS_PAY_HEADER_New        = "Hsdsitest  3          30000                                                                                                                                                                                                                                                                               \r\n";

	/* DATA 전문*/
	public static String[] CMS_MEM_N_DATA_New = 
	{ 
	/* 신규 N */
    "Dsdsitest  Nfms748899           홍길동                                  021111111111     홍길동              810204       M01039001521                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9090         홍길동                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9083         홍길동                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9081         홍길동                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9082         홍길동                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9084         홍길동                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9085         홍길동                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9086         홍길동                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9087         홍길동                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9088         홍길동                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm22266        홍길동                                                                                                                                                                                                                                                                    \r\n",
    /* 수정 U */ 
    	// 결제정보 포함 수정
//    "Dsdsitest  Ujhdratm9876         홍길동06                                31                                                                                                                                                                                                                                \r\n",
    	// 연락처 수정 
//   "Dsdsitest  Ujhdratm9876         테스트07                                                                                   01095799906                                                                                                                                                                    \r\n",
    /* 삭제 D */
//      "Ddev_reg5  D000789456           홍길동                                                                                                                                                                                                                                                                    \r\n",
//	  "Dsdsitest  D103087906           테스트                                                                                                                                                                                                                                                                    \r\n",
	};	
	public static String[] CMS_PAY_N_DATA_New = 
	{ 
	"Dsdsitest  Nfmsfmsm9082         테스트              000001201   10000     01022223333                                                                                                                                                                                                                     \r\n",
	"Dsdsitest  Nfmsfmsm9082         테스트              000002202   10000     01022223333                                                                                                                                                                                                                     \r\n",
	"Dsdsitest  Nfmsfmsm9082         테스트              000003203   10000     01022223333                                                                                                                                                                                                                     \r\n",
	};
	
	/*public static String[] CMS_PAY_N_DATA_V2_B = 
	{ 
		"Dsdsitest  Nmh_test_004         테스트              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         테스트              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         테스트              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         테스트              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         테스트              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         테스트              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         테스트              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         테스트              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         테스트              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         테스트              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",



	};
	*/
	public static String CMS_MEM_N_DATA_New2	 = "Dsdsitest  DMEM_0000001_k2      테스트08                                                                                                                                                                                                                                                                  \r\n";
	
	/* TAIL전문 */
	public static String CMS_MEM_TAIL_New	 = "Tsdsitest                                                                                                                                                                                                                                                                                                 \r\n";
	public static String CMS_PAY_TAIL_New	 = "Tsdsitest                                                                                                                                                                                                                                                                                                 \r\n";

}
