/***************************************************************************************************
* ���ϸ� : SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord.java
* ��� : ����-�̻絶�ڰ���-�ʱ�ȭ�� �ְű����ڵ�, �ڵ�� ����� ���� Record
* �ۼ����� : 2004-01-14
* �ۼ��� : ��뼷
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
 * ����-�̻絶�ڰ���-�ʱ�ȭ�� �ְű����ڵ�, �ڵ�� ����� ���� Record
 */

public class SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord extends java.lang.Object implements java.io.Serializable{

	public String cicodeval;
	public String cicdnm;
	public String ciymgbcd;
	public String cicdgb;
	public String cicdynm;

	public SL_L_MOVM_RDR_INITCURMOVMRESICLSFRecord(){}

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

/* �ۼ��ð� : Thu Jan 15 14:55:37 KST 2004 */