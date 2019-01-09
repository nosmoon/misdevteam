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


package chosun.ciis.hd.insr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.insr.ds.*;
import chosun.ciis.hd.insr.rec.*;

/**
 * 
 */


public class HD_INSR_1723_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpy_cd;
	public String occr_dt;
	public String seq;
	public String tms;
	public String emp_no;
	public String flnm;
	public String insr_amt_recp_dt;
	public String insr_amt_recp_resn;
	public String rela_spc_agrmnt;
	public String recp_insr_amt;
	public String clam_resn_occr_dt;
	public String remk;
	public String incmg_pers_ipadd;
	public String incmg_pers;
	public String chg_pers;
	public String dlay_int;
	public String flag;

	public HD_INSR_1723_ADM(){}
	public HD_INSR_1723_ADM(String cmpy_cd, String occr_dt, String seq, String tms, String emp_no, String flnm, String insr_amt_recp_dt, String insr_amt_recp_resn, String rela_spc_agrmnt, String recp_insr_amt, String clam_resn_occr_dt, String remk, String incmg_pers_ipadd, String incmg_pers, String chg_pers, String dlay_int, String flag){
		this.cmpy_cd = cmpy_cd;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.tms = tms;
		this.emp_no = emp_no;
		this.flnm = flnm;
		this.insr_amt_recp_dt = insr_amt_recp_dt;
		this.insr_amt_recp_resn = insr_amt_recp_resn;
		this.rela_spc_agrmnt = rela_spc_agrmnt;
		this.recp_insr_amt = recp_insr_amt;
		this.clam_resn_occr_dt = clam_resn_occr_dt;
		this.remk = remk;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
		this.chg_pers = chg_pers;
		this.dlay_int = dlay_int;
		this.flag = flag;
	}

	public void setCmpy_cd(String cmpy_cd){
		this.cmpy_cd = cmpy_cd;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setTms(String tms){
		this.tms = tms;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setInsr_amt_recp_dt(String insr_amt_recp_dt){
		this.insr_amt_recp_dt = insr_amt_recp_dt;
	}

	public void setInsr_amt_recp_resn(String insr_amt_recp_resn){
		this.insr_amt_recp_resn = insr_amt_recp_resn;
	}

	public void setRela_spc_agrmnt(String rela_spc_agrmnt){
		this.rela_spc_agrmnt = rela_spc_agrmnt;
	}

	public void setRecp_insr_amt(String recp_insr_amt){
		this.recp_insr_amt = recp_insr_amt;
	}

	public void setClam_resn_occr_dt(String clam_resn_occr_dt){
		this.clam_resn_occr_dt = clam_resn_occr_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
	}

	public void setChg_pers(String chg_pers){
		this.chg_pers = chg_pers;
	}

	public void setDlay_int(String dlay_int){
		this.dlay_int = dlay_int;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public String getCmpy_cd(){
		return this.cmpy_cd;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getTms(){
		return this.tms;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getInsr_amt_recp_dt(){
		return this.insr_amt_recp_dt;
	}

	public String getInsr_amt_recp_resn(){
		return this.insr_amt_recp_resn;
	}

	public String getRela_spc_agrmnt(){
		return this.rela_spc_agrmnt;
	}

	public String getRecp_insr_amt(){
		return this.recp_insr_amt;
	}

	public String getClam_resn_occr_dt(){
		return this.clam_resn_occr_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getChg_pers(){
		return this.chg_pers;
	}

	public String getDlay_int(){
		return this.dlay_int;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_INSR_1723_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_INSR_1723_ADM dm = (HD_INSR_1723_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.registerOutParameter(3, Types.VARCHAR);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.occr_dt);
		cstmt.setString(6, dm.seq);
		cstmt.setString(7, dm.tms);
		cstmt.setString(8, dm.emp_no);
		cstmt.setString(9, dm.flnm);
		cstmt.setString(10, dm.insr_amt_recp_dt);
		cstmt.setString(11, dm.insr_amt_recp_resn);
		cstmt.setString(12, dm.rela_spc_agrmnt);
		cstmt.setString(13, dm.recp_insr_amt);
		cstmt.setString(14, dm.clam_resn_occr_dt);
		cstmt.setString(15, dm.remk);
		cstmt.setString(16, dm.incmg_pers_ipadd);
		cstmt.setString(17, dm.incmg_pers);
		cstmt.setString(18, dm.chg_pers);
		cstmt.setString(19, dm.dlay_int);
		cstmt.setString(20, dm.flag);
	}

	public BaseDataSet createDataSetObject(){
		return new HD_INSR_1723_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("tms = [" + getTms() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("insr_amt_recp_dt = [" + getInsr_amt_recp_dt() + "]");
		System.out.println("insr_amt_recp_resn = [" + getInsr_amt_recp_resn() + "]");
		System.out.println("rela_spc_agrmnt = [" + getRela_spc_agrmnt() + "]");
		System.out.println("recp_insr_amt = [" + getRecp_insr_amt() + "]");
		System.out.println("clam_resn_occr_dt = [" + getClam_resn_occr_dt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
		System.out.println("chg_pers = [" + getChg_pers() + "]");
		System.out.println("dlay_int = [" + getDlay_int() + "]");
		System.out.println("flag = [" + getFlag() + "]");
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
String tms = req.getParameter("tms");
if( tms == null){
	System.out.println(this.toString+" : tms is null" );
}else{
	System.out.println(this.toString+" : tms is "+tms );
}
String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String insr_amt_recp_dt = req.getParameter("insr_amt_recp_dt");
if( insr_amt_recp_dt == null){
	System.out.println(this.toString+" : insr_amt_recp_dt is null" );
}else{
	System.out.println(this.toString+" : insr_amt_recp_dt is "+insr_amt_recp_dt );
}
String insr_amt_recp_resn = req.getParameter("insr_amt_recp_resn");
if( insr_amt_recp_resn == null){
	System.out.println(this.toString+" : insr_amt_recp_resn is null" );
}else{
	System.out.println(this.toString+" : insr_amt_recp_resn is "+insr_amt_recp_resn );
}
String rela_spc_agrmnt = req.getParameter("rela_spc_agrmnt");
if( rela_spc_agrmnt == null){
	System.out.println(this.toString+" : rela_spc_agrmnt is null" );
}else{
	System.out.println(this.toString+" : rela_spc_agrmnt is "+rela_spc_agrmnt );
}
String recp_insr_amt = req.getParameter("recp_insr_amt");
if( recp_insr_amt == null){
	System.out.println(this.toString+" : recp_insr_amt is null" );
}else{
	System.out.println(this.toString+" : recp_insr_amt is "+recp_insr_amt );
}
String clam_resn_occr_dt = req.getParameter("clam_resn_occr_dt");
if( clam_resn_occr_dt == null){
	System.out.println(this.toString+" : clam_resn_occr_dt is null" );
}else{
	System.out.println(this.toString+" : clam_resn_occr_dt is "+clam_resn_occr_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String chg_pers = req.getParameter("chg_pers");
if( chg_pers == null){
	System.out.println(this.toString+" : chg_pers is null" );
}else{
	System.out.println(this.toString+" : chg_pers is "+chg_pers );
}
String dlay_int = req.getParameter("dlay_int");
if( dlay_int == null){
	System.out.println(this.toString+" : dlay_int is null" );
}else{
	System.out.println(this.toString+" : dlay_int is "+dlay_int );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String tms = Util.checkString(req.getParameter("tms"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String flnm = Util.checkString(req.getParameter("flnm"));
String insr_amt_recp_dt = Util.checkString(req.getParameter("insr_amt_recp_dt"));
String insr_amt_recp_resn = Util.checkString(req.getParameter("insr_amt_recp_resn"));
String rela_spc_agrmnt = Util.checkString(req.getParameter("rela_spc_agrmnt"));
String recp_insr_amt = Util.checkString(req.getParameter("recp_insr_amt"));
String clam_resn_occr_dt = Util.checkString(req.getParameter("clam_resn_occr_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
String chg_pers = Util.checkString(req.getParameter("chg_pers"));
String dlay_int = Util.checkString(req.getParameter("dlay_int"));
String flag = Util.checkString(req.getParameter("flag"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String tms = Util.Uni2Ksc(Util.checkString(req.getParameter("tms")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String insr_amt_recp_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_amt_recp_dt")));
String insr_amt_recp_resn = Util.Uni2Ksc(Util.checkString(req.getParameter("insr_amt_recp_resn")));
String rela_spc_agrmnt = Util.Uni2Ksc(Util.checkString(req.getParameter("rela_spc_agrmnt")));
String recp_insr_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("recp_insr_amt")));
String clam_resn_occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("clam_resn_occr_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
String chg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("chg_pers")));
String dlay_int = Util.Uni2Ksc(Util.checkString(req.getParameter("dlay_int")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpy_cd(cmpy_cd);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setTms(tms);
dm.setEmp_no(emp_no);
dm.setFlnm(flnm);
dm.setInsr_amt_recp_dt(insr_amt_recp_dt);
dm.setInsr_amt_recp_resn(insr_amt_recp_resn);
dm.setRela_spc_agrmnt(rela_spc_agrmnt);
dm.setRecp_insr_amt(recp_insr_amt);
dm.setClam_resn_occr_dt(clam_resn_occr_dt);
dm.setRemk(remk);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
dm.setChg_pers(chg_pers);
dm.setDlay_int(dlay_int);
dm.setFlag(flag);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 19 17:42:50 KST 2009 */