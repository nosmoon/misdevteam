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


public class MT_PAPINOUT_6103_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String ewh_dt;
	public String fac_clsf;
	public String usag;
	public String ewh_roll;
	public String ewh_amt;
	public String ewh_vat;
	public String sum_amt;
	public String ewh_wgt;
	public String matr_cd;
	public String matr_nm;
	public String ewh_uprc;
	public String wisgno;

	public MT_PAPINOUT_6103_LCURLISTRecord(){}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setUsag(String usag){
		this.usag = usag;
	}

	public void setEwh_roll(String ewh_roll){
		this.ewh_roll = ewh_roll;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public void setEwh_vat(String ewh_vat){
		this.ewh_vat = ewh_vat;
	}

	public void setSum_amt(String sum_amt){
		this.sum_amt = sum_amt;
	}

	public void setEwh_wgt(String ewh_wgt){
		this.ewh_wgt = ewh_wgt;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public void setEwh_uprc(String ewh_uprc){
		this.ewh_uprc = ewh_uprc;
	}

	public void setWisgno(String wisgno){
		this.wisgno = wisgno;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getUsag(){
		return this.usag;
	}

	public String getEwh_roll(){
		return this.ewh_roll;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}

	public String getEwh_vat(){
		return this.ewh_vat;
	}

	public String getSum_amt(){
		return this.sum_amt;
	}

	public String getEwh_wgt(){
		return this.ewh_wgt;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}

	public String getEwh_uprc(){
		return this.ewh_uprc;
	}

	public String getWisgno(){
		return this.wisgno;
	}
}

/* 작성시간 : Thu May 21 18:04:36 KST 2009 */