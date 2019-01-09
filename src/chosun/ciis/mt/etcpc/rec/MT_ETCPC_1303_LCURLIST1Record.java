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


package chosun.ciis.mt.etcpc.rec;

import java.sql.*;
import chosun.ciis.mt.etcpc.dm.*;
import chosun.ciis.mt.etcpc.ds.*;

/**
 * 
 */


public class MT_ETCPC_1303_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String modl_nm;
	public String buy_dt;
	public String use_usag;
	public String use_usag_nm;
	public int buy_cnt;
	public String draft_deptcd;
	public String draft_deptnm;
	public String draft_no;
	public String nocompen_mant_frdt;
	public String nocompen_mant_todt;
	public String compen_mant_frdt;
	public String compen_mant_todt;
	public String compen_mant_cmpy;
	public String modl_mang_no;
	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String use_term;
	public String draft_kind;

	public MT_ETCPC_1303_LCURLIST1Record(){}

	public void setModl_nm(String modl_nm){
		this.modl_nm = modl_nm;
	}

	public void setBuy_dt(String buy_dt){
		this.buy_dt = buy_dt;
	}

	public void setUse_usag(String use_usag){
		this.use_usag = use_usag;
	}

	public void setUse_usag_nm(String use_usag_nm){
		this.use_usag_nm = use_usag_nm;
	}

	public void setBuy_cnt(int buy_cnt){
		this.buy_cnt = buy_cnt;
	}

	public void setDraft_deptcd(String draft_deptcd){
		this.draft_deptcd = draft_deptcd;
	}

	public void setDraft_deptnm(String draft_deptnm){
		this.draft_deptnm = draft_deptnm;
	}

	public void setDraft_no(String draft_no){
		this.draft_no = draft_no;
	}

	public void setNocompen_mant_frdt(String nocompen_mant_frdt){
		this.nocompen_mant_frdt = nocompen_mant_frdt;
	}

	public void setNocompen_mant_todt(String nocompen_mant_todt){
		this.nocompen_mant_todt = nocompen_mant_todt;
	}

	public void setCompen_mant_frdt(String compen_mant_frdt){
		this.compen_mant_frdt = compen_mant_frdt;
	}

	public void setCompen_mant_todt(String compen_mant_todt){
		this.compen_mant_todt = compen_mant_todt;
	}

	public void setCompen_mant_cmpy(String compen_mant_cmpy){
		this.compen_mant_cmpy = compen_mant_cmpy;
	}

	public void setModl_mang_no(String modl_mang_no){
		this.modl_mang_no = modl_mang_no;
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

	public void setUse_term(String use_term){
		this.use_term = use_term;
	}

	public void setDraft_kind(String draft_kind){
		this.draft_kind = draft_kind;
	}

	public String getModl_nm(){
		return this.modl_nm;
	}

	public String getBuy_dt(){
		return this.buy_dt;
	}

	public String getUse_usag(){
		return this.use_usag;
	}

	public String getUse_usag_nm(){
		return this.use_usag_nm;
	}

	public int getBuy_cnt(){
		return this.buy_cnt;
	}

	public String getDraft_deptcd(){
		return this.draft_deptcd;
	}

	public String getDraft_deptnm(){
		return this.draft_deptnm;
	}

	public String getDraft_no(){
		return this.draft_no;
	}

	public String getNocompen_mant_frdt(){
		return this.nocompen_mant_frdt;
	}

	public String getNocompen_mant_todt(){
		return this.nocompen_mant_todt;
	}

	public String getCompen_mant_frdt(){
		return this.compen_mant_frdt;
	}

	public String getCompen_mant_todt(){
		return this.compen_mant_todt;
	}

	public String getCompen_mant_cmpy(){
		return this.compen_mant_cmpy;
	}

	public String getModl_mang_no(){
		return this.modl_mang_no;
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

	public String getUse_term(){
		return this.use_term;
	}

	public String getDraft_kind(){
		return this.draft_kind;
	}
}

/* 작성시간 : Thu Mar 19 10:20:58 KST 2009 */