/***************************************************************************************************
* ���ϸ� : SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord.java
* ��� : ������������-�����߰������˾�(�ʱ�ȭ��)-������޸�ü�ڵ�
* �ۼ����� : 2004-02-12
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
 * ������������-�����߰������˾�(�ʱ�ȭ��)-������޸�ü�ڵ�
 *
 */


public class SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord extends java.lang.Object implements java.io.Serializable{

	public String medicd;
	public String cicdnm;
	public String remk;
	public String areanwspyn;
	public int subsuprc;
	public String ciymgbcd;
	public String cicdgb;

	public SL_L_NWSPSUBSCNTR_INITBOMEDICDCURRecord(){}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCicdnm(String cicdnm){
		this.cicdnm = cicdnm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAreanwspyn(String areanwspyn){
		this.areanwspyn = areanwspyn;
	}

	public void setSubsuprc(int subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setCiymgbcd(String ciymgbcd){
		this.ciymgbcd = ciymgbcd;
	}

	public void setCicdgb(String cicdgb){
		this.cicdgb = cicdgb;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCicdnm(){
		return this.cicdnm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAreanwspyn(){
		return this.areanwspyn;
	}

	public int getSubsuprc(){
		return this.subsuprc;
	}

	public String getCiymgbcd(){
		return this.ciymgbcd;
	}

	public String getCicdgb(){
		return this.cicdgb;
	}
}

/* �ۼ��ð� : Fri Feb 13 17:00:18 KST 2004 */