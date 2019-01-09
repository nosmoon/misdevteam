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


public class MT_PRNPAP_3407_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String hdqt_paper_clsf;
	public String prt_dt;
	public String issu_dt;
	public String medi_cd;
	public String sect_cd;
	public String pap_std;
	public String issu_pcnt;
	public String slip_qty;
	public String papcmpy_cd;
	public String matr_cd_a;
	public String use_qunt_a;
	public String matr_cd_b;
	public String use_qunt_b;
	public String matr_cd_c;
	public String use_qunt_c;
	public String use_qunt_tot;

	public MT_PRNPAP_3407_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setHdqt_paper_clsf(String hdqt_paper_clsf){
		this.hdqt_paper_clsf = hdqt_paper_clsf;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
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

	public void setPap_std(String pap_std){
		this.pap_std = pap_std;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setMatr_cd_a(String matr_cd_a){
		this.matr_cd_a = matr_cd_a;
	}

	public void setUse_qunt_a(String use_qunt_a){
		this.use_qunt_a = use_qunt_a;
	}

	public void setMatr_cd_b(String matr_cd_b){
		this.matr_cd_b = matr_cd_b;
	}

	public void setUse_qunt_b(String use_qunt_b){
		this.use_qunt_b = use_qunt_b;
	}

	public void setMatr_cd_c(String matr_cd_c){
		this.matr_cd_c = matr_cd_c;
	}

	public void setUse_qunt_c(String use_qunt_c){
		this.use_qunt_c = use_qunt_c;
	}

	public void setUse_qunt_tot(String use_qunt_tot){
		this.use_qunt_tot = use_qunt_tot;
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

	public String getHdqt_paper_clsf(){
		return this.hdqt_paper_clsf;
	}

	public String getPrt_dt(){
		return this.prt_dt;
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

	public String getPap_std(){
		return this.pap_std;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getMatr_cd_a(){
		return this.matr_cd_a;
	}

	public String getUse_qunt_a(){
		return this.use_qunt_a;
	}

	public String getMatr_cd_b(){
		return this.matr_cd_b;
	}

	public String getUse_qunt_b(){
		return this.use_qunt_b;
	}

	public String getMatr_cd_c(){
		return this.matr_cd_c;
	}

	public String getUse_qunt_c(){
		return this.use_qunt_c;
	}

	public String getUse_qunt_tot(){
		return this.use_qunt_tot;
	}
}

/* 작성시간 : Wed Aug 19 23:57:37 KST 2009 */