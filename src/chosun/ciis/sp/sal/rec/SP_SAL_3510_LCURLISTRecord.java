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


public class SP_SAL_3510_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String dlco_cd;
	public String dlco_nm;
	public String suc_cnt;
	public String fal_cnt;
	public String tot_cnt;
	public String sale_amt;

	public SP_SAL_3510_LCURLISTRecord(){}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setSuc_cnt(String suc_cnt){
		this.suc_cnt = suc_cnt;
	}

	public void setFal_cnt(String fal_cnt){
		this.fal_cnt = fal_cnt;
	}

	public void setTot_cnt(String tot_cnt){
		this.tot_cnt = tot_cnt;
	}

	public void setSale_amt(String sale_amt){
		this.sale_amt = sale_amt;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getSuc_cnt(){
		return this.suc_cnt;
	}

	public String getFal_cnt(){
		return this.fal_cnt;
	}

	public String getTot_cnt(){
		return this.tot_cnt;
	}

	public String getSale_amt(){
		return this.sale_amt;
	}
}

/* 작성시간 : Thu Jul 19 20:50:40 KST 2012 */