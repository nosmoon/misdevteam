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
	 * �޴���ȭ
	 */
//	public static String MOB_TGR_NO="999992";//�޴���ȭ���� ����
//	public static String MOB_CON_APPLY  = "sdsitesttesttestswswtestswswswswMOBN" + UtilMethod.getToday() + MOB_TGR_NO + "201012141           7210251_01029906613 LG01056552640    7210251_01029906613 8103111231721      100                                                                                           fms test\r\n";
//	public static String MOB_CON_CANCEL_APPLY  = "sdsitesttesttestswswtestswswswswMOBC              201012141           7210251_01029906613 LG01056552640    7210251_01029906613 8103111231721      100                      10005196110520999992                                                 fms test\r\n";
//	public static String MOB_CON_SEARCH_APPLY  = "sdsitesttesttestswswtestswswswswMOBS" + "20101012" + MOB_TGR_NO + "201012141           7210251_01029906613 SK01029906613    7210251_01029906613 7210251348213      100                      20101214000013ACPGD0                                                 fms test\r\n";

	public static String MOB_TGR_NO="000001";//�޴���ȭ���� ����
	
	public static String tt  = "sdsitest1111qqqqswswrealswswswswMOBN20150420000111hello01             ���                LG01056552640    ���                8103111            2000                                                                                                  \r\n";

	
	public static String MOB_CON_APPLY  = 
		"sdsitesttesttest" + 		//��üID, ��üPW
		"swswtestswswswsw" + 		//���α׷���üID, ���α׷���üPW
		"MOB" + 					//��������
		"N" + 						//��������
		UtilMethod.getToday() + 	//������
		(System.currentTimeMillis()+"").substring(7, 13) +		//�޴���ȭ ���� ���� 
		"1015327             " + 	//ȸ����ȣ
		"ȫ�浿              " + 	//ȸ����
		"SK" + 						//�����
//		"01056552640    " +  		//LG �׽�Ʈ�� ������ȭ��ȣ
		"01011115523    " +  		//LG �׽�Ʈ�� ������ȭ��ȣ
		"ȫ�浿              " + 	//���������ڼ���
		"8902082      " + 			//LG �׽�Ʈ�� �����������ֹι�ȣ
		"      " + 					//�̻��
		"10        " + 				//���ν�û�ݾ�
		"                                                                                    fms test\r\n";
	public static String MOB_CON_CANCEL_APPLY  = 
		"sdsitesttesttestswswtestswswswswMOBC              201012141           7210251_01029906613 LG01056552640    7210251_01029906613 8103111231721      100                      " +
		"10005196110520999994" + //����Ű
		"                                                 fms test\r\n";
	
	public static String MOB_CON_CANCEL_APPLY2  =	"sdsitesttesttestswswtestswswswswMOBC                                                                                                                                       SK141128000005000001                                                         \r\n";
	
	public static String MOB_CON_SEARCH_APPLY  = "sdsitesttesttestswswtestswswswswMOBS" + "20150204" + MOB_TGR_NO + "201502041           7210251_01029906613 SK01029906613    7210251_01029906613 7210251348213      100                      20101214000013ACPGD0                                                 fms test\r\n";
	public static String MOB_Start_CON_APPLY  =	"SsdsitesttesttestswswtestswswswswCONA20110112                                                                                                                                          \r\n";
	public static String MOB_Start_PAY_RESULT =	"SsdsitesttesttestswswtestswswswswPAYR20150518                                                                                                                                          \r\n";
	
	public static String MOB_Start_MEM_RESULT =	"SsdsitesttesttestswswtestswswswswCOPS20150420100703                                                                                                                                    \r\n";
	
	
	public static String REAL_M_S =	"sdsitesttesttestswswtestswswswswMOBS20150513000901                                                                                                                                                                                                      \r\n";
	
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
	
	public static String CARD_AUTH  = "sdsitest  testtest  swswtest  swswswsw  AUT201503161212121111111111111111201503121212121212        811104                                                                                                                                               \r\n";
	
	public static String ARS  = "SsdsitesttesttestswswtestswswswswMEMA20150318123132                                                                                                                                    \r\n";
	public static String ARS_Header  = "Hjhd112  1                                                                                                                                                                             \r\n";
	public static String ARS_Data = "Djhd111  WTN13131314            jyj                 0510000     999912310001039881524    ȫ�浿              8111041                                                                   \r\n";
	public static String ARS_Tail  = "Tjhd111                                                                                                                                                                                \r\n";
	
	public static String REALPAY  = "SsdsitesttesttestswswtestswswswswTAXC20150317000001T                                                                                                                                                       \r\n";
	
	public static String MOB  = "sdsitesttesttestswswtestswswswswMOBN20150317123457123457              123457              SK01039111523    123457              8111041            1000                                                                                                  \r\n";
	
	//����� ȸ����û
	public static String MOB_S_MEM  = "Ssdsitest1111qqqqswswrealswswswswMEPA20150506000001                                                                                                                                    \r\n";
	//����� ȸ����û
	public static String MOB_S_H_MEM  = "Hsdsitest2                                                                                                                                                                             \r\n";
	public static String[] MOB_S_D_MEM  = {
		"DsdsitestHPN335003              ȫ�浿              031000              1101939881234    ȫ�浿              8102051                                                                   \r\n",
		"DsdsitestHPN335004              ������              031000              1101939881234    ȫ�浿              8102051                                                                   \r\n",
	};
	//����� ȸ����û(�Ҿװ���)
	public static String[] MOB_S_D_MEP  = {
		"DsdsitestHPNPooh005             ���p                                   1101011332255    ���p               8809162      N                                                                                     \r\n",
		"DsdsitestHPNPooh006             ���p2                                  1101011332255    ���p2              8809162      N                                                                                     \r\n",
	};
	public static String MOB_S_T_MEM  = "Tsdsitest                                                                                                                                                                              \r\n";
	
	public static String MOB_S  = "SsdsitesttesttestswswtestswswswswCONA20150420000001                                                                                                                                    \r\n";
	
	public static String MOB_S2  = "SsdsitesttesttestswswtestswswswswMEMA20150420                                                                                                                                          \r\n";
	public static String MOB_S_H  = "Hsdsitest2                                                                                                                                                                             \r\n";
	public static String[] MOB_S_D  = {
		"DsdsitestHPNPooh005             ȫ�浿              031000              1101931111234    ȫ�浿              8102051                                                                   \r\n",
		"DsdsitestHPNPooh005             ȫ�浿              031000              1101931111234    ȫ�浿              8102051                                                                   \r\n",
	};
	public static String MOB_S_T  = "Tsdsitest                                                                                                                                                                              \r\n";
	
	public static String MOB_S_PAY  = "SsdsitesttesttestswswtestswswswswCOPA20150422000003                                                                                                                                    \r\n";
	public static String MOB_S_H_PAY  = "Hsdsitest2     8000                                                                                                                                                                    \r\n";
	//����� ���ν�û(ȸ�� �������� �̿�)
	/*public static String[] MOB_S_D_PAY  = {
		"DsdsitestHPN335003              ȫ�浿              000001                          5000                                                                                               \r\n",
		"DsdsitestHPN335003              ȫ�浿              000002                          5000                                                                                               \r\n",
	};*/
	
	//����� ���ν�û(�������� ����)
	public static String[] MOB_S_D_PAY  = {
		"DsdsitestHPNPooh005             ȫ�浿              000001      1101066666666    ȫ�浿              8102041      Y456456                             4000                                                                                                   \r\n",
		"DsdsitestHPNPooh005             ȫ�浿              000002      1101066666666    ȫ�浿              8102041      Y456456                             4000                                                                                                   \r\n",
	};
	public static String MOB_S_T_PAY  = "Tsdsitest                                                                                                                                                                              \r\n";
	
	public static String MOB_CON_APPLY2  = 
			"sdsitesttesttest" + 		//��üID, ��üPW
			"swswtestswswswsw" + 		//���α׷���üID, ���α׷���üPW
			"MOB" + 					//��������
			"N" + 						//��������
			UtilMethod.getToday() + 	//������
			(System.currentTimeMillis()+"").substring(7, 13) +		//�޴���ȭ ���� ���� 
			"797979797979        " + 	//ȸ����ȣ
			"7_79797979799906613 " + 	//ȸ����
			"KT" + 						//�����
//			"01056552640    " +  		//LG �׽�Ʈ�� ������ȭ��ȣ
			"01039001524    " +  		//LG �׽�Ʈ�� ������ȭ��ȣ
			"�׽�Ʈ��            " + 	//���������ڼ���
			"8122011      " + 			//LG �׽�Ʈ�� �����������ֹι�ȣ
			"      " + 					//�̻��
			"500       " + 				//���ν�û�ݾ�
			"                                                                                    fms test\r\n";
	
}
