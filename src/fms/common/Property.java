package fms.common;


public class Property {	
	/**
	 * ��ġCMS ����
	 */
	public static String BATCH_CMS_IP = "121.134.74.90";	// �Ǵ� 121.134.74.70
	public static int CMS_TEST_PORT = 11000;
	
	/**
	 * �ǽð�CMS ����
	 */
	/*public static String REAL_CMS_IP = "121.134.74.90";	// �Ǵ� 121.134.74.70
	public static int REAL_CMS_TEST_PORT = 14000;*/
	
	/**
	 * �ǽð�CMS ����
	 */
	public static String YELLOW_REALCMS_REAL_IP ="sdsireal.efnc.co.kr"; 
	
	public static String YELLOW_REALCMS_TEST_IP = "121.134.74.90";
	public static String REALCMS_BLUE_IP = "121.134.74.101";		//�ǽð�CMS
	
	public static int YELLOW_REALCMS_TEST_PORT = 14000;				//�ǽð�CMS ������ ����(�׽�Ʈ)
	public static int REAL_CMS_ONE_PAY_APPLY_TEST_PORT = 11031;		//�ǽð� �Ǻ� ��� ��û(�׽�Ʈ)
	public static int REAL_CMS_ONE_PAY_RESULT_TEST_PORT = 11032;	//�ǽð� �Ǻ� ��� ��� ��ȸ, �������(�׽�Ʈ)
	public static int REAL_CMS_BATCH_PAY_RESUT_TEST_PORT = 11034;	//�ǽð� ��ġ ��ݰ�� ��ȸ, ������(�׽�Ʈ)
	public static int REAL_CMS_ONE_ACCT_SEARCH_TEST_PORT = 11061;	//�ǽð� �Ǻ� ������ȸ(�׽�Ʈ)
	public static int REAL_CMS_ONE_ACCT_SEARCH_REAL_PORT = 13385;	//�ǽð� �Ǻ� ������ȸ(�)
	public static int REAL_CMS_ONE_PAY_RESULT_REAL_PORT = 13382;	//�ǽð� �Ǻ� ��� ���(�)
	public static int REAL_CMS_ONE_PAY_APPLY_REAL_PORT = 13381;		//�ǽð� �Ǻ� ��� ��û(�)
	public static int REAL_CMS_ONE_CONFIRM_REAL_PORT = 13382;		//�ǽð� �Ǻ� ���(�)
	public static int YELLOW_REALCMS_REAL_PORT = 24000;				//�ǽð�CMS ������ ����(�)
	public static int YELLOW_CARD_TEST_PORT = 51001;				//ī�� �Ǻ� �׽�Ʈ ��Ʈ(�)
	public static int YELLOW_CARD_REAL_PORT = 51000;				//ī�� �Ǻ� ���� ��Ʈ(�)
	
	/**
	 * SDSI������� ����
	 */
	public static String VIRTUAL_IP = "121.134.74.90";	// �Ǵ� 121.134.74.70
	public static int VIRTUAL_TEST_PORT = 16000;
	public static int VIRTUAL_REAL_PORT = 26000;
	
	/**
	 * CARD ����
	 */
	public static String CARD_IP = "121.134.74.90";	// �Ǵ� 121.134.74.70
	public static String CARD_TEST_IP = "121.134.74.90";	//"121.134.74.70";	//sdsitest.efnc.co.kr";	// �Ǵ� 121.134.74.70
	public static int CARD_TEST_PORT = 51001;
	public static int CARD_REAL_PORT = 51000;
	
	/**
	 * �ѱ� ����
	 */
	public static String HANGIL_IP = "121.134.74.90";	// �Ǵ� 121.134.74.70
	public static int HANGIL_INFO_TEST_PORT = 11200; //��ü
	public static int HANGIL_TRANSFER_TEST_PORT = 11105; //�̰�
	//public static int HANGIL_REAL_PORT = 51000;
	
	/**
	 * �޴���ȭ ����
	 */
	public static String MOB_IP = "121.134.74.70";
	public static int MOB_ONE_TEST_PORT = 12100; //�޴���ȭ(�Ǻ�) ����,�������,������ȸ ��û [�׽�Ʈ]
	public static int MOB_ONE_REAL_PORT = 22100; //�޴���ȭ(�Ǻ�) ����,�������,������ȸ ��û [�]
	public static int MOB_BATCH_REAL_PORT = 22000; //�޴���ȭ(��ġ)  [�]
	public static int MOB_BATCH_TEST_PORT = 12000; //�޴���ȭ(��ġ)  [�׽�Ʈ]
	
	/**
	 * �޴���ȭ ����������
	 */
	public static String HPAUTH_IP = "121.134.74.70";
	public static int HPAUTH_TEST_PORT = 19070; //�޴���ȭ ���������� [�׽�Ʈ]
	public static int HPAUTH_REAL_PORT = 19080; //�޴���ȭ ���������� [�]
	
	/**
	 * �ݰ�� ����
	 */
	public static String KFTC_IP = "121.134.74.70";
	public static int KFTC_REAL_PORT = 27000; //KFTC [�]
	public static int KFTC_TEST_PORT = 17000;
	
	/**
	 * ARS ����
	 */
	public static String ARS_IP = "121.134.74.70";
	
	//�Ǻ� ARS
	public static int ARS_ONE_TEST_PORT = 13100; //�޴���ȭ(�Ǻ�) ����,�������,������ȸ ��û [�׽�Ʈ]
	public static int ARS_ONE_REAL_PORT = 23100; //�޴���ȭ(�Ǻ�) ����,�������,������ȸ ��û [�]

	
	//��ġ ARS
	public static int ARS_TEST_PORT = 13000;
	public static int ARS_REAL_PORT = 23000;
}
