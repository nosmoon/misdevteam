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


package chosun.ciis.ad.tax.rec;

import java.sql.*;
import chosun.ciis.ad.tax.dm.*;
import chosun.ciis.ad.tax.ds.*;

/**
 * 
 */


public class AD_TAX_1210_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String pubc_slip_no;
	public String dlco_no;
	public String dlco_nm;
	public String advt_fee;
	public String pubc_dt;
	public String pre_issu_yn;

	public AD_TAX_1210_SCURLISTRecord(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setPubc_slip_no(String pubc_slip_no){
		this.pubc_slip_no = pubc_slip_no;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setPre_issu_yn(String pre_issu_yn){
		this.pre_issu_yn = pre_issu_yn;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getPubc_slip_no(){
		return this.pubc_slip_no;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getPre_issu_yn(){
		return this.pre_issu_yn;
	}
}

/* 작성시간 : Wed Nov 27 16:16:35 KST 2013 */