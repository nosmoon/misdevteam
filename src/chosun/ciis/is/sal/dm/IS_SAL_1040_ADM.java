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


package chosun.ciis.is.sal.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.sal.ds.*;
import chosun.ciis.is.sal.rec.*;

/**
 * 
 */


public class IS_SAL_1040_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String prof_type_cd;
	public String rcpm_plan_dt;
	public String suply_erplace_cd;
	public String make_dt;
	public String suply_amt;
	public String vat_amt;
	public String demand_ern;
	public String demand_dlco_no;
	public String demand_dlco_nm;
	public String demand_presi_nm;
	public String demand_addr;
	public String demand_bizcond;
	public String demand_item;
	public String checked;
	public String tax_item;
	public String medi_cd;
	public String vexc_cmpy_cd;
	public String a_acwr_reg_dt;
	public String a_acwr_reg_seq;
	public String a_suply_amt;
	public String email_id;
	public String elec_tax_comp_cd;
	public String semuro_no;
	public String biz_plc_cd;
	public String remk;
	public String remk1;
	public String incmg_dept_cd;
	public String incmg_pers_ip;
	public String incmg_pers;

	public IS_SAL_1040_ADM(){}
	public IS_SAL_1040_ADM(String cmpy_cd, String slip_clsf_cd, String slip_occr_dt, String prof_type_cd, String rcpm_plan_dt, String suply_erplace_cd, String make_dt, String suply_amt, String vat_amt, String demand_ern, String demand_dlco_no, String demand_dlco_nm, String demand_presi_nm, String demand_addr, String demand_bizcond, String demand_item, String checked, String tax_item, String medi_cd, String vexc_cmpy_cd, String a_acwr_reg_dt, String a_acwr_reg_seq, String a_suply_amt, String email_id, String elec_tax_comp_cd, String semuro_no, String biz_plc_cd, String remk, String remk1, String incmg_dept_cd, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.prof_type_cd = prof_type_cd;
		this.rcpm_plan_dt = rcpm_plan_dt;
		this.suply_erplace_cd = suply_erplace_cd;
		this.make_dt = make_dt;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.demand_ern = demand_ern;
		this.demand_dlco_no = demand_dlco_no;
		this.demand_dlco_nm = demand_dlco_nm;
		this.demand_presi_nm = demand_presi_nm;
		this.demand_addr = demand_addr;
		this.demand_bizcond = demand_bizcond;
		this.demand_item = demand_item;
		this.checked = checked;
		this.tax_item = tax_item;
		this.medi_cd = medi_cd;
		this.vexc_cmpy_cd = vexc_cmpy_cd;
		this.a_acwr_reg_dt = a_acwr_reg_dt;
		this.a_acwr_reg_seq = a_acwr_reg_seq;
		this.a_suply_amt = a_suply_amt;
		this.email_id = email_id;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.semuro_no = semuro_no;
		this.biz_plc_cd = biz_plc_cd;
		this.remk = remk;
		this.remk1 = remk1;
		this.incmg_dept_cd = incmg_dept_cd;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setRcpm_plan_dt(String rcpm_plan_dt){
		this.rcpm_plan_dt = rcpm_plan_dt;
	}

	public void setSuply_erplace_cd(String suply_erplace_cd){
		this.suply_erplace_cd = suply_erplace_cd;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setDemand_ern(String demand_ern){
		this.demand_ern = demand_ern;
	}

	public void setDemand_dlco_no(String demand_dlco_no){
		this.demand_dlco_no = demand_dlco_no;
	}

	public void setDemand_dlco_nm(String demand_dlco_nm){
		this.demand_dlco_nm = demand_dlco_nm;
	}

	public void setDemand_presi_nm(String demand_presi_nm){
		this.demand_presi_nm = demand_presi_nm;
	}

	public void setDemand_addr(String demand_addr){
		this.demand_addr = demand_addr;
	}

	public void setDemand_bizcond(String demand_bizcond){
		this.demand_bizcond = demand_bizcond;
	}

	public void setDemand_item(String demand_item){
		this.demand_item = demand_item;
	}

	public void setChecked(String checked){
		this.checked = checked;
	}

	public void setTax_item(String tax_item){
		this.tax_item = tax_item;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setVexc_cmpy_cd(String vexc_cmpy_cd){
		this.vexc_cmpy_cd = vexc_cmpy_cd;
	}

	public void setA_acwr_reg_dt(String a_acwr_reg_dt){
		this.a_acwr_reg_dt = a_acwr_reg_dt;
	}

	public void setA_acwr_reg_seq(String a_acwr_reg_seq){
		this.a_acwr_reg_seq = a_acwr_reg_seq;
	}

	public void setA_suply_amt(String a_suply_amt){
		this.a_suply_amt = a_suply_amt;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public void setElec_tax_comp_cd(String elec_tax_comp_cd){
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setBiz_plc_cd(String biz_plc_cd){
		this.biz_plc_cd = biz_plc_cd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setRemk1(String remk1){
		this.remk1 = remk1;
	}

	public void setIncmg_dept_cd(String incmg_dept_cd){
		this.incmg_dept_cd = incmg_dept_cd;
	}

	public void setIncmg_pers_ip(String incmg_pers_ip){
		this.incmg_pers_ip = incmg_pers_ip;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getRcpm_plan_dt(){
		return this.rcpm_plan_dt;
	}

	public String getSuply_erplace_cd(){
		return this.suply_erplace_cd;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getDemand_ern(){
		return this.demand_ern;
	}

	public String getDemand_dlco_no(){
		return this.demand_dlco_no;
	}

	public String getDemand_dlco_nm(){
		return this.demand_dlco_nm;
	}

	public String getDemand_presi_nm(){
		return this.demand_presi_nm;
	}

	public String getDemand_addr(){
		return this.demand_addr;
	}

	public String getDemand_bizcond(){
		return this.demand_bizcond;
	}

	public String getDemand_item(){
		return this.demand_item;
	}

	public String getChecked(){
		return this.checked;
	}

	public String getTax_item(){
		return this.tax_item;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getVexc_cmpy_cd(){
		return this.vexc_cmpy_cd;
	}

	public String getA_acwr_reg_dt(){
		return this.a_acwr_reg_dt;
	}

	public String getA_acwr_reg_seq(){
		return this.a_acwr_reg_seq;
	}

	public String getA_suply_amt(){
		return this.a_suply_amt;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getElec_tax_comp_cd(){
		return this.elec_tax_comp_cd;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getBiz_plc_cd(){
		return this.biz_plc_cd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getRemk1(){
		return this.remk1;
	}

	public String getIncmg_dept_cd(){
		return this.incmg_dept_cd;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISISP.SP_IS_SAL_1040_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		IS_SAL_1040_ADM dm = (IS_SAL_1040_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_clsf_cd);
		cstmt.setString(5, dm.slip_occr_dt);
		cstmt.setString(6, dm.prof_type_cd);
		cstmt.setString(7, dm.rcpm_plan_dt);
		cstmt.setString(8, dm.suply_erplace_cd);
		cstmt.setString(9, dm.make_dt);
		cstmt.setString(10, dm.suply_amt);
		cstmt.setString(11, dm.vat_amt);
		cstmt.setString(12, dm.demand_ern);
		cstmt.setString(13, dm.demand_dlco_no);
		cstmt.setString(14, dm.demand_dlco_nm);
		cstmt.setString(15, dm.demand_presi_nm);
		cstmt.setString(16, dm.demand_addr);
		cstmt.setString(17, dm.demand_bizcond);
		cstmt.setString(18, dm.demand_item);
		cstmt.setString(19, dm.checked);
		cstmt.setString(20, dm.tax_item);
		cstmt.setString(21, dm.medi_cd);
		cstmt.setString(22, dm.vexc_cmpy_cd);
		cstmt.setString(23, dm.a_acwr_reg_dt);
		cstmt.setString(24, dm.a_acwr_reg_seq);
		cstmt.setString(25, dm.a_suply_amt);
		cstmt.setString(26, dm.email_id);
		cstmt.setString(27, dm.elec_tax_comp_cd);
		cstmt.setString(28, dm.semuro_no);
		cstmt.setString(29, dm.biz_plc_cd);
		cstmt.setString(30, dm.remk);
		cstmt.setString(31, dm.remk1);
		cstmt.setString(32, dm.incmg_dept_cd);
		cstmt.setString(33, dm.incmg_pers_ip);
		cstmt.setString(34, dm.incmg_pers);
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, Types.VARCHAR);
		cstmt.registerOutParameter(38, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.is.sal.ds.IS_SAL_1040_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("rcpm_plan_dt = [" + getRcpm_plan_dt() + "]");
		System.out.println("suply_erplace_cd = [" + getSuply_erplace_cd() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("demand_ern = [" + getDemand_ern() + "]");
		System.out.println("demand_dlco_no = [" + getDemand_dlco_no() + "]");
		System.out.println("demand_dlco_nm = [" + getDemand_dlco_nm() + "]");
		System.out.println("demand_presi_nm = [" + getDemand_presi_nm() + "]");
		System.out.println("demand_addr = [" + getDemand_addr() + "]");
		System.out.println("demand_bizcond = [" + getDemand_bizcond() + "]");
		System.out.println("demand_item = [" + getDemand_item() + "]");
		System.out.println("checked = [" + getChecked() + "]");
		System.out.println("tax_item = [" + getTax_item() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("vexc_cmpy_cd = [" + getVexc_cmpy_cd() + "]");
		System.out.println("a_acwr_reg_dt = [" + getA_acwr_reg_dt() + "]");
		System.out.println("a_acwr_reg_seq = [" + getA_acwr_reg_seq() + "]");
		System.out.println("a_suply_amt = [" + getA_suply_amt() + "]");
		System.out.println("email_id = [" + getEmail_id() + "]");
		System.out.println("elec_tax_comp_cd = [" + getElec_tax_comp_cd() + "]");
		System.out.println("semuro_no = [" + getSemuro_no() + "]");
		System.out.println("biz_plc_cd = [" + getBiz_plc_cd() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("remk1 = [" + getRemk1() + "]");
		System.out.println("incmg_dept_cd = [" + getIncmg_dept_cd() + "]");
		System.out.println("incmg_pers_ip = [" + getIncmg_pers_ip() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String rcpm_plan_dt = req.getParameter("rcpm_plan_dt");
if( rcpm_plan_dt == null){
	System.out.println(this.toString+" : rcpm_plan_dt is null" );
}else{
	System.out.println(this.toString+" : rcpm_plan_dt is "+rcpm_plan_dt );
}
String suply_erplace_cd = req.getParameter("suply_erplace_cd");
if( suply_erplace_cd == null){
	System.out.println(this.toString+" : suply_erplace_cd is null" );
}else{
	System.out.println(this.toString+" : suply_erplace_cd is "+suply_erplace_cd );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String suply_amt = req.getParameter("suply_amt");
if( suply_amt == null){
	System.out.println(this.toString+" : suply_amt is null" );
}else{
	System.out.println(this.toString+" : suply_amt is "+suply_amt );
}
String vat_amt = req.getParameter("vat_amt");
if( vat_amt == null){
	System.out.println(this.toString+" : vat_amt is null" );
}else{
	System.out.println(this.toString+" : vat_amt is "+vat_amt );
}
String demand_ern = req.getParameter("demand_ern");
if( demand_ern == null){
	System.out.println(this.toString+" : demand_ern is null" );
}else{
	System.out.println(this.toString+" : demand_ern is "+demand_ern );
}
String demand_dlco_no = req.getParameter("demand_dlco_no");
if( demand_dlco_no == null){
	System.out.println(this.toString+" : demand_dlco_no is null" );
}else{
	System.out.println(this.toString+" : demand_dlco_no is "+demand_dlco_no );
}
String demand_dlco_nm = req.getParameter("demand_dlco_nm");
if( demand_dlco_nm == null){
	System.out.println(this.toString+" : demand_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : demand_dlco_nm is "+demand_dlco_nm );
}
String demand_presi_nm = req.getParameter("demand_presi_nm");
if( demand_presi_nm == null){
	System.out.println(this.toString+" : demand_presi_nm is null" );
}else{
	System.out.println(this.toString+" : demand_presi_nm is "+demand_presi_nm );
}
String demand_addr = req.getParameter("demand_addr");
if( demand_addr == null){
	System.out.println(this.toString+" : demand_addr is null" );
}else{
	System.out.println(this.toString+" : demand_addr is "+demand_addr );
}
String demand_bizcond = req.getParameter("demand_bizcond");
if( demand_bizcond == null){
	System.out.println(this.toString+" : demand_bizcond is null" );
}else{
	System.out.println(this.toString+" : demand_bizcond is "+demand_bizcond );
}
String demand_item = req.getParameter("demand_item");
if( demand_item == null){
	System.out.println(this.toString+" : demand_item is null" );
}else{
	System.out.println(this.toString+" : demand_item is "+demand_item );
}
String checked = req.getParameter("checked");
if( checked == null){
	System.out.println(this.toString+" : checked is null" );
}else{
	System.out.println(this.toString+" : checked is "+checked );
}
String tax_item = req.getParameter("tax_item");
if( tax_item == null){
	System.out.println(this.toString+" : tax_item is null" );
}else{
	System.out.println(this.toString+" : tax_item is "+tax_item );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String vexc_cmpy_cd = req.getParameter("vexc_cmpy_cd");
if( vexc_cmpy_cd == null){
	System.out.println(this.toString+" : vexc_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : vexc_cmpy_cd is "+vexc_cmpy_cd );
}
String a_acwr_reg_dt = req.getParameter("a_acwr_reg_dt");
if( a_acwr_reg_dt == null){
	System.out.println(this.toString+" : a_acwr_reg_dt is null" );
}else{
	System.out.println(this.toString+" : a_acwr_reg_dt is "+a_acwr_reg_dt );
}
String a_acwr_reg_seq = req.getParameter("a_acwr_reg_seq");
if( a_acwr_reg_seq == null){
	System.out.println(this.toString+" : a_acwr_reg_seq is null" );
}else{
	System.out.println(this.toString+" : a_acwr_reg_seq is "+a_acwr_reg_seq );
}
String a_suply_amt = req.getParameter("a_suply_amt");
if( a_suply_amt == null){
	System.out.println(this.toString+" : a_suply_amt is null" );
}else{
	System.out.println(this.toString+" : a_suply_amt is "+a_suply_amt );
}
String email_id = req.getParameter("email_id");
if( email_id == null){
	System.out.println(this.toString+" : email_id is null" );
}else{
	System.out.println(this.toString+" : email_id is "+email_id );
}
String elec_tax_comp_cd = req.getParameter("elec_tax_comp_cd");
if( elec_tax_comp_cd == null){
	System.out.println(this.toString+" : elec_tax_comp_cd is null" );
}else{
	System.out.println(this.toString+" : elec_tax_comp_cd is "+elec_tax_comp_cd );
}
String semuro_no = req.getParameter("semuro_no");
if( semuro_no == null){
	System.out.println(this.toString+" : semuro_no is null" );
}else{
	System.out.println(this.toString+" : semuro_no is "+semuro_no );
}
String biz_plc_cd = req.getParameter("biz_plc_cd");
if( biz_plc_cd == null){
	System.out.println(this.toString+" : biz_plc_cd is null" );
}else{
	System.out.println(this.toString+" : biz_plc_cd is "+biz_plc_cd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String remk1 = req.getParameter("remk1");
if( remk1 == null){
	System.out.println(this.toString+" : remk1 is null" );
}else{
	System.out.println(this.toString+" : remk1 is "+remk1 );
}
String incmg_dept_cd = req.getParameter("incmg_dept_cd");
if( incmg_dept_cd == null){
	System.out.println(this.toString+" : incmg_dept_cd is null" );
}else{
	System.out.println(this.toString+" : incmg_dept_cd is "+incmg_dept_cd );
}
String incmg_pers_ip = req.getParameter("incmg_pers_ip");
if( incmg_pers_ip == null){
	System.out.println(this.toString+" : incmg_pers_ip is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ip is "+incmg_pers_ip );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String rcpm_plan_dt = Util.checkString(req.getParameter("rcpm_plan_dt"));
String suply_erplace_cd = Util.checkString(req.getParameter("suply_erplace_cd"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String demand_ern = Util.checkString(req.getParameter("demand_ern"));
String demand_dlco_no = Util.checkString(req.getParameter("demand_dlco_no"));
String demand_dlco_nm = Util.checkString(req.getParameter("demand_dlco_nm"));
String demand_presi_nm = Util.checkString(req.getParameter("demand_presi_nm"));
String demand_addr = Util.checkString(req.getParameter("demand_addr"));
String demand_bizcond = Util.checkString(req.getParameter("demand_bizcond"));
String demand_item = Util.checkString(req.getParameter("demand_item"));
String checked = Util.checkString(req.getParameter("checked"));
String tax_item = Util.checkString(req.getParameter("tax_item"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String vexc_cmpy_cd = Util.checkString(req.getParameter("vexc_cmpy_cd"));
String a_acwr_reg_dt = Util.checkString(req.getParameter("a_acwr_reg_dt"));
String a_acwr_reg_seq = Util.checkString(req.getParameter("a_acwr_reg_seq"));
String a_suply_amt = Util.checkString(req.getParameter("a_suply_amt"));
String email_id = Util.checkString(req.getParameter("email_id"));
String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
String semuro_no = Util.checkString(req.getParameter("semuro_no"));
String biz_plc_cd = Util.checkString(req.getParameter("biz_plc_cd"));
String remk = Util.checkString(req.getParameter("remk"));
String remk1 = Util.checkString(req.getParameter("remk1"));
String incmg_dept_cd = Util.checkString(req.getParameter("incmg_dept_cd"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String rcpm_plan_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_plan_dt")));
String suply_erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_erplace_cd")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String demand_ern = Util.Uni2Ksc(Util.checkString(req.getParameter("demand_ern")));
String demand_dlco_no = Util.Uni2Ksc(Util.checkString(req.getParameter("demand_dlco_no")));
String demand_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("demand_dlco_nm")));
String demand_presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("demand_presi_nm")));
String demand_addr = Util.Uni2Ksc(Util.checkString(req.getParameter("demand_addr")));
String demand_bizcond = Util.Uni2Ksc(Util.checkString(req.getParameter("demand_bizcond")));
String demand_item = Util.Uni2Ksc(Util.checkString(req.getParameter("demand_item")));
String checked = Util.Uni2Ksc(Util.checkString(req.getParameter("checked")));
String tax_item = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_item")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String vexc_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("vexc_cmpy_cd")));
String a_acwr_reg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_acwr_reg_dt")));
String a_acwr_reg_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("a_acwr_reg_seq")));
String a_suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("a_suply_amt")));
String email_id = Util.Uni2Ksc(Util.checkString(req.getParameter("email_id")));
String elec_tax_comp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_comp_cd")));
String semuro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_no")));
String biz_plc_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_plc_cd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String remk1 = Util.Uni2Ksc(Util.checkString(req.getParameter("remk1")));
String incmg_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dept_cd")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setProf_type_cd(prof_type_cd);
dm.setRcpm_plan_dt(rcpm_plan_dt);
dm.setSuply_erplace_cd(suply_erplace_cd);
dm.setMake_dt(make_dt);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setDemand_ern(demand_ern);
dm.setDemand_dlco_no(demand_dlco_no);
dm.setDemand_dlco_nm(demand_dlco_nm);
dm.setDemand_presi_nm(demand_presi_nm);
dm.setDemand_addr(demand_addr);
dm.setDemand_bizcond(demand_bizcond);
dm.setDemand_item(demand_item);
dm.setChecked(checked);
dm.setTax_item(tax_item);
dm.setMedi_cd(medi_cd);
dm.setVexc_cmpy_cd(vexc_cmpy_cd);
dm.setA_acwr_reg_dt(a_acwr_reg_dt);
dm.setA_acwr_reg_seq(a_acwr_reg_seq);
dm.setA_suply_amt(a_suply_amt);
dm.setEmail_id(email_id);
dm.setElec_tax_comp_cd(elec_tax_comp_cd);
dm.setSemuro_no(semuro_no);
dm.setBiz_plc_cd(biz_plc_cd);
dm.setRemk(remk);
dm.setRemk1(remk1);
dm.setIncmg_dept_cd(incmg_dept_cd);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 04 14:58:56 KST 2013 */