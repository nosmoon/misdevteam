/***************************************************************************************************
* ���ϸ� : PS_L_INFOEXG_SRCHEXTTLISTRecord.java
* ��� : �������� �Խ��� -
* �ۼ����� : 2004-03-29
* �ۼ��� : ����ǥ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.share.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.share.dm.*;
import chosun.ciis.ps.pbs.share.ds.*;

/**
 * ��������- �������� �Խ��� -
 *
 */


public class PS_L_INFOEXG_SRCHEXTTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;

	public PS_L_INFOEXG_SRCHEXTTLISTRecord(){}

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

/* �ۼ��ð� : Wed Apr 07 18:39:32 KST 2004 */