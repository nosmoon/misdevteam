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


public class MT_COMMATR_7410_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String factcd;
	public String fact_nm;
	public String wgt_1101;
	public String per_1101;
	public String wgt_1102;
	public String per_1102;
	public String wgt_1105;
	public String per_1105;
	public String wgt_1106;
	public String per_1106;
	public String wgt_tot;
	public String per_tot;

	public MT_COMMATR_7410_LCURLISTRecord(){}

	public void setFactcd(String factcd){
		this.factcd = factcd;
	}

	public void setFact_nm(String fact_nm){
		this.fact_nm = fact_nm;
	}

	public void setWgt_1101(String wgt_1101){
		this.wgt_1101 = wgt_1101;
	}

	public void setPer_1101(String per_1101){
		this.per_1101 = per_1101;
	}

	public void setWgt_1102(String wgt_1102){
		this.wgt_1102 = wgt_1102;
	}

	public void setPer_1102(String per_1102){
		this.per_1102 = per_1102;
	}

	public void setWgt_1105(String wgt_1105){
		this.wgt_1105 = wgt_1105;
	}

	public void setPer_1105(String per_1105){
		this.per_1105 = per_1105;
	}

	public void setWgt_1106(String wgt_1106){
		this.wgt_1106 = wgt_1106;
	}

	public void setPer_1106(String per_1106){
		this.per_1106 = per_1106;
	}

	public void setWgt_tot(String wgt_tot){
		this.wgt_tot = wgt_tot;
	}

	public void setPer_tot(String per_tot){
		this.per_tot = per_tot;
	}

	public String getFactcd(){
		return this.factcd;
	}

	public String getFact_nm(){
		return this.fact_nm;
	}

	public String getWgt_1101(){
		return this.wgt_1101;
	}

	public String getPer_1101(){
		return this.per_1101;
	}

	public String getWgt_1102(){
		return this.wgt_1102;
	}

	public String getPer_1102(){
		return this.per_1102;
	}

	public String getWgt_1105(){
		return this.wgt_1105;
	}

	public String getPer_1105(){
		return this.per_1105;
	}

	public String getWgt_1106(){
		return this.wgt_1106;
	}

	public String getPer_1106(){
		return this.per_1106;
	}

	public String getWgt_tot(){
		return this.wgt_tot;
	}

	public String getPer_tot(){
		return this.per_tot;
	}
}

/* 작성시간 : Tue Jun 16 18:57:25 KST 2015 */