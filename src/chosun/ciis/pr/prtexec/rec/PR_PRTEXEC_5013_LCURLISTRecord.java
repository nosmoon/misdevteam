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


package chosun.ciis.pr.prtexec.rec;

import java.sql.*;
import chosun.ciis.pr.prtexec.dm.*;
import chosun.ciis.pr.prtexec.ds.*;

/**
 * 
 */


public class PR_PRTEXEC_5013_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String prt_dt;
	public String issu_dt;
	public String fac_clsf;
	public String fac_clsf_nm;
	public String medi_cd;
	public String medi_nm;
	public String sect_cd;
	public String sect_nm;
	public String prt_clsf;
	public String prt_clsf_nm;
	public String issu_pcnt;
	public String pap_std;
	public String slip_qty;
	public String base_qty;
	public String inc_yn;
	public String matr_cd;
	public String matr_nm;

	public PR_PRTEXEC_5013_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setPrt_dt(String prt_dt){
		this.prt_dt = prt_dt;
	}

	public void setIssu_dt(String issu_dt){
		this.issu_dt = issu_dt;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_nm(String medi_nm){
		this.medi_nm = medi_nm;
	}

	public void setSect_cd(String sect_cd){
		this.sect_cd = sect_cd;
	}

	public void setSect_nm(String sect_nm){
		this.sect_nm = sect_nm;
	}

	public void setPrt_clsf(String prt_clsf){
		this.prt_clsf = prt_clsf;
	}

	public void setPrt_clsf_nm(String prt_clsf_nm){
		this.prt_clsf_nm = prt_clsf_nm;
	}

	public void setIssu_pcnt(String issu_pcnt){
		this.issu_pcnt = issu_pcnt;
	}

	public void setPap_std(String pap_std){
		this.pap_std = pap_std;
	}

	public void setSlip_qty(String slip_qty){
		this.slip_qty = slip_qty;
	}

	public void setBase_qty(String base_qty){
		this.base_qty = base_qty;
	}
	
	public void setInc_yn(String inc_yn){
		this.inc_yn = inc_yn;
	}
	
	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_nm(String matr_nm){
		this.matr_nm = matr_nm;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getPrt_dt(){
		return this.prt_dt;
	}

	public String getIssu_dt(){
		return this.issu_dt;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_nm(){
		return this.medi_nm;
	}

	public String getSect_cd(){
		return this.sect_cd;
	}

	public String getSect_nm(){
		return this.sect_nm;
	}

	public String getPrt_clsf(){
		return this.prt_clsf;
	}

	public String getPrt_clsf_nm(){
		return this.prt_clsf_nm;
	}

	public String getIssu_pcnt(){
		return this.issu_pcnt;
	}

	public String getPap_std(){
		return this.pap_std;
	}

	public String getSlip_qty(){
		return this.slip_qty;
	}

	public String getInc_yn(){
		return this.inc_yn;
	}
	public String getBase_qty(){
		return this.base_qty;
	}
	
	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_nm(){
		return this.matr_nm;
	}
}

/* 작성시간 : Tue Nov 17 17:10:48 KST 2009 */