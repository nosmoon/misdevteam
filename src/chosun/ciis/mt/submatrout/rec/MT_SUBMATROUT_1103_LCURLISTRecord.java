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


public class MT_SUBMATROUT_1103_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String owh_dt;
	public String seqq;
	public String fac_clsf;
	public String clos_clsf;
	public String owh_title;
	public String owh_clsf;

	public MT_SUBMATROUT_1103_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setOwh_dt(String owh_dt){
		this.owh_dt = owh_dt;
	}

	public void setSeqq(String seqq){
		this.seqq = seqq;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public void setOwh_title(String owh_title){
		this.owh_title = owh_title;
	}

	public void setOwh_clsf(String owh_clsf){
		this.owh_clsf = owh_clsf;
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

	public String getOwh_dt(){
		return this.owh_dt;
	}

	public String getSeqq(){
		return this.seqq;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getOwh_title(){
		return this.owh_title;
	}

	public String getOwh_clsf(){
		return this.owh_clsf;
	}
}

/* 작성시간 : Mon Sep 07 13:23:13 KST 2009 */