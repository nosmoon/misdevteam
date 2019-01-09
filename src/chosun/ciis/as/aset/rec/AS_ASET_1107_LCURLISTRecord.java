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


package chosun.ciis.as.aset.rec;

import java.sql.*;
import chosun.ciis.as.aset.dm.*;
import chosun.ciis.as.aset.ds.*;

/**
 * 
 */


public class AS_ASET_1107_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String aset_no;
	public String aset_nm;
	public String cur_acqr_amt;
	public String tot_redm_amt;
	public String un_redm_amt;
	public String sale_pfls_amt;
	public String remk;

	public AS_ASET_1107_LCURLISTRecord(){}

	public void setAset_no(String aset_no){
		this.aset_no = aset_no;
	}

	public void setAset_nm(String aset_nm){
		this.aset_nm = aset_nm;
	}

	public void setCur_acqr_amt(String cur_acqr_amt){
		this.cur_acqr_amt = cur_acqr_amt;
	}

	public void setTot_redm_amt(String tot_redm_amt){
		this.tot_redm_amt = tot_redm_amt;
	}

	public void setUn_redm_amt(String un_redm_amt){
		this.un_redm_amt = un_redm_amt;
	}

	public void setSale_pfls_amt(String sale_pfls_amt){
		this.sale_pfls_amt = sale_pfls_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getAset_no(){
		return this.aset_no;
	}

	public String getAset_nm(){
		return this.aset_nm;
	}

	public String getCur_acqr_amt(){
		return this.cur_acqr_amt;
	}

	public String getTot_redm_amt(){
		return this.tot_redm_amt;
	}

	public String getUn_redm_amt(){
		return this.un_redm_amt;
	}

	public String getSale_pfls_amt(){
		return this.sale_pfls_amt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Thu Mar 26 15:36:48 KST 2009 */