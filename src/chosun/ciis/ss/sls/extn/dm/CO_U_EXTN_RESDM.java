/***************************************************************************************************
 * 파일명   : SP_CO_U_EXTN_RES
 * 기능     : 확장현황-확장제한-담당확인
 * 작성일자 : 2007/07/16
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
**  SP_CO_U_EXTN_RES
**/

public class CO_U_EXTN_RESDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String slssclsf;
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
	public long rdr_extncost;
	public String subsfr_dt;
	public String freeyn;
	public String freeclsf;
	public String valmm;
	public long subsuprc;
	public long subsqty;
	public long dscnamt;
	public long post_dlvfee;
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
	public long dlvpyong;
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
	public Timestamp cns_cnfmdt;
	public String chrg_cnfmstatcd;
	public String chrg_cnfmocomcd;
	public String chrg_id;
	public Timestamp chrg_cnfmdt;
	public String chrg_remk;
	public String incmgdt;
	public String incmgpers;
	public String chgdt;
	public String chgpers;
	public String deptcd;
	public String areacd;

	public CO_U_EXTN_RESDM(){}
	public CO_U_EXTN_RESDM(String slssclsf, String regdt, String regno, String rdr_no, String medicd, String cntrno_susp, String mangno_susp, String cntrno_acpt, String rdr_extndt, String rdr_extnno, String aplcpathcd, String rdr_extntypecd, String extnblngcd, String stafno, String empseq, String boemp_no, String rdr_extnbocd, String extnnm, long rdr_extncost, String subsfr_dt, String freeyn, String freeclsf, String valmm, long subsuprc, long subsqty, long dscnamt, long post_dlvfee, String suspdt, String suspresncd, String bns_itemcd, String resitypecd, String resiclsfcd, String rdrnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String dlvzip, String dlvcd, long dlvpyong, String dlvaddr, String dlvdtlsaddr, String dlvdong, String dlvser_no, String dlvbnji, String dlvteamcd, String dlvdstccd, String dlvno, String dlvintvno, String dlvmthdcd, String thrw_plac, String clamtmthdcd, String clamtcyclcd, String bocd, String remk, String cns_empcnfmstatcd, String cns_empcnfmocomcd, String cns_empid, String cns_remk, Timestamp cns_cnfmdt, String chrg_cnfmstatcd, String chrg_cnfmocomcd, String chrg_id, Timestamp chrg_cnfmdt, String chrg_remk, String incmgdt, String incmgpers, String chgdt, String chgpers, String deptcd, String areacd){
		this.slssclsf = slssclsf;
		this.regdt = regdt;
		this.regno = regno;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.cntrno_susp = cntrno_susp;
		this.mangno_susp = mangno_susp;
		this.cntrno_acpt = cntrno_acpt;
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.aplcpathcd = aplcpathcd;
		this.rdr_extntypecd = rdr_extntypecd;
		this.extnblngcd = extnblngcd;
		this.stafno = stafno;
		this.empseq = empseq;
		this.boemp_no = boemp_no;
		this.rdr_extnbocd = rdr_extnbocd;
		this.extnnm = extnnm;
		this.rdr_extncost = rdr_extncost;
		this.subsfr_dt = subsfr_dt;
		this.freeyn = freeyn;
		this.freeclsf = freeclsf;
		this.valmm = valmm;
		this.subsuprc = subsuprc;
		this.subsqty = subsqty;
		this.dscnamt = dscnamt;
		this.post_dlvfee = post_dlvfee;
		this.suspdt = suspdt;
		this.suspresncd = suspresncd;
		this.bns_itemcd = bns_itemcd;
		this.resitypecd = resitypecd;
		this.resiclsfcd = resiclsfcd;
		this.rdrnm = rdrnm;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.dlvzip = dlvzip;
		this.dlvcd = dlvcd;
		this.dlvpyong = dlvpyong;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.dlvdong = dlvdong;
		this.dlvser_no = dlvser_no;
		this.dlvbnji = dlvbnji;
		this.dlvteamcd = dlvteamcd;
		this.dlvdstccd = dlvdstccd;
		this.dlvno = dlvno;
		this.dlvintvno = dlvintvno;
		this.dlvmthdcd = dlvmthdcd;
		this.thrw_plac = thrw_plac;
		this.clamtmthdcd = clamtmthdcd;
		this.clamtcyclcd = clamtcyclcd;
		this.bocd = bocd;
		this.remk = remk;
		this.cns_empcnfmstatcd = cns_empcnfmstatcd;
		this.cns_empcnfmocomcd = cns_empcnfmocomcd;
		this.cns_empid = cns_empid;
		this.cns_remk = cns_remk;
		this.cns_cnfmdt = cns_cnfmdt;
		this.chrg_cnfmstatcd = chrg_cnfmstatcd;
		this.chrg_cnfmocomcd = chrg_cnfmocomcd;
		this.chrg_id = chrg_id;
		this.chrg_cnfmdt = chrg_cnfmdt;
		this.chrg_remk = chrg_remk;
		this.incmgdt = incmgdt;
		this.incmgpers = incmgpers;
		this.chgdt = chgdt;
		this.chgpers = chgpers;
		this.deptcd = deptcd;
		this.areacd = areacd;
	}

	public void setSlssclsf(String slssclsf){
		this.slssclsf = slssclsf;
	}

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

	public void setRdr_extncost(long rdr_extncost){
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

	public void setSubsuprc(long subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setSubsqty(long subsqty){
		this.subsqty = subsqty;
	}

	public void setDscnamt(long dscnamt){
		this.dscnamt = dscnamt;
	}

	public void setPost_dlvfee(long post_dlvfee){
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

	public void setDlvpyong(long dlvpyong){
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

	public void setCns_cnfmdt(Timestamp cns_cnfmdt){
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

	public void setChrg_cnfmdt(Timestamp chrg_cnfmdt){
		this.chrg_cnfmdt = chrg_cnfmdt;
	}

	public void setChrg_remk(String chrg_remk){
		this.chrg_remk = chrg_remk;
	}

	public void setIncmgdt(String incmgdt){
		this.incmgdt = incmgdt;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setChgdt(String chgdt){
		this.chgdt = chgdt;
	}

	public void setChgpers(String chgpers){
		this.chgpers = chgpers;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public String getSlssclsf(){
		return this.slssclsf;
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

	public long getRdr_extncost(){
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

	public long getSubsuprc(){
		return this.subsuprc;
	}

	public long getSubsqty(){
		return this.subsqty;
	}

	public long getDscnamt(){
		return this.dscnamt;
	}

	public long getPost_dlvfee(){
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

	public long getDlvpyong(){
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

	public Timestamp getCns_cnfmdt(){
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

	public Timestamp getChrg_cnfmdt(){
		return this.chrg_cnfmdt;
	}

	public String getChrg_remk(){
		return this.chrg_remk;
	}

	public String getIncmgdt(){
		return this.incmgdt;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getChgdt(){
		return this.chgdt;
	}

	public String getChgpers(){
		return this.chgpers;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getSQL(){
		 return "{ call SP_CO_U_EXTN_RES( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_U_EXTN_RESDM dm = (CO_U_EXTN_RESDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.slssclsf);
		cstmt.setString(4, dm.regdt);
		cstmt.setString(5, dm.regno);
		cstmt.setString(6, dm.rdr_no);
		cstmt.setString(7, dm.medicd);
		cstmt.setString(8, dm.cntrno_susp);
		cstmt.setString(9, dm.mangno_susp);
		cstmt.setString(10, dm.cntrno_acpt);
		cstmt.setString(11, dm.rdr_extndt);
		cstmt.setString(12, dm.rdr_extnno);
		cstmt.setString(13, dm.aplcpathcd);
		cstmt.setString(14, dm.rdr_extntypecd);
		cstmt.setString(15, dm.extnblngcd);
		cstmt.setString(16, dm.stafno);
		cstmt.setString(17, dm.empseq);
		cstmt.setString(18, dm.boemp_no);
		cstmt.setString(19, dm.rdr_extnbocd);
		cstmt.setString(20, dm.extnnm);
		cstmt.setLong(21, dm.rdr_extncost);
		cstmt.setString(22, dm.subsfr_dt);
		cstmt.setString(23, dm.freeyn);
		cstmt.setString(24, dm.freeclsf);
		cstmt.setString(25, dm.valmm);
		cstmt.setLong(26, dm.subsuprc);
		cstmt.setLong(27, dm.subsqty);
		cstmt.setLong(28, dm.dscnamt);
		cstmt.setLong(29, dm.post_dlvfee);
		cstmt.setString(30, dm.suspdt);
		cstmt.setString(31, dm.suspresncd);
		cstmt.setString(32, dm.bns_itemcd);
		cstmt.setString(33, dm.resitypecd);
		cstmt.setString(34, dm.resiclsfcd);
		cstmt.setString(35, dm.rdrnm);
		cstmt.setString(36, dm.rdrtel_no1);
		cstmt.setString(37, dm.rdrtel_no2);
		cstmt.setString(38, dm.rdrtel_no3);
		cstmt.setString(39, dm.rdrptph_no1);
		cstmt.setString(40, dm.rdrptph_no2);
		cstmt.setString(41, dm.rdrptph_no3);
		cstmt.setString(42, dm.dlvzip);
		cstmt.setString(43, dm.dlvcd);
		cstmt.setLong(44, dm.dlvpyong);
		cstmt.setString(45, dm.dlvaddr);
		cstmt.setString(46, dm.dlvdtlsaddr);
		cstmt.setString(47, dm.dlvdong);
		cstmt.setString(48, dm.dlvser_no);
		cstmt.setString(49, dm.dlvbnji);
		cstmt.setString(50, dm.dlvteamcd);
		cstmt.setString(51, dm.dlvdstccd);
		cstmt.setString(52, dm.dlvno);
		cstmt.setString(53, dm.dlvintvno);
		cstmt.setString(54, dm.dlvmthdcd);
		cstmt.setString(55, dm.thrw_plac);
		cstmt.setString(56, dm.clamtmthdcd);
		cstmt.setString(57, dm.clamtcyclcd);
		cstmt.setString(58, dm.bocd);
		cstmt.setString(59, dm.remk);
		cstmt.setString(60, dm.cns_empcnfmstatcd);
		cstmt.setString(61, dm.cns_empcnfmocomcd);
		cstmt.setString(62, dm.cns_empid);
		cstmt.setString(63, dm.cns_remk);
		cstmt.setTimestamp(64, dm.cns_cnfmdt);
		cstmt.setString(65, dm.chrg_cnfmstatcd);
		cstmt.setString(66, dm.chrg_cnfmocomcd);
		cstmt.setString(67, dm.chrg_id);
		cstmt.setTimestamp(68, dm.chrg_cnfmdt);
		cstmt.setString(69, dm.chrg_remk);
		cstmt.setString(70, dm.incmgdt);
		cstmt.setString(71, dm.incmgpers);
		cstmt.setString(72, dm.chgdt);
		cstmt.setString(73, dm.chgpers);
		cstmt.setString(74, dm.deptcd);
		cstmt.setString(75, dm.areacd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.CO_U_EXTN_RESDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String slssclsf = req.getParameter("slssclsf");
if( slssclsf == null){
	System.out.println(this.toString+" : slssclsf is null" );
}else{
	System.out.println(this.toString+" : slssclsf is "+slssclsf );
}
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
}
String regno = req.getParameter("regno");
if( regno == null){
	System.out.println(this.toString+" : regno is null" );
}else{
	System.out.println(this.toString+" : regno is "+regno );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String cntrno_susp = req.getParameter("cntrno_susp");
if( cntrno_susp == null){
	System.out.println(this.toString+" : cntrno_susp is null" );
}else{
	System.out.println(this.toString+" : cntrno_susp is "+cntrno_susp );
}
String mangno_susp = req.getParameter("mangno_susp");
if( mangno_susp == null){
	System.out.println(this.toString+" : mangno_susp is null" );
}else{
	System.out.println(this.toString+" : mangno_susp is "+mangno_susp );
}
String cntrno_acpt = req.getParameter("cntrno_acpt");
if( cntrno_acpt == null){
	System.out.println(this.toString+" : cntrno_acpt is null" );
}else{
	System.out.println(this.toString+" : cntrno_acpt is "+cntrno_acpt );
}
String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
	System.out.println(this.toString+" : rdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
	System.out.println(this.toString+" : rdr_extnno is null" );
}else{
	System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
}
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
}
String rdr_extntypecd = req.getParameter("rdr_extntypecd");
if( rdr_extntypecd == null){
	System.out.println(this.toString+" : rdr_extntypecd is null" );
}else{
	System.out.println(this.toString+" : rdr_extntypecd is "+rdr_extntypecd );
}
String extnblngcd = req.getParameter("extnblngcd");
if( extnblngcd == null){
	System.out.println(this.toString+" : extnblngcd is null" );
}else{
	System.out.println(this.toString+" : extnblngcd is "+extnblngcd );
}
String stafno = req.getParameter("stafno");
if( stafno == null){
	System.out.println(this.toString+" : stafno is null" );
}else{
	System.out.println(this.toString+" : stafno is "+stafno );
}
String empseq = req.getParameter("empseq");
if( empseq == null){
	System.out.println(this.toString+" : empseq is null" );
}else{
	System.out.println(this.toString+" : empseq is "+empseq );
}
String boemp_no = req.getParameter("boemp_no");
if( boemp_no == null){
	System.out.println(this.toString+" : boemp_no is null" );
}else{
	System.out.println(this.toString+" : boemp_no is "+boemp_no );
}
String rdr_extnbocd = req.getParameter("rdr_extnbocd");
if( rdr_extnbocd == null){
	System.out.println(this.toString+" : rdr_extnbocd is null" );
}else{
	System.out.println(this.toString+" : rdr_extnbocd is "+rdr_extnbocd );
}
String extnnm = req.getParameter("extnnm");
if( extnnm == null){
	System.out.println(this.toString+" : extnnm is null" );
}else{
	System.out.println(this.toString+" : extnnm is "+extnnm );
}
String rdr_extncost = req.getParameter("rdr_extncost");
if( rdr_extncost == null){
	System.out.println(this.toString+" : rdr_extncost is null" );
}else{
	System.out.println(this.toString+" : rdr_extncost is "+rdr_extncost );
}
String subsfr_dt = req.getParameter("subsfr_dt");
if( subsfr_dt == null){
	System.out.println(this.toString+" : subsfr_dt is null" );
}else{
	System.out.println(this.toString+" : subsfr_dt is "+subsfr_dt );
}
String freeyn = req.getParameter("freeyn");
if( freeyn == null){
	System.out.println(this.toString+" : freeyn is null" );
}else{
	System.out.println(this.toString+" : freeyn is "+freeyn );
}
String freeclsf = req.getParameter("freeclsf");
if( freeclsf == null){
	System.out.println(this.toString+" : freeclsf is null" );
}else{
	System.out.println(this.toString+" : freeclsf is "+freeclsf );
}
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
String subsuprc = req.getParameter("subsuprc");
if( subsuprc == null){
	System.out.println(this.toString+" : subsuprc is null" );
}else{
	System.out.println(this.toString+" : subsuprc is "+subsuprc );
}
String subsqty = req.getParameter("subsqty");
if( subsqty == null){
	System.out.println(this.toString+" : subsqty is null" );
}else{
	System.out.println(this.toString+" : subsqty is "+subsqty );
}
String dscnamt = req.getParameter("dscnamt");
if( dscnamt == null){
	System.out.println(this.toString+" : dscnamt is null" );
}else{
	System.out.println(this.toString+" : dscnamt is "+dscnamt );
}
String post_dlvfee = req.getParameter("post_dlvfee");
if( post_dlvfee == null){
	System.out.println(this.toString+" : post_dlvfee is null" );
}else{
	System.out.println(this.toString+" : post_dlvfee is "+post_dlvfee );
}
String suspdt = req.getParameter("suspdt");
if( suspdt == null){
	System.out.println(this.toString+" : suspdt is null" );
}else{
	System.out.println(this.toString+" : suspdt is "+suspdt );
}
String suspresncd = req.getParameter("suspresncd");
if( suspresncd == null){
	System.out.println(this.toString+" : suspresncd is null" );
}else{
	System.out.println(this.toString+" : suspresncd is "+suspresncd );
}
String bns_itemcd = req.getParameter("bns_itemcd");
if( bns_itemcd == null){
	System.out.println(this.toString+" : bns_itemcd is null" );
}else{
	System.out.println(this.toString+" : bns_itemcd is "+bns_itemcd );
}
String resitypecd = req.getParameter("resitypecd");
if( resitypecd == null){
	System.out.println(this.toString+" : resitypecd is null" );
}else{
	System.out.println(this.toString+" : resitypecd is "+resitypecd );
}
String resiclsfcd = req.getParameter("resiclsfcd");
if( resiclsfcd == null){
	System.out.println(this.toString+" : resiclsfcd is null" );
}else{
	System.out.println(this.toString+" : resiclsfcd is "+resiclsfcd );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String rdrtel_no1 = req.getParameter("rdrtel_no1");
if( rdrtel_no1 == null){
	System.out.println(this.toString+" : rdrtel_no1 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no1 is "+rdrtel_no1 );
}
String rdrtel_no2 = req.getParameter("rdrtel_no2");
if( rdrtel_no2 == null){
	System.out.println(this.toString+" : rdrtel_no2 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no2 is "+rdrtel_no2 );
}
String rdrtel_no3 = req.getParameter("rdrtel_no3");
if( rdrtel_no3 == null){
	System.out.println(this.toString+" : rdrtel_no3 is null" );
}else{
	System.out.println(this.toString+" : rdrtel_no3 is "+rdrtel_no3 );
}
String rdrptph_no1 = req.getParameter("rdrptph_no1");
if( rdrptph_no1 == null){
	System.out.println(this.toString+" : rdrptph_no1 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no1 is "+rdrptph_no1 );
}
String rdrptph_no2 = req.getParameter("rdrptph_no2");
if( rdrptph_no2 == null){
	System.out.println(this.toString+" : rdrptph_no2 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no2 is "+rdrptph_no2 );
}
String rdrptph_no3 = req.getParameter("rdrptph_no3");
if( rdrptph_no3 == null){
	System.out.println(this.toString+" : rdrptph_no3 is null" );
}else{
	System.out.println(this.toString+" : rdrptph_no3 is "+rdrptph_no3 );
}
String dlvzip = req.getParameter("dlvzip");
if( dlvzip == null){
	System.out.println(this.toString+" : dlvzip is null" );
}else{
	System.out.println(this.toString+" : dlvzip is "+dlvzip );
}
String dlvcd = req.getParameter("dlvcd");
if( dlvcd == null){
	System.out.println(this.toString+" : dlvcd is null" );
}else{
	System.out.println(this.toString+" : dlvcd is "+dlvcd );
}
String dlvpyong = req.getParameter("dlvpyong");
if( dlvpyong == null){
	System.out.println(this.toString+" : dlvpyong is null" );
}else{
	System.out.println(this.toString+" : dlvpyong is "+dlvpyong );
}
String dlvaddr = req.getParameter("dlvaddr");
if( dlvaddr == null){
	System.out.println(this.toString+" : dlvaddr is null" );
}else{
	System.out.println(this.toString+" : dlvaddr is "+dlvaddr );
}
String dlvdtlsaddr = req.getParameter("dlvdtlsaddr");
if( dlvdtlsaddr == null){
	System.out.println(this.toString+" : dlvdtlsaddr is null" );
}else{
	System.out.println(this.toString+" : dlvdtlsaddr is "+dlvdtlsaddr );
}
String dlvdong = req.getParameter("dlvdong");
if( dlvdong == null){
	System.out.println(this.toString+" : dlvdong is null" );
}else{
	System.out.println(this.toString+" : dlvdong is "+dlvdong );
}
String dlvser_no = req.getParameter("dlvser_no");
if( dlvser_no == null){
	System.out.println(this.toString+" : dlvser_no is null" );
}else{
	System.out.println(this.toString+" : dlvser_no is "+dlvser_no );
}
String dlvbnji = req.getParameter("dlvbnji");
if( dlvbnji == null){
	System.out.println(this.toString+" : dlvbnji is null" );
}else{
	System.out.println(this.toString+" : dlvbnji is "+dlvbnji );
}
String dlvteamcd = req.getParameter("dlvteamcd");
if( dlvteamcd == null){
	System.out.println(this.toString+" : dlvteamcd is null" );
}else{
	System.out.println(this.toString+" : dlvteamcd is "+dlvteamcd );
}
String dlvdstccd = req.getParameter("dlvdstccd");
if( dlvdstccd == null){
	System.out.println(this.toString+" : dlvdstccd is null" );
}else{
	System.out.println(this.toString+" : dlvdstccd is "+dlvdstccd );
}
String dlvno = req.getParameter("dlvno");
if( dlvno == null){
	System.out.println(this.toString+" : dlvno is null" );
}else{
	System.out.println(this.toString+" : dlvno is "+dlvno );
}
String dlvintvno = req.getParameter("dlvintvno");
if( dlvintvno == null){
	System.out.println(this.toString+" : dlvintvno is null" );
}else{
	System.out.println(this.toString+" : dlvintvno is "+dlvintvno );
}
String dlvmthdcd = req.getParameter("dlvmthdcd");
if( dlvmthdcd == null){
	System.out.println(this.toString+" : dlvmthdcd is null" );
}else{
	System.out.println(this.toString+" : dlvmthdcd is "+dlvmthdcd );
}
String thrw_plac = req.getParameter("thrw_plac");
if( thrw_plac == null){
	System.out.println(this.toString+" : thrw_plac is null" );
}else{
	System.out.println(this.toString+" : thrw_plac is "+thrw_plac );
}
String clamtmthdcd = req.getParameter("clamtmthdcd");
if( clamtmthdcd == null){
	System.out.println(this.toString+" : clamtmthdcd is null" );
}else{
	System.out.println(this.toString+" : clamtmthdcd is "+clamtmthdcd );
}
String clamtcyclcd = req.getParameter("clamtcyclcd");
if( clamtcyclcd == null){
	System.out.println(this.toString+" : clamtcyclcd is null" );
}else{
	System.out.println(this.toString+" : clamtcyclcd is "+clamtcyclcd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String cns_empcnfmstatcd = req.getParameter("cns_empcnfmstatcd");
if( cns_empcnfmstatcd == null){
	System.out.println(this.toString+" : cns_empcnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : cns_empcnfmstatcd is "+cns_empcnfmstatcd );
}
String cns_empcnfmocomcd = req.getParameter("cns_empcnfmocomcd");
if( cns_empcnfmocomcd == null){
	System.out.println(this.toString+" : cns_empcnfmocomcd is null" );
}else{
	System.out.println(this.toString+" : cns_empcnfmocomcd is "+cns_empcnfmocomcd );
}
String cns_empid = req.getParameter("cns_empid");
if( cns_empid == null){
	System.out.println(this.toString+" : cns_empid is null" );
}else{
	System.out.println(this.toString+" : cns_empid is "+cns_empid );
}
String cns_remk = req.getParameter("cns_remk");
if( cns_remk == null){
	System.out.println(this.toString+" : cns_remk is null" );
}else{
	System.out.println(this.toString+" : cns_remk is "+cns_remk );
}
String cns_cnfmdt = req.getParameter("cns_cnfmdt");
if( cns_cnfmdt == null){
	System.out.println(this.toString+" : cns_cnfmdt is null" );
}else{
	System.out.println(this.toString+" : cns_cnfmdt is "+cns_cnfmdt );
}
String chrg_cnfmstatcd = req.getParameter("chrg_cnfmstatcd");
if( chrg_cnfmstatcd == null){
	System.out.println(this.toString+" : chrg_cnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : chrg_cnfmstatcd is "+chrg_cnfmstatcd );
}
String chrg_cnfmocomcd = req.getParameter("chrg_cnfmocomcd");
if( chrg_cnfmocomcd == null){
	System.out.println(this.toString+" : chrg_cnfmocomcd is null" );
}else{
	System.out.println(this.toString+" : chrg_cnfmocomcd is "+chrg_cnfmocomcd );
}
String chrg_id = req.getParameter("chrg_id");
if( chrg_id == null){
	System.out.println(this.toString+" : chrg_id is null" );
}else{
	System.out.println(this.toString+" : chrg_id is "+chrg_id );
}
String chrg_cnfmdt = req.getParameter("chrg_cnfmdt");
if( chrg_cnfmdt == null){
	System.out.println(this.toString+" : chrg_cnfmdt is null" );
}else{
	System.out.println(this.toString+" : chrg_cnfmdt is "+chrg_cnfmdt );
}
String chrg_remk = req.getParameter("chrg_remk");
if( chrg_remk == null){
	System.out.println(this.toString+" : chrg_remk is null" );
}else{
	System.out.println(this.toString+" : chrg_remk is "+chrg_remk );
}
String incmgdt = req.getParameter("incmgdt");
if( incmgdt == null){
	System.out.println(this.toString+" : incmgdt is null" );
}else{
	System.out.println(this.toString+" : incmgdt is "+incmgdt );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String chgdt = req.getParameter("chgdt");
if( chgdt == null){
	System.out.println(this.toString+" : chgdt is null" );
}else{
	System.out.println(this.toString+" : chgdt is "+chgdt );
}
String chgpers = req.getParameter("chgpers");
if( chgpers == null){
	System.out.println(this.toString+" : chgpers is null" );
}else{
	System.out.println(this.toString+" : chgpers is "+chgpers );
}
String deptcd = req.getParameter("deptcd");
if( deptcd == null){
	System.out.println(this.toString+" : deptcd is null" );
}else{
	System.out.println(this.toString+" : deptcd is "+deptcd );
}
String areacd = req.getParameter("areacd");
if( areacd == null){
	System.out.println(this.toString+" : areacd is null" );
}else{
	System.out.println(this.toString+" : areacd is "+areacd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String slssclsf = Util.checkString(req.getParameter("slssclsf"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String cntrno_susp = Util.checkString(req.getParameter("cntrno_susp"));
String mangno_susp = Util.checkString(req.getParameter("mangno_susp"));
String cntrno_acpt = Util.checkString(req.getParameter("cntrno_acpt"));
String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String rdr_extntypecd = Util.checkString(req.getParameter("rdr_extntypecd"));
String extnblngcd = Util.checkString(req.getParameter("extnblngcd"));
String stafno = Util.checkString(req.getParameter("stafno"));
String empseq = Util.checkString(req.getParameter("empseq"));
String boemp_no = Util.checkString(req.getParameter("boemp_no"));
String rdr_extnbocd = Util.checkString(req.getParameter("rdr_extnbocd"));
String extnnm = Util.checkString(req.getParameter("extnnm"));
String rdr_extncost = Util.checkString(req.getParameter("rdr_extncost"));
String subsfr_dt = Util.checkString(req.getParameter("subsfr_dt"));
String freeyn = Util.checkString(req.getParameter("freeyn"));
String freeclsf = Util.checkString(req.getParameter("freeclsf"));
String valmm = Util.checkString(req.getParameter("valmm"));
String subsuprc = Util.checkString(req.getParameter("subsuprc"));
String subsqty = Util.checkString(req.getParameter("subsqty"));
String dscnamt = Util.checkString(req.getParameter("dscnamt"));
String post_dlvfee = Util.checkString(req.getParameter("post_dlvfee"));
String suspdt = Util.checkString(req.getParameter("suspdt"));
String suspresncd = Util.checkString(req.getParameter("suspresncd"));
String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
String resitypecd = Util.checkString(req.getParameter("resitypecd"));
String resiclsfcd = Util.checkString(req.getParameter("resiclsfcd"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));
String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));
String dlvzip = Util.checkString(req.getParameter("dlvzip"));
String dlvcd = Util.checkString(req.getParameter("dlvcd"));
String dlvpyong = Util.checkString(req.getParameter("dlvpyong"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String dlvdtlsaddr = Util.checkString(req.getParameter("dlvdtlsaddr"));
String dlvdong = Util.checkString(req.getParameter("dlvdong"));
String dlvser_no = Util.checkString(req.getParameter("dlvser_no"));
String dlvbnji = Util.checkString(req.getParameter("dlvbnji"));
String dlvteamcd = Util.checkString(req.getParameter("dlvteamcd"));
String dlvdstccd = Util.checkString(req.getParameter("dlvdstccd"));
String dlvno = Util.checkString(req.getParameter("dlvno"));
String dlvintvno = Util.checkString(req.getParameter("dlvintvno"));
String dlvmthdcd = Util.checkString(req.getParameter("dlvmthdcd"));
String thrw_plac = Util.checkString(req.getParameter("thrw_plac"));
String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));
String clamtcyclcd = Util.checkString(req.getParameter("clamtcyclcd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String remk = Util.checkString(req.getParameter("remk"));
String cns_empcnfmstatcd = Util.checkString(req.getParameter("cns_empcnfmstatcd"));
String cns_empcnfmocomcd = Util.checkString(req.getParameter("cns_empcnfmocomcd"));
String cns_empid = Util.checkString(req.getParameter("cns_empid"));
String cns_remk = Util.checkString(req.getParameter("cns_remk"));
String cns_cnfmdt = Util.checkString(req.getParameter("cns_cnfmdt"));
String chrg_cnfmstatcd = Util.checkString(req.getParameter("chrg_cnfmstatcd"));
String chrg_cnfmocomcd = Util.checkString(req.getParameter("chrg_cnfmocomcd"));
String chrg_id = Util.checkString(req.getParameter("chrg_id"));
String chrg_cnfmdt = Util.checkString(req.getParameter("chrg_cnfmdt"));
String chrg_remk = Util.checkString(req.getParameter("chrg_remk"));
String incmgdt = Util.checkString(req.getParameter("incmgdt"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String chgdt = Util.checkString(req.getParameter("chgdt"));
String chgpers = Util.checkString(req.getParameter("chgpers"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String slssclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("slssclsf")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String cntrno_susp = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno_susp")));
String mangno_susp = Util.Uni2Ksc(Util.checkString(req.getParameter("mangno_susp")));
String cntrno_acpt = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno_acpt")));
String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
String extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnblngcd")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
String empseq = Util.Uni2Ksc(Util.checkString(req.getParameter("empseq")));
String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));
String rdr_extnbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnbocd")));
String extnnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnnm")));
String rdr_extncost = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncost")));
String subsfr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("subsfr_dt")));
String freeyn = Util.Uni2Ksc(Util.checkString(req.getParameter("freeyn")));
String freeclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("freeclsf")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));
String subsqty = Util.Uni2Ksc(Util.checkString(req.getParameter("subsqty")));
String dscnamt = Util.Uni2Ksc(Util.checkString(req.getParameter("dscnamt")));
String post_dlvfee = Util.Uni2Ksc(Util.checkString(req.getParameter("post_dlvfee")));
String suspdt = Util.Uni2Ksc(Util.checkString(req.getParameter("suspdt")));
String suspresncd = Util.Uni2Ksc(Util.checkString(req.getParameter("suspresncd")));
String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));
String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
String dlvcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvcd")));
String dlvpyong = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvpyong")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
String dlvdong = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdong")));
String dlvser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvser_no")));
String dlvbnji = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvbnji")));
String dlvteamcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvteamcd")));
String dlvdstccd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdstccd")));
String dlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvno")));
String dlvintvno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvintvno")));
String dlvmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvmthdcd")));
String thrw_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_plac")));
String clamtmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtmthdcd")));
String clamtcyclcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtcyclcd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String cns_empcnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empcnfmstatcd")));
String cns_empcnfmocomcd = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empcnfmocomcd")));
String cns_empid = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empid")));
String cns_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_remk")));
String cns_cnfmdt = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_cnfmdt")));
String chrg_cnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_cnfmstatcd")));
String chrg_cnfmocomcd = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_cnfmocomcd")));
String chrg_id = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_id")));
String chrg_cnfmdt = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_cnfmdt")));
String chrg_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("chrg_remk")));
String incmgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgdt")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String chgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("chgdt")));
String chgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("chgpers")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setSlssclsf(slssclsf);
dm.setRegdt(regdt);
dm.setRegno(regno);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setCntrno_susp(cntrno_susp);
dm.setMangno_susp(mangno_susp);
dm.setCntrno_acpt(cntrno_acpt);
dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setAplcpathcd(aplcpathcd);
dm.setRdr_extntypecd(rdr_extntypecd);
dm.setExtnblngcd(extnblngcd);
dm.setStafno(stafno);
dm.setEmpseq(empseq);
dm.setBoemp_no(boemp_no);
dm.setRdr_extnbocd(rdr_extnbocd);
dm.setExtnnm(extnnm);
dm.setRdr_extncost(rdr_extncost);
dm.setSubsfr_dt(subsfr_dt);
dm.setFreeyn(freeyn);
dm.setFreeclsf(freeclsf);
dm.setValmm(valmm);
dm.setSubsuprc(subsuprc);
dm.setSubsqty(subsqty);
dm.setDscnamt(dscnamt);
dm.setPost_dlvfee(post_dlvfee);
dm.setSuspdt(suspdt);
dm.setSuspresncd(suspresncd);
dm.setBns_itemcd(bns_itemcd);
dm.setResitypecd(resitypecd);
dm.setResiclsfcd(resiclsfcd);
dm.setRdrnm(rdrnm);
dm.setRdrtel_no1(rdrtel_no1);
dm.setRdrtel_no2(rdrtel_no2);
dm.setRdrtel_no3(rdrtel_no3);
dm.setRdrptph_no1(rdrptph_no1);
dm.setRdrptph_no2(rdrptph_no2);
dm.setRdrptph_no3(rdrptph_no3);
dm.setDlvzip(dlvzip);
dm.setDlvcd(dlvcd);
dm.setDlvpyong(dlvpyong);
dm.setDlvaddr(dlvaddr);
dm.setDlvdtlsaddr(dlvdtlsaddr);
dm.setDlvdong(dlvdong);
dm.setDlvser_no(dlvser_no);
dm.setDlvbnji(dlvbnji);
dm.setDlvteamcd(dlvteamcd);
dm.setDlvdstccd(dlvdstccd);
dm.setDlvno(dlvno);
dm.setDlvintvno(dlvintvno);
dm.setDlvmthdcd(dlvmthdcd);
dm.setThrw_plac(thrw_plac);
dm.setClamtmthdcd(clamtmthdcd);
dm.setClamtcyclcd(clamtcyclcd);
dm.setBocd(bocd);
dm.setRemk(remk);
dm.setCns_empcnfmstatcd(cns_empcnfmstatcd);
dm.setCns_empcnfmocomcd(cns_empcnfmocomcd);
dm.setCns_empid(cns_empid);
dm.setCns_remk(cns_remk);
dm.setCns_cnfmdt(cns_cnfmdt);
dm.setChrg_cnfmstatcd(chrg_cnfmstatcd);
dm.setChrg_cnfmocomcd(chrg_cnfmocomcd);
dm.setChrg_id(chrg_id);
dm.setChrg_cnfmdt(chrg_cnfmdt);
dm.setChrg_remk(chrg_remk);
dm.setIncmgdt(incmgdt);
dm.setIncmgpers(incmgpers);
dm.setChgdt(chgdt);
dm.setChgpers(chgpers);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jul 16 15:45:49 KST 2007 */