/***************************************************************************************************
* ���ϸ� : SS_L_APLC_MANG_INITSHFTCLSFRecord.java
* ��� : ������������-Billing�ڵ���ü-��û����-�ʱ�ȭ��
* �ۼ����� : 2004-03-25
* �ۼ��� : ���
***************************************************************************************************/
/***************************************************************************************************
* �������� : ��ü�ڵ帮��Ʈ �߰�
* ������ : �弱��
* �������� : 2017-10-30
* ��� :
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.ds.*;

/**
 * ������������-Billing�ڵ���ü-��û����-�ʱ�ȭ��
 *
 */


public class SS_L_APLC_MANG_INITSHFTCLSFRecord extends java.lang.Object implements java.io.Serializable{

	public String ciymgbcd;
	public String cicdgb;
	public String cicodeval;
	public String cicdnm;
	public String cicdynm;

	public SS_L_APLC_MANG_INITSHFTCLSFRecord(){}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public void setCicodeval(String cicodeval){
		this.cicodeval = cicodeval;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setCicdynm(String cicdynm){
		this.cicdynm = cicdynm;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
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
}

/* �ۼ��ð� : Mon Oct 30 10:25:24 KST 2017 */