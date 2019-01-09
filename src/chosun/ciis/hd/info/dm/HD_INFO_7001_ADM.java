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


package chosun.ciis.hd.info.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.info.ds.*;
import chosun.ciis.hd.info.rec.*;

/**
 * 
 */


public class HD_INFO_7001_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String mode;
	public String flnm;
	public String frlc_no;
	public String prn;
	public String tel_no;
	public String addr;
	public String chrg_posk_cd;
	public String thrw_pgm;
	public String pay_cycl;
	public String servcost;
	public String serv_pay_cond;
	public String fst_cntr_dt;
	public String last_cntr_dt;
	public String cntr_expr_dt;
	public String draft_no;
	public String bank_cd;
	public String acct_no;
	public String medi_cd;
	public String mang_no;
	public String medi_cd2;
	public String thrw_pgm2;
	public String incmg_pers;

	public HD_INFO_7001_ADM(){}
	public HD_INFO_7001_ADM(String cmpy_cd, String mode, String flnm, String frlc_no, String prn, String tel_no, String addr, String chrg_posk_cd, String thrw_pgm, String pay_cycl, String servcost, String serv_pay_cond, String fst_cntr_dt, String last_cntr_dt, String cntr_expr_dt, String draft_no, String bank_cd, String acct_no, String medi_cd, String mang_no, String medi_cd2, String thrw_pgm2, String incmg_pers){
		this.cmpy_cd = cmpy_cd;
		this.mode = mode;
		this.flnm = flnm;
		this.frlc_no = frlc_no;
		this.prn = prn;
		this.tel_no = tel_no;
		this.addr = addr;
		this.chrg_posk_cd = chrg_posk_cd;
		this.thrw_pgm = thrw_pgm;
		this.pay_cycl = pay_cycl;
		this.servcost = servcost;
		this.serv_pay_cond = serv_pay_cond;
		this.fst_cntr_dt = fst_cntr_dt;
		this.last_cntr_dt = last_cntr_dt;
		this.cntr_expr_dt = cntr_expr_dt;
		this.draft_no = draft_no;
		this.bank_cd = bank_cd;
		this.acct_no = acct_no;
		this.medi_cd = medi_cd;
		this.mang_no = mang_no;
		this.medi_cd2 = medi_cd2;
		this.thrw_pgm2 = thrw_pgm2;
		this.incmg_pers = incmg_pers;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setFrlc_no(String frlc_no){
		this.frlc_no = frlc_no;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setChrg_posk_cd(String chrg_posk_cd){
		this.chrg_posk_cd = chrg_posk_cd;
	}

	public void setThrw_pgm(String thrw_pgm){
		this.thrw_pgm = thrw_pgm;
	}

	public void setPay_cycl(String pay_cycl){
		this.pay_cycl = pay_cycl;
	}

	public void setServcost(String servcost){
		this.servcost = servcost;
	}

	public void setServ_pay_cond(String serv_pay_cond){
		this.serv_pay_cond = serv_pay_cond;
	}

	public void setFst_cntr_dt(String fst_cntr_dt){
		this.fst_cntr_dt = fst_cntr_dt;
	}

	public void setLast_cntr_dt(String last_cntr_dt){
		this.last_cntr_dt = last_cntr_dt;
	}

	public void setCntr_expr_dt(String cntr_expr_dt){
		this.cntr_expr_dt = cntr_expr_dt;
	}

	public void setDraft_no(String draft_no){
		this.draft_no = draft_no;
	}

	public void setBank_cd(String bank_cd){
		this.bank_cd = bank_cd;
	}

	public void setAcct_no(String acct_no){
		this.acct_no = acct_no;
	}

	public void setMedi_cd(String medi_cd){
		this.medi_cd = medi_cd;
	}

	public void setMang_no(String mang_no){
		this.mang_no = mang_no;
	}

	public void setMedi_cd2(String medi_cd2){
		this.medi_cd2 = medi_cd2;
	}

	public void setThrw_pgm2(String thrw_pgm2){
		this.thrw_pgm2 = thrw_pgm2;
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

	public String getFlnm(){
		return this.flnm;
	}

	public String getFrlc_no(){
		return this.frlc_no;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getChrg_posk_cd(){
		return this.chrg_posk_cd;
	}

	public String getThrw_pgm(){
		return this.thrw_pgm;
	}

	public String getPay_cycl(){
		return this.pay_cycl;
	}

	public String getServcost(){
		return this.servcost;
	}

	public String getServ_pay_cond(){
		return this.serv_pay_cond;
	}

	public String getFst_cntr_dt(){
		return this.fst_cntr_dt;
	}

	public String getLast_cntr_dt(){
		return this.last_cntr_dt;
	}

	public String getCntr_expr_dt(){
		return this.cntr_expr_dt;
	}

	public String getDraft_no(){
		return this.draft_no;
	}

	public String getBank_cd(){
		return this.bank_cd;
	}

	public String getAcct_no(){
		return this.acct_no;
	}

	public String getMedi_cd(){
		return this.medi_cd;
	}

	public String getMang_no(){
		return this.mang_no;
	}

	public String getMedi_cd2(){
		return this.medi_cd2;
	}

	public String getThrw_pgm2(){
		return this.thrw_pgm2;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_7001_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_7001_ADM dm = (HD_INFO_7001_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpy_cd);
		cstmt.setString(4, dm.mode);
		cstmt.setString(5, dm.flnm);
		cstmt.setString(6, dm.frlc_no);
		cstmt.setString(7, dm.prn);
		cstmt.setString(8, dm.tel_no);
		cstmt.setString(9, dm.addr);
		cstmt.setString(10, dm.chrg_posk_cd);
		cstmt.setString(11, dm.thrw_pgm);
		cstmt.setString(12, dm.pay_cycl);
		cstmt.setString(13, dm.servcost);
		cstmt.setString(14, dm.serv_pay_cond);
		cstmt.setString(15, dm.fst_cntr_dt);
		cstmt.setString(16, dm.last_cntr_dt);
		cstmt.setString(17, dm.cntr_expr_dt);
		cstmt.setString(18, dm.draft_no);
		cstmt.setString(19, dm.bank_cd);
		cstmt.setString(20, dm.acct_no);
		cstmt.setString(21, dm.medi_cd);
		cstmt.setString(22, dm.mang_no);
		cstmt.setString(23, dm.medi_cd2);
		cstmt.setString(24, dm.thrw_pgm2);
		cstmt.setString(25, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_7001_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("frlc_no = [" + getFrlc_no() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("tel_no = [" + getTel_no() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("chrg_posk_cd = [" + getChrg_posk_cd() + "]");
		System.out.println("thrw_pgm = [" + getThrw_pgm() + "]");
		System.out.println("pay_cycl = [" + getPay_cycl() + "]");
		System.out.println("servcost = [" + getServcost() + "]");
		System.out.println("serv_pay_cond = [" + getServ_pay_cond() + "]");
		System.out.println("fst_cntr_dt = [" + getFst_cntr_dt() + "]");
		System.out.println("last_cntr_dt = [" + getLast_cntr_dt() + "]");
		System.out.println("cntr_expr_dt = [" + getCntr_expr_dt() + "]");
		System.out.println("draft_no = [" + getDraft_no() + "]");
		System.out.println("bank_cd = [" + getBank_cd() + "]");
		System.out.println("acct_no = [" + getAcct_no() + "]");
		System.out.println("medi_cd = [" + getMedi_cd() + "]");
		System.out.println("mang_no = [" + getMang_no() + "]");
		System.out.println("medi_cd2 = [" + getMedi_cd2() + "]");
		System.out.println("thrw_pgm2 = [" + getThrw_pgm2() + "]");
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
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String frlc_no = req.getParameter("frlc_no");
if( frlc_no == null){
	System.out.println(this.toString+" : frlc_no is null" );
}else{
	System.out.println(this.toString+" : frlc_no is "+frlc_no );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String chrg_posk_cd = req.getParameter("chrg_posk_cd");
if( chrg_posk_cd == null){
	System.out.println(this.toString+" : chrg_posk_cd is null" );
}else{
	System.out.println(this.toString+" : chrg_posk_cd is "+chrg_posk_cd );
}
String thrw_pgm = req.getParameter("thrw_pgm");
if( thrw_pgm == null){
	System.out.println(this.toString+" : thrw_pgm is null" );
}else{
	System.out.println(this.toString+" : thrw_pgm is "+thrw_pgm );
}
String pay_cycl = req.getParameter("pay_cycl");
if( pay_cycl == null){
	System.out.println(this.toString+" : pay_cycl is null" );
}else{
	System.out.println(this.toString+" : pay_cycl is "+pay_cycl );
}
String servcost = req.getParameter("servcost");
if( servcost == null){
	System.out.println(this.toString+" : servcost is null" );
}else{
	System.out.println(this.toString+" : servcost is "+servcost );
}
String serv_pay_cond = req.getParameter("serv_pay_cond");
if( serv_pay_cond == null){
	System.out.println(this.toString+" : serv_pay_cond is null" );
}else{
	System.out.println(this.toString+" : serv_pay_cond is "+serv_pay_cond );
}
String fst_cntr_dt = req.getParameter("fst_cntr_dt");
if( fst_cntr_dt == null){
	System.out.println(this.toString+" : fst_cntr_dt is null" );
}else{
	System.out.println(this.toString+" : fst_cntr_dt is "+fst_cntr_dt );
}
String last_cntr_dt = req.getParameter("last_cntr_dt");
if( last_cntr_dt == null){
	System.out.println(this.toString+" : last_cntr_dt is null" );
}else{
	System.out.println(this.toString+" : last_cntr_dt is "+last_cntr_dt );
}
String cntr_expr_dt = req.getParameter("cntr_expr_dt");
if( cntr_expr_dt == null){
	System.out.println(this.toString+" : cntr_expr_dt is null" );
}else{
	System.out.println(this.toString+" : cntr_expr_dt is "+cntr_expr_dt );
}
String draft_no = req.getParameter("draft_no");
if( draft_no == null){
	System.out.println(this.toString+" : draft_no is null" );
}else{
	System.out.println(this.toString+" : draft_no is "+draft_no );
}
String bank_cd = req.getParameter("bank_cd");
if( bank_cd == null){
	System.out.println(this.toString+" : bank_cd is null" );
}else{
	System.out.println(this.toString+" : bank_cd is "+bank_cd );
}
String acct_no = req.getParameter("acct_no");
if( acct_no == null){
	System.out.println(this.toString+" : acct_no is null" );
}else{
	System.out.println(this.toString+" : acct_no is "+acct_no );
}
String medi_cd = req.getParameter("medi_cd");
if( medi_cd == null){
	System.out.println(this.toString+" : medi_cd is null" );
}else{
	System.out.println(this.toString+" : medi_cd is "+medi_cd );
}
String mang_no = req.getParameter("mang_no");
if( mang_no == null){
	System.out.println(this.toString+" : mang_no is null" );
}else{
	System.out.println(this.toString+" : mang_no is "+mang_no );
}
String medi_cd2 = req.getParameter("medi_cd2");
if( medi_cd2 == null){
	System.out.println(this.toString+" : medi_cd2 is null" );
}else{
	System.out.println(this.toString+" : medi_cd2 is "+medi_cd2 );
}
String thrw_pgm2 = req.getParameter("thrw_pgm2");
if( thrw_pgm2 == null){
	System.out.println(this.toString+" : thrw_pgm2 is null" );
}else{
	System.out.println(this.toString+" : thrw_pgm2 is "+thrw_pgm2 );
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
String flnm = Util.checkString(req.getParameter("flnm"));
String frlc_no = Util.checkString(req.getParameter("frlc_no"));
String prn = Util.checkString(req.getParameter("prn"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String addr = Util.checkString(req.getParameter("addr"));
String chrg_posk_cd = Util.checkString(req.getParameter("chrg_posk_cd"));
String thrw_pgm = Util.checkString(req.getParameter("thrw_pgm"));
String pay_cycl = Util.checkString(req.getParameter("pay_cycl"));
String servcost = Util.checkString(req.getParameter("servcost"));
String serv_pay_cond = Util.checkString(req.getParameter("serv_pay_cond"));
String fst_cntr_dt = Util.checkString(req.getParameter("fst_cntr_dt"));
String last_cntr_dt = Util.checkString(req.getParameter("last_cntr_dt"));
String cntr_expr_dt = Util.checkString(req.getParameter("cntr_expr_dt"));
String draft_no = Util.checkString(req.getParameter("draft_no"));
String bank_cd = Util.checkString(req.getParameter("bank_cd"));
String acct_no = Util.checkString(req.getParameter("acct_no"));
String medi_cd = Util.checkString(req.getParameter("medi_cd"));
String mang_no = Util.checkString(req.getParameter("mang_no"));
String medi_cd2 = Util.checkString(req.getParameter("medi_cd2"));
String thrw_pgm2 = Util.checkString(req.getParameter("thrw_pgm2"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String frlc_no = Util.Uni2Ksc(Util.checkString(req.getParameter("frlc_no")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String chrg_posk_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_posk_cd")));
String thrw_pgm = Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_pgm")));
String pay_cycl = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_cycl")));
String servcost = Util.Uni2Ksc(Util.checkString(req.getParameter("servcost")));
String serv_pay_cond = Util.Uni2Ksc(Util.checkString(req.getParameter("serv_pay_cond")));
String fst_cntr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("fst_cntr_dt")));
String last_cntr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("last_cntr_dt")));
String cntr_expr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntr_expr_dt")));
String draft_no = Util.Uni2Ksc(Util.checkString(req.getParameter("draft_no")));
String bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("bank_cd")));
String acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("acct_no")));
String medi_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd")));
String mang_no = Util.Uni2Ksc(Util.checkString(req.getParameter("mang_no")));
String medi_cd2 = Util.Uni2Ksc(Util.checkString(req.getParameter("medi_cd2")));
String thrw_pgm2 = Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_pgm2")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setMode(mode);
dm.setFlnm(flnm);
dm.setFrlc_no(frlc_no);
dm.setPrn(prn);
dm.setTel_no(tel_no);
dm.setAddr(addr);
dm.setChrg_posk_cd(chrg_posk_cd);
dm.setThrw_pgm(thrw_pgm);
dm.setPay_cycl(pay_cycl);
dm.setServcost(servcost);
dm.setServ_pay_cond(serv_pay_cond);
dm.setFst_cntr_dt(fst_cntr_dt);
dm.setLast_cntr_dt(last_cntr_dt);
dm.setCntr_expr_dt(cntr_expr_dt);
dm.setDraft_no(draft_no);
dm.setBank_cd(bank_cd);
dm.setAcct_no(acct_no);
dm.setMedi_cd(medi_cd);
dm.setMang_no(mang_no);
dm.setMedi_cd2(medi_cd2);
dm.setThrw_pgm2(thrw_pgm2);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Dec 12 14:16:21 KST 2012 */