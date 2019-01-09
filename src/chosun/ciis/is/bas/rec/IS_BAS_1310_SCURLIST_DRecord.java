/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.is.bas.rec;

import java.sql.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;

/**
 * 
 */


public class IS_BAS_1310_SCURLIST_DRecord extends java.lang.Object implements java.io.Serializable{

	public String d_cmpy_cd;
	public String d_dlco_clsf;
	public String d_dlco_cd;
	public String d_dlco_seq;
	public String d_intn_tel_seq;
	public String d_estb_dt;
	public String d_mang_no;
	public String d_tel_no;
	public String d_use_yn;
	public String d_remk;
	public String d_chg_dt_tm;

	public IS_BAS_1310_SCURLIST_DRecord(){}

	public void setD_cmpy_cd(String d_cmpy_cd){
		this.d_cmpy_cd = d_cmpy_cd;
	}

	public void setD_dlco_clsf(String d_dlco_clsf){
		this.d_dlco_clsf = d_dlco_clsf;
	}

	public void setD_dlco_cd(String d_dlco_cd){
		this.d_dlco_cd = d_dlco_cd;
	}

	public void setD_dlco_seq(String d_dlco_seq){
		this.d_dlco_seq = d_dlco_seq;
	}

	public void setD_intn_tel_seq(String d_intn_tel_seq){
		this.d_intn_tel_seq = d_intn_tel_seq;
	}

	public void setD_estb_dt(String d_estb_dt){
		this.d_estb_dt = d_estb_dt;
	}

	public void setD_mang_no(String d_mang_no){
		this.d_mang_no = d_mang_no;
	}

	public void setD_tel_no(String d_tel_no){
		this.d_tel_no = d_tel_no;
	}

	public void setD_use_yn(String d_use_yn){
		this.d_use_yn = d_use_yn;
	}

	public void setD_remk(String d_remk){
		this.d_remk = d_remk;
	}

	public void setD_chg_dt_tm(String d_chg_dt_tm){
		this.d_chg_dt_tm = d_chg_dt_tm;
	}

	public String getD_cmpy_cd(){
		return this.d_cmpy_cd;
	}

	public String getD_dlco_clsf(){
		return this.d_dlco_clsf;
	}

	public String getD_dlco_cd(){
		return this.d_dlco_cd;
	}

	public String getD_dlco_seq(){
		return this.d_dlco_seq;
	}

	public String getD_intn_tel_seq(){
		return this.d_intn_tel_seq;
	}

	public String getD_estb_dt(){
		return this.d_estb_dt;
	}

	public String getD_mang_no(){
		return this.d_mang_no;
	}

	public String getD_tel_no(){
		return this.d_tel_no;
	}

	public String getD_use_yn(){
		return this.d_use_yn;
	}

	public String getD_remk(){
		return this.d_remk;
	}

	public String getD_chg_dt_tm(){
		return this.d_chg_dt_tm;
	}
}

/* 작성시간 : Mon May 21 14:51:43 KST 2012 */