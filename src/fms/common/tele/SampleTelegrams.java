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
	 * �޴���ȭ
	 */
//	public static String MOB_TGR_NO="999992";//�޴���ȭ���� ����
//	public static String MOB_CON_APPLY  = "sdsitesttesttestswswtestswswswswMOBN" + UtilMethod.getToday() + MOB_TGR_NO + "201012141           7210251_01029906613 LG01056552640    7210251_01029906613 8103111231721      100                                                                                           fms test\r\n";
//	public static String MOB_CON_CANCEL_APPLY  = "sdsitesttesttestswswtestswswswswMOBC              201012141           7210251_01029906613 LG01056552640    7210251_01029906613 8103111231721      100                      10005196110520999992                                                 fms test\r\n";
//	public static String MOB_CON_SEARCH_APPLY  = "sdsitesttesttestswswtestswswswswMOBS" + "20101012" + MOB_TGR_NO + "201012141           7210251_01029906613 SK01029906613    7210251_01029906613 7210251348213      100                      20101214000013ACPGD0                                                 fms test\r\n";

	public static String MOB_TGR_NO="999994";//�޴���ȭ���� ����
	
	public static String MOB_CON_APPLY  = 
		"sdsitesttesttest" + 		//��üID, ��üPW
		"swswtestswswswsw" + 		//���α׷���üID, ���α׷���üPW
		"MOB" + 					//��������
		"N" + 						//��������
		UtilMethod.getToday() + 	//������
		(System.currentTimeMillis()+"").substring(7, 13) +		//�޴���ȭ ���� ���� 
		"201012141           " + 	//ȸ����ȣ
		"7210251_01029906613 " + 	//ȸ����
		"LG" + 						//�����
		"01056552640    " +  		//LG �׽�Ʈ�� ������ȭ��ȣ
		"7210251_01029906613 " + 	//���������ڼ���
		"8103111231721" + 			//LG �׽�Ʈ�� �����������ֹι�ȣ
		"      " + 					//�̻��
		"500       " + 				//���ν�û�ݾ�
		"                                                                                    fms test\r\n";
	public static String MOB_CON_CANCEL_APPLY  = 
		"sdsitesttesttestswswtestswswswswMOBC              201012141           7210251_01029906613 LG01056552640    7210251_01029906613 8103111231721      100                      " +
		"10005196110520999994" + //����Ű
		"                                                 fms test\r\n";
	public static String MOB_CON_SEARCH_APPLY  = "sdsitesttesttestswswtestswswswswMOBS" + "20101012" + MOB_TGR_NO + "201012141           7210251_01029906613 SK01029906613    7210251_01029906613 7210251348213      100                      20101214000013ACPGD0                                                 fms test\r\n";
	public static String MOB_Start_CON_APPLY  =	"SsdsitesttesttestswswtestswswswswCONA20110112                                                                                                                                          \r\n";
	public static String MOB_Start_PAY_RESULT =	"SsdsitesttesttestswswtestswswswswPAYR20110831                                                                                                                                          \r\n";
	
	
	public static String HP_AUTH  = 
		"krsysars  krsy2314  " + 		//���α׷���üID, ���α׷���üPW
		"kwangju0  gjars2999 " + 		//��üID, ��üPW
		"5000" + 					//��������
		"100" + 					//�۾�����
		UtilMethod.getToday() + 	//��û��
		(System.currentTimeMillis()+"").substring(7, 13) +		//�޴���ȭ ���� ���� 
		" " + 						//ó�����
		"    " + 					//����ڵ�
		"                              " +//����޼���
		"fms test          " + 		//��ü��뿵��
		"LG" + 						//�����
		"01056552640" + 			//�޴�����ȣ [�׽�Ʈ��]
		"8103111231721" + 			//LG �׽�Ʈ�� �����������ֹι�ȣ
//		"LG" + 						//�����
//		"01055857607" + 			//�޴�����ȣ
//		"6812071069515" + 			//LG �����ŷ���
//		"SK" + 						//�����
//		"0193951457 " + 			//�޴�����ȣ
//		"8307231300511" + 			//SK �׽�Ʈ�� �����������ֹι�ȣ
//		"KT" + 						//�����
//		"01040384079" + 			//�޴�����ȣ
//		"8109291929416" + 			//KT �׽�Ʈ�� �����������ֹι�ȣ
		"          " ;				//�����ڸ�
		 
	
	
	/*
	 * BestCMS
	 */
	//ȸ�������� �̰���û����
	public static String BestCMS_Cobfah_MemData_REQ = "testtest  pbg5924   pbgtax11bizon       2000100                                                     \r\n";
	
	//��ü������ �̰���û����
	public static String BestCMS_Cobfah_CustData_REQ = "testtest  pbg5924   pbgtax11bizon       1000100                                                     \r\n";

	//���
	public static String BestCMS_Start_PAY_Apply = "Ssdsitest  testtest  testtest  hantaxsw  PAYA20110413                                                                                                                                          \r\n";
	
	
	
	/*
	 * ��ġCMS
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
	
	public static String CMS_MEM_N_DATA 	= "DsdsitestN0110000001          ȫ�浿��            010000000000999912312632504546060    ȫ�浿              8307121300512                                                               \r\n";
	public static String CMS_MEM_U_DATA 	= "DsdsitestU0000000002          ȫ�浿              01000000000099991231115248056845     ��浿              8505301545514                                                               \r\n";
	public static String CMS_MEM_D_DATA 	= "DsdsitestD0000000003          ȫ�浿                                                                                                                                                   \r\n";
	public static String CMS_MEM_N_REAL     = "DsdsitestNP000000001          �κ���              010000000000999912310202085516456739 ȫ�浿              8307191332711                                                               \r\n";
	public static String CMS_MEM_N_REAL2     = "DsdsitestNP000000002          �κ���              010000000000999912310202085516456738 ȫ�浿              8307191332711                                                               \r\n";
	public static String CMS_MEM_N_REAL3     = "DsdsitestNP000000003          �κ���              010000000000999912310202085516456739 ȫ�浿              8207191332711                                                               \r\n";
	public static String CMS_MEM_N_REAL4     = "DsdsitestNP000000004          �κ���              010000000000999912310202085516456719 ȫ�浿              8107191332711                                                               \r\n";
	public static String CMS_MEM_TAIL		= "Tsdsitest                                                                                                                                                                              \r\n";
	public static String CMS_MEM_TAIL_REAL		= "Tsdsitest                                                                                                                                                                              \r\n";
	
	
	
	public static String CMS_PAY_HEADER		= "Hsdsitest1     140000                                                                                                                                                                  \r\n";
	public static String [] CMS_PAY_N_DATA 	= {
		"DsdsitestNs0002               ��ȭ����            000001      140000                                                                                                                   \r\n",		
		//"DsdsitestN201108190562        �ֺ���              000002      30000                                                                                                                    \r\n",
		//"DsdsitestN201108240596        �ָ��              000003      40000                                                                                                                    \r\n",
		//"DsdsitestN201108190557        ������              000003      40000                                                                                                                    \r\n"
	};
	
	public static String CMS_PAY_TAIL 		= "Tsdsitest                                                                                                                                                                              \r\n";
	
	
	/*
	 * ���ݿ�����
	 */
	public static String TAX_Sart =		"SsdsitesttesttestswswtestswswswswTAXR20100105000001                                                                                                                                                        \r\n";
	public static String TAX_Cust_Req =	"SsdsitesttesttestswswtestswswswswTAXD20100223000001                                                                                                                                                        \r\n";
	public static String TAX_Header =	"Hsdsitest0000010000000000500000000000000000000000000                                                                                                                                                       \r\n";
	public static String TAX_Data = 	"Dsdsitest000000100000000500000193951457                                                                                         ������                                                                     ";
	public static String TAX_Tail =		"Tsdsitest000001000000000050000000000000000000000000000000000000000000000                                                                                                                                   \r\n";
	
	
	/*
	 * �������
	 */
	//public static String Virtual_Mem_Start 			= 	"Ssdsitesttesttestswswtestswswswsw1000
	public static String Virtual_Mem_Start 			= 	"Ssdsitesttesttestswswtestswswswsw1000                                                                                                  ";
	public static String Virtual_Deposit_Start 		= 	"Ssdsitesttesttestswswtestswswswsw2000                                                                                                  ";
	
	public static String Virtual_Mem_Apply 			= 	"Rsdsitest1000100                                                                mem_j11150          37��������            Y100000      ";
	//public static String Virtual_Mem_Delete 		= 	"Rsdsitest1000200                                                                mem_id006           00wtj00000          Y10000         ";
	public static String Virtual_Mem_Delete 		= 	"Rsdsitest1000200                                                                jyj_i0122           37wtj00000          Y10000         ";
	public static String Virtual_Mem_Modify 		= 	"Rsdsitest1000300                                                                mem_j11147            ���濹����          N1113        ";
	public static String Virtual_Mem_Search 		= 	"Rsdsitest1000400                                                                aaw4                                                   ";
	public static String Virtual_Mem_Bank_Modify 	= 	"Rsdsitest1000500                                                                mem_j11147          N37                                ";
	
	//�Աݳ�������(��¥����)
	public static String Virtual_Deposit_Search_D 	= 	"Rsdsitest2000100                                                                D20130715                                              ";
	//�Աݳ�������(�̼���)
	public static String Virtual_Deposit_Search_A 	= 	"Rsdsitest2000100                                                                A                                                      ";
	
	public static String Virtual_Header 			= 	"Hsdsitest10001001                                                                                                     \r\n";
	public static String Virtual_Data				= 	"Dsdsitest1000100wtj000000           04sdsitest            62069078080734                                              \r\n";
	public static String Virtual_Tail				= 	"Tsdsitest10001001                                                                                                     \r\n";
	
	public static String Virtual_Mem_ReturnTail 	= 	"Tsdsitest1000100                                                                                                      \r\n";
	public static String Virtual_Deposit_ReturnTail = 	"Tsdsitest2000100                                                                                                      \r\n";
	
	//public static String Virtual_Mem_End 		= 	"Esdsitest1000                                                                                                                          ";
	public static String Virtual_Mem_End 		= 	"Esdsitest1000                                                                                                                          ";
	
	/*
	 * �ǽð�CMS �Ǻ� -ssign �̿�
	 */
	public static String REALCMS_PAY_SSIGN =
			"fffff1021111qqqqsdsitest11111111" +
					(UtilMethod.getToday()-20000000)+						//�ŷ�����
					"1000" +
					"110" +
					"000001"+
					//(System.currentTimeMillis()+"").substring(7, 13) +		//����
					"                                                 " + 	//FMS ��������(��������,���۽ð�,������,�����ڵ�, FMS��뿵��)
					//������	
					"10019963201209110001" + 
					"mem-01              " +                                 //ȸ����ȣ
					"davidcho            " +                                 //�����ָ�
					"000000000001000" +										//��ݱݾ�
					"01" +													//����ȸ��
					"               "+										//��ݱݾ�
					"               "+										//������
					"0000002000"+											//������ѵ�
					"0000002000"+											//������ѵ�
					"             "+
					"                              ";
	
	
	
	
	/*
	 * �ǽð�CMS �Ǻ�
	 */
	public static String REALCMS_PAY_APPLY_REAL = 
			"sdsitesttesttestswswtestswswswsw" +
			(UtilMethod.getToday()-20000000)+						//�ŷ�����
			"1000" +
			"100" +
			(System.currentTimeMillis()+"").substring(7, 13) +		//����
			"                                                 " + 	//FMS ��������(��������,���۽ð�,������,�����ڵ�, FMS��뿵��)
			//������	
			"35" + 
			"5002200360     " +
			"8307191332711" +
			"������              " +											//�����ָ�
			"mem-01              " +								//ȸ����ȣ
			"000000000000100" +										//��ݱݾ�
			"01" +													//����ȸ��
			"                                                                          fms test ";
	
	
	
	
	public static String REALCMS_PAY_APPLY = 
		"sdsites1testtestswswtestswswswsw" +
		(UtilMethod.getToday()-20000000)+						//�ŷ�����
		"1000" +
		"100" +
		(System.currentTimeMillis()+"").substring(7, 13) +		//����
		"                                                 " + 	//FMS ��������(��������,���۽ð�,������,�����ڵ�, FMS��뿵��)
		//������	
		"04" + 
		"806240390839   " +
		"8307231400513" +
		"������              " +											//�����ָ�
		"mem-01              " +								//ȸ����ȣ
		"000000000005000" +										//��ݱݾ�
		"01" +													//����ȸ��
		"                                                                          fms test ";
	public static String RealCMS_One_Pay =
		"sdsitesttesttestsdsiswswswswswsw"+
		(UtilMethod.getToday()-20000000)+   //�ŷ�����
		"1000" +							//��������
		"100" + 							//��������
		"000023" + 							//����
		"                                                 09123712377014   8206182340711�̹̿�                                  000000000028500                                                                                  fms";
	
	public static String RealCMS_One_Pay_Result =
		REAL_CUSTID+REAL_CUSTPW+REAL_SWID+REAL_SWPW+
		(UtilMethod.getToday()-20000000)+						//�۽�����
		"1000" +												//��������
		"200" + 												//��������
		"      " + 												//���� (�����ȸ�ô� �̻��)
		"                                                 " + 
		"130704" +												//���ŷ��� �ŷ����� 
		"121976" + 												//���ŷ��� ����
		"                                                                                                                                                           fms";
	//�ǽð� �Ǻ� ���(����)
	public static String RealCMS_One_Confirm =
		REAL_CUSTID+REAL_CUSTPW+REAL_SWID+REAL_SWPW+
		(UtilMethod.getToday()-20000000)+						//�۽�����
		"6000" +												//��������
		"100" + 												//��������
		(System.currentTimeMillis()+"").substring(7, 13) + 		//���� (�����ȸ�ô� �̻��)
		"                                                 " +	//FMS����
		"121206" +												//���ŷ��� �ŷ����� 
		"000052" + 												//���ŷ��� ����
		"                                                                                                                                                           fms";
	
	//�ǽð� ��ġ�ϴ��
	public static String RealCMS_Batch_Confirm = 
		"SsdsitesttesttestswswtestswswswswSUMA20111214                                                                                                                                                              \r\n";
	
	
	/*
	 * ��ġARS
	 */
	public static String ARS_Start_MEM_APPLY  = "SsdsitesttesttestswswtestswswswswMEMA20110401                                                                                                                                          \r\n";
	
	
	//ī�� ���� �׽�Ʈ
		//�ǽð� �Ǻ� ���(����)
			public static String CARD_EXPIRE_TEST =
				TEST_CUSTID+"  "+TEST_CUSTPW+"  "+NSDSI_TEST_SWID+"  "+NSDSI_TEST_SWTPW+"  "+
				"CARD"+						//�۽�����
				"E" +												//��������
				"               " + 												//��������
				"sdsd0202            " + 		//���� (�����ȸ�ô� �̻��)
				"                                                  " +	//FMS����
				"                                                  " +	//FMS����
				"                                                  " +	//FMS����
				"                                                  " +	//FMS����
				"                                                  " +	//FMS����
				"             " +	//FMS����
				" " +	//FMS����
				"    " +	//FMS����
				"                                                  " +	//FMS����
				"\r\n";
			
			public static String CARD_EXPIRE_TEST2 = "NSI"+
					TEST_CUSTID+"  "+TEST_CUSTPW+"  "+NSDSI_TEST_SWID+"  "+NSDSI_TEST_SWTPW+"  "+
					"CARD"+						//�۽�����
					"E" +												//��������
					"               " + 												//��������
					"sdsd0202            " + 		//���� (�����ȸ�ô� �̻��)
					"                                                  " +	//FMS����
					"                                                  " +	//FMS����
					"                                                  " +	//FMS����
					"                                                  " +	//FMS����
					"                                                  " +	//FMS����
					"             " +	//FMS����
					" " +	//FMS����
					"    " +	//FMS����
					"                                                  " +	//FMS����
					"\r\n";
	
	
	
	
}
