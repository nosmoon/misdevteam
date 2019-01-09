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


public class SP_SAL_1510_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String sale_yymm;
	public String cmpy_dlco_no;
	public String cmpy_dlco_nm;
	public String qty;
	public String sale_amt;
	public String dlco_no;
	public String dlco_nm;
	public String qty_2;
	public String dlv_fee;

	public SP_SAL_1510_LCURLIST1Record(){}

	public void setSale_yymm(String sale_yymm){
		this.sale_yymm = sale_yymm;
	}

	public void setCmpy_dlco_no(String cmpy_dlco_no){
		this.cmpy_dlco_no = cmpy_dlco_no;
	}

	public void setCmpy_dlco_nm(String cmpy_dlco_nm){
		this.cmpy_dlco_nm = cmpy_dlco_nm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setQty_2(String qty_2){
		this.qty_2 = qty_2;
	}

	public void setDlv_fee(String dlv_fee){
		this.dlv_fee = dlv_fee;
	}

	public String getSale_yymm(){
		return this.sale_yymm;
	}

	public String getCmpy_dlco_no(){
		return this.cmpy_dlco_no;
	}

	public String getCmpy_dlco_nm(){
		return this.cmpy_dlco_nm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getQty_2(){
		return this.qty_2;
	}

	public String getDlv_fee(){
		return this.dlv_fee;
	}
}

/* 작성시간 : Mon Jul 16 14:07:58 KST 2012 */