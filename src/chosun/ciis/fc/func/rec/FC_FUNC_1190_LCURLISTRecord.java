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


package chosun.ciis.fc.func.rec;

import java.sql.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.ds.*;

/**
 * 
 */


public class FC_FUNC_1190_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String pcheegbnm;
	public String nbn_no;
	public String note_amt;
	public String rcpay_amt;
	public String dhon_occr_dt;
	public String pchbudosayunm;
	public String slip_no;
	public String pchjpgbnm;
	public String dlco;
	public String pch_compnm;
	public String mtry_dt;
	public String issu_pers_nm;
	public String pcheestnm;
	public String note_clsf_cd;
	public String pch_eegbnm;
	public String note_no;
	public String bank_cd;
	public String note_seq;
	public String dhon_resn_cd;
	public String pch_budosayunm;
	public String slip_clsf_cd;
	public String pch_jpgbnm;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String now_note_stat_cd;
	public String pch_eestnm;
	public String daesonamt;

	public FC_FUNC_1190_LCURLISTRecord(){}

	public void setPcheegbnm(String pcheegbnm){
		this.pcheegbnm = pcheegbnm;
	}

	public void setNbn_no(String nbn_no){
		this.nbn_no = nbn_no;
	}

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setDhon_occr_dt(String dhon_occr_dt){
		this.dhon_occr_dt = dhon_occr_dt;
	}

	public void setPchbudosayunm(String pchbudosayunm){
		this.pchbudosayunm = pchbudosayunm;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setPchjpgbnm(String pchjpgbnm){
		this.pchjpgbnm = pchjpgbnm;
	}

	public void setDlco(String dlco){
		this.dlco = dlco;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setIssu_pers_nm(String issu_pers_nm){
		this.issu_pers_nm = issu_pers_nm;
	}

	public void setPcheestnm(String pcheestnm){
		this.pcheestnm = pcheestnm;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setPch_eegbnm(String pch_eegbnm){
		this.pch_eegbnm = pch_eegbnm;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setDhon_resn_cd(String dhon_resn_cd){
		this.dhon_resn_cd = dhon_resn_cd;
	}

	public void setPch_budosayunm(String pch_budosayunm){
		this.pch_budosayunm = pch_budosayunm;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setPch_jpgbnm(String pch_jpgbnm){
		this.pch_jpgbnm = pch_jpgbnm;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setNow_note_stat_cd(String now_note_stat_cd){
		this.now_note_stat_cd = now_note_stat_cd;
	}

	public void setPch_eestnm(String pch_eestnm){
		this.pch_eestnm = pch_eestnm;
	}

	public void setDaesonamt(String daesonamt){
		this.daesonamt = daesonamt;
	}

	public String getPcheegbnm(){
		return this.pcheegbnm;
	}

	public String getNbn_no(){
		return this.nbn_no;
	}

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getDhon_occr_dt(){
		return this.dhon_occr_dt;
	}

	public String getPchbudosayunm(){
		return this.pchbudosayunm;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getPchjpgbnm(){
		return this.pchjpgbnm;
	}

	public String getDlco(){
		return this.dlco;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getIssu_pers_nm(){
		return this.issu_pers_nm;
	}

	public String getPcheestnm(){
		return this.pcheestnm;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getPch_eegbnm(){
		return this.pch_eegbnm;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getDhon_resn_cd(){
		return this.dhon_resn_cd;
	}

	public String getPch_budosayunm(){
		return this.pch_budosayunm;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getPch_jpgbnm(){
		return this.pch_jpgbnm;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getNow_note_stat_cd(){
		return this.now_note_stat_cd;
	}

	public String getPch_eestnm(){
		return this.pch_eestnm;
	}

	public String getDaesonamt(){
		return this.daesonamt;
	}
}

/* 작성시간 : Fri Mar 27 20:05:29 KST 2009 */