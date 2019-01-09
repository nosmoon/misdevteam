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


package chosun.ciis.hd.insr.rec;

import java.sql.*;
import chosun.ciis.hd.insr.dm.*;
import chosun.ciis.hd.insr.ds.*;

/**
 * 
 */


public class HD_INSR_1000_LCURLIST4Record extends java.lang.Object implements java.io.Serializable{

	public String np_entr_dt;
	public String np_mtry_dt;
	public String np_slf_ctrb_amt;
	public String np_cmpy_burd_amt;
	public String np_no;

	public HD_INSR_1000_LCURLIST4Record(){}

	public void setNp_entr_dt(String np_entr_dt){
		this.np_entr_dt = np_entr_dt;
	}

	public void setNp_mtry_dt(String np_mtry_dt){
		this.np_mtry_dt = np_mtry_dt;
	}

	public void setNp_slf_ctrb_amt(String np_slf_ctrb_amt){
		this.np_slf_ctrb_amt = np_slf_ctrb_amt;
	}

	public void setNp_cmpy_burd_amt(String np_cmpy_burd_amt){
		this.np_cmpy_burd_amt = np_cmpy_burd_amt;
	}

	public void setNp_no(String np_no){
		this.np_no = np_no;
	}

	public String getNp_entr_dt(){
		return this.np_entr_dt;
	}

	public String getNp_mtry_dt(){
		return this.np_mtry_dt;
	}

	public String getNp_slf_ctrb_amt(){
		return this.np_slf_ctrb_amt;
	}

	public String getNp_cmpy_burd_amt(){
		return this.np_cmpy_burd_amt;
	}

	public String getNp_no(){
		return this.np_no;
	}
}

/* 작성시간 : Thu Aug 20 20:54:39 KST 2009 */