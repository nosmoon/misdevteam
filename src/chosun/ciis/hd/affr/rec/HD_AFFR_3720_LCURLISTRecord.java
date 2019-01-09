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


package chosun.ciis.hd.affr.rec;

import java.sql.*;
import chosun.ciis.hd.affr.dm.*;
import chosun.ciis.hd.affr.ds.*;

/**
 * 
 */


public class HD_AFFR_3720_LCURLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String cmpy_cd;
	public String emp_no;
	public String occr_dt;
	public String seq;
	public String aply_yy;
	public String aply_no;
	public String flnm;
	public String prn;
	public String aplc_dt;
	public String cmpy_insr_cd;
	public String pay_cd;
	public String pay_dt;
	public String pay_amt;
	public String acpn_dt;
	public String remk;
	public String org_cd;
	public String dept_cd;
	public String dept_nm;
	public String posi_cd;
	public String posi_nm;
	public String patyinsr_yn;

	public HD_AFFR_3720_LCURLISTRecord(){}

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

	public void setAply_yy(String aply_yy){
		this.aply_yy = aply_yy;
	}

	public void setAply_no(String aply_no){
		this.aply_no = aply_no;
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

	public void setOrg_cd(String org_cd){
		this.org_cd = org_cd;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPosi_cd(String posi_cd){
		this.posi_cd = posi_cd;
	}

	public void setPosi_nm(String posi_nm){
		this.posi_nm = posi_nm;
	}

	public void setPatyinsr_yn(String patyinsr_yn){
		this.patyinsr_yn = patyinsr_yn;
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

	public String getAply_yy(){
		return this.aply_yy;
	}

	public String getAply_no(){
		return this.aply_no;
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

	public String getOrg_cd(){
		return this.org_cd;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPosi_cd(){
		return this.posi_cd;
	}

	public String getPosi_nm(){
		return this.posi_nm;
	}

	public String getPatyinsr_yn(){
		return this.patyinsr_yn;
	}
}

/* 작성시간 : Fri Jul 24 16:51:27 KST 2015 */