/***************************************************************************************************
 * 파일명   : SP_CO_S_EXTN_RES
 * 기능     : 확장현황-확장제한-상세보기
 * 작성일자 : 2007/07/13
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
**  SP_CO_S_EXTN_RES
**/

public class CO_S_EXTN_RESDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
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
	public String deptnm;
	public String areacd;
	public String areanm;
	public String bonm;
	public String rdr_extntypecdnm;
	public String extnblngcdnm;

	public CO_S_EXTN_RESDataSet(){}
	public CO_S_EXTN_RESDataSet(String errcode, String errmsg, String rdr_no, String medicd, String cntrno_susp, String mangno_susp, String cntrno_acpt, String rdr_extndt, String rdr_extnno, String aplcpathcd, String rdr_extntypecd, String extnblngcd, String stafno, String empseq, String boemp_no, String rdr_extnbocd, String extnnm, long rdr_extncost, String subsfr_dt, String freeyn, String freeclsf, String valmm, long subsuprc, long subsqty, long dscnamt, long post_dlvfee, String suspdt, String suspresncd, String bns_itemcd, String resitypecd, String resiclsfcd, String rdrnm, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String dlvzip, String dlvcd, long dlvpyong, String dlvaddr, String dlvdtlsaddr, String dlvdong, String dlvser_no, String dlvbnji, String dlvteamcd, String dlvdstccd, String dlvno, String dlvintvno, String dlvmthdcd, String thrw_plac, String clamtmthdcd, String clamtcyclcd, String bocd, String remk, String cns_empcnfmstatcd, String cns_empcnfmocomcd, String cns_empid, String cns_remk, Timestamp cns_cnfmdt, String chrg_cnfmstatcd, String chrg_cnfmocomcd, String chrg_id, Timestamp chrg_cnfmdt, String chrg_remk, String incmgdt, String incmgpers, String chgdt, String chgpers, String deptcd, String deptnm, String areacd, String areanm, String bonm, String rdr_extntypecdnm, String extnblngcdnm){
		this.errcode = errcode;
		this.errmsg = errmsg;
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
		this.deptnm = deptnm;
		this.areacd = areacd;
		this.areanm = areanm;
		this.bonm = bonm;
		this.rdr_extntypecdnm = rdr_extntypecdnm;
		this.extnblngcdnm = extnblngcdnm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
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

	public void setDeptnm(String deptnm){
		this.deptnm = deptnm;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setAreanm(String areanm){
		this.areanm = areanm;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdr_extntypecdnm(String rdr_extntypecdnm){
		this.rdr_extntypecdnm = rdr_extntypecdnm;
	}

	public void setExtnblngcdnm(String extnblngcdnm){
		this.extnblngcdnm = extnblngcdnm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
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

	public String getDeptnm(){
		return this.deptnm;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getAreanm(){
		return this.areanm;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdr_extntypecdnm(){
		return this.rdr_extntypecdnm;
	}

	public String getExtnblngcdnm(){
		return this.extnblngcdnm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.rdr_no = Util.checkString(cstmt.getString(5));
		this.medicd = Util.checkString(cstmt.getString(6));
		this.cntrno_susp = Util.checkString(cstmt.getString(7));
		this.mangno_susp = Util.checkString(cstmt.getString(8));
		this.cntrno_acpt = Util.checkString(cstmt.getString(9));
		this.rdr_extndt = Util.checkString(cstmt.getString(10));
		this.rdr_extnno = Util.checkString(cstmt.getString(11));
		this.aplcpathcd = Util.checkString(cstmt.getString(12));
		this.rdr_extntypecd = Util.checkString(cstmt.getString(13));
		this.extnblngcd = Util.checkString(cstmt.getString(14));
		this.stafno = Util.checkString(cstmt.getString(15));
		this.empseq = Util.checkString(cstmt.getString(16));
		this.boemp_no = Util.checkString(cstmt.getString(17));
		this.rdr_extnbocd = Util.checkString(cstmt.getString(18));
		this.extnnm = Util.checkString(cstmt.getString(19));
		this.rdr_extncost = cstmt.getLong(20);
		this.subsfr_dt = Util.checkString(cstmt.getString(21));
		this.freeyn = Util.checkString(cstmt.getString(22));
		this.freeclsf = Util.checkString(cstmt.getString(23));
		this.valmm = Util.checkString(cstmt.getString(24));
		this.subsuprc = cstmt.getLong(25);
		this.subsqty = cstmt.getLong(26);
		this.dscnamt = cstmt.getLong(27);
		this.post_dlvfee = cstmt.getLong(28);
		this.suspdt = Util.checkString(cstmt.getString(29));
		this.suspresncd = Util.checkString(cstmt.getString(30));
		this.bns_itemcd = Util.checkString(cstmt.getString(31));
		this.resitypecd = Util.checkString(cstmt.getString(32));
		this.resiclsfcd = Util.checkString(cstmt.getString(33));
		this.rdrnm = Util.checkString(cstmt.getString(34));
		this.rdrtel_no1 = Util.checkString(cstmt.getString(35));
		this.rdrtel_no2 = Util.checkString(cstmt.getString(36));
		this.rdrtel_no3 = Util.checkString(cstmt.getString(37));
		this.rdrptph_no1 = Util.checkString(cstmt.getString(38));
		this.rdrptph_no2 = Util.checkString(cstmt.getString(39));
		this.rdrptph_no3 = Util.checkString(cstmt.getString(40));
		this.dlvzip = Util.checkString(cstmt.getString(41));
		this.dlvcd = Util.checkString(cstmt.getString(42));
		this.dlvpyong = cstmt.getLong(43);
		this.dlvaddr = Util.checkString(cstmt.getString(44));
		this.dlvdtlsaddr = Util.checkString(cstmt.getString(45));
		this.dlvdong = Util.checkString(cstmt.getString(46));
		this.dlvser_no = Util.checkString(cstmt.getString(47));
		this.dlvbnji = Util.checkString(cstmt.getString(48));
		this.dlvteamcd = Util.checkString(cstmt.getString(49));
		this.dlvdstccd = Util.checkString(cstmt.getString(50));
		this.dlvno = Util.checkString(cstmt.getString(51));
		this.dlvintvno = Util.checkString(cstmt.getString(52));
		this.dlvmthdcd = Util.checkString(cstmt.getString(53));
		this.thrw_plac = Util.checkString(cstmt.getString(54));
		this.clamtmthdcd = Util.checkString(cstmt.getString(55));
		this.clamtcyclcd = Util.checkString(cstmt.getString(56));
		this.bocd = Util.checkString(cstmt.getString(57));
		this.remk = Util.checkString(cstmt.getString(58));
		this.cns_empcnfmstatcd = Util.checkString(cstmt.getString(59));
		this.cns_empcnfmocomcd = Util.checkString(cstmt.getString(60));
		this.cns_empid = Util.checkString(cstmt.getString(61));
		this.cns_remk = Util.checkString(cstmt.getString(62));
		this.cns_cnfmdt = cstmt.getTimestamp(63);
		this.chrg_cnfmstatcd = Util.checkString(cstmt.getString(64));
		this.chrg_cnfmocomcd = Util.checkString(cstmt.getString(65));
		this.chrg_id = Util.checkString(cstmt.getString(66));
		this.chrg_cnfmdt = cstmt.getTimestamp(67);
		this.chrg_remk = Util.checkString(cstmt.getString(68));
		this.incmgdt = Util.checkString(cstmt.getString(69));
		this.incmgpers = Util.checkString(cstmt.getString(70));
		this.chgdt = Util.checkString(cstmt.getString(71));
		this.chgpers = Util.checkString(cstmt.getString(72));
		this.deptcd = Util.checkString(cstmt.getString(73));
		this.deptnm = Util.checkString(cstmt.getString(74));
		this.areacd = Util.checkString(cstmt.getString(75));
		this.areanm = Util.checkString(cstmt.getString(76));
		this.bonm = Util.checkString(cstmt.getString(77));
		this.rdr_extntypecdnm = Util.checkString(cstmt.getString(78));
		this.extnblngcdnm = Util.checkString(cstmt.getString(79));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_S_EXTN_RESDataSet ds = (CO_S_EXTN_RESDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getRdr_no()%>
<%= ds.getMedicd()%>
<%= ds.getCntrno_susp()%>
<%= ds.getMangno_susp()%>
<%= ds.getCntrno_acpt()%>
<%= ds.getRdr_extndt()%>
<%= ds.getRdr_extnno()%>
<%= ds.getAplcpathcd()%>
<%= ds.getRdr_extntypecd()%>
<%= ds.getExtnblngcd()%>
<%= ds.getStafno()%>
<%= ds.getEmpseq()%>
<%= ds.getBoemp_no()%>
<%= ds.getRdr_extnbocd()%>
<%= ds.getExtnnm()%>
<%= ds.getRdr_extncost()%>
<%= ds.getSubsfr_dt()%>
<%= ds.getFreeyn()%>
<%= ds.getFreeclsf()%>
<%= ds.getValmm()%>
<%= ds.getSubsuprc()%>
<%= ds.getSubsqty()%>
<%= ds.getDscnamt()%>
<%= ds.getPost_dlvfee()%>
<%= ds.getSuspdt()%>
<%= ds.getSuspresncd()%>
<%= ds.getBns_itemcd()%>
<%= ds.getResitypecd()%>
<%= ds.getResiclsfcd()%>
<%= ds.getRdrnm()%>
<%= ds.getRdrtel_no1()%>
<%= ds.getRdrtel_no2()%>
<%= ds.getRdrtel_no3()%>
<%= ds.getRdrptph_no1()%>
<%= ds.getRdrptph_no2()%>
<%= ds.getRdrptph_no3()%>
<%= ds.getDlvzip()%>
<%= ds.getDlvcd()%>
<%= ds.getDlvpyong()%>
<%= ds.getDlvaddr()%>
<%= ds.getDlvdtlsaddr()%>
<%= ds.getDlvdong()%>
<%= ds.getDlvser_no()%>
<%= ds.getDlvbnji()%>
<%= ds.getDlvteamcd()%>
<%= ds.getDlvdstccd()%>
<%= ds.getDlvno()%>
<%= ds.getDlvintvno()%>
<%= ds.getDlvmthdcd()%>
<%= ds.getThrw_plac()%>
<%= ds.getClamtmthdcd()%>
<%= ds.getClamtcyclcd()%>
<%= ds.getBocd()%>
<%= ds.getRemk()%>
<%= ds.getCns_empcnfmstatcd()%>
<%= ds.getCns_empcnfmocomcd()%>
<%= ds.getCns_empid()%>
<%= ds.getCns_remk()%>
<%= ds.getCns_cnfmdt()%>
<%= ds.getChrg_cnfmstatcd()%>
<%= ds.getChrg_cnfmocomcd()%>
<%= ds.getChrg_id()%>
<%= ds.getChrg_cnfmdt()%>
<%= ds.getChrg_remk()%>
<%= ds.getIncmgdt()%>
<%= ds.getIncmgpers()%>
<%= ds.getChgdt()%>
<%= ds.getChgpers()%>
<%= ds.getDeptcd()%>
<%= ds.getDeptnm()%>
<%= ds.getAreacd()%>
<%= ds.getAreanm()%>
<%= ds.getBonm()%>
<%= ds.getRdr_extntypecdnm()%>
<%= ds.getExtnblngcdnm()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 13 15:59:19 KST 2007 */