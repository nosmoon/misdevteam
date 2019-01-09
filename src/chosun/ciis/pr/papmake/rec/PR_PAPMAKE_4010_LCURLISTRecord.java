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


package chosun.ciis.pr.papmake.rec;

import java.sql.*;
import chosun.ciis.pr.papmake.dm.*;
import chosun.ciis.pr.papmake.ds.*;

/**
 * 
 */


public class PR_PAPMAKE_4010_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String yymm;
	public String sub_cmpy_clsf;
	public String fac_clsf_nm;
	public String base_prt_servcost;
	public String addm_prt_servcost;
	public String sep_prt_servcost;
	public String total;
	public String base_make_servcost;
	public String addm_make_servcost;
	public String crps_cost;
	public String slip_clsf;
	public String slip_proc_occr_dt;
	public String slip_proc_seq;
	public String tax_stmt_dt;
	public String tax_stmt_seq;

	public PR_PAPMAKE_4010_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setSub_cmpy_clsf(String sub_cmpy_clsf){
		this.sub_cmpy_clsf = sub_cmpy_clsf;
	}

	public void setFac_clsf_nm(String fac_clsf_nm){
		this.fac_clsf_nm = fac_clsf_nm;
	}

	public void setBase_prt_servcost(String base_prt_servcost){
		this.base_prt_servcost = base_prt_servcost;
	}

	public void setAddm_prt_servcost(String addm_prt_servcost){
		this.addm_prt_servcost = addm_prt_servcost;
	}

	public void setSep_prt_servcost(String sep_prt_servcost){
		this.sep_prt_servcost = sep_prt_servcost;
	}

	public void setTotal(String total){
		this.total = total;
	}

	public void setBase_make_servcost(String base_make_servcost){
		this.base_make_servcost = base_make_servcost;
	}

	public void setAddm_make_servcost(String addm_make_servcost){
		this.addm_make_servcost = addm_make_servcost;
	}
	
	public void setCrps_cost(String crps_cost){
		this.crps_cost = crps_cost;
	}

	public void setSlip_clsf(String slip_clsf){
		this.slip_clsf = slip_clsf;
	}

	public void setSlip_proc_occr_dt(String slip_proc_occr_dt){
		this.slip_proc_occr_dt = slip_proc_occr_dt;
	}

	public void setSlip_proc_seq(String slip_proc_seq){
		this.slip_proc_seq = slip_proc_seq;
	}

	public void setTax_stmt_dt(String tax_stmt_dt){
		this.tax_stmt_dt = tax_stmt_dt;
	}

	public void setTax_stmt_seq(String tax_stmt_seq){
		this.tax_stmt_seq = tax_stmt_seq;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getSub_cmpy_clsf(){
		return this.sub_cmpy_clsf;
	}

	public String getFac_clsf_nm(){
		return this.fac_clsf_nm;
	}

	public String getBase_prt_servcost(){
		return this.base_prt_servcost;
	}

	public String getAddm_prt_servcost(){
		return this.addm_prt_servcost;
	}

	public String getSep_prt_servcost(){
		return this.sep_prt_servcost;
	}

	public String getTotal(){
		return this.total;
	}

	public String getBase_make_servcost(){
		return this.base_make_servcost;
	}

	public String getAddm_make_servcost(){
		return this.addm_make_servcost;
	}
	
	public String getCrps_cost(){
		return this.crps_cost;
	}

	public String getSlip_clsf(){
		return this.slip_clsf;
	}

	public String getSlip_proc_occr_dt(){
		return this.slip_proc_occr_dt;
	}

	public String getSlip_proc_seq(){
		return this.slip_proc_seq;
	}

	public String getTax_stmt_dt(){
		return this.tax_stmt_dt;
	}

	public String getTax_stmt_seq(){
		return this.tax_stmt_seq;
	}
}

/* 작성시간 : Sun Jun 14 16:36:54 KST 2009 */