package fms.common.tele;

import fms.util.UtilMethod;


public class Virtual_SampleTelegrams {

	public static String TEST_CUSTID = "sdsitest";
	public static String TEST_CUSTPW = "testtest";
	public static String REAL_CUSTID = "dev_reg5";
	public static String REAL_CUSTPW = "1111qqqq";
	
	public static String TEST_SWID = "sdsiswsw";
	public static String TEST_SWTPW = "swswswsw";
	public static String REAL_SWID = "swswreal";
	public static String REAL_SWPW = "swswswsw";


	/*
	 * 가상계좌
	 */
	//public static String Virtual_Mem_Start 			= 	"Ssdsitesttesttestswswtestswswswsw1000
	public static String Virtual_Mem_Start 			= 	"Ssdsitesttesttestswswtestswswswsw1000                                                                                                  ";
	public static String Virtual_Deposit_Start 		= 	"Ssdsitesttesttestswswtestswswswsw2000                                                                                                  ";
	
	public static String Virtual_Mem_Apply 			= 	"Rsdsitest1000100                                                                mem_j55557          37                    Y100000      ";
	//public static String Virtual_Mem_Delete 		= 	"Rsdsitest1000200                                                                mem_id006           00wtj00000          Y10000         ";
	public static String Virtual_Mem_Delete 		= 	"Rsdsitest1000200                                                                123301700010_1      11최창해              Y10000       ";
	public static String Virtual_Mem_Modify 		= 	"Rsdsitest1000300                                                                mem_j11147            변경예금주          N1113        ";
	public static String Virtual_Mem_Search 		= 	"Rsdsitest1000400                                                                mem_j11147                                             ";
	public static String Virtual_Mem_Bank_Modify 	= 	"Rsdsitest1000500                                                                mem_j11147          N37                                ";
	
	//입금내역수신(날짜지정)
	public static String Virtual_Deposit_Search_D 	= 	"Rsdsitest2000100                                                                D20150331                                              ";
	//입금내역수신(미수신)
	public static String Virtual_Deposit_Search_A 	= 	"Rsdsitest2000100                                                                A                                                      ";
	
	public static String Virtual_Header 			= 	"Hsdsitest10001001                                                                                                     \r\n";
	public static String Virtual_Data				= 	"Dsdsitest1000100wtj000000           04sdsitest            62069078080734                                              \r\n";
	public static String Virtual_Tail				= 	"Tsdsitest10001001                                                                                                     \r\n";
	
	public static String Virtual_Mem_ReturnTail 	= 	"Tsdsitest1000100                                                                                                      \r\n";
	public static String Virtual_Deposit_ReturnTail = 	"Tsdsitest2000100                                                                                                      \r\n";
	
	//public static String Virtual_Mem_End 		= 	"Esdsitest1000                                                                                                                          ";
	public static String Virtual_Mem_End 		= 	"Esdsitest1000                                                                                                                          ";
	
}
