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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1602_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String chg_dt;
	public String remk;
	public String draft_doc_no2;
	public String slip_no;

	public AS_ASET_1602_LCURLIST2Record(){}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setDraft_doc_no2(String draft_doc_no2){
		this.draft_doc_no2 = draft_doc_no2;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getDraft_doc_no2(){
		return this.draft_doc_no2;
	}

	public String getSlip_no(){
		return this.slip_no;
	}
}

/* �ۼ��ð� : Thu Mar 26 17:26:35 KST 2009 */