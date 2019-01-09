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


package chosun.ciis.ad.bas.rec;

import java.sql.*;
import chosun.ciis.ad.bas.dm.*;
import chosun.ciis.ad.bas.ds.*;

/**
 * 
 */


public class AD_BAS_1520_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public int seq;
	public String night_shift_dt;
	public String duty_main_empno;
	public String duty_sub_empno;
	public String make_centr_main_empno;
	public String make_centr_sub_empno;
	public String dd_nwsp_cont;

	public AD_BAS_1520_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSeq(int seq){
		this.seq = seq;
	}

	public void setNight_shift_dt(String night_shift_dt){
		this.night_shift_dt = night_shift_dt;
	}

	public void setDuty_main_empno(String duty_main_empno){
		this.duty_main_empno = duty_main_empno;
	}

	public void setDuty_sub_empno(String duty_sub_empno){
		this.duty_sub_empno = duty_sub_empno;
	}

	public void setMake_centr_main_empno(String make_centr_main_empno){
		this.make_centr_main_empno = make_centr_main_empno;
	}

	public void setMake_centr_sub_empno(String make_centr_sub_empno){
		this.make_centr_sub_empno = make_centr_sub_empno;
	}

	public void setDd_nwsp_cont(String dd_nwsp_cont){
		this.dd_nwsp_cont = dd_nwsp_cont;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public int getSeq(){
		return this.seq;
	}

	public String getNight_shift_dt(){
		return this.night_shift_dt;
	}

	public String getDuty_main_empno(){
		return this.duty_main_empno;
	}

	public String getDuty_sub_empno(){
		return this.duty_sub_empno;
	}

	public String getMake_centr_main_empno(){
		return this.make_centr_main_empno;
	}

	public String getMake_centr_sub_empno(){
		return this.make_centr_sub_empno;
	}

	public String getDd_nwsp_cont(){
		return this.dd_nwsp_cont;
	}
}

/* 작성시간 : Mon Oct 31 16:09:58 KST 2016 */