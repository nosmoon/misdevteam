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


public class FC_FUNC_1463_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String stat_dt;
	public String rmks1;
	public String incmg_pers;
	public String incmg_pers_ipadd;
	public String use_dept_cd;
	public String place;
	public String note_clsf_cd;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String note_amt;
	public String sale_dscn_amt;
	public String dlco_clsf_cd1;
	public String dlco_cd1;
	public String bank_cd_nm;
	public String deps_clsf_cd;
	public String rcpay_amt;
	public String corp_tax;
	public String etc_prft;
	public String mtry_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String dlco_cdnm;
	public String comp_dt;
	public String coms;
	public String deps_dt;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date;
	public String tran_date_seq;
	public String tran_amt;
	public String corp_local_tax;
	public String chnl_clsf;

	public FC_FUNC_1463_IDM(){}
	public FC_FUNC_1463_IDM(String cmpy_cd, String stat_dt, String rmks1, String incmg_pers, String incmg_pers_ipadd, String use_dept_cd, String place, String note_clsf_cd, String bank_cd, String note_no, String note_seq, String note_amt, String sale_dscn_amt, String dlco_clsf_cd1, String dlco_cd1, String bank_cd_nm, String deps_clsf_cd, String rcpay_amt, String corp_tax, String etc_prft, String mtry_dt, String dlco_clsf_cd, String dlco_cd, String dlco_cdnm, String comp_dt, String coms, String deps_dt, String biz_reg_no, String bank_id, String acct_num, String tran_date, String tran_date_seq, String tran_amt, String corp_local_tax, String chnl_clsf){
		this.cmpy_cd = cmpy_cd;
		this.stat_dt = stat_dt;
		this.rmks1 = rmks1;
		this.incmg_pers = incmg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.use_dept_cd = use_dept_cd;
		this.place = place;
		this.note_clsf_cd = note_clsf_cd;
		this.bank_cd = bank_cd;
		this.note_no = note_no;
		this.note_seq = note_seq;
		this.note_amt = note_amt;
		this.sale_dscn_amt = sale_dscn_amt;
		this.dlco_clsf_cd1 = dlco_clsf_cd1;
		this.dlco_cd1 = dlco_cd1;
		this.bank_cd_nm = bank_cd_nm;
		this.deps_clsf_cd = deps_clsf_cd;
		this.rcpay_amt = rcpay_amt;
		this.corp_tax = corp_tax;
		this.etc_prft = etc_prft;
		this.mtry_dt = mtry_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.dlco_cdnm = dlco_cdnm;
		this.comp_dt = comp_dt;
		this.coms = coms;
		this.deps_dt = deps_dt;
		this.biz_reg_no = biz_reg_no;
		this.bank_id = bank_id;
		this.acct_num = acct_num;
		this.tran_date = tran_date;
		this.tran_date_seq = tran_date_seq;
		this.tran_amt = tran_amt;
		this.corp_local_tax = corp_local_tax;
		this.chnl_clsf = chnl_clsf;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setPlace(String place){
		this.place = place;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
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

	public void setNote_amt(String note_amt){
		this.note_amt = note_amt;
	}

	public void setSale_dscn_amt(String sale_dscn_amt){
		this.sale_dscn_amt = sale_dscn_amt;
	}

	public void setDlco_clsf_cd1(String dlco_clsf_cd1){
		this.dlco_clsf_cd1 = dlco_clsf_cd1;
	}

	public void setDlco_cd1(String dlco_cd1){
		this.dlco_cd1 = dlco_cd1;
	}

	public void setBank_cd_nm(String bank_cd_nm){
		this.bank_cd_nm = bank_cd_nm;
	}

	public void setDeps_clsf_cd(String deps_clsf_cd){
		this.deps_clsf_cd = deps_clsf_cd;
	}

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setCorp_tax(String corp_tax){
		this.corp_tax = corp_tax;
	}

	public void setEtc_prft(String etc_prft){
		this.etc_prft = etc_prft;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setDlco_cdnm(String dlco_cdnm){
		this.dlco_cdnm = dlco_cdnm;
	}

	public void setComp_dt(String comp_dt){
		this.comp_dt = comp_dt;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setDeps_dt(String deps_dt){
		this.deps_dt = deps_dt;
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

	public void setTran_date(String tran_date){
		this.tran_date = tran_date;
	}

	public void setTran_date_seq(String tran_date_seq){
		this.tran_date_seq = tran_date_seq;
	}

	public void setTran_amt(String tran_amt){
		this.tran_amt = tran_amt;
	}

	public void setCorp_local_tax(String corp_local_tax){
		this.corp_local_tax = corp_local_tax;
	}

	public void setChnl_clsf(String chnl_clsf){
		this.chnl_clsf = chnl_clsf;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getPlace(){
		return this.place;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
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

	public String getNote_amt(){
		return this.note_amt;
	}

	public String getSale_dscn_amt(){
		return this.sale_dscn_amt;
	}

	public String getDlco_clsf_cd1(){
		return this.dlco_clsf_cd1;
	}

	public String getDlco_cd1(){
		return this.dlco_cd1;
	}

	public String getBank_cd_nm(){
		return this.bank_cd_nm;
	}

	public String getDeps_clsf_cd(){
		return this.deps_clsf_cd;
	}

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getCorp_tax(){
		return this.corp_tax;
	}

	public String getEtc_prft(){
		return this.etc_prft;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getDlco_cdnm(){
		return this.dlco_cdnm;
	}

	public String getComp_dt(){
		return this.comp_dt;
	}

	public String getComs(){
		return this.coms;
	}

	public String getDeps_dt(){
		return this.deps_dt;
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

	public String getTran_date(){
		return this.tran_date;
	}

	public String getTran_date_seq(){
		return this.tran_date_seq;
	}

	public String getTran_amt(){
		return this.tran_amt;
	}

	public String getCorp_local_tax(){
		return this.corp_local_tax;
	}

	public String getChnl_clsf(){
		return this.chnl_clsf;
	}

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1463_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1463_IDM dm = (FC_FUNC_1463_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.stat_dt);
		cstmt.setString(5, dm.rmks1);
		cstmt.setString(6, dm.incmg_pers);
		cstmt.setString(7, dm.incmg_pers_ipadd);
		cstmt.setString(8, dm.use_dept_cd);
		cstmt.setString(9, dm.place);
		cstmt.setString(10, dm.note_clsf_cd);
		cstmt.setString(11, dm.bank_cd);
		cstmt.setString(12, dm.note_no);
		cstmt.setString(13, dm.note_seq);
		cstmt.setString(14, dm.note_amt);
		cstmt.setString(15, dm.sale_dscn_amt);
		cstmt.setString(16, dm.dlco_clsf_cd1);
		cstmt.setString(17, dm.dlco_cd1);
		cstmt.setString(18, dm.bank_cd_nm);
		cstmt.setString(19, dm.deps_clsf_cd);
		cstmt.setString(20, dm.rcpay_amt);
		cstmt.setString(21, dm.corp_tax);
		cstmt.setString(22, dm.etc_prft);
		cstmt.setString(23, dm.mtry_dt);
		cstmt.setString(24, dm.dlco_clsf_cd);
		cstmt.setString(25, dm.dlco_cd);
		cstmt.setString(26, dm.dlco_cdnm);
		cstmt.setString(27, dm.comp_dt);
		cstmt.setString(28, dm.coms);
		cstmt.setString(29, dm.deps_dt);
		cstmt.setString(30, dm.biz_reg_no);
		cstmt.setString(31, dm.bank_id);
		cstmt.setString(32, dm.acct_num);
		cstmt.setString(33, dm.tran_date);
		cstmt.setString(34, dm.tran_date_seq);
		cstmt.setString(35, dm.tran_amt);
		cstmt.setString(36, dm.corp_local_tax);
		cstmt.setString(37, dm.chnl_clsf);
		cstmt.registerOutParameter(38, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1463_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("stat_dt = [" + getStat_dt() + "]");
		System.out.println("rmks1 = [" + getRmks1() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("place = [" + getPlace() + "]");
		System.out.println("note_clsf_cd = [" + getNote_clsf_cd() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("note_no = [" + getNote_no() + "]");
		System.out.println("note_seq = [" + getNote_seq() + "]");
		System.out.println("note_amt = [" + getNote_amt() + "]");
		System.out.println("sale_dscn_amt = [" + getSale_dscn_amt() + "]");
		System.out.println("dlco_clsf_cd1 = [" + getDlco_clsf_cd1() + "]");
		System.out.println("dlco_cd1 = [" + getDlco_cd1() + "]");
		System.out.println("bank_cd_nm = [" + getBank_cd_nm() + "]");
		System.out.println("deps_clsf_cd = [" + getDeps_clsf_cd() + "]");
		System.out.println("rcpay_amt = [" + getRcpay_amt() + "]");
		System.out.println("corp_tax = [" + getCorp_tax() + "]");
		System.out.println("etc_prft = [" + getEtc_prft() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("dlco_cdnm = [" + getDlco_cdnm() + "]");
		System.out.println("comp_dt = [" + getComp_dt() + "]");
		System.out.println("coms = [" + getComs() + "]");
		System.out.println("deps_dt = [" + getDeps_dt() + "]");
		System.out.println("biz_reg_no = [" + getBiz_reg_no() + "]");
		System.out.println("bank_id = [" + getBank_id() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("tran_date = [" + getTran_date() + "]");
		System.out.println("tran_date_seq = [" + getTran_date_seq() + "]");
		System.out.println("tran_amt = [" + getTran_amt() + "]");
		System.out.println("corp_local_tax = [" + getCorp_local_tax() + "]");
		System.out.println("chnl_clsf = [" + getChnl_clsf() + "]");
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
String stat_dt = req.getParameter("stat_dt");
if( stat_dt == null){
	System.out.println(this.toString+" : stat_dt is null" );
}else{
	System.out.println(this.toString+" : stat_dt is "+stat_dt );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
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
String use_dept_cd = req.getParameter("use_dept_cd");
if( use_dept_cd == null){
	System.out.println(this.toString+" : use_dept_cd is null" );
}else{
	System.out.println(this.toString+" : use_dept_cd is "+use_dept_cd );
}
String place = req.getParameter("place");
if( place == null){
	System.out.println(this.toString+" : place is null" );
}else{
	System.out.println(this.toString+" : place is "+place );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
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
String note_amt = req.getParameter("note_amt");
if( note_amt == null){
	System.out.println(this.toString+" : note_amt is null" );
}else{
	System.out.println(this.toString+" : note_amt is "+note_amt );
}
String sale_dscn_amt = req.getParameter("sale_dscn_amt");
if( sale_dscn_amt == null){
	System.out.println(this.toString+" : sale_dscn_amt is null" );
}else{
	System.out.println(this.toString+" : sale_dscn_amt is "+sale_dscn_amt );
}
String dlco_clsf_cd1 = req.getParameter("dlco_clsf_cd1");
if( dlco_clsf_cd1 == null){
	System.out.println(this.toString+" : dlco_clsf_cd1 is null" );
}else{
	System.out.println(this.toString+" : dlco_clsf_cd1 is "+dlco_clsf_cd1 );
}
String dlco_cd1 = req.getParameter("dlco_cd1");
if( dlco_cd1 == null){
	System.out.println(this.toString+" : dlco_cd1 is null" );
}else{
	System.out.println(this.toString+" : dlco_cd1 is "+dlco_cd1 );
}
String bank_cd_nm = req.getParameter("bank_cd_nm");
if( bank_cd_nm == null){
	System.out.println(this.toString+" : bank_cd_nm is null" );
}else{
	System.out.println(this.toString+" : bank_cd_nm is "+bank_cd_nm );
}
String deps_clsf_cd = req.getParameter("deps_clsf_cd");
if( deps_clsf_cd == null){
	System.out.println(this.toString+" : deps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : deps_clsf_cd is "+deps_clsf_cd );
}
String rcpay_amt = req.getParameter("rcpay_amt");
if( rcpay_amt == null){
	System.out.println(this.toString+" : rcpay_amt is null" );
}else{
	System.out.println(this.toString+" : rcpay_amt is "+rcpay_amt );
}
String corp_tax = req.getParameter("corp_tax");
if( corp_tax == null){
	System.out.println(this.toString+" : corp_tax is null" );
}else{
	System.out.println(this.toString+" : corp_tax is "+corp_tax );
}
String etc_prft = req.getParameter("etc_prft");
if( etc_prft == null){
	System.out.println(this.toString+" : etc_prft is null" );
}else{
	System.out.println(this.toString+" : etc_prft is "+etc_prft );
}
String mtry_dt = req.getParameter("mtry_dt");
if( mtry_dt == null){
	System.out.println(this.toString+" : mtry_dt is null" );
}else{
	System.out.println(this.toString+" : mtry_dt is "+mtry_dt );
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
String dlco_cdnm = req.getParameter("dlco_cdnm");
if( dlco_cdnm == null){
	System.out.println(this.toString+" : dlco_cdnm is null" );
}else{
	System.out.println(this.toString+" : dlco_cdnm is "+dlco_cdnm );
}
String comp_dt = req.getParameter("comp_dt");
if( comp_dt == null){
	System.out.println(this.toString+" : comp_dt is null" );
}else{
	System.out.println(this.toString+" : comp_dt is "+comp_dt );
}
String coms = req.getParameter("coms");
if( coms == null){
	System.out.println(this.toString+" : coms is null" );
}else{
	System.out.println(this.toString+" : coms is "+coms );
}
String deps_dt = req.getParameter("deps_dt");
if( deps_dt == null){
	System.out.println(this.toString+" : deps_dt is null" );
}else{
	System.out.println(this.toString+" : deps_dt is "+deps_dt );
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
String tran_date = req.getParameter("tran_date");
if( tran_date == null){
	System.out.println(this.toString+" : tran_date is null" );
}else{
	System.out.println(this.toString+" : tran_date is "+tran_date );
}
String tran_date_seq = req.getParameter("tran_date_seq");
if( tran_date_seq == null){
	System.out.println(this.toString+" : tran_date_seq is null" );
}else{
	System.out.println(this.toString+" : tran_date_seq is "+tran_date_seq );
}
String tran_amt = req.getParameter("tran_amt");
if( tran_amt == null){
	System.out.println(this.toString+" : tran_amt is null" );
}else{
	System.out.println(this.toString+" : tran_amt is "+tran_amt );
}
String corp_local_tax = req.getParameter("corp_local_tax");
if( corp_local_tax == null){
	System.out.println(this.toString+" : corp_local_tax is null" );
}else{
	System.out.println(this.toString+" : corp_local_tax is "+corp_local_tax );
}
String chnl_clsf = req.getParameter("chnl_clsf");
if( chnl_clsf == null){
	System.out.println(this.toString+" : chnl_clsf is null" );
}else{
	System.out.println(this.toString+" : chnl_clsf is "+chnl_clsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String stat_dt = Util.checkString(req.getParameter("stat_dt"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String place = Util.checkString(req.getParameter("place"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_seq = Util.checkString(req.getParameter("note_seq"));
String note_amt = Util.checkString(req.getParameter("note_amt"));
String sale_dscn_amt = Util.checkString(req.getParameter("sale_dscn_amt"));
String dlco_clsf_cd1 = Util.checkString(req.getParameter("dlco_clsf_cd1"));
String dlco_cd1 = Util.checkString(req.getParameter("dlco_cd1"));
String bank_cd_nm = Util.checkString(req.getParameter("bank_cd_nm"));
String deps_clsf_cd = Util.checkString(req.getParameter("deps_clsf_cd"));
String rcpay_amt = Util.checkString(req.getParameter("rcpay_amt"));
String corp_tax = Util.checkString(req.getParameter("corp_tax"));
String etc_prft = Util.checkString(req.getParameter("etc_prft"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String dlco_cdnm = Util.checkString(req.getParameter("dlco_cdnm"));
String comp_dt = Util.checkString(req.getParameter("comp_dt"));
String coms = Util.checkString(req.getParameter("coms"));
String deps_dt = Util.checkString(req.getParameter("deps_dt"));
String biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
String bank_id = Util.checkString(req.getParameter("bank_id"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String tran_date = Util.checkString(req.getParameter("tran_date"));
String tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
String tran_amt = Util.checkString(req.getParameter("tran_amt"));
String corp_local_tax = Util.checkString(req.getParameter("corp_local_tax"));
String chnl_clsf = Util.checkString(req.getParameter("chnl_clsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_dt")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String place = Util.Uni2Ksc(Util.checkString(req.getParameter("place")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_seq")));
String note_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("note_amt")));
String sale_dscn_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("sale_dscn_amt")));
String dlco_clsf_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd1")));
String dlco_cd1 = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd1")));
String bank_cd_nm = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd_nm")));
String deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_clsf_cd")));
String rcpay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt")));
String corp_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("corp_tax")));
String etc_prft = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_prft")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String dlco_cdnm = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cdnm")));
String comp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("comp_dt")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String deps_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_dt")));
String biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no")));
String bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String tran_date = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date")));
String tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq")));
String tran_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_amt")));
String corp_local_tax = Util.Uni2Ksc(Util.checkString(req.getParameter("corp_local_tax")));
String chnl_clsf = Util.Uni2Ksc(Util.checkString(req.getParameter("chnl_clsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStat_dt(stat_dt);
dm.setRmks1(rmks1);
dm.setIncmg_pers(incmg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setUse_dept_cd(use_dept_cd);
dm.setPlace(place);
dm.setNote_clsf_cd(note_clsf_cd);
dm.setBank_cd(bank_cd);
dm.setNote_no(note_no);
dm.setNote_seq(note_seq);
dm.setNote_amt(note_amt);
dm.setSale_dscn_amt(sale_dscn_amt);
dm.setDlco_clsf_cd1(dlco_clsf_cd1);
dm.setDlco_cd1(dlco_cd1);
dm.setBank_cd_nm(bank_cd_nm);
dm.setDeps_clsf_cd(deps_clsf_cd);
dm.setRcpay_amt(rcpay_amt);
dm.setCorp_tax(corp_tax);
dm.setEtc_prft(etc_prft);
dm.setMtry_dt(mtry_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setDlco_cdnm(dlco_cdnm);
dm.setComp_dt(comp_dt);
dm.setComs(coms);
dm.setDeps_dt(deps_dt);
dm.setBiz_reg_no(biz_reg_no);
dm.setBank_id(bank_id);
dm.setAcct_num(acct_num);
dm.setTran_date(tran_date);
dm.setTran_date_seq(tran_date_seq);
dm.setTran_amt(tran_amt);
dm.setCorp_local_tax(corp_local_tax);
dm.setChnl_clsf(chnl_clsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 24 16:51:11 KST 2018 */