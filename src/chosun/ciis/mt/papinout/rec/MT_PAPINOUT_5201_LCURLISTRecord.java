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


public class MT_PAPINOUT_5201_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_dt;
	public String pj_kind;
	public String uprc;
	public String simb_wgt;

	public MT_PAPINOUT_5201_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setSimb_wgt(String simb_wgt){
		this.simb_wgt = simb_wgt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getSimb_wgt(){
		return this.simb_wgt;
	}
}

/* 작성시간 : Mon May 11 15:11:17 KST 2009 */