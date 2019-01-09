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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_5104_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String pj_kind;
	public String pj_kind_nm;
	public String wgt;
	public String uprc;
	public String amt;
	public String qunt;

	public MT_PAPINOUT_5104_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setPj_kind_nm(String pj_kind_nm){
		this.pj_kind_nm = pj_kind_nm;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
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

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getPj_kind_nm(){
		return this.pj_kind_nm;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getQunt(){
		return this.qunt;
	}
}

/* 작성시간 : Wed May 13 13:54:54 KST 2009 */