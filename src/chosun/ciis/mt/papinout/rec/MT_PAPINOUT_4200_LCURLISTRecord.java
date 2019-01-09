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


package chosun.ciis.mt.papinout.rec;

import java.sql.*;
import chosun.ciis.mt.papinout.dm.*;
import chosun.ciis.mt.papinout.ds.*;

/**
 * 
 */


public class MT_PAPINOUT_4200_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String make_un_norm_occr_dt;
	public String fac_clsf;
	public String fac_nm;
	public String medi_cd;
	public String medi_nm;
	public String now_trad_cd;
	public String now_trad_nm;
	public String pj_rate;
	public String rela_dept;
	public String rela_dept_nm;
	public String caus_prd;
	public String caus_prd_nm;
	public String caus_midl;
	public String caus_midl_nm;
	public String caus_dtls;
	public String clos_clsf;
	public String remk;

	public MT_PAPINOUT_4200_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setMake_un_norm_occr_dt(String make_un_norm_occr_dt){
		this.make_un_norm_occr_dt = make_un_norm_occr_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_nm(String fac_nm){
		this.fac_nm = fac_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setNow_trad_cd(String now_trad_cd){
		this.now_trad_cd = now_trad_cd;
	}

	public void setNow_trad_nm(String now_trad_nm){
		this.now_trad_nm = now_trad_nm;
	}

	public void setPj_rate(String pj_rate){
		this.pj_rate = pj_rate;
	}

	public void setRela_dept(String rela_dept){
		this.rela_dept = rela_dept;
	}

	public void setRela_dept_nm(String rela_dept_nm){
		this.rela_dept_nm = rela_dept_nm;
	}

	public void setCaus_prd(String caus_prd){
		this.caus_prd = caus_prd;
	}

	public void setCaus_prd_nm(String caus_prd_nm){
		this.caus_prd_nm = caus_prd_nm;
	}

	public void setCaus_midl(String caus_midl){
		this.caus_midl = caus_midl;
	}

	public void setCaus_midl_nm(String caus_midl_nm){
		this.caus_midl_nm = caus_midl_nm;
	}

	public void setCaus_dtls(String caus_dtls){
		this.caus_dtls = caus_dtls;
	}

	public void setClos_clsf(String clos_clsf){
		this.clos_clsf = clos_clsf;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public String getMake_un_norm_occr_dt(){
		return this.make_un_norm_occr_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_nm(){
		return this.fac_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getNow_trad_cd(){
		return this.now_trad_cd;
	}

	public String getNow_trad_nm(){
		return this.now_trad_nm;
	}

	public String getPj_rate(){
		return this.pj_rate;
	}

	public String getRela_dept(){
		return this.rela_dept;
	}

	public String getRela_dept_nm(){
		return this.rela_dept_nm;
	}

	public String getCaus_prd(){
		return this.caus_prd;
	}

	public String getCaus_prd_nm(){
		return this.caus_prd_nm;
	}

	public String getCaus_midl(){
		return this.caus_midl;
	}

	public String getCaus_midl_nm(){
		return this.caus_midl_nm;
	}

	public String getCaus_dtls(){
		return this.caus_dtls;
	}

	public String getClos_clsf(){
		return this.clos_clsf;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Tue Apr 21 11:26:34 KST 2009 */