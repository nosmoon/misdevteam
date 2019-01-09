/***************************************************************************************************
* 파일명 : SL_L_DSCTDSCTCURRecord.java
* 기능 : 불편관리(불편목록)
* 작성일자 : 2003-12-27
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.rec;

import java.sql.*;
import chosun.ciis.ss.sal.rdr.dm.*;
import chosun.ciis.ss.sal.rdr.ds.*;

/**
 * 불편관리(불편목록)
 *
 */


public class SL_L_DSCTDSCTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String dscttypenm;
	public String acpndt;
	public String acpnpathnm;
	public String deptcd;
	public String areacd;
	public String bocd;
	public String rdr_no;
	public String dsno;
	public String termsubsno;
	public String medicd;
	public String rdrnm;
	public String prn;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
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

	public SL_L_DSCTDSCTCURRecord(){}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setDscttypenm(String dscttypenm){
		this.dscttypenm = dscttypenm;
	}

	public void setAcpndt(String acpndt){
		this.acpndt = acpndt;
	}

	public void setAcpnpathnm(String acpnpathnm){
		this.acpnpathnm = acpnpathnm;
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

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setDsno(String dsno){
		this.dsno = dsno;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setRdrtel_no2(String rdrtel_no2){
		this.rdrtel_no2 = rdrtel_no2;
	}

	public void setRdrtel_no3(String rdrtel_no3){
		this.rdrtel_no3 = rdrtel_no3;
	}

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
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

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getDscttypenm(){
		return this.dscttypenm;
	}

	public String getAcpndt(){
		return this.acpndt;
	}

	public String getAcpnpathnm(){
		return this.acpnpathnm;
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

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getDsno(){
		return this.dsno;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getRdrtel_no2(){
		return this.rdrtel_no2;
	}

	public String getRdrtel_no3(){
		return this.rdrtel_no3;
	}

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
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
}

/* 작성시간 : Sun Feb 01 16:57:38 KST 2004 */