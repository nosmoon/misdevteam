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


package chosun.ciis.se.etc.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.se.etc.ds.*;
import chosun.ciis.se.etc.rec.*;

/**
 * 
 */


public class SE_ETC_1740_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String yymm;
	public String pay_seq;
	public String evnt_nm;
	public String budg_yymm;
	public String dept_cd;
	public String pay_mthd_clsf;
	public String pay_obj_clsf;
	public String tax_yn;
	public String uprc;
	public String draft_doc_no;
	public String pay_dt;
	public String decid_stat;
	public String clos_yn;
	public String mode_sub;
	public String yymm_sub;
	public String pay_seq_sub;
	public String pay_ptcr_seq;
	public String bo_cd;
	public String bo_seq;
	public String dept_cd_sub;
	public String sub_dept_cd;
	public String area_cd;
	public String chrg_pers;
	public String tax_yn_sub;
	public String prn;
	public String recp_pers_nm;
	public String medi_cd;
	public String qty;
	public String uprc_sub;
	public String amt;
	public String incm_tax;
	public String res_tax;
	public String acct_no;
	public String bank_cd;
	public String rmks;
	public String incmg_pers_ip;
	public String incmg_pers;

	public SE_ETC_1740_ADM(){}
	public SE_ETC_1740_ADM(String cmpy_cd, String mode, String yymm, String pay_seq, String evnt_nm, String budg_yymm, String dept_cd, String pay_mthd_clsf, String pay_obj_clsf, String tax_yn, String uprc, String draft_doc_no, String pay_dt, String decid_stat, String clos_yn, String mode_sub, String yymm_sub, String pay_seq_sub, String pay_ptcr_seq, String bo_cd, String bo_seq, String dept_cd_sub, String sub_dept_cd, String area_cd, String chrg_pers, String tax_yn_sub, String prn, String recp_pers_nm, String medi_cd, String qty, String uprc_sub, String amt, String incm_tax, String res_tax, String acct_no, String bank_cd, String rmks, String incmg_pers_ip, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.yymm = yymm;
		this.pay_seq = pay_seq;
		this.evnt_nm = evnt_nm;
		this.budg_yymm = budg_yymm;
		this.dept_cd = dept_cd;
		this.pay_mthd_clsf = pay_mthd_clsf;
		this.pay_obj_clsf = pay_obj_clsf;
		this.tax_yn = tax_yn;
		this.uprc = uprc;
		this.draft_doc_no = draft_doc_no;
		this.pay_dt = pay_dt;
		this.decid_stat = decid_stat;
		this.clos_yn = clos_yn;
		this.mode_sub = mode_sub;
		this.yymm_sub = yymm_sub;
		this.pay_seq_sub = pay_seq_sub;
		this.pay_ptcr_seq = pay_ptcr_seq;
		this.bo_cd = bo_cd;
		this.bo_seq = bo_seq;
		this.dept_cd_sub = dept_cd_sub;
		this.sub_dept_cd = sub_dept_cd;
		this.area_cd = area_cd;
		this.chrg_pers = chrg_pers;
		this.tax_yn_sub = tax_yn_sub;
		this.prn = prn;
		this.recp_pers_nm = recp_pers_nm;
		this.medi_cd = medi_cd;
		this.qty = qty;
		this.uprc_sub = uprc_sub;
		this.amt = amt;
		this.incm_tax = incm_tax;
		this.res_tax = res_tax;
		this.acct_no = acct_no;
		this.bank_cd = bank_cd;
		this.rmks = rmks;
		this.incmg_pers_ip = incmg_pers_ip;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setPay_seq(String pay_seq){
		this.pay_seq = pay_seq;
	}

	public void setEvnt_nm(String evnt_nm){
		this.evnt_nm = evnt_nm;
	}

	public void setBudg_yymm(String budg_yymm){
		this.budg_yymm = budg_yymm;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPay_mthd_clsf(String pay_mthd_clsf){
		this.pay_mthd_clsf = pay_mthd_clsf;
	}

	public void setPay_obj_clsf(String pay_obj_clsf){
		this.pay_obj_clsf = pay_obj_clsf;
	}

	public void setTax_yn(String tax_yn){
		this.tax_yn = tax_yn;
	}

	public void setUprc(String uprc){
		this.uprc = uprc;
	}

	public void setDraft_doc_no(String draft_doc_no){
		this.draft_doc_no = draft_doc_no;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setDecid_stat(String decid_stat){
		this.decid_stat = decid_stat;
	}

	public void setClos_yn(String clos_yn){
		this.clos_yn = clos_yn;
	}

	public void setMode_sub(String mode_sub){
		this.mode_sub = mode_sub;
	}

	public void setYymm_sub(String yymm_sub){
		this.yymm_sub = yymm_sub;
	}

	public void setPay_seq_sub(String pay_seq_sub){
		this.pay_seq_sub = pay_seq_sub;
	}

	public void setPay_ptcr_seq(String pay_ptcr_seq){
		this.pay_ptcr_seq = pay_ptcr_seq;
	}

	public void setBo_cd(String bo_cd){
		this.bo_cd = bo_cd;
	}

	public void setBo_seq(String bo_seq){
		this.bo_seq = bo_seq;
	}

	public void setDept_cd_sub(String dept_cd_sub){
		this.dept_cd_sub = dept_cd_sub;
	}

	public void setSub_dept_cd(String sub_dept_cd){
		this.sub_dept_cd = sub_dept_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setChrg_pers(String chrg_pers){
		this.chrg_pers = chrg_pers;
	}

	public void setTax_yn_sub(String tax_yn_sub){
		this.tax_yn_sub = tax_yn_sub;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setRecp_pers_nm(String recp_pers_nm){
		this.recp_pers_nm = recp_pers_nm;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setUprc_sub(String uprc_sub){
		this.uprc_sub = uprc_sub;
	}

	public void setAmt(String amt){
		this.amt = amt;
	}

	public void setIncm_tax(String incm_tax){
		this.incm_tax = incm_tax;
	}

	public void setRes_tax(String res_tax){
		this.res_tax = res_tax;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setRmks(String rmks){
		this.rmks = rmks;
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

	public String getMode(){
		return this.mode;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getPay_seq(){
		return this.pay_seq;
	}

	public String getEvnt_nm(){
		return this.evnt_nm;
	}

	public String getBudg_yymm(){
		return this.budg_yymm;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPay_mthd_clsf(){
		return this.pay_mthd_clsf;
	}

	public String getPay_obj_clsf(){
		return this.pay_obj_clsf;
	}

	public String getTax_yn(){
		return this.tax_yn;
	}

	public String getUprc(){
		return this.uprc;
	}

	public String getDraft_doc_no(){
		return this.draft_doc_no;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getDecid_stat(){
		return this.decid_stat;
	}

	public String getClos_yn(){
		return this.clos_yn;
	}

	public String getMode_sub(){
		return this.mode_sub;
	}

	public String getYymm_sub(){
		return this.yymm_sub;
	}

	public String getPay_seq_sub(){
		return this.pay_seq_sub;
	}

	public String getPay_ptcr_seq(){
		return this.pay_ptcr_seq;
	}

	public String getBo_cd(){
		return this.bo_cd;
	}

	public String getBo_seq(){
		return this.bo_seq;
	}

	public String getDept_cd_sub(){
		return this.dept_cd_sub;
	}

	public String getSub_dept_cd(){
		return this.sub_dept_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getChrg_pers(){
		return this.chrg_pers;
	}

	public String getTax_yn_sub(){
		return this.tax_yn_sub;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getRecp_pers_nm(){
		return this.recp_pers_nm;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getQty(){
		return this.qty;
	}

	public String getUprc_sub(){
		return this.uprc_sub;
	}

	public String getAmt(){
		return this.amt;
	}

	public String getIncm_tax(){
		return this.incm_tax;
	}

	public String getRes_tax(){
		return this.res_tax;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getRmks(){
		return this.rmks;
	}

	public String getIncmg_pers_ip(){
		return this.incmg_pers_ip;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SE_ETC_1740_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SE_ETC_1740_ADM dm = (SE_ETC_1740_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.yymm);
		cstmt.setString(6, dm.pay_seq);
		cstmt.setString(7, dm.evnt_nm);
		cstmt.setString(8, dm.budg_yymm);
		cstmt.setString(9, dm.dept_cd);
		cstmt.setString(10, dm.pay_mthd_clsf);
		cstmt.setString(11, dm.pay_obj_clsf);
		cstmt.setString(12, dm.tax_yn);
		cstmt.setString(13, dm.uprc);
		cstmt.setString(14, dm.draft_doc_no);
		cstmt.setString(15, dm.pay_dt);
		cstmt.setString(16, dm.decid_stat);
		cstmt.setString(17, dm.clos_yn);
		cstmt.setString(18, dm.mode_sub);
		cstmt.setString(19, dm.yymm_sub);
		cstmt.setString(20, dm.pay_seq_sub);
		cstmt.setString(21, dm.pay_ptcr_seq);
		cstmt.setString(22, dm.bo_cd);
		cstmt.setString(23, dm.bo_seq);
		cstmt.setString(24, dm.dept_cd_sub);
		cstmt.setString(25, dm.sub_dept_cd);
		cstmt.setString(26, dm.area_cd);
		cstmt.setString(27, dm.chrg_pers);
		cstmt.setString(28, dm.tax_yn_sub);
		cstmt.setString(29, dm.prn);
		cstmt.setString(30, dm.recp_pers_nm);
		cstmt.setString(31, dm.medi_cd);
		cstmt.setString(32, dm.qty);
		cstmt.setString(33, dm.uprc_sub);
		cstmt.setString(34, dm.amt);
		cstmt.setString(35, dm.incm_tax);
		cstmt.setString(36, dm.res_tax);
		cstmt.setString(37, dm.acct_no);
		cstmt.setString(38, dm.bank_cd);
		cstmt.setString(39, dm.rmks);
		cstmt.setString(40, dm.incmg_pers_ip);
		cstmt.setString(41, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.se.etc.ds.SE_ETC_1740_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("yymm = [" + getYymm() + "]");
		System.out.println("pay_seq = [" + getPay_seq() + "]");
		System.out.println("evnt_nm = [" + getEvnt_nm() + "]");
		System.out.println("budg_yymm = [" + getBudg_yymm() + "]");
		System.out.println("dept_cd = [" + getDept_cd() + "]");
		System.out.println("pay_mthd_clsf = [" + getPay_mthd_clsf() + "]");
		System.out.println("pay_obj_clsf = [" + getPay_obj_clsf() + "]");
		System.out.println("tax_yn = [" + getTax_yn() + "]");
		System.out.println("uprc = [" + getUprc() + "]");
		System.out.println("draft_doc_no = [" + getDraft_doc_no() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("decid_stat = [" + getDecid_stat() + "]");
		System.out.println("clos_yn = [" + getClos_yn() + "]");
		System.out.println("mode_sub = [" + getMode_sub() + "]");
		System.out.println("yymm_sub = [" + getYymm_sub() + "]");
		System.out.println("pay_seq_sub = [" + getPay_seq_sub() + "]");
		System.out.println("pay_ptcr_seq = [" + getPay_ptcr_seq() + "]");
		System.out.println("bo_cd = [" + getBo_cd() + "]");
		System.out.println("bo_seq = [" + getBo_seq() + "]");
		System.out.println("dept_cd_sub = [" + getDept_cd_sub() + "]");
		System.out.println("sub_dept_cd = [" + getSub_dept_cd() + "]");
		System.out.println("area_cd = [" + getArea_cd() + "]");
		System.out.println("chrg_pers = [" + getChrg_pers() + "]");
		System.out.println("tax_yn_sub = [" + getTax_yn_sub() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("recp_pers_nm = [" + getRecp_pers_nm() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("uprc_sub = [" + getUprc_sub() + "]");
		System.out.println("amt = [" + getAmt() + "]");
		System.out.println("incm_tax = [" + getIncm_tax() + "]");
		System.out.println("res_tax = [" + getRes_tax() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("rmks = [" + getRmks() + "]");
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
String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String pay_seq = req.getParameter("pay_seq");
if( pay_seq == null){
	System.out.println(this.toString+" : pay_seq is null" );
}else{
	System.out.println(this.toString+" : pay_seq is "+pay_seq );
}
String evnt_nm = req.getParameter("evnt_nm");
if( evnt_nm == null){
	System.out.println(this.toString+" : evnt_nm is null" );
}else{
	System.out.println(this.toString+" : evnt_nm is "+evnt_nm );
}
String budg_yymm = req.getParameter("budg_yymm");
if( budg_yymm == null){
	System.out.println(this.toString+" : budg_yymm is null" );
}else{
	System.out.println(this.toString+" : budg_yymm is "+budg_yymm );
}
String dept_cd = req.getParameter("dept_cd");
if( dept_cd == null){
	System.out.println(this.toString+" : dept_cd is null" );
}else{
	System.out.println(this.toString+" : dept_cd is "+dept_cd );
}
String pay_mthd_clsf = req.getParameter("pay_mthd_clsf");
if( pay_mthd_clsf == null){
	System.out.println(this.toString+" : pay_mthd_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_mthd_clsf is "+pay_mthd_clsf );
}
String pay_obj_clsf = req.getParameter("pay_obj_clsf");
if( pay_obj_clsf == null){
	System.out.println(this.toString+" : pay_obj_clsf is null" );
}else{
	System.out.println(this.toString+" : pay_obj_clsf is "+pay_obj_clsf );
}
String tax_yn = req.getParameter("tax_yn");
if( tax_yn == null){
	System.out.println(this.toString+" : tax_yn is null" );
}else{
	System.out.println(this.toString+" : tax_yn is "+tax_yn );
}
String uprc = req.getParameter("uprc");
if( uprc == null){
	System.out.println(this.toString+" : uprc is null" );
}else{
	System.out.println(this.toString+" : uprc is "+uprc );
}
String draft_doc_no = req.getParameter("draft_doc_no");
if( draft_doc_no == null){
	System.out.println(this.toString+" : draft_doc_no is null" );
}else{
	System.out.println(this.toString+" : draft_doc_no is "+draft_doc_no );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String decid_stat = req.getParameter("decid_stat");
if( decid_stat == null){
	System.out.println(this.toString+" : decid_stat is null" );
}else{
	System.out.println(this.toString+" : decid_stat is "+decid_stat );
}
String clos_yn = req.getParameter("clos_yn");
if( clos_yn == null){
	System.out.println(this.toString+" : clos_yn is null" );
}else{
	System.out.println(this.toString+" : clos_yn is "+clos_yn );
}
String mode_sub = req.getParameter("mode_sub");
if( mode_sub == null){
	System.out.println(this.toString+" : mode_sub is null" );
}else{
	System.out.println(this.toString+" : mode_sub is "+mode_sub );
}
String yymm_sub = req.getParameter("yymm_sub");
if( yymm_sub == null){
	System.out.println(this.toString+" : yymm_sub is null" );
}else{
	System.out.println(this.toString+" : yymm_sub is "+yymm_sub );
}
String pay_seq_sub = req.getParameter("pay_seq_sub");
if( pay_seq_sub == null){
	System.out.println(this.toString+" : pay_seq_sub is null" );
}else{
	System.out.println(this.toString+" : pay_seq_sub is "+pay_seq_sub );
}
String pay_ptcr_seq = req.getParameter("pay_ptcr_seq");
if( pay_ptcr_seq == null){
	System.out.println(this.toString+" : pay_ptcr_seq is null" );
}else{
	System.out.println(this.toString+" : pay_ptcr_seq is "+pay_ptcr_seq );
}
String bo_cd = req.getParameter("bo_cd");
if( bo_cd == null){
	System.out.println(this.toString+" : bo_cd is null" );
}else{
	System.out.println(this.toString+" : bo_cd is "+bo_cd );
}
String bo_seq = req.getParameter("bo_seq");
if( bo_seq == null){
	System.out.println(this.toString+" : bo_seq is null" );
}else{
	System.out.println(this.toString+" : bo_seq is "+bo_seq );
}
String dept_cd_sub = req.getParameter("dept_cd_sub");
if( dept_cd_sub == null){
	System.out.println(this.toString+" : dept_cd_sub is null" );
}else{
	System.out.println(this.toString+" : dept_cd_sub is "+dept_cd_sub );
}
String sub_dept_cd = req.getParameter("sub_dept_cd");
if( sub_dept_cd == null){
	System.out.println(this.toString+" : sub_dept_cd is null" );
}else{
	System.out.println(this.toString+" : sub_dept_cd is "+sub_dept_cd );
}
String area_cd = req.getParameter("area_cd");
if( area_cd == null){
	System.out.println(this.toString+" : area_cd is null" );
}else{
	System.out.println(this.toString+" : area_cd is "+area_cd );
}
String chrg_pers = req.getParameter("chrg_pers");
if( chrg_pers == null){
	System.out.println(this.toString+" : chrg_pers is null" );
}else{
	System.out.println(this.toString+" : chrg_pers is "+chrg_pers );
}
String tax_yn_sub = req.getParameter("tax_yn_sub");
if( tax_yn_sub == null){
	System.out.println(this.toString+" : tax_yn_sub is null" );
}else{
	System.out.println(this.toString+" : tax_yn_sub is "+tax_yn_sub );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String recp_pers_nm = req.getParameter("recp_pers_nm");
if( recp_pers_nm == null){
	System.out.println(this.toString+" : recp_pers_nm is null" );
}else{
	System.out.println(this.toString+" : recp_pers_nm is "+recp_pers_nm );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String uprc_sub = req.getParameter("uprc_sub");
if( uprc_sub == null){
	System.out.println(this.toString+" : uprc_sub is null" );
}else{
	System.out.println(this.toString+" : uprc_sub is "+uprc_sub );
}
String amt = req.getParameter("amt");
if( amt == null){
	System.out.println(this.toString+" : amt is null" );
}else{
	System.out.println(this.toString+" : amt is "+amt );
}
String incm_tax = req.getParameter("incm_tax");
if( incm_tax == null){
	System.out.println(this.toString+" : incm_tax is null" );
}else{
	System.out.println(this.toString+" : incm_tax is "+incm_tax );
}
String res_tax = req.getParameter("res_tax");
if( res_tax == null){
	System.out.println(this.toString+" : res_tax is null" );
}else{
	System.out.println(this.toString+" : res_tax is "+res_tax );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String rmks = req.getParameter("rmks");
if( rmks == null){
	System.out.println(this.toString+" : rmks is null" );
}else{
	System.out.println(this.toString+" : rmks is "+rmks );
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
String mode = Util.checkString(req.getParameter("mode"));
String yymm = Util.checkString(req.getParameter("yymm"));
String pay_seq = Util.checkString(req.getParameter("pay_seq"));
String evnt_nm = Util.checkString(req.getParameter("evnt_nm"));
String budg_yymm = Util.checkString(req.getParameter("budg_yymm"));
String dept_cd = Util.checkString(req.getParameter("dept_cd"));
String pay_mthd_clsf = Util.checkString(req.getParameter("pay_mthd_clsf"));
String pay_obj_clsf = Util.checkString(req.getParameter("pay_obj_clsf"));
String tax_yn = Util.checkString(req.getParameter("tax_yn"));
String uprc = Util.checkString(req.getParameter("uprc"));
String draft_doc_no = Util.checkString(req.getParameter("draft_doc_no"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String decid_stat = Util.checkString(req.getParameter("decid_stat"));
String clos_yn = Util.checkString(req.getParameter("clos_yn"));
String mode_sub = Util.checkString(req.getParameter("mode_sub"));
String yymm_sub = Util.checkString(req.getParameter("yymm_sub"));
String pay_seq_sub = Util.checkString(req.getParameter("pay_seq_sub"));
String pay_ptcr_seq = Util.checkString(req.getParameter("pay_ptcr_seq"));
String bo_cd = Util.checkString(req.getParameter("bo_cd"));
String bo_seq = Util.checkString(req.getParameter("bo_seq"));
String dept_cd_sub = Util.checkString(req.getParameter("dept_cd_sub"));
String sub_dept_cd = Util.checkString(req.getParameter("sub_dept_cd"));
String area_cd = Util.checkString(req.getParameter("area_cd"));
String chrg_pers = Util.checkString(req.getParameter("chrg_pers"));
String tax_yn_sub = Util.checkString(req.getParameter("tax_yn_sub"));
String prn = Util.checkString(req.getParameter("prn"));
String recp_pers_nm = Util.checkString(req.getParameter("recp_pers_nm"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String qty = Util.checkString(req.getParameter("qty"));
String uprc_sub = Util.checkString(req.getParameter("uprc_sub"));
String amt = Util.checkString(req.getParameter("amt"));
String incm_tax = Util.checkString(req.getParameter("incm_tax"));
String res_tax = Util.checkString(req.getParameter("res_tax"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String rmks = Util.checkString(req.getParameter("rmks"));
String incmg_pers_ip = Util.checkString(req.getParameter("incmg_pers_ip"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String pay_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_seq")));
String evnt_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("evnt_nm")));
String budg_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_yymm")));
String dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd")));
String pay_mthd_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_mthd_clsf")));
String pay_obj_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_obj_clsf")));
String tax_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_yn")));
String uprc = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc")));
String draft_doc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_doc_no")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String decid_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("decid_stat")));
String clos_yn = Util.Uni2Ksc(Util.checkString(req.getParameter("clos_yn")));
String mode_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("mode_sub")));
String yymm_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm_sub")));
String pay_seq_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_seq_sub")));
String pay_ptcr_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_ptcr_seq")));
String bo_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_cd")));
String bo_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_seq")));
String dept_cd_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("dept_cd_sub")));
String sub_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("sub_dept_cd")));
String area_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("area_cd")));
String chrg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_pers")));
String tax_yn_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("tax_yn_sub")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String recp_pers_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_pers_nm")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String uprc_sub = Util.Uni2Ksc(Util.checkString(req.getParameter("uprc_sub")));
String amt = Util.Uni2Ksc(Util.checkString(req.getParameter("amt")));
String incm_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("incm_tax")));
String res_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("res_tax")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String rmks = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks")));
String incmg_pers_ip = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ip")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setYymm(yymm);
dm.setPay_seq(pay_seq);
dm.setEvnt_nm(evnt_nm);
dm.setBudg_yymm(budg_yymm);
dm.setDept_cd(dept_cd);
dm.setPay_mthd_clsf(pay_mthd_clsf);
dm.setPay_obj_clsf(pay_obj_clsf);
dm.setTax_yn(tax_yn);
dm.setUprc(uprc);
dm.setDraft_doc_no(draft_doc_no);
dm.setPay_dt(pay_dt);
dm.setDecid_stat(decid_stat);
dm.setClos_yn(clos_yn);
dm.setMode_sub(mode_sub);
dm.setYymm_sub(yymm_sub);
dm.setPay_seq_sub(pay_seq_sub);
dm.setPay_ptcr_seq(pay_ptcr_seq);
dm.setBo_cd(bo_cd);
dm.setBo_seq(bo_seq);
dm.setDept_cd_sub(dept_cd_sub);
dm.setSub_dept_cd(sub_dept_cd);
dm.setArea_cd(area_cd);
dm.setChrg_pers(chrg_pers);
dm.setTax_yn_sub(tax_yn_sub);
dm.setPrn(prn);
dm.setRecp_pers_nm(recp_pers_nm);
dm.setMedi_cd(medi_cd);
dm.setQty(qty);
dm.setUprc_sub(uprc_sub);
dm.setAmt(amt);
dm.setIncm_tax(incm_tax);
dm.setRes_tax(res_tax);
dm.setAcct_no(acct_no);
dm.setBank_cd(bank_cd);
dm.setRmks(rmks);
dm.setIncmg_pers_ip(incmg_pers_ip);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Nov 05 18:56:35 KST 2013 */