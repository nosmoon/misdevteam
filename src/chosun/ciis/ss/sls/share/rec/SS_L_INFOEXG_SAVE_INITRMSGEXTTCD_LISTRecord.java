/***************************************************************************************************
* ���ϸ� : SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord.java
* ��� : �������� �Խ��� ��� �ʱ�ȭ��
* �ۼ����� : 2004-05-20
* �ۼ��� : ����ȫ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.share.rec;

import java.sql.*;
import chosun.ciis.ss.sls.share.dm.*;
import chosun.ciis.ss.sls.share.ds.*;

/**
 * �������� �Խ��� ��� �ʱ�ȭ��
 *
 */

public class SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_L_INFOEXG_SAVE_INITRMSGEXTTCD_LISTRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}
}

/* �ۼ��ð� : Fri May 21 16:34:33 KST 2004 */