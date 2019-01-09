/***************************************************************************************************
* 파일명 : PS_L_DSCT_CATL.java
* 기능   :  불편접수 - 조회리스트 
* 작성일자 : 2003-12-27
* 작성자 : 김건호
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.support.dm.*;
import chosun.ciis.ps.pbs.support.ds.*;

/**
 * 불편접수 - 조회 리스트
 *
 */

public class PS_L_DSCT_CATLCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String dscttypecd;
	public String acpndt;
	public String acpnpathcd;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String rdrnm;
	public String rdr_no;
	public String tel_no;
	public String ptph_no;
	public String rdremail;
	public String dlvzip;
	public String addr;
	public String medicd;
	public String medinm;
	public String termsubsno;
	public String titl;
	public String cont;
	public String bocnfmdt;
	public String bocnfmyn;
	public String boprocdt;
	public String boprocyn;
	public String boproccont;
	public String cns_empnm;
	public String cns_empid;
	public String proccont;
	public String procpers;
	public String aplcdt;
	public String delidt;
	public String sendmthd;
	public String sendmthdnm;
	public String sendyncd;
	public String mang_emp_nm;
	public String memo;
	public String subsfrser_no;
	public String substoser_no;

	public PS_L_DSCT_CATLCURCOMMLISTRecord(){}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setDscttypecd(String dscttypecd){
		this.dscttypecd = dscttypecd;
	}

	public void setAcpndt(String acpndt){
		this.acpndt = acpndt;
	}

	public void setAcpnpathcd(String acpnpathcd){
		this.acpnpathcd = acpnpathcd;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setPtph_no(String ptph_no){
		this.ptph_no = ptph_no;
	}

	public void setRdremail(String rdremail){
		this.rdremail = rdremail;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setBocnfmdt(String bocnfmdt){
		this.bocnfmdt = bocnfmdt;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setBoprocdt(String boprocdt){
		this.boprocdt = boprocdt;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setBoproccont(String boproccont){
		this.boproccont = boproccont;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setCns_empid(String cns_empid){
		this.cns_empid = cns_empid;
	}

	public void setProccont(String proccont){
		this.proccont = proccont;
	}

	public void setProcpers(String procpers){
		this.procpers = procpers;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setDelidt(String delidt){
		this.delidt = delidt;
	}

	public void setSendmthd(String sendmthd){
		this.sendmthd = sendmthd;
	}

	public void setSendmthdnm(String sendmthdnm){
		this.sendmthdnm = sendmthdnm;
	}

	public void setSendyncd(String sendyncd){
		this.sendyncd = sendyncd;
	}

	public void setMang_emp_nm(String mang_emp_nm){
		this.mang_emp_nm = mang_emp_nm;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setSubsfrser_no(String subsfrser_no){
		this.subsfrser_no = subsfrser_no;
	}

	public void setSubstoser_no(String substoser_no){
		this.substoser_no = substoser_no;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getDscttypecd(){
		return this.dscttypecd;
	}

	public String getAcpndt(){
		return this.acpndt;
	}

	public String getAcpnpathcd(){
		return this.acpnpathcd;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getPtph_no(){
		return this.ptph_no;
	}

	public String getRdremail(){
		return this.rdremail;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getBocnfmdt(){
		return this.bocnfmdt;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public String getBoprocdt(){
		return this.boprocdt;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getBoproccont(){
		return this.boproccont;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getCns_empid(){
		return this.cns_empid;
	}

	public String getProccont(){
		return this.proccont;
	}

	public String getProcpers(){
		return this.procpers;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getDelidt(){
		return this.delidt;
	}

	public String getSendmthd(){
		return this.sendmthd;
	}

	public String getSendmthdnm(){
		return this.sendmthdnm;
	}

	public String getSendyncd(){
		return this.sendyncd;
	}

	public String getMang_emp_nm(){
		return this.mang_emp_nm;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getSubsfrser_no(){
		return this.subsfrser_no;
	}

	public String getSubstoser_no(){
		return this.substoser_no;
	}
}

/* 작성시간 : Tue Oct 11 20:48:34 KST 2005 */