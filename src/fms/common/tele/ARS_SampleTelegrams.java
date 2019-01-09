package fms.common.tele;

import fms.util.UtilMethod;


public class ARS_SampleTelegrams {

	public static String TEST_CUSTID = "sdsitest";
	public static String TEST_CUSTPW = "testtest";
	public static String REAL_CUSTID = "dev_reg5";
	public static String REAL_CUSTPW = "1111111q";
	
	public static String TEST_SWID = "sdsiswsw";
	public static String TEST_SWTPW = "swswswsw";
	public static String REAL_SWID = "swswreal";
	public static String REAL_SWPW = "swswswsw";

	//ARS회원신청
	public static String ARS_MEM_APPLY  = "SsdsitesttesttestswswtestswswswswMEMA20150325123654                                                                                                                                    \r\n";
	
	//ARS회원결과
	public static String ARS_MEM_RESULT  = "SsdsitesttesttestswswtestswswswswCOPR20150325456456                                                                                                                                    \r\n";
	public static String ARS_MEM_APPLY_Header  = "Hfms112  1                                                                                                                                                                             \r\n";
	public static String ARS_MEM_APPLY_Data = "Dfms111  WTN13131314            jyj                 0510000     999912310001012341234    홍길동              8111111                                                                   \r\n";
	public static String ARS_MEM_APPLY_Tail  = "Tfms111                                                                                                                                                                                \r\n";
	
	//ARS승인신청
	public static String ARS_APR_APPLY  = "SsdsitesttesttestswswtestswswswswCONA20150324123132                                                                                                                                    \r\n";
	//ARS승인결과
	public static String ARS_APR_RESULT  = "SsdsitesttesttestswswtestswswswswCONR20150324123132                                                                                                                                    \r\n";
	public static String ARS_APR_APPLY_Header  = "Hfms112  1     1000                                                                                                                                                                    \r\n";
	public static String ARS_APR_APPLY_Data = "Dfms111  WTNsdsitest            jyj                 051000                          10000                                                                                              \r\n";
	public static String ARS_APR_APPLY_Tail  = "Tfms111                                                                                                                                                                                \r\n";
	
	//ARS출금결과조회
	public static String ARS_RESULT_PAY  = "SsdsitesttesttestswswtestswswswswCOPR20150410000001                                                                                                                                    \r\n";
	
	public static String REAL_PAY  = "SsdsitesttesttestswswtestswswswswTAXA20150410000001                                                                                                                                                        \r\n";
	
	public static String REAL_PAY_Header  = "Hsdsitest1     10000                                                                                                                                                                                       \r\n";
	public static String REAL_PAY_Data = "Dsdsitest000000110000        01039001524                                                                               홍길동                                                                              \r\n";
	public static String REAL_PAY_Tail  = "Tsdsitest1     10000                               0     0                                                                                                                                                 \r\n";
	
	public static String REAL_PAY_RESULT  = "SsdsitesttesttestswswtestswswswswTAXR20140929000001                                                                                                                                                        \r\n";
}
