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


public class MT_ETCCAR_4200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String use_dt;
	public String car_no;
	public String cmpy_mang_nm;
	public String clam_item_kind;
	public String item_nm;
	public String dlco;
	public int qunt;
	public int clam_amt;

	public MT_ETCCAR_4200_LCURLISTRecord(){}

	public void setUse_dt(String use_dt){
		this.use_dt = use_dt;
	}

	public void setCar_no(String car_no){
		this.car_no = car_no;
	}

	public void setCmpy_mang_nm(String cmpy_mang_nm){
		this.cmpy_mang_nm = cmpy_mang_nm;
	}

	public void setClam_item_kind(String clam_item_kind){
		this.clam_item_kind = clam_item_kind;
	}

	public void setItem_nm(String item_nm){
		this.item_nm = item_nm;
	}

	public void setDlco(String dlco){
		this.dlco = dlco;
	}

	public void setQunt(int qunt){
		this.qunt = qunt;
	}

	public void setClam_amt(int clam_amt){
		this.clam_amt = clam_amt;
	}

	public String getUse_dt(){
		return this.use_dt;
	}

	public String getCar_no(){
		return this.car_no;
	}

	public String getCmpy_mang_nm(){
		return this.cmpy_mang_nm;
	}

	public String getClam_item_kind(){
		return this.clam_item_kind;
	}

	public String getItem_nm(){
		return this.item_nm;
	}

	public String getDlco(){
		return this.dlco;
	}

	public int getQunt(){
		return this.qunt;
	}

	public int getClam_amt(){
		return this.clam_amt;
	}
}

/* 작성시간 : Thu Apr 16 20:36:12 KST 2009 */