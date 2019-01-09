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


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_3400_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String prt_dt;
	public String fac_clsf;
	public String issu_dt;
	public String medi_cd;
	public String sect_cd;
	public String issu_pcnt;
	public String issu_qty;
	public String pj_qunt;
	public String pap_cmpy;
	public String paper_clsf_cd;
	public String matr_cd;
	public String cnsm_qunt;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;

	public MT_PRNPAP_3400_LCURLISTRecord(){}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setIssu_qty(String issu_qty){
		this.issu_qty = issu_qty;
	}

	public void setPj_qunt(String pj_qunt){
		this.pj_qunt = pj_qunt;
	}

	public void setPap_cmpy(String pap_cmpy){
		this.pap_cmpy = pap_cmpy;
	}

	public void setPaper_clsf_cd(String paper_clsf_cd){
		this.paper_clsf_cd = paper_clsf_cd;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setCnsm_qunt(String cnsm_qunt){
		this.cnsm_qunt = cnsm_qunt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getIssu_qty(){
		return this.issu_qty;
	}

	public String getPj_qunt(){
		return this.pj_qunt;
	}

	public String getPap_cmpy(){
		return this.pap_cmpy;
	}

	public String getPaper_clsf_cd(){
		return this.paper_clsf_cd;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getCnsm_qunt(){
		return this.cnsm_qunt;
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
}

/* 작성시간 : Wed Jun 24 15:39:17 KST 2009 */