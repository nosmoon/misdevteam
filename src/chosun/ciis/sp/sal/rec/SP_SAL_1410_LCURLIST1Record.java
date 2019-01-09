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


package chosun.ciis.sp.sal.rec;

import java.sql.*;
import chosun.ciis.sp.sal.dm.*;
import chosun.ciis.sp.sal.ds.*;

/**
 * 
 */


public class SP_SAL_1410_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String seq;
	public String sale_yymm;
	public String sale_seq;
	public String sale_item_cd;
	public String medi_nm;
	public String dlco_no;
	public String dlco_nm;
	public String qty;
	public String uprc;
	public String amt;

	public SP_SAL_1410_LCURLIST1Record(){}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setSale_seq(String sale_seq){
		this.sale_seq = sale_seq;
	}

	public void setSale_item_cd(String sale_item_cd){
		this.sale_item_cd = sale_item_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getSale_seq(){
		return this.sale_seq;
	}

	public String getSale_item_cd(){
		return this.sale_item_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getAmt(){
		return this.amt;
	}
}

/* 작성시간 : Thu Jul 12 10:29:08 KST 2012 */