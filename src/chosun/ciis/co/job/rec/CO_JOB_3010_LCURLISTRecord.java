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


package chosun.ciis.co.job.rec;

import java.sql.*;
import chosun.ciis.co.job.dm.*;
import chosun.ciis.co.job.ds.*;

/**
 * 
 */


public class CO_JOB_3010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String titl;
	public String make_pers;
	public String make_dt;
	public String eis_fix;
	public String eis_pers;
	public String eis_fix_dt_tm;
	public String sys_clsf;
	public String seq;

	public CO_JOB_3010_LCURLISTRecord(){}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setMake_pers(String make_pers){
		this.make_pers = make_pers;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setEis_fix(String eis_fix){
		this.eis_fix = eis_fix;
	}

	public void setEis_pers(String eis_pers){
		this.eis_pers = eis_pers;
	}

	public void setEis_fix_dt_tm(String eis_fix_dt_tm){
		this.eis_fix_dt_tm = eis_fix_dt_tm;
	}

	public void setSys_clsf(String sys_clsf){
		this.sys_clsf = sys_clsf;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getMake_pers(){
		return this.make_pers;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getEis_fix(){
		return this.eis_fix;
	}

	public String getEis_pers(){
		return this.eis_pers;
	}

	public String getEis_fix_dt_tm(){
		return this.eis_fix_dt_tm;
	}

	public String getSys_clsf(){
		return this.sys_clsf;
	}

	public String getSeq(){
		return this.seq;
	}
}

/* 작성시간 : Tue Aug 11 09:07:13 KST 2009 */