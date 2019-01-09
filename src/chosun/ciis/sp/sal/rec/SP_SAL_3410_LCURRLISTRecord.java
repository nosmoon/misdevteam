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


public class SP_SAL_3410_LCURRLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_no;
	public String dlco_nm;
	public String ern;
	public String corp_clsf_nm;
	public String dlco_nm2;
	public String presi_nm;
	public String qty_2;
	public String dlv_fee;

	public SP_SAL_3410_LCURRLISTRecord(){}

	public void setDlco_no(String dlco_no){
		this.dlco_no = dlco_no;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setCorp_clsf_nm(String corp_clsf_nm){
		this.corp_clsf_nm = corp_clsf_nm;
	}

	public void setDlco_nm2(String dlco_nm2){
		this.dlco_nm2 = dlco_nm2;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setQty_2(String qty_2){
		this.qty_2 = qty_2;
	}

	public void setDlv_fee(String dlv_fee){
		this.dlv_fee = dlv_fee;
	}

	public String getDlco_no(){
		return this.dlco_no;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getErn(){
		return this.ern;
	}

	public String getCorp_clsf_nm(){
		return this.corp_clsf_nm;
	}

	public String getDlco_nm2(){
		return this.dlco_nm2;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getQty_2(){
		return this.qty_2;
	}

	public String getDlv_fee(){
		return this.dlv_fee;
	}
}

/* 작성시간 : Sun Jul 22 14:14:36 KST 2012 */