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


package chosun.ciis.fc.func.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.ds.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_1115_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String rcpay_dt;
	public String extnc_ptcr;
	public String mtry_dt;
	public String use_dept_cd;
	public String budg_cd;
	public String dr_amt;
	public String p_budg_cd;
	public String p_repl_amt;
	public String p_deps_clsf_cd;
	public String p_deps_dt;
	public String p_frex_cd;
	public String p_exrate;
	public String p_frex_amt;
	public String p_trufnd_slip_clsf;
	public String p_trufnd_slip_no;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date_seq;
	public String y_budg_cd;
	public String y_repl_amt;
	public String y_deps_clsf_cd;
	public String y_deps_dt;
	public String y_frex_cd;
	public String y_exrate;
	public String y_frex_amt;
	public String y_trufnd_slip_clsf;
	public String y_trufnd_slip_no;

	public FC_FUNC_1115_IDM(){}
	public FC_FUNC_1115_IDM(String cmpy_cd, String incmg_pers, String incmg_pers_ipadd, String bank_cd, String note_no, String note_seq, String rcpay_dt, String extnc_ptcr, String mtry_dt, String use_dept_cd, String budg_cd, String dr_amt, String p_budg_cd, String p_repl_amt, String p_deps_clsf_cd, String p_deps_dt, String p_frex_cd, String p_exrate, String p_frex_amt, String p_trufnd_slip_clsf, String p_trufnd_slip_no, String biz_reg_no, String bank_id, String acct_num, String tran_date_seq, String y_budg_cd, String y_repl_amt, String y_deps_clsf_cd, String y_deps_dt, String y_frex_cd, String y_exrate, String y_frex_amt, String y_trufnd_slip_clsf, String y_trufnd_slip_no){
		this.cmpy_cd = cmpy_cd;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.bank_cd = bank_cd;
		this.note_no = note_no;
		this.note_seq = note_seq;
		this.rcpay_dt = rcpay_dt;
		this.extnc_ptcr = extnc_ptcr;
		this.mtry_dt = mtry_dt;
		this.use_dept_cd = use_dept_cd;
		this.budg_cd = budg_cd;
		this.dr_amt = dr_amt;
		this.p_budg_cd = p_budg_cd;
		this.p_repl_amt = p_repl_amt;
		this.p_deps_clsf_cd = p_deps_clsf_cd;
		this.p_deps_dt = p_deps_dt;
		this.p_frex_cd = p_frex_cd;
		this.p_exrate = p_exrate;
		this.p_frex_amt = p_frex_amt;
		this.p_trufnd_slip_clsf = p_trufnd_slip_clsf;
		this.p_trufnd_slip_no = p_trufnd_slip_no;
		this.biz_reg_no = biz_reg_no;
		this.bank_id = bank_id;
		this.acct_num = acct_num;
		this.tran_date_seq = tran_date_seq;
		this.y_budg_cd = y_budg_cd;
		this.y_repl_amt = y_repl_amt;
		this.y_deps_clsf_cd = y_deps_clsf_cd;
		this.y_deps_dt = y_deps_dt;
		this.y_frex_cd = y_frex_cd;
		this.y_exrate = y_exrate;
		this.y_frex_amt = y_frex_amt;
		this.y_trufnd_slip_clsf = y_trufnd_slip_clsf;
		this.y_trufnd_slip_no = y_trufnd_slip_no;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setNote_no(String note_no){
		this.note_no = note_no;
	}

	public void setNote_seq(String note_seq){
		this.note_seq = note_seq;
	}

	public void setRcpay_dt(String rcpay_dt){
		this.rcpay_dt = rcpay_dt;
	}

	public void setExtnc_ptcr(String extnc_ptcr){
		this.extnc_ptcr = extnc_ptcr;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setBudg_cd(String budg_cd){
		this.budg_cd = budg_cd;
	}

	public void setDr_amt(String dr_amt){
		this.dr_amt = dr_amt;
	}

	public void setP_budg_cd(String p_budg_cd){
		this.p_budg_cd = p_budg_cd;
	}

	public void setP_repl_amt(String p_repl_amt){
		this.p_repl_amt = p_repl_amt;
	}

	public void setP_deps_clsf_cd(String p_deps_clsf_cd){
		this.p_deps_clsf_cd = p_deps_clsf_cd;
	}

	public void setP_deps_dt(String p_deps_dt){
		this.p_deps_dt = p_deps_dt;
	}

	public void setP_frex_cd(String p_frex_cd){
		this.p_frex_cd = p_frex_cd;
	}

	public void setP_exrate(String p_exrate){
		this.p_exrate = p_exrate;
	}

	public void setP_frex_amt(String p_frex_amt){
		this.p_frex_amt = p_frex_amt;
	}

	public void setP_trufnd_slip_clsf(String p_trufnd_slip_clsf){
		this.p_trufnd_slip_clsf = p_trufnd_slip_clsf;
	}

	public void setP_trufnd_slip_no(String p_trufnd_slip_no){
		this.p_trufnd_slip_no = p_trufnd_slip_no;
	}

	public void setBiz_reg_no(String biz_reg_no){
		this.biz_reg_no = biz_reg_no;
	}

	public void setBank_id(String bank_id){
		this.bank_id = bank_id;
	}

	public void setAcct_num(String acct_num){
		this.acct_num = acct_num;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setY_budg_cd(String y_budg_cd){
		this.y_budg_cd = y_budg_cd;
	}

	public void setY_repl_amt(String y_repl_amt){
		this.y_repl_amt = y_repl_amt;
	}

	public void setY_deps_clsf_cd(String y_deps_clsf_cd){
		this.y_deps_clsf_cd = y_deps_clsf_cd;
	}

	public void setY_deps_dt(String y_deps_dt){
		this.y_deps_dt = y_deps_dt;
	}

	public void setY_frex_cd(String y_frex_cd){
		this.y_frex_cd = y_frex_cd;
	}

	public void setY_exrate(String y_exrate){
		this.y_exrate = y_exrate;
	}

	public void setY_frex_amt(String y_frex_amt){
		this.y_frex_amt = y_frex_amt;
	}

	public void setY_trufnd_slip_clsf(String y_trufnd_slip_clsf){
		this.y_trufnd_slip_clsf = y_trufnd_slip_clsf;
	}

	public void setY_trufnd_slip_no(String y_trufnd_slip_no){
		this.y_trufnd_slip_no = y_trufnd_slip_no;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getNote_no(){
		return this.note_no;
	}

	public String getNote_seq(){
		return this.note_seq;
	}

	public String getRcpay_dt(){
		return this.rcpay_dt;
	}

	public String getExtnc_ptcr(){
		return this.extnc_ptcr;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getBudg_cd(){
		return this.budg_cd;
	}

	public String getDr_amt(){
		return this.dr_amt;
	}

	public String getP_budg_cd(){
		return this.p_budg_cd;
	}

	public String getP_repl_amt(){
		return this.p_repl_amt;
	}

	public String getP_deps_clsf_cd(){
		return this.p_deps_clsf_cd;
	}

	public String getP_deps_dt(){
		return this.p_deps_dt;
	}

	public String getP_frex_cd(){
		return this.p_frex_cd;
	}

	public String getP_exrate(){
		return this.p_exrate;
	}

	public String getP_frex_amt(){
		return this.p_frex_amt;
	}

	public String getP_trufnd_slip_clsf(){
		return this.p_trufnd_slip_clsf;
	}

	public String getP_trufnd_slip_no(){
		return this.p_trufnd_slip_no;
	}

	public String getBiz_reg_no(){
		return this.biz_reg_no;
	}

	public String getBank_id(){
		return this.bank_id;
	}

	public String getAcct_num(){
		return this.acct_num;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getY_budg_cd(){
		return this.y_budg_cd;
	}

	public String getY_repl_amt(){
		return this.y_repl_amt;
	}

	public String getY_deps_clsf_cd(){
		return this.y_deps_clsf_cd;
	}

	public String getY_deps_dt(){
		return this.y_deps_dt;
	}

	public String getY_frex_cd(){
		return this.y_frex_cd;
	}

	public String getY_exrate(){
		return this.y_exrate;
	}

	public String getY_frex_amt(){
		return this.y_frex_amt;
	}

	public String getY_trufnd_slip_clsf(){
		return this.y_trufnd_slip_clsf;
	}

	public String getY_trufnd_slip_no(){
		return this.y_trufnd_slip_no;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1115_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1115_IDM dm = (FC_FUNC_1115_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.incmg_pers);
		cstmt.setString(5, dm.incmg_pers_ipadd);
		cstmt.setString(6, dm.bank_cd);
		cstmt.setString(7, dm.note_no);
		cstmt.setString(8, dm.note_seq);
		cstmt.setString(9, dm.rcpay_dt);
		cstmt.setString(10, dm.extnc_ptcr);
		cstmt.setString(11, dm.mtry_dt);
		cstmt.setString(12, dm.use_dept_cd);
		cstmt.setString(13, dm.budg_cd);
		cstmt.setString(14, dm.dr_amt);
		cstmt.setString(15, dm.p_budg_cd);
		cstmt.setString(16, dm.p_repl_amt);
		cstmt.setString(17, dm.p_deps_clsf_cd);
		cstmt.setString(18, dm.p_deps_dt);
		cstmt.setString(19, dm.p_frex_cd);
		cstmt.setString(20, dm.p_exrate);
		cstmt.setString(21, dm.p_frex_amt);
		cstmt.setString(22, dm.p_trufnd_slip_clsf);
		cstmt.setString(23, dm.p_trufnd_slip_no);
		cstmt.setString(24, dm.biz_reg_no);
		cstmt.setString(25, dm.bank_id);
		cstmt.setString(26, dm.acct_num);
		cstmt.setString(27, dm.tran_date_seq);
		cstmt.setString(28, dm.y_budg_cd);
		cstmt.setString(29, dm.y_repl_amt);
		cstmt.setString(30, dm.y_deps_clsf_cd);
		cstmt.setString(31, dm.y_deps_dt);
		cstmt.setString(32, dm.y_frex_cd);
		cstmt.setString(33, dm.y_exrate);
		cstmt.setString(34, dm.y_frex_amt);
		cstmt.setString(35, dm.y_trufnd_slip_clsf);
		cstmt.setString(36, dm.y_trufnd_slip_no);
		cstmt.registerOutParameter(37, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1115_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("note_no = [" + getNote_no() + "]");
		System.out.println("note_seq = [" + getNote_seq() + "]");
		System.out.println("rcpay_dt = [" + getRcpay_dt() + "]");
		System.out.println("extnc_ptcr = [" + getExtnc_ptcr() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("budg_cd = [" + getBudg_cd() + "]");
		System.out.println("dr_amt = [" + getDr_amt() + "]");
		System.out.println("p_budg_cd = [" + getP_budg_cd() + "]");
		System.out.println("p_repl_amt = [" + getP_repl_amt() + "]");
		System.out.println("p_deps_clsf_cd = [" + getP_deps_clsf_cd() + "]");
		System.out.println("p_deps_dt = [" + getP_deps_dt() + "]");
		System.out.println("p_frex_cd = [" + getP_frex_cd() + "]");
		System.out.println("p_exrate = [" + getP_exrate() + "]");
		System.out.println("p_frex_amt = [" + getP_frex_amt() + "]");
		System.out.println("p_trufnd_slip_clsf = [" + getP_trufnd_slip_clsf() + "]");
		System.out.println("p_trufnd_slip_no = [" + getP_trufnd_slip_no() + "]");
		System.out.println("biz_reg_no = [" + getBiz_reg_no() + "]");
		System.out.println("bank_id = [" + getBank_id() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("tran_date_seq = [" + getTran_date_seq() + "]");
		System.out.println("y_budg_cd = [" + getY_budg_cd() + "]");
		System.out.println("y_repl_amt = [" + getY_repl_amt() + "]");
		System.out.println("y_deps_clsf_cd = [" + getY_deps_clsf_cd() + "]");
		System.out.println("y_deps_dt = [" + getY_deps_dt() + "]");
		System.out.println("y_frex_cd = [" + getY_frex_cd() + "]");
		System.out.println("y_exrate = [" + getY_exrate() + "]");
		System.out.println("y_frex_amt = [" + getY_frex_amt() + "]");
		System.out.println("y_trufnd_slip_clsf = [" + getY_trufnd_slip_clsf() + "]");
		System.out.println("y_trufnd_slip_no = [" + getY_trufnd_slip_no() + "]");
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
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String note_no = req.getParameter("note_no");
if( note_no == null){
	System.out.println(this.toString+" : note_no is null" );
}else{
	System.out.println(this.toString+" : note_no is "+note_no );
}
String note_seq = req.getParameter("note_seq");
if( note_seq == null){
	System.out.println(this.toString+" : note_seq is null" );
}else{
	System.out.println(this.toString+" : note_seq is "+note_seq );
}
String rcpay_dt = req.getParameter("rcpay_dt");
if( rcpay_dt == null){
	System.out.println(this.toString+" : rcpay_dt is null" );
}else{
	System.out.println(this.toString+" : rcpay_dt is "+rcpay_dt );
}
String extnc_ptcr = req.getParameter("extnc_ptcr");
if( extnc_ptcr == null){
	System.out.println(this.toString+" : extnc_ptcr is null" );
}else{
	System.out.println(this.toString+" : extnc_ptcr is "+extnc_ptcr );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
}
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String budg_cd = req.getParameter("budg_cd");
if( budg_cd == null){
	System.out.println(this.toString+" : budg_cd is null" );
}else{
	System.out.println(this.toString+" : budg_cd is "+budg_cd );
}
String dr_amt = req.getParameter("dr_amt");
if( dr_amt == null){
	System.out.println(this.toString+" : dr_amt is null" );
}else{
	System.out.println(this.toString+" : dr_amt is "+dr_amt );
}
String p_budg_cd = req.getParameter("p_budg_cd");
if( p_budg_cd == null){
	System.out.println(this.toString+" : p_budg_cd is null" );
}else{
	System.out.println(this.toString+" : p_budg_cd is "+p_budg_cd );
}
String p_repl_amt = req.getParameter("p_repl_amt");
if( p_repl_amt == null){
	System.out.println(this.toString+" : p_repl_amt is null" );
}else{
	System.out.println(this.toString+" : p_repl_amt is "+p_repl_amt );
}
String p_deps_clsf_cd = req.getParameter("p_deps_clsf_cd");
if( p_deps_clsf_cd == null){
	System.out.println(this.toString+" : p_deps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : p_deps_clsf_cd is "+p_deps_clsf_cd );
}
String p_deps_dt = req.getParameter("p_deps_dt");
if( p_deps_dt == null){
	System.out.println(this.toString+" : p_deps_dt is null" );
}else{
	System.out.println(this.toString+" : p_deps_dt is "+p_deps_dt );
}
String p_frex_cd = req.getParameter("p_frex_cd");
if( p_frex_cd == null){
	System.out.println(this.toString+" : p_frex_cd is null" );
}else{
	System.out.println(this.toString+" : p_frex_cd is "+p_frex_cd );
}
String p_exrate = req.getParameter("p_exrate");
if( p_exrate == null){
	System.out.println(this.toString+" : p_exrate is null" );
}else{
	System.out.println(this.toString+" : p_exrate is "+p_exrate );
}
String p_frex_amt = req.getParameter("p_frex_amt");
if( p_frex_amt == null){
	System.out.println(this.toString+" : p_frex_amt is null" );
}else{
	System.out.println(this.toString+" : p_frex_amt is "+p_frex_amt );
}
String p_trufnd_slip_clsf = req.getParameter("p_trufnd_slip_clsf");
if( p_trufnd_slip_clsf == null){
	System.out.println(this.toString+" : p_trufnd_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : p_trufnd_slip_clsf is "+p_trufnd_slip_clsf );
}
String p_trufnd_slip_no = req.getParameter("p_trufnd_slip_no");
if( p_trufnd_slip_no == null){
	System.out.println(this.toString+" : p_trufnd_slip_no is null" );
}else{
	System.out.println(this.toString+" : p_trufnd_slip_no is "+p_trufnd_slip_no );
}
String biz_reg_no = req.getParameter("biz_reg_no");
if( biz_reg_no == null){
	System.out.println(this.toString+" : biz_reg_no is null" );
}else{
	System.out.println(this.toString+" : biz_reg_no is "+biz_reg_no );
}
String bank_id = req.getParameter("bank_id");
if( bank_id == null){
	System.out.println(this.toString+" : bank_id is null" );
}else{
	System.out.println(this.toString+" : bank_id is "+bank_id );
}
String acct_num = req.getParameter("acct_num");
if( acct_num == null){
	System.out.println(this.toString+" : acct_num is null" );
}else{
	System.out.println(this.toString+" : acct_num is "+acct_num );
}
String tran_date_seq = req.getParameter("tran_date_seq");
if( tran_date_seq == null){
	System.out.println(this.toString+" : tran_date_seq is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq is "+tran_date_seq );
}
String y_budg_cd = req.getParameter("y_budg_cd");
if( y_budg_cd == null){
	System.out.println(this.toString+" : y_budg_cd is null" );
}else{
	System.out.println(this.toString+" : y_budg_cd is "+y_budg_cd );
}
String y_repl_amt = req.getParameter("y_repl_amt");
if( y_repl_amt == null){
	System.out.println(this.toString+" : y_repl_amt is null" );
}else{
	System.out.println(this.toString+" : y_repl_amt is "+y_repl_amt );
}
String y_deps_clsf_cd = req.getParameter("y_deps_clsf_cd");
if( y_deps_clsf_cd == null){
	System.out.println(this.toString+" : y_deps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : y_deps_clsf_cd is "+y_deps_clsf_cd );
}
String y_deps_dt = req.getParameter("y_deps_dt");
if( y_deps_dt == null){
	System.out.println(this.toString+" : y_deps_dt is null" );
}else{
	System.out.println(this.toString+" : y_deps_dt is "+y_deps_dt );
}
String y_frex_cd = req.getParameter("y_frex_cd");
if( y_frex_cd == null){
	System.out.println(this.toString+" : y_frex_cd is null" );
}else{
	System.out.println(this.toString+" : y_frex_cd is "+y_frex_cd );
}
String y_exrate = req.getParameter("y_exrate");
if( y_exrate == null){
	System.out.println(this.toString+" : y_exrate is null" );
}else{
	System.out.println(this.toString+" : y_exrate is "+y_exrate );
}
String y_frex_amt = req.getParameter("y_frex_amt");
if( y_frex_amt == null){
	System.out.println(this.toString+" : y_frex_amt is null" );
}else{
	System.out.println(this.toString+" : y_frex_amt is "+y_frex_amt );
}
String y_trufnd_slip_clsf = req.getParameter("y_trufnd_slip_clsf");
if( y_trufnd_slip_clsf == null){
	System.out.println(this.toString+" : y_trufnd_slip_clsf is null" );
}else{
	System.out.println(this.toString+" : y_trufnd_slip_clsf is "+y_trufnd_slip_clsf );
}
String y_trufnd_slip_no = req.getParameter("y_trufnd_slip_no");
if( y_trufnd_slip_no == null){
	System.out.println(this.toString+" : y_trufnd_slip_no is null" );
}else{
	System.out.println(this.toString+" : y_trufnd_slip_no is "+y_trufnd_slip_no );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_seq = Util.checkString(req.getParameter("note_seq"));
String rcpay_dt = Util.checkString(req.getParameter("rcpay_dt"));
String extnc_ptcr = Util.checkString(req.getParameter("extnc_ptcr"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String budg_cd = Util.checkString(req.getParameter("budg_cd"));
String dr_amt = Util.checkString(req.getParameter("dr_amt"));
String p_budg_cd = Util.checkString(req.getParameter("p_budg_cd"));
String p_repl_amt = Util.checkString(req.getParameter("p_repl_amt"));
String p_deps_clsf_cd = Util.checkString(req.getParameter("p_deps_clsf_cd"));
String p_deps_dt = Util.checkString(req.getParameter("p_deps_dt"));
String p_frex_cd = Util.checkString(req.getParameter("p_frex_cd"));
String p_exrate = Util.checkString(req.getParameter("p_exrate"));
String p_frex_amt = Util.checkString(req.getParameter("p_frex_amt"));
String p_trufnd_slip_clsf = Util.checkString(req.getParameter("p_trufnd_slip_clsf"));
String p_trufnd_slip_no = Util.checkString(req.getParameter("p_trufnd_slip_no"));
String biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
String bank_id = Util.checkString(req.getParameter("bank_id"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
String y_budg_cd = Util.checkString(req.getParameter("y_budg_cd"));
String y_repl_amt = Util.checkString(req.getParameter("y_repl_amt"));
String y_deps_clsf_cd = Util.checkString(req.getParameter("y_deps_clsf_cd"));
String y_deps_dt = Util.checkString(req.getParameter("y_deps_dt"));
String y_frex_cd = Util.checkString(req.getParameter("y_frex_cd"));
String y_exrate = Util.checkString(req.getParameter("y_exrate"));
String y_frex_amt = Util.checkString(req.getParameter("y_frex_amt"));
String y_trufnd_slip_clsf = Util.checkString(req.getParameter("y_trufnd_slip_clsf"));
String y_trufnd_slip_no = Util.checkString(req.getParameter("y_trufnd_slip_no"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_seq")));
String rcpay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_dt")));
String extnc_ptcr = Util.Uni2Ksc(Util.checkString(req.getParameter("extnc_ptcr")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("budg_cd")));
String dr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("dr_amt")));
String p_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("p_budg_cd")));
String p_repl_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("p_repl_amt")));
String p_deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("p_deps_clsf_cd")));
String p_deps_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("p_deps_dt")));
String p_frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("p_frex_cd")));
String p_exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("p_exrate")));
String p_frex_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("p_frex_amt")));
String p_trufnd_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("p_trufnd_slip_clsf")));
String p_trufnd_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("p_trufnd_slip_no")));
String biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no")));
String bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq")));
String y_budg_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("y_budg_cd")));
String y_repl_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("y_repl_amt")));
String y_deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("y_deps_clsf_cd")));
String y_deps_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("y_deps_dt")));
String y_frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("y_frex_cd")));
String y_exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("y_exrate")));
String y_frex_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("y_frex_amt")));
String y_trufnd_slip_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("y_trufnd_slip_clsf")));
String y_trufnd_slip_no = Util.Uni2Ksc(Util.checkString(req.getParameter("y_trufnd_slip_no")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setBank_cd(bank_cd);
dm.setNote_no(note_no);
dm.setNote_seq(note_seq);
dm.setRcpay_dt(rcpay_dt);
dm.setExtnc_ptcr(extnc_ptcr);
dm.setMtry_dt(mtry_dt);
dm.setUse_dept_cd(use_dept_cd);
dm.setBudg_cd(budg_cd);
dm.setDr_amt(dr_amt);
dm.setP_budg_cd(p_budg_cd);
dm.setP_repl_amt(p_repl_amt);
dm.setP_deps_clsf_cd(p_deps_clsf_cd);
dm.setP_deps_dt(p_deps_dt);
dm.setP_frex_cd(p_frex_cd);
dm.setP_exrate(p_exrate);
dm.setP_frex_amt(p_frex_amt);
dm.setP_trufnd_slip_clsf(p_trufnd_slip_clsf);
dm.setP_trufnd_slip_no(p_trufnd_slip_no);
dm.setBiz_reg_no(biz_reg_no);
dm.setBank_id(bank_id);
dm.setAcct_num(acct_num);
dm.setTran_date_seq(tran_date_seq);
dm.setY_budg_cd(y_budg_cd);
dm.setY_repl_amt(y_repl_amt);
dm.setY_deps_clsf_cd(y_deps_clsf_cd);
dm.setY_deps_dt(y_deps_dt);
dm.setY_frex_cd(y_frex_cd);
dm.setY_exrate(y_exrate);
dm.setY_frex_amt(y_frex_amt);
dm.setY_trufnd_slip_clsf(y_trufnd_slip_clsf);
dm.setY_trufnd_slip_no(y_trufnd_slip_no);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Aug 04 16:34:59 KST 2009 */