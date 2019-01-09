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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_1021_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String duty_dt;
	public String fac_clsf;
	public String sub_seq;
	public String prt_clsf;
	public String mesr_plac_clsf;
	public String tmpt;
	public String hmdt;
	public String cnfm_tm;

	public PR_PAPMAKE_1021_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDuty_dt(String duty_dt){
		this.duty_dt = duty_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setSub_seq(String sub_seq){
		this.sub_seq = sub_seq;
	}

	public void setPrt_clsf(String prt_clsf){
		this.prt_clsf = prt_clsf;
	}

	public void setMesr_plac_clsf(String mesr_plac_clsf){
		this.mesr_plac_clsf = mesr_plac_clsf;
	}

	public void setTmpt(String tmpt){
		this.tmpt = tmpt;
	}

	public void setHmdt(String hmdt){
		this.hmdt = hmdt;
	}

	public void setCnfm_tm(String cnfm_tm){
		this.cnfm_tm = cnfm_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDuty_dt(){
		return this.duty_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getSub_seq(){
		return this.sub_seq;
	}

	public String getPrt_clsf(){
		return this.prt_clsf;
	}

	public String getMesr_plac_clsf(){
		return this.mesr_plac_clsf;
	}

	public String getTmpt(){
		return this.tmpt;
	}

	public String getHmdt(){
		return this.hmdt;
	}

	public String getCnfm_tm(){
		return this.cnfm_tm;
	}
}

/* 작성시간 : Fri Apr 10 10:51:53 KST 2009 */