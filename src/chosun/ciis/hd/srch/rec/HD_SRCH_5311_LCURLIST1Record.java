/***************************************************************************************************
* ���ϸ� : .java
* ��� : ���ڿ��-������û
* �ۼ����� : 2007-05-22
* �ۼ��� : ��뼷
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
***************************************************************************************************/


package chosun.ciis.hd.srch.rec;

import java.sql.*;
import chosun.ciis.hd.srch.dm.*;
import chosun.ciis.hd.srch.ds.*;

/**
 * 
 */


public class HD_SRCH_5311_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String clsf;
	public String clas_clsf1;
	public String clas_clsf2;
	public String prv_mm_amt;
	public String base_mm_amt;
	public String prvmm_cmpr;
	public String remk;

	public HD_SRCH_5311_LCURLIST1Record(){}

	public void setClsf(String clsf){
		this.clsf = clsf;
	}

	public void setClas_clsf1(String clas_clsf1){
		this.clas_clsf1 = clas_clsf1;
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

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getClsf(){
		return this.clsf;
	}

	public String getClas_clsf1(){
		return this.clas_clsf1;
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

	public String getRemk(){
		return this.remk;
	}
}

/* �ۼ��ð� : Wed Oct 17 18:39:37 KST 2018 */