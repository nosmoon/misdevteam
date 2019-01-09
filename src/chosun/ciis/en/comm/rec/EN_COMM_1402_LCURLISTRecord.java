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


package chosun.ciis.en.comm.rec;

import java.sql.*;
import chosun.ciis.en.comm.dm.*;
import chosun.ciis.en.comm.ds.*;

/**
 * 
 */


public class EN_COMM_1402_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rcpm_shet_kind;
	public String rcpm_shet_no;
	public String rcpm_clsf;
	public String widr_resn;
	public String rcpm_shet_stat;
	public String rcpm_shet_dlv_dt;
	public String widr_dt;

	public EN_COMM_1402_LCURLISTRecord(){}

	public void setRcpm_shet_kind(String rcpm_shet_kind){
		this.rcpm_shet_kind = rcpm_shet_kind;
	}

	public void setRcpm_shet_no(String rcpm_shet_no){
		this.rcpm_shet_no = rcpm_shet_no;
	}

	public void setRcpm_clsf(String rcpm_clsf){
		this.rcpm_clsf = rcpm_clsf;
	}

	public void setWidr_resn(String widr_resn){
		this.widr_resn = widr_resn;
	}

	public void setRcpm_shet_stat(String rcpm_shet_stat){
		this.rcpm_shet_stat = rcpm_shet_stat;
	}

	public void setRcpm_shet_dlv_dt(String rcpm_shet_dlv_dt){
		this.rcpm_shet_dlv_dt = rcpm_shet_dlv_dt;
	}

	public void setWidr_dt(String widr_dt){
		this.widr_dt = widr_dt;
	}

	public String getRcpm_shet_kind(){
		return this.rcpm_shet_kind;
	}

	public String getRcpm_shet_no(){
		return this.rcpm_shet_no;
	}

	public String getRcpm_clsf(){
		return this.rcpm_clsf;
	}

	public String getWidr_resn(){
		return this.widr_resn;
	}

	public String getRcpm_shet_stat(){
		return this.rcpm_shet_stat;
	}

	public String getRcpm_shet_dlv_dt(){
		return this.rcpm_shet_dlv_dt;
	}

	public String getWidr_dt(){
		return this.widr_dt;
	}
}

/* 작성시간 : Mon Jun 15 13:58:54 KST 2009 */