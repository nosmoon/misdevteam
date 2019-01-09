/***************************************************************************************************
* 파일명 : PS_S_APLC.java
* 기능   : 자동이체신청 상세조회
* 작성일자 : 2006-04-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.ds.*;

/**
 * 출판국 -자동이체신청 상세조회
 *
 */

public class PS_S_APLCRSLTCURRecord extends java.lang.Object implements java.io.Serializable{

	public String aplcdt;
	public String shftclsf;
	public String aplcno;
	public String shftclsfnm;
	public String pymtno_2;
	public String pymtnm;
	public String rdrnm;
	public String zip;
	public String dlvaddr;
	public String dlvaddrdtls;
	public String rdrtel1;
	public String rdrtel2;
	public String rdrtel3;
	public String aplyyymm;
	public String rdr_no;
	public String medicd;
	public String medinm;
	public String termsubsno;
	public int realsellamt;
	public String agrmnt_list;
	public String clamt_list;
	public String remk;
	public String bocd;
	public String bonm;
	public String subsfrser_no;
	public String substoser_no;
	public String cardcmpycd;
	public String cardno;
	public String vdtyprd;
	public String pymttel1;
	public String pymttel2;
	public String pymttel3;
	public String recpinstt;
	public String acctno;
	public String prn;
	public String email;
	public String aplcpathcd;
	public String acpnpointcd;
	public String acpnplacclsfcd;
	public String camptypecd;
	public String campid;
	public String campexecclsfcd;
	public String campobjid;
	public String campchnlcd;
	public String aplcclsf;

	public PS_S_APLCRSLTCURRecord(){}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setShftclsf(String shftclsf){
		this.shftclsf = shftclsf;
	}

	public void setAplcno(String aplcno){
		this.aplcno = aplcno;
	}

	public void setShftclsfnm(String shftclsfnm){
		this.shftclsfnm = shftclsfnm;
	}

	public void setPymtno_2(String pymtno_2){
		this.pymtno_2 = pymtno_2;
	}

	public void setPymtnm(String pymtnm){
		this.pymtnm = pymtnm;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvaddrdtls(String dlvaddrdtls){
		this.dlvaddrdtls = dlvaddrdtls;
	}

	public void setRdrtel1(String rdrtel1){
		this.rdrtel1 = rdrtel1;
	}

	public void setRdrtel2(String rdrtel2){
		this.rdrtel2 = rdrtel2;
	}

	public void setRdrtel3(String rdrtel3){
		this.rdrtel3 = rdrtel3;
	}

	public void setAplyyymm(String aplyyymm){
		this.aplyyymm = aplyyymm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
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

	public void setRealsellamt(int realsellamt){
		this.realsellamt = realsellamt;
	}

	public void setAgrmnt_list(String agrmnt_list){
		this.agrmnt_list = agrmnt_list;
	}

	public void setClamt_list(String clamt_list){
		this.clamt_list = clamt_list;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setSubsfrser_no(String subsfrser_no){
		this.subsfrser_no = subsfrser_no;
	}

	public void setSubstoser_no(String substoser_no){
		this.substoser_no = substoser_no;
	}

	public void setCardcmpycd(String cardcmpycd){
		this.cardcmpycd = cardcmpycd;
	}

	public void setCardno(String cardno){
		this.cardno = cardno;
	}

	public void setVdtyprd(String vdtyprd){
		this.vdtyprd = vdtyprd;
	}

	public void setPymttel1(String pymttel1){
		this.pymttel1 = pymttel1;
	}

	public void setPymttel2(String pymttel2){
		this.pymttel2 = pymttel2;
	}

	public void setPymttel3(String pymttel3){
		this.pymttel3 = pymttel3;
	}

	public void setRecpinstt(String recpinstt){
		this.recpinstt = recpinstt;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setAcpnpointcd(String acpnpointcd){
		this.acpnpointcd = acpnpointcd;
	}

	public void setAcpnplacclsfcd(String acpnplacclsfcd){
		this.acpnplacclsfcd = acpnplacclsfcd;
	}

	public void setCamptypecd(String camptypecd){
		this.camptypecd = camptypecd;
	}

	public void setCampid(String campid){
		this.campid = campid;
	}

	public void setCampexecclsfcd(String campexecclsfcd){
		this.campexecclsfcd = campexecclsfcd;
	}

	public void setCampobjid(String campobjid){
		this.campobjid = campobjid;
	}

	public void setCampchnlcd(String campchnlcd){
		this.campchnlcd = campchnlcd;
	}

	public void setAplcclsf(String aplcclsf){
		this.aplcclsf = aplcclsf;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getShftclsf(){
		return this.shftclsf;
	}

	public String getAplcno(){
		return this.aplcno;
	}

	public String getShftclsfnm(){
		return this.shftclsfnm;
	}

	public String getPymtno_2(){
		return this.pymtno_2;
	}

	public String getPymtnm(){
		return this.pymtnm;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvaddrdtls(){
		return this.dlvaddrdtls;
	}

	public String getRdrtel1(){
		return this.rdrtel1;
	}

	public String getRdrtel2(){
		return this.rdrtel2;
	}

	public String getRdrtel3(){
		return this.rdrtel3;
	}

	public String getAplyyymm(){
		return this.aplyyymm;
	}

	public String getRdr_no(){
		return this.rdr_no;
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

	public int getRealsellamt(){
		return this.realsellamt;
	}

	public String getAgrmnt_list(){
		return this.agrmnt_list;
	}

	public String getClamt_list(){
		return this.clamt_list;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getSubsfrser_no(){
		return this.subsfrser_no;
	}

	public String getSubstoser_no(){
		return this.substoser_no;
	}

	public String getCardcmpycd(){
		return this.cardcmpycd;
	}

	public String getCardno(){
		return this.cardno;
	}

	public String getVdtyprd(){
		return this.vdtyprd;
	}

	public String getPymttel1(){
		return this.pymttel1;
	}

	public String getPymttel2(){
		return this.pymttel2;
	}

	public String getPymttel3(){
		return this.pymttel3;
	}

	public String getRecpinstt(){
		return this.recpinstt;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmail(){
		return this.email;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getAcpnpointcd(){
		return this.acpnpointcd;
	}

	public String getAcpnplacclsfcd(){
		return this.acpnplacclsfcd;
	}

	public String getCamptypecd(){
		return this.camptypecd;
	}

	public String getCampid(){
		return this.campid;
	}

	public String getCampexecclsfcd(){
		return this.campexecclsfcd;
	}

	public String getCampobjid(){
		return this.campobjid;
	}

	public String getCampchnlcd(){
		return this.campchnlcd;
	}

	public String getAplcclsf(){
		return this.aplcclsf;
	}
}

/* 작성시간 : Fri Sep 29 11:15:36 KST 2006 */