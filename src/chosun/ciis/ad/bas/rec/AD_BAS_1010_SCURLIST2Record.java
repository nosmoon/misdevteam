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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1010_SCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String dlco_info;
	public String chrg_pers;
	public String insrt_dt;

	public AD_BAS_1010_SCURLIST2Record(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDlco_info(String dlco_info){
		this.dlco_info = dlco_info;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setInsrt_dt(String insrt_dt){
		this.insrt_dt = insrt_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDlco_info(){
		return this.dlco_info;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getInsrt_dt(){
		return this.insrt_dt;
	}
}

/* �ۼ��ð� : Wed Jan 22 15:49:02 KST 2014 */