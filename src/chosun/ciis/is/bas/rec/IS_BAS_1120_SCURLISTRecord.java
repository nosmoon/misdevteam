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


package chosun.ciis.is.bas.rec;

import java.sql.*;
import chosun.ciis.is.bas.dm.*;
import chosun.ciis.is.bas.ds.*;

/**
 * 
 */


public class IS_BAS_1120_SCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String dept_cd;
	public String chrg_pers_seq;
	public String chrg_pers;
	public String chrg_pers_nm;
	public String dty_cd;
	public String chrg_clsf;
	public String frdt;
	public String todt;
	public String srt_seqo;
	public String chg_dt_tm;

	public IS_BAS_1120_SCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setChrg_pers_seq(String chrg_pers_seq){
		this.chrg_pers_seq = chrg_pers_seq;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setChrg_pers_nm(String chrg_pers_nm){
		this.chrg_pers_nm = chrg_pers_nm;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setChrg_clsf(String chrg_clsf){
		this.chrg_clsf = chrg_clsf;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setSrt_seqo(String srt_seqo){
		this.srt_seqo = srt_seqo;
	}

	public void setChg_dt_tm(String chg_dt_tm){
		this.chg_dt_tm = chg_dt_tm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getChrg_pers_seq(){
		return this.chrg_pers_seq;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getChrg_pers_nm(){
		return this.chrg_pers_nm;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getChrg_clsf(){
		return this.chrg_clsf;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getSrt_seqo(){
		return this.srt_seqo;
	}

	public String getChg_dt_tm(){
		return this.chg_dt_tm;
	}
}

/* 작성시간 : Tue Aug 14 19:02:59 KST 2012 */