/***************************************************************************************************
* ���ϸ� : .java
* ��� : *������Ȳ-���ں���-�ʱ�ȭ��
* �ۼ����� : 2009-04-27
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.ds.*;

/**
 * ������Ȳ-���ں���-�ʱ�ȭ��
 */

public class SS_L_RDR_DSCT_INITACPNPATHCDRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String ciymgbcd;
	public String cicdgb;
	public String cicdynm;

	public SS_L_RDR_DSCT_INITACPNPATHCDRecord(){}

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

/* �ۼ��ð� : Tue Apr 28 14:19:29 KST 2009 */