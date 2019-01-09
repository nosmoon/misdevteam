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


package chosun.ciis.pl.bas.rec;

import java.sql.*;
import chosun.ciis.pl.bas.dm.*;
import chosun.ciis.pl.bas.ds.*;

/**
 * 
 */


public class PL_BAS_1220_LCOLTLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String dlco_seq;
	public String colt_seq;
	public String colt_clsf;
	public String setup_stat;
	public String colt_obj_nm;
	public String prty_rank;
	public String acqr_dt;
	public String colt_setup_amt;
	public String pub_ann_amt;
	public String plcw;
	public String gurt_strt_dd;
	public String gurt_end_dd;
	public String insr_stock_no;
	public String remk;

	public PL_BAS_1220_LCOLTLISTRecord(){}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_seq(String dlco_seq){
		this.dlco_seq = dlco_seq;
	}

	public void setColt_seq(String colt_seq){
		this.colt_seq = colt_seq;
	}

	public void setColt_clsf(String colt_clsf){
		this.colt_clsf = colt_clsf;
	}

	public void setSetup_stat(String setup_stat){
		this.setup_stat = setup_stat;
	}

	public void setColt_obj_nm(String colt_obj_nm){
		this.colt_obj_nm = colt_obj_nm;
	}

	public void setPrty_rank(String prty_rank){
		this.prty_rank = prty_rank;
	}

	public void setAcqr_dt(String acqr_dt){
		this.acqr_dt = acqr_dt;
	}

	public void setColt_setup_amt(String colt_setup_amt){
		this.colt_setup_amt = colt_setup_amt;
	}

	public void setPub_ann_amt(String pub_ann_amt){
		this.pub_ann_amt = pub_ann_amt;
	}

	public void setPlcw(String plcw){
		this.plcw = plcw;
	}

	public void setGurt_strt_dd(String gurt_strt_dd){
		this.gurt_strt_dd = gurt_strt_dd;
	}

	public void setGurt_end_dd(String gurt_end_dd){
		this.gurt_end_dd = gurt_end_dd;
	}

	public void setInsr_stock_no(String insr_stock_no){
		this.insr_stock_no = insr_stock_no;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_seq(){
		return this.dlco_seq;
	}

	public String getColt_seq(){
		return this.colt_seq;
	}

	public String getColt_clsf(){
		return this.colt_clsf;
	}

	public String getSetup_stat(){
		return this.setup_stat;
	}

	public String getColt_obj_nm(){
		return this.colt_obj_nm;
	}

	public String getPrty_rank(){
		return this.prty_rank;
	}

	public String getAcqr_dt(){
		return this.acqr_dt;
	}

	public String getColt_setup_amt(){
		return this.colt_setup_amt;
	}

	public String getPub_ann_amt(){
		return this.pub_ann_amt;
	}

	public String getPlcw(){
		return this.plcw;
	}

	public String getGurt_strt_dd(){
		return this.gurt_strt_dd;
	}

	public String getGurt_end_dd(){
		return this.gurt_end_dd;
	}

	public String getInsr_stock_no(){
		return this.insr_stock_no;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Apr 27 18:18:55 KST 2009 */