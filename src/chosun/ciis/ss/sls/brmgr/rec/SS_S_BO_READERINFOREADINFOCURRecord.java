/***************************************************************************************************
 * 파일명   : SP_SS_S_BO_READERINFO
 * 기능     : 지국경영-주간조선 독자조회
 * 작성일자 : 2007/06/15
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.rec;

import java.sql.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.ds.*;

/**
**  SP_SS_S_BO_READERINFO
**/

public class SS_S_BO_READERINFOREADINFOCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String medicd;
	public String termsubsno;
	public String rdrnm;
	public String bocd;
	public String aplcdt;
	public String delidt;
	public String subsfrser_no;
	public String substoser_no;
	public String rdrtel_no1;
	public String acqnm;
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
	public String prn;
	public String email;
	public String bidt;
	public String lusoclsfcd;
	public String weddyn;
	public String weddanvydt;
	public String ocpnclsfcd;
	public String resiclsfcd;
	public String resitypecd;
	public String rshpclsfcd;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String paty_clsfcd;
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
	public String arbtno;
	public String arbtaplcdt;
	public String taxstmtexne;
	public String taxstmtkind;
	public String taxstmtissudt;
	public String memo;
	public int sellamt;
	public int dcamt;
	public int realsellamt;
	public int un_clamtamt;
	public String rcpmmthd;
	public String rcpmenddt;
	public int payalonamt;
	public String subsyys;
	public String aplcpathcd;
	public String rdr_extntypecd;
	public String suspresncd;
	public String acq_bocd;
	public String acq_bonm;
	public String deli_empno;
	public String deli_empnm;
	public String deli_deptnm;
	public String boprocdt;
	public String dstccd;
	public String dlvno;
	public String bonm;
	public String medinm;
	public String recpclsfnm;
	public String bo_rdr_no;

	public SS_S_BO_READERINFOREADINFOCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setDelidt(String delidt){
		this.delidt = delidt;
	}

	public void setSubsfrser_no(String subsfrser_no){
		this.subsfrser_no = subsfrser_no;
	}

	public void setSubstoser_no(String substoser_no){
		this.substoser_no = substoser_no;
	}

	public void setRdrtel_no1(String rdrtel_no1){
		this.rdrtel_no1 = rdrtel_no1;
	}

	public void setAcqnm(String acqnm){
		this.acqnm = acqnm;
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

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setBidt(String bidt){
		this.bidt = bidt;
	}

	public void setLusoclsfcd(String lusoclsfcd){
		this.lusoclsfcd = lusoclsfcd;
	}

	public void setWeddyn(String weddyn){
		this.weddyn = weddyn;
	}

	public void setWeddanvydt(String weddanvydt){
		this.weddanvydt = weddanvydt;
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

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setPaty_clsfcd(String paty_clsfcd){
		this.paty_clsfcd = paty_clsfcd;
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

	public void setArbtno(String arbtno){
		this.arbtno = arbtno;
	}

	public void setArbtaplcdt(String arbtaplcdt){
		this.arbtaplcdt = arbtaplcdt;
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

	public void setUn_clamtamt(int un_clamtamt){
		this.un_clamtamt = un_clamtamt;
	}

	public void setRcpmmthd(String rcpmmthd){
		this.rcpmmthd = rcpmmthd;
	}

	public void setRcpmenddt(String rcpmenddt){
		this.rcpmenddt = rcpmenddt;
	}

	public void setPayalonamt(int payalonamt){
		this.payalonamt = payalonamt;
	}

	public void setSubsyys(String subsyys){
		this.subsyys = subsyys;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setSuspresncd(String suspresncd){
		this.suspresncd = suspresncd;
	}

	public void setAcq_bocd(String acq_bocd){
		this.acq_bocd = acq_bocd;
	}

	public void setAcq_bonm(String acq_bonm){
		this.acq_bonm = acq_bonm;
	}

	public void setDeli_empno(String deli_empno){
		this.deli_empno = deli_empno;
	}

	public void setDeli_empnm(String deli_empnm){
		this.deli_empnm = deli_empnm;
	}

	public void setDeli_deptnm(String deli_deptnm){
		this.deli_deptnm = deli_deptnm;
	}

	public void setBoprocdt(String boprocdt){
		this.boprocdt = boprocdt;
	}

	public void setDstccd(String dstccd){
		this.dstccd = dstccd;
	}

	public void setDlvno(String dlvno){
		this.dlvno = dlvno;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
	}

	public void setRecpclsfnm(String recpclsfnm){
		this.recpclsfnm = recpclsfnm;
	}

	public void setBo_rdr_no(String bo_rdr_no){
		this.bo_rdr_no = bo_rdr_no;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getDelidt(){
		return this.delidt;
	}

	public String getSubsfrser_no(){
		return this.subsfrser_no;
	}

	public String getSubstoser_no(){
		return this.substoser_no;
	}

	public String getRdrtel_no1(){
		return this.rdrtel_no1;
	}

	public String getAcqnm(){
		return this.acqnm;
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

	public String getPrn(){
		return this.prn;
	}

	public String getEmail(){
		return this.email;
	}

	public String getBidt(){
		return this.bidt;
	}

	public String getLusoclsfcd(){
		return this.lusoclsfcd;
	}

	public String getWeddyn(){
		return this.weddyn;
	}

	public String getWeddanvydt(){
		return this.weddanvydt;
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

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getPaty_clsfcd(){
		return this.paty_clsfcd;
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

	public String getArbtno(){
		return this.arbtno;
	}

	public String getArbtaplcdt(){
		return this.arbtaplcdt;
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

	public int getUn_clamtamt(){
		return this.un_clamtamt;
	}

	public String getRcpmmthd(){
		return this.rcpmmthd;
	}

	public String getRcpmenddt(){
		return this.rcpmenddt;
	}

	public int getPayalonamt(){
		return this.payalonamt;
	}

	public String getSubsyys(){
		return this.subsyys;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getSuspresncd(){
		return this.suspresncd;
	}

	public String getAcq_bocd(){
		return this.acq_bocd;
	}

	public String getAcq_bonm(){
		return this.acq_bonm;
	}

	public String getDeli_empno(){
		return this.deli_empno;
	}

	public String getDeli_empnm(){
		return this.deli_empnm;
	}

	public String getDeli_deptnm(){
		return this.deli_deptnm;
	}

	public String getBoprocdt(){
		return this.boprocdt;
	}

	public String getDstccd(){
		return this.dstccd;
	}

	public String getDlvno(){
		return this.dlvno;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getMedinm(){
		return this.medinm;
	}

	public String getRecpclsfnm(){
		return this.recpclsfnm;
	}

	public String getBo_rdr_no(){
		return this.bo_rdr_no;
	}
}

/* 작성시간 : Fri Jun 15 15:53:01 KST 2007 */