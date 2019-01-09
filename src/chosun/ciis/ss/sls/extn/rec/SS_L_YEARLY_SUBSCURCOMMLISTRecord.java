/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 
 */


public class SS_L_YEARLY_SUBSCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String seldt;
	public String empnm;
	public String empno;
	public String cmpynm;
	public String deptnm;
	public String teamnm;
	public String emp_telno;
	public String cpnno;
	public int cpntypecd;
	public String freemm;
	public int extnfee;
	public String expdt;
	public String shftdt;
	public String shftcd;
	public String shftnm;
	public int shftamt;
	public String shftyn;
	public String bonm;
	public String banknm;
	public String acctno;
	public String deps_persnm;
	public String sendyn;
	public String rdrnm;
	public String rdrtel_no;
	public String dlvaddr;
	public String dlvhopedt;
	public String remk;
	public String extnbonm;
	public String extnbo_tel;
	public String bo_headyn;
	public String subscnfm;

	public SS_L_YEARLY_SUBSCURCOMMLISTRecord(){}

	public void setSeldt(String seldt){
		this.seldt = seldt;
	}

	public void setEmpnm(String empnm){
		this.empnm = empnm;
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

	public void setEmp_telno(String emp_telno){
		this.emp_telno = emp_telno;
	}

	public void setCpnno(String cpnno){
		this.cpnno = cpnno;
	}

	public void setCpntypecd(int cpntypecd){
		this.cpntypecd = cpntypecd;
	}

	public void setFreemm(String freemm){
		this.freemm = freemm;
	}

	public void setExtnfee(int extnfee){
		this.extnfee = extnfee;
	}

	public void setExpdt(String expdt){
		this.expdt = expdt;
	}

	public void setShftdt(String shftdt){
		this.shftdt = shftdt;
	}

	public void setShftcd(String shftcd){
		this.shftcd = shftcd;
	}

	public void setShftnm(String shftnm){
		this.shftnm = shftnm;
	}

	public void setShftamt(int shftamt){
		this.shftamt = shftamt;
	}

	public void setShftyn(String shftyn){
		this.shftyn = shftyn;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
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

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setExtnbonm(String extnbonm){
		this.extnbonm = extnbonm;
	}

	public void setExtnbo_tel(String extnbo_tel){
		this.extnbo_tel = extnbo_tel;
	}

	public void setBo_headyn(String bo_headyn){
		this.bo_headyn = bo_headyn;
	}

	public void setSubscnfm(String subscnfm){
		this.subscnfm = subscnfm;
	}

	public String getSeldt(){
		return this.seldt;
	}

	public String getEmpnm(){
		return this.empnm;
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

	public String getEmp_telno(){
		return this.emp_telno;
	}

	public String getCpnno(){
		return this.cpnno;
	}

	public int getCpntypecd(){
		return this.cpntypecd;
	}

	public String getFreemm(){
		return this.freemm;
	}

	public int getExtnfee(){
		return this.extnfee;
	}

	public String getExpdt(){
		return this.expdt;
	}

	public String getShftdt(){
		return this.shftdt;
	}

	public String getShftcd(){
		return this.shftcd;
	}

	public String getShftnm(){
		return this.shftnm;
	}

	public int getShftamt(){
		return this.shftamt;
	}

	public String getShftyn(){
		return this.shftyn;
	}

	public String getBonm(){
		return this.bonm;
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

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrtel_no(){
		return this.rdrtel_no;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getExtnbonm(){
		return this.extnbonm;
	}

	public String getExtnbo_tel(){
		return this.extnbo_tel;
	}

	public String getBo_headyn(){
		return this.bo_headyn;
	}

	public String getSubscnfm(){
		return this.subscnfm;
	}
}

/* 작성시간 : Tue Jan 29 02:11:26 GMT 2013 */