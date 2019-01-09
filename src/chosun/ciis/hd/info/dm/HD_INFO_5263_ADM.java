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


public class HD_INFO_5263_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String saly_shft_bank_cd;
	public String saly_shft_acct_no;
	public String alon_shft_bank_cd;
	public String alon_shft_acct_no;
	public String encrg_amt_shft_bank_cd;
	public String encrg_amt_shft_acct_no;
	public String etc_amt_shft_acct;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String proc_stat;
	public String proc_stat_req;
	public String gubun;

	public HD_INFO_5263_ADM(){}
	public HD_INFO_5263_ADM(String mode, String cmpy_cd, String emp_no, String occr_dt, String seq, String saly_shft_bank_cd, String saly_shft_acct_no, String alon_shft_bank_cd, String alon_shft_acct_no, String encrg_amt_shft_bank_cd, String encrg_amt_shft_acct_no, String etc_amt_shft_acct, String incmg_pers_ipadd, String incmg_pers, String proc_stat, String proc_stat_req, String gubun){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.saly_shft_bank_cd = saly_shft_bank_cd;
		this.saly_shft_acct_no = saly_shft_acct_no;
		this.alon_shft_bank_cd = alon_shft_bank_cd;
		this.alon_shft_acct_no = alon_shft_acct_no;
		this.encrg_amt_shft_bank_cd = encrg_amt_shft_bank_cd;
		this.encrg_amt_shft_acct_no = encrg_amt_shft_acct_no;
		this.etc_amt_shft_acct = etc_amt_shft_acct;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.proc_stat = proc_stat;
		this.proc_stat_req = proc_stat_req;
		this.gubun = gubun;
	}

	public void setMode(String mode){
		this.mode = mode;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setSaly_shft_bank_cd(String saly_shft_bank_cd){
		this.saly_shft_bank_cd = saly_shft_bank_cd;
	}

	public void setSaly_shft_acct_no(String saly_shft_acct_no){
		this.saly_shft_acct_no = saly_shft_acct_no;
	}

	public void setAlon_shft_bank_cd(String alon_shft_bank_cd){
		this.alon_shft_bank_cd = alon_shft_bank_cd;
	}

	public void setAlon_shft_acct_no(String alon_shft_acct_no){
		this.alon_shft_acct_no = alon_shft_acct_no;
	}

	public void setEncrg_amt_shft_bank_cd(String encrg_amt_shft_bank_cd){
		this.encrg_amt_shft_bank_cd = encrg_amt_shft_bank_cd;
	}

	public void setEncrg_amt_shft_acct_no(String encrg_amt_shft_acct_no){
		this.encrg_amt_shft_acct_no = encrg_amt_shft_acct_no;
	}

	public void setEtc_amt_shft_acct(String etc_amt_shft_acct){
		this.etc_amt_shft_acct = etc_amt_shft_acct;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setProc_stat(String proc_stat){
		this.proc_stat = proc_stat;
	}

	public void setProc_stat_req(String proc_stat_req){
		this.proc_stat_req = proc_stat_req;
	}

	public void setGubun(String gubun){
		this.gubun = gubun;
	}

	public String getMode(){
		return this.mode;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getSaly_shft_bank_cd(){
		return this.saly_shft_bank_cd;
	}

	public String getSaly_shft_acct_no(){
		return this.saly_shft_acct_no;
	}

	public String getAlon_shft_bank_cd(){
		return this.alon_shft_bank_cd;
	}

	public String getAlon_shft_acct_no(){
		return this.alon_shft_acct_no;
	}

	public String getEncrg_amt_shft_bank_cd(){
		return this.encrg_amt_shft_bank_cd;
	}

	public String getEncrg_amt_shft_acct_no(){
		return this.encrg_amt_shft_acct_no;
	}

	public String getEtc_amt_shft_acct(){
		return this.etc_amt_shft_acct;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getProc_stat(){
		return this.proc_stat;
	}

	public String getProc_stat_req(){
		return this.proc_stat_req;
	}

	public String getGubun(){
		return this.gubun;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INFO_5263_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INFO_5263_ADM dm = (HD_INFO_5263_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.occr_dt);
		cstmt.setString(7, dm.seq);
		cstmt.setString(8, dm.saly_shft_bank_cd);
		cstmt.setString(9, dm.saly_shft_acct_no);
		cstmt.setString(10, dm.alon_shft_bank_cd);
		cstmt.setString(11, dm.alon_shft_acct_no);
		cstmt.setString(12, dm.encrg_amt_shft_bank_cd);
		cstmt.setString(13, dm.encrg_amt_shft_acct_no);
		cstmt.setString(14, dm.etc_amt_shft_acct);
		cstmt.setString(15, dm.incmg_pers_ipadd);
		cstmt.setString(16, dm.incmg_pers);
		cstmt.setString(17, dm.proc_stat);
		cstmt.setString(18, dm.proc_stat_req);
		cstmt.setString(19, dm.gubun);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.info.ds.HD_INFO_5263_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("saly_shft_bank_cd = [" + getSaly_shft_bank_cd() + "]");
		System.out.println("saly_shft_acct_no = [" + getSaly_shft_acct_no() + "]");
		System.out.println("alon_shft_bank_cd = [" + getAlon_shft_bank_cd() + "]");
		System.out.println("alon_shft_acct_no = [" + getAlon_shft_acct_no() + "]");
		System.out.println("encrg_amt_shft_bank_cd = [" + getEncrg_amt_shft_bank_cd() + "]");
		System.out.println("encrg_amt_shft_acct_no = [" + getEncrg_amt_shft_acct_no() + "]");
		System.out.println("etc_amt_shft_acct = [" + getEtc_amt_shft_acct() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("proc_stat = [" + getProc_stat() + "]");
		System.out.println("proc_stat_req = [" + getProc_stat_req() + "]");
		System.out.println("gubun = [" + getGubun() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String mode = req.getParameter("mode");
if( mode == null){
	System.out.println(this.toString+" : mode is null" );
}else{
	System.out.println(this.toString+" : mode is "+mode );
}
String cmpy_cd = req.getParameter("cmpy_cd");
if( cmpy_cd == null){
	System.out.println(this.toString+" : cmpy_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_cd is "+cmpy_cd );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String occr_dt = req.getParameter("occr_dt");
if( occr_dt == null){
	System.out.println(this.toString+" : occr_dt is null" );
}else{
	System.out.println(this.toString+" : occr_dt is "+occr_dt );
}
String seq = req.getParameter("seq");
if( seq == null){
	System.out.println(this.toString+" : seq is null" );
}else{
	System.out.println(this.toString+" : seq is "+seq );
}
String saly_shft_bank_cd = req.getParameter("saly_shft_bank_cd");
if( saly_shft_bank_cd == null){
	System.out.println(this.toString+" : saly_shft_bank_cd is null" );
}else{
	System.out.println(this.toString+" : saly_shft_bank_cd is "+saly_shft_bank_cd );
}
String saly_shft_acct_no = req.getParameter("saly_shft_acct_no");
if( saly_shft_acct_no == null){
	System.out.println(this.toString+" : saly_shft_acct_no is null" );
}else{
	System.out.println(this.toString+" : saly_shft_acct_no is "+saly_shft_acct_no );
}
String alon_shft_bank_cd = req.getParameter("alon_shft_bank_cd");
if( alon_shft_bank_cd == null){
	System.out.println(this.toString+" : alon_shft_bank_cd is null" );
}else{
	System.out.println(this.toString+" : alon_shft_bank_cd is "+alon_shft_bank_cd );
}
String alon_shft_acct_no = req.getParameter("alon_shft_acct_no");
if( alon_shft_acct_no == null){
	System.out.println(this.toString+" : alon_shft_acct_no is null" );
}else{
	System.out.println(this.toString+" : alon_shft_acct_no is "+alon_shft_acct_no );
}
String encrg_amt_shft_bank_cd = req.getParameter("encrg_amt_shft_bank_cd");
if( encrg_amt_shft_bank_cd == null){
	System.out.println(this.toString+" : encrg_amt_shft_bank_cd is null" );
}else{
	System.out.println(this.toString+" : encrg_amt_shft_bank_cd is "+encrg_amt_shft_bank_cd );
}
String encrg_amt_shft_acct_no = req.getParameter("encrg_amt_shft_acct_no");
if( encrg_amt_shft_acct_no == null){
	System.out.println(this.toString+" : encrg_amt_shft_acct_no is null" );
}else{
	System.out.println(this.toString+" : encrg_amt_shft_acct_no is "+encrg_amt_shft_acct_no );
}
String etc_amt_shft_acct = req.getParameter("etc_amt_shft_acct");
if( etc_amt_shft_acct == null){
	System.out.println(this.toString+" : etc_amt_shft_acct is null" );
}else{
	System.out.println(this.toString+" : etc_amt_shft_acct is "+etc_amt_shft_acct );
}
String incmg_pers_ipadd = req.getParameter("incmg_pers_ipadd");
if( incmg_pers_ipadd == null){
	System.out.println(this.toString+" : incmg_pers_ipadd is null" );
}else{
	System.out.println(this.toString+" : incmg_pers_ipadd is "+incmg_pers_ipadd );
}
String incmg_pers = req.getParameter("incmg_pers");
if( incmg_pers == null){
	System.out.println(this.toString+" : incmg_pers is null" );
}else{
	System.out.println(this.toString+" : incmg_pers is "+incmg_pers );
}
String proc_stat = req.getParameter("proc_stat");
if( proc_stat == null){
	System.out.println(this.toString+" : proc_stat is null" );
}else{
	System.out.println(this.toString+" : proc_stat is "+proc_stat );
}
String proc_stat_req = req.getParameter("proc_stat_req");
if( proc_stat_req == null){
	System.out.println(this.toString+" : proc_stat_req is null" );
}else{
	System.out.println(this.toString+" : proc_stat_req is "+proc_stat_req );
}
String gubun = req.getParameter("gubun");
if( gubun == null){
	System.out.println(this.toString+" : gubun is null" );
}else{
	System.out.println(this.toString+" : gubun is "+gubun );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String saly_shft_bank_cd = Util.checkString(req.getParameter("saly_shft_bank_cd"));
String saly_shft_acct_no = Util.checkString(req.getParameter("saly_shft_acct_no"));
String alon_shft_bank_cd = Util.checkString(req.getParameter("alon_shft_bank_cd"));
String alon_shft_acct_no = Util.checkString(req.getParameter("alon_shft_acct_no"));
String encrg_amt_shft_bank_cd = Util.checkString(req.getParameter("encrg_amt_shft_bank_cd"));
String encrg_amt_shft_acct_no = Util.checkString(req.getParameter("encrg_amt_shft_acct_no"));
String etc_amt_shft_acct = Util.checkString(req.getParameter("etc_amt_shft_acct"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String proc_stat = Util.checkString(req.getParameter("proc_stat"));
String proc_stat_req = Util.checkString(req.getParameter("proc_stat_req"));
String gubun = Util.checkString(req.getParameter("gubun"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String saly_shft_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_shft_bank_cd")));
String saly_shft_acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("saly_shft_acct_no")));
String alon_shft_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_shft_bank_cd")));
String alon_shft_acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("alon_shft_acct_no")));
String encrg_amt_shft_bank_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("encrg_amt_shft_bank_cd")));
String encrg_amt_shft_acct_no = Util.Uni2Ksc(Util.checkString(req.getParameter("encrg_amt_shft_acct_no")));
String etc_amt_shft_acct = Util.Uni2Ksc(Util.checkString(req.getParameter("etc_amt_shft_acct")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String proc_stat = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat")));
String proc_stat_req = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_stat_req")));
String gubun = Util.Uni2Ksc(Util.checkString(req.getParameter("gubun")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setSaly_shft_bank_cd(saly_shft_bank_cd);
dm.setSaly_shft_acct_no(saly_shft_acct_no);
dm.setAlon_shft_bank_cd(alon_shft_bank_cd);
dm.setAlon_shft_acct_no(alon_shft_acct_no);
dm.setEncrg_amt_shft_bank_cd(encrg_amt_shft_bank_cd);
dm.setEncrg_amt_shft_acct_no(encrg_amt_shft_acct_no);
dm.setEtc_amt_shft_acct(etc_amt_shft_acct);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setProc_stat(proc_stat);
dm.setProc_stat_req(proc_stat_req);
dm.setGubun(gubun);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 15 18:27:58 KST 2017 */