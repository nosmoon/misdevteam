/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.fc.acct.rec;

import java.sql.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.ds.*;

/**
 * 
 */


public class FC_ACCT_6162_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String cbamt;
	public String slip_clsf_cd;
	public String from_fisc_dt;
	public String to_fisc_dt;

	public FC_ACCT_6162_LCURLIST1Record(){}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setCbamt(String cbamt){
		this.cbamt = cbamt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setFrom_fisc_dt(String from_fisc_dt){
		this.from_fisc_dt = from_fisc_dt;
	}

	public void setTo_fisc_dt(String to_fisc_dt){
		this.to_fisc_dt = to_fisc_dt;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getCbamt(){
		return this.cbamt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getFrom_fisc_dt(){
		return this.from_fisc_dt;
	}

	public String getTo_fisc_dt(){
		return this.to_fisc_dt;
	}
}

/* �ۼ��ð� : Tue Sep 15 16:08:12 KST 2009 */