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


package chosun.ciis.hd.saly.rec;

import java.sql.*;
import chosun.ciis.hd.saly.dm.*;
import chosun.ciis.hd.saly.ds.*;

/**
 * 
 */


public class HD_SALY_4301_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String dept_cd;
	public String dept_nm;
	public String nm_korn;
	public String dty_cd;
	public String dty_nm;
	public String posi_cd;
	public String posi_nm;
	public String acpn_yy;
	public String acpn_seq;
	public String acpn_dt;
	public String flnm;
	public String now_seiz_clsf;
	public String fst_seiz_clsf;
	public String seiz_deci_dt;
	public String seiz_clsf_chg_dt;
	public String crdtor;
	public String seiz_clam_amt;
	public String seiz_dduc_ratio;
	public String seiz_bgn_saly_yy;
	public String seiz_bgn_saly_no;
	public String dduc_amt_agg;
	public String repay_amt_agg;
	public String psdo_seiz_rels_dt;
	public String dduc_end_yn;
	public String dduc_end_dt;
	public String repay_end_yn;
	public String repay_end_dt;

	public HD_SALY_4301_LCURLISTRecord(){}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setAcpn_yy(String acpn_yy){
		this.acpn_yy = acpn_yy;
	}

	public void setAcpn_seq(String acpn_seq){
		this.acpn_seq = acpn_seq;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setNow_seiz_clsf(String now_seiz_clsf){
		this.now_seiz_clsf = now_seiz_clsf;
	}

	public void setFst_seiz_clsf(String fst_seiz_clsf){
		this.fst_seiz_clsf = fst_seiz_clsf;
	}

	public void setSeiz_deci_dt(String seiz_deci_dt){
		this.seiz_deci_dt = seiz_deci_dt;
	}

	public void setSeiz_clsf_chg_dt(String seiz_clsf_chg_dt){
		this.seiz_clsf_chg_dt = seiz_clsf_chg_dt;
	}

	public void setCrdtor(String crdtor){
		this.crdtor = crdtor;
	}

	public void setSeiz_clam_amt(String seiz_clam_amt){
		this.seiz_clam_amt = seiz_clam_amt;
	}

	public void setSeiz_dduc_ratio(String seiz_dduc_ratio){
		this.seiz_dduc_ratio = seiz_dduc_ratio;
	}

	public void setSeiz_bgn_saly_yy(String seiz_bgn_saly_yy){
		this.seiz_bgn_saly_yy = seiz_bgn_saly_yy;
	}

	public void setSeiz_bgn_saly_no(String seiz_bgn_saly_no){
		this.seiz_bgn_saly_no = seiz_bgn_saly_no;
	}

	public void setDduc_amt_agg(String dduc_amt_agg){
		this.dduc_amt_agg = dduc_amt_agg;
	}

	public void setRepay_amt_agg(String repay_amt_agg){
		this.repay_amt_agg = repay_amt_agg;
	}

	public void setPsdo_seiz_rels_dt(String psdo_seiz_rels_dt){
		this.psdo_seiz_rels_dt = psdo_seiz_rels_dt;
	}

	public void setDduc_end_yn(String dduc_end_yn){
		this.dduc_end_yn = dduc_end_yn;
	}

	public void setDduc_end_dt(String dduc_end_dt){
		this.dduc_end_dt = dduc_end_dt;
	}

	public void setRepay_end_yn(String repay_end_yn){
		this.repay_end_yn = repay_end_yn;
	}

	public void setRepay_end_dt(String repay_end_dt){
		this.repay_end_dt = repay_end_dt;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getAcpn_yy(){
		return this.acpn_yy;
	}

	public String getAcpn_seq(){
		return this.acpn_seq;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getNow_seiz_clsf(){
		return this.now_seiz_clsf;
	}

	public String getFst_seiz_clsf(){
		return this.fst_seiz_clsf;
	}

	public String getSeiz_deci_dt(){
		return this.seiz_deci_dt;
	}

	public String getSeiz_clsf_chg_dt(){
		return this.seiz_clsf_chg_dt;
	}

	public String getCrdtor(){
		return this.crdtor;
	}

	public String getSeiz_clam_amt(){
		return this.seiz_clam_amt;
	}

	public String getSeiz_dduc_ratio(){
		return this.seiz_dduc_ratio;
	}

	public String getSeiz_bgn_saly_yy(){
		return this.seiz_bgn_saly_yy;
	}

	public String getSeiz_bgn_saly_no(){
		return this.seiz_bgn_saly_no;
	}

	public String getDduc_amt_agg(){
		return this.dduc_amt_agg;
	}

	public String getRepay_amt_agg(){
		return this.repay_amt_agg;
	}

	public String getPsdo_seiz_rels_dt(){
		return this.psdo_seiz_rels_dt;
	}

	public String getDduc_end_yn(){
		return this.dduc_end_yn;
	}

	public String getDduc_end_dt(){
		return this.dduc_end_dt;
	}

	public String getRepay_end_yn(){
		return this.repay_end_yn;
	}

	public String getRepay_end_dt(){
		return this.repay_end_dt;
	}
}

/* 작성시간 : Wed May 20 13:20:16 KST 2009 */