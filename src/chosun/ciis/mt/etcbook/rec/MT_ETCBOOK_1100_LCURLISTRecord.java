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


package chosun.ciis.mt.etcbook.rec;

import java.sql.*;
import chosun.ciis.mt.etcbook.dm.*;
import chosun.ciis.mt.etcbook.ds.*;

/**
 * 
 */


public class MT_ETCBOOK_1100_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ck;
	public String clam_dt;
	public String draft_deptnm;
	public String subs_frdt;
	public String sbend_dt;
	public String book_cd;
	public String book_nm;
	public int qty;
	public int uprc_won;
	public String curc_clsf;
	public int uprc_frex;
	public String dlvs_plac;
	public String dlvs_dt;
	public String occr_dt;
	public String seq;
	public String dept_cd;
	public String aplc_dt;
	public String extd_dt;
	public String remk;
	public String buy_plac_clsf;
	public String istt_hdqt_yn;

	public MT_ETCBOOK_1100_LCURLISTRecord(){}

	public void setCk(String ck){
		this.ck = ck;
	}

	public void setClam_dt(String clam_dt){
		this.clam_dt = clam_dt;
	}

	public void setDraft_deptnm(String draft_deptnm){
		this.draft_deptnm = draft_deptnm;
	}

	public void setSubs_frdt(String subs_frdt){
		this.subs_frdt = subs_frdt;
	}

	public void setSbend_dt(String sbend_dt){
		this.sbend_dt = sbend_dt;
	}

	public void setBook_cd(String book_cd){
		this.book_cd = book_cd;
	}

	public void setBook_nm(String book_nm){
		this.book_nm = book_nm;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setUprc_won(int uprc_won){
		this.uprc_won = uprc_won;
	}

	public void setCurc_clsf(String curc_clsf){
		this.curc_clsf = curc_clsf;
	}

	public void setUprc_frex(int uprc_frex){
		this.uprc_frex = uprc_frex;
	}

	public void setDlvs_plac(String dlvs_plac){
		this.dlvs_plac = dlvs_plac;
	}

	public void setDlvs_dt(String dlvs_dt){
		this.dlvs_dt = dlvs_dt;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setExtd_dt(String extd_dt){
		this.extd_dt = extd_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setBuy_plac_clsf(String buy_plac_clsf){
		this.buy_plac_clsf = buy_plac_clsf;
	}

	public void setIstt_hdqt_yn(String istt_hdqt_yn){
		this.istt_hdqt_yn = istt_hdqt_yn;
	}

	public String getCk(){
		return this.ck;
	}

	public String getClam_dt(){
		return this.clam_dt;
	}

	public String getDraft_deptnm(){
		return this.draft_deptnm;
	}

	public String getSubs_frdt(){
		return this.subs_frdt;
	}

	public String getSbend_dt(){
		return this.sbend_dt;
	}

	public String getBook_cd(){
		return this.book_cd;
	}

	public String getBook_nm(){
		return this.book_nm;
	}

	public int getQty(){
		return this.qty;
	}

	public int getUprc_won(){
		return this.uprc_won;
	}

	public String getCurc_clsf(){
		return this.curc_clsf;
	}

	public int getUprc_frex(){
		return this.uprc_frex;
	}

	public String getDlvs_plac(){
		return this.dlvs_plac;
	}

	public String getDlvs_dt(){
		return this.dlvs_dt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getExtd_dt(){
		return this.extd_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getBuy_plac_clsf(){
		return this.buy_plac_clsf;
	}

	public String getIstt_hdqt_yn(){
		return this.istt_hdqt_yn;
	}
}

/* 작성시간 : Thu Jul 02 17:16:18 KST 2009 */