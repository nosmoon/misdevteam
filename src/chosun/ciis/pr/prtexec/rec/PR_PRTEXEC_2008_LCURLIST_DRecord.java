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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_2008_LCURLIST_DRecord extends java.lang.Object implements java.io.Serializable{

	public String end_clsf;
	public String end_clsf_nm;
	public String fac_clsf;
	public String issu_dt;

	public PR_PRTEXEC_2008_LCURLIST_DRecord(){}

	public void setEnd_clsf(String end_clsf){
		this.end_clsf = end_clsf;
	}

	public void setEnd_clsf_nm(String end_clsf_nm){
		this.end_clsf_nm = end_clsf_nm;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public String getEnd_clsf(){
		return this.end_clsf;
	}

	public String getEnd_clsf_nm(){
		return this.end_clsf_nm;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}
}

/* 작성시간 : Tue Apr 28 14:35:08 KST 2009 */