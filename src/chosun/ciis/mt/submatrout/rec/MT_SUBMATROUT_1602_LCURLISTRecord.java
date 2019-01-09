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


package chosun.ciis.mt.submatrout.rec;

import java.sql.*;
import chosun.ciis.mt.submatrout.dm.*;
import chosun.ciis.mt.submatrout.ds.*;

/**
 * 
 */


public class MT_SUBMATROUT_1602_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String matr_nm;
	public String qunt;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String matr_cd;
	public String medi_cd;
	public String sect_cd;

	public MT_SUBMATROUT_1602_LCURLISTRecord(){}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
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

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getQunt(){
		return this.qunt;
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

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}
}

/* 작성시간 : Mon Sep 21 22:13:05 KST 2009 */