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


public class PR_PRTEXEC_4003_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_yy;
	public String seq;
	public String frdt;
	public String todt;
	public String fix_clsf;
	public String fix_clsf_nm;
	public String chg_dt;
	public String chg_tm;

	public PR_PRTEXEC_4003_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_yy(String occr_yy){
		this.occr_yy = occr_yy;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setFix_clsf(String fix_clsf){
		this.fix_clsf = fix_clsf;
	}

	public void setFix_clsf_nm(String fix_clsf_nm){
		this.fix_clsf_nm = fix_clsf_nm;
	}

	public void setChg_dt(String chg_dt){
		this.chg_dt = chg_dt;
	}

	public void setChg_tm(String chg_tm){
		this.chg_tm = chg_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_yy(){
		return this.occr_yy;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getFix_clsf(){
		return this.fix_clsf;
	}

	public String getFix_clsf_nm(){
		return this.fix_clsf_nm;
	}

	public String getChg_dt(){
		return this.chg_dt;
	}

	public String getChg_tm(){
		return this.chg_tm;
	}
}

/* 작성시간 : Tue May 12 22:20:23 KST 2009 */