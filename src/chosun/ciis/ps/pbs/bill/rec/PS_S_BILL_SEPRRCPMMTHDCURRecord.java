/***************************************************************************************************
* ���ϸ� : SP_PS_S_BILL_SEPR.java
* ����-�����Ա� �ʱ�ȭ��
* �ۼ����� : 2004-03-29
* �ۼ��� : ���ȣ
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� :
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/**
 * ����-�����Ա� �ʱ�ȭ��
 *
 */

public class PS_S_BILL_SEPRRCPMMTHDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String cicdynm;
	public String ciymgbcd;
	public String cicdgb;

	public PS_S_BILL_SEPRRCPMMTHDCURRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}
}

/* �ۼ��ð� : Wed May 03 17:23:22 KST 2006 */