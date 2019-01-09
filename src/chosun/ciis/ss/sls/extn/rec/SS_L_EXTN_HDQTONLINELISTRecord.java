/***************************************************************************************************
* 파일명 : .java
* 기능 : 본사확장 유형별 조회 
* 작성일자 : 2009/05/22
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 본사확장 유형별 조회 
 */

public class SS_L_EXTN_HDQTONLINELISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extntypenm;
	public String dept_nm;
	public String part_nm;
	public String area_nm;
	public String bonm;
	public String extnflnm;
	public String rdr_extndt;
	public String rdrnm;
	public String rdr_no;
	public String valmm;
	public String onlmembid;
	public String medinm;
	public int qty;
	public String aplcpathnm;
	public String aplcdt;
	public String bo_headcnfmyn;
	public String bo_headcnfmdt;
	public String subscnfmstatnm;
	public String suspdt;
	public String suspyn;
	public String suspresnnm;
	public String rdr_extncost;
	public String alonadjmyn;
	public String corrbocd;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String shftaplcclsfnm;
	public String shftbgnmm;
	public String clamtmm;
	public String clamtyn;
	public String clamt_month;
	public String extn_company;
	public String extn_bonm;
	public String empdeptnm;
	public String banknm;
	public String acctno;
	public String depspers;
	public String sellnetclsfnm;
	public String post_dlvyn;
	public String dept_cd;
	public String part_cd;
	public String area_cd;
	public String rdr_extntypecd;
	public String aplcpathcd;
	public String rdr_extnno;
	public String medicd;
	public String mangno;
	public String cntrno;
	public String tel_no11;
	public String tel_no12;
	public String tel_no13;
	public String bns_itemnm;
	public String freeday;
	public String shftaplcclsf_item;

	public SS_L_EXTN_HDQTONLINELISTRecord(){}

	public void setRdr_extntypenm(String rdr_extntypenm){
		this.rdr_extntypenm = rdr_extntypenm;
	}

	public void setDept_nm(String dept_nm){
		this.dept_nm = dept_nm;
	}

	public void setPart_nm(String part_nm){
		this.part_nm = part_nm;
	}

	public void setArea_nm(String area_nm){
		this.area_nm = area_nm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setOnlmembid(String onlmembid){
		this.onlmembid = onlmembid;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setBo_headcnfmyn(String bo_headcnfmyn){
		this.bo_headcnfmyn = bo_headcnfmyn;
	}

	public void setBo_headcnfmdt(String bo_headcnfmdt){
		this.bo_headcnfmdt = bo_headcnfmdt;
	}

	public void setSubscnfmstatnm(String subscnfmstatnm){
		this.subscnfmstatnm = subscnfmstatnm;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setSuspyn(String suspyn){
		this.suspyn = suspyn;
	}

	public void setSuspresnnm(String suspresnnm){
		this.suspresnnm = suspresnnm;
	}

	public void setRdr_extncost(String rdr_extncost){
		this.rdr_extncost = rdr_extncost;
	}

	public void setAlonadjmyn(String alonadjmyn){
		this.alonadjmyn = alonadjmyn;
	}

	public void setCorrbocd(String corrbocd){
		this.corrbocd = corrbocd;
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

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setShftaplcclsfnm(String shftaplcclsfnm){
		this.shftaplcclsfnm = shftaplcclsfnm;
	}

	public void setShftbgnmm(String shftbgnmm){
		this.shftbgnmm = shftbgnmm;
	}

	public void setClamtmm(String clamtmm){
		this.clamtmm = clamtmm;
	}

	public void setClamtyn(String clamtyn){
		this.clamtyn = clamtyn;
	}

	public void setClamt_month(String clamt_month){
		this.clamt_month = clamt_month;
	}

	public void setExtn_company(String extn_company){
		this.extn_company = extn_company;
	}

	public void setExtn_bonm(String extn_bonm){
		this.extn_bonm = extn_bonm;
	}

	public void setEmpdeptnm(String empdeptnm){
		this.empdeptnm = empdeptnm;
	}

	public void setBanknm(String banknm){
		this.banknm = banknm;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setDepspers(String depspers){
		this.depspers = depspers;
	}

	public void setSellnetclsfnm(String sellnetclsfnm){
		this.sellnetclsfnm = sellnetclsfnm;
	}

	public void setPost_dlvyn(String post_dlvyn){
		this.post_dlvyn = post_dlvyn;
	}

	public void setDept_cd(String dept_cd){
		this.dept_cd = dept_cd;
	}

	public void setPart_cd(String part_cd){
		this.part_cd = part_cd;
	}

	public void setArea_cd(String area_cd){
		this.area_cd = area_cd;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMangno(String mangno){
		this.mangno = mangno;
	}

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setTel_no11(String tel_no11){
		this.tel_no11 = tel_no11;
	}

	public void setTel_no12(String tel_no12){
		this.tel_no12 = tel_no12;
	}

	public void setTel_no13(String tel_no13){
		this.tel_no13 = tel_no13;
	}

	public void setBns_itemnm(String bns_itemnm){
		this.bns_itemnm = bns_itemnm;
	}

	public void setFreeday(String freeday){
		this.freeday = freeday;
	}
	
	public void setShftaplcclsf_item(String shftaplcclsf_item){
		this.shftaplcclsf_item = shftaplcclsf_item;
	}

	public String getRdr_extntypenm(){
		return this.rdr_extntypenm;
	}

	public String getDept_nm(){
		return this.dept_nm;
	}

	public String getPart_nm(){
		return this.part_nm;
	}

	public String getArea_nm(){
		return this.area_nm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getOnlmembid(){
		return this.onlmembid;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getQty(){
		return this.qty;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getBo_headcnfmyn(){
		return this.bo_headcnfmyn;
	}

	public String getBo_headcnfmdt(){
		return this.bo_headcnfmdt;
	}

	public String getSubscnfmstatnm(){
		return this.subscnfmstatnm;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getSuspyn(){
		return this.suspyn;
	}

	public String getSuspresnnm(){
		return this.suspresnnm;
	}

	public String getRdr_extncost(){
		return this.rdr_extncost;
	}

	public String getAlonadjmyn(){
		return this.alonadjmyn;
	}

	public String getCorrbocd(){
		return this.corrbocd;
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

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getShftaplcclsfnm(){
		return this.shftaplcclsfnm;
	}

	public String getShftbgnmm(){
		return this.shftbgnmm;
	}

	public String getClamtmm(){
		return this.clamtmm;
	}

	public String getClamtyn(){
		return this.clamtyn;
	}

	public String getClamt_month(){
		return this.clamt_month;
	}

	public String getExtn_company(){
		return this.extn_company;
	}

	public String getExtn_bonm(){
		return this.extn_bonm;
	}

	public String getEmpdeptnm(){
		return this.empdeptnm;
	}

	public String getBanknm(){
		return this.banknm;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getDepspers(){
		return this.depspers;
	}

	public String getSellnetclsfnm(){
		return this.sellnetclsfnm;
	}

	public String getPost_dlvyn(){
		return this.post_dlvyn;
	}

	public String getDept_cd(){
		return this.dept_cd;
	}

	public String getPart_cd(){
		return this.part_cd;
	}

	public String getArea_cd(){
		return this.area_cd;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMangno(){
		return this.mangno;
	}

	public String getCntrno(){
		return this.cntrno;
	}

	public String getTel_no11(){
		return this.tel_no11;
	}

	public String getTel_no12(){
		return this.tel_no12;
	}

	public String getTel_no13(){
		return this.tel_no13;
	}

	public String getBns_itemnm(){
		return this.bns_itemnm;
	}

	public String getFreeday(){
		return this.freeday;
	}
	
	public String getShftaplcclsf_item(){
		return this.shftaplcclsf_item;
	}
}

/* 작성시간 : Mon Aug 31 15:30:24 KST 2009 */