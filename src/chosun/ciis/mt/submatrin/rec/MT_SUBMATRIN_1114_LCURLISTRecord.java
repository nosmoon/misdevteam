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


package chosun.ciis.mt.submatrin.rec;

import java.sql.*;
import chosun.ciis.mt.submatrin.dm.*;
import chosun.ciis.mt.submatrin.ds.*;

/**
 * 
 */


public class MT_SUBMATRIN_1114_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String ewh_dt;
	public String ewh_no;
	public String purc_clsf;
	public String ewh_title;
	public String fac_clsf_nm;
	public String dlco_nm;
	public String amt;
	public String make_dt;
	public String clos_proc_dt;

	public MT_SUBMATRIN_1114_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setEwh_no(String ewh_no){
		this.ewh_no = ewh_no;
	}
	
	public void setPurc_clsf(String purc_clsf){
		this.purc_clsf = purc_clsf;
	}

	public void setEwh_title(String ewh_title){
		this.ewh_title = ewh_title;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setClos_proc_dt(String clos_proc_dt){
		this.clos_proc_dt = clos_proc_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getEwh_no(){
		return this.ewh_no;
	}
	
	public String getPurc_clsf(){
		return this.purc_clsf;
	}

	public String getEwh_title(){
		return this.ewh_title;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getClos_proc_dt(){
		return this.clos_proc_dt;
	}
}

/* 작성시간 : Wed Aug 19 21:58:32 KST 2009 */