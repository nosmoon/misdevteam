/***************************************************************************************************
* ���ϸ� : SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord.java
* ��� : Ȯ����Ȳ-���̹�Ȯ��-����-�ʱ�ȭ�� ����Ȯ�λ����ڵ� ����� ���� Record
* �ۼ����� : 2004-09-13
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * Ȯ����Ȳ-���̹�Ȯ��-����-�ʱ�ȭ�� ����Ȯ�λ����ڵ� ����� ���� Record
 */


public class SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String ciymgbcd;
	public String cicdgb;
	public String cicdynm;

	public SS_L_PROMSTAF_CYEXPAY_INITCURSUBSCNFMSTATCDRecord(){}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public String getCicodeval(){
		return this.cicodeval;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}

	public String getCicdynm(){
		return this.cicdynm;
	}
}

/* �ۼ��ð� : Tue Sep 14 19:44:43 KST 2004 */