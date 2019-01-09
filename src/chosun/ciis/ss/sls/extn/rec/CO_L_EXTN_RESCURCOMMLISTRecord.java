/***************************************************************************************************
* 파일명 : .java
* 기능 : *확장현황-확장제한-목록
* 작성일자 : 2009-04-06
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.rec;

import java.sql.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.ds.*;

/**
 * 확장현황-확장제한-목록
 */

public class CO_L_EXTN_RESCURCOMMLISTRecord extends java.lang.Object implements java.io.Serializable{

	public String regdt;
	public String regno;
	public String rdr_no;
	public String medicd;
	public String cntrno_susp;
	public String mangno_susp;
	public String cntrno_acpt;
	public String rdr_extndt;
	public String rdr_extnno;
	public String aplcpathcd;
	public String rdr_extntypecd;
	public String extnblngcd;
	public String stafno;
	public String empseq;
	public String boemp_no;
	public String rdr_extnbocd;
	public String extnnm;
	public int rdr_extncost;
	public String subsfr_dt;
	public String freeyn;
	public String freeclsf;
	public String valmm;
	public int subsuprc;
	public int subsqty;
	public int dscnamt;
	public int post_dlvfee;
	public String suspdt;
	public String suspresncd;
	public String bns_itemcd;
	public String resitypecd;
	public String resiclsfcd;
	public String rdrnm;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String dlvzip;
	public String dlvcd;
	public int dlvpyong;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String dlvdong;
	public String dlvser_no;
	public String dlvbnji;
	public String dlvteamcd;
	public String dlvdstccd;
	public String dlvno;
	public String dlvintvno;
	public String dlvmthdcd;
	public String thrw_plac;
	public String clamtmthdcd;
	public String clamtcyclcd;
	public String bocd;
	public String remk;
	public String cns_empcnfmstatcd;
	public String cns_empcnfmocomcd;
	public String cns_empid;
	public String cns_remk;
	public String cns_cnfmdt;
	public String chrg_cnfmstatcd;
	public String chrg_cnfmocomcd;
	public String chrg_id;
	public String chrg_cnfmdt;
	public String chrg_remk;
	public String medicdnm;
	public String bonm;
	public String areanm;
	public String extnbonm;
	public String extnareanm;
	public String cns_empcnfmstatnm;
	public String cns_empcnfmocomnm;
	public String chrg_cnfmstatnm;
	public String chrg_cnfmocomnm;

	public CO_L_EXTN_RESCURCOMMLISTRecord(){}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCntrno_susp(String cntrno_susp){
		this.cntrno_susp = cntrno_susp;
	}

	public void setMangno_susp(String mangno_susp){
		this.mangno_susp = mangno_susp;
	}

	public void setCntrno_acpt(String cntrno_acpt){
		this.cntrno_acpt = cntrno_acpt;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setExtnblngcd(String extnblngcd){
		this.extnblngcd = extnblngcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setRdr_extnbocd(String rdr_extnbocd){
		this.rdr_extnbocd = rdr_extnbocd;
	}

	public void setExtnnm(String extnnm){
		this.extnnm = extnnm;
	}

	public void setRdr_extncost(int rdr_extncost){
		this.rdr_extncost = rdr_extncost;
	}

	public void setSubsfr_dt(String subsfr_dt){
		this.subsfr_dt = subsfr_dt;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setFreeclsf(String freeclsf){
		this.freeclsf = freeclsf;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setSubsuprc(int subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setSubsqty(int subsqty){
		this.subsqty = subsqty;
	}

	public void setDscnamt(int dscnamt){
		this.dscnamt = dscnamt;
	}

	public void setPost_dlvfee(int post_dlvfee){
		this.post_dlvfee = post_dlvfee;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setSuspresncd(String suspresncd){
		this.suspresncd = suspresncd;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
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

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvcd(String dlvcd){
		this.dlvcd = dlvcd;
	}

	public void setDlvpyong(int dlvpyong){
		this.dlvpyong = dlvpyong;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setDlvdong(String dlvdong){
		this.dlvdong = dlvdong;
	}

	public void setDlvser_no(String dlvser_no){
		this.dlvser_no = dlvser_no;
	}

	public void setDlvbnji(String dlvbnji){
		this.dlvbnji = dlvbnji;
	}

	public void setDlvteamcd(String dlvteamcd){
		this.dlvteamcd = dlvteamcd;
	}

	public void setDlvdstccd(String dlvdstccd){
		this.dlvdstccd = dlvdstccd;
	}

	public void setDlvno(String dlvno){
		this.dlvno = dlvno;
	}

	public void setDlvintvno(String dlvintvno){
		this.dlvintvno = dlvintvno;
	}

	public void setDlvmthdcd(String dlvmthdcd){
		this.dlvmthdcd = dlvmthdcd;
	}

	public void setThrw_plac(String thrw_plac){
		this.thrw_plac = thrw_plac;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setClamtcyclcd(String clamtcyclcd){
		this.clamtcyclcd = clamtcyclcd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setCns_empcnfmstatcd(String cns_empcnfmstatcd){
		this.cns_empcnfmstatcd = cns_empcnfmstatcd;
	}

	public void setCns_empcnfmocomcd(String cns_empcnfmocomcd){
		this.cns_empcnfmocomcd = cns_empcnfmocomcd;
	}

	public void setCns_empid(String cns_empid){
		this.cns_empid = cns_empid;
	}

	public void setCns_remk(String cns_remk){
		this.cns_remk = cns_remk;
	}

	public void setCns_cnfmdt(String cns_cnfmdt){
		this.cns_cnfmdt = cns_cnfmdt;
	}

	public void setChrg_cnfmstatcd(String chrg_cnfmstatcd){
		this.chrg_cnfmstatcd = chrg_cnfmstatcd;
	}

	public void setChrg_cnfmocomcd(String chrg_cnfmocomcd){
		this.chrg_cnfmocomcd = chrg_cnfmocomcd;
	}

	public void setChrg_id(String chrg_id){
		this.chrg_id = chrg_id;
	}

	public void setChrg_cnfmdt(String chrg_cnfmdt){
		this.chrg_cnfmdt = chrg_cnfmdt;
	}

	public void setChrg_remk(String chrg_remk){
		this.chrg_remk = chrg_remk;
	}

	public void setMedicdnm(String medicdnm){
		this.medicdnm = medicdnm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setExtnbonm(String extnbonm){
		this.extnbonm = extnbonm;
	}

	public void setExtnareanm(String extnareanm){
		this.extnareanm = extnareanm;
	}

	public void setCns_empcnfmstatnm(String cns_empcnfmstatnm){
		this.cns_empcnfmstatnm = cns_empcnfmstatnm;
	}

	public void setCns_empcnfmocomnm(String cns_empcnfmocomnm){
		this.cns_empcnfmocomnm = cns_empcnfmocomnm;
	}

	public void setChrg_cnfmstatnm(String chrg_cnfmstatnm){
		this.chrg_cnfmstatnm = chrg_cnfmstatnm;
	}

	public void setChrg_cnfmocomnm(String chrg_cnfmocomnm){
		this.chrg_cnfmocomnm = chrg_cnfmocomnm;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCntrno_susp(){
		return this.cntrno_susp;
	}

	public String getMangno_susp(){
		return this.mangno_susp;
	}

	public String getCntrno_acpt(){
		return this.cntrno_acpt;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getExtnblngcd(){
		return this.extnblngcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getRdr_extnbocd(){
		return this.rdr_extnbocd;
	}

	public String getExtnnm(){
		return this.extnnm;
	}

	public int getRdr_extncost(){
		return this.rdr_extncost;
	}

	public String getSubsfr_dt(){
		return this.subsfr_dt;
	}

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getFreeclsf(){
		return this.freeclsf;
	}

	public String getValmm(){
		return this.valmm;
	}

	public int getSubsuprc(){
		return this.subsuprc;
	}

	public int getSubsqty(){
		return this.subsqty;
	}

	public int getDscnamt(){
		return this.dscnamt;
	}

	public int getPost_dlvfee(){
		return this.post_dlvfee;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getSuspresncd(){
		return this.suspresncd;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
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

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvcd(){
		return this.dlvcd;
	}

	public int getDlvpyong(){
		return this.dlvpyong;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getDlvdong(){
		return this.dlvdong;
	}

	public String getDlvser_no(){
		return this.dlvser_no;
	}

	public String getDlvbnji(){
		return this.dlvbnji;
	}

	public String getDlvteamcd(){
		return this.dlvteamcd;
	}

	public String getDlvdstccd(){
		return this.dlvdstccd;
	}

	public String getDlvno(){
		return this.dlvno;
	}

	public String getDlvintvno(){
		return this.dlvintvno;
	}

	public String getDlvmthdcd(){
		return this.dlvmthdcd;
	}

	public String getThrw_plac(){
		return this.thrw_plac;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getClamtcyclcd(){
		return this.clamtcyclcd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getCns_empcnfmstatcd(){
		return this.cns_empcnfmstatcd;
	}

	public String getCns_empcnfmocomcd(){
		return this.cns_empcnfmocomcd;
	}

	public String getCns_empid(){
		return this.cns_empid;
	}

	public String getCns_remk(){
		return this.cns_remk;
	}

	public String getCns_cnfmdt(){
		return this.cns_cnfmdt;
	}

	public String getChrg_cnfmstatcd(){
		return this.chrg_cnfmstatcd;
	}

	public String getChrg_cnfmocomcd(){
		return this.chrg_cnfmocomcd;
	}

	public String getChrg_id(){
		return this.chrg_id;
	}

	public String getChrg_cnfmdt(){
		return this.chrg_cnfmdt;
	}

	public String getChrg_remk(){
		return this.chrg_remk;
	}

	public String getMedicdnm(){
		return this.medicdnm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getExtnbonm(){
		return this.extnbonm;
	}

	public String getExtnareanm(){
		return this.extnareanm;
	}

	public String getCns_empcnfmstatnm(){
		return this.cns_empcnfmstatnm;
	}

	public String getCns_empcnfmocomnm(){
		return this.cns_empcnfmocomnm;
	}

	public String getChrg_cnfmstatnm(){
		return this.chrg_cnfmstatnm;
	}

	public String getChrg_cnfmocomnm(){
		return this.chrg_cnfmocomnm;
	}
}

/* 작성시간 : Mon Apr 06 21:27:50 KST 2009 */