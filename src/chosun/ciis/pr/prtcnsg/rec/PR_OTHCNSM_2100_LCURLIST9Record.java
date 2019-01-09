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


package chosun.ciis.pr.prtcnsg.rec;

import java.sql.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

/**
 * 
 */


public class PR_OTHCNSM_2100_LCURLIST9Record extends java.lang.Object implements java.io.Serializable{

	public String ink_matr;
	public String matr_nm;
	public String ink_uprc;
	public String qunt;
	public String ink_fee;
	public String occr_dt;
	public String seq;
	public String sub_seq;

	public PR_OTHCNSM_2100_LCURLIST9Record(){}

	public void setInk_matr(String ink_matr){
		this.ink_matr = ink_matr;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setInk_uprc(String ink_uprc){
		this.ink_uprc = ink_uprc;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setInk_fee(String ink_fee){
		this.ink_fee = ink_fee;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public String getInk_matr(){
		return this.ink_matr;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getInk_uprc(){
		return this.ink_uprc;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getInk_fee(){
		return this.ink_fee;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}
}

/* 작성시간 : Tue Oct 06 11:16:41 KST 2009 */