/***************************************************************************************************
* 파일명 : SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord.java
* 기능 : 확장현황-사이버확장-수당-목록을 위한 Record
* 작성일자 : 2004-09-13
* 작성자 : 김대섭
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
 * 확장현황-사이버확장-수당-목록을 위한 Record
 */


public class SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extndt;
	public String rdr_extnno;
	public String stafclsfcd;
	public String stafclsfnm;
	public String stafno;
	public String stafnm;
	public String prn;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;
	public String email;
	public String acctno;
	public String acctbank;
	public String acctdeps_pers;
	public String cnvsstafno;
	public String cnvsstafnm;
	public String rdrnm;
	public String rshpclsfcd;
	public String rshpclsfnm;
	public String resiclsfcd;
	public String resiclsfnm;
	public String resitypecd;
	public String resitypenm;
	public String medicd;
	public String medinm;
	public int qty;
	public String dlvhopedt;
	public String deptcd;
	public String deptnm;
	public String areacd;
	public String areanm;
	public String corrbocd;
	public String bonm;
	public String bo_headcnfmyn;
	public String bo_headcnfmdt;
	public String subscnfmstatcd;
	public String subscnfmstatnm;
	public int cyextnalon;
	public String alonadjmyn;
	public String alonadjmdt;

	public SS_L_PROMSTAF_CYEXPAYCURCOMMLISTRecord(){}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafclsfnm(String stafclsfnm){
		this.stafclsfnm = stafclsfnm;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setTel_no1(String tel_no1){
		this.tel_no1 = tel_no1;
	}

	public void setTel_no2(String tel_no2){
		this.tel_no2 = tel_no2;
	}

	public void setTel_no3(String tel_no3){
		this.tel_no3 = tel_no3;
	}

	public void setPtph_no1(String ptph_no1){
		this.ptph_no1 = ptph_no1;
	}

	public void setPtph_no2(String ptph_no2){
		this.ptph_no2 = ptph_no2;
	}

	public void setPtph_no3(String ptph_no3){
		this.ptph_no3 = ptph_no3;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setAcctbank(String acctbank){
		this.acctbank = acctbank;
	}

	public void setAcctdeps_pers(String acctdeps_pers){
		this.acctdeps_pers = acctdeps_pers;
	}

	public void setCnvsstafno(String cnvsstafno){
		this.cnvsstafno = cnvsstafno;
	}

	public void setCnvsstafnm(String cnvsstafnm){
		this.cnvsstafnm = cnvsstafnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRshpclsfcd(String rshpclsfcd){
		this.rshpclsfcd = rshpclsfcd;
	}

	public void setRshpclsfnm(String rshpclsfnm){
		this.rshpclsfnm = rshpclsfnm;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
	}

	public void setResiclsfnm(String resiclsfnm){
		this.resiclsfnm = resiclsfnm;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setResitypenm(String resitypenm){
		this.resitypenm = resitypenm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setQty(int qty){
		this.qty = qty;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setCorrbocd(String corrbocd){
		this.corrbocd = corrbocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setBo_headcnfmyn(String bo_headcnfmyn){
		this.bo_headcnfmyn = bo_headcnfmyn;
	}

	public void setBo_headcnfmdt(String bo_headcnfmdt){
		this.bo_headcnfmdt = bo_headcnfmdt;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public void setSubscnfmstatnm(String subscnfmstatnm){
		this.subscnfmstatnm = subscnfmstatnm;
	}

	public void setCyextnalon(int cyextnalon){
		this.cyextnalon = cyextnalon;
	}

	public void setAlonadjmyn(String alonadjmyn){
		this.alonadjmyn = alonadjmyn;
	}

	public void setAlonadjmdt(String alonadjmdt){
		this.alonadjmdt = alonadjmdt;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafclsfnm(){
		return this.stafclsfnm;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getTel_no1(){
		return this.tel_no1;
	}

	public String getTel_no2(){
		return this.tel_no2;
	}

	public String getTel_no3(){
		return this.tel_no3;
	}

	public String getPtph_no1(){
		return this.ptph_no1;
	}

	public String getPtph_no2(){
		return this.ptph_no2;
	}

	public String getPtph_no3(){
		return this.ptph_no3;
	}

	public String getEmail(){
		return this.email;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getAcctbank(){
		return this.acctbank;
	}

	public String getAcctdeps_pers(){
		return this.acctdeps_pers;
	}

	public String getCnvsstafno(){
		return this.cnvsstafno;
	}

	public String getCnvsstafnm(){
		return this.cnvsstafnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRshpclsfcd(){
		return this.rshpclsfcd;
	}

	public String getRshpclsfnm(){
		return this.rshpclsfnm;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
	}

	public String getResiclsfnm(){
		return this.resiclsfnm;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getResitypenm(){
		return this.resitypenm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public int getQty(){
		return this.qty;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getCorrbocd(){
		return this.corrbocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getBo_headcnfmyn(){
		return this.bo_headcnfmyn;
	}

	public String getBo_headcnfmdt(){
		return this.bo_headcnfmdt;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public String getSubscnfmstatnm(){
		return this.subscnfmstatnm;
	}

	public int getCyextnalon(){
		return this.cyextnalon;
	}

	public String getAlonadjmyn(){
		return this.alonadjmyn;
	}

	public String getAlonadjmdt(){
		return this.alonadjmdt;
	}
}

/* 작성시간 : Wed Sep 15 13:59:09 KST 2004 */