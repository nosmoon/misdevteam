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


package chosun.ciis.mt.submatrin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.submatrin.ds.*;
import chosun.ciis.mt.submatrin.rec.*;

/**
 * 
 */


public class MT_SUBMATRIN_1106_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String ewh_dt;
	public String make_dt;
	public String purc_clsf;
	public String prof_type_cd;
	public String rcpt_prof_clsf;
	public String fac_clsf;
	public String impt_yy;
	public String impt_seq;
	public String leas_clsf;
	public String incmg_slip_dt;
	public String slip_no;
	public String semuro_no;
	public String purc_stmt_no;
	public String suply_amt;
	public String vat_amt;
	public String dlco_cd;
	public String ern;
	public String dlco_cd_nm;
	public String dlco_clsf_cd;
	public String rv_cmpy_cd;
	public String rv_occr_dt;
	public String rv_seq;
	public String per_id;
	public String per_ip;
	public String gubun;
	public String matr_cd;
	public String matr_cd_nm;
	public String ewh_unit;
	public String ewh_uprc;
	public String ewh_qunt;
	public String ewh_amt;
	public String ewh_vat;
	public String ewh_budg_cd;
	public String owh_budg_cd;
	public String bo_item_yn;
	public String medi_cd;
	public String medi_ser_no;
	public String use_deptcd;
	public String remk;
	public String owh_yn;
	public String clam_dt;
	public String clam_seq;
	public String clam_sub_seq;
	public String clam_matr;

	public MT_SUBMATRIN_1106_ADM(){}
	public MT_SUBMATRIN_1106_ADM(String cmpy_cd, String ewh_dt, String make_dt, String purc_clsf, String prof_type_cd, String rcpt_prof_clsf, String fac_clsf, String impt_yy, String impt_seq, String leas_clsf, String incmg_slip_dt, String slip_no, String semuro_no, String purc_stmt_no, String suply_amt, String vat_amt, String dlco_cd, String ern, String dlco_cd_nm, String dlco_clsf_cd, String rv_cmpy_cd, String rv_occr_dt, String rv_seq, String per_id, String per_ip, String gubun, String matr_cd, String matr_cd_nm, String ewh_unit, String ewh_uprc, String ewh_qunt, String ewh_amt, String ewh_vat, String ewh_budg_cd, String owh_budg_cd, String bo_item_yn, String medi_cd, String medi_ser_no, String use_deptcd, String remk, String owh_yn, String clam_dt, String clam_seq, String clam_sub_seq, String clam_matr){
		this.cmpy_cd = cmpy_cd;
		this.ewh_dt = ewh_dt;
		this.make_dt = make_dt;
		this.purc_clsf = purc_clsf;
		this.prof_type_cd = prof_type_cd;
		this.rcpt_prof_clsf = rcpt_prof_clsf;
		this.fac_clsf = fac_clsf;
		this.impt_yy = impt_yy;
		this.impt_seq = impt_seq;
		this.leas_clsf = leas_clsf;
		this.incmg_slip_dt = incmg_slip_dt;
		this.slip_no = slip_no;
		this.semuro_no = semuro_no;
		this.purc_stmt_no = purc_stmt_no;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.dlco_cd = dlco_cd;
		this.ern = ern;
		this.dlco_cd_nm = dlco_cd_nm;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.rv_cmpy_cd = rv_cmpy_cd;
		this.rv_occr_dt = rv_occr_dt;
		this.rv_seq = rv_seq;
		this.per_id = per_id;
		this.per_ip = per_ip;
		this.gubun = gubun;
		this.matr_cd = matr_cd;
		this.matr_cd_nm = matr_cd_nm;
		this.ewh_unit = ewh_unit;
		this.ewh_uprc = ewh_uprc;
		this.ewh_qunt = ewh_qunt;
		this.ewh_amt = ewh_amt;
		this.ewh_vat = ewh_vat;
		this.ewh_budg_cd = ewh_budg_cd;
		this.owh_budg_cd = owh_budg_cd;
		this.bo_item_yn = bo_item_yn;
		this.medi_cd = medi_cd;
		this.medi_ser_no = medi_ser_no;
		this.use_deptcd = use_deptcd;
		this.remk = remk;
		this.owh_yn = owh_yn;
		this.clam_dt = clam_dt;
		this.clam_seq = clam_seq;
		this.clam_sub_seq = clam_sub_seq;
		this.clam_matr = clam_matr;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEwh_dt(String ewh_dt){
		this.ewh_dt = ewh_dt;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setPurc_clsf(String purc_clsf){
		this.purc_clsf = purc_clsf;
	}

	public void setProf_type_cd(String prof_type_cd){
		this.prof_type_cd = prof_type_cd;
	}

	public void setRcpt_prof_clsf(String rcpt_prof_clsf){
		this.rcpt_prof_clsf = rcpt_prof_clsf;
	}

	public void setFac_clsf(String fac_clsf){
		this.fac_clsf = fac_clsf;
	}

	public void setImpt_yy(String impt_yy){
		this.impt_yy = impt_yy;
	}

	public void setImpt_seq(String impt_seq){
		this.impt_seq = impt_seq;
	}

	public void setLeas_clsf(String leas_clsf){
		this.leas_clsf = leas_clsf;
	}

	public void setIncmg_slip_dt(String incmg_slip_dt){
		this.incmg_slip_dt = incmg_slip_dt;
	}

	public void setSlip_no(String slip_no){
		this.slip_no = slip_no;
	}

	public void setSemuro_no(String semuro_no){
		this.semuro_no = semuro_no;
	}
	
	public void setPurc_stmt_no(String purc_stmt_no){
		this.purc_stmt_no = purc_stmt_no;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setDlco_cd_nm(String dlco_cd_nm){
		this.dlco_cd_nm = dlco_cd_nm;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setRv_cmpy_cd(String rv_cmpy_cd){
		this.rv_cmpy_cd = rv_cmpy_cd;
	}

	public void setRv_occr_dt(String rv_occr_dt){
		this.rv_occr_dt = rv_occr_dt;
	}

	public void setRv_seq(String rv_seq){
		this.rv_seq = rv_seq;
	}

	public void setPer_id(String per_id){
		this.per_id = per_id;
	}

	public void setPer_ip(String per_ip){
		this.per_ip = per_ip;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public void setMatr_cd(String matr_cd){
		this.matr_cd = matr_cd;
	}

	public void setMatr_cd_nm(String matr_cd_nm){
		this.matr_cd_nm = matr_cd_nm;
	}

	public void setEwh_unit(String ewh_unit){
		this.ewh_unit = ewh_unit;
	}

	public void setEwh_uprc(String ewh_uprc){
		this.ewh_uprc = ewh_uprc;
	}

	public void setEwh_qunt(String ewh_qunt){
		this.ewh_qunt = ewh_qunt;
	}

	public void setEwh_amt(String ewh_amt){
		this.ewh_amt = ewh_amt;
	}

	public void setEwh_vat(String ewh_vat){
		this.ewh_vat = ewh_vat;
	}

	public void setEwh_budg_cd(String ewh_budg_cd){
		this.ewh_budg_cd = ewh_budg_cd;
	}

	public void setOwh_budg_cd(String owh_budg_cd){
		this.owh_budg_cd = owh_budg_cd;
	}

	public void setBo_item_yn(String bo_item_yn){
		this.bo_item_yn = bo_item_yn;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMedi_ser_no(String medi_ser_no){
		this.medi_ser_no = medi_ser_no;
	}

	public void setUse_deptcd(String use_deptcd){
		this.use_deptcd = use_deptcd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setOwh_yn(String owh_yn){
		this.owh_yn = owh_yn;
	}

	public void setClam_dt(String clam_dt){
		this.clam_dt = clam_dt;
	}
	
	public void setClam_seq(String clam_seq){
		this.clam_seq = clam_seq;
	}
	
	public void setClam_sub_seq(String clam_sub_seq){
		this.clam_sub_seq = clam_sub_seq;
	}
	
	public void setClam_matr(String clam_matr){
		this.clam_matr = clam_matr;
	}
	
	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEwh_dt(){
		return this.ewh_dt;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getPurc_clsf(){
		return this.purc_clsf;
	}

	public String getProf_type_cd(){
		return this.prof_type_cd;
	}

	public String getRcpt_prof_clsf(){
		return this.rcpt_prof_clsf;
	}

	public String getFac_clsf(){
		return this.fac_clsf;
	}

	public String getImpt_yy(){
		return this.impt_yy;
	}

	public String getImpt_seq(){
		return this.impt_seq;
	}

	public String getLeas_clsf(){
		return this.leas_clsf;
	}

	public String getIncmg_slip_dt(){
		return this.incmg_slip_dt;
	}

	public String getSlip_no(){
		return this.slip_no;
	}

	public String getSemuro_no(){
		return this.semuro_no;
	}
	
	public String getPurc_stmt_no(){
		return this.purc_stmt_no;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getDlco_cd_nm(){
		return this.dlco_cd_nm;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getRv_cmpy_cd(){
		return this.rv_cmpy_cd;
	}

	public String getRv_occr_dt(){
		return this.rv_occr_dt;
	}

	public String getRv_seq(){
		return this.rv_seq;
	}

	public String getPer_id(){
		return this.per_id;
	}

	public String getPer_ip(){
		return this.per_ip;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getMatr_cd(){
		return this.matr_cd;
	}

	public String getMatr_cd_nm(){
		return this.matr_cd_nm;
	}

	public String getEwh_unit(){
		return this.ewh_unit;
	}

	public String getEwh_uprc(){
		return this.ewh_uprc;
	}

	public String getEwh_qunt(){
		return this.ewh_qunt;
	}

	public String getEwh_amt(){
		return this.ewh_amt;
	}

	public String getEwh_vat(){
		return this.ewh_vat;
	}

	public String getEwh_budg_cd(){
		return this.ewh_budg_cd;
	}

	public String getOwh_budg_cd(){
		return this.owh_budg_cd;
	}

	public String getBo_item_yn(){
		return this.bo_item_yn;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMedi_ser_no(){
		return this.medi_ser_no;
	}

	public String getUse_deptcd(){
		return this.use_deptcd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getOwh_yn(){
		return this.owh_yn;
	}
	
	public String getClam_dt(){
		return this.clam_dt;
	}
	
	public String getClam_seq(){
		return this.clam_seq;
	}

	public String getClam_sub_seq(){
		return this.clam_sub_seq;
	}
	
	public String getClam_matr(){
		return this.clam_matr;
	}
	
	public String getSQL(){
		 return "{ call MISMAT.SP_MT_SUBMATRIN_1106_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		MT_SUBMATRIN_1106_ADM dm = (MT_SUBMATRIN_1106_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.ewh_dt);
		cstmt.setString(5, dm.make_dt);
		cstmt.setString(6, dm.purc_clsf);
		cstmt.setString(7, dm.prof_type_cd);
		cstmt.setString(8, dm.rcpt_prof_clsf);
		cstmt.setString(9, dm.fac_clsf);
		cstmt.setString(10, dm.impt_yy);
		cstmt.setString(11, dm.impt_seq);
		cstmt.setString(12, dm.leas_clsf);
		cstmt.setString(13, dm.incmg_slip_dt);
		cstmt.setString(14, dm.slip_no);
		cstmt.setString(15, dm.purc_stmt_no);
		cstmt.setString(16, dm.suply_amt);
		cstmt.setString(17, dm.vat_amt);
		cstmt.setString(18, dm.dlco_cd);
		cstmt.setString(19, dm.ern);
		cstmt.setString(20, dm.dlco_cd_nm);
		cstmt.setString(21, dm.dlco_clsf_cd);
		cstmt.setString(22, dm.semuro_no);
		cstmt.setString(23, dm.rv_cmpy_cd);
		cstmt.setString(24, dm.rv_occr_dt);
		cstmt.setString(25, dm.rv_seq);
		cstmt.setString(26, dm.per_id);
		cstmt.setString(27, dm.per_ip);
		cstmt.setString(28, dm.gubun);
		cstmt.setString(29, dm.matr_cd);
		cstmt.setString(30, dm.matr_cd_nm);
		cstmt.setString(31, dm.ewh_unit);
		cstmt.setString(32, dm.ewh_uprc);
		cstmt.setString(33, dm.ewh_qunt);
		cstmt.setString(34, dm.ewh_amt);
		cstmt.setString(35, dm.ewh_vat);
		cstmt.setString(36, dm.ewh_budg_cd);
		cstmt.setString(37, dm.owh_budg_cd);
		cstmt.setString(38, dm.bo_item_yn);
		cstmt.setString(39, dm.medi_cd);
		cstmt.setString(40, dm.medi_ser_no);
		cstmt.setString(41, dm.use_deptcd);
		cstmt.setString(42, dm.remk);
		cstmt.setString(43, dm.owh_yn);
		cstmt.setString(44, dm.clam_dt);
		cstmt.setString(45, dm.clam_seq);
		cstmt.setString(46, dm.clam_sub_seq);
		cstmt.setString(47, dm.clam_matr);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.mt.submatrin.ds.MT_SUBMATRIN_1106_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("ewh_dt = [" + getEwh_dt() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("purc_clsf = [" + getPurc_clsf() + "]");
		System.out.println("prof_type_cd = [" + getProf_type_cd() + "]");
		System.out.println("rcpt_prof_clsf = [" + getRcpt_prof_clsf() + "]");
		System.out.println("fac_clsf = [" + getFac_clsf() + "]");
		System.out.println("impt_yy = [" + getImpt_yy() + "]");
		System.out.println("impt_seq = [" + getImpt_seq() + "]");
		System.out.println("leas_clsf = [" + getLeas_clsf() + "]");
		System.out.println("incmg_slip_dt = [" + getIncmg_slip_dt() + "]");
		System.out.println("slip_no = [" + getSlip_no() + "]");
		System.out.println("semuro_no = [" + getSemuro_no() + "]");
		System.out.println("purc_stmt_no = [" + getPurc_stmt_no() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("dlco_cd_nm = [" + getDlco_cd_nm() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("rv_cmpy_cd = [" + getRv_cmpy_cd() + "]");
		System.out.println("rv_occr_dt = [" + getRv_occr_dt() + "]");
		System.out.println("rv_seq = [" + getRv_seq() + "]");
		System.out.println("per_id = [" + getPer_id() + "]");
		System.out.println("per_ip = [" + getPer_ip() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
		System.out.println("matr_cd = [" + getMatr_cd() + "]");
		System.out.println("matr_cd_nm = [" + getMatr_cd_nm() + "]");
		System.out.println("ewh_unit = [" + getEwh_unit() + "]");
		System.out.println("ewh_uprc = [" + getEwh_uprc() + "]");
		System.out.println("ewh_qunt = [" + getEwh_qunt() + "]");
		System.out.println("ewh_amt = [" + getEwh_amt() + "]");
		System.out.println("ewh_vat = [" + getEwh_vat() + "]");
		System.out.println("ewh_budg_cd = [" + getEwh_budg_cd() + "]");
		System.out.println("owh_budg_cd = [" + getOwh_budg_cd() + "]");
		System.out.println("bo_item_yn = [" + getBo_item_yn() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("medi_ser_no = [" + getMedi_ser_no() + "]");
		System.out.println("use_deptcd = [" + getUse_deptcd() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("owh_yn = [" + getOwh_yn() + "]");
		System.out.println("clam_dt = [" + getClam_dt() + "]");
		System.out.println("clam_seq = [" + getClam_seq() + "]");
		System.out.println("clam_sub_seq = [" + getClam_sub_seq() + "]");
		System.out.println("clam_matr = [" + getClam_matr() + "]");
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
String ewh_dt = req.getParameter("ewh_dt");
if( ewh_dt == null){
	System.out.println(this.toString+" : ewh_dt is null" );
}else{
	System.out.println(this.toString+" : ewh_dt is "+ewh_dt );
}
String make_dt = req.getParameter("make_dt");
if( make_dt == null){
	System.out.println(this.toString+" : make_dt is null" );
}else{
	System.out.println(this.toString+" : make_dt is "+make_dt );
}
String purc_clsf = req.getParameter("purc_clsf");
if( purc_clsf == null){
	System.out.println(this.toString+" : purc_clsf is null" );
}else{
	System.out.println(this.toString+" : purc_clsf is "+purc_clsf );
}
String prof_type_cd = req.getParameter("prof_type_cd");
if( prof_type_cd == null){
	System.out.println(this.toString+" : prof_type_cd is null" );
}else{
	System.out.println(this.toString+" : prof_type_cd is "+prof_type_cd );
}
String rcpt_prof_clsf = req.getParameter("rcpt_prof_clsf");
if( rcpt_prof_clsf == null){
	System.out.println(this.toString+" : rcpt_prof_clsf is null" );
}else{
	System.out.println(this.toString+" : rcpt_prof_clsf is "+rcpt_prof_clsf );
}
String fac_clsf = req.getParameter("fac_clsf");
if( fac_clsf == null){
	System.out.println(this.toString+" : fac_clsf is null" );
}else{
	System.out.println(this.toString+" : fac_clsf is "+fac_clsf );
}
String impt_yy = req.getParameter("impt_yy");
if( impt_yy == null){
	System.out.println(this.toString+" : impt_yy is null" );
}else{
	System.out.println(this.toString+" : impt_yy is "+impt_yy );
}
String impt_seq = req.getParameter("impt_seq");
if( impt_seq == null){
	System.out.println(this.toString+" : impt_seq is null" );
}else{
	System.out.println(this.toString+" : impt_seq is "+impt_seq );
}
String leas_clsf = req.getParameter("leas_clsf");
if( leas_clsf == null){
	System.out.println(this.toString+" : leas_clsf is null" );
}else{
	System.out.println(this.toString+" : leas_clsf is "+leas_clsf );
}
String incmg_slip_dt = req.getParameter("incmg_slip_dt");
if( incmg_slip_dt == null){
	System.out.println(this.toString+" : incmg_slip_dt is null" );
}else{
	System.out.println(this.toString+" : incmg_slip_dt is "+incmg_slip_dt );
}
String slip_no = req.getParameter("slip_no");
if( slip_no == null){
	System.out.println(this.toString+" : slip_no is null" );
}else{
	System.out.println(this.toString+" : slip_no is "+slip_no );
}
String purc_stmt_no = req.getParameter("purc_stmt_no");
if( purc_stmt_no == null){
	System.out.println(this.toString+" : purc_stmt_no is null" );
}else{
	System.out.println(this.toString+" : purc_stmt_no is "+purc_stmt_no );
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
String dlco_cd = req.getParameter("dlco_cd");
if( dlco_cd == null){
	System.out.println(this.toString+" : dlco_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_cd is "+dlco_cd );
}
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
}
String dlco_cd_nm = req.getParameter("dlco_cd_nm");
if( dlco_cd_nm == null){
	System.out.println(this.toString+" : dlco_cd_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_cd_nm is "+dlco_cd_nm );
}
String dlco_clsf_cd = req.getParameter("dlco_clsf_cd");
if( dlco_clsf_cd == null){
	System.out.println(this.toString+" : dlco_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd is "+dlco_clsf_cd );
}
String rv_cmpy_cd = req.getParameter("rv_cmpy_cd");
if( rv_cmpy_cd == null){
	System.out.println(this.toString+" : rv_cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : rv_cmpy_cd is "+rv_cmpy_cd );
}
String rv_occr_dt = req.getParameter("rv_occr_dt");
if( rv_occr_dt == null){
	System.out.println(this.toString+" : rv_occr_dt is null" );
}else{
	System.out.println(this.toString+" : rv_occr_dt is "+rv_occr_dt );
}
String rv_seq = req.getParameter("rv_seq");
if( rv_seq == null){
	System.out.println(this.toString+" : rv_seq is null" );
}else{
	System.out.println(this.toString+" : rv_seq is "+rv_seq );
}
String per_id = req.getParameter("per_id");
if( per_id == null){
	System.out.println(this.toString+" : per_id is null" );
}else{
	System.out.println(this.toString+" : per_id is "+per_id );
}
String per_ip = req.getParameter("per_ip");
if( per_ip == null){
	System.out.println(this.toString+" : per_ip is null" );
}else{
	System.out.println(this.toString+" : per_ip is "+per_ip );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
String matr_cd = req.getParameter("matr_cd");
if( matr_cd == null){
	System.out.println(this.toString+" : matr_cd is null" );
}else{
	System.out.println(this.toString+" : matr_cd is "+matr_cd );
}
String matr_cd_nm = req.getParameter("matr_cd_nm");
if( matr_cd_nm == null){
	System.out.println(this.toString+" : matr_cd_nm is null" );
}else{
	System.out.println(this.toString+" : matr_cd_nm is "+matr_cd_nm );
}
String ewh_unit = req.getParameter("ewh_unit");
if( ewh_unit == null){
	System.out.println(this.toString+" : ewh_unit is null" );
}else{
	System.out.println(this.toString+" : ewh_unit is "+ewh_unit );
}
String ewh_uprc = req.getParameter("ewh_uprc");
if( ewh_uprc == null){
	System.out.println(this.toString+" : ewh_uprc is null" );
}else{
	System.out.println(this.toString+" : ewh_uprc is "+ewh_uprc );
}
String ewh_qunt = req.getParameter("ewh_qunt");
if( ewh_qunt == null){
	System.out.println(this.toString+" : ewh_qunt is null" );
}else{
	System.out.println(this.toString+" : ewh_qunt is "+ewh_qunt );
}
String ewh_amt = req.getParameter("ewh_amt");
if( ewh_amt == null){
	System.out.println(this.toString+" : ewh_amt is null" );
}else{
	System.out.println(this.toString+" : ewh_amt is "+ewh_amt );
}
String ewh_vat = req.getParameter("ewh_vat");
if( ewh_vat == null){
	System.out.println(this.toString+" : ewh_vat is null" );
}else{
	System.out.println(this.toString+" : ewh_vat is "+ewh_vat );
}
String ewh_budg_cd = req.getParameter("ewh_budg_cd");
if( ewh_budg_cd == null){
	System.out.println(this.toString+" : ewh_budg_cd is null" );
}else{
	System.out.println(this.toString+" : ewh_budg_cd is "+ewh_budg_cd );
}
String owh_budg_cd = req.getParameter("owh_budg_cd");
if( owh_budg_cd == null){
	System.out.println(this.toString+" : owh_budg_cd is null" );
}else{
	System.out.println(this.toString+" : owh_budg_cd is "+owh_budg_cd );
}
String bo_item_yn = req.getParameter("bo_item_yn");
if( bo_item_yn == null){
	System.out.println(this.toString+" : bo_item_yn is null" );
}else{
	System.out.println(this.toString+" : bo_item_yn is "+bo_item_yn );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String medi_ser_no = req.getParameter("medi_ser_no");
if( medi_ser_no == null){
	System.out.println(this.toString+" : medi_ser_no is null" );
}else{
	System.out.println(this.toString+" : medi_ser_no is "+medi_ser_no );
}
String use_deptcd = req.getParameter("use_deptcd");
if( use_deptcd == null){
	System.out.println(this.toString+" : use_deptcd is null" );
}else{
	System.out.println(this.toString+" : use_deptcd is "+use_deptcd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String owh_yn = req.getParameter("owh_yn");
if( owh_yn == null){
	System.out.println(this.toString+" : owh_yn is null" );
}else{
	System.out.println(this.toString+" : owh_yn is "+owh_yn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String ewh_dt = Util.checkString(req.getParameter("ewh_dt"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String purc_clsf = Util.checkString(req.getParameter("purc_clsf"));
String prof_type_cd = Util.checkString(req.getParameter("prof_type_cd"));
String rcpt_prof_clsf = Util.checkString(req.getParameter("rcpt_prof_clsf"));
String fac_clsf = Util.checkString(req.getParameter("fac_clsf"));
String impt_yy = Util.checkString(req.getParameter("impt_yy"));
String impt_seq = Util.checkString(req.getParameter("impt_seq"));
String leas_clsf = Util.checkString(req.getParameter("leas_clsf"));
String incmg_slip_dt = Util.checkString(req.getParameter("incmg_slip_dt"));
String slip_no = Util.checkString(req.getParameter("slip_no"));
String purc_stmt_no = Util.checkString(req.getParameter("purc_stmt_no"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String ern = Util.checkString(req.getParameter("ern"));
String dlco_cd_nm = Util.checkString(req.getParameter("dlco_cd_nm"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String rv_cmpy_cd = Util.checkString(req.getParameter("rv_cmpy_cd"));
String rv_occr_dt = Util.checkString(req.getParameter("rv_occr_dt"));
String rv_seq = Util.checkString(req.getParameter("rv_seq"));
String per_id = Util.checkString(req.getParameter("per_id"));
String per_ip = Util.checkString(req.getParameter("per_ip"));
String gubun = Util.checkString(req.getParameter("gubun"));
String matr_cd = Util.checkString(req.getParameter("matr_cd"));
String matr_cd_nm = Util.checkString(req.getParameter("matr_cd_nm"));
String ewh_unit = Util.checkString(req.getParameter("ewh_unit"));
String ewh_uprc = Util.checkString(req.getParameter("ewh_uprc"));
String ewh_qunt = Util.checkString(req.getParameter("ewh_qunt"));
String ewh_amt = Util.checkString(req.getParameter("ewh_amt"));
String ewh_vat = Util.checkString(req.getParameter("ewh_vat"));
String ewh_budg_cd = Util.checkString(req.getParameter("ewh_budg_cd"));
String owh_budg_cd = Util.checkString(req.getParameter("owh_budg_cd"));
String bo_item_yn = Util.checkString(req.getParameter("bo_item_yn"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String medi_ser_no = Util.checkString(req.getParameter("medi_ser_no"));
String use_deptcd = Util.checkString(req.getParameter("use_deptcd"));
String remk = Util.checkString(req.getParameter("remk"));
String owh_yn = Util.checkString(req.getParameter("owh_yn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String ewh_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_dt")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String purc_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_clsf")));
String prof_type_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prof_type_cd")));
String rcpt_prof_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpt_prof_clsf")));
String fac_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("fac_clsf")));
String impt_yy = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_yy")));
String impt_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("impt_seq")));
String leas_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("leas_clsf")));
String incmg_slip_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_slip_dt")));
String slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_no")));
String purc_stmt_no = Util.Uni2Ksc(Util.checkString(req.getParameter("purc_stmt_no")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String dlco_cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd_nm")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String rv_cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("rv_cmpy_cd")));
String rv_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rv_occr_dt")));
String rv_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("rv_seq")));
String per_id = Util.Uni2Ksc(Util.checkString(req.getParameter("per_id")));
String per_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("per_ip")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
String matr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd")));
String matr_cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("matr_cd_nm")));
String ewh_unit = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_unit")));
String ewh_uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_uprc")));
String ewh_qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_qunt")));
String ewh_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_amt")));
String ewh_vat = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_vat")));
String ewh_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("ewh_budg_cd")));
String owh_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_budg_cd")));
String bo_item_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_item_yn")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String medi_ser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_ser_no")));
String use_deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_deptcd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String owh_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("owh_yn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setEwh_dt(ewh_dt);
dm.setMake_dt(make_dt);
dm.setPurc_clsf(purc_clsf);
dm.setProf_type_cd(prof_type_cd);
dm.setRcpt_prof_clsf(rcpt_prof_clsf);
dm.setFac_clsf(fac_clsf);
dm.setImpt_yy(impt_yy);
dm.setImpt_seq(impt_seq);
dm.setLeas_clsf(leas_clsf);
dm.setIncmg_slip_dt(incmg_slip_dt);
dm.setSlip_no(slip_no);
dm.setPurc_stmt_no(purc_stmt_no);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setDlco_cd(dlco_cd);
dm.setErn(ern);
dm.setDlco_cd_nm(dlco_cd_nm);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setRv_cmpy_cd(rv_cmpy_cd);
dm.setRv_occr_dt(rv_occr_dt);
dm.setRv_seq(rv_seq);
dm.setPer_id(per_id);
dm.setPer_ip(per_ip);
dm.setGubun(gubun);
dm.setMatr_cd(matr_cd);
dm.setMatr_cd_nm(matr_cd_nm);
dm.setEwh_unit(ewh_unit);
dm.setEwh_uprc(ewh_uprc);
dm.setEwh_qunt(ewh_qunt);
dm.setEwh_amt(ewh_amt);
dm.setEwh_vat(ewh_vat);
dm.setEwh_budg_cd(ewh_budg_cd);
dm.setOwh_budg_cd(owh_budg_cd);
dm.setBo_item_yn(bo_item_yn);
dm.setMedi_cd(medi_cd);
dm.setMedi_ser_no(medi_ser_no);
dm.setUse_deptcd(use_deptcd);
dm.setRemk(remk);
dm.setOwh_yn(owh_yn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 02 20:29:44 KST 2009 */