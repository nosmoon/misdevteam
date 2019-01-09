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


public class IS_BAS_1310_SCURLIST_CRecord extends java.lang.Object implements java.io.Serializable{

	public String c_cmpy_cd;
	public String c_dlco_clsf;
	public String c_dlco_cd;
	public String c_dlco_seq;
	public String c_giro_seq;
	public String c_giro_no;
	public String c_giro_clsf;
	public String c_aprv_no;
	public String c_dnmn_pers;
	public String c_bank_no;
	public String c_acct_no;
	public String c_deps_pers;
	public String c_open_dt;
	public String c_cdatmaplc_dt;
	public String c_cdatmaprv_dt;
	public String c_cdatmacpn_dt;
	public String c_chg_pers;
	public String c_chg_dt_tm;

	public IS_BAS_1310_SCURLIST_CRecord(){}

	public void setC_cmpy_cd(String c_cmpy_cd){
		this.c_cmpy_cd = c_cmpy_cd;
	}

	public void setC_dlco_clsf(String c_dlco_clsf){
		this.c_dlco_clsf = c_dlco_clsf;
	}

	public void setC_dlco_cd(String c_dlco_cd){
		this.c_dlco_cd = c_dlco_cd;
	}

	public void setC_dlco_seq(String c_dlco_seq){
		this.c_dlco_seq = c_dlco_seq;
	}

	public void setC_giro_seq(String c_giro_seq){
		this.c_giro_seq = c_giro_seq;
	}

	public void setC_giro_no(String c_giro_no){
		this.c_giro_no = c_giro_no;
	}

	public void setC_giro_clsf(String c_giro_clsf){
		this.c_giro_clsf = c_giro_clsf;
	}

	public void setC_aprv_no(String c_aprv_no){
		this.c_aprv_no = c_aprv_no;
	}

	public void setC_dnmn_pers(String c_dnmn_pers){
		this.c_dnmn_pers = c_dnmn_pers;
	}

	public void setC_bank_no(String c_bank_no){
		this.c_bank_no = c_bank_no;
	}

	public void setC_acct_no(String c_acct_no){
		this.c_acct_no = c_acct_no;
	}

	public void setC_deps_pers(String c_deps_pers){
		this.c_deps_pers = c_deps_pers;
	}

	public void setC_open_dt(String c_open_dt){
		this.c_open_dt = c_open_dt;
	}

	public void setC_cdatmaplc_dt(String c_cdatmaplc_dt){
		this.c_cdatmaplc_dt = c_cdatmaplc_dt;
	}

	public void setC_cdatmaprv_dt(String c_cdatmaprv_dt){
		this.c_cdatmaprv_dt = c_cdatmaprv_dt;
	}

	public void setC_cdatmacpn_dt(String c_cdatmacpn_dt){
		this.c_cdatmacpn_dt = c_cdatmacpn_dt;
	}

	public void setC_chg_pers(String c_chg_pers){
		this.c_chg_pers = c_chg_pers;
	}

	public void setC_chg_dt_tm(String c_chg_dt_tm){
		this.c_chg_dt_tm = c_chg_dt_tm;
	}

	public String getC_cmpy_cd(){
		return this.c_cmpy_cd;
	}

	public String getC_dlco_clsf(){
		return this.c_dlco_clsf;
	}

	public String getC_dlco_cd(){
		return this.c_dlco_cd;
	}

	public String getC_dlco_seq(){
		return this.c_dlco_seq;
	}

	public String getC_giro_seq(){
		return this.c_giro_seq;
	}

	public String getC_giro_no(){
		return this.c_giro_no;
	}

	public String getC_giro_clsf(){
		return this.c_giro_clsf;
	}

	public String getC_aprv_no(){
		return this.c_aprv_no;
	}

	public String getC_dnmn_pers(){
		return this.c_dnmn_pers;
	}

	public String getC_bank_no(){
		return this.c_bank_no;
	}

	public String getC_acct_no(){
		return this.c_acct_no;
	}

	public String getC_deps_pers(){
		return this.c_deps_pers;
	}

	public String getC_open_dt(){
		return this.c_open_dt;
	}

	public String getC_cdatmaplc_dt(){
		return this.c_cdatmaplc_dt;
	}

	public String getC_cdatmaprv_dt(){
		return this.c_cdatmaprv_dt;
	}

	public String getC_cdatmacpn_dt(){
		return this.c_cdatmacpn_dt;
	}

	public String getC_chg_pers(){
		return this.c_chg_pers;
	}

	public String getC_chg_dt_tm(){
		return this.c_chg_dt_tm;
	}
}

/* 작성시간 : Mon May 21 14:51:43 KST 2012 */