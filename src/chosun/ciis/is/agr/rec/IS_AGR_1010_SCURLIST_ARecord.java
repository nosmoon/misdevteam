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


public class IS_AGR_1010_SCURLIST_ARecord extends java.lang.Object implements java.io.Serializable{

	public String decid_pre_seq;
	public String decid_pers;
	public String decid_pers_nm;
	public String decid_pers_dty_cd;
	public String decid_pers_dty_cd_nm;
	public String decid_yn;
	public String aprv_step_yn;
	public String proc_dt;

	public IS_AGR_1010_SCURLIST_ARecord(){}

	public void setDecid_pre_seq(String decid_pre_seq){
		this.decid_pre_seq = decid_pre_seq;
	}

	public void setDecid_pers(String decid_pers){
		this.decid_pers = decid_pers;
	}

	public void setDecid_pers_nm(String decid_pers_nm){
		this.decid_pers_nm = decid_pers_nm;
	}

	public void setDecid_pers_dty_cd(String decid_pers_dty_cd){
		this.decid_pers_dty_cd = decid_pers_dty_cd;
	}

	public void setDecid_pers_dty_cd_nm(String decid_pers_dty_cd_nm){
		this.decid_pers_dty_cd_nm = decid_pers_dty_cd_nm;
	}

	public void setDecid_yn(String decid_yn){
		this.decid_yn = decid_yn;
	}

	public void setAprv_step_yn(String aprv_step_yn){
		this.aprv_step_yn = aprv_step_yn;
	}

	public void setProc_dt(String proc_dt){
		this.proc_dt = proc_dt;
	}

	public String getDecid_pre_seq(){
		return this.decid_pre_seq;
	}

	public String getDecid_pers(){
		return this.decid_pers;
	}

	public String getDecid_pers_nm(){
		return this.decid_pers_nm;
	}

	public String getDecid_pers_dty_cd(){
		return this.decid_pers_dty_cd;
	}

	public String getDecid_pers_dty_cd_nm(){
		return this.decid_pers_dty_cd_nm;
	}

	public String getDecid_yn(){
		return this.decid_yn;
	}

	public String getAprv_step_yn(){
		return this.aprv_step_yn;
	}

	public String getProc_dt(){
		return this.proc_dt;
	}
}

/* �ۼ��ð� : Thu Jul 26 13:21:22 KST 2012 */