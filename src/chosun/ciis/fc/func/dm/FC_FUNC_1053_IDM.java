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


public class FC_FUNC_1053_IDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String stat_dt;
	public String dlco_clsf_cd;
	public String dlco_cd;
	public String pch_compnm;
	public String rmks1;
	public String chg_pers;
	public String incmg_pers_ipadd;
	public String deps_clsf_cd;
	public String bank_cd;
	public String note_no;
	public String note_seq;
	public String rcpay_amt;
	public String note_clsf_cd;
	public String mtry_dt;
	public String use_dept_cd;
	public String frex_cd;
	public String exrate;
	public String pch_amt;
	public String frcr_amt;
	public String coms;
	public String deps_dt;
	public String hjphwamt;
	public String biz_reg_no;
	public String bank_id;
	public String acct_num;
	public String tran_date;
	public String tran_date_seq;
	public String tran_amt;

	public FC_FUNC_1053_IDM(){}
	public FC_FUNC_1053_IDM(String cmpy_cd, String stat_dt, String dlco_clsf_cd, String dlco_cd, String pch_compnm, String rmks1, String chg_pers, String incmg_pers_ipadd, String deps_clsf_cd, String bank_cd, String note_no, String note_seq, String rcpay_amt, String note_clsf_cd, String mtry_dt, String use_dept_cd, String frex_cd, String exrate, String pch_amt, String frcr_amt, String coms, String deps_dt, String hjphwamt, String biz_reg_no, String bank_id, String acct_num, String tran_date, String tran_date_seq, String tran_amt){
		this.cmpy_cd = cmpy_cd;
		this.stat_dt = stat_dt;
		this.dlco_clsf_cd = dlco_clsf_cd;
		this.dlco_cd = dlco_cd;
		this.pch_compnm = pch_compnm;
		this.rmks1 = rmks1;
		this.chg_pers = chg_pers;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.deps_clsf_cd = deps_clsf_cd;
		this.bank_cd = bank_cd;
		this.note_no = note_no;
		this.note_seq = note_seq;
		this.rcpay_amt = rcpay_amt;
		this.note_clsf_cd = note_clsf_cd;
		this.mtry_dt = mtry_dt;
		this.use_dept_cd = use_dept_cd;
		this.frex_cd = frex_cd;
		this.exrate = exrate;
		this.pch_amt = pch_amt;
		this.frcr_amt = frcr_amt;
		this.coms = coms;
		this.deps_dt = deps_dt;
		this.hjphwamt = hjphwamt;
		this.biz_reg_no = biz_reg_no;
		this.bank_id = bank_id;
		this.acct_num = acct_num;
		this.tran_date = tran_date;
		this.tran_date_seq = tran_date_seq;
		this.tran_amt = tran_amt;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setStat_dt(String stat_dt){
		this.stat_dt = stat_dt;
	}

	public void setDlco_clsf_cd(String dlco_clsf_cd){
		this.dlco_clsf_cd = dlco_clsf_cd;
	}

	public void setDlco_cd(String dlco_cd){
		this.dlco_cd = dlco_cd;
	}

	public void setPch_compnm(String pch_compnm){
		this.pch_compnm = pch_compnm;
	}

	public void setRmks1(String rmks1){
		this.rmks1 = rmks1;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setDeps_clsf_cd(String deps_clsf_cd){
		this.deps_clsf_cd = deps_clsf_cd;
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

	public void setRcpay_amt(String rcpay_amt){
		this.rcpay_amt = rcpay_amt;
	}

	public void setNote_clsf_cd(String note_clsf_cd){
		this.note_clsf_cd = note_clsf_cd;
	}

	public void setMtry_dt(String mtry_dt){
		this.mtry_dt = mtry_dt;
	}

	public void setUse_dept_cd(String use_dept_cd){
		this.use_dept_cd = use_dept_cd;
	}

	public void setFrex_cd(String frex_cd){
		this.frex_cd = frex_cd;
	}

	public void setExrate(String exrate){
		this.exrate = exrate;
	}

	public void setPch_amt(String pch_amt){
		this.pch_amt = pch_amt;
	}

	public void setFrcr_amt(String frcr_amt){
		this.frcr_amt = frcr_amt;
	}

	public void setComs(String coms){
		this.coms = coms;
	}

	public void setDeps_dt(String deps_dt){
		this.deps_dt = deps_dt;
	}

	public void setHjphwamt(String hjphwamt){
		this.hjphwamt = hjphwamt;
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

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getStat_dt(){
		return this.stat_dt;
	}

	public String getDlco_clsf_cd(){
		return this.dlco_clsf_cd;
	}

	public String getDlco_cd(){
		return this.dlco_cd;
	}

	public String getPch_compnm(){
		return this.pch_compnm;
	}

	public String getRmks1(){
		return this.rmks1;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getDeps_clsf_cd(){
		return this.deps_clsf_cd;
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

	public String getRcpay_amt(){
		return this.rcpay_amt;
	}

	public String getNote_clsf_cd(){
		return this.note_clsf_cd;
	}

	public String getMtry_dt(){
		return this.mtry_dt;
	}

	public String getUse_dept_cd(){
		return this.use_dept_cd;
	}

	public String getFrex_cd(){
		return this.frex_cd;
	}

	public String getExrate(){
		return this.exrate;
	}

	public String getPch_amt(){
		return this.pch_amt;
	}

	public String getFrcr_amt(){
		return this.frcr_amt;
	}

	public String getComs(){
		return this.coms;
	}

	public String getDeps_dt(){
		return this.deps_dt;
	}

	public String getHjphwamt(){
		return this.hjphwamt;
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

	public String getSQL(){
		 return "{ call MISFNC.SP_FC_FUNC_1053_I(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		FC_FUNC_1053_IDM dm = (FC_FUNC_1053_IDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.stat_dt);
		cstmt.setString(5, dm.dlco_clsf_cd);
		cstmt.setString(6, dm.dlco_cd);
		cstmt.setString(7, dm.pch_compnm);
		cstmt.setString(8, dm.rmks1);
		cstmt.setString(9, dm.chg_pers);
		cstmt.setString(10, dm.incmg_pers_ipadd);
		cstmt.setString(11, dm.deps_clsf_cd);
		cstmt.setString(12, dm.bank_cd);
		cstmt.setString(13, dm.note_no);
		cstmt.setString(14, dm.note_seq);
		cstmt.setString(15, dm.rcpay_amt);
		cstmt.setString(16, dm.note_clsf_cd);
		cstmt.setString(17, dm.mtry_dt);
		cstmt.setString(18, dm.use_dept_cd);
		cstmt.setString(19, dm.frex_cd);
		cstmt.setString(20, dm.exrate);
		cstmt.setString(21, dm.pch_amt);
		cstmt.setString(22, dm.frcr_amt);
		cstmt.setString(23, dm.coms);
		cstmt.setString(24, dm.deps_dt);
		cstmt.setString(25, dm.hjphwamt);
		cstmt.setString(26, dm.biz_reg_no);
		cstmt.setString(27, dm.bank_id);
		cstmt.setString(28, dm.acct_num);
		cstmt.setString(29, dm.tran_date);
		cstmt.setString(30, dm.tran_date_seq);
		cstmt.setString(31, dm.tran_amt);
		cstmt.registerOutParameter(32, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.fc.func.ds.FC_FUNC_1053_IDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("stat_dt = [" + getStat_dt() + "]");
		System.out.println("dlco_clsf_cd = [" + getDlco_clsf_cd() + "]");
		System.out.println("dlco_cd = [" + getDlco_cd() + "]");
		System.out.println("pch_compnm = [" + getPch_compnm() + "]");
		System.out.println("rmks1 = [" + getRmks1() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("deps_clsf_cd = [" + getDeps_clsf_cd() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("note_no = [" + getNote_no() + "]");
		System.out.println("note_seq = [" + getNote_seq() + "]");
		System.out.println("rcpay_amt = [" + getRcpay_amt() + "]");
		System.out.println("note_clsf_cd = [" + getNote_clsf_cd() + "]");
		System.out.println("mtry_dt = [" + getMtry_dt() + "]");
		System.out.println("use_dept_cd = [" + getUse_dept_cd() + "]");
		System.out.println("frex_cd = [" + getFrex_cd() + "]");
		System.out.println("exrate = [" + getExrate() + "]");
		System.out.println("pch_amt = [" + getPch_amt() + "]");
		System.out.println("frcr_amt = [" + getFrcr_amt() + "]");
		System.out.println("coms = [" + getComs() + "]");
		System.out.println("deps_dt = [" + getDeps_dt() + "]");
		System.out.println("hjphwamt = [" + getHjphwamt() + "]");
		System.out.println("biz_reg_no = [" + getBiz_reg_no() + "]");
		System.out.println("bank_id = [" + getBank_id() + "]");
		System.out.println("acct_num = [" + getAcct_num() + "]");
		System.out.println("tran_date = [" + getTran_date() + "]");
		System.out.println("tran_date_seq = [" + getTran_date_seq() + "]");
		System.out.println("tran_amt = [" + getTran_amt() + "]");
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
String pch_compnm = req.getParameter("pch_compnm");
if( pch_compnm == null){
	System.out.println(this.toString+" : pch_compnm is null" );
}else{
	System.out.println(this.toString+" : pch_compnm is "+pch_compnm );
}
String rmks1 = req.getParameter("rmks1");
if( rmks1 == null){
	System.out.println(this.toString+" : rmks1 is null" );
}else{
	System.out.println(this.toString+" : rmks1 is "+rmks1 );
}
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String deps_clsf_cd = req.getParameter("deps_clsf_cd");
if( deps_clsf_cd == null){
	System.out.println(this.toString+" : deps_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : deps_clsf_cd is "+deps_clsf_cd );
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
String rcpay_amt = req.getParameter("rcpay_amt");
if( rcpay_amt == null){
	System.out.println(this.toString+" : rcpay_amt is null" );
}else{
	System.out.println(this.toString+" : rcpay_amt is "+rcpay_amt );
}
String note_clsf_cd = req.getParameter("note_clsf_cd");
if( note_clsf_cd == null){
	System.out.println(this.toString+" : note_clsf_cd is null" );
}else{
	System.out.println(this.toString+" : note_clsf_cd is "+note_clsf_cd );
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
String frex_cd = req.getParameter("frex_cd");
if( frex_cd == null){
	System.out.println(this.toString+" : frex_cd is null" );
}else{
	System.out.println(this.toString+" : frex_cd is "+frex_cd );
}
String exrate = req.getParameter("exrate");
if( exrate == null){
	System.out.println(this.toString+" : exrate is null" );
}else{
	System.out.println(this.toString+" : exrate is "+exrate );
}
String pch_amt = req.getParameter("pch_amt");
if( pch_amt == null){
	System.out.println(this.toString+" : pch_amt is null" );
}else{
	System.out.println(this.toString+" : pch_amt is "+pch_amt );
}
String frcr_amt = req.getParameter("frcr_amt");
if( frcr_amt == null){
	System.out.println(this.toString+" : frcr_amt is null" );
}else{
	System.out.println(this.toString+" : frcr_amt is "+frcr_amt );
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
String hjphwamt = req.getParameter("hjphwamt");
if( hjphwamt == null){
	System.out.println(this.toString+" : hjphwamt is null" );
}else{
	System.out.println(this.toString+" : hjphwamt is "+hjphwamt );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String stat_dt = Util.checkString(req.getParameter("stat_dt"));
String dlco_clsf_cd = Util.checkString(req.getParameter("dlco_clsf_cd"));
String dlco_cd = Util.checkString(req.getParameter("dlco_cd"));
String pch_compnm = Util.checkString(req.getParameter("pch_compnm"));
String rmks1 = Util.checkString(req.getParameter("rmks1"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String deps_clsf_cd = Util.checkString(req.getParameter("deps_clsf_cd"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String note_no = Util.checkString(req.getParameter("note_no"));
String note_seq = Util.checkString(req.getParameter("note_seq"));
String rcpay_amt = Util.checkString(req.getParameter("rcpay_amt"));
String note_clsf_cd = Util.checkString(req.getParameter("note_clsf_cd"));
String mtry_dt = Util.checkString(req.getParameter("mtry_dt"));
String use_dept_cd = Util.checkString(req.getParameter("use_dept_cd"));
String frex_cd = Util.checkString(req.getParameter("frex_cd"));
String exrate = Util.checkString(req.getParameter("exrate"));
String pch_amt = Util.checkString(req.getParameter("pch_amt"));
String frcr_amt = Util.checkString(req.getParameter("frcr_amt"));
String coms = Util.checkString(req.getParameter("coms"));
String deps_dt = Util.checkString(req.getParameter("deps_dt"));
String hjphwamt = Util.checkString(req.getParameter("hjphwamt"));
String biz_reg_no = Util.checkString(req.getParameter("biz_reg_no"));
String bank_id = Util.checkString(req.getParameter("bank_id"));
String acct_num = Util.checkString(req.getParameter("acct_num"));
String tran_date = Util.checkString(req.getParameter("tran_date"));
String tran_date_seq = Util.checkString(req.getParameter("tran_date_seq"));
String tran_amt = Util.checkString(req.getParameter("tran_amt"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String stat_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("stat_dt")));
String dlco_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_clsf_cd")));
String dlco_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlco_cd")));
String pch_compnm = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_compnm")));
String rmks1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rmks1")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String deps_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_clsf_cd")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String note_no = Util.Uni2Ksc(Util.checkString(req.getParameter("note_no")));
String note_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("note_seq")));
String rcpay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpay_amt")));
String note_clsf_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("note_clsf_cd")));
String mtry_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("mtry_dt")));
String use_dept_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("use_dept_cd")));
String frex_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("frex_cd")));
String exrate = Util.Uni2Ksc(Util.checkString(req.getParameter("exrate")));
String pch_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pch_amt")));
String frcr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("frcr_amt")));
String coms = Util.Uni2Ksc(Util.checkString(req.getParameter("coms")));
String deps_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_dt")));
String hjphwamt = Util.Uni2Ksc(Util.checkString(req.getParameter("hjphwamt")));
String biz_reg_no = Util.Uni2Ksc(Util.checkString(req.getParameter("biz_reg_no")));
String bank_id = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_id")));
String acct_num = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_num")));
String tran_date = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date")));
String tran_date_seq = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_date_seq")));
String tran_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("tran_amt")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setStat_dt(stat_dt);
dm.setDlco_clsf_cd(dlco_clsf_cd);
dm.setDlco_cd(dlco_cd);
dm.setPch_compnm(pch_compnm);
dm.setRmks1(rmks1);
dm.setChg_pers(chg_pers);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setDeps_clsf_cd(deps_clsf_cd);
dm.setBank_cd(bank_cd);
dm.setNote_no(note_no);
dm.setNote_seq(note_seq);
dm.setRcpay_amt(rcpay_amt);
dm.setNote_clsf_cd(note_clsf_cd);
dm.setMtry_dt(mtry_dt);
dm.setUse_dept_cd(use_dept_cd);
dm.setFrex_cd(frex_cd);
dm.setExrate(exrate);
dm.setPch_amt(pch_amt);
dm.setFrcr_amt(frcr_amt);
dm.setComs(coms);
dm.setDeps_dt(deps_dt);
dm.setHjphwamt(hjphwamt);
dm.setBiz_reg_no(biz_reg_no);
dm.setBank_id(bank_id);
dm.setAcct_num(acct_num);
dm.setTran_date(tran_date);
dm.setTran_date_seq(tran_date_seq);
dm.setTran_amt(tran_amt);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Aug 26 14:37:53 KST 2009 */