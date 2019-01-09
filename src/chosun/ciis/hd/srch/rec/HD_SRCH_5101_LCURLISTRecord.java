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


public class HD_SRCH_5101_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String clas_clsf;
	public String emp_clsf;
	public String prv_nops;
	public String this_nops;
	public String cmpr_nops;

	public HD_SRCH_5101_LCURLISTRecord(){}

	public void setClas_clsf(String clas_clsf){
		this.clas_clsf = clas_clsf;
	}

	public void setEmp_clsf(String emp_clsf){
		this.emp_clsf = emp_clsf;
	}

	public void setPrv_nops(String prv_nops){
		this.prv_nops = prv_nops;
	}

	public void setThis_nops(String this_nops){
		this.this_nops = this_nops;
	}

	public void setCmpr_nops(String cmpr_nops){
		this.cmpr_nops = cmpr_nops;
	}

	public String getClas_clsf(){
		return this.clas_clsf;
	}

	public String getEmp_clsf(){
		return this.emp_clsf;
	}

	public String getPrv_nops(){
		return this.prv_nops;
	}

	public String getThis_nops(){
		return this.this_nops;
	}

	public String getCmpr_nops(){
		return this.cmpr_nops;
	}
}

/* 작성시간 : Mon Jun 04 18:38:10 KST 2018 */