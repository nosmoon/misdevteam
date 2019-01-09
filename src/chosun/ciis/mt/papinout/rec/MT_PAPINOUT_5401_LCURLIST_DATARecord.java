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


public class MT_PAPINOUT_5401_LCURLIST_DATARecord extends java.lang.Object implements java.io.Serializable{

	public String somodat;
	public String fac_clsf;
	public String pj_kind;
	public String pj_kind_nm;
	public String val;
	public String uprc;
	public String amt;

	public MT_PAPINOUT_5401_LCURLIST_DATARecord(){}

	public void setSomodat(String somodat){
		this.somodat = somodat;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setPj_kind_nm(String pj_kind_nm){
		this.pj_kind_nm = pj_kind_nm;
	}

	public void setVal(String val){
		this.val = val;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getSomodat(){
		return this.somodat;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getPj_kind_nm(){
		return this.pj_kind_nm;
	}

	public String getVal(){
		return this.val;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Thu Aug 20 21:35:14 KST 2009 */