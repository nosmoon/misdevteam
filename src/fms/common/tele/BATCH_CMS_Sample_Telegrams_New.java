package fms.common.tele;

import fms.util.UtilMethod;

/** BATCH CMS V2.0 **/
public class BATCH_CMS_Sample_Telegrams_New {	
	/** TEST **/
	/* START ���� */
	//��û	�� ó������ �����������
	public static String CMS_START_MEM_APPLY_New   = "Ssdsitest  testtest  swswtest  swswswsw  MEMA20150519                                                                                                                                                                                                                                                     \r\n";
	public static String CMS_START_PAY_APPLY_New   = "Ssdsitest  testtest  swswtest  swswswsw  PAYA20150423                                                                                                                                                                                                                                                     \r\n";
	public static String CMS_START_MEM_RESULT_New  = "Ssdsitest  testtest  swswtest  swswswsw  MEMR20150420                                                                                                                                                                                                                                                     \r\n";
	public static String CMS_START_PAY_RESULT_New  = "Ssdsitest  testtest  swswtest  swswswsw  PAYR20150312                                                                                                                                                                                                                                                     \r\n";
	public static String CMS_START_MEM_SEARCH_New  = "Ssdsitest  testtest  swswtest  swswswsw  MEMS20150326                                                                                                                                                                                                                                                     \r\n";
	public static String CMS_START_PAY_SEARCH_New  = "Ssdsitest  testtest  swswtest  swswswsw  PAYS20140507                                                                                                                                                                                                                                                     \r\n";

	// ȸ������ ��ġ
	public static String CMS_START_AUTH_New        = "Ssdsitest  testtest  swswtest  swswswsw  MEMT20150326                                                                                                                                                                                                                                                     \r\n";
	
	// ȸ������ �Ǻ�
	public static String CMS_REAL_AUTH_New         = "Asdsitest  testtest  swswtest  swswswsw  20150327jhhrrrr9967                                                                                                                                                                                                                                              \r\n";
	
	/* HEADER ���� */	
	// ȸ�� ��� ��û�Ǽ��� ���������� �� �Ǽ�
	public static String CMS_MEM_HEADER_New        = "Hsdsitest  1                                                                                                                                                                                                                                                                                              \r\n";
	// ��� ��� ��û�Ǽ�/�ݾ��� ���������� �� �Ǽ� �� �ѱݾ� ��
	/*public static String CMS_PAY_HEADER_V2        = "Hsdsitest  10000 100000                                                                                                                                                                                                                                                                                   \r\n";*/
	public static String CMS_PAY_HEADER_New        = "Hsdsitest  3          30000                                                                                                                                                                                                                                                                               \r\n";

	/* DATA ����*/
	public static String[] CMS_MEM_N_DATA_New = 
	{ 
	/* �ű� N */
    "Dsdsitest  Nfms748899           ȫ�浿                                  021111111111     ȫ�浿              810204       M01039001521                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9090         ȫ�浿                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9083         ȫ�浿                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9081         ȫ�浿                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9082         ȫ�浿                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9084         ȫ�浿                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9085         ȫ�浿                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9086         ȫ�浿                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9087         ȫ�浿                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm9088         ȫ�浿                                                                                                                                                                                                                                                                    \r\n",
//    "Ddev_reg5  Djhdratm22266        ȫ�浿                                                                                                                                                                                                                                                                    \r\n",
    /* ���� U */ 
    	// �������� ���� ����
//    "Dsdsitest  Ujhdratm9876         ȫ�浿06                                31                                                                                                                                                                                                                                \r\n",
    	// ����ó ���� 
//   "Dsdsitest  Ujhdratm9876         �׽�Ʈ07                                                                                   01095799906                                                                                                                                                                    \r\n",
    /* ���� D */
//      "Ddev_reg5  D000789456           ȫ�浿                                                                                                                                                                                                                                                                    \r\n",
//	  "Dsdsitest  D103087906           �׽�Ʈ                                                                                                                                                                                                                                                                    \r\n",
	};	
	public static String[] CMS_PAY_N_DATA_New = 
	{ 
	"Dsdsitest  Nfmsfmsm9082         �׽�Ʈ              000001201   10000     01022223333                                                                                                                                                                                                                     \r\n",
	"Dsdsitest  Nfmsfmsm9082         �׽�Ʈ              000002202   10000     01022223333                                                                                                                                                                                                                     \r\n",
	"Dsdsitest  Nfmsfmsm9082         �׽�Ʈ              000003203   10000     01022223333                                                                                                                                                                                                                     \r\n",
	};
	
	/*public static String[] CMS_PAY_N_DATA_V2_B = 
	{ 
		"Dsdsitest  Nmh_test_004         �׽�Ʈ              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         �׽�Ʈ              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         �׽�Ʈ              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         �׽�Ʈ              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         �׽�Ʈ              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         �׽�Ʈ              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         �׽�Ʈ              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         �׽�Ʈ              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         �׽�Ʈ              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",
		"Dsdsitest  Nmh_test_004         �׽�Ʈ              "+UtilMethod.i(i)+10000+"      1000000   01022223333                                                                                                                                                                                                                     \r\n",



	};
	*/
	public static String CMS_MEM_N_DATA_New2	 = "Dsdsitest  DMEM_0000001_k2      �׽�Ʈ08                                                                                                                                                                                                                                                                  \r\n";
	
	/* TAIL���� */
	public static String CMS_MEM_TAIL_New	 = "Tsdsitest                                                                                                                                                                                                                                                                                                 \r\n";
	public static String CMS_PAY_TAIL_New	 = "Tsdsitest                                                                                                                                                                                                                                                                                                 \r\n";

}
