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


package chosun.ciis.mt.etccar.rec;

import java.sql.*;
import chosun.ciis.mt.etccar.dm.*;
import chosun.ciis.mt.etccar.ds.*;

/**
 * 
 */


public class MT_ETCCAR_1002_MCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String occr_dt;
	public String seq;
	public String buy_lent_clsf;
	public String car_no;
	public String car_modl;
	public String oil_kind;
	public String cmpy_mang_nm;

	public MT_ETCCAR_1002_MCURLIST1Record(){}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setBuy_lent_clsf(String buy_lent_clsf){
		this.buy_lent_clsf = buy_lent_clsf;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setCar_modl(String car_modl){
		this.car_modl = car_modl;
	}

	public void setOil_kind(String oil_kind){
		this.oil_kind = oil_kind;
	}

	public void setCmpy_mang_nm(String cmpy_mang_nm){
		this.cmpy_mang_nm = cmpy_mang_nm;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getBuy_lent_clsf(){
		return this.buy_lent_clsf;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getCar_modl(){
		return this.car_modl;
	}

	public String getOil_kind(){
		return this.oil_kind;
	}

	public String getCmpy_mang_nm(){
		return this.cmpy_mang_nm;
	}
}

/* 작성시간 : Wed Aug 12 19:30:49 KST 2009 */