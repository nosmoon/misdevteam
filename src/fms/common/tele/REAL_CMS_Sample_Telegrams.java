package fms.common.tele;

import fms.util.UtilMethod;


public class REAL_CMS_Sample_Telegrams {	
	/** TEST **/
	/*
	 * �ǽð�CMS �Ǻ�
	 */
	// ****����� 0-100
	public static String REALCMS_COMMON = 
			"sdsitest  " +
			"testtest  " +
			"swswtest  " +
			"swswswsw  " +
			(UtilMethod.getToday()-20000000)+						//�ŷ�����
			"1000" +
			"100" +													// �Ϲ�
			"066888" +												//����
			"                                         "; 	//FMS ��������(��������,���۽ð�,������,�����ڵ�, FMS��뿵��)
	// �Ϲ�
	public static String REALCMS_PAY_APPLY =
		REALCMS_COMMON +
		// ��ݽ�û ������	
		"34" + 														// �����ڵ�
		"841101154874111" +											// ���¹�ȣ
		"871123       " +											// �����ֻ������
		"��ġ�׽�Ʈ2         " +									//�����ָ�
		"00011634            " +									//ȸ����ȣ
		"000000000010000" +											//��ݱݾ�
		"01" +														//����ȸ��
		"                                                                                                                            fms test ";
	
	public static String REALCMS_ACCT_SEARCH_ONE = "sdsitesttesttestswswtestswswswsw1410161000300000001                                                 1112345679800    801212       �׽�Ʈ                                                                                                                                      ";
	public static String REALCMS_ACCT_SEARCH_ONE_AA = "SsdsitesttesttestswswtestswswswswPAYS20150330                                                                                                                                          \r\n";
	
	public static String REALCMS_PAY_RESULT =
			"sdsitesttesttestswswtestswswswsw" +
			(UtilMethod.getToday()-20000000)+						//�۽�����
			"1000" +												//��������
			"200" + 												//��������
			"      " + 												//���� (�����ȸ�ô� �̻��)
			"                                                 " + 
			"141016" +												//���ŷ��� �ŷ����� 
			"000001" + 												//���ŷ��� ����
			"                                                                                                                                                           fms";

}
