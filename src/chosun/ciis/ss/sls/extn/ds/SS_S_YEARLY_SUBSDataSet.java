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


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_S_YEARLY_SUBSDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String cpnno;
	public String cpntypecd;
	public String freemm;
	public long extnfee;
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
	public long shftamt;
	public String shftdt;
	public String shftnm;
	public String bocd;
	public String bonm;
	public String bo_telno;
	public String banknm;
	public String acctno;
	public String deps_persnm;
	public String remk;
	public String sendyn;
	public String rdr_no;
	public String rdrnm;
	public String subscnfm;
	public String bo_headyn;
	public String rdr_extndt;
	public String rdr_extnno;
	public String subsfr_dt;
	public String valmm;
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
	public long extn_qty;
	public String bldmngnn;
	public String extn_rd_dlvaddr;
	public String extn_jb_dlvaddr;
	public String extn_dlvbnji;

	public SS_S_YEARLY_SUBSDataSet(){}
	public SS_S_YEARLY_SUBSDataSet(String errcode, String errmsg, String cpnno, String cpntypecd, String freemm, long extnfee, String issudt, String seldt, String expdt, String usedt, String empno, String cmpynm, String deptnm, String teamnm, String empnm, String emp_telno, String shftcd, long shftamt, String shftdt, String shftnm, String bocd, String bonm, String bo_telno, String banknm, String acctno, String deps_persnm, String remk, String sendyn, String rdr_no, String rdrnm, String subscnfm, String bo_headyn, String rdr_extndt, String rdr_extnno, String subsfr_dt, String valmm, String extn_rdrnm, String extn_rshpclsf, String extn_tel1, String extn_tel2, String extn_tel3, String extn_ptph1, String extn_ptph2, String extn_ptph3, String extn_email, String extn_dlvzip, String extn_dlvaddr, String extn_dlvaddrdtls, String extn_bocd, String extn_bonm, String extn_resiclsf, String extn_resitype, String extn_dlvhope, String extn_remk, long extn_qty, String bldmngnn, String extn_rd_dlvaddr, String extn_jb_dlvaddr, String extn_dlvbnji){
		this.errcode = errcode;
		this.errmsg = errmsg;
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
		this.bocd = bocd;
		this.bonm = bonm;
		this.bo_telno = bo_telno;
		this.banknm = banknm;
		this.acctno = acctno;
		this.deps_persnm = deps_persnm;
		this.remk = remk;
		this.sendyn = sendyn;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.subscnfm = subscnfm;
		this.bo_headyn = bo_headyn;
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.subsfr_dt = subsfr_dt;
		this.valmm = valmm;
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
		this.extn_rd_dlvaddr = extn_rd_dlvaddr;
		this.extn_jb_dlvaddr = extn_jb_dlvaddr;
		this.extn_dlvbnji = extn_dlvbnji;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
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

	public void setExtnfee(long extnfee){
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

	public void setShftamt(long shftamt){
		this.shftamt = shftamt;
	}

	public void setShftdt(String shftdt){
		this.shftdt = shftdt;
	}

	public void setShftnm(String shftnm){
		this.shftnm = shftnm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
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

	public void setRemk(String remk){
		this.remk = remk;
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

	public void setBo_headyn(String bo_headyn){
		this.bo_headyn = bo_headyn;
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

	public void setExtn_qty(long extn_qty){
		this.extn_qty = extn_qty;
	}

	public void setBldmngnn(String bldmngnn){
		this.bldmngnn = bldmngnn;
	}

	public void setExtn_rd_dlvaddr(String extn_rd_dlvaddr){
		this.extn_rd_dlvaddr = extn_rd_dlvaddr;
	}

	public void setExtn_jb_dlvaddr(String extn_jb_dlvaddr){
		this.extn_jb_dlvaddr = extn_jb_dlvaddr;
	}

	public void setExtn_dlvbnji(String extn_dlvbnji){
		this.extn_dlvbnji = extn_dlvbnji;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
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

	public long getExtnfee(){
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

	public long getShftamt(){
		return this.shftamt;
	}

	public String getShftdt(){
		return this.shftdt;
	}

	public String getShftnm(){
		return this.shftnm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
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

	public String getRemk(){
		return this.remk;
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

	public String getBo_headyn(){
		return this.bo_headyn;
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

	public long getExtn_qty(){
		return this.extn_qty;
	}

	public String getBldmngnn(){
		return this.bldmngnn;
	}

	public String getExtn_rd_dlvaddr(){
		return this.extn_rd_dlvaddr;
	}

	public String getExtn_jb_dlvaddr(){
		return this.extn_jb_dlvaddr;
	}

	public String getExtn_dlvbnji(){
		return this.extn_dlvbnji;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.cpnno = Util.checkString(cstmt.getString(4));
		this.cpntypecd = Util.checkString(cstmt.getString(5));
		this.freemm = Util.checkString(cstmt.getString(6));
		this.extnfee = cstmt.getLong(7);
		this.issudt = Util.checkString(cstmt.getString(8));
		this.seldt = Util.checkString(cstmt.getString(9));
		this.expdt = Util.checkString(cstmt.getString(10));
		this.usedt = Util.checkString(cstmt.getString(11));
		this.empno = Util.checkString(cstmt.getString(12));
		this.cmpynm = Util.checkString(cstmt.getString(13));
		this.deptnm = Util.checkString(cstmt.getString(14));
		this.teamnm = Util.checkString(cstmt.getString(15));
		this.empnm = Util.checkString(cstmt.getString(16));
		this.emp_telno = Util.checkString(cstmt.getString(17));
		this.shftcd = Util.checkString(cstmt.getString(18));
		this.shftamt = cstmt.getLong(19);
		this.shftdt = Util.checkString(cstmt.getString(20));
		this.shftnm = Util.checkString(cstmt.getString(21));
		this.bocd = Util.checkString(cstmt.getString(22));
		this.bonm = Util.checkString(cstmt.getString(23));
		this.bo_telno = Util.checkString(cstmt.getString(24));
		this.banknm = Util.checkString(cstmt.getString(25));
		this.acctno = Util.checkString(cstmt.getString(26));
		this.deps_persnm = Util.checkString(cstmt.getString(27));
		this.remk = Util.checkString(cstmt.getString(28));
		this.sendyn = Util.checkString(cstmt.getString(29));
		this.rdr_no = Util.checkString(cstmt.getString(30));
		this.rdrnm = Util.checkString(cstmt.getString(31));
		this.subscnfm = Util.checkString(cstmt.getString(32));
		this.bo_headyn = Util.checkString(cstmt.getString(33));
		this.rdr_extndt = Util.checkString(cstmt.getString(34));
		this.rdr_extnno = Util.checkString(cstmt.getString(35));
		this.subsfr_dt = Util.checkString(cstmt.getString(36));
		this.valmm = Util.checkString(cstmt.getString(37));
		this.extn_rdrnm = Util.checkString(cstmt.getString(38));
		this.extn_rshpclsf = Util.checkString(cstmt.getString(39));
		this.extn_tel1 = Util.checkString(cstmt.getString(40));
		this.extn_tel2 = Util.checkString(cstmt.getString(41));
		this.extn_tel3 = Util.checkString(cstmt.getString(42));
		this.extn_ptph1 = Util.checkString(cstmt.getString(43));
		this.extn_ptph2 = Util.checkString(cstmt.getString(44));
		this.extn_ptph3 = Util.checkString(cstmt.getString(45));
		this.extn_email = Util.checkString(cstmt.getString(46));
		this.extn_dlvzip = Util.checkString(cstmt.getString(47));
		this.extn_dlvaddr = Util.checkString(cstmt.getString(48));
		this.extn_dlvaddrdtls = Util.checkString(cstmt.getString(49));
		this.extn_bocd = Util.checkString(cstmt.getString(50));
		this.extn_bonm = Util.checkString(cstmt.getString(51));
		this.extn_resiclsf = Util.checkString(cstmt.getString(52));
		this.extn_resitype = Util.checkString(cstmt.getString(53));
		this.extn_dlvhope = Util.checkString(cstmt.getString(54));
		this.extn_remk = Util.checkString(cstmt.getString(55));
		this.extn_qty = cstmt.getLong(56);
		this.bldmngnn = Util.checkString(cstmt.getString(57));
		this.extn_rd_dlvaddr = Util.checkString(cstmt.getString(58));
		this.extn_jb_dlvaddr = Util.checkString(cstmt.getString(59));
		this.extn_dlvbnji = Util.checkString(cstmt.getString(60));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_YEARLY_SUBSDataSet ds = (SS_S_YEARLY_SUBSDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCpnno()%>
<%= ds.getCpntypecd()%>
<%= ds.getFreemm()%>
<%= ds.getExtnfee()%>
<%= ds.getIssudt()%>
<%= ds.getSeldt()%>
<%= ds.getExpdt()%>
<%= ds.getUsedt()%>
<%= ds.getEmpno()%>
<%= ds.getCmpynm()%>
<%= ds.getDeptnm()%>
<%= ds.getTeamnm()%>
<%= ds.getEmpnm()%>
<%= ds.getEmp_telno()%>
<%= ds.getShftcd()%>
<%= ds.getShftamt()%>
<%= ds.getShftdt()%>
<%= ds.getShftnm()%>
<%= ds.getBocd()%>
<%= ds.getBonm()%>
<%= ds.getBo_telno()%>
<%= ds.getBanknm()%>
<%= ds.getAcctno()%>
<%= ds.getDeps_persnm()%>
<%= ds.getRemk()%>
<%= ds.getSendyn()%>
<%= ds.getRdr_no()%>
<%= ds.getRdrnm()%>
<%= ds.getSubscnfm()%>
<%= ds.getBo_headyn()%>
<%= ds.getRdr_extndt()%>
<%= ds.getRdr_extnno()%>
<%= ds.getSubsfr_dt()%>
<%= ds.getValmm()%>
<%= ds.getExtn_rdrnm()%>
<%= ds.getExtn_rshpclsf()%>
<%= ds.getExtn_tel1()%>
<%= ds.getExtn_tel2()%>
<%= ds.getExtn_tel3()%>
<%= ds.getExtn_ptph1()%>
<%= ds.getExtn_ptph2()%>
<%= ds.getExtn_ptph3()%>
<%= ds.getExtn_email()%>
<%= ds.getExtn_dlvzip()%>
<%= ds.getExtn_dlvaddr()%>
<%= ds.getExtn_dlvaddrdtls()%>
<%= ds.getExtn_bocd()%>
<%= ds.getExtn_bonm()%>
<%= ds.getExtn_resiclsf()%>
<%= ds.getExtn_resitype()%>
<%= ds.getExtn_dlvhope()%>
<%= ds.getExtn_remk()%>
<%= ds.getExtn_qty()%>
<%= ds.getBldmngnn()%>
<%= ds.getExtn_rd_dlvaddr()%>
<%= ds.getExtn_jb_dlvaddr()%>
<%= ds.getExtn_dlvbnji()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 28 17:43:49 KST 2015 */