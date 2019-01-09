/***************************************************************************************************
 * 파일명   : PB_S_ARBT_PTCR_INFOARBTRDRCURRecord.java
 * 기능     : 공통-출판 중재내역 정보
 * 작성일자 : 2004-02-16
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     :
 **************************************************************************************************/


package chosun.ciis.ps.pbs.common.rec;

import java.sql.*;
import chosun.ciis.ps.pbs.common.dm.*;
import chosun.ciis.ps.pbs.common.ds.*;

/**
 * class definition
 *
 */


public class PB_S_ARBT_PTCR_INFOARBTRDRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String arbtaplcdt;
	public String arbtno;
	public String regclsfcd;
	public String regdt;
	public String aprvproccd;
	public String arbtprocresn;
	public String aprvdt;
	public String regpgclsf;
	public String bocd;
	public String medicd;
	public int aplcqty;
	public String paty_clsfcd;
	public String prn;
	public String email;
	public String weddyn;
	public String weddanvydt;
	public String bidt;
	public String lusoclsfcd;
	public String ocpnclsfcd;
	public String dldt;
	public String sbsfrser_no;
	public String sbstoser_no;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String rdroffinm;
	public String rdroffitel_no1;
	public String rdroffitel_no2;
	public String rdroffitel_no3;
	public String rdrposi;
	public String resiclsfcd;
	public String resitypecd;
	public String rshpclsfcd;
	public String hbycd;
	public String conccd;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String patycd;
	public String sendmthd;
	public String ddlv_cd;
	public String recpclsf;
	public String aplc_persflnm;
	public String aplc_persoffinm;
	public String aplc_persposi;
	public String aplc_perstel_no1;
	public String aplc_perstel_no2;
	public String aplc_perstel_no3;
	public String aplc_persptph_no1;
	public String aplc_persptph_no2;
	public String aplc_persptph_no3;
	public String clamplflnm;
	public String clamploffinm;
	public String clamplposi;
	public String clampltel_no1;
	public String clampltel_no2;
	public String clampltel_no3;
	public String clamplptph_no1;
	public String clamplptph_no2;
	public String clamplptph_no3;
	public String clamplzip;
	public String clampladdr;
	public String clampldtlsaddr;
	public String acpntypeclsf;
	public String acpntypecd;
	public int linkyear;
	public String rdr_movmrdr_no;
	public String sendyncd;
	public String sendynprocdt;
	public String alonpaypointcd;
	public String alonpaycd;
	public String alonpayprocdt;
	public String amno;
	public String amno_nm;
	public String amno_deptnm;
	public String hdqtemp_no;
	public String hdqtemp_nm;
	public String hdqtemp_deptnm;
	public String mang_empno;
	public String mang_emp_nm;
	public String mang_emp_deptnm;
	public String rdr_extnno;
	public String rdr_extndt;
	public String taxstmtexne;
	public String taxstmtkind;
	public String taxstmtissudt;
	public String memo;
	public int sellamt;
	public int dcamt;
	public int realsellamt;
	public String rcpmmthd;
	public int payalonamt;

	public PB_S_ARBT_PTCR_INFOARBTRDRCURRecord(){}

	public void setArbtaplcdt(String arbtaplcdt){
		this.arbtaplcdt = arbtaplcdt;
	}

	public void setArbtno(String arbtno){
		this.arbtno = arbtno;
	}

	public void setRegclsfcd(String regclsfcd){
		this.regclsfcd = regclsfcd;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setAprvproccd(String aprvproccd){
		this.aprvproccd = aprvproccd;
	}

	public void setArbtprocresn(String arbtprocresn){
		this.arbtprocresn = arbtprocresn;
	}

	public void setAprvdt(String aprvdt){
		this.aprvdt = aprvdt;
	}

	public void setRegpgclsf(String regpgclsf){
		this.regpgclsf = regpgclsf;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setAplcqty(int aplcqty){
		this.aplcqty = aplcqty;
	}

	public void setPaty_clsfcd(String paty_clsfcd){
		this.paty_clsfcd = paty_clsfcd;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setWeddyn(String weddyn){
		this.weddyn = weddyn;
	}

	public void setWeddanvydt(String weddanvydt){
		this.weddanvydt = weddanvydt;
	}

	public void setBidt(String bidt){
		this.bidt = bidt;
	}

	public void setLusoclsfcd(String lusoclsfcd){
		this.lusoclsfcd = lusoclsfcd;
	}

	public void setOcpnclsfcd(String ocpnclsfcd){
		this.ocpnclsfcd = ocpnclsfcd;
	}

	public void setDldt(String dldt){
		this.dldt = dldt;
	}

	public void setSbsfrser_no(String sbsfrser_no){
		this.sbsfrser_no = sbsfrser_no;
	}

	public void setSbstoser_no(String sbstoser_no){
		this.sbstoser_no = sbstoser_no;
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

	public void setRdrptph_no1(String rdrptph_no1){
		this.rdrptph_no1 = rdrptph_no1;
	}

	public void setRdrptph_no2(String rdrptph_no2){
		this.rdrptph_no2 = rdrptph_no2;
	}

	public void setRdrptph_no3(String rdrptph_no3){
		this.rdrptph_no3 = rdrptph_no3;
	}

	public void setRdroffinm(String rdroffinm){
		this.rdroffinm = rdroffinm;
	}

	public void setRdroffitel_no1(String rdroffitel_no1){
		this.rdroffitel_no1 = rdroffitel_no1;
	}

	public void setRdroffitel_no2(String rdroffitel_no2){
		this.rdroffitel_no2 = rdroffitel_no2;
	}

	public void setRdroffitel_no3(String rdroffitel_no3){
		this.rdroffitel_no3 = rdroffitel_no3;
	}

	public void setRdrposi(String rdrposi){
		this.rdrposi = rdrposi;
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

	public void setHbycd(String hbycd){
		this.hbycd = hbycd;
	}

	public void setConccd(String conccd){
		this.conccd = conccd;
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

	public void setPatycd(String patycd){
		this.patycd = patycd;
	}

	public void setSendmthd(String sendmthd){
		this.sendmthd = sendmthd;
	}

	public void setDdlv_cd(String ddlv_cd){
		this.ddlv_cd = ddlv_cd;
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

	public void setAplc_perstel_no1(String aplc_perstel_no1){
		this.aplc_perstel_no1 = aplc_perstel_no1;
	}

	public void setAplc_perstel_no2(String aplc_perstel_no2){
		this.aplc_perstel_no2 = aplc_perstel_no2;
	}

	public void setAplc_perstel_no3(String aplc_perstel_no3){
		this.aplc_perstel_no3 = aplc_perstel_no3;
	}

	public void setAplc_persptph_no1(String aplc_persptph_no1){
		this.aplc_persptph_no1 = aplc_persptph_no1;
	}

	public void setAplc_persptph_no2(String aplc_persptph_no2){
		this.aplc_persptph_no2 = aplc_persptph_no2;
	}

	public void setAplc_persptph_no3(String aplc_persptph_no3){
		this.aplc_persptph_no3 = aplc_persptph_no3;
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

	public void setClampltel_no1(String clampltel_no1){
		this.clampltel_no1 = clampltel_no1;
	}

	public void setClampltel_no2(String clampltel_no2){
		this.clampltel_no2 = clampltel_no2;
	}

	public void setClampltel_no3(String clampltel_no3){
		this.clampltel_no3 = clampltel_no3;
	}

	public void setClamplptph_no1(String clamplptph_no1){
		this.clamplptph_no1 = clamplptph_no1;
	}

	public void setClamplptph_no2(String clamplptph_no2){
		this.clamplptph_no2 = clamplptph_no2;
	}

	public void setClamplptph_no3(String clamplptph_no3){
		this.clamplptph_no3 = clamplptph_no3;
	}

	public void setClamplzip(String clamplzip){
		this.clamplzip = clamplzip;
	}

	public void setClampladdr(String clampladdr){
		this.clampladdr = clampladdr;
	}

	public void setClampldtlsaddr(String clampldtlsaddr){
		this.clampldtlsaddr = clampldtlsaddr;
	}

	public void setAcpntypeclsf(String acpntypeclsf){
		this.acpntypeclsf = acpntypeclsf;
	}

	public void setAcpntypecd(String acpntypecd){
		this.acpntypecd = acpntypecd;
	}

	public void setLinkyear(int linkyear){
		this.linkyear = linkyear;
	}

	public void setRdr_movmrdr_no(String rdr_movmrdr_no){
		this.rdr_movmrdr_no = rdr_movmrdr_no;
	}

	public void setSendyncd(String sendyncd){
		this.sendyncd = sendyncd;
	}

	public void setSendynprocdt(String sendynprocdt){
		this.sendynprocdt = sendynprocdt;
	}

	public void setAlonpaypointcd(String alonpaypointcd){
		this.alonpaypointcd = alonpaypointcd;
	}

	public void setAlonpaycd(String alonpaycd){
		this.alonpaycd = alonpaycd;
	}

	public void setAlonpayprocdt(String alonpayprocdt){
		this.alonpayprocdt = alonpayprocdt;
	}

	public void setAmno(String amno){
		this.amno = amno;
	}

	public void setAmno_nm(String amno_nm){
		this.amno_nm = amno_nm;
	}

	public void setAmno_deptnm(String amno_deptnm){
		this.amno_deptnm = amno_deptnm;
	}

	public void setHdqtemp_no(String hdqtemp_no){
		this.hdqtemp_no = hdqtemp_no;
	}

	public void setHdqtemp_nm(String hdqtemp_nm){
		this.hdqtemp_nm = hdqtemp_nm;
	}

	public void setHdqtemp_deptnm(String hdqtemp_deptnm){
		this.hdqtemp_deptnm = hdqtemp_deptnm;
	}

	public void setMang_empno(String mang_empno){
		this.mang_empno = mang_empno;
	}

	public void setMang_emp_nm(String mang_emp_nm){
		this.mang_emp_nm = mang_emp_nm;
	}

	public void setMang_emp_deptnm(String mang_emp_deptnm){
		this.mang_emp_deptnm = mang_emp_deptnm;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setTaxstmtexne(String taxstmtexne){
		this.taxstmtexne = taxstmtexne;
	}

	public void setTaxstmtkind(String taxstmtkind){
		this.taxstmtkind = taxstmtkind;
	}

	public void setTaxstmtissudt(String taxstmtissudt){
		this.taxstmtissudt = taxstmtissudt;
	}

	public void setMemo(String memo){
		this.memo = memo;
	}

	public void setSellamt(int sellamt){
		this.sellamt = sellamt;
	}

	public void setDcamt(int dcamt){
		this.dcamt = dcamt;
	}

	public void setRealsellamt(int realsellamt){
		this.realsellamt = realsellamt;
	}

	public void setRcpmmthd(String rcpmmthd){
		this.rcpmmthd = rcpmmthd;
	}

	public void setPayalonamt(int payalonamt){
		this.payalonamt = payalonamt;
	}

	public String getArbtaplcdt(){
		return this.arbtaplcdt;
	}

	public String getArbtno(){
		return this.arbtno;
	}

	public String getRegclsfcd(){
		return this.regclsfcd;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getAprvproccd(){
		return this.aprvproccd;
	}

	public String getArbtprocresn(){
		return this.arbtprocresn;
	}

	public String getAprvdt(){
		return this.aprvdt;
	}

	public String getRegpgclsf(){
		return this.regpgclsf;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public int getAplcqty(){
		return this.aplcqty;
	}

	public String getPaty_clsfcd(){
		return this.paty_clsfcd;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getEmail(){
		return this.email;
	}

	public String getWeddyn(){
		return this.weddyn;
	}

	public String getWeddanvydt(){
		return this.weddanvydt;
	}

	public String getBidt(){
		return this.bidt;
	}

	public String getLusoclsfcd(){
		return this.lusoclsfcd;
	}

	public String getOcpnclsfcd(){
		return this.ocpnclsfcd;
	}

	public String getDldt(){
		return this.dldt;
	}

	public String getSbsfrser_no(){
		return this.sbsfrser_no;
	}

	public String getSbstoser_no(){
		return this.sbstoser_no;
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

	public String getRdrptph_no1(){
		return this.rdrptph_no1;
	}

	public String getRdrptph_no2(){
		return this.rdrptph_no2;
	}

	public String getRdrptph_no3(){
		return this.rdrptph_no3;
	}

	public String getRdroffinm(){
		return this.rdroffinm;
	}

	public String getRdroffitel_no1(){
		return this.rdroffitel_no1;
	}

	public String getRdroffitel_no2(){
		return this.rdroffitel_no2;
	}

	public String getRdroffitel_no3(){
		return this.rdroffitel_no3;
	}

	public String getRdrposi(){
		return this.rdrposi;
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

	public String getHbycd(){
		return this.hbycd;
	}

	public String getConccd(){
		return this.conccd;
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

	public String getPatycd(){
		return this.patycd;
	}

	public String getSendmthd(){
		return this.sendmthd;
	}

	public String getDdlv_cd(){
		return this.ddlv_cd;
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

	public String getAplc_perstel_no1(){
		return this.aplc_perstel_no1;
	}

	public String getAplc_perstel_no2(){
		return this.aplc_perstel_no2;
	}

	public String getAplc_perstel_no3(){
		return this.aplc_perstel_no3;
	}

	public String getAplc_persptph_no1(){
		return this.aplc_persptph_no1;
	}

	public String getAplc_persptph_no2(){
		return this.aplc_persptph_no2;
	}

	public String getAplc_persptph_no3(){
		return this.aplc_persptph_no3;
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

	public String getClampltel_no1(){
		return this.clampltel_no1;
	}

	public String getClampltel_no2(){
		return this.clampltel_no2;
	}

	public String getClampltel_no3(){
		return this.clampltel_no3;
	}

	public String getClamplptph_no1(){
		return this.clamplptph_no1;
	}

	public String getClamplptph_no2(){
		return this.clamplptph_no2;
	}

	public String getClamplptph_no3(){
		return this.clamplptph_no3;
	}

	public String getClamplzip(){
		return this.clamplzip;
	}

	public String getClampladdr(){
		return this.clampladdr;
	}

	public String getClampldtlsaddr(){
		return this.clampldtlsaddr;
	}

	public String getAcpntypeclsf(){
		return this.acpntypeclsf;
	}

	public String getAcpntypecd(){
		return this.acpntypecd;
	}

	public int getLinkyear(){
		return this.linkyear;
	}

	public String getRdr_movmrdr_no(){
		return this.rdr_movmrdr_no;
	}

	public String getSendyncd(){
		return this.sendyncd;
	}

	public String getSendynprocdt(){
		return this.sendynprocdt;
	}

	public String getAlonpaypointcd(){
		return this.alonpaypointcd;
	}

	public String getAlonpaycd(){
		return this.alonpaycd;
	}

	public String getAlonpayprocdt(){
		return this.alonpayprocdt;
	}

	public String getAmno(){
		return this.amno;
	}

	public String getAmno_nm(){
		return this.amno_nm;
	}

	public String getAmno_deptnm(){
		return this.amno_deptnm;
	}

	public String getHdqtemp_no(){
		return this.hdqtemp_no;
	}

	public String getHdqtemp_nm(){
		return this.hdqtemp_nm;
	}

	public String getHdqtemp_deptnm(){
		return this.hdqtemp_deptnm;
	}

	public String getMang_empno(){
		return this.mang_empno;
	}

	public String getMang_emp_nm(){
		return this.mang_emp_nm;
	}

	public String getMang_emp_deptnm(){
		return this.mang_emp_deptnm;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getTaxstmtexne(){
		return this.taxstmtexne;
	}

	public String getTaxstmtkind(){
		return this.taxstmtkind;
	}

	public String getTaxstmtissudt(){
		return this.taxstmtissudt;
	}

	public String getMemo(){
		return this.memo;
	}

	public int getSellamt(){
		return this.sellamt;
	}

	public int getDcamt(){
		return this.dcamt;
	}

	public int getRealsellamt(){
		return this.realsellamt;
	}

	public String getRcpmmthd(){
		return this.rcpmmthd;
	}

	public int getPayalonamt(){
		return this.payalonamt;
	}
}

/* 작성시간 : Mon Dec 08 14:57:13 KST 2003 */