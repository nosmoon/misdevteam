/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_I_YEARLY_SUBSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cpnno;
	public String cpntypecd;
	public String freemm;
	public String extnfee;
	public String issudt;
	public String seldt;
	public String expdt;
	public String usedt;
	public String empno;
	public String cmpynm;
	public String deptnm;
	public String teamnm;
	public String empnm;
	public String emp_telno;
	public String shftcd;
	public String shftamt;
	public String shftdt;
	public String shftnm;
	public String remk;
	public String bocd;
	public String bo_telno;
	public String banknm;
	public String acctno;
	public String deps_persnm;
	public String sendyn;
	public String rdr_no;
	public String rdrnm;
	public String subscnfm;
	public String rdr_extndt;
	public String rdr_extnno;
	public String subsfr_dt;
	public String valmm;
	public String cmpycd;
	public String deptcd;
	public String teamcd;
	public String incmgpers;
	public String flag;
	public String extn_rdrnm;
	public String extn_rshpclsf;
	public String extn_tel1;
	public String extn_tel2;
	public String extn_tel3;
	public String extn_ptph1;
	public String extn_ptph2;
	public String extn_ptph3;
	public String extn_email;
	public String extn_dlvzip;
	public String extn_dlvaddr;
	public String extn_dlvaddrdtls;
	public String extn_bocd;
	public String extn_bonm;
	public String extn_resiclsf;
	public String extn_resitype;
	public String extn_dlvhope;
	public String extn_remk;
	public String extn_qty;
	public String bldmngnn;

	public SS_I_YEARLY_SUBSDM(){}
	public SS_I_YEARLY_SUBSDM(String cpnno, String cpntypecd, String freemm, String extnfee, String issudt, String seldt, String expdt, String usedt, String empno, String cmpynm, String deptnm, String teamnm, String empnm, String emp_telno, String shftcd, String shftamt, String shftdt, String shftnm, String remk, String bocd, String bo_telno, String banknm, String acctno, String deps_persnm, String sendyn, String rdr_no, String rdrnm, String subscnfm, String rdr_extndt, String rdr_extnno, String subsfr_dt, String valmm, String cmpycd, String deptcd, String teamcd, String incmgpers, String flag, String extn_rdrnm, String extn_rshpclsf, String extn_tel1, String extn_tel2, String extn_tel3, String extn_ptph1, String extn_ptph2, String extn_ptph3, String extn_email, String extn_dlvzip, String extn_dlvaddr, String extn_dlvaddrdtls, String extn_bocd, String extn_bonm, String extn_resiclsf, String extn_resitype, String extn_dlvhope, String extn_remk, String extn_qty, String bldmngnn){
		this.cpnno = cpnno;
		this.cpntypecd = cpntypecd;
		this.freemm = freemm;
		this.extnfee = extnfee;
		this.issudt = issudt;
		this.seldt = seldt;
		this.expdt = expdt;
		this.usedt = usedt;
		this.empno = empno;
		this.cmpynm = cmpynm;
		this.deptnm = deptnm;
		this.teamnm = teamnm;
		this.empnm = empnm;
		this.emp_telno = emp_telno;
		this.shftcd = shftcd;
		this.shftamt = shftamt;
		this.shftdt = shftdt;
		this.shftnm = shftnm;
		this.remk = remk;
		this.bocd = bocd;
		this.bo_telno = bo_telno;
		this.banknm = banknm;
		this.acctno = acctno;
		this.deps_persnm = deps_persnm;
		this.sendyn = sendyn;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.subscnfm = subscnfm;
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.subsfr_dt = subsfr_dt;
		this.valmm = valmm;
		this.cmpycd = cmpycd;
		this.deptcd = deptcd;
		this.teamcd = teamcd;
		this.incmgpers = incmgpers;
		this.flag = flag;
		this.extn_rdrnm = extn_rdrnm;
		this.extn_rshpclsf = extn_rshpclsf;
		this.extn_tel1 = extn_tel1;
		this.extn_tel2 = extn_tel2;
		this.extn_tel3 = extn_tel3;
		this.extn_ptph1 = extn_ptph1;
		this.extn_ptph2 = extn_ptph2;
		this.extn_ptph3 = extn_ptph3;
		this.extn_email = extn_email;
		this.extn_dlvzip = extn_dlvzip;
		this.extn_dlvaddr = extn_dlvaddr;
		this.extn_dlvaddrdtls = extn_dlvaddrdtls;
		this.extn_bocd = extn_bocd;
		this.extn_bonm = extn_bonm;
		this.extn_resiclsf = extn_resiclsf;
		this.extn_resitype = extn_resitype;
		this.extn_dlvhope = extn_dlvhope;
		this.extn_remk = extn_remk;
		this.extn_qty = extn_qty;
		this.bldmngnn = bldmngnn;
	}

	public void setCpnno(String cpnno){
		this.cpnno = cpnno;
	}

	public void setCpntypecd(String cpntypecd){
		this.cpntypecd = cpntypecd;
	}

	public void setFreemm(String freemm){
		this.freemm = freemm;
	}

	public void setExtnfee(String extnfee){
		this.extnfee = extnfee;
	}

	public void setIssudt(String issudt){
		this.issudt = issudt;
	}

	public void setSeldt(String seldt){
		this.seldt = seldt;
	}

	public void setExpdt(String expdt){
		this.expdt = expdt;
	}

	public void setUsedt(String usedt){
		this.usedt = usedt;
	}

	public void setEmpno(String empno){
		this.empno = empno;
	}

	public void setCmpynm(String cmpynm){
		this.cmpynm = cmpynm;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setTeamnm(String teamnm){
		this.teamnm = teamnm;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
	}

	public void setEmp_telno(String emp_telno){
		this.emp_telno = emp_telno;
	}

	public void setShftcd(String shftcd){
		this.shftcd = shftcd;
	}

	public void setShftamt(String shftamt){
		this.shftamt = shftamt;
	}

	public void setShftdt(String shftdt){
		this.shftdt = shftdt;
	}

	public void setShftnm(String shftnm){
		this.shftnm = shftnm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBo_telno(String bo_telno){
		this.bo_telno = bo_telno;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setDeps_persnm(String deps_persnm){
		this.deps_persnm = deps_persnm;
	}

	public void setSendyn(String sendyn){
		this.sendyn = sendyn;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setSubscnfm(String subscnfm){
		this.subscnfm = subscnfm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setSubsfr_dt(String subsfr_dt){
		this.subsfr_dt = subsfr_dt;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setTeamcd(String teamcd){
		this.teamcd = teamcd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setFlag(String flag){
		this.flag = flag;
	}

	public void setExtn_rdrnm(String extn_rdrnm){
		this.extn_rdrnm = extn_rdrnm;
	}

	public void setExtn_rshpclsf(String extn_rshpclsf){
		this.extn_rshpclsf = extn_rshpclsf;
	}

	public void setExtn_tel1(String extn_tel1){
		this.extn_tel1 = extn_tel1;
	}

	public void setExtn_tel2(String extn_tel2){
		this.extn_tel2 = extn_tel2;
	}

	public void setExtn_tel3(String extn_tel3){
		this.extn_tel3 = extn_tel3;
	}

	public void setExtn_ptph1(String extn_ptph1){
		this.extn_ptph1 = extn_ptph1;
	}

	public void setExtn_ptph2(String extn_ptph2){
		this.extn_ptph2 = extn_ptph2;
	}

	public void setExtn_ptph3(String extn_ptph3){
		this.extn_ptph3 = extn_ptph3;
	}

	public void setExtn_email(String extn_email){
		this.extn_email = extn_email;
	}

	public void setExtn_dlvzip(String extn_dlvzip){
		this.extn_dlvzip = extn_dlvzip;
	}

	public void setExtn_dlvaddr(String extn_dlvaddr){
		this.extn_dlvaddr = extn_dlvaddr;
	}

	public void setExtn_dlvaddrdtls(String extn_dlvaddrdtls){
		this.extn_dlvaddrdtls = extn_dlvaddrdtls;
	}

	public void setExtn_bocd(String extn_bocd){
		this.extn_bocd = extn_bocd;
	}

	public void setExtn_bonm(String extn_bonm){
		this.extn_bonm = extn_bonm;
	}

	public void setExtn_resiclsf(String extn_resiclsf){
		this.extn_resiclsf = extn_resiclsf;
	}

	public void setExtn_resitype(String extn_resitype){
		this.extn_resitype = extn_resitype;
	}

	public void setExtn_dlvhope(String extn_dlvhope){
		this.extn_dlvhope = extn_dlvhope;
	}

	public void setExtn_remk(String extn_remk){
		this.extn_remk = extn_remk;
	}

	public void setExtn_qty(String extn_qty){
		this.extn_qty = extn_qty;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public String getCpnno(){
		return this.cpnno;
	}

	public String getCpntypecd(){
		return this.cpntypecd;
	}

	public String getFreemm(){
		return this.freemm;
	}

	public String getExtnfee(){
		return this.extnfee;
	}

	public String getIssudt(){
		return this.issudt;
	}

	public String getSeldt(){
		return this.seldt;
	}

	public String getExpdt(){
		return this.expdt;
	}

	public String getUsedt(){
		return this.usedt;
	}

	public String getEmpno(){
		return this.empno;
	}

	public String getCmpynm(){
		return this.cmpynm;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getTeamnm(){
		return this.teamnm;
	}

	public String getEmpnm(){
		return this.empnm;
	}

	public String getEmp_telno(){
		return this.emp_telno;
	}

	public String getShftcd(){
		return this.shftcd;
	}

	public String getShftamt(){
		return this.shftamt;
	}

	public String getShftdt(){
		return this.shftdt;
	}

	public String getShftnm(){
		return this.shftnm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBo_telno(){
		return this.bo_telno;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getDeps_persnm(){
		return this.deps_persnm;
	}

	public String getSendyn(){
		return this.sendyn;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getSubscnfm(){
		return this.subscnfm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getSubsfr_dt(){
		return this.subsfr_dt;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getTeamcd(){
		return this.teamcd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getFlag(){
		return this.flag;
	}

	public String getExtn_rdrnm(){
		return this.extn_rdrnm;
	}

	public String getExtn_rshpclsf(){
		return this.extn_rshpclsf;
	}

	public String getExtn_tel1(){
		return this.extn_tel1;
	}

	public String getExtn_tel2(){
		return this.extn_tel2;
	}

	public String getExtn_tel3(){
		return this.extn_tel3;
	}

	public String getExtn_ptph1(){
		return this.extn_ptph1;
	}

	public String getExtn_ptph2(){
		return this.extn_ptph2;
	}

	public String getExtn_ptph3(){
		return this.extn_ptph3;
	}

	public String getExtn_email(){
		return this.extn_email;
	}

	public String getExtn_dlvzip(){
		return this.extn_dlvzip;
	}

	public String getExtn_dlvaddr(){
		return this.extn_dlvaddr;
	}

	public String getExtn_dlvaddrdtls(){
		return this.extn_dlvaddrdtls;
	}

	public String getExtn_bocd(){
		return this.extn_bocd;
	}

	public String getExtn_bonm(){
		return this.extn_bonm;
	}

	public String getExtn_resiclsf(){
		return this.extn_resiclsf;
	}

	public String getExtn_resitype(){
		return this.extn_resitype;
	}

	public String getExtn_dlvhope(){
		return this.extn_dlvhope;
	}

	public String getExtn_remk(){
		return this.extn_remk;
	}

	public String getExtn_qty(){
		return this.extn_qty;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_I_YEARLY_SUBS(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_I_YEARLY_SUBSDM dm = (SS_I_YEARLY_SUBSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cpnno);
		cstmt.setString(4, dm.cpntypecd);
		cstmt.setString(5, dm.freemm);
		cstmt.setString(6, dm.extnfee);
		cstmt.setString(7, dm.issudt);
		cstmt.setString(8, dm.seldt);
		cstmt.setString(9, dm.expdt);
		cstmt.setString(10, dm.usedt);
		cstmt.setString(11, dm.empno);
		cstmt.setString(12, dm.cmpynm);
		cstmt.setString(13, dm.deptnm);
		cstmt.setString(14, dm.teamnm);
		cstmt.setString(15, dm.empnm);
		cstmt.setString(16, dm.emp_telno);
		cstmt.setString(17, dm.shftcd);
		cstmt.setString(18, dm.shftamt);
		cstmt.setString(19, dm.shftdt);
		cstmt.setString(20, dm.shftnm);
		cstmt.setString(21, dm.remk);
		cstmt.setString(22, dm.bocd);
		cstmt.setString(23, dm.bo_telno);
		cstmt.setString(24, dm.banknm);
		cstmt.setString(25, dm.acctno);
		cstmt.setString(26, dm.deps_persnm);
		cstmt.setString(27, dm.sendyn);
		cstmt.setString(28, dm.rdr_no);
		cstmt.setString(29, dm.rdrnm);
		cstmt.setString(30, dm.subscnfm);
		cstmt.setString(31, dm.rdr_extndt);
		cstmt.setString(32, dm.rdr_extnno);
		cstmt.setString(33, dm.subsfr_dt);
		cstmt.setString(34, dm.valmm);
		cstmt.setString(35, dm.cmpycd);
		cstmt.setString(36, dm.deptcd);
		cstmt.setString(37, dm.teamcd);
		cstmt.setString(38, dm.incmgpers);
		cstmt.setString(39, dm.flag);
		cstmt.setString(40, dm.extn_rdrnm);
		cstmt.setString(41, dm.extn_rshpclsf);
		cstmt.setString(42, dm.extn_tel1);
		cstmt.setString(43, dm.extn_tel2);
		cstmt.setString(44, dm.extn_tel3);
		cstmt.setString(45, dm.extn_ptph1);
		cstmt.setString(46, dm.extn_ptph2);
		cstmt.setString(47, dm.extn_ptph3);
		cstmt.setString(48, dm.extn_email);
		cstmt.setString(49, dm.extn_dlvzip);
		cstmt.setString(50, dm.extn_dlvaddr);
		cstmt.setString(51, dm.extn_dlvaddrdtls);
		cstmt.setString(52, dm.extn_bocd);
		cstmt.setString(53, dm.extn_bonm);
		cstmt.setString(54, dm.extn_resiclsf);
		cstmt.setString(55, dm.extn_resitype);
		cstmt.setString(56, dm.extn_dlvhope);
		cstmt.setString(57, dm.extn_remk);
		cstmt.setString(58, dm.extn_qty);
		cstmt.setString(59, dm.bldmngnn);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_I_YEARLY_SUBSDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cpnno = [" + getCpnno() + "]");
		System.out.println("cpntypecd = [" + getCpntypecd() + "]");
		System.out.println("freemm = [" + getFreemm() + "]");
		System.out.println("extnfee = [" + getExtnfee() + "]");
		System.out.println("issudt = [" + getIssudt() + "]");
		System.out.println("seldt = [" + getSeldt() + "]");
		System.out.println("expdt = [" + getExpdt() + "]");
		System.out.println("usedt = [" + getUsedt() + "]");
		System.out.println("empno = [" + getEmpno() + "]");
		System.out.println("cmpynm = [" + getCmpynm() + "]");
		System.out.println("deptnm = [" + getDeptnm() + "]");
		System.out.println("teamnm = [" + getTeamnm() + "]");
		System.out.println("empnm = [" + getEmpnm() + "]");
		System.out.println("emp_telno = [" + getEmp_telno() + "]");
		System.out.println("shftcd = [" + getShftcd() + "]");
		System.out.println("shftamt = [" + getShftamt() + "]");
		System.out.println("shftdt = [" + getShftdt() + "]");
		System.out.println("shftnm = [" + getShftnm() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("bo_telno = [" + getBo_telno() + "]");
		System.out.println("banknm = [" + getBanknm() + "]");
		System.out.println("acctno = [" + getAcctno() + "]");
		System.out.println("deps_persnm = [" + getDeps_persnm() + "]");
		System.out.println("sendyn = [" + getSendyn() + "]");
		System.out.println("rdr_no = [" + getRdr_no() + "]");
		System.out.println("rdrnm = [" + getRdrnm() + "]");
		System.out.println("subscnfm = [" + getSubscnfm() + "]");
		System.out.println("rdr_extndt = [" + getRdr_extndt() + "]");
		System.out.println("rdr_extnno = [" + getRdr_extnno() + "]");
		System.out.println("subsfr_dt = [" + getSubsfr_dt() + "]");
		System.out.println("valmm = [" + getValmm() + "]");
		System.out.println("cmpycd = [" + getCmpycd() + "]");
		System.out.println("deptcd = [" + getDeptcd() + "]");
		System.out.println("teamcd = [" + getTeamcd() + "]");
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("flag = [" + getFlag() + "]");
		System.out.println("extn_rdrnm = [" + getExtn_rdrnm() + "]");
		System.out.println("extn_rshpclsf = [" + getExtn_rshpclsf() + "]");
		System.out.println("extn_tel1 = [" + getExtn_tel1() + "]");
		System.out.println("extn_tel2 = [" + getExtn_tel2() + "]");
		System.out.println("extn_tel3 = [" + getExtn_tel3() + "]");
		System.out.println("extn_ptph1 = [" + getExtn_ptph1() + "]");
		System.out.println("extn_ptph2 = [" + getExtn_ptph2() + "]");
		System.out.println("extn_ptph3 = [" + getExtn_ptph3() + "]");
		System.out.println("extn_email = [" + getExtn_email() + "]");
		System.out.println("extn_dlvzip = [" + getExtn_dlvzip() + "]");
		System.out.println("extn_dlvaddr = [" + getExtn_dlvaddr() + "]");
		System.out.println("extn_dlvaddrdtls = [" + getExtn_dlvaddrdtls() + "]");
		System.out.println("extn_bocd = [" + getExtn_bocd() + "]");
		System.out.println("extn_bonm = [" + getExtn_bonm() + "]");
		System.out.println("extn_resiclsf = [" + getExtn_resiclsf() + "]");
		System.out.println("extn_resitype = [" + getExtn_resitype() + "]");
		System.out.println("extn_dlvhope = [" + getExtn_dlvhope() + "]");
		System.out.println("extn_remk = [" + getExtn_remk() + "]");
		System.out.println("extn_qty = [" + getExtn_qty() + "]");
		System.out.println("bldmngnn = [" + getBldmngnn() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cpnno = req.getParameter("cpnno");
if( cpnno == null){
	System.out.println(this.toString+" : cpnno is null" );
}else{
	System.out.println(this.toString+" : cpnno is "+cpnno );
}
String cpntypecd = req.getParameter("cpntypecd");
if( cpntypecd == null){
	System.out.println(this.toString+" : cpntypecd is null" );
}else{
	System.out.println(this.toString+" : cpntypecd is "+cpntypecd );
}
String freemm = req.getParameter("freemm");
if( freemm == null){
	System.out.println(this.toString+" : freemm is null" );
}else{
	System.out.println(this.toString+" : freemm is "+freemm );
}
String extnfee = req.getParameter("extnfee");
if( extnfee == null){
	System.out.println(this.toString+" : extnfee is null" );
}else{
	System.out.println(this.toString+" : extnfee is "+extnfee );
}
String issudt = req.getParameter("issudt");
if( issudt == null){
	System.out.println(this.toString+" : issudt is null" );
}else{
	System.out.println(this.toString+" : issudt is "+issudt );
}
String seldt = req.getParameter("seldt");
if( seldt == null){
	System.out.println(this.toString+" : seldt is null" );
}else{
	System.out.println(this.toString+" : seldt is "+seldt );
}
String expdt = req.getParameter("expdt");
if( expdt == null){
	System.out.println(this.toString+" : expdt is null" );
}else{
	System.out.println(this.toString+" : expdt is "+expdt );
}
String usedt = req.getParameter("usedt");
if( usedt == null){
	System.out.println(this.toString+" : usedt is null" );
}else{
	System.out.println(this.toString+" : usedt is "+usedt );
}
String empno = req.getParameter("empno");
if( empno == null){
	System.out.println(this.toString+" : empno is null" );
}else{
	System.out.println(this.toString+" : empno is "+empno );
}
String cmpynm = req.getParameter("cmpynm");
if( cmpynm == null){
	System.out.println(this.toString+" : cmpynm is null" );
}else{
	System.out.println(this.toString+" : cmpynm is "+cmpynm );
}
String deptnm = req.getParameter("deptnm");
if( deptnm == null){
	System.out.println(this.toString+" : deptnm is null" );
}else{
	System.out.println(this.toString+" : deptnm is "+deptnm );
}
String teamnm = req.getParameter("teamnm");
if( teamnm == null){
	System.out.println(this.toString+" : teamnm is null" );
}else{
	System.out.println(this.toString+" : teamnm is "+teamnm );
}
String empnm = req.getParameter("empnm");
if( empnm == null){
	System.out.println(this.toString+" : empnm is null" );
}else{
	System.out.println(this.toString+" : empnm is "+empnm );
}
String emp_telno = req.getParameter("emp_telno");
if( emp_telno == null){
	System.out.println(this.toString+" : emp_telno is null" );
}else{
	System.out.println(this.toString+" : emp_telno is "+emp_telno );
}
String shftcd = req.getParameter("shftcd");
if( shftcd == null){
	System.out.println(this.toString+" : shftcd is null" );
}else{
	System.out.println(this.toString+" : shftcd is "+shftcd );
}
String shftamt = req.getParameter("shftamt");
if( shftamt == null){
	System.out.println(this.toString+" : shftamt is null" );
}else{
	System.out.println(this.toString+" : shftamt is "+shftamt );
}
String shftdt = req.getParameter("shftdt");
if( shftdt == null){
	System.out.println(this.toString+" : shftdt is null" );
}else{
	System.out.println(this.toString+" : shftdt is "+shftdt );
}
String shftnm = req.getParameter("shftnm");
if( shftnm == null){
	System.out.println(this.toString+" : shftnm is null" );
}else{
	System.out.println(this.toString+" : shftnm is "+shftnm );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String bo_telno = req.getParameter("bo_telno");
if( bo_telno == null){
	System.out.println(this.toString+" : bo_telno is null" );
}else{
	System.out.println(this.toString+" : bo_telno is "+bo_telno );
}
String banknm = req.getParameter("banknm");
if( banknm == null){
	System.out.println(this.toString+" : banknm is null" );
}else{
	System.out.println(this.toString+" : banknm is "+banknm );
}
String acctno = req.getParameter("acctno");
if( acctno == null){
	System.out.println(this.toString+" : acctno is null" );
}else{
	System.out.println(this.toString+" : acctno is "+acctno );
}
String deps_persnm = req.getParameter("deps_persnm");
if( deps_persnm == null){
	System.out.println(this.toString+" : deps_persnm is null" );
}else{
	System.out.println(this.toString+" : deps_persnm is "+deps_persnm );
}
String sendyn = req.getParameter("sendyn");
if( sendyn == null){
	System.out.println(this.toString+" : sendyn is null" );
}else{
	System.out.println(this.toString+" : sendyn is "+sendyn );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String subscnfm = req.getParameter("subscnfm");
if( subscnfm == null){
	System.out.println(this.toString+" : subscnfm is null" );
}else{
	System.out.println(this.toString+" : subscnfm is "+subscnfm );
}
String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
	System.out.println(this.toString+" : rdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
	System.out.println(this.toString+" : rdr_extnno is null" );
}else{
	System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
}
String subsfr_dt = req.getParameter("subsfr_dt");
if( subsfr_dt == null){
	System.out.println(this.toString+" : subsfr_dt is null" );
}else{
	System.out.println(this.toString+" : subsfr_dt is "+subsfr_dt );
}
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String teamcd = req.getParameter("teamcd");
if( teamcd == null){
	System.out.println(this.toString+" : teamcd is null" );
}else{
	System.out.println(this.toString+" : teamcd is "+teamcd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String flag = req.getParameter("flag");
if( flag == null){
	System.out.println(this.toString+" : flag is null" );
}else{
	System.out.println(this.toString+" : flag is "+flag );
}
String extn_rdrnm = req.getParameter("extn_rdrnm");
if( extn_rdrnm == null){
	System.out.println(this.toString+" : extn_rdrnm is null" );
}else{
	System.out.println(this.toString+" : extn_rdrnm is "+extn_rdrnm );
}
String extn_rshpclsf = req.getParameter("extn_rshpclsf");
if( extn_rshpclsf == null){
	System.out.println(this.toString+" : extn_rshpclsf is null" );
}else{
	System.out.println(this.toString+" : extn_rshpclsf is "+extn_rshpclsf );
}
String extn_tel1 = req.getParameter("extn_tel1");
if( extn_tel1 == null){
	System.out.println(this.toString+" : extn_tel1 is null" );
}else{
	System.out.println(this.toString+" : extn_tel1 is "+extn_tel1 );
}
String extn_tel2 = req.getParameter("extn_tel2");
if( extn_tel2 == null){
	System.out.println(this.toString+" : extn_tel2 is null" );
}else{
	System.out.println(this.toString+" : extn_tel2 is "+extn_tel2 );
}
String extn_tel3 = req.getParameter("extn_tel3");
if( extn_tel3 == null){
	System.out.println(this.toString+" : extn_tel3 is null" );
}else{
	System.out.println(this.toString+" : extn_tel3 is "+extn_tel3 );
}
String extn_ptph1 = req.getParameter("extn_ptph1");
if( extn_ptph1 == null){
	System.out.println(this.toString+" : extn_ptph1 is null" );
}else{
	System.out.println(this.toString+" : extn_ptph1 is "+extn_ptph1 );
}
String extn_ptph2 = req.getParameter("extn_ptph2");
if( extn_ptph2 == null){
	System.out.println(this.toString+" : extn_ptph2 is null" );
}else{
	System.out.println(this.toString+" : extn_ptph2 is "+extn_ptph2 );
}
String extn_ptph3 = req.getParameter("extn_ptph3");
if( extn_ptph3 == null){
	System.out.println(this.toString+" : extn_ptph3 is null" );
}else{
	System.out.println(this.toString+" : extn_ptph3 is "+extn_ptph3 );
}
String extn_email = req.getParameter("extn_email");
if( extn_email == null){
	System.out.println(this.toString+" : extn_email is null" );
}else{
	System.out.println(this.toString+" : extn_email is "+extn_email );
}
String extn_dlvzip = req.getParameter("extn_dlvzip");
if( extn_dlvzip == null){
	System.out.println(this.toString+" : extn_dlvzip is null" );
}else{
	System.out.println(this.toString+" : extn_dlvzip is "+extn_dlvzip );
}
String extn_dlvaddr = req.getParameter("extn_dlvaddr");
if( extn_dlvaddr == null){
	System.out.println(this.toString+" : extn_dlvaddr is null" );
}else{
	System.out.println(this.toString+" : extn_dlvaddr is "+extn_dlvaddr );
}
String extn_dlvaddrdtls = req.getParameter("extn_dlvaddrdtls");
if( extn_dlvaddrdtls == null){
	System.out.println(this.toString+" : extn_dlvaddrdtls is null" );
}else{
	System.out.println(this.toString+" : extn_dlvaddrdtls is "+extn_dlvaddrdtls );
}
String extn_bocd = req.getParameter("extn_bocd");
if( extn_bocd == null){
	System.out.println(this.toString+" : extn_bocd is null" );
}else{
	System.out.println(this.toString+" : extn_bocd is "+extn_bocd );
}
String extn_bonm = req.getParameter("extn_bonm");
if( extn_bonm == null){
	System.out.println(this.toString+" : extn_bonm is null" );
}else{
	System.out.println(this.toString+" : extn_bonm is "+extn_bonm );
}
String extn_resiclsf = req.getParameter("extn_resiclsf");
if( extn_resiclsf == null){
	System.out.println(this.toString+" : extn_resiclsf is null" );
}else{
	System.out.println(this.toString+" : extn_resiclsf is "+extn_resiclsf );
}
String extn_resitype = req.getParameter("extn_resitype");
if( extn_resitype == null){
	System.out.println(this.toString+" : extn_resitype is null" );
}else{
	System.out.println(this.toString+" : extn_resitype is "+extn_resitype );
}
String extn_dlvhope = req.getParameter("extn_dlvhope");
if( extn_dlvhope == null){
	System.out.println(this.toString+" : extn_dlvhope is null" );
}else{
	System.out.println(this.toString+" : extn_dlvhope is "+extn_dlvhope );
}
String extn_remk = req.getParameter("extn_remk");
if( extn_remk == null){
	System.out.println(this.toString+" : extn_remk is null" );
}else{
	System.out.println(this.toString+" : extn_remk is "+extn_remk );
}
String extn_qty = req.getParameter("extn_qty");
if( extn_qty == null){
	System.out.println(this.toString+" : extn_qty is null" );
}else{
	System.out.println(this.toString+" : extn_qty is "+extn_qty );
}
String bldmngnn = req.getParameter("bldmngnn");
if( bldmngnn == null){
	System.out.println(this.toString+" : bldmngnn is null" );
}else{
	System.out.println(this.toString+" : bldmngnn is "+bldmngnn );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cpnno = Util.checkString(req.getParameter("cpnno"));
String cpntypecd = Util.checkString(req.getParameter("cpntypecd"));
String freemm = Util.checkString(req.getParameter("freemm"));
String extnfee = Util.checkString(req.getParameter("extnfee"));
String issudt = Util.checkString(req.getParameter("issudt"));
String seldt = Util.checkString(req.getParameter("seldt"));
String expdt = Util.checkString(req.getParameter("expdt"));
String usedt = Util.checkString(req.getParameter("usedt"));
String empno = Util.checkString(req.getParameter("empno"));
String cmpynm = Util.checkString(req.getParameter("cmpynm"));
String deptnm = Util.checkString(req.getParameter("deptnm"));
String teamnm = Util.checkString(req.getParameter("teamnm"));
String empnm = Util.checkString(req.getParameter("empnm"));
String emp_telno = Util.checkString(req.getParameter("emp_telno"));
String shftcd = Util.checkString(req.getParameter("shftcd"));
String shftamt = Util.checkString(req.getParameter("shftamt"));
String shftdt = Util.checkString(req.getParameter("shftdt"));
String shftnm = Util.checkString(req.getParameter("shftnm"));
String remk = Util.checkString(req.getParameter("remk"));
String bocd = Util.checkString(req.getParameter("bocd"));
String bo_telno = Util.checkString(req.getParameter("bo_telno"));
String banknm = Util.checkString(req.getParameter("banknm"));
String acctno = Util.checkString(req.getParameter("acctno"));
String deps_persnm = Util.checkString(req.getParameter("deps_persnm"));
String sendyn = Util.checkString(req.getParameter("sendyn"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String subscnfm = Util.checkString(req.getParameter("subscnfm"));
String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String subsfr_dt = Util.checkString(req.getParameter("subsfr_dt"));
String valmm = Util.checkString(req.getParameter("valmm"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String teamcd = Util.checkString(req.getParameter("teamcd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String flag = Util.checkString(req.getParameter("flag"));
String extn_rdrnm = Util.checkString(req.getParameter("extn_rdrnm"));
String extn_rshpclsf = Util.checkString(req.getParameter("extn_rshpclsf"));
String extn_tel1 = Util.checkString(req.getParameter("extn_tel1"));
String extn_tel2 = Util.checkString(req.getParameter("extn_tel2"));
String extn_tel3 = Util.checkString(req.getParameter("extn_tel3"));
String extn_ptph1 = Util.checkString(req.getParameter("extn_ptph1"));
String extn_ptph2 = Util.checkString(req.getParameter("extn_ptph2"));
String extn_ptph3 = Util.checkString(req.getParameter("extn_ptph3"));
String extn_email = Util.checkString(req.getParameter("extn_email"));
String extn_dlvzip = Util.checkString(req.getParameter("extn_dlvzip"));
String extn_dlvaddr = Util.checkString(req.getParameter("extn_dlvaddr"));
String extn_dlvaddrdtls = Util.checkString(req.getParameter("extn_dlvaddrdtls"));
String extn_bocd = Util.checkString(req.getParameter("extn_bocd"));
String extn_bonm = Util.checkString(req.getParameter("extn_bonm"));
String extn_resiclsf = Util.checkString(req.getParameter("extn_resiclsf"));
String extn_resitype = Util.checkString(req.getParameter("extn_resitype"));
String extn_dlvhope = Util.checkString(req.getParameter("extn_dlvhope"));
String extn_remk = Util.checkString(req.getParameter("extn_remk"));
String extn_qty = Util.checkString(req.getParameter("extn_qty"));
String bldmngnn = Util.checkString(req.getParameter("bldmngnn"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cpnno = Util.Uni2Ksc(Util.checkString(req.getParameter("cpnno")));
String cpntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("cpntypecd")));
String freemm = Util.Uni2Ksc(Util.checkString(req.getParameter("freemm")));
String extnfee = Util.Uni2Ksc(Util.checkString(req.getParameter("extnfee")));
String issudt = Util.Uni2Ksc(Util.checkString(req.getParameter("issudt")));
String seldt = Util.Uni2Ksc(Util.checkString(req.getParameter("seldt")));
String expdt = Util.Uni2Ksc(Util.checkString(req.getParameter("expdt")));
String usedt = Util.Uni2Ksc(Util.checkString(req.getParameter("usedt")));
String empno = Util.Uni2Ksc(Util.checkString(req.getParameter("empno")));
String cmpynm = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpynm")));
String deptnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deptnm")));
String teamnm = Util.Uni2Ksc(Util.checkString(req.getParameter("teamnm")));
String empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empnm")));
String emp_telno = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_telno")));
String shftcd = Util.Uni2Ksc(Util.checkString(req.getParameter("shftcd")));
String shftamt = Util.Uni2Ksc(Util.checkString(req.getParameter("shftamt")));
String shftdt = Util.Uni2Ksc(Util.checkString(req.getParameter("shftdt")));
String shftnm = Util.Uni2Ksc(Util.checkString(req.getParameter("shftnm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String bo_telno = Util.Uni2Ksc(Util.checkString(req.getParameter("bo_telno")));
String banknm = Util.Uni2Ksc(Util.checkString(req.getParameter("banknm")));
String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
String deps_persnm = Util.Uni2Ksc(Util.checkString(req.getParameter("deps_persnm")));
String sendyn = Util.Uni2Ksc(Util.checkString(req.getParameter("sendyn")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String subscnfm = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfm")));
String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String subsfr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("subsfr_dt")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String teamcd = Util.Uni2Ksc(Util.checkString(req.getParameter("teamcd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String flag = Util.Uni2Ksc(Util.checkString(req.getParameter("flag")));
String extn_rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_rdrnm")));
String extn_rshpclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_rshpclsf")));
String extn_tel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_tel1")));
String extn_tel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_tel2")));
String extn_tel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_tel3")));
String extn_ptph1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_ptph1")));
String extn_ptph2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_ptph2")));
String extn_ptph3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_ptph3")));
String extn_email = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_email")));
String extn_dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_dlvzip")));
String extn_dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_dlvaddr")));
String extn_dlvaddrdtls = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_dlvaddrdtls")));
String extn_bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_bocd")));
String extn_bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_bonm")));
String extn_resiclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_resiclsf")));
String extn_resitype = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_resitype")));
String extn_dlvhope = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_dlvhope")));
String extn_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_remk")));
String extn_qty = Util.Uni2Ksc(Util.checkString(req.getParameter("extn_qty")));
String bldmngnn = Util.Uni2Ksc(Util.checkString(req.getParameter("bldmngnn")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCpnno(cpnno);
dm.setCpntypecd(cpntypecd);
dm.setFreemm(freemm);
dm.setExtnfee(extnfee);
dm.setIssudt(issudt);
dm.setSeldt(seldt);
dm.setExpdt(expdt);
dm.setUsedt(usedt);
dm.setEmpno(empno);
dm.setCmpynm(cmpynm);
dm.setDeptnm(deptnm);
dm.setTeamnm(teamnm);
dm.setEmpnm(empnm);
dm.setEmp_telno(emp_telno);
dm.setShftcd(shftcd);
dm.setShftamt(shftamt);
dm.setShftdt(shftdt);
dm.setShftnm(shftnm);
dm.setRemk(remk);
dm.setBocd(bocd);
dm.setBo_telno(bo_telno);
dm.setBanknm(banknm);
dm.setAcctno(acctno);
dm.setDeps_persnm(deps_persnm);
dm.setSendyn(sendyn);
dm.setRdr_no(rdr_no);
dm.setRdrnm(rdrnm);
dm.setSubscnfm(subscnfm);
dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setSubsfr_dt(subsfr_dt);
dm.setValmm(valmm);
dm.setCmpycd(cmpycd);
dm.setDeptcd(deptcd);
dm.setTeamcd(teamcd);
dm.setIncmgpers(incmgpers);
dm.setFlag(flag);
dm.setExtn_rdrnm(extn_rdrnm);
dm.setExtn_rshpclsf(extn_rshpclsf);
dm.setExtn_tel1(extn_tel1);
dm.setExtn_tel2(extn_tel2);
dm.setExtn_tel3(extn_tel3);
dm.setExtn_ptph1(extn_ptph1);
dm.setExtn_ptph2(extn_ptph2);
dm.setExtn_ptph3(extn_ptph3);
dm.setExtn_email(extn_email);
dm.setExtn_dlvzip(extn_dlvzip);
dm.setExtn_dlvaddr(extn_dlvaddr);
dm.setExtn_dlvaddrdtls(extn_dlvaddrdtls);
dm.setExtn_bocd(extn_bocd);
dm.setExtn_bonm(extn_bonm);
dm.setExtn_resiclsf(extn_resiclsf);
dm.setExtn_resitype(extn_resitype);
dm.setExtn_dlvhope(extn_dlvhope);
dm.setExtn_remk(extn_remk);
dm.setExtn_qty(extn_qty);
dm.setBldmngnn(bldmngnn);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 28 17:54:19 KST 2015 */