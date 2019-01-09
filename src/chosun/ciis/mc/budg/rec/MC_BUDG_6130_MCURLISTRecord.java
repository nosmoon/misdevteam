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


package chosun.ciis.mc.budg.rec;

import java.sql.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.ds.*;

/**
 * 
 */


public class MC_BUDG_6130_MCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String tms;
	public String rslt_aply_prd_bgn;
	public String rslt_aply_prd_end;
	public String expt_aply_prd_bgn;
	public String expt_aply_prd_end;

	public MC_BUDG_6130_MCURLISTRecord(){}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setRslt_aply_prd_bgn(String rslt_aply_prd_bgn){
		this.rslt_aply_prd_bgn = rslt_aply_prd_bgn;
	}

	public void setRslt_aply_prd_end(String rslt_aply_prd_end){
		this.rslt_aply_prd_end = rslt_aply_prd_end;
	}

	public void setExpt_aply_prd_bgn(String expt_aply_prd_bgn){
		this.expt_aply_prd_bgn = expt_aply_prd_bgn;
	}

	public void setExpt_aply_prd_end(String expt_aply_prd_end){
		this.expt_aply_prd_end = expt_aply_prd_end;
	}

	public String getTms(){
		return this.tms;
	}

	public String getRslt_aply_prd_bgn(){
		return this.rslt_aply_prd_bgn;
	}

	public String getRslt_aply_prd_end(){
		return this.rslt_aply_prd_end;
	}

	public String getExpt_aply_prd_bgn(){
		return this.expt_aply_prd_bgn;
	}

	public String getExpt_aply_prd_end(){
		return this.expt_aply_prd_end;
	}
}

/* 작성시간 : Fri Aug 14 11:45:32 KST 2009 */