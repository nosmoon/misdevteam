/***************************************************************************************************
* ���ϸ� : .java
* ��� : *���˹��ڵ�˻�(�����ȸ)
* �ۼ����� : 2009-06-15
* �ۼ��� : �輼��
***************************************************************************************************/


package chosun.ciis.ss.sal.common.rec;

import java.sql.*;
import chosun.ciis.ss.sal.common.dm.*;
import chosun.ciis.ss.sal.common.ds.*;

/**
 * ���˹��ڵ�˻�(�����ȸ)
 */

public class SL_L_BNSITEMUSECLSFCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String cicdynm;
	public String ciymgbcd;
	public String cicdgb;

	public SL_L_BNSITEMUSECLSFCURRecord(){}

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

/* �ۼ��ð� : Mon Jun 15 16:06:04 KST 2009 */