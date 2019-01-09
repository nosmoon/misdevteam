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


package chosun.ciis.mt.prnpap.rec;

import java.sql.*;
import chosun.ciis.mt.prnpap.dm.*;
import chosun.ciis.mt.prnpap.ds.*;

/**
 * 
 */


public class MT_PRNPAP_1004_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String sub_seq;
	public String test_item_clsf;
	public String unit;
	public double ocom_val;

	public MT_PRNPAP_1004_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
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

	public void setTest_item_clsf(String test_item_clsf){
		this.test_item_clsf = test_item_clsf;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setOcom_val(double ocom_val){
		this.ocom_val = ocom_val;
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

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getTest_item_clsf(){
		return this.test_item_clsf;
	}

	public String getUnit(){
		return this.unit;
	}

	public double getOcom_val(){
		return this.ocom_val;
	}
}

/* 작성시간 : Tue Mar 31 18:49:44 KST 2009 */