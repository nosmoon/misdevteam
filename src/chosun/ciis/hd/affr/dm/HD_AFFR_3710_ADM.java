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


package chosun.ciis.hd.affr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.affr.ds.*;
import chosun.ciis.hd.affr.rec.*;

/**
 * 
 */


public class HD_AFFR_3710_ADM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String mode;
	public String cmpy_cd;
	public String emp_no;
	public String search_yyyymm;
	public String flnm;
	public String prn;
	public String aplc_dt;
	public String org_cd;
	public String cmpy_insr_cd;
	public String pay_cd;
	public String pay_dt;
	public String pay_amt;
	public String acpn_dt;
	public String remk;
	public String occr_dt;
	public String seq;
	public String incmg_pers_ipadd;
	public String incmg_pers;

	public HD_AFFR_3710_ADM(){}
	public HD_AFFR_3710_ADM(String mode, String cmpy_cd, String emp_no, String search_yyyymm, String flnm, String prn, String aplc_dt, String org_cd, String cmpy_insr_cd, String pay_cd, String pay_dt, String pay_amt, String acpn_dt, String remk, String occr_dt, String seq, String incmg_pers_ipadd, String incmg_pers){
		this.mode = mode;
		this.cmpy_cd = cmpy_cd;
		this.emp_no = emp_no;
		this.search_yyyymm = search_yyyymm;
		this.flnm = flnm;
		this.prn = prn;
		this.aplc_dt = aplc_dt;
		this.org_cd = org_cd;
		this.cmpy_insr_cd = cmpy_insr_cd;
		this.pay_cd = pay_cd;
		this.pay_dt = pay_dt;
		this.pay_amt = pay_amt;
		this.acpn_dt = acpn_dt;
		this.remk = remk;
		this.occr_dt = occr_dt;
		this.seq = seq;
		this.incmg_pers_ipadd = incmg_pers_ipadd;
		this.incmg_pers = incmg_pers;
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

	public void setSearch_yyyymm(String search_yyyymm){
		this.search_yyyymm = search_yyyymm;
	}

	public void setFlnm(String flnm){
		this.flnm = flnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setAplc_dt(String aplc_dt){
		this.aplc_dt = aplc_dt;
	}

	public void setOrg_cd(String org_cd){
		this.org_cd = org_cd;
	}

	public void setCmpy_insr_cd(String cmpy_insr_cd){
		this.cmpy_insr_cd = cmpy_insr_cd;
	}

	public void setPay_cd(String pay_cd){
		this.pay_cd = pay_cd;
	}

	public void setPay_dt(String pay_dt){
		this.pay_dt = pay_dt;
	}

	public void setPay_amt(String pay_amt){
		this.pay_amt = pay_amt;
	}

	public void setAcpn_dt(String acpn_dt){
		this.acpn_dt = acpn_dt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setOccr_dt(String occr_dt){
		this.occr_dt = occr_dt;
	}

	public void setSeq(String seq){
		this.seq = seq;
	}

	public void setIncmg_pers_ipadd(String incmg_pers_ipadd){
		this.incmg_pers_ipadd = incmg_pers_ipadd;
	}

	public void setIncmg_pers(String incmg_pers){
		this.incmg_pers = incmg_pers;
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

	public String getSearch_yyyymm(){
		return this.search_yyyymm;
	}

	public String getFlnm(){
		return this.flnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getAplc_dt(){
		return this.aplc_dt;
	}

	public String getOrg_cd(){
		return this.org_cd;
	}

	public String getCmpy_insr_cd(){
		return this.cmpy_insr_cd;
	}

	public String getPay_cd(){
		return this.pay_cd;
	}

	public String getPay_dt(){
		return this.pay_dt;
	}

	public String getPay_amt(){
		return this.pay_amt;
	}

	public String getAcpn_dt(){
		return this.acpn_dt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getOccr_dt(){
		return this.occr_dt;
	}

	public String getSeq(){
		return this.seq;
	}

	public String getIncmg_pers_ipadd(){
		return this.incmg_pers_ipadd;
	}

	public String getIncmg_pers(){
		return this.incmg_pers;
	}

	public String getSQL(){
		 return "{ call MISHDL.SP_HD_AFFR_3710_A(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		HD_AFFR_3710_ADM dm = (HD_AFFR_3710_ADM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.mode);
		cstmt.setString(4, dm.cmpy_cd);
		cstmt.setString(5, dm.emp_no);
		cstmt.setString(6, dm.search_yyyymm);
		cstmt.setString(7, dm.flnm);
		cstmt.setString(8, dm.prn);
		cstmt.setString(9, dm.aplc_dt);
		cstmt.setString(10, dm.org_cd);
		cstmt.setString(11, dm.cmpy_insr_cd);
		cstmt.setString(12, dm.pay_cd);
		cstmt.setString(13, dm.pay_dt);
		cstmt.setString(14, dm.pay_amt);
		cstmt.setString(15, dm.acpn_dt);
		cstmt.setString(16, dm.remk);
		cstmt.setString(17, dm.occr_dt);
		cstmt.setString(18, dm.seq);
		cstmt.setString(19, dm.incmg_pers_ipadd);
		cstmt.setString(20, dm.incmg_pers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.hd.affr.ds.HD_AFFR_3710_ADataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("mode = [" + getMode() + "]");
		System.out.println("cmpy_cd = [" + getCmpy_cd() + "]");
		System.out.println("emp_no = [" + getEmp_no() + "]");
		System.out.println("search_yyyymm = [" + getSearch_yyyymm() + "]");
		System.out.println("flnm = [" + getFlnm() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("aplc_dt = [" + getAplc_dt() + "]");
		System.out.println("org_cd = [" + getOrg_cd() + "]");
		System.out.println("cmpy_insr_cd = [" + getCmpy_insr_cd() + "]");
		System.out.println("pay_cd = [" + getPay_cd() + "]");
		System.out.println("pay_dt = [" + getPay_dt() + "]");
		System.out.println("pay_amt = [" + getPay_amt() + "]");
		System.out.println("acpn_dt = [" + getAcpn_dt() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("occr_dt = [" + getOccr_dt() + "]");
		System.out.println("seq = [" + getSeq() + "]");
		System.out.println("incmg_pers_ipadd = [" + getIncmg_pers_ipadd() + "]");
		System.out.println("incmg_pers = [" + getIncmg_pers() + "]");
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
String search_yyyymm = req.getParameter("search_yyyymm");
if( search_yyyymm == null){
	System.out.println(this.toString+" : search_yyyymm is null" );
}else{
	System.out.println(this.toString+" : search_yyyymm is "+search_yyyymm );
}
String flnm = req.getParameter("flnm");
if( flnm == null){
	System.out.println(this.toString+" : flnm is null" );
}else{
	System.out.println(this.toString+" : flnm is "+flnm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String aplc_dt = req.getParameter("aplc_dt");
if( aplc_dt == null){
	System.out.println(this.toString+" : aplc_dt is null" );
}else{
	System.out.println(this.toString+" : aplc_dt is "+aplc_dt );
}
String org_cd = req.getParameter("org_cd");
if( org_cd == null){
	System.out.println(this.toString+" : org_cd is null" );
}else{
	System.out.println(this.toString+" : org_cd is "+org_cd );
}
String cmpy_insr_cd = req.getParameter("cmpy_insr_cd");
if( cmpy_insr_cd == null){
	System.out.println(this.toString+" : cmpy_insr_cd is null" );
}else{
	System.out.println(this.toString+" : cmpy_insr_cd is "+cmpy_insr_cd );
}
String pay_cd = req.getParameter("pay_cd");
if( pay_cd == null){
	System.out.println(this.toString+" : pay_cd is null" );
}else{
	System.out.println(this.toString+" : pay_cd is "+pay_cd );
}
String pay_dt = req.getParameter("pay_dt");
if( pay_dt == null){
	System.out.println(this.toString+" : pay_dt is null" );
}else{
	System.out.println(this.toString+" : pay_dt is "+pay_dt );
}
String pay_amt = req.getParameter("pay_amt");
if( pay_amt == null){
	System.out.println(this.toString+" : pay_amt is null" );
}else{
	System.out.println(this.toString+" : pay_amt is "+pay_amt );
}
String acpn_dt = req.getParameter("acpn_dt");
if( acpn_dt == null){
	System.out.println(this.toString+" : acpn_dt is null" );
}else{
	System.out.println(this.toString+" : acpn_dt is "+acpn_dt );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String mode = Util.checkString(req.getParameter("mode"));
String cmpy_cd = Util.checkString(req.getParameter("cmpy_cd"));
String emp_no = Util.checkString(req.getParameter("emp_no"));
String search_yyyymm = Util.checkString(req.getParameter("search_yyyymm"));
String flnm = Util.checkString(req.getParameter("flnm"));
String prn = Util.checkString(req.getParameter("prn"));
String aplc_dt = Util.checkString(req.getParameter("aplc_dt"));
String org_cd = Util.checkString(req.getParameter("org_cd"));
String cmpy_insr_cd = Util.checkString(req.getParameter("cmpy_insr_cd"));
String pay_cd = Util.checkString(req.getParameter("pay_cd"));
String pay_dt = Util.checkString(req.getParameter("pay_dt"));
String pay_amt = Util.checkString(req.getParameter("pay_amt"));
String acpn_dt = Util.checkString(req.getParameter("acpn_dt"));
String remk = Util.checkString(req.getParameter("remk"));
String occr_dt = Util.checkString(req.getParameter("occr_dt"));
String seq = Util.checkString(req.getParameter("seq"));
String incmg_pers_ipadd = Util.checkString(req.getParameter("incmg_pers_ipadd"));
String incmg_pers = Util.checkString(req.getParameter("incmg_pers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String mode = Util.Uni2Ksc(Util.checkString(req.getParameter("mode")));
String cmpy_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_cd")));
String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String search_yyyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("search_yyyymm")));
String flnm = Util.Uni2Ksc(Util.checkString(req.getParameter("flnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String aplc_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplc_dt")));
String org_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("org_cd")));
String cmpy_insr_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpy_insr_cd")));
String pay_cd = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_cd")));
String pay_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_dt")));
String pay_amt = Util.Uni2Ksc(Util.checkString(req.getParameter("pay_amt")));
String acpn_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("acpn_dt")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String occr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("occr_dt")));
String seq = Util.Uni2Ksc(Util.checkString(req.getParameter("seq")));
String incmg_pers_ipadd = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers_ipadd")));
String incmg_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmg_pers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setMode(mode);
dm.setCmpy_cd(cmpy_cd);
dm.setEmp_no(emp_no);
dm.setSearch_yyyymm(search_yyyymm);
dm.setFlnm(flnm);
dm.setPrn(prn);
dm.setAplc_dt(aplc_dt);
dm.setOrg_cd(org_cd);
dm.setCmpy_insr_cd(cmpy_insr_cd);
dm.setPay_cd(pay_cd);
dm.setPay_dt(pay_dt);
dm.setPay_amt(pay_amt);
dm.setAcpn_dt(acpn_dt);
dm.setRemk(remk);
dm.setOccr_dt(occr_dt);
dm.setSeq(seq);
dm.setIncmg_pers_ipadd(incmg_pers_ipadd);
dm.setIncmg_pers(incmg_pers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 24 16:33:45 KST 2015 */