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


public class MT_COMMATR_7510_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String fact_nm;
	public String wgt;
	public String amt;
	public String vat;
	public String tot;
	public String per2;

	public MT_COMMATR_7510_LCURLIST2Record(){}

	public void setFact_nm(String fact_nm){
		this.fact_nm = fact_nm;
	}

	public void setWgt(String wgt){
		this.wgt = wgt;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setTot(String tot){
		this.tot = tot;
	}

	public void setPer2(String per2){
		this.per2 = per2;
	}

	public String getFact_nm(){
		return this.fact_nm;
	}

	public String getWgt(){
		return this.wgt;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getVat(){
		return this.vat;
	}

	public String getTot(){
		return this.tot;
	}

	public String getPer2(){
		return this.per2;
	}
}

/* 작성시간 : Fri Dec 04 14:52:34 KST 2015 */