/***************************************************************************************************
* 파일명 : SE_SND_1910_LTRANLISTRecord.java
* 기능 : 판매-발송관리-발송마스터
* 작성일자 : 2009-02-09
* 작성자 : 김대준
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.se.snd.rec;

import java.sql.*;
import chosun.ciis.se.snd.dm.*;
import chosun.ciis.se.snd.ds.*;

/**
 * 
 */


public class SE_SND_1910_LTRANLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String route_clsf;
	public String route_clsf_nm;
	public String tran_cmpy_nm;
	public String tran_cost;
	public String tel_no;
	public String ptph_no;
	public String cntr_dt;
	public String cctr_dt;

	public SE_SND_1910_LTRANLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setRoute_clsf(String route_clsf){
		this.route_clsf = route_clsf;
	}

	public void setTran_cmpy_nm(String tran_cmpy_nm){
		this.tran_cmpy_nm = tran_cmpy_nm;
	}

	public void setTran_cost(String tran_cost){
		this.tran_cost = tran_cost;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setCntr_dt(String cntr_dt){
		this.cntr_dt = cntr_dt;
	}

	public void setCctr_dt(String cctr_dt){
		this.cctr_dt = cctr_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getRoute_clsf(){
		return this.route_clsf;
	}

	public String getTran_cmpy_nm(){
		return this.tran_cmpy_nm;
	}

	public String getTran_cost(){
		return this.tran_cost;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getCntr_dt(){
		return this.cntr_dt;
	}

	public String getCctr_dt(){
		return this.cctr_dt;
	}

	public String getRoute_clsf_nm() {
		return route_clsf_nm;
	}

	public void setRoute_clsf_nm(String route_clsf_nm) {
		this.route_clsf_nm = route_clsf_nm;
	}
}

/* 작성시간 : Mon Feb 09 10:18:19 KST 2009 */