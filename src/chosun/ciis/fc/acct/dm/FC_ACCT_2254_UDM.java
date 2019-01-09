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


public class FC_ACCT_2254_UDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String slip_occr_dt;
	public String slip_clsf_cd;
	public String slip_seq;
	public String slip_sub_seq;
	public String clam_dept_cd;
	public String incmg_emp_no;
	public String fisc_dt;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String slip_arow_no;
	public String budg_cd;
	public String drcr_clsf;
	public String dr_amt;
	public String crdt_amt;
	public String intg_dlco_cd;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_nm;
	public String boks_dlco_nm;
	public String mang_clsf_cd;
	public String mang_no;
	public String incm_clsf_cd;
	public String medi_cd;
	public String dtls_medi_cd;
	public String evnt_cd;
	public String use_dept_cd;
	public String comp_dt;
	public String mtry_dt;
	public String bank_cd;
	public String prop_equip_cd;
	public String unit;
	public String qunt;
	public String chnl_clsf_cd;
	public String etc_in;
	public String tax_stmt_no;
	public String make_dt;
	public String erplace_cd;
	public String ern;
	public String suply_amt;
	public String vat_amt;
	public String setoff_slip_occr_dt;
	public String setoff_slip_clsf_cd;
	public String setoff_slip_seq;
	public String setoff_slip_sub_seq;
	public String setoff_slip_arow_no;
	public String obj_acct_cd;
	public String obj_dt;
	public String obj_amt;
	public String frcr_clsf_cd;
	public String frcr_amt;
	public String exrate;
	public String note_stat;
	public String rmks1;
	public String rmks2;
	public String incmg_dt;
	public String occr_slip_clsf;
	public String occr_slip;
	public String reso_amt;
	public String reso_amt_ch;

	public FC_ACCT_2254_UDM(){}
	public FC_ACCT_2254_UDM(String cmpy_cd, String slip_occr_dt, String slip_clsf_cd, String slip_seq, String slip_sub_seq, String clam_dept_cd, String incmg_emp_no, String fisc_dt, String incmg_pers, String incmg_pers_ipadd, String slip_arow_no, String budg_cd, String drcr_clsf, String dr_amt, String crdt_amt, String intg_dlco_cd, String dlco_clsf_cd, String dlco_cd, String dlco_nm, String boks_dlco_nm, String mang_clsf_cd, String mang_no, String incm_clsf_cd, String medi_cd, String dtls_medi_cd, String evnt_cd, String use_dept_cd, String comp_dt, String mtry_dt, String bank_cd, String prop_equip_cd, String unit, String qunt, String chnl_clsf_cd, String etc_in, String tax_stmt_no, String make_dt, String erplace_cd, String ern, String suply_amt, String vat_amt, String setoff_slip_occr_dt, String setoff_slip_clsf_cd, String setoff_slip_seq, String setoff_slip_sub_seq, String setoff_slip_arow_no, String obj_acct_cd, String obj_dt, String obj_amt, String frcr_clsf_cd, String frcr_amt, String exrate, String note_stat, String rmks1, String rmks2, String incmg_dt, String occr_slip_clsf, String occr_slip, String reso_amt, String reso_amt_ch){
		this.cmpy_cd = cmpy_cd;
		this.slip_occr_dt = slip_occr_dt;
		this.slip_clsf_cd = slip_clsf_cd;
		this.slip_seq = slip_seq;
		this.slip_sub_seq = slip_sub_seq;
		this.clam_dept_cd = clam_dept_cd;
		this.incmg_emp_no = incmg_emp_no;
		this.fisc_dt = fisc_dt;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.slip_arow_no = slip_arow_no;
		this.budg_cd = budg_cd;
		this.drcr_clsf = drcr_clsf;
		this.dr_amt = dr_amt;
		this.crdt_amt = crdt_amt;
		this.intg_dlco_cd = intg_dlco_cd;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.dlco_nm = dlco_nm;
		this.boks_dlco_nm = boks_dlco_nm;
		this.mang_clsf_cd = mang_clsf_cd;
		this.mang_no = mang_no;
		this.incm_clsf_cd = incm_clsf_cd;
		this.medi_cd = medi_cd;
		this.dtls_medi_cd = dtls_medi_cd;
		this.evnt_cd = evnt_cd;
		this.use_dept_cd = use_dept_cd;
		this.comp_dt = comp_dt;
		this.mtry_dt = mtry_dt;
		this.bank_cd = bank_cd;
		this.prop_equip_cd = prop_equip_cd;
		this.unit = unit;
		this.qunt = qunt;
		this.chnl_clsf_cd = chnl_clsf_cd;
		this.etc_in = etc_in;
		this.tax_stmt_no = tax_stmt_no;
		this.make_dt = make_dt;
		this.erplace_cd = erplace_cd;
		this.ern = ern;
		this.suply_amt = suply_amt;
		this.vat_amt = vat_amt;
		this.setoff_slip_occr_dt = setoff_slip_occr_dt;
		this.setoff_slip_clsf_cd = setoff_slip_clsf_cd;
		this.setoff_slip_seq = setoff_slip_seq;
		this.setoff_slip_sub_seq = setoff_slip_sub_seq;
		this.setoff_slip_arow_no = setoff_slip_arow_no;
		this.obj_acct_cd = obj_acct_cd;
		this.obj_dt = obj_dt;
		this.obj_amt = obj_amt;
		this.frcr_clsf_cd = frcr_clsf_cd;
		this.frcr_amt = frcr_amt;
		this.exrate = exrate;
		this.note_stat = note_stat;
		this.rmks1 = rmks1;
		this.rmks2 = rmks2;
		this.incmg_dt = incmg_dt;
		this.occr_slip_clsf = occr_slip_clsf;
		this.occr_slip = occr_slip;
		this.reso_amt = reso_amt;
		this.reso_amt_ch = reso_amt_ch;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setSlip_occr_dt(String slip_occr_dt){
		this.slip_occr_dt = slip_occr_dt;
	}

	public void setSlip_clsf_cd(String slip_clsf_cd){
		this.slip_clsf_cd = slip_clsf_cd;
	}

	public void setSlip_seq(String slip_seq){
		this.slip_seq = slip_seq;
	}

	public void setSlip_sub_seq(String slip_sub_seq){
		this.slip_sub_seq = slip_sub_seq;
	}

	public void setClam_dept_cd(String clam_dept_cd){
		this.clam_dept_cd = clam_dept_cd;
	}

	public void setIncmg_emp_no(String incmg_emp_no){
		this.incmg_emp_no = incmg_emp_no;
	}

	public void setFisc_dt(String fisc_dt){
		this.fisc_dt = fisc_dt;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setSlip_arow_no(String slip_arow_no){
		this.slip_arow_no = slip_arow_no;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDrcr_clsf(String drcr_clsf){
		this.drcr_clsf = drcr_clsf;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setCrdt_amt(String crdt_amt){
		this.crdt_amt = crdt_amt;
	}

	public void setIntg_dlco_cd(String intg_dlco_cd){
		this.intg_dlco_cd = intg_dlco_cd;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_nm(String dlco_nm){
		this.dlco_nm = dlco_nm;
	}

	public void setBoks_dlco_nm(String boks_dlco_nm){
		this.boks_dlco_nm = boks_dlco_nm;
	}

	public void setMang_clsf_cd(String mang_clsf_cd){
		this.mang_clsf_cd = mang_clsf_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setIncm_clsf_cd(String incm_clsf_cd){
		this.incm_clsf_cd = incm_clsf_cd;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setDtls_medi_cd(String dtls_medi_cd){
		this.dtls_medi_cd = dtls_medi_cd;
	}

	public void setEvnt_cd(String evnt_cd){
		this.evnt_cd = evnt_cd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setProp_equip_cd(String prop_equip_cd){
		this.prop_equip_cd = prop_equip_cd;
	}

	public void setUnit(String unit){
		this.unit = unit;
	}

	public void setQunt(String qunt){
		this.qunt = qunt;
	}

	public void setChnl_clsf_cd(String chnl_clsf_cd){
		this.chnl_clsf_cd = chnl_clsf_cd;
	}

	public void setEtc_in(String etc_in){
		this.etc_in = etc_in;
	}

	public void setTax_stmt_no(String tax_stmt_no){
		this.tax_stmt_no = tax_stmt_no;
	}

	public void setMake_dt(String make_dt){
		this.make_dt = make_dt;
	}

	public void setErplace_cd(String erplace_cd){
		this.erplace_cd = erplace_cd;
	}

	public void setErn(String ern){
		this.ern = ern;
	}

	public void setSuply_amt(String suply_amt){
		this.suply_amt = suply_amt;
	}

	public void setVat_amt(String vat_amt){
		this.vat_amt = vat_amt;
	}

	public void setSetoff_slip_occr_dt(String setoff_slip_occr_dt){
		this.setoff_slip_occr_dt = setoff_slip_occr_dt;
	}

	public void setSetoff_slip_clsf_cd(String setoff_slip_clsf_cd){
		this.setoff_slip_clsf_cd = setoff_slip_clsf_cd;
	}

	public void setSetoff_slip_seq(String setoff_slip_seq){
		this.setoff_slip_seq = setoff_slip_seq;
	}

	public void setSetoff_slip_sub_seq(String setoff_slip_sub_seq){
		this.setoff_slip_sub_seq = setoff_slip_sub_seq;
	}

	public void setSetoff_slip_arow_no(String setoff_slip_arow_no){
		this.setoff_slip_arow_no = setoff_slip_arow_no;
	}

	public void setObj_acct_cd(String obj_acct_cd){
		this.obj_acct_cd = obj_acct_cd;
	}

	public void setObj_dt(String obj_dt){
		this.obj_dt = obj_dt;
	}

	public void setObj_amt(String obj_amt){
		this.obj_amt = obj_amt;
	}

	public void setFrcr_clsf_cd(String frcr_clsf_cd){
		this.frcr_clsf_cd = frcr_clsf_cd;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setNote_stat(String note_stat){
		this.note_stat = note_stat;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setRmks2(String rmks2){
		this.rmks2 = rmks2;
	}

	public void setIncmg_dt(String incmg_dt){
		this.incmg_dt = incmg_dt;
	}

	public void setOccr_slip_clsf(String occr_slip_clsf){
		this.occr_slip_clsf = occr_slip_clsf;
	}

	public void setOccr_slip(String occr_slip){
		this.occr_slip = occr_slip;
	}

	public void setReso_amt(String reso_amt){
		this.reso_amt = reso_amt;
	}

	public void setReso_amt_ch(String reso_amt_ch){
		this.reso_amt_ch = reso_amt_ch;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getSlip_occr_dt(){
		return this.slip_occr_dt;
	}

	public String getSlip_clsf_cd(){
		return this.slip_clsf_cd;
	}

	public String getSlip_seq(){
		return this.slip_seq;
	}

	public String getSlip_sub_seq(){
		return this.slip_sub_seq;
	}

	public String getClam_dept_cd(){
		return this.clam_dept_cd;
	}

	public String getIncmg_emp_no(){
		return this.incmg_emp_no;
	}

	public String getFisc_dt(){
		return this.fisc_dt;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getSlip_arow_no(){
		return this.slip_arow_no;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDrcr_clsf(){
		return this.drcr_clsf;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getCrdt_amt(){
		return this.crdt_amt;
	}

	public String getIntg_dlco_cd(){
		return this.intg_dlco_cd;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_nm(){
		return this.dlco_nm;
	}

	public String getBoks_dlco_nm(){
		return this.boks_dlco_nm;
	}

	public String getMang_clsf_cd(){
		return this.mang_clsf_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getIncm_clsf_cd(){
		return this.incm_clsf_cd;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getDtls_medi_cd(){
		return this.dtls_medi_cd;
	}

	public String getEvnt_cd(){
		return this.evnt_cd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getProp_equip_cd(){
		return this.prop_equip_cd;
	}

	public String getUnit(){
		return this.unit;
	}

	public String getQunt(){
		return this.qunt;
	}

	public String getChnl_clsf_cd(){
		return this.chnl_clsf_cd;
	}

	public String getEtc_in(){
		return this.etc_in;
	}

	public String getTax_stmt_no(){
		return this.tax_stmt_no;
	}

	public String getMake_dt(){
		return this.make_dt;
	}

	public String getErplace_cd(){
		return this.erplace_cd;
	}

	public String getErn(){
		return this.ern;
	}

	public String getSuply_amt(){
		return this.suply_amt;
	}

	public String getVat_amt(){
		return this.vat_amt;
	}

	public String getSetoff_slip_occr_dt(){
		return this.setoff_slip_occr_dt;
	}

	public String getSetoff_slip_clsf_cd(){
		return this.setoff_slip_clsf_cd;
	}

	public String getSetoff_slip_seq(){
		return this.setoff_slip_seq;
	}

	public String getSetoff_slip_sub_seq(){
		return this.setoff_slip_sub_seq;
	}

	public String getSetoff_slip_arow_no(){
		return this.setoff_slip_arow_no;
	}

	public String getObj_acct_cd(){
		return this.obj_acct_cd;
	}

	public String getObj_dt(){
		return this.obj_dt;
	}

	public String getObj_amt(){
		return this.obj_amt;
	}

	public String getFrcr_clsf_cd(){
		return this.frcr_clsf_cd;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getNote_stat(){
		return this.note_stat;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getRmks2(){
		return this.rmks2;
	}

	public String getIncmg_dt(){
		return this.incmg_dt;
	}

	public String getOccr_slip_clsf(){
		return this.occr_slip_clsf;
	}

	public String getOccr_slip(){
		return this.occr_slip;
	}

	public String getReso_amt(){
		return this.reso_amt;
	}

	public String getReso_amt_ch(){
		return this.reso_amt_ch;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_ACCT_2254_U(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_ACCT_2254_UDM dm = (FC_ACCT_2254_UDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.slip_occr_dt);
		cstmt.setString(5, dm.slip_clsf_cd);
		cstmt.setString(6, dm.slip_seq);
		cstmt.setString(7, dm.slip_sub_seq);
		cstmt.setString(8, dm.clam_dept_cd);
		cstmt.setString(9, dm.incmg_emp_no);
		cstmt.setString(10, dm.fisc_dt);
		cstmt.setString(11, dm.incmg_pers);
		cstmt.setString(12, dm.incmg_pers_ipadd);
		cstmt.setString(13, dm.slip_arow_no);
		cstmt.setString(14, dm.budg_cd);
		cstmt.setString(15, dm.drcr_clsf);
		cstmt.setString(16, dm.dr_amt);
		cstmt.setString(17, dm.crdt_amt);
		cstmt.setString(18, dm.intg_dlco_cd);
		cstmt.setString(19, dm.dlco_clsf_cd);
		cstmt.setString(20, dm.dlco_cd);
		cstmt.setString(21, dm.dlco_nm);
		cstmt.setString(22, dm.boks_dlco_nm);
		cstmt.setString(23, dm.mang_clsf_cd);
		cstmt.setString(24, dm.mang_no);
		cstmt.setString(25, dm.incm_clsf_cd);
		cstmt.setString(26, dm.medi_cd);
		cstmt.setString(27, dm.dtls_medi_cd);
		cstmt.setString(28, dm.evnt_cd);
		cstmt.setString(29, dm.use_dept_cd);
		cstmt.setString(30, dm.comp_dt);
		cstmt.setString(31, dm.mtry_dt);
		cstmt.setString(32, dm.bank_cd);
		cstmt.setString(33, dm.prop_equip_cd);
		cstmt.setString(34, dm.unit);
		cstmt.setString(35, dm.qunt);
		cstmt.setString(36, dm.chnl_clsf_cd);
		cstmt.setString(37, dm.etc_in);
		cstmt.setString(38, dm.tax_stmt_no);
		cstmt.setString(39, dm.make_dt);
		cstmt.setString(40, dm.erplace_cd);
		cstmt.setString(41, dm.ern);
		cstmt.setString(42, dm.suply_amt);
		cstmt.setString(43, dm.vat_amt);
		cstmt.setString(44, dm.setoff_slip_occr_dt);
		cstmt.setString(45, dm.setoff_slip_clsf_cd);
		cstmt.setString(46, dm.setoff_slip_seq);
		cstmt.setString(47, dm.setoff_slip_sub_seq);
		cstmt.setString(48, dm.setoff_slip_arow_no);
		cstmt.setString(49, dm.obj_acct_cd);
		cstmt.setString(50, dm.obj_dt);
		cstmt.setString(51, dm.obj_amt);
		cstmt.setString(52, dm.frcr_clsf_cd);
		cstmt.setString(53, dm.frcr_amt);
		cstmt.setString(54, dm.exrate);
		cstmt.setString(55, dm.note_stat);
		cstmt.setString(56, dm.rmks1);
		cstmt.setString(57, dm.rmks2);
		cstmt.setString(58, dm.incmg_dt);
		cstmt.setString(59, dm.occr_slip_clsf);
		cstmt.setString(60, dm.occr_slip);
		cstmt.setString(61, dm.reso_amt);
		cstmt.setString(62, dm.reso_amt_ch);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.acct.ds.FC_ACCT_2254_UDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("slip_occr_dt = [" + getSlip_occr_dt() + "]");
		System.out.println("slip_clsf_cd = [" + getSlip_clsf_cd() + "]");
		System.out.println("slip_seq = [" + getSlip_seq() + "]");
		System.out.println("slip_sub_seq = [" + getSlip_sub_seq() + "]");
		System.out.println("clam_dept_cd = [" + getClam_dept_cd() + "]");
		System.out.println("incmg_emp_no = [" + getIncmg_emp_no() + "]");
		System.out.println("fisc_dt = [" + getFisc_dt() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("slip_arow_no = [" + getSlip_arow_no() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("drcr_clsf = [" + getDrcr_clsf() + "]");
		System.out.println("dr_amt = [" + getDr_amt() + "]");
		System.out.println("crdt_amt = [" + getCrdt_amt() + "]");
		System.out.println("intg_dlco_cd = [" + getIntg_dlco_cd() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_nm = [" + getDlco_nm() + "]");
		System.out.println("boks_dlco_nm = [" + getBoks_dlco_nm() + "]");
		System.out.println("mang_clsf_cd = [" + getMang_clsf_cd() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("incm_clsf_cd = [" + getIncm_clsf_cd() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("dtls_medi_cd = [" + getDtls_medi_cd() + "]");
		System.out.println("evnt_cd = [" + getEvnt_cd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("prop_equip_cd = [" + getProp_equip_cd() + "]");
		System.out.println("unit = [" + getUnit() + "]");
		System.out.println("qunt = [" + getQunt() + "]");
		System.out.println("chnl_clsf_cd = [" + getChnl_clsf_cd() + "]");
		System.out.println("etc_in = [" + getEtc_in() + "]");
		System.out.println("tax_stmt_no = [" + getTax_stmt_no() + "]");
		System.out.println("make_dt = [" + getMake_dt() + "]");
		System.out.println("erplace_cd = [" + getErplace_cd() + "]");
		System.out.println("ern = [" + getErn() + "]");
		System.out.println("suply_amt = [" + getSuply_amt() + "]");
		System.out.println("vat_amt = [" + getVat_amt() + "]");
		System.out.println("setoff_slip_occr_dt = [" + getSetoff_slip_occr_dt() + "]");
		System.out.println("setoff_slip_clsf_cd = [" + getSetoff_slip_clsf_cd() + "]");
		System.out.println("setoff_slip_seq = [" + getSetoff_slip_seq() + "]");
		System.out.println("setoff_slip_sub_seq = [" + getSetoff_slip_sub_seq() + "]");
		System.out.println("setoff_slip_arow_no = [" + getSetoff_slip_arow_no() + "]");
		System.out.println("obj_acct_cd = [" + getObj_acct_cd() + "]");
		System.out.println("obj_dt = [" + getObj_dt() + "]");
		System.out.println("obj_amt = [" + getObj_amt() + "]");
		System.out.println("frcr_clsf_cd = [" + getFrcr_clsf_cd() + "]");
		System.out.println("frcr_amt = [" + getFrcr_amt() + "]");
		System.out.println("exrate = [" + getExrate() + "]");
		System.out.println("note_stat = [" + getNote_stat() + "]");
		System.out.println("rmks1 = [" + getRmks1() + "]");
		System.out.println("rmks2 = [" + getRmks2() + "]");
		System.out.println("incmg_dt = [" + getIncmg_dt() + "]");
		System.out.println("occr_slip_clsf = [" + getOccr_slip_clsf() + "]");
		System.out.println("occr_slip = [" + getOccr_slip() + "]");
		System.out.println("reso_amt = [" + getReso_amt() + "]");
		System.out.println("reso_amt_ch = [" + getReso_amt_ch() + "]");
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
String slip_occr_dt = req.getParameter("slip_occr_dt");
if( slip_occr_dt == null){
	System.out.println(this.toString+" : slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : slip_occr_dt is "+slip_occr_dt );
}
String slip_clsf_cd = req.getParameter("slip_clsf_cd");
if( slip_clsf_cd == null){
	System.out.println(this.toString+" : slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : slip_clsf_cd is "+slip_clsf_cd );
}
String slip_seq = req.getParameter("slip_seq");
if( slip_seq == null){
	System.out.println(this.toString+" : slip_seq is null" );
}else{
	System.out.println(this.toString+" : slip_seq is "+slip_seq );
}
String slip_sub_seq = req.getParameter("slip_sub_seq");
if( slip_sub_seq == null){
	System.out.println(this.toString+" : slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : slip_sub_seq is "+slip_sub_seq );
}
String clam_dept_cd = req.getParameter("clam_dept_cd");
if( clam_dept_cd == null){
	System.out.println(this.toString+" : clam_dept_cd is null" );
}else{
	System.out.println(this.toString+" : clam_dept_cd is "+clam_dept_cd );
}
String incmg_emp_no = req.getParameter("incmg_emp_no");
if( incmg_emp_no == null){
	System.out.println(this.toString+" : incmg_emp_no is null" );
}else{
	System.out.println(this.toString+" : incmg_emp_no is "+incmg_emp_no );
}
String fisc_dt = req.getParameter("fisc_dt");
if( fisc_dt == null){
	System.out.println(this.toString+" : fisc_dt is null" );
}else{
	System.out.println(this.toString+" : fisc_dt is "+fisc_dt );
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
String slip_arow_no = req.getParameter("slip_arow_no");
if( slip_arow_no == null){
	System.out.println(this.toString+" : slip_arow_no is null" );
}else{
	System.out.println(this.toString+" : slip_arow_no is "+slip_arow_no );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String drcr_clsf = req.getParameter("drcr_clsf");
if( drcr_clsf == null){
	System.out.println(this.toString+" : drcr_clsf is null" );
}else{
	System.out.println(this.toString+" : drcr_clsf is "+drcr_clsf );
}
String dr_amt = req.getParameter("dr_amt");
if( dr_amt == null){
	System.out.println(this.toString+" : dr_amt is null" );
}else{
	System.out.println(this.toString+" : dr_amt is "+dr_amt );
}
String crdt_amt = req.getParameter("crdt_amt");
if( crdt_amt == null){
	System.out.println(this.toString+" : crdt_amt is null" );
}else{
	System.out.println(this.toString+" : crdt_amt is "+crdt_amt );
}
String intg_dlco_cd = req.getParameter("intg_dlco_cd");
if( intg_dlco_cd == null){
	System.out.println(this.toString+" : intg_dlco_cd is null" );
}else{
	System.out.println(this.toString+" : intg_dlco_cd is "+intg_dlco_cd );
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
String dlco_nm = req.getParameter("dlco_nm");
if( dlco_nm == null){
	System.out.println(this.toString+" : dlco_nm is null" );
}else{
	System.out.println(this.toString+" : dlco_nm is "+dlco_nm );
}
String boks_dlco_nm = req.getParameter("boks_dlco_nm");
if( boks_dlco_nm == null){
	System.out.println(this.toString+" : boks_dlco_nm is null" );
}else{
	System.out.println(this.toString+" : boks_dlco_nm is "+boks_dlco_nm );
}
String mang_clsf_cd = req.getParameter("mang_clsf_cd");
if( mang_clsf_cd == null){
	System.out.println(this.toString+" : mang_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : mang_clsf_cd is "+mang_clsf_cd );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String incm_clsf_cd = req.getParameter("incm_clsf_cd");
if( incm_clsf_cd == null){
	System.out.println(this.toString+" : incm_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : incm_clsf_cd is "+incm_clsf_cd );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String dtls_medi_cd = req.getParameter("dtls_medi_cd");
if( dtls_medi_cd == null){
	System.out.println(this.toString+" : dtls_medi_cd is null" );
}else{
	System.out.println(this.toString+" : dtls_medi_cd is "+dtls_medi_cd );
}
String evnt_cd = req.getParameter("evnt_cd");
if( evnt_cd == null){
	System.out.println(this.toString+" : evnt_cd is null" );
}else{
	System.out.println(this.toString+" : evnt_cd is "+evnt_cd );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String prop_equip_cd = req.getParameter("prop_equip_cd");
if( prop_equip_cd == null){
	System.out.println(this.toString+" : prop_equip_cd is null" );
}else{
	System.out.println(this.toString+" : prop_equip_cd is "+prop_equip_cd );
}
String unit = req.getParameter("unit");
if( unit == null){
	System.out.println(this.toString+" : unit is null" );
}else{
	System.out.println(this.toString+" : unit is "+unit );
}
String qunt = req.getParameter("qunt");
if( qunt == null){
	System.out.println(this.toString+" : qunt is null" );
}else{
	System.out.println(this.toString+" : qunt is "+qunt );
}
String chnl_clsf_cd = req.getParameter("chnl_clsf_cd");
if( chnl_clsf_cd == null){
	System.out.println(this.toString+" : chnl_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : chnl_clsf_cd is "+chnl_clsf_cd );
}
String etc_in = req.getParameter("etc_in");
if( etc_in == null){
	System.out.println(this.toString+" : etc_in is null" );
}else{
	System.out.println(this.toString+" : etc_in is "+etc_in );
}
String tax_stmt_no = req.getParameter("tax_stmt_no");
if( tax_stmt_no == null){
	System.out.println(this.toString+" : tax_stmt_no is null" );
}else{
	System.out.println(this.toString+" : tax_stmt_no is "+tax_stmt_no );
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
String ern = req.getParameter("ern");
if( ern == null){
	System.out.println(this.toString+" : ern is null" );
}else{
	System.out.println(this.toString+" : ern is "+ern );
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
String setoff_slip_occr_dt = req.getParameter("setoff_slip_occr_dt");
if( setoff_slip_occr_dt == null){
	System.out.println(this.toString+" : setoff_slip_occr_dt is null" );
}else{
	System.out.println(this.toString+" : setoff_slip_occr_dt is "+setoff_slip_occr_dt );
}
String setoff_slip_clsf_cd = req.getParameter("setoff_slip_clsf_cd");
if( setoff_slip_clsf_cd == null){
	System.out.println(this.toString+" : setoff_slip_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : setoff_slip_clsf_cd is "+setoff_slip_clsf_cd );
}
String setoff_slip_seq = req.getParameter("setoff_slip_seq");
if( setoff_slip_seq == null){
	System.out.println(this.toString+" : setoff_slip_seq is null" );
}else{
	System.out.println(this.toString+" : setoff_slip_seq is "+setoff_slip_seq );
}
String setoff_slip_sub_seq = req.getParameter("setoff_slip_sub_seq");
if( setoff_slip_sub_seq == null){
	System.out.println(this.toString+" : setoff_slip_sub_seq is null" );
}else{
	System.out.println(this.toString+" : setoff_slip_sub_seq is "+setoff_slip_sub_seq );
}
String setoff_slip_arow_no = req.getParameter("setoff_slip_arow_no");
if( setoff_slip_arow_no == null){
	System.out.println(this.toString+" : setoff_slip_arow_no is null" );
}else{
	System.out.println(this.toString+" : setoff_slip_arow_no is "+setoff_slip_arow_no );
}
String obj_acct_cd = req.getParameter("obj_acct_cd");
if( obj_acct_cd == null){
	System.out.println(this.toString+" : obj_acct_cd is null" );
}else{
	System.out.println(this.toString+" : obj_acct_cd is "+obj_acct_cd );
}
String obj_dt = req.getParameter("obj_dt");
if( obj_dt == null){
	System.out.println(this.toString+" : obj_dt is null" );
}else{
	System.out.println(this.toString+" : obj_dt is "+obj_dt );
}
String obj_amt = req.getParameter("obj_amt");
if( obj_amt == null){
	System.out.println(this.toString+" : obj_amt is null" );
}else{
	System.out.println(this.toString+" : obj_amt is "+obj_amt );
}
String frcr_clsf_cd = req.getParameter("frcr_clsf_cd");
if( frcr_clsf_cd == null){
	System.out.println(this.toString+" : frcr_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : frcr_clsf_cd is "+frcr_clsf_cd );
}
String frcr_amt = req.getParameter("frcr_amt");
if( frcr_amt == null){
	System.out.println(this.toString+" : frcr_amt is null" );
}else{
	System.out.println(this.toString+" : frcr_amt is "+frcr_amt );
}
String exrate = req.getParameter("exrate");
if( exrate == null){
	System.out.println(this.toString+" : exrate is null" );
}else{
	System.out.println(this.toString+" : exrate is "+exrate );
}
String note_stat = req.getParameter("note_stat");
if( note_stat == null){
	System.out.println(this.toString+" : note_stat is null" );
}else{
	System.out.println(this.toString+" : note_stat is "+note_stat );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
}
String rmks2 = req.getParameter("rmks2");
if( rmks2 == null){
	System.out.println(this.toString+" : rmks2 is null" );
}else{
	System.out.println(this.toString+" : rmks2 is "+rmks2 );
}
String incmg_dt = req.getParameter("incmg_dt");
if( incmg_dt == null){
	System.out.println(this.toString+" : incmg_dt is null" );
}else{
	System.out.println(this.toString+" : incmg_dt is "+incmg_dt );
}
String occr_slip_clsf = req.getParameter("occr_slip_clsf");
if( occr_slip_clsf == null){
	System.out.println(this.toString+" : occr_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : occr_slip_clsf is "+occr_slip_clsf );
}
String occr_slip = req.getParameter("occr_slip");
if( occr_slip == null){
	System.out.println(this.toString+" : occr_slip is null" );
}else{
	System.out.println(this.toString+" : occr_slip is "+occr_slip );
}
String reso_amt = req.getParameter("reso_amt");
if( reso_amt == null){
	System.out.println(this.toString+" : reso_amt is null" );
}else{
	System.out.println(this.toString+" : reso_amt is "+reso_amt );
}
String reso_amt_ch = req.getParameter("reso_amt_ch");
if( reso_amt_ch == null){
	System.out.println(this.toString+" : reso_amt_ch is null" );
}else{
	System.out.println(this.toString+" : reso_amt_ch is "+reso_amt_ch );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String slip_occr_dt = Util.checkString(req.getParameter("slip_occr_dt"));
String slip_clsf_cd = Util.checkString(req.getParameter("slip_clsf_cd"));
String slip_seq = Util.checkString(req.getParameter("slip_seq"));
String slip_sub_seq = Util.checkString(req.getParameter("slip_sub_seq"));
String clam_dept_cd = Util.checkString(req.getParameter("clam_dept_cd"));
String incmg_emp_no = Util.checkString(req.getParameter("incmg_emp_no"));
String fisc_dt = Util.checkString(req.getParameter("fisc_dt"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String slip_arow_no = Util.checkString(req.getParameter("slip_arow_no"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String drcr_clsf = Util.checkString(req.getParameter("drcr_clsf"));
String dr_amt = Util.checkString(req.getParameter("dr_amt"));
String crdt_amt = Util.checkString(req.getParameter("crdt_amt"));
String intg_dlco_cd = Util.checkString(req.getParameter("intg_dlco_cd"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_nm = Util.checkString(req.getParameter("dlco_nm"));
String boks_dlco_nm = Util.checkString(req.getParameter("boks_dlco_nm"));
String mang_clsf_cd = Util.checkString(req.getParameter("mang_clsf_cd"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String incm_clsf_cd = Util.checkString(req.getParameter("incm_clsf_cd"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String dtls_medi_cd = Util.checkString(req.getParameter("dtls_medi_cd"));
String evnt_cd = Util.checkString(req.getParameter("evnt_cd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String prop_equip_cd = Util.checkString(req.getParameter("prop_equip_cd"));
String unit = Util.checkString(req.getParameter("unit"));
String qunt = Util.checkString(req.getParameter("qunt"));
String chnl_clsf_cd = Util.checkString(req.getParameter("chnl_clsf_cd"));
String etc_in = Util.checkString(req.getParameter("etc_in"));
String tax_stmt_no = Util.checkString(req.getParameter("tax_stmt_no"));
String make_dt = Util.checkString(req.getParameter("make_dt"));
String erplace_cd = Util.checkString(req.getParameter("erplace_cd"));
String ern = Util.checkString(req.getParameter("ern"));
String suply_amt = Util.checkString(req.getParameter("suply_amt"));
String vat_amt = Util.checkString(req.getParameter("vat_amt"));
String setoff_slip_occr_dt = Util.checkString(req.getParameter("setoff_slip_occr_dt"));
String setoff_slip_clsf_cd = Util.checkString(req.getParameter("setoff_slip_clsf_cd"));
String setoff_slip_seq = Util.checkString(req.getParameter("setoff_slip_seq"));
String setoff_slip_sub_seq = Util.checkString(req.getParameter("setoff_slip_sub_seq"));
String setoff_slip_arow_no = Util.checkString(req.getParameter("setoff_slip_arow_no"));
String obj_acct_cd = Util.checkString(req.getParameter("obj_acct_cd"));
String obj_dt = Util.checkString(req.getParameter("obj_dt"));
String obj_amt = Util.checkString(req.getParameter("obj_amt"));
String frcr_clsf_cd = Util.checkString(req.getParameter("frcr_clsf_cd"));
String frcr_amt = Util.checkString(req.getParameter("frcr_amt"));
String exrate = Util.checkString(req.getParameter("exrate"));
String note_stat = Util.checkString(req.getParameter("note_stat"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String rmks2 = Util.checkString(req.getParameter("rmks2"));
String incmg_dt = Util.checkString(req.getParameter("incmg_dt"));
String occr_slip_clsf = Util.checkString(req.getParameter("occr_slip_clsf"));
String occr_slip = Util.checkString(req.getParameter("occr_slip"));
String reso_amt = Util.checkString(req.getParameter("reso_amt"));
String reso_amt_ch = Util.checkString(req.getParameter("reso_amt_ch"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_occr_dt")));
String slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_clsf_cd")));
String slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_seq")));
String slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_sub_seq")));
String clam_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_dept_cd")));
String incmg_emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_emp_no")));
String fisc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fisc_dt")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String slip_arow_no = Util.Uni2Ksc(Util.checkString(req.getParameter("slip_arow_no")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String drcr_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("drcr_clsf")));
String dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dr_amt")));
String crdt_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("crdt_amt")));
String intg_dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("intg_dlco_cd")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_nm")));
String boks_dlco_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("boks_dlco_nm")));
String mang_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_clsf_cd")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String incm_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_clsf_cd")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String dtls_medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dtls_medi_cd")));
String evnt_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_cd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String prop_equip_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("prop_equip_cd")));
String unit = Util.Uni2Ksc(Util.checkString(req.getParameter("unit")));
String qunt = Util.Uni2Ksc(Util.checkString(req.getParameter("qunt")));
String chnl_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chnl_clsf_cd")));
String etc_in = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_in")));
String tax_stmt_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_stmt_no")));
String make_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("make_dt")));
String erplace_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("erplace_cd")));
String ern = Util.Uni2Ksc(Util.checkString(req.getParameter("ern")));
String suply_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("suply_amt")));
String vat_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("vat_amt")));
String setoff_slip_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_slip_occr_dt")));
String setoff_slip_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_slip_clsf_cd")));
String setoff_slip_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_slip_seq")));
String setoff_slip_sub_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_slip_sub_seq")));
String setoff_slip_arow_no = Util.Uni2Ksc(Util.checkString(req.getParameter("setoff_slip_arow_no")));
String obj_acct_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_acct_cd")));
String obj_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_dt")));
String obj_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("obj_amt")));
String frcr_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frcr_clsf_cd")));
String frcr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frcr_amt")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
String note_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("note_stat")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String rmks2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks2")));
String incmg_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_dt")));
String occr_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip_clsf")));
String occr_slip = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_slip")));
String reso_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("reso_amt")));
String reso_amt_ch = Util.Uni2Ksc(Util.checkString(req.getParameter("reso_amt_ch")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setSlip_occr_dt(slip_occr_dt);
dm.setSlip_clsf_cd(slip_clsf_cd);
dm.setSlip_seq(slip_seq);
dm.setSlip_sub_seq(slip_sub_seq);
dm.setClam_dept_cd(clam_dept_cd);
dm.setIncmg_emp_no(incmg_emp_no);
dm.setFisc_dt(fisc_dt);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setSlip_arow_no(slip_arow_no);
dm.setBudg_cd(budg_cd);
dm.setDrcr_clsf(drcr_clsf);
dm.setDr_amt(dr_amt);
dm.setCrdt_amt(crdt_amt);
dm.setIntg_dlco_cd(intg_dlco_cd);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDlco_nm(dlco_nm);
dm.setBoks_dlco_nm(boks_dlco_nm);
dm.setMang_clsf_cd(mang_clsf_cd);
dm.setMang_no(mang_no);
dm.setIncm_clsf_cd(incm_clsf_cd);
dm.setMedi_cd(medi_cd);
dm.setDtls_medi_cd(dtls_medi_cd);
dm.setEvnt_cd(evnt_cd);
dm.setUse_dept_cd(use_dept_cd);
dm.setComp_dt(comp_dt);
dm.setMtry_dt(mtry_dt);
dm.setBank_cd(bank_cd);
dm.setProp_equip_cd(prop_equip_cd);
dm.setUnit(unit);
dm.setQunt(qunt);
dm.setChnl_clsf_cd(chnl_clsf_cd);
dm.setEtc_in(etc_in);
dm.setTax_stmt_no(tax_stmt_no);
dm.setMake_dt(make_dt);
dm.setErplace_cd(erplace_cd);
dm.setErn(ern);
dm.setSuply_amt(suply_amt);
dm.setVat_amt(vat_amt);
dm.setSetoff_slip_occr_dt(setoff_slip_occr_dt);
dm.setSetoff_slip_clsf_cd(setoff_slip_clsf_cd);
dm.setSetoff_slip_seq(setoff_slip_seq);
dm.setSetoff_slip_sub_seq(setoff_slip_sub_seq);
dm.setSetoff_slip_arow_no(setoff_slip_arow_no);
dm.setObj_acct_cd(obj_acct_cd);
dm.setObj_dt(obj_dt);
dm.setObj_amt(obj_amt);
dm.setFrcr_clsf_cd(frcr_clsf_cd);
dm.setFrcr_amt(frcr_amt);
dm.setExrate(exrate);
dm.setNote_stat(note_stat);
dm.setRmks1(rmks1);
dm.setRmks2(rmks2);
dm.setIncmg_dt(incmg_dt);
dm.setOccr_slip_clsf(occr_slip_clsf);
dm.setOccr_slip(occr_slip);
dm.setReso_amt(reso_amt);
dm.setReso_amt_ch(reso_amt_ch);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Dec 18 15:04:03 KST 2014 */