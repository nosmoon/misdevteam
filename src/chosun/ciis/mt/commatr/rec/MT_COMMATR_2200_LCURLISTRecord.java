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


public class MT_COMMATR_2200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String uprc_meda_dt;
	public String dlco_eps_no;
	public String matr_cd;
	public String purc_uprc;

	public MT_COMMATR_2200_LCURLISTRecord(){}

	public void setUprc_meda_dt(String uprc_meda_dt){
		this.uprc_meda_dt = uprc_meda_dt;
	}

	public void setDlco_eps_no(String dlco_eps_no){
		this.dlco_eps_no = dlco_eps_no;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public String getUprc_meda_dt(){
		return this.uprc_meda_dt;
	}

	public String getDlco_eps_no(){
		return this.dlco_eps_no;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}
}

/* �ۼ��ð� : Tue Jul 07 21:17:21 KST 2009 */