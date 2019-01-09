/***************************************************************************************************
* 파일명 : SP_PS_S_RDR_CMPROBJ.java
* 기능 :   독자-중재처리 비교대상내역 상세조회화면
* 작성일자 : 2004-02-23
* 작성자 : 김건호 
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
 * 독자-중재처리 비교대상내역 상세조회화면
 *
 */


public class PS_S_RDR_CMPROBJPUBLRDRCURRecord extends java.lang.Object implements java.io.Serializable{

	public String rdr_no;
	public String rdr_nm;
	public String bonm;
	public String arbtaplcdt;
	public String arbtno;
	public String medinm;
	public String paty_clsfcd;
	public String prn;
	public String email;
	public String bidt;
	public String lusoclsfcd;
	public String subsfrser_no;
	public String rdrtel_no;
	public String rdrptph_no;
	public String rdroffinm;
	public String rdroffitel_no;
	public String rdrposi;
	public String recpclsf;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String dlvzip;
	public String sendmthd;
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
	public String clamplzip;
	public String clampladdr;
	public String clampldtlsaddr;
	public String acpntypeclsf;
	public String acpntypecd;
	public String linkyear;
	public String sendyncd;
	public String alonpaycd;
	public String amno;
	public String hdqtemp_no;
	public String mang_empno;
	public String rdr_extnno;
	public String taxstmtexne;
	public String taxstmtissudt;
	public String memo;

	public PS_S_RDR_CMPROBJPUBLRDRCURRecord(){}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdr_nm(String rdr_nm){
		this.rdr_nm = rdr_nm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setArbtaplcdt(String arbtaplcdt){
		this.arbtaplcdt = arbtaplcdt;
	}

	public void setArbtno(String arbtno){
		this.arbtno = arbtno;
	}

	public void setMedinm(String medinm){
		this.medinm = medinm;
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

	public void setBidt(String bidt){
		this.bidt = bidt;
	}

	public void setLusoclsfcd(String lusoclsfcd){
		this.lusoclsfcd = lusoclsfcd;
	}

	public void setSubsfrser_no(String subsfrser_no){
		this.subsfrser_no = subsfrser_no;
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

	public void setRecpclsf(String recpclsf){
		this.recpclsf = recpclsf;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setSendmthd(String sendmthd){
		this.sendmthd = sendmthd;
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

	public void setLinkyear(String linkyear){
		this.linkyear = linkyear;
	}

	public void setSendyncd(String sendyncd){
		this.sendyncd = sendyncd;
	}

	public void setAlonpaycd(String alonpaycd){
		this.alonpaycd = alonpaycd;
	}

	public void setAmno(String amno){
		this.amno = amno;
	}

	public void setHdqtemp_no(String hdqtemp_no){
		this.hdqtemp_no = hdqtemp_no;
	}

	public void setMang_empno(String mang_empno){
		this.mang_empno = mang_empno;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
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

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdr_nm(){
		return this.rdr_nm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getArbtaplcdt(){
		return this.arbtaplcdt;
	}

	public String getArbtno(){
		return this.arbtno;
	}

	public String getMedinm(){
		return this.medinm;
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

	public String getBidt(){
		return this.bidt;
	}

	public String getLusoclsfcd(){
		return this.lusoclsfcd;
	}

	public String getSubsfrser_no(){
		return this.subsfrser_no;
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

	public String getRecpclsf(){
		return this.recpclsf;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getSendmthd(){
		return this.sendmthd;
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

	public String getLinkyear(){
		return this.linkyear;
	}

	public String getSendyncd(){
		return this.sendyncd;
	}

	public String getAlonpaycd(){
		return this.alonpaycd;
	}

	public String getAmno(){
		return this.amno;
	}

	public String getHdqtemp_no(){
		return this.hdqtemp_no;
	}

	public String getMang_empno(){
		return this.mang_empno;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
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
}

/* 작성시간 : Fri Feb 27 15:39:41 KST 2004 */