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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_1008_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String medi_cd;
	public String medi_nm;
	public String ecnt;
	public String ledt_cd;
	public String ledt_nm;
	public String seq;
	public String last_side;
	public String rmsg_tm;
	public String prt_bgn_tm;
	public String prt_end_tm;
	public String prt_qty;
	public String out_gate;
	public String apcut_err;
	public String runcut_err;
	public String remk;

	public PR_PAPMAKE_1008_LCURLIST1Record(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setLedt_cd(String ledt_cd){
		this.ledt_cd = ledt_cd;
	}

	public void setLedt_nm(String ledt_nm){
		this.ledt_nm = ledt_nm;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setLast_side(String last_side){
		this.last_side = last_side;
	}

	public void setRmsg_tm(String rmsg_tm){
		this.rmsg_tm = rmsg_tm;
	}

	public void setPrt_bgn_tm(String prt_bgn_tm){
		this.prt_bgn_tm = prt_bgn_tm;
	}

	public void setPrt_end_tm(String prt_end_tm){
		this.prt_end_tm = prt_end_tm;
	}

	public void setPrt_qty(String prt_qty){
		this.prt_qty = prt_qty;
	}

	public void setOut_gate(String out_gate){
		this.out_gate = out_gate;
	}

	public void setApcut_err(String apcut_err){
		this.apcut_err = apcut_err;
	}

	public void setRuncut_err(String runcut_err){
		this.runcut_err = runcut_err;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getLedt_cd(){
		return this.ledt_cd;
	}

	public String getLedt_nm(){
		return this.ledt_nm;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getLast_side(){
		return this.last_side;
	}

	public String getRmsg_tm(){
		return this.rmsg_tm;
	}

	public String getPrt_bgn_tm(){
		return this.prt_bgn_tm;
	}

	public String getPrt_end_tm(){
		return this.prt_end_tm;
	}

	public String getPrt_qty(){
		return this.prt_qty;
	}

	public String getOut_gate(){
		return this.out_gate;
	}

	public String getApcut_err(){
		return this.apcut_err;
	}

	public String getRuncut_err(){
		return this.runcut_err;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Fri Jul 17 20:43:42 KST 2009 */