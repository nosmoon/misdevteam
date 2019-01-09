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


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_5411_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String clas_clsf_cd;
	public String clas_clsf1;
	public String clas_clsf_cd2;
	public String clas_clsf2;
	public String prv_mm_amt;
	public String base_mm_amt;
	public String prvmm_cmpr;
	public String icdc_amt;
	public String remk;

	public HD_SRCH_5411_LCURLIST1Record(){}

	public void setClas_clsf_cd(String clas_clsf_cd){
		this.clas_clsf_cd = clas_clsf_cd;
	}

	public void setClas_clsf1(String clas_clsf1){
		this.clas_clsf1 = clas_clsf1;
	}

	public void setClas_clsf_cd2(String clas_clsf_cd2){
		this.clas_clsf_cd2 = clas_clsf_cd2;
	}

	public void setClas_clsf2(String clas_clsf2){
		this.clas_clsf2 = clas_clsf2;
	}

	public void setPrv_mm_amt(String prv_mm_amt){
		this.prv_mm_amt = prv_mm_amt;
	}

	public void setBase_mm_amt(String base_mm_amt){
		this.base_mm_amt = base_mm_amt;
	}

	public void setPrvmm_cmpr(String prvmm_cmpr){
		this.prvmm_cmpr = prvmm_cmpr;
	}

	public void setIcdc_amt(String icdc_amt){
		this.icdc_amt = icdc_amt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getClas_clsf_cd(){
		return this.clas_clsf_cd;
	}

	public String getClas_clsf1(){
		return this.clas_clsf1;
	}

	public String getClas_clsf_cd2(){
		return this.clas_clsf_cd2;
	}

	public String getClas_clsf2(){
		return this.clas_clsf2;
	}

	public String getPrv_mm_amt(){
		return this.prv_mm_amt;
	}

	public String getBase_mm_amt(){
		return this.base_mm_amt;
	}

	public String getPrvmm_cmpr(){
		return this.prvmm_cmpr;
	}

	public String getIcdc_amt(){
		return this.icdc_amt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Oct 31 14:05:01 KST 2018 */