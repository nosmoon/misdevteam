/***************************************************************************************************
* ���ϸ� : SS_MO_L_INFOEXG_SRCHRMSGEXTTCD_LISTRecord.java
* ��� : CIIS-�Ǹ�-���Ͱ���-��������-��������-����Ʈ_����Ͽ�
* �ۼ����� : 2017-01-24
* �ۼ��� : �弱��
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
 *
 */


public class SS_MO_L_INFOEXG_SRCHRMSGEXTTCD_LISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public SS_MO_L_INFOEXG_SRCHRMSGEXTTCD_LISTRecord(){}

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

/* �ۼ��ð� : Tue Jan 24 17:40:46 KST 2017 */