/**************************************************************************************************
* ���ϸ� 	: SS_L_CURBSNSLISTRecord.java
* ��� 		: ����Info-�߼۳뼱 ����Ʈ record
* �ۼ����� 	: 2004-03-30
* �ۼ��� 	: ��â��
**************************************************************************************************/
/**************************************************************************************************
* �������� 	:
* ������ 	:
* �������� 	:
* ��� 		: 
**************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brinfo.dm.*;
import chosun.ciis.ss.sls.brinfo.ds.*;

/**
 * �Ǹ�����-��� �߼۳뼱������ȸ ����Ʈ record
 */

public class SS_L_CURBSNSLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String mcname;					//��ü��
	public String jbpansu;					//�Ǽ�
	public String jpname;					//������
	public String inname;					//�μ�ó
	public String jbjiorder;				//����
	public String jiname;             		//������
	public String jbbusu;             		//�μ�
	public String jbbalcha;             	//�����ð�
	public String jbyetime;             	//�����ð�
	public String jbdotime;             	//�����ð�

	public SS_L_CURBSNSLISTRecord(){}

}

/* �ۼ��ð� : Wed Feb 11 11:39:13 KST 2004 */