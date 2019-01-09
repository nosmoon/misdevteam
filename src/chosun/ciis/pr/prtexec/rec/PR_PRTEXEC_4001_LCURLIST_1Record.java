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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_4001_LCURLIST_1Record extends java.lang.Object implements java.io.Serializable{

	public String issu_dt;
	public String add_prt_seq;
	public String prt_dt;
	public String prt_tm;
	public String std;
	public String dual_out_nm;
	public String tm_in_yn;
	public String remk;
	public String add_prt_cnt;
	public String rdata;
	public String pcnt;
	public String clr_pcnt;

	public PR_PRTEXEC_4001_LCURLIST_1Record(){}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setAdd_prt_seq(String add_prt_seq){
		this.add_prt_seq = add_prt_seq;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setPrt_tm(String prt_tm){
		this.prt_tm = prt_tm;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setDual_out_nm(String dual_out_nm){
		this.dual_out_nm = dual_out_nm;
	}

	public void setTm_in_yn(String tm_in_yn){
		this.tm_in_yn = tm_in_yn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setAdd_prt_cnt(String add_prt_cnt){
		this.add_prt_cnt = add_prt_cnt;
	}

	public void setRdata(String rdata){
		this.rdata = rdata;
	}

	public void setPcnt(String pcnt){
		this.pcnt = pcnt;
	}

	public void setClr_pcnt(String clr_pcnt){
		this.clr_pcnt = clr_pcnt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getAdd_prt_seq(){
		return this.add_prt_seq;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getPrt_tm(){
		return this.prt_tm;
	}

	public String getStd(){
		return this.std;
	}

	public String getDual_out_nm(){
		return this.dual_out_nm;
	}

	public String getTm_in_yn(){
		return this.tm_in_yn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getAdd_prt_cnt(){
		return this.add_prt_cnt;
	}

	public String getRdata(){
		return this.rdata;
	}

	public String getPcnt(){
		return this.pcnt;
	}

	public String getClr_pcnt(){
		return this.clr_pcnt;
	}
}

/* 작성시간 : Sat May 09 15:45:57 KST 2009 */