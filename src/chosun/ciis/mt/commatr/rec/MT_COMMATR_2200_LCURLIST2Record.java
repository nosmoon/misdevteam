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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_2200_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String dlco_eps_no;
	public String uprc_meda_dt;

	public MT_COMMATR_2200_LCURLIST2Record(){}

	public void setDlco_eps_no(String dlco_eps_no){
		this.dlco_eps_no = dlco_eps_no;
	}

	public void setUprc_meda_dt(String uprc_meda_dt){
		this.uprc_meda_dt = uprc_meda_dt;
	}

	public String getDlco_eps_no(){
		return this.dlco_eps_no;
	}

	public String getUprc_meda_dt(){
		return this.uprc_meda_dt;
	}
}

/* �ۼ��ð� : Tue Jul 07 21:17:21 KST 2009 */