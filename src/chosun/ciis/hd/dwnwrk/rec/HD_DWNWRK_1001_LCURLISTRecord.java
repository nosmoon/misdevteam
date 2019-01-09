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


package chosun.ciis.hd.dwnwrk.rec;

import java.sql.*;
import chosun.ciis.hd.dwnwrk.dm.*;
import chosun.ciis.hd.dwnwrk.ds.*;

/**
 * 
 */


public class HD_DWNWRK_1001_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String aply_basi_dt;
	public String seq;
	public String erl_prsnt_alon_clsf;
	public String aply_duty_tm;
	public String alon_amt;

	public HD_DWNWRK_1001_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_basi_dt(String aply_basi_dt){
		this.aply_basi_dt = aply_basi_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setErl_prsnt_alon_clsf(String erl_prsnt_alon_clsf){
		this.erl_prsnt_alon_clsf = erl_prsnt_alon_clsf;
	}

	public void setAply_duty_tm(String aply_duty_tm){
		this.aply_duty_tm = aply_duty_tm;
	}

	public void setAlon_amt(String alon_amt){
		this.alon_amt = alon_amt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_basi_dt(){
		return this.aply_basi_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getErl_prsnt_alon_clsf(){
		return this.erl_prsnt_alon_clsf;
	}

	public String getAply_duty_tm(){
		return this.aply_duty_tm;
	}

	public String getAlon_amt(){
		return this.alon_amt;
	}
}

/* 작성시간 : Tue Jun 23 19:56:22 KST 2009 */