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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_2100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String uprc_meda_dt;
	public String dlco_eps_no;
	public String dlco_no;
	public String dlco_nm;
	public String matr_cd;
	public String matr_nm;
	public String purc_uprc;
	public String remk;
	public String setl_cond;

	public MT_COMMATR_2100_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setUprc_meda_dt(String uprc_meda_dt){
		this.uprc_meda_dt = uprc_meda_dt;
	}

	public void setDlco_eps_no(String dlco_eps_no){
		this.dlco_eps_no = dlco_eps_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setPurc_uprc(String purc_uprc){
		this.purc_uprc = purc_uprc;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setSetl_cond(String setl_cond){
		this.setl_cond = setl_cond;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getUprc_meda_dt(){
		return this.uprc_meda_dt;
	}

	public String getDlco_eps_no(){
		return this.dlco_eps_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getPurc_uprc(){
		return this.purc_uprc;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSetl_cond(){
		return this.setl_cond;
	}
}

/* 작성시간 : Fri Jul 10 19:13:59 KST 2009 */