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


package chosun.ciis.is.sal.rec;

import java.sql.*;
import chosun.ciis.is.sal.dm.*;
import chosun.ciis.is.sal.ds.*;

/**
 * 
 */


public class IS_SAL_1130_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String purc_reg_dt;
	public String purc_reg_seq;
	public String acwr_reg_dt;
	public String acwr_reg_seq;
	public String purc_clsf;
	public String purc_clsf_nm;
	public String purc_dt;
	public String uprc;
	public String qunt;
	public String purc_amt;
	public String trc_yn;
	public String send_yn;
	public String remk;
	public String adjm_yn;
	public String purc_adjm_reg_dt;
	public String purc_adjm_reg_seq;

	public IS_SAL_1130_SCURLISTRecord(){}

	public void setPurc_reg_dt(String purc_reg_dt){
		this.purc_reg_dt = purc_reg_dt;
	}

	public void setPurc_reg_seq(String purc_reg_seq){
		this.purc_reg_seq = purc_reg_seq;
	}

	public void setAcwr_reg_dt(String acwr_reg_dt){
		this.acwr_reg_dt = acwr_reg_dt;
	}

	public void setAcwr_reg_seq(String acwr_reg_seq){
		this.acwr_reg_seq = acwr_reg_seq;
	}

	public void setPurc_clsf(String purc_clsf){
		this.purc_clsf = purc_clsf;
	}

	public void setPurc_clsf_nm(String purc_clsf_nm){
		this.purc_clsf_nm = purc_clsf_nm;
	}

	public void setPurc_dt(String purc_dt){
		this.purc_dt = purc_dt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setPurc_amt(String purc_amt){
		this.purc_amt = purc_amt;
	}

	public void setTrc_yn(String trc_yn){
		this.trc_yn = trc_yn;
	}

	public void setSend_yn(String send_yn){
		this.send_yn = send_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAdjm_yn(String adjm_yn){
		this.adjm_yn = adjm_yn;
	}

	public void setPurc_adjm_reg_dt(String purc_adjm_reg_dt){
		this.purc_adjm_reg_dt = purc_adjm_reg_dt;
	}

	public void setPurc_adjm_reg_seq(String purc_adjm_reg_seq){
		this.purc_adjm_reg_seq = purc_adjm_reg_seq;
	}

	public String getPurc_reg_dt(){
		return this.purc_reg_dt;
	}

	public String getPurc_reg_seq(){
		return this.purc_reg_seq;
	}

	public String getAcwr_reg_dt(){
		return this.acwr_reg_dt;
	}

	public String getAcwr_reg_seq(){
		return this.acwr_reg_seq;
	}

	public String getPurc_clsf(){
		return this.purc_clsf;
	}

	public String getPurc_clsf_nm(){
		return this.purc_clsf_nm;
	}

	public String getPurc_dt(){
		return this.purc_dt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getPurc_amt(){
		return this.purc_amt;
	}

	public String getTrc_yn(){
		return this.trc_yn;
	}

	public String getSend_yn(){
		return this.send_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAdjm_yn(){
		return this.adjm_yn;
	}

	public String getPurc_adjm_reg_dt(){
		return this.purc_adjm_reg_dt;
	}

	public String getPurc_adjm_reg_seq(){
		return this.purc_adjm_reg_seq;
	}
}

/* 작성시간 : Fri May 11 15:39:58 KST 2012 */