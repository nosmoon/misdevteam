/***************************************************************************************************
* ���ϸ� : SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord.java
* ��� : ������������(���������˾�-�������������ȸ)
* �ۼ����� : 2004-07-04
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
 * ������������(���������˾�-�������������ȸ)
 *
 */

public class SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extndt;
	public String medinm;
	public String suspdt;
	public String bonm;
	public String rdr_extntypenm;
	public String remk;

	public SL_L_NWSPSUBSCNTRPTCRNWSPSUBSCNTRCURRecord(){}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdr_extntypenm(String rdr_extntypenm){
		this.rdr_extntypenm = rdr_extntypenm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdr_extntypenm(){
		return this.rdr_extntypenm;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* �ۼ��ð� : Sun Jul 04 20:08:21 KST 2004 */