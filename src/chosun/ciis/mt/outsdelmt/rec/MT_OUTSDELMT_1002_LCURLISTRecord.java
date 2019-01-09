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


package chosun.ciis.mt.outsdelmt.rec;

import java.sql.*;
import chosun.ciis.mt.outsdelmt.dm.*;
import chosun.ciis.mt.outsdelmt.ds.*;

/**
 * 
 */


public class MT_OUTSDELMT_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String aply_dt;
	public String outsd_elmt_clsf;
	public String outsd_elmt_cd;
	public String outsd_elmt_nm;
	public String unit;
	public String amt;

	public MT_OUTSDELMT_1002_LCURLISTRecord(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setOutsd_elmt_clsf(String outsd_elmt_clsf){
		this.outsd_elmt_clsf = outsd_elmt_clsf;
	}

	public void setOutsd_elmt_cd(String outsd_elmt_cd){
		this.outsd_elmt_cd = outsd_elmt_cd;
	}

	public void setOutsd_elmt_nm(String outsd_elmt_nm){
		this.outsd_elmt_nm = outsd_elmt_nm;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getOutsd_elmt_clsf(){
		return this.outsd_elmt_clsf;
	}

	public String getOutsd_elmt_cd(){
		return this.outsd_elmt_cd;
	}

	public String getOutsd_elmt_nm(){
		return this.outsd_elmt_nm;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Fri May 01 15:27:42 KST 2009 */