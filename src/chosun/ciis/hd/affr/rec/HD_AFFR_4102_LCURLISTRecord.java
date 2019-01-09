/***************************************************************************************************
* 파일명		: 
* 기능		:
* 작성일자	: 
* 작성자		: 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역	: 
* 수정자		:   
* 수정일자	: 
* 백업		: 
***************************************************************************************************/


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 *
 */

public class HD_AFFR_4102_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String chk;
	public String dept_nm;
	public String emp_no;
	public String nm_korn;
	public String dty_nm;
	public String posi_nm;
	public String in_cmpy_dt;
	public String lvcmpy_dt;
	public String frdt;
	public String stop_dt;
	public String cont_svc_yys;
	public String rest_vaca_yys_clsf;
	public String base_pont;
	public String faml_pont;
	public String cont_svc_pont;
	public String rest_pont;
	public String dty_taem_chf_un_norm;
	public String dty_comite_memb;
	public String pont_tot;
	public String use_pont;
	public String rsrt_amt;
	public String dept_cd;
	public String dty_cd;
	public String posi_cd;
	public String cmpy_cd;
	public String aply_yy;
	public String db_status;

	public HD_AFFR_4102_LCURLISTRecord(){}

	public void setChk(String chk){
		this.chk = chk;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setNm_korn(String nm_korn){
		this.nm_korn = nm_korn;
	}

	public void setDty_nm(String dty_nm){
		this.dty_nm = dty_nm;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setIn_cmpy_dt(String in_cmpy_dt){
		this.in_cmpy_dt = in_cmpy_dt;
	}

	public void setLvcmpy_dt(String lvcmpy_dt){
		this.lvcmpy_dt = lvcmpy_dt;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setStop_dt(String stop_dt){
		this.stop_dt = stop_dt;
	}

	public void setCont_svc_yys(String cont_svc_yys){
		this.cont_svc_yys = cont_svc_yys;
	}

	public void setRest_vaca_yys_clsf(String rest_vaca_yys_clsf){
		this.rest_vaca_yys_clsf = rest_vaca_yys_clsf;
	}

	public void setBase_pont(String base_pont){
		this.base_pont = base_pont;
	}

	public void setFaml_pont(String faml_pont){
		this.faml_pont = faml_pont;
	}

	public void setCont_svc_pont(String cont_svc_pont){
		this.cont_svc_pont = cont_svc_pont;
	}

	public void setRest_pont(String rest_pont){
		this.rest_pont = rest_pont;
	}

	public void setDty_taem_chf_un_norm(String dty_taem_chf_un_norm){
		this.dty_taem_chf_un_norm = dty_taem_chf_un_norm;
	}

	public void setDty_comite_memb(String dty_comite_memb){
		this.dty_comite_memb = dty_comite_memb;
	}

	public void setPont_tot(String pont_tot){
		this.pont_tot = pont_tot;
	}

	public void setUse_pont(String use_pont){
		this.use_pont = use_pont;
	}

	public void setRsrt_amt(String rsrt_amt){
		this.rsrt_amt = rsrt_amt;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDty_cd(String dty_cd){
		this.dty_cd = dty_cd;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setAply_yy(String aply_yy){
		this.aply_yy = aply_yy;
	}

	public void setDb_status(String db_status){
		this.db_status = db_status;
	}

	public String getChk(){
		return this.chk;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getNm_korn(){
		return this.nm_korn;
	}

	public String getDty_nm(){
		return this.dty_nm;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getIn_cmpy_dt(){
		return this.in_cmpy_dt;
	}

	public String getLvcmpy_dt(){
		return this.lvcmpy_dt;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getStop_dt(){
		return this.stop_dt;
	}

	public String getCont_svc_yys(){
		return this.cont_svc_yys;
	}

	public String getRest_vaca_yys_clsf(){
		return this.rest_vaca_yys_clsf;
	}

	public String getBase_pont(){
		return this.base_pont;
	}

	public String getFaml_pont(){
		return this.faml_pont;
	}

	public String getCont_svc_pont(){
		return this.cont_svc_pont;
	}

	public String getRest_pont(){
		return this.rest_pont;
	}

	public String getDty_taem_chf_un_norm(){
		return this.dty_taem_chf_un_norm;
	}

	public String getDty_comite_memb(){
		return this.dty_comite_memb;
	}

	public String getPont_tot(){
		return this.pont_tot;
	}

	public String getUse_pont(){
		return this.use_pont;
	}

	public String getRsrt_amt(){
		return this.rsrt_amt;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDty_cd(){
		return this.dty_cd;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getAply_yy(){
		return this.aply_yy;
	}

	public String getDb_status(){
		return this.db_status;
	}
}

/* 작성시간 : Fri Jul 10 11:52:46 KST 2009 */