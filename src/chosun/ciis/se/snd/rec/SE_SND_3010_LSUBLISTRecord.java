/***************************************************************************************************
* 파일명 : SE_SND_3010_LSUBLISTRecord.java
* 기능 : 판매-발송관리-발송부수증감체크 및 조회
* 작성일자 : 2009-05-22
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_3010_LSUBLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd		;
	public String medi_nm		;
	public String area_cd		;
	public String area_nm		;
	public String bo_cd			;
	public String send_plac_seq	;
	public String send_plac_nm	;
	public String be_qty		;
	public String icdc_qty		;
	public String qty			;
	public String err_qty		;

	public SE_SND_3010_LSUBLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setSend_plac_seq(String send_plac_seq){
		this.send_plac_seq = send_plac_seq;
	}

	public void setSend_plac_nm(String send_plac_nm){
		this.send_plac_nm = send_plac_nm;
	}

	public void setBe_qty(String be_qty){
		this.be_qty = be_qty;
	}

	public void setIcdc_qty(String icdc_qty){
		this.icdc_qty = icdc_qty;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setErr_qty(String err_qty){
		this.err_qty = err_qty;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getSend_plac_seq(){
		return this.send_plac_seq;
	}

	public String getSend_plac_nm(){
		return this.send_plac_nm;
	}

	public String getBe_qty(){
		return this.be_qty;
	}

	public String getIcdc_qty(){
		return this.icdc_qty;
	}

	public String getQty(){
		return this.qty;
	}

	public String getErr_qty(){
		return this.err_qty;
	}
}

/* 작성시간 : Fri May 22 16:15:01 KST 2009 */