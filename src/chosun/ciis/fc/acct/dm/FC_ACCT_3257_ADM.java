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


package chosun.ciis.fc.acct.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.ds.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_3257_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String prof_type_cd;
	public String slip_clsf_cd;
	public String slip_occr_dt;
	public String slip_seq;
	public String occr_slip_occr_dt;
	public String occr_slip_clsf_cd;
	public String occr_slip_seq;
	public String occr_slip_sub_seq;
	public String occr_slip_arow_no;
	public String make_dt;
	public String erplace_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String deal_clsf;
	public String ern;
	public String dlco_nm;
	public String presi_nm;
	public String addr;
	public String bizcond;
	public String item;
	public String suply_amt;
	public String vat_amt;
	public String tax_stmt_aprv_yn;
	public String decl_yn;
	public String decl_qq;
	public String make_upd_dt;
	public String upd_tms;
	public String last_upd_dd;
	public String issu_pers_emp_no;
	public String issu_tms;
	public String incmg_dt_tm;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String canc_yn;
	public String canc_dt;
	public String del_resn;
	public String mode;
	public String slip_arow_no;
	public String mmdd;
	public String item1;
	public String std;
	public String qunt;
	public String uprc;
	public String suply_amt1;
	public String vat_amt1;
	public String semuro_no;
	public String elec_tax_comp_cd;
	public String email_id;

	public FC_ACCT_3257_ADM(){}
	public FC_ACCT_3257_ADM(String cmpy_cd, String prof_type_cd, String slip_clsf_cd, String slip_occr_dt, String slip_seq, String occr_slip_occr_dt, String occr_slip_clsf_cd, String occr_slip_seq, String occr_slip_sub_seq, String occr_slip_arow_no, String make_dt, String erplace_cd, String dlco_clsf_cd, String dlco_cd, String deal_clsf, String ern, String dlco_nm, String presi_nm, String addr, String bizcond, String item, String suply_amt, String vat_amt, String tax_stmt_aprv_yn, String decl_yn, String decl_qq, String make_upd_dt, String upd_tms, String last_upd_dd, String issu_pers_emp_no, String issu_tms, String incmg_dt_tm, String incmg_pers, String incmg_pers_ipadd, String canc_yn, String canc_dt, String del_resn, String mode, String slip_arow_no, String mmdd, String item1, String std, String qunt, String uprc, String suply_amt1, String vat_amt1, String semuro_no, String elec_tax_comp_cd, String email_id){
		this.cmpy_cd = cmpy_cd;
		this.prof_type_cd = prof_type_cd;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_seq = slip_seq;
		this.occr_slip_occr_dt = occr_slip_occr_dt;
		this.occr_slip_clsf_cd = occr_slip_clsf_cd;
		this.occr_slip_seq = occr_slip_seq;
		this.occr_slip_sub_seq = occr_slip_sub_seq;
		this.occr_slip_arow_no = occr_slip_arow_no;
		this.make_dt = make_dt;
		this.erplace_cd = erplace_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.deal_clsf = deal_clsf;
		this.ern = ern;
		this.dlco_nm = dlco_nm;
		this.presi_nm = presi_nm;
		this.addr = addr;
		this.bizcond = bizcond;
		this.item = item;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.tax_stmt_aprv_yn = tax_stmt_aprv_yn;
		this.decl_yn = decl_yn;
		this.decl_qq = decl_qq;
		this.make_upd_dt = make_upd_dt;
		this.upd_tms = upd_tms;
		this.last_upd_dd = last_upd_dd;
		this.issu_pers_emp_no = issu_pers_emp_no;
		this.issu_tms = issu_tms;
		this.incmg_dt_tm = incmg_dt_tm;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.canc_yn = canc_yn;
		this.canc_dt = canc_dt;
		this.del_resn = del_resn;
		this.mode = mode;
		this.slip_arow_no = slip_arow_no;
		this.mmdd = mmdd;
		this.item1 = item1;
		this.std = std;
		this.qunt = qunt;
		this.uprc = uprc;
		this.suply_amt1 = suply_amt1;
		this.vat_amt1 = vat_amt1;
		this.semuro_no = semuro_no;
		this.elec_tax_comp_cd = elec_tax_comp_cd;
		this.email_id = email_id;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setOccr_slip_occr_dt(String occr_slip_occr_dt){
		this.occr_slip_occr_dt = occr_slip_occr_dt;
	}

	public void setOccr_slip_clsf_cd(String occr_slip_clsf_cd){
		this.occr_slip_clsf_cd = occr_slip_clsf_cd;
	}

	public void setOccr_slip_seq(String occr_slip_seq){
		this.occr_slip_seq = occr_slip_seq;
	}

	public void setOccr_slip_sub_seq(String occr_slip_sub_seq){
		this.occr_slip_sub_seq = occr_slip_sub_seq;
	}

	public void setOccr_slip_arow_no(String occr_slip_arow_no){
		this.occr_slip_arow_no = occr_slip_arow_no;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDeal_clsf(String deal_clsf){
		this.deal_clsf = deal_clsf;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setPresi_nm(String presi_nm){
		this.presi_nm = presi_nm;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setBizcond(String bizcond){
		this.bizcond = bizcond;
	}

	public void setItem(String item){
		this.item = item;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setTax_stmt_aprv_yn(String tax_stmt_aprv_yn){
		this.tax_stmt_aprv_yn = tax_stmt_aprv_yn;
	}

	public void setDecl_yn(String decl_yn){
		this.decl_yn = decl_yn;
	}

	public void setDecl_qq(String decl_qq){
		this.decl_qq = decl_qq;
	}

	public void setMake_upd_dt(String make_upd_dt){
		this.make_upd_dt = make_upd_dt;
	}

	public void setUpd_tms(String upd_tms){
		this.upd_tms = upd_tms;
	}

	public void setLast_upd_dd(String last_upd_dd){
		this.last_upd_dd = last_upd_dd;
	}

	public void setIssu_pers_emp_no(String issu_pers_emp_no){
		this.issu_pers_emp_no = issu_pers_emp_no;
	}

	public void setIssu_tms(String issu_tms){
		this.issu_tms = issu_tms;
	}

	public void setIncmg_dt_tm(String incmg_dt_tm){
		this.incmg_dt_tm = incmg_dt_tm;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setCanc_yn(String canc_yn){
		this.canc_yn = canc_yn;
	}

	public void setCanc_dt(String canc_dt){
		this.canc_dt = canc_dt;
	}

	public void setDel_resn(String del_resn){
		this.del_resn = del_resn;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setMmdd(String mmdd){
		this.mmdd = mmdd;
	}

	public void setItem1(String item1){
		this.item1 = item1;
	}

	public void setStd(String std){
		this.std = std;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setSuply_amt1(String suply_amt1){
		this.suply_amt1 = suply_amt1;
	}

	public void setVat_amt1(String vat_amt1){
		this.vat_amt1 = vat_amt1;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}

	public void setElec_tax_comp_cd(String elec_tax_comp_cd){
		this.elec_tax_comp_cd = elec_tax_comp_cd;
	}

	public void setEmail_id(String email_id){
		this.email_id = email_id;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getOccr_slip_occr_dt(){
		return this.occr_slip_occr_dt;
	}

	public String getOccr_slip_clsf_cd(){
		return this.occr_slip_clsf_cd;
	}

	public String getOccr_slip_seq(){
		return this.occr_slip_seq;
	}

	public String getOccr_slip_sub_seq(){
		return this.occr_slip_sub_seq;
	}

	public String getOccr_slip_arow_no(){
		return this.occr_slip_arow_no;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDeal_clsf(){
		return this.deal_clsf;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getPresi_nm(){
		return this.presi_nm;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getBizcond(){
		return this.bizcond;
	}

	public String getItem(){
		return this.item;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getTax_stmt_aprv_yn(){
		return this.tax_stmt_aprv_yn;
	}

	public String getDecl_yn(){
		return this.decl_yn;
	}

	public String getDecl_qq(){
		return this.decl_qq;
	}

	public String getMake_upd_dt(){
		return this.make_upd_dt;
	}

	public String getUpd_tms(){
		return this.upd_tms;
	}

	public String getLast_upd_dd(){
		return this.last_upd_dd;
	}

	public String getIssu_pers_emp_no(){
		return this.issu_pers_emp_no;
	}

	public String getIssu_tms(){
		return this.issu_tms;
	}

	public String getIncmg_dt_tm(){
		return this.incmg_dt_tm;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getCanc_yn(){
		return this.canc_yn;
	}

	public String getCanc_dt(){
		return this.canc_dt;
	}

	public String getDel_resn(){
		return this.del_resn;
	}

	public String getMode(){
		return this.mode;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getMmdd(){
		return this.mmdd;
	}

	public String getItem1(){
		return this.item1;
	}

	public String getStd(){
		return this.std;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getSuply_amt1(){
		return this.suply_amt1;
	}

	public String getVat_amt1(){
		return this.vat_amt1;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}

	public String getElec_tax_comp_cd(){
		return this.elec_tax_comp_cd;
	}

	public String getEmail_id(){
		return this.email_id;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_3257_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_3257_ADM dm = (FC_ACCT_3257_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.prof_type_cd);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_occr_dt);
		cstmt.setString(7, dm.slip_seq);
		cstmt.setString(8, dm.occr_slip_occr_dt);
		cstmt.setString(9, dm.occr_slip_clsf_cd);
		cstmt.setString(10, dm.occr_slip_seq);
		cstmt.setString(11, dm.occr_slip_sub_seq);
		cstmt.setString(12, dm.occr_slip_arow_no);
		cstmt.setString(13, dm.make_dt);
		cstmt.setString(14, dm.erplace_cd);
		cstmt.setString(15, dm.dlco_clsf_cd);
		cstmt.setString(16, dm.dlco_cd);
		cstmt.setString(17, dm.deal_clsf);
		cstmt.setString(18, dm.ern);
		cstmt.setString(19, dm.dlco_nm);
		cstmt.setString(20, dm.presi_nm);
		cstmt.setString(21, dm.addr);
		cstmt.setString(22, dm.bizcond);
		cstmt.setString(23, dm.item);
		cstmt.setString(24, dm.suply_amt);
		cstmt.setString(25, dm.vat_amt);
		cstmt.setString(26, dm.tax_stmt_aprv_yn);
		cstmt.setString(27, dm.decl_yn);
		cstmt.setString(28, dm.decl_qq);
		cstmt.setString(29, dm.make_upd_dt);
		cstmt.setString(30, dm.upd_tms);
		cstmt.setString(31, dm.last_upd_dd);
		cstmt.setString(32, dm.issu_pers_emp_no);
		cstmt.setString(33, dm.issu_tms);
		cstmt.setString(34, dm.incmg_dt_tm);
		cstmt.setString(35, dm.incmg_pers);
		cstmt.setString(36, dm.incmg_pers_ipadd);
		cstmt.setString(37, dm.canc_yn);
		cstmt.setString(38, dm.canc_dt);
		cstmt.setString(39, dm.del_resn);
		cstmt.setString(40, dm.mode);
		cstmt.setString(41, dm.slip_arow_no);
		cstmt.setString(42, dm.mmdd);
		cstmt.setString(43, dm.item1);
		cstmt.setString(44, dm.std);
		cstmt.setString(45, dm.qunt);
		cstmt.setString(46, dm.uprc);
		cstmt.setString(47, dm.suply_amt1);
		cstmt.setString(48, dm.vat_amt1);
		cstmt.setString(49, dm.semuro_no);
		cstmt.setString(50, dm.elec_tax_comp_cd);
		cstmt.setString(51, dm.email_id);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_3257_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("occr_slip_occr_dt = [" + getOccr_slip_occr_dt() + "]");
		System.out.println("occr_slip_clsf_cd = [" + getOccr_slip_clsf_cd() + "]");
		System.out.println("occr_slip_seq = [" + getOccr_slip_seq() + "]");
		System.out.println("occr_slip_sub_seq = [" + getOccr_slip_sub_seq() + "]");
		System.out.println("occr_slip_arow_no = [" + getOccr_slip_arow_no() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("deal_clsf = [" + getDeal_clsf() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("presi_nm = [" + getPresi_nm() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("bizcond = [" + getBizcond() + "]");
		System.out.println("item = [" + getItem() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("tax_stmt_aprv_yn = [" + getTax_stmt_aprv_yn() + "]");
		System.out.println("decl_yn = [" + getDecl_yn() + "]");
		System.out.println("decl_qq = [" + getDecl_qq() + "]");
		System.out.println("make_upd_dt = [" + getMake_upd_dt() + "]");
		System.out.println("upd_tms = [" + getUpd_tms() + "]");
		System.out.println("last_upd_dd = [" + getLast_upd_dd() + "]");
		System.out.println("issu_pers_emp_no = [" + getIssu_pers_emp_no() + "]");
		System.out.println("issu_tms = [" + getIssu_tms() + "]");
		System.out.println("incmg_dt_tm = [" + getIncmg_dt_tm() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("canc_yn = [" + getCanc_yn() + "]");
		System.out.println("canc_dt = [" + getCanc_dt() + "]");
		System.out.println("del_resn = [" + getDel_resn() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("slip_arow_no = [" + getSlip_arow_no() + "]");
		System.out.println("mmdd = [" + getMmdd() + "]");
		System.out.println("item1 = [" + getItem1() + "]");
		System.out.println("std = [" + getStd() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("suply_amt1 = [" + getSuply_amt1() + "]");
		System.out.println("vat_amt1 = [" + getVat_amt1() + "]");
		System.out.println("semuro_no = [" + getSemuro_no() + "]");
		System.out.println("elec_tax_comp_cd = [" + getElec_tax_comp_cd() + "]");
		System.out.println("email_id = [" + getEmail_id() + "]");
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
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
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
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String occr_slip_occr_dt = req.getParameter("occr_slip_occr_dt");
if( occr_slip_occr_dt == null){
	System.out.println(this.toString+" : occr_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_slip_occr_dt is "+occr_slip_occr_dt );
}
String occr_slip_clsf_cd = req.getParameter("occr_slip_clsf_cd");
if( occr_slip_clsf_cd == null){
	System.out.println(this.toString+" : occr_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : occr_slip_clsf_cd is "+occr_slip_clsf_cd );
}
String occr_slip_seq = req.getParameter("occr_slip_seq");
if( occr_slip_seq == null){
	System.out.println(this.toString+" : occr_slip_seq is null" );
}else{
	System.out.println(this.toString+" : occr_slip_seq is "+occr_slip_seq );
}
String occr_slip_sub_seq = req.getParameter("occr_slip_sub_seq");
if( occr_slip_sub_seq == null){
	System.out.println(this.toString+" : occr_slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : occr_slip_sub_seq is "+occr_slip_sub_seq );
}
String occr_slip_arow_no = req.getParameter("occr_slip_arow_no");
if( occr_slip_arow_no == null){
	System.out.println(this.toString+" : occr_slip_arow_no is null" );
}else{
	System.out.println(this.toString+" : occr_slip_arow_no is "+occr_slip_arow_no );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String erplace_cd = req.getParameter("erplace_cd");
if( erplace_cd == null){
	System.out.println(this.toString+" : erplace_cd is null" );
}else{
	System.out.println(this.toString+" : erplace_cd is "+erplace_cd );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String deal_clsf = req.getParameter("deal_clsf");
if( deal_clsf == null){
	System.out.println(this.toString+" : deal_clsf is null" );
}else{
	System.out.println(this.toString+" : deal_clsf is "+deal_clsf );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String presi_nm = req.getParameter("presi_nm");
if( presi_nm == null){
	System.out.println(this.toString+" : presi_nm is null" );
}else{
	System.out.println(this.toString+" : presi_nm is "+presi_nm );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String bizcond = req.getParameter("bizcond");
if( bizcond == null){
	System.out.println(this.toString+" : bizcond is null" );
}else{
	System.out.println(this.toString+" : bizcond is "+bizcond );
}
String item = req.getParameter("item");
if( item == null){
	System.out.println(this.toString+" : item is null" );
}else{
	System.out.println(this.toString+" : item is "+item );
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
String tax_stmt_aprv_yn = req.getParameter("tax_stmt_aprv_yn");
if( tax_stmt_aprv_yn == null){
	System.out.println(this.toString+" : tax_stmt_aprv_yn is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_aprv_yn is "+tax_stmt_aprv_yn );
}
String decl_yn = req.getParameter("decl_yn");
if( decl_yn == null){
	System.out.println(this.toString+" : decl_yn is null" );
}else{
	System.out.println(this.toString+" : decl_yn is "+decl_yn );
}
String decl_qq = req.getParameter("decl_qq");
if( decl_qq == null){
	System.out.println(this.toString+" : decl_qq is null" );
}else{
	System.out.println(this.toString+" : decl_qq is "+decl_qq );
}
String make_upd_dt = req.getParameter("make_upd_dt");
if( make_upd_dt == null){
	System.out.println(this.toString+" : make_upd_dt is null" );
}else{
	System.out.println(this.toString+" : make_upd_dt is "+make_upd_dt );
}
String upd_tms = req.getParameter("upd_tms");
if( upd_tms == null){
	System.out.println(this.toString+" : upd_tms is null" );
}else{
	System.out.println(this.toString+" : upd_tms is "+upd_tms );
}
String last_upd_dd = req.getParameter("last_upd_dd");
if( last_upd_dd == null){
	System.out.println(this.toString+" : last_upd_dd is null" );
}else{
	System.out.println(this.toString+" : last_upd_dd is "+last_upd_dd );
}
String issu_pers_emp_no = req.getParameter("issu_pers_emp_no");
if( issu_pers_emp_no == null){
	System.out.println(this.toString+" : issu_pers_emp_no is null" );
}else{
	System.out.println(this.toString+" : issu_pers_emp_no is "+issu_pers_emp_no );
}
String issu_tms = req.getParameter("issu_tms");
if( issu_tms == null){
	System.out.println(this.toString+" : issu_tms is null" );
}else{
	System.out.println(this.toString+" : issu_tms is "+issu_tms );
}
String incmg_dt_tm = req.getParameter("incmg_dt_tm");
if( incmg_dt_tm == null){
	System.out.println(this.toString+" : incmg_dt_tm is null" );
}else{
	System.out.println(this.toString+" : incmg_dt_tm is "+incmg_dt_tm );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String canc_yn = req.getParameter("canc_yn");
if( canc_yn == null){
	System.out.println(this.toString+" : canc_yn is null" );
}else{
	System.out.println(this.toString+" : canc_yn is "+canc_yn );
}
String canc_dt = req.getParameter("canc_dt");
if( canc_dt == null){
	System.out.println(this.toString+" : canc_dt is null" );
}else{
	System.out.println(this.toString+" : canc_dt is "+canc_dt );
}
String del_resn = req.getParameter("del_resn");
if( del_resn == null){
	System.out.println(this.toString+" : del_resn is null" );
}else{
	System.out.println(this.toString+" : del_resn is "+del_resn );
}
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String slip_arow_no = req.getParameter("slip_arow_no");
if( slip_arow_no == null){
	System.out.println(this.toString+" : slip_arow_no is null" );
}else{
	System.out.println(this.toString+" : slip_arow_no is "+slip_arow_no );
}
String mmdd = req.getParameter("mmdd");
if( mmdd == null){
	System.out.println(this.toString+" : mmdd is null" );
}else{
	System.out.println(this.toString+" : mmdd is "+mmdd );
}
String item1 = req.getParameter("item1");
if( item1 == null){
	System.out.println(this.toString+" : item1 is null" );
}else{
	System.out.println(this.toString+" : item1 is "+item1 );
}
String std = req.getParameter("std");
if( std == null){
	System.out.println(this.toString+" : std is null" );
}else{
	System.out.println(this.toString+" : std is "+std );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String suply_amt1 = req.getParameter("suply_amt1");
if( suply_amt1 == null){
	System.out.println(this.toString+" : suply_amt1 is null" );
}else{
	System.out.println(this.toString+" : suply_amt1 is "+suply_amt1 );
}
String vat_amt1 = req.getParameter("vat_amt1");
if( vat_amt1 == null){
	System.out.println(this.toString+" : vat_amt1 is null" );
}else{
	System.out.println(this.toString+" : vat_amt1 is "+vat_amt1 );
}
String semuro_no = req.getParameter("semuro_no");
if( semuro_no == null){
	System.out.println(this.toString+" : semuro_no is null" );
}else{
	System.out.println(this.toString+" : semuro_no is "+semuro_no );
}
String elec_tax_comp_cd = req.getParameter("elec_tax_comp_cd");
if( elec_tax_comp_cd == null){
	System.out.println(this.toString+" : elec_tax_comp_cd is null" );
}else{
	System.out.println(this.toString+" : elec_tax_comp_cd is "+elec_tax_comp_cd );
}
String email_id = req.getParameter("email_id");
if( email_id == null){
	System.out.println(this.toString+" : email_id is null" );
}else{
	System.out.println(this.toString+" : email_id is "+email_id );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String occr_slip_occr_dt = Util.checkString(req.getParameter("occr_slip_occr_dt"));
String occr_slip_clsf_cd = Util.checkString(req.getParameter("occr_slip_clsf_cd"));
String occr_slip_seq = Util.checkString(req.getParameter("occr_slip_seq"));
String occr_slip_sub_seq = Util.checkString(req.getParameter("occr_slip_sub_seq"));
String occr_slip_arow_no = Util.checkString(req.getParameter("occr_slip_arow_no"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String deal_clsf = Util.checkString(req.getParameter("deal_clsf"));
String ern = Util.checkString(req.getParameter("ern"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String presi_nm = Util.checkString(req.getParameter("presi_nm"));
String addr = Util.checkString(req.getParameter("addr"));
String bizcond = Util.checkString(req.getParameter("bizcond"));
String item = Util.checkString(req.getParameter("item"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String tax_stmt_aprv_yn = Util.checkString(req.getParameter("tax_stmt_aprv_yn"));
String decl_yn = Util.checkString(req.getParameter("decl_yn"));
String decl_qq = Util.checkString(req.getParameter("decl_qq"));
String make_upd_dt = Util.checkString(req.getParameter("make_upd_dt"));
String upd_tms = Util.checkString(req.getParameter("upd_tms"));
String last_upd_dd = Util.checkString(req.getParameter("last_upd_dd"));
String issu_pers_emp_no = Util.checkString(req.getParameter("issu_pers_emp_no"));
String issu_tms = Util.checkString(req.getParameter("issu_tms"));
String incmg_dt_tm = Util.checkString(req.getParameter("incmg_dt_tm"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String canc_yn = Util.checkString(req.getParameter("canc_yn"));
String canc_dt = Util.checkString(req.getParameter("canc_dt"));
String del_resn = Util.checkString(req.getParameter("del_resn"));
String mode = Util.checkString(req.getParameter("mode"));
String slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));
String mmdd = Util.checkString(req.getParameter("mmdd"));
String item1 = Util.checkString(req.getParameter("item1"));
String std = Util.checkString(req.getParameter("std"));
String qunt = Util.checkString(req.getParameter("qunt"));
String uprc = Util.checkString(req.getParameter("uprc"));
String suply_amt1 = Util.checkString(req.getParameter("suply_amt1"));
String vat_amt1 = Util.checkString(req.getParameter("vat_amt1"));
String semuro_no = Util.checkString(req.getParameter("semuro_no"));
String elec_tax_comp_cd = Util.checkString(req.getParameter("elec_tax_comp_cd"));
String email_id = Util.checkString(req.getParameter("email_id"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String occr_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_occr_dt")));
String occr_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_clsf_cd")));
String occr_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_seq")));
String occr_slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_sub_seq")));
String occr_slip_arow_no = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_arow_no")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String deal_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("deal_clsf")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String presi_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("presi_nm")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String bizcond = Util.Uni2Ksc(Util.checkString(req.getParameter("bizcond")));
String item = Util.Uni2Ksc(Util.checkString(req.getParameter("item")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String tax_stmt_aprv_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_aprv_yn")));
String decl_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("decl_yn")));
String decl_qq = Util.Uni2Ksc(Util.checkString(req.getParameter("decl_qq")));
String make_upd_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_upd_dt")));
String upd_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("upd_tms")));
String last_upd_dd = Util.Uni2Ksc(Util.checkString(req.getParameter("last_upd_dd")));
String issu_pers_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_pers_emp_no")));
String issu_tms = Util.Uni2Ksc(Util.checkString(req.getParameter("issu_tms")));
String incmg_dt_tm = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt_tm")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String canc_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("canc_yn")));
String canc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("canc_dt")));
String del_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("del_resn")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String slip_arow_no = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_arow_no")));
String mmdd = Util.Uni2Ksc(Util.checkString(req.getParameter("mmdd")));
String item1 = Util.Uni2Ksc(Util.checkString(req.getParameter("item1")));
String std = Util.Uni2Ksc(Util.checkString(req.getParameter("std")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String suply_amt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt1")));
String vat_amt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt1")));
String semuro_no = Util.Uni2Ksc(Util.checkString(req.getParameter("semuro_no")));
String elec_tax_comp_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("elec_tax_comp_cd")));
String email_id = Util.Uni2Ksc(Util.checkString(req.getParameter("email_id")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setProf_type_cd(prof_type_cd);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_seq(slip_seq);
dm.setOccr_slip_occr_dt(occr_slip_occr_dt);
dm.setOccr_slip_clsf_cd(occr_slip_clsf_cd);
dm.setOccr_slip_seq(occr_slip_seq);
dm.setOccr_slip_sub_seq(occr_slip_sub_seq);
dm.setOccr_slip_arow_no(occr_slip_arow_no);
dm.setMake_dt(make_dt);
dm.setErplace_cd(erplace_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDeal_clsf(deal_clsf);
dm.setErn(ern);
dm.setDlco_nm(dlco_nm);
dm.setPresi_nm(presi_nm);
dm.setAddr(addr);
dm.setBizcond(bizcond);
dm.setItem(item);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setTax_stmt_aprv_yn(tax_stmt_aprv_yn);
dm.setDecl_yn(decl_yn);
dm.setDecl_qq(decl_qq);
dm.setMake_upd_dt(make_upd_dt);
dm.setUpd_tms(upd_tms);
dm.setLast_upd_dd(last_upd_dd);
dm.setIssu_pers_emp_no(issu_pers_emp_no);
dm.setIssu_tms(issu_tms);
dm.setIncmg_dt_tm(incmg_dt_tm);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setCanc_yn(canc_yn);
dm.setCanc_dt(canc_dt);
dm.setDel_resn(del_resn);
dm.setMode(mode);
dm.setSlip_arow_no(slip_arow_no);
dm.setMmdd(mmdd);
dm.setItem1(item1);
dm.setStd(std);
dm.setQunt(qunt);
dm.setUprc(uprc);
dm.setSuply_amt1(suply_amt1);
dm.setVat_amt1(vat_amt1);
dm.setSemuro_no(semuro_no);
dm.setElec_tax_comp_cd(elec_tax_comp_cd);
dm.setEmail_id(email_id);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 26 17:15:09 KST 2014 */