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


package chosun.ciis.ad.pub.rec;

import java.sql.*;
import chosun.ciis.ad.pub.dm.*;
import chosun.ciis.ad.pub.ds.*;

/**
 * 
 */


public class AD_PUB_3011_LCURLIST2Record extends java.lang.Object implements java.io.Serializable{

	public String medi_nm;
	public String dlco_no;
	public String name;
	public String advt_fee;
	public String vat;
	public String pubc_tot_amt;
	public String cnt;
	public String pubc_dt;
	public String rnum;

	public AD_PUB_3011_LCURLIST2Record(){}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setName(String name){
		this.name = name;
	}

	public void setAdvt_fee(String advt_fee){
		this.advt_fee = advt_fee;
	}

	public void setVat(String vat){
		this.vat = vat;
	}

	public void setPubc_tot_amt(String pubc_tot_amt){
		this.pubc_tot_amt = pubc_tot_amt;
	}

	public void setCnt(String cnt){
		this.cnt = cnt;
	}

	public void setPubc_dt(String pubc_dt){
		this.pubc_dt = pubc_dt;
	}

	public void setRnum(String rnum){
		this.rnum = rnum;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getName(){
		return this.name;
	}

	public String getAdvt_fee(){
		return this.advt_fee;
	}

	public String getVat(){
		return this.vat;
	}

	public String getPubc_tot_amt(){
		return this.pubc_tot_amt;
	}

	public String getCnt(){
		return this.cnt;
	}

	public String getPubc_dt(){
		return this.pubc_dt;
	}

	public String getRnum(){
		return this.rnum;
	}
}

/* 작성시간 : Mon Sep 24 17:01:56 KST 2012 */