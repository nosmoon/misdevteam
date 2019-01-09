package fms.common.tele;

/** BATCH CMS V2.0 **/
public class CARD_CMS_Sample_Telegrams {	
	/** TEST **/
	/* START ���� */
	//��û	�� ó������ �����������
	public static String CARD_START_MEM_APPLY   = "sdsitest  testtest  swswtest  swswswsw  CARDN20150406123123Nfmsfmsm22           ȫ�浿              123145646456    20150205                                              5000      0103131313  kkkkkk@naver.com                                                                                                                                                                                              \r\n";
	public static String CARD_START_PAY_APPLY1   = "Ssdsitest  testtest  swswtest  swswswsw  PAYA20140616                                                                                                                                                                                                                                                     \r\n";
	public static String CARD_START_MEM_RESULT  = "Ssdsitest  testtest  swswtest  swswswsw  MEMR20140514                                                                                                                                                                                                                                                     \r\n";
	public static String CARD_START_MEM_SEARCH  = "Ssdsitest  testtest  swswtest  swswswsw  MEMS20140522                                                                                                                                                                                                                                                     \r\n";
	public static String CARD_ONE_PAY_SEARCH1  = "Ssdsitest  testtest  swswtest  swswswsw  PAYS20140507                                                                                                                                                                                                                                                     \r\n";
	
	public static String CARD_SEARCH_APPLY   = "sdsitest  testtest  swswtest  swswswsw  CARDS20150407000001                                                                                                                                                                                                                                                                                                                                                   \r\n";
	
	public static String CARD_CANCEL_APPLY   = "sdsitest  testtest  swswtest  swswswsw  CARDC20150407000001                                                                                                                                                                                                      61721195                                                                                                                                     \r\n";
	
	//ī�� ��ݽ�û(��ġ)
	public static String CARD_START_PAY_APPLY   = "Ssdsitest  testtest  swswtest  swswswsw  CONA20150521000005                                                                                                                                                                                                                                                                                       \r\n";
	/* HARDER ����*/
	public static String CARD_HEADER_PAY_APPLY  = "Hsdsitest  1     1000                                                                                                                                                                                                                                                                                                                             \r\n";
	/* DATA ����*/
	public static String[] CARD_DATA_PAY_APPLY = 
	{ 
	/* �ű� N */
    "Dsdsitest  CARDNNfmsratm2211         ȫ�浿              0000011110949565901971201806810204                                          1000      01039001524                                                                                                                                                                                        \r\n",
	};
	/* TAIL ����*/
	public static String CARD_TAIL_PAY_APPLY        = "Tsdsitest                                                                                                                                                                                                                                                                                                                                         \r\n";
	
	//��� ���(��ġ)
	public static String CARD_PAY_RESULT_BATCH  = "Ssdsitest  testtest  swswtest  swswswsw  CONR20150521000005                                                                                                                                                                                                                                                                                       \r\n";
	
	//ī�� ����(�Ǻ�)
	public static String CARD_AUTH  = "sdsitest  testtest  swswtest  swswswsw  AUT201505210000011234567812345678201805ȫ�浿              810204                                                                                                                                               \r\n";
	
	//ī�� ���(�Ǻ�)
	public static String CARD_ONE_PAY_APPLY = "sdsitest  testtest  swswtest  swswswsw  CARDN20150521000001Nfms5656             ȫ�浿              1212121212121122201508800506       12121212121212                     1000      01031313131                                                                                                                                                                                                               \r\n";
	
	//ī�� ��ȸ(�Ǻ�)
	public static String CARD_ONE_PAY_SEARCH  = "sdsitest  testtest  swswtest  swswswsw  CARDS20150521000005                                                                                                                                                                                                                                                                                                                                                   \r\n";
	
	//ī�� ��ȸ(�Ǻ�)
	public static String CARD_ONE_PAY_CANCEL  = "sdsitest  testtest  swswtest  swswswsw  CARDC20150521000005                                                                                                                                                                                                                                                                                                                                                   \r\n";
}
