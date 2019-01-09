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


package chosun.ciis.pr.prtcnsg.rec;

import java.sql.*;
import chosun.ciis.pr.prtcnsg.dm.*;
import chosun.ciis.pr.prtcnsg.ds.*;

/**
 * 
 */


public class PR_PRTCNSG_1320_LCURLIST1Record extends java.lang.Object implements java.io.Serializable{

	public String aply_dt;
	public String papcmpy_cd_nm;
	public String papcmpy_cd;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String paper_uprc;
	public String paper_portage;

	public PR_PRTCNSG_1320_LCURLIST1Record(){}

	public void setAply_dt(String aply_dt){
		this.aply_dt = aply_dt;
	}

	public void setPapcmpy_cd_nm(String papcmpy_cd_nm){
		this.papcmpy_cd_nm = papcmpy_cd_nm;
	}

	public void setPapcmpy_cd(String papcmpy_cd){
		this.papcmpy_cd = papcmpy_cd;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setPaper_uprc(String paper_uprc){
		this.paper_uprc = paper_uprc;
	}

	public void setPaper_portage(String paper_portage){
		this.paper_portage = paper_portage;
	}

	public String getAply_dt(){
		return this.aply_dt;
	}

	public String getPapcmpy_cd_nm(){
		return this.papcmpy_cd_nm;
	}

	public String getPapcmpy_cd(){
		return this.papcmpy_cd;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getPaper_uprc(){
		return this.paper_uprc;
	}

	public String getPaper_portage(){
		return this.paper_portage;
	}
}

/* 작성시간 : Tue Jul 14 18:05:01 KST 2009 */