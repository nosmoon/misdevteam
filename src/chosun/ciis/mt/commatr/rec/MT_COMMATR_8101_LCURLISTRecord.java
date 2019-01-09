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


package chosun.ciis.mt.commatr.rec;

import java.sql.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.ds.*;

/**
 * 
 */


public class MT_COMMATR_8101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String fac_clsf;
	public String factcdnm;
	public String pj_kind;
	public String pj_kind_nm;
	public String qunt;
	public String uprc;
	public String amt;
	public String tot_amt;

	public MT_COMMATR_8101_LCURLISTRecord(){}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFactcdnm(String factcdnm){
		this.factcdnm = factcdnm;
	}

	public void setPj_kind(String pj_kind){
		this.pj_kind = pj_kind;
	}

	public void setPj_kind_nm(String pj_kind_nm){
		this.pj_kind_nm = pj_kind_nm;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}
	
	public void setAmt(String amt){
		this.amt = amt;
	}
	
	public void setTot_amt(String tot_amt){
		this.tot_amt = tot_amt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFactcdnm(){
		return this.factcdnm;
	}

	public String getPj_kind(){
		return this.pj_kind;
	}

	public String getPj_kind_nm(){
		return this.pj_kind_nm;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}
	
	public String getAmt(){
		return this.amt;
	}

	public String getTot_amt(){
		return this.tot_amt;
	}
}

/* 작성시간 : Tue May 14 17:30:53 KST 2013 */