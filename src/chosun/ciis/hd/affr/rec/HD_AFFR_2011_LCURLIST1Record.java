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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_2011_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String child_flnm;
	public String child_seqo;
	public String child_bidt;
	public String sply_strt_yymm;
	public String last_sply_yymm;
	public String acml_sply_tms;
	public String sply_amt;
	public String ch_occr_dt;
	public String ch_seq;

	public HD_AFFR_2011_LCURLIST1Record(){}

	public void setChild_flnm(String child_flnm){
		this.child_flnm = child_flnm;
	}

	public void setChild_seqo(String child_seqo){
		this.child_seqo = child_seqo;
	}

	public void setChild_bidt(String child_bidt){
		this.child_bidt = child_bidt;
	}

	public void setSply_strt_yymm(String sply_strt_yymm){
		this.sply_strt_yymm = sply_strt_yymm;
	}

	public void setLast_sply_yymm(String last_sply_yymm){
		this.last_sply_yymm = last_sply_yymm;
	}

	public void setAcml_sply_tms(String acml_sply_tms){
		this.acml_sply_tms = acml_sply_tms;
	}

	public void setSply_amt(String sply_amt){
		this.sply_amt = sply_amt;
	}

	public void setCh_occr_dt(String ch_occr_dt){
		this.ch_occr_dt = ch_occr_dt;
	}

	public void setCh_seq(String ch_seq){
		this.ch_seq = ch_seq;
	}

	public String getChild_flnm(){
		return this.child_flnm;
	}

	public String getChild_seqo(){
		return this.child_seqo;
	}

	public String getChild_bidt(){
		return this.child_bidt;
	}

	public String getSply_strt_yymm(){
		return this.sply_strt_yymm;
	}

	public String getLast_sply_yymm(){
		return this.last_sply_yymm;
	}

	public String getAcml_sply_tms(){
		return this.acml_sply_tms;
	}

	public String getSply_amt(){
		return this.sply_amt;
	}

	public String getCh_occr_dt(){
		return this.ch_occr_dt;
	}

	public String getCh_seq(){
		return this.ch_seq;
	}
}

/* 작성시간 : Wed Jun 03 14:06:34 KST 2009 */