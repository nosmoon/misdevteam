/***************************************************************************************************
* 파일명   : PS_S_READERINFO.java
* 기능     : 독자-구독자 상세조회
* 작성일자 : 2004-07-24
* 작성자   : 김상옥
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.reader.dm.*;
import chosun.ciis.ps.pbs.reader.ds.*;

/**
 * 독자-구독자 상세조회 
 */

public class PS_S_READERINFOREADINFOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String rdrnm;
	public String medicd;
	public String bocd;
	public String bonm;
	public String aplcdt;
	public String delidt;
	public String subsyys;
	public String subs_serno;
	public String acqnm;
	public String rdrtel_no;
	public String rdrptph_no;
	public String rdroffinm;
	public String rdroffitel_no;
	public String rdrposi;
	public String prn;
	public String email;
	public String bidt;
	public String weddyn;
	public String ocpnclsfcd;
	public String resiclsfcd;
	public String resitypecd;
	public String rshpclsfcd;
	public String dlvaddr;
	public String paty_clsfcd;
	public String sendmthd;
	public String recpclsf;
	public String aplc_persflnm;
	public String aplc_persoffinm;
	public String aplc_persposi;
	public String aplc_perstel_no;
	public String aplc_persptph_no;
	public String clamplflnm;
	public String clamploffinm;
	public String clamplposi;
	public String clampltel_no;
	public String clamplptph_no;
	public String clampladdr;
	public String acpntypeclsf;
	public String sendyncd;
	public String alonpaycd;
	public String alonpaypointcd;
	public String amno;
	public String mang_empno;
	public String hdqtemp_no;
	public String rdr_extnno;
	public String arbtno;
	public String taxstmtexne;
	public String taxstmtissudt;
	public String memo;
	public String sellamt;
	public String dcamt;
	public String realsellamt;
	public String ttl_rcpmamt;
	public String un_clamtamt;
	public String rcpmmthd;
	public String rcpmenddt;
	public String payalonamt;
	public String rcpm_list;
	public String rdrgrad_dt;
	public String aplcpathnm;
	public String rdr_extntypenm;
	public String suspresnnm;
	public String acq_bonm;
	public Timestamp boprocdt;
	public String deli_empno;

	public PS_S_READERINFOREADINFOCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setDelidt(String delidt){
		this.delidt = delidt;
	}

	public void setSubsyys(String subsyys){
		this.subsyys = subsyys;
	}

	public void setSubs_serno(String subs_serno){
		this.subs_serno = subs_serno;
	}

	public void setAcqnm(String acqnm){
		this.acqnm = acqnm;
	}

	public void setRdrtel_no(String rdrtel_no){
		this.rdrtel_no = rdrtel_no;
	}

	public void setRdrptph_no(String rdrptph_no){
		this.rdrptph_no = rdrptph_no;
	}

	public void setRdroffinm(String rdroffinm){
		this.rdroffinm = rdroffinm;
	}

	public void setRdroffitel_no(String rdroffitel_no){
		this.rdroffitel_no = rdroffitel_no;
	}

	public void setRdrposi(String rdrposi){
		this.rdrposi = rdrposi;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setBidt(String bidt){
		this.bidt = bidt;
	}

	public void setWeddyn(String weddyn){
		this.weddyn = weddyn;
	}

	public void setOcpnclsfcd(String ocpnclsfcd){
		this.ocpnclsfcd = ocpnclsfcd;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setRshpclsfcd(String rshpclsfcd){
		this.rshpclsfcd = rshpclsfcd;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setPaty_clsfcd(String paty_clsfcd){
		this.paty_clsfcd = paty_clsfcd;
	}

	public void setSendmthd(String sendmthd){
		this.sendmthd = sendmthd;
	}

	public void setRecpclsf(String recpclsf){
		this.recpclsf = recpclsf;
	}

	public void setAplc_persflnm(String aplc_persflnm){
		this.aplc_persflnm = aplc_persflnm;
	}

	public void setAplc_persoffinm(String aplc_persoffinm){
		this.aplc_persoffinm = aplc_persoffinm;
	}

	public void setAplc_persposi(String aplc_persposi){
		this.aplc_persposi = aplc_persposi;
	}

	public void setAplc_perstel_no(String aplc_perstel_no){
		this.aplc_perstel_no = aplc_perstel_no;
	}

	public void setAplc_persptph_no(String aplc_persptph_no){
		this.aplc_persptph_no = aplc_persptph_no;
	}

	public void setClamplflnm(String clamplflnm){
		this.clamplflnm = clamplflnm;
	}

	public void setClamploffinm(String clamploffinm){
		this.clamploffinm = clamploffinm;
	}

	public void setClamplposi(String clamplposi){
		this.clamplposi = clamplposi;
	}

	public void setClampltel_no(String clampltel_no){
		this.clampltel_no = clampltel_no;
	}

	public void setClamplptph_no(String clamplptph_no){
		this.clamplptph_no = clamplptph_no;
	}

	public void setClampladdr(String clampladdr){
		this.clampladdr = clampladdr;
	}

	public void setAcpntypeclsf(String acpntypeclsf){
		this.acpntypeclsf = acpntypeclsf;
	}

	public void setSendyncd(String sendyncd){
		this.sendyncd = sendyncd;
	}

	public void setAlonpaycd(String alonpaycd){
		this.alonpaycd = alonpaycd;
	}

	public void setAlonpaypointcd(String alonpaypointcd){
		this.alonpaypointcd = alonpaypointcd;
	}

	public void setAmno(String amno){
		this.amno = amno;
	}

	public void setMang_empno(String mang_empno){
		this.mang_empno = mang_empno;
	}

	public void setHdqtemp_no(String hdqtemp_no){
		this.hdqtemp_no = hdqtemp_no;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setArbtno(String arbtno){
		this.arbtno = arbtno;
	}

	public void setTaxstmtexne(String taxstmtexne){
		this.taxstmtexne = taxstmtexne;
	}

	public void setTaxstmtissudt(String taxstmtissudt){
		this.taxstmtissudt = taxstmtissudt;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setSellamt(String sellamt){
		this.sellamt = sellamt;
	}

	public void setDcamt(String dcamt){
		this.dcamt = dcamt;
	}

	public void setRealsellamt(String realsellamt){
		this.realsellamt = realsellamt;
	}

	public void setTtl_rcpmamt(String ttl_rcpmamt){
		this.ttl_rcpmamt = ttl_rcpmamt;
	}

	public void setUn_clamtamt(String un_clamtamt){
		this.un_clamtamt = un_clamtamt;
	}

	public void setRcpmmthd(String rcpmmthd){
		this.rcpmmthd = rcpmmthd;
	}

	public void setRcpmenddt(String rcpmenddt){
		this.rcpmenddt = rcpmenddt;
	}

	public void setPayalonamt(String payalonamt){
		this.payalonamt = payalonamt;
	}

	public void setRcpm_list(String rcpm_list){
		this.rcpm_list = rcpm_list;
	}

	public void setRdrgrad_dt(String rdrgrad_dt){
		this.rdrgrad_dt = rdrgrad_dt;
	}

	public void setAplcpathnm(String aplcpathnm){
		this.aplcpathnm = aplcpathnm;
	}

	public void setRdr_extntypenm(String rdr_extntypenm){
		this.rdr_extntypenm = rdr_extntypenm;
	}

	public void setSuspresnnm(String suspresnnm){
		this.suspresnnm = suspresnnm;
	}

	public void setAcq_bonm(String acq_bonm){
		this.acq_bonm = acq_bonm;
	}

	public void setBoprocdt(Timestamp boprocdt){
		this.boprocdt = boprocdt;
	}

	public void setDeli_empno(String deli_empno){
		this.deli_empno = deli_empno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getDelidt(){
		return this.delidt;
	}

	public String getSubsyys(){
		return this.subsyys;
	}

	public String getSubs_serno(){
		return this.subs_serno;
	}

	public String getAcqnm(){
		return this.acqnm;
	}

	public String getRdrtel_no(){
		return this.rdrtel_no;
	}

	public String getRdrptph_no(){
		return this.rdrptph_no;
	}

	public String getRdroffinm(){
		return this.rdroffinm;
	}

	public String getRdroffitel_no(){
		return this.rdroffitel_no;
	}

	public String getRdrposi(){
		return this.rdrposi;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmail(){
		return this.email;
	}

	public String getBidt(){
		return this.bidt;
	}

	public String getWeddyn(){
		return this.weddyn;
	}

	public String getOcpnclsfcd(){
		return this.ocpnclsfcd;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getRshpclsfcd(){
		return this.rshpclsfcd;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getPaty_clsfcd(){
		return this.paty_clsfcd;
	}

	public String getSendmthd(){
		return this.sendmthd;
	}

	public String getRecpclsf(){
		return this.recpclsf;
	}

	public String getAplc_persflnm(){
		return this.aplc_persflnm;
	}

	public String getAplc_persoffinm(){
		return this.aplc_persoffinm;
	}

	public String getAplc_persposi(){
		return this.aplc_persposi;
	}

	public String getAplc_perstel_no(){
		return this.aplc_perstel_no;
	}

	public String getAplc_persptph_no(){
		return this.aplc_persptph_no;
	}

	public String getClamplflnm(){
		return this.clamplflnm;
	}

	public String getClamploffinm(){
		return this.clamploffinm;
	}

	public String getClamplposi(){
		return this.clamplposi;
	}

	public String getClampltel_no(){
		return this.clampltel_no;
	}

	public String getClamplptph_no(){
		return this.clamplptph_no;
	}

	public String getClampladdr(){
		return this.clampladdr;
	}

	public String getAcpntypeclsf(){
		return this.acpntypeclsf;
	}

	public String getSendyncd(){
		return this.sendyncd;
	}

	public String getAlonpaycd(){
		return this.alonpaycd;
	}

	public String getAlonpaypointcd(){
		return this.alonpaypointcd;
	}

	public String getAmno(){
		return this.amno;
	}

	public String getMang_empno(){
		return this.mang_empno;
	}

	public String getHdqtemp_no(){
		return this.hdqtemp_no;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getArbtno(){
		return this.arbtno;
	}

	public String getTaxstmtexne(){
		return this.taxstmtexne;
	}

	public String getTaxstmtissudt(){
		return this.taxstmtissudt;
	}

	public String getMemo(){
		return this.memo;
	}

	public String getSellamt(){
		return this.sellamt;
	}

	public String getDcamt(){
		return this.dcamt;
	}

	public String getRealsellamt(){
		return this.realsellamt;
	}

	public String getTtl_rcpmamt(){
		return this.ttl_rcpmamt;
	}

	public String getUn_clamtamt(){
		return this.un_clamtamt;
	}

	public String getRcpmmthd(){
		return this.rcpmmthd;
	}

	public String getRcpmenddt(){
		return this.rcpmenddt;
	}

	public String getPayalonamt(){
		return this.payalonamt;
	}

	public String getRcpm_list(){
		return this.rcpm_list;
	}

	public String getRdrgrad_dt(){
		return this.rdrgrad_dt;
	}

	public String getAplcpathnm(){
		return this.aplcpathnm;
	}

	public String getRdr_extntypenm(){
		return this.rdr_extntypenm;
	}

	public String getSuspresnnm(){
		return this.suspresnnm;
	}

	public String getAcq_bonm(){
		return this.acq_bonm;
	}

	public Timestamp getBoprocdt(){
		return this.boprocdt;
	}

	public String getDeli_empno(){
		return this.deli_empno;
	}
}

/* 작성시간 : Mon Jun 30 15:58:27 KST 2008 */