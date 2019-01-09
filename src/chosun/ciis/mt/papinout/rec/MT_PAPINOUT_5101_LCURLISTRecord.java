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


public class MT_PAPINOUT_5101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String pj_kind;
	public String pj_kind_nm;
	public String pj_qunt;
	public String pj_wgt;
	public String uprc;
	public String amt;

	public MT_PAPINOUT_5101_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setPj_kind_nm(String pj_kind_nm){
		this.pj_kind_nm = pj_kind_nm;
	}

	public void setPj_qunt(String pj_qunt){
		this.pj_qunt = pj_qunt;
	}

	public void setPj_wgt(String pj_wgt){
		this.pj_wgt = pj_wgt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getPj_kind_nm(){
		return this.pj_kind_nm;
	}

	public String getPj_qunt(){
		return this.pj_qunt;
	}

	public String getPj_wgt(){
		return this.pj_wgt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Tue May 12 16:53:40 KST 2009 */