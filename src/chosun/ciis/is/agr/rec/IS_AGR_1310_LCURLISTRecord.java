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


package chosun.ciis.is.agr.rec;

import java.sql.*;
import chosun.ciis.is.agr.dm.*;
import chosun.ciis.is.agr.ds.*;

/**
 * 
 */


public class IS_AGR_1310_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_clsf_cd_seq;
	public String dlco_nm;
	public String scat_dt_fr;
	public String scat_dt_to;

	public IS_AGR_1310_LCURLISTRecord(){}

	public void setDlco_clsf_cd_seq(String dlco_clsf_cd_seq){
		this.dlco_clsf_cd_seq = dlco_clsf_cd_seq;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setScat_dt_fr(String scat_dt_fr){
		this.scat_dt_fr = scat_dt_fr;
	}

	public void setScat_dt_to(String scat_dt_to){
		this.scat_dt_to = scat_dt_to;
	}

	public String getDlco_clsf_cd_seq(){
		return this.dlco_clsf_cd_seq;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getScat_dt_fr(){
		return this.scat_dt_fr;
	}

	public String getScat_dt_to(){
		return this.scat_dt_to;
	}
}

/* �ۼ��ð� : Wed May 23 11:45:12 KST 2012 */