/***************************************************************************************************
* 파일명 : SE_SND_3010_LCURLISTRecord.java
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


public class SE_SND_3010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_cd	;
	public String medi_nm	;
	public String be_qty	;
	public String icdc_qty	;
	public String qty		;
	public String err_qty	;

	public SE_SND_3010_LCURLISTRecord(){}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
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

/* 작성시간 : Fri May 22 14:53:40 KST 2009 */