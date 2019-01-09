/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황-본사확장- 유형별 상세  
* 작성일자 : 2009-05-25
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황-본사확장- 유형별 상세  
 */

public class SS_S_EXTN_HDQTDETAILLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_extntypenm;
	public String aplcpathnm;
	public String advtpathnm;
	public String medinm;
	public String qty;
	public String sellnetclsfnm;
	public String extnflnm;
	public String extnblngnm;
	public String alonadjmyn;
	public String shftbgnmm;
	public String clamtmm;
	public String clamtyn;
	public String aplcpersnm;
	public String aplcperstel_no1;
	public String aplcperstel_no2;
	public String aplcperstel_no3;
	public String aplcperstel_detail;
	public String aplcpersptph_no1;
	public String aplcpersptph_no2;
	public String aplcpersptph_no3;
	public String aplcpersptph_detail;
	public String aplcpersemail;
	public String rshpclsfnm;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrtel_detail;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String rdrptph_detail;
	public String rdr_no;
	public String rdremail;
	public String onlmembid;
	public String valmm;
	public String freeday;
	public String sellnetclsfyn;
	public String subsuprc;
	public String clamtmthdnm;
	public String agrmnt_prd;
	public String bns_itemnm;
	public String shftaplcclsfnm;
	public String clamt_month;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String addr_detail;
	public String bonm;
	public String tel_no11;
	public String tel_no12;
	public String tel_no13;
	public String tel_detail;
	public String post_dlvyn;
	public String dlvhopedt;
	public String resiclsfnm;
	public String resitypenm;
	public String aplcpersremk;
	public String bo_headcnfmyn;
	public String bo_headcnfmdt;
	public String subscnfmstatnm;
	public String prcmsg;
	public String cns_empnm;
	public String cns_empcnfmstatcd;
	public String cns_empprocdt;
	public String remk;

	public SS_S_EXTN_HDQTDETAILLISTRecord(){}

	public void setRdr_extntypenm(String rdr_extntypenm){
		this.rdr_extntypenm = rdr_extntypenm;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setAdvtpathnm(String advtpathnm){
		this.advtpathnm = advtpathnm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setSellnetclsfnm(String sellnetclsfnm){
		this.sellnetclsfnm = sellnetclsfnm;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setExtnblngnm(String extnblngnm){
		this.extnblngnm = extnblngnm;
	}

	public void setAlonadjmyn(String alonadjmyn){
		this.alonadjmyn = alonadjmyn;
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

	public void setAplcpersnm(String aplcpersnm){
		this.aplcpersnm = aplcpersnm;
	}

	public void setAplcperstel_no1(String aplcperstel_no1){
		this.aplcperstel_no1 = aplcperstel_no1;
	}

	public void setAplcperstel_no2(String aplcperstel_no2){
		this.aplcperstel_no2 = aplcperstel_no2;
	}

	public void setAplcperstel_no3(String aplcperstel_no3){
		this.aplcperstel_no3 = aplcperstel_no3;
	}

	public void setAplcperstel_detail(String aplcperstel_detail){
		this.aplcperstel_detail = aplcperstel_detail;
	}

	public void setAplcpersptph_no1(String aplcpersptph_no1){
		this.aplcpersptph_no1 = aplcpersptph_no1;
	}

	public void setAplcpersptph_no2(String aplcpersptph_no2){
		this.aplcpersptph_no2 = aplcpersptph_no2;
	}

	public void setAplcpersptph_no3(String aplcpersptph_no3){
		this.aplcpersptph_no3 = aplcpersptph_no3;
	}

	public void setAplcpersptph_detail(String aplcpersptph_detail){
		this.aplcpersptph_detail = aplcpersptph_detail;
	}

	public void setAplcpersemail(String aplcpersemail){
		this.aplcpersemail = aplcpersemail;
	}

	public void setRshpclsfnm(String rshpclsfnm){
		this.rshpclsfnm = rshpclsfnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
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

	public void setRdrtel_detail(String rdrtel_detail){
		this.rdrtel_detail = rdrtel_detail;
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

	public void setRdrptph_detail(String rdrptph_detail){
		this.rdrptph_detail = rdrptph_detail;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdremail(String rdremail){
		this.rdremail = rdremail;
	}

	public void setOnlmembid(String onlmembid){
		this.onlmembid = onlmembid;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setFreeday(String freeday){
		this.freeday = freeday;
	}

	public void setSellnetclsfyn(String sellnetclsfyn){
		this.sellnetclsfyn = sellnetclsfyn;
	}

	public void setSubsuprc(String subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setClamtmthdnm(String clamtmthdnm){
		this.clamtmthdnm = clamtmthdnm;
	}

	public void setAgrmnt_prd(String agrmnt_prd){
		this.agrmnt_prd = agrmnt_prd;
	}

	public void setBns_itemnm(String bns_itemnm){
		this.bns_itemnm = bns_itemnm;
	}

	public void setShftaplcclsfnm(String shftaplcclsfnm){
		this.shftaplcclsfnm = shftaplcclsfnm;
	}

	public void setClamt_month(String clamt_month){
		this.clamt_month = clamt_month;
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

	public void setAddr_detail(String addr_detail){
		this.addr_detail = addr_detail;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
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

	public void setTel_detail(String tel_detail){
		this.tel_detail = tel_detail;
	}

	public void setPost_dlvyn(String post_dlvyn){
		this.post_dlvyn = post_dlvyn;
	}

	public void setDlvhopedt(String dlvhopedt){
		this.dlvhopedt = dlvhopedt;
	}

	public void setResiclsfnm(String resiclsfnm){
		this.resiclsfnm = resiclsfnm;
	}

	public void setResitypenm(String resitypenm){
		this.resitypenm = resitypenm;
	}

	public void setAplcpersremk(String aplcpersremk){
		this.aplcpersremk = aplcpersremk;
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

	public void setPrcmsg(String prcmsg){
		this.prcmsg = prcmsg;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setCns_empcnfmstatcd(String cns_empcnfmstatcd){
		this.cns_empcnfmstatcd = cns_empcnfmstatcd;
	}

	public void setCns_empprocdt(String cns_empprocdt){
		this.cns_empprocdt = cns_empprocdt;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getRdr_extntypenm(){
		return this.rdr_extntypenm;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getAdvtpathnm(){
		return this.advtpathnm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getSellnetclsfnm(){
		return this.sellnetclsfnm;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getExtnblngnm(){
		return this.extnblngnm;
	}

	public String getAlonadjmyn(){
		return this.alonadjmyn;
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

	public String getAplcpersnm(){
		return this.aplcpersnm;
	}

	public String getAplcperstel_no1(){
		return this.aplcperstel_no1;
	}

	public String getAplcperstel_no2(){
		return this.aplcperstel_no2;
	}

	public String getAplcperstel_no3(){
		return this.aplcperstel_no3;
	}

	public String getAplcperstel_detail(){
		return this.aplcperstel_detail;
	}

	public String getAplcpersptph_no1(){
		return this.aplcpersptph_no1;
	}

	public String getAplcpersptph_no2(){
		return this.aplcpersptph_no2;
	}

	public String getAplcpersptph_no3(){
		return this.aplcpersptph_no3;
	}

	public String getAplcpersptph_detail(){
		return this.aplcpersptph_detail;
	}

	public String getAplcpersemail(){
		return this.aplcpersemail;
	}

	public String getRshpclsfnm(){
		return this.rshpclsfnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
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

	public String getRdrtel_detail(){
		return this.rdrtel_detail;
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

	public String getRdrptph_detail(){
		return this.rdrptph_detail;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdremail(){
		return this.rdremail;
	}

	public String getOnlmembid(){
		return this.onlmembid;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getFreeday(){
		return this.freeday;
	}

	public String getSellnetclsfyn(){
		return this.sellnetclsfyn;
	}

	public String getSubsuprc(){
		return this.subsuprc;
	}

	public String getClamtmthdnm(){
		return this.clamtmthdnm;
	}

	public String getAgrmnt_prd(){
		return this.agrmnt_prd;
	}

	public String getBns_itemnm(){
		return this.bns_itemnm;
	}

	public String getShftaplcclsfnm(){
		return this.shftaplcclsfnm;
	}

	public String getClamt_month(){
		return this.clamt_month;
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

	public String getAddr_detail(){
		return this.addr_detail;
	}

	public String getBonm(){
		return this.bonm;
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

	public String getTel_detail(){
		return this.tel_detail;
	}

	public String getPost_dlvyn(){
		return this.post_dlvyn;
	}

	public String getDlvhopedt(){
		return this.dlvhopedt;
	}

	public String getResiclsfnm(){
		return this.resiclsfnm;
	}

	public String getResitypenm(){
		return this.resitypenm;
	}

	public String getAplcpersremk(){
		return this.aplcpersremk;
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

	public String getPrcmsg(){
		return this.prcmsg;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getCns_empcnfmstatcd(){
		return this.cns_empcnfmstatcd;
	}

	public String getCns_empprocdt(){
		return this.cns_empprocdt;
	}

	public String getRemk(){
		return this.remk;
	}
}

/* 작성시간 : Mon Jun 08 11:31:41 KST 2009 */