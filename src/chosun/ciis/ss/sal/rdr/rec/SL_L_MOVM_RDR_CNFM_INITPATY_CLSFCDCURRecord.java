/***************************************************************************************************
* ���ϸ� : SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord.java
* ��� : ����-�̻絶�ڰ���(�μ�)-�ʱ�ȭ�� ��ü�����ڵ�,�ڵ�� ����� ���� Record 
* �ۼ����� : 2004-01-14
* �ۼ��� : �迵��
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/

package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * ����-�̻絶�ڰ���(�μ�)-�ʱ�ȭ�� ��ü�����ڵ�,�ڵ�� ����� ���� Record 
 */

public class SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String cicdynm;
	public String ciymgbcd;
	public String cicdgb;

	public SL_L_MOVM_RDR_CNFM_INITPATY_CLSFCDCURRecord(){}

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

/* �ۼ��ð� : Sun Jan 18 20:09:16 KST 2004 */