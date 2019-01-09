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


package chosun.ciis.hd.duty.rec;

import java.sql.*;
import chosun.ciis.hd.duty.dm.*;
import chosun.ciis.hd.duty.ds.*;

/**
 * 
 */


public class HD_DUTY_1002_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String clndr_dt;
	public String clndr_wkdy;
	public String hody_clsf;
	public String remk;

	public HD_DUTY_1002_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setClndr_dt(String clndr_dt){
		this.clndr_dt = clndr_dt;
	}

	public void setClndr_wkdy(String clndr_wkdy){
		this.clndr_wkdy = clndr_wkdy;
	}

	public void setHody_clsf(String hody_clsf){
		this.hody_clsf = hody_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getClndr_dt(){
		return this.clndr_dt;
	}

	public String getClndr_wkdy(){
		return this.clndr_wkdy;
	}

	public String getHody_clsf(){
		return this.hody_clsf;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Wed Mar 18 17:16:30 KST 2009 */