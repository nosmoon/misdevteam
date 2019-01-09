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


public class PR_PRTEXEC_6000_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_strt_yymm;
	public String medi_clsf;
	public String ecnt;
	public String edt_nm;
	public String use_frdt;
	public String use_susp_dt;
	public String remk;

	public PR_PRTEXEC_6000_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_strt_yymm(String aply_strt_yymm){
		this.aply_strt_yymm = aply_strt_yymm;
	}

	public void setMedi_clsf(String medi_clsf){
		this.medi_clsf = medi_clsf;
	}

	public void setEcnt(String ecnt){
		this.ecnt = ecnt;
	}

	public void setEdt_nm(String edt_nm){
		this.edt_nm = edt_nm;
	}

	public void setUse_frdt(String use_frdt){
		this.use_frdt = use_frdt;
	}

	public void setUse_susp_dt(String use_susp_dt){
		this.use_susp_dt = use_susp_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_strt_yymm(){
		return this.aply_strt_yymm;
	}

	public String getMedi_clsf(){
		return this.medi_clsf;
	}

	public String getEcnt(){
		return this.ecnt;
	}

	public String getEdt_nm(){
		return this.edt_nm;
	}

	public String getUse_frdt(){
		return this.use_frdt;
	}

	public String getUse_susp_dt(){
		return this.use_susp_dt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Thu Apr 30 14:56:35 KST 2009 */