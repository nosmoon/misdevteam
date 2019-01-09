/***************************************************************************************************
* 파일명 : SL_I_READERDM.java
* 기능 : 독자정보관리(저장(독자추가))
* 작성일자 : 2004-06-30
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.rdr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.rdr.ds.*;
import chosun.ciis.ss.sal.rdr.rec.*;

/**
 * 독자정보관리(저장(독자추가))
 *
 */

public class SL_I_READERDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String paty_clsfcd;
	public String rdrnm;
	public String prn;
	public String ernno;
	public String email;
	public String weddanvydt;
	public String bidt;
	public String lusoclsfcd;
	public String remk;
	public String aplcpathcd;
	public String rdr_extntypecd;
	public String extnblngcd;
	public String empclsfcd;
	public String empdeptcd;
	public String empdeptnm;
	public String empseq;
	public String bodutycd;
	public String boposicd;
	public String stafclsfcd;
	public String stafno;
	public String boemp_no;
	public String extnid;
	public String extnflnm;
	public String extntel1;
	public String extntel2;
	public String extntel3;
	public String extnptph_no1;
	public String extnptph_no2;
	public String extnptph_no3;
	public String extnemail;
	public String extnprn;
	public String deptcd;
	public String areacd;
	public String bns_itemcd;
	public long subsuprc;
	public String medicd;
	public String resitypecd;
	public String resiclsfcd;
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
	public String dlvbnji;
	public String dlvser_no;
	public String dlvdong;
	public String dlvteamcd;
	public String dlvdstccd;
	public String dlvno;
	public String dlvintvno;
	public String dlvmthdcd;
	public String thrw_plac;
	public long dlvqty;
	public long valqty;
	public long no_valqty;
	public long pre_valqty;
	public long subsamt;
	public long dscnamt;
	public long post_dlvfee;
	public String rptvfreeclsf;
	public String rptvsubsdt;
	public String rptvrdr_extndt;
	public String rptvrdr_extntype;
	public String rptvextn;
	public long totrdr_extncost;
	public String clamtclsfcd;
	public String rptvvalmm;
	public String rptvrdr_movmdt;
	public String clamtmthdcd;
	public String clamtcyclcd;
	public String etc1;
	public String etc2;
	public String etc3;
	public String etc4;
	public String etc5;
	public String etc6;

	public SL_I_READERDM(){}
	public SL_I_READERDM(String bocd, String incmgpers, String paty_clsfcd, String rdrnm, String prn, String ernno, String email, String weddanvydt, String bidt, String lusoclsfcd, String remk, String aplcpathcd, String rdr_extntypecd, String extnblngcd, String empclsfcd, String empdeptcd, String empdeptnm, String empseq, String bodutycd, String boposicd, String stafclsfcd, String stafno, String boemp_no, String extnid, String extnflnm, String extntel1, String extntel2, String extntel3, String extnptph_no1, String extnptph_no2, String extnptph_no3, String extnemail, String extnprn, String deptcd, String areacd, String bns_itemcd, long subsuprc, String medicd, String resitypecd, String resiclsfcd, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String dlvzip, String dlvcd, long dlvpyong, String dlvaddr, String dlvdtlsaddr, String dlvbnji, String dlvser_no, String dlvdong, String dlvteamcd, String dlvdstccd, String dlvno, String dlvintvno, String dlvmthdcd, String thrw_plac, long dlvqty, long valqty, long no_valqty, long pre_valqty, long subsamt, long dscnamt, long post_dlvfee, String rptvfreeclsf, String rptvsubsdt, String rptvrdr_extndt, String rptvrdr_extntype, String rptvextn, long totrdr_extncost, String clamtclsfcd, String rptvvalmm, String rptvrdr_movmdt, String clamtmthdcd, String clamtcyclcd, String etc1, String etc2, String etc3, String etc4, String etc5, String etc6){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.paty_clsfcd = paty_clsfcd;
		this.rdrnm = rdrnm;
		this.prn = prn;
		this.ernno = ernno;
		this.email = email;
		this.weddanvydt = weddanvydt;
		this.bidt = bidt;
		this.lusoclsfcd = lusoclsfcd;
		this.remk = remk;
		this.aplcpathcd = aplcpathcd;
		this.rdr_extntypecd = rdr_extntypecd;
		this.extnblngcd = extnblngcd;
		this.empclsfcd = empclsfcd;
		this.empdeptcd = empdeptcd;
		this.empdeptnm = empdeptnm;
		this.empseq = empseq;
		this.bodutycd = bodutycd;
		this.boposicd = boposicd;
		this.stafclsfcd = stafclsfcd;
		this.stafno = stafno;
		this.boemp_no = boemp_no;
		this.extnid = extnid;
		this.extnflnm = extnflnm;
		this.extntel1 = extntel1;
		this.extntel2 = extntel2;
		this.extntel3 = extntel3;
		this.extnptph_no1 = extnptph_no1;
		this.extnptph_no2 = extnptph_no2;
		this.extnptph_no3 = extnptph_no3;
		this.extnemail = extnemail;
		this.extnprn = extnprn;
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bns_itemcd = bns_itemcd;
		this.subsuprc = subsuprc;
		this.medicd = medicd;
		this.resitypecd = resitypecd;
		this.resiclsfcd = resiclsfcd;
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
		this.dlvbnji = dlvbnji;
		this.dlvser_no = dlvser_no;
		this.dlvdong = dlvdong;
		this.dlvteamcd = dlvteamcd;
		this.dlvdstccd = dlvdstccd;
		this.dlvno = dlvno;
		this.dlvintvno = dlvintvno;
		this.dlvmthdcd = dlvmthdcd;
		this.thrw_plac = thrw_plac;
		this.dlvqty = dlvqty;
		this.valqty = valqty;
		this.no_valqty = no_valqty;
		this.pre_valqty = pre_valqty;
		this.subsamt = subsamt;
		this.dscnamt = dscnamt;
		this.post_dlvfee = post_dlvfee;
		this.rptvfreeclsf = rptvfreeclsf;
		this.rptvsubsdt = rptvsubsdt;
		this.rptvrdr_extndt = rptvrdr_extndt;
		this.rptvrdr_extntype = rptvrdr_extntype;
		this.rptvextn = rptvextn;
		this.totrdr_extncost = totrdr_extncost;
		this.clamtclsfcd = clamtclsfcd;
		this.rptvvalmm = rptvvalmm;
		this.rptvrdr_movmdt = rptvrdr_movmdt;
		this.clamtmthdcd = clamtmthdcd;
		this.clamtcyclcd = clamtcyclcd;
		this.etc1 = etc1;
		this.etc2 = etc2;
		this.etc3 = etc3;
		this.etc4 = etc4;
		this.etc5 = etc5;
		this.etc6 = etc6;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setPaty_clsfcd(String paty_clsfcd){
		this.paty_clsfcd = paty_clsfcd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
	}

	public void setEmail(String email){
		this.email = email;
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

	public void setRemk(String remk){
		this.remk = remk;
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

	public void setEmpclsfcd(String empclsfcd){
		this.empclsfcd = empclsfcd;
	}

	public void setEmpdeptcd(String empdeptcd){
		this.empdeptcd = empdeptcd;
	}

	public void setEmpdeptnm(String empdeptnm){
		this.empdeptnm = empdeptnm;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setBodutycd(String bodutycd){
		this.bodutycd = bodutycd;
	}

	public void setBoposicd(String boposicd){
		this.boposicd = boposicd;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setBoemp_no(String boemp_no){
		this.boemp_no = boemp_no;
	}

	public void setExtnid(String extnid){
		this.extnid = extnid;
	}

	public void setExtnflnm(String extnflnm){
		this.extnflnm = extnflnm;
	}

	public void setExtntel1(String extntel1){
		this.extntel1 = extntel1;
	}

	public void setExtntel2(String extntel2){
		this.extntel2 = extntel2;
	}

	public void setExtntel3(String extntel3){
		this.extntel3 = extntel3;
	}

	public void setExtnptph_no1(String extnptph_no1){
		this.extnptph_no1 = extnptph_no1;
	}

	public void setExtnptph_no2(String extnptph_no2){
		this.extnptph_no2 = extnptph_no2;
	}

	public void setExtnptph_no3(String extnptph_no3){
		this.extnptph_no3 = extnptph_no3;
	}

	public void setExtnemail(String extnemail){
		this.extnemail = extnemail;
	}

	public void setExtnprn(String extnprn){
		this.extnprn = extnprn;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setSubsuprc(long subsuprc){
		this.subsuprc = subsuprc;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
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

	public void setDlvbnji(String dlvbnji){
		this.dlvbnji = dlvbnji;
	}

	public void setDlvser_no(String dlvser_no){
		this.dlvser_no = dlvser_no;
	}

	public void setDlvdong(String dlvdong){
		this.dlvdong = dlvdong;
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

	public void setDlvqty(long dlvqty){
		this.dlvqty = dlvqty;
	}

	public void setValqty(long valqty){
		this.valqty = valqty;
	}

	public void setNo_valqty(long no_valqty){
		this.no_valqty = no_valqty;
	}

	public void setPre_valqty(long pre_valqty){
		this.pre_valqty = pre_valqty;
	}

	public void setSubsamt(long subsamt){
		this.subsamt = subsamt;
	}

	public void setDscnamt(long dscnamt){
		this.dscnamt = dscnamt;
	}

	public void setPost_dlvfee(long post_dlvfee){
		this.post_dlvfee = post_dlvfee;
	}

	public void setRptvfreeclsf(String rptvfreeclsf){
		this.rptvfreeclsf = rptvfreeclsf;
	}

	public void setRptvsubsdt(String rptvsubsdt){
		this.rptvsubsdt = rptvsubsdt;
	}

	public void setRptvrdr_extndt(String rptvrdr_extndt){
		this.rptvrdr_extndt = rptvrdr_extndt;
	}

	public void setRptvrdr_extntype(String rptvrdr_extntype){
		this.rptvrdr_extntype = rptvrdr_extntype;
	}

	public void setRptvextn(String rptvextn){
		this.rptvextn = rptvextn;
	}

	public void setTotrdr_extncost(long totrdr_extncost){
		this.totrdr_extncost = totrdr_extncost;
	}

	public void setClamtclsfcd(String clamtclsfcd){
		this.clamtclsfcd = clamtclsfcd;
	}

	public void setRptvvalmm(String rptvvalmm){
		this.rptvvalmm = rptvvalmm;
	}

	public void setRptvrdr_movmdt(String rptvrdr_movmdt){
		this.rptvrdr_movmdt = rptvrdr_movmdt;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setClamtcyclcd(String clamtcyclcd){
		this.clamtcyclcd = clamtcyclcd;
	}

	public void setEtc1(String etc1){
		this.etc1 = etc1;
	}

	public void setEtc2(String etc2){
		this.etc2 = etc2;
	}

	public void setEtc3(String etc3){
		this.etc3 = etc3;
	}

	public void setEtc4(String etc4){
		this.etc4 = etc4;
	}

	public void setEtc5(String etc5){
		this.etc5 = etc5;
	}

	public void setEtc6(String etc6){
		this.etc6 = etc6;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getPaty_clsfcd(){
		return this.paty_clsfcd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErnno(){
		return this.ernno;
	}

	public String getEmail(){
		return this.email;
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

	public String getRemk(){
		return this.remk;
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

	public String getEmpclsfcd(){
		return this.empclsfcd;
	}

	public String getEmpdeptcd(){
		return this.empdeptcd;
	}

	public String getEmpdeptnm(){
		return this.empdeptnm;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getBodutycd(){
		return this.bodutycd;
	}

	public String getBoposicd(){
		return this.boposicd;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getBoemp_no(){
		return this.boemp_no;
	}

	public String getExtnid(){
		return this.extnid;
	}

	public String getExtnflnm(){
		return this.extnflnm;
	}

	public String getExtntel1(){
		return this.extntel1;
	}

	public String getExtntel2(){
		return this.extntel2;
	}

	public String getExtntel3(){
		return this.extntel3;
	}

	public String getExtnptph_no1(){
		return this.extnptph_no1;
	}

	public String getExtnptph_no2(){
		return this.extnptph_no2;
	}

	public String getExtnptph_no3(){
		return this.extnptph_no3;
	}

	public String getExtnemail(){
		return this.extnemail;
	}

	public String getExtnprn(){
		return this.extnprn;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public long getSubsuprc(){
		return this.subsuprc;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
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

	public String getDlvbnji(){
		return this.dlvbnji;
	}

	public String getDlvser_no(){
		return this.dlvser_no;
	}

	public String getDlvdong(){
		return this.dlvdong;
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

	public long getDlvqty(){
		return this.dlvqty;
	}

	public long getValqty(){
		return this.valqty;
	}

	public long getNo_valqty(){
		return this.no_valqty;
	}

	public long getPre_valqty(){
		return this.pre_valqty;
	}

	public long getSubsamt(){
		return this.subsamt;
	}

	public long getDscnamt(){
		return this.dscnamt;
	}

	public long getPost_dlvfee(){
		return this.post_dlvfee;
	}

	public String getRptvfreeclsf(){
		return this.rptvfreeclsf;
	}

	public String getRptvsubsdt(){
		return this.rptvsubsdt;
	}

	public String getRptvrdr_extndt(){
		return this.rptvrdr_extndt;
	}

	public String getRptvrdr_extntype(){
		return this.rptvrdr_extntype;
	}

	public String getRptvextn(){
		return this.rptvextn;
	}

	public long getTotrdr_extncost(){
		return this.totrdr_extncost;
	}

	public String getClamtclsfcd(){
		return this.clamtclsfcd;
	}

	public String getRptvvalmm(){
		return this.rptvvalmm;
	}

	public String getRptvrdr_movmdt(){
		return this.rptvrdr_movmdt;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getClamtcyclcd(){
		return this.clamtcyclcd;
	}

	public String getEtc1(){
		return this.etc1;
	}

	public String getEtc2(){
		return this.etc2;
	}

	public String getEtc3(){
		return this.etc3;
	}

	public String getEtc4(){
		return this.etc4;
	}

	public String getEtc5(){
		return this.etc5;
	}

	public String getEtc6(){
		return this.etc6;
	}

	public String getSQL(){
		 return "{ call SP_SL_I_READER( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_I_READERDM dm = (SL_I_READERDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.paty_clsfcd);
		cstmt.setString(6, dm.rdrnm);
		cstmt.setString(7, dm.prn);
		cstmt.setString(8, dm.ernno);
		cstmt.setString(9, dm.email);
		cstmt.setString(10, dm.weddanvydt);
		cstmt.setString(11, dm.bidt);
		cstmt.setString(12, dm.lusoclsfcd);
		cstmt.setString(13, dm.remk);
		cstmt.setString(14, dm.aplcpathcd);
		cstmt.setString(15, dm.rdr_extntypecd);
		cstmt.setString(16, dm.extnblngcd);
		cstmt.setString(17, dm.empclsfcd);
		cstmt.setString(18, dm.empdeptcd);
		cstmt.setString(19, dm.empdeptnm);
		cstmt.setString(20, dm.empseq);
		cstmt.setString(21, dm.bodutycd);
		cstmt.setString(22, dm.boposicd);
		cstmt.setString(23, dm.stafclsfcd);
		cstmt.setString(24, dm.stafno);
		cstmt.setString(25, dm.boemp_no);
		cstmt.setString(26, dm.extnid);
		cstmt.setString(27, dm.extnflnm);
		cstmt.setString(28, dm.extntel1);
		cstmt.setString(29, dm.extntel2);
		cstmt.setString(30, dm.extntel3);
		cstmt.setString(31, dm.extnptph_no1);
		cstmt.setString(32, dm.extnptph_no2);
		cstmt.setString(33, dm.extnptph_no3);
		cstmt.setString(34, dm.extnemail);
		cstmt.setString(35, dm.extnprn);
		cstmt.setString(36, dm.deptcd);
		cstmt.setString(37, dm.areacd);
		cstmt.setString(38, dm.bns_itemcd);
		cstmt.setLong(39, dm.subsuprc);
		cstmt.setString(40, dm.medicd);
		cstmt.setString(41, dm.resitypecd);
		cstmt.setString(42, dm.resiclsfcd);
		cstmt.setString(43, dm.rdrtel_no1);
		cstmt.setString(44, dm.rdrtel_no2);
		cstmt.setString(45, dm.rdrtel_no3);
		cstmt.setString(46, dm.rdrptph_no1);
		cstmt.setString(47, dm.rdrptph_no2);
		cstmt.setString(48, dm.rdrptph_no3);
		cstmt.setString(49, dm.dlvzip);
		cstmt.setString(50, dm.dlvcd);
		cstmt.setLong(51, dm.dlvpyong);
		cstmt.setString(52, dm.dlvaddr);
		cstmt.setString(53, dm.dlvdtlsaddr);
		cstmt.setString(54, dm.dlvbnji);
		cstmt.setString(55, dm.dlvser_no);
		cstmt.setString(56, dm.dlvdong);
		cstmt.setString(57, dm.dlvteamcd);
		cstmt.setString(58, dm.dlvdstccd);
		cstmt.setString(59, dm.dlvno);
		cstmt.setString(60, dm.dlvintvno);
		cstmt.setString(61, dm.dlvmthdcd);
		cstmt.setString(62, dm.thrw_plac);
		cstmt.setLong(63, dm.dlvqty);
		cstmt.setLong(64, dm.valqty);
		cstmt.setLong(65, dm.no_valqty);
		cstmt.setLong(66, dm.pre_valqty);
		cstmt.setLong(67, dm.subsamt);
		cstmt.setLong(68, dm.dscnamt);
		cstmt.setLong(69, dm.post_dlvfee);
		cstmt.setString(70, dm.rptvfreeclsf);
		cstmt.setString(71, dm.rptvsubsdt);
		cstmt.setString(72, dm.rptvrdr_extndt);
		cstmt.setString(73, dm.rptvrdr_extntype);
		cstmt.setString(74, dm.rptvextn);
		cstmt.setLong(75, dm.totrdr_extncost);
		cstmt.setString(76, dm.clamtclsfcd);
		cstmt.setString(77, dm.rptvvalmm);
		cstmt.setString(78, dm.rptvrdr_movmdt);
		cstmt.setString(79, dm.clamtmthdcd);
		cstmt.setString(80, dm.clamtcyclcd);
		cstmt.setString(81, dm.etc1);
		cstmt.setString(82, dm.etc2);
		cstmt.setString(83, dm.etc3);
		cstmt.setString(84, dm.etc4);
		cstmt.setString(85, dm.etc5);
		cstmt.setString(86, dm.etc6);
		cstmt.registerOutParameter(87, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_I_READERDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String paty_clsfcd = req.getParameter("paty_clsfcd");
if( paty_clsfcd == null){
	System.out.println(this.toString+" : paty_clsfcd is null" );
}else{
	System.out.println(this.toString+" : paty_clsfcd is "+paty_clsfcd );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String ernno = req.getParameter("ernno");
if( ernno == null){
	System.out.println(this.toString+" : ernno is null" );
}else{
	System.out.println(this.toString+" : ernno is "+ernno );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String weddanvydt = req.getParameter("weddanvydt");
if( weddanvydt == null){
	System.out.println(this.toString+" : weddanvydt is null" );
}else{
	System.out.println(this.toString+" : weddanvydt is "+weddanvydt );
}
String bidt = req.getParameter("bidt");
if( bidt == null){
	System.out.println(this.toString+" : bidt is null" );
}else{
	System.out.println(this.toString+" : bidt is "+bidt );
}
String lusoclsfcd = req.getParameter("lusoclsfcd");
if( lusoclsfcd == null){
	System.out.println(this.toString+" : lusoclsfcd is null" );
}else{
	System.out.println(this.toString+" : lusoclsfcd is "+lusoclsfcd );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String empclsfcd = req.getParameter("empclsfcd");
if( empclsfcd == null){
	System.out.println(this.toString+" : empclsfcd is null" );
}else{
	System.out.println(this.toString+" : empclsfcd is "+empclsfcd );
}
String empdeptcd = req.getParameter("empdeptcd");
if( empdeptcd == null){
	System.out.println(this.toString+" : empdeptcd is null" );
}else{
	System.out.println(this.toString+" : empdeptcd is "+empdeptcd );
}
String empdeptnm = req.getParameter("empdeptnm");
if( empdeptnm == null){
	System.out.println(this.toString+" : empdeptnm is null" );
}else{
	System.out.println(this.toString+" : empdeptnm is "+empdeptnm );
}
String empseq = req.getParameter("empseq");
if( empseq == null){
	System.out.println(this.toString+" : empseq is null" );
}else{
	System.out.println(this.toString+" : empseq is "+empseq );
}
String bodutycd = req.getParameter("bodutycd");
if( bodutycd == null){
	System.out.println(this.toString+" : bodutycd is null" );
}else{
	System.out.println(this.toString+" : bodutycd is "+bodutycd );
}
String boposicd = req.getParameter("boposicd");
if( boposicd == null){
	System.out.println(this.toString+" : boposicd is null" );
}else{
	System.out.println(this.toString+" : boposicd is "+boposicd );
}
String stafclsfcd = req.getParameter("stafclsfcd");
if( stafclsfcd == null){
	System.out.println(this.toString+" : stafclsfcd is null" );
}else{
	System.out.println(this.toString+" : stafclsfcd is "+stafclsfcd );
}
String stafno = req.getParameter("stafno");
if( stafno == null){
	System.out.println(this.toString+" : stafno is null" );
}else{
	System.out.println(this.toString+" : stafno is "+stafno );
}
String boemp_no = req.getParameter("boemp_no");
if( boemp_no == null){
	System.out.println(this.toString+" : boemp_no is null" );
}else{
	System.out.println(this.toString+" : boemp_no is "+boemp_no );
}
String extnid = req.getParameter("extnid");
if( extnid == null){
	System.out.println(this.toString+" : extnid is null" );
}else{
	System.out.println(this.toString+" : extnid is "+extnid );
}
String extnflnm = req.getParameter("extnflnm");
if( extnflnm == null){
	System.out.println(this.toString+" : extnflnm is null" );
}else{
	System.out.println(this.toString+" : extnflnm is "+extnflnm );
}
String extntel1 = req.getParameter("extntel1");
if( extntel1 == null){
	System.out.println(this.toString+" : extntel1 is null" );
}else{
	System.out.println(this.toString+" : extntel1 is "+extntel1 );
}
String extntel2 = req.getParameter("extntel2");
if( extntel2 == null){
	System.out.println(this.toString+" : extntel2 is null" );
}else{
	System.out.println(this.toString+" : extntel2 is "+extntel2 );
}
String extntel3 = req.getParameter("extntel3");
if( extntel3 == null){
	System.out.println(this.toString+" : extntel3 is null" );
}else{
	System.out.println(this.toString+" : extntel3 is "+extntel3 );
}
String extnptph_no1 = req.getParameter("extnptph_no1");
if( extnptph_no1 == null){
	System.out.println(this.toString+" : extnptph_no1 is null" );
}else{
	System.out.println(this.toString+" : extnptph_no1 is "+extnptph_no1 );
}
String extnptph_no2 = req.getParameter("extnptph_no2");
if( extnptph_no2 == null){
	System.out.println(this.toString+" : extnptph_no2 is null" );
}else{
	System.out.println(this.toString+" : extnptph_no2 is "+extnptph_no2 );
}
String extnptph_no3 = req.getParameter("extnptph_no3");
if( extnptph_no3 == null){
	System.out.println(this.toString+" : extnptph_no3 is null" );
}else{
	System.out.println(this.toString+" : extnptph_no3 is "+extnptph_no3 );
}
String extnemail = req.getParameter("extnemail");
if( extnemail == null){
	System.out.println(this.toString+" : extnemail is null" );
}else{
	System.out.println(this.toString+" : extnemail is "+extnemail );
}
String extnprn = req.getParameter("extnprn");
if( extnprn == null){
	System.out.println(this.toString+" : extnprn is null" );
}else{
	System.out.println(this.toString+" : extnprn is "+extnprn );
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
String bns_itemcd = req.getParameter("bns_itemcd");
if( bns_itemcd == null){
	System.out.println(this.toString+" : bns_itemcd is null" );
}else{
	System.out.println(this.toString+" : bns_itemcd is "+bns_itemcd );
}
String subsuprc = req.getParameter("subsuprc");
if( subsuprc == null){
	System.out.println(this.toString+" : subsuprc is null" );
}else{
	System.out.println(this.toString+" : subsuprc is "+subsuprc );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
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
String dlvbnji = req.getParameter("dlvbnji");
if( dlvbnji == null){
	System.out.println(this.toString+" : dlvbnji is null" );
}else{
	System.out.println(this.toString+" : dlvbnji is "+dlvbnji );
}
String dlvser_no = req.getParameter("dlvser_no");
if( dlvser_no == null){
	System.out.println(this.toString+" : dlvser_no is null" );
}else{
	System.out.println(this.toString+" : dlvser_no is "+dlvser_no );
}
String dlvdong = req.getParameter("dlvdong");
if( dlvdong == null){
	System.out.println(this.toString+" : dlvdong is null" );
}else{
	System.out.println(this.toString+" : dlvdong is "+dlvdong );
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
String dlvqty = req.getParameter("dlvqty");
if( dlvqty == null){
	System.out.println(this.toString+" : dlvqty is null" );
}else{
	System.out.println(this.toString+" : dlvqty is "+dlvqty );
}
String valqty = req.getParameter("valqty");
if( valqty == null){
	System.out.println(this.toString+" : valqty is null" );
}else{
	System.out.println(this.toString+" : valqty is "+valqty );
}
String no_valqty = req.getParameter("no_valqty");
if( no_valqty == null){
	System.out.println(this.toString+" : no_valqty is null" );
}else{
	System.out.println(this.toString+" : no_valqty is "+no_valqty );
}
String pre_valqty = req.getParameter("pre_valqty");
if( pre_valqty == null){
	System.out.println(this.toString+" : pre_valqty is null" );
}else{
	System.out.println(this.toString+" : pre_valqty is "+pre_valqty );
}
String subsamt = req.getParameter("subsamt");
if( subsamt == null){
	System.out.println(this.toString+" : subsamt is null" );
}else{
	System.out.println(this.toString+" : subsamt is "+subsamt );
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
String rptvfreeclsf = req.getParameter("rptvfreeclsf");
if( rptvfreeclsf == null){
	System.out.println(this.toString+" : rptvfreeclsf is null" );
}else{
	System.out.println(this.toString+" : rptvfreeclsf is "+rptvfreeclsf );
}
String rptvsubsdt = req.getParameter("rptvsubsdt");
if( rptvsubsdt == null){
	System.out.println(this.toString+" : rptvsubsdt is null" );
}else{
	System.out.println(this.toString+" : rptvsubsdt is "+rptvsubsdt );
}
String rptvrdr_extndt = req.getParameter("rptvrdr_extndt");
if( rptvrdr_extndt == null){
	System.out.println(this.toString+" : rptvrdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rptvrdr_extndt is "+rptvrdr_extndt );
}
String rptvrdr_extntype = req.getParameter("rptvrdr_extntype");
if( rptvrdr_extntype == null){
	System.out.println(this.toString+" : rptvrdr_extntype is null" );
}else{
	System.out.println(this.toString+" : rptvrdr_extntype is "+rptvrdr_extntype );
}
String rptvextn = req.getParameter("rptvextn");
if( rptvextn == null){
	System.out.println(this.toString+" : rptvextn is null" );
}else{
	System.out.println(this.toString+" : rptvextn is "+rptvextn );
}
String totrdr_extncost = req.getParameter("totrdr_extncost");
if( totrdr_extncost == null){
	System.out.println(this.toString+" : totrdr_extncost is null" );
}else{
	System.out.println(this.toString+" : totrdr_extncost is "+totrdr_extncost );
}
String clamtclsfcd = req.getParameter("clamtclsfcd");
if( clamtclsfcd == null){
	System.out.println(this.toString+" : clamtclsfcd is null" );
}else{
	System.out.println(this.toString+" : clamtclsfcd is "+clamtclsfcd );
}
String rptvvalmm = req.getParameter("rptvvalmm");
if( rptvvalmm == null){
	System.out.println(this.toString+" : rptvvalmm is null" );
}else{
	System.out.println(this.toString+" : rptvvalmm is "+rptvvalmm );
}
String rptvrdr_movmdt = req.getParameter("rptvrdr_movmdt");
if( rptvrdr_movmdt == null){
	System.out.println(this.toString+" : rptvrdr_movmdt is null" );
}else{
	System.out.println(this.toString+" : rptvrdr_movmdt is "+rptvrdr_movmdt );
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
String etc1 = req.getParameter("etc1");
if( etc1 == null){
	System.out.println(this.toString+" : etc1 is null" );
}else{
	System.out.println(this.toString+" : etc1 is "+etc1 );
}
String etc2 = req.getParameter("etc2");
if( etc2 == null){
	System.out.println(this.toString+" : etc2 is null" );
}else{
	System.out.println(this.toString+" : etc2 is "+etc2 );
}
String etc3 = req.getParameter("etc3");
if( etc3 == null){
	System.out.println(this.toString+" : etc3 is null" );
}else{
	System.out.println(this.toString+" : etc3 is "+etc3 );
}
String etc4 = req.getParameter("etc4");
if( etc4 == null){
	System.out.println(this.toString+" : etc4 is null" );
}else{
	System.out.println(this.toString+" : etc4 is "+etc4 );
}
String etc5 = req.getParameter("etc5");
if( etc5 == null){
	System.out.println(this.toString+" : etc5 is null" );
}else{
	System.out.println(this.toString+" : etc5 is "+etc5 );
}
String etc6 = req.getParameter("etc6");
if( etc6 == null){
	System.out.println(this.toString+" : etc6 is null" );
}else{
	System.out.println(this.toString+" : etc6 is "+etc6 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String paty_clsfcd = Util.checkString(req.getParameter("paty_clsfcd"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String prn = Util.checkString(req.getParameter("prn"));
String ernno = Util.checkString(req.getParameter("ernno"));
String email = Util.checkString(req.getParameter("email"));
String weddanvydt = Util.checkString(req.getParameter("weddanvydt"));
String bidt = Util.checkString(req.getParameter("bidt"));
String lusoclsfcd = Util.checkString(req.getParameter("lusoclsfcd"));
String remk = Util.checkString(req.getParameter("remk"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
String rdr_extntypecd = Util.checkString(req.getParameter("rdr_extntypecd"));
String extnblngcd = Util.checkString(req.getParameter("extnblngcd"));
String empclsfcd = Util.checkString(req.getParameter("empclsfcd"));
String empdeptcd = Util.checkString(req.getParameter("empdeptcd"));
String empdeptnm = Util.checkString(req.getParameter("empdeptnm"));
String empseq = Util.checkString(req.getParameter("empseq"));
String bodutycd = Util.checkString(req.getParameter("bodutycd"));
String boposicd = Util.checkString(req.getParameter("boposicd"));
String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
String stafno = Util.checkString(req.getParameter("stafno"));
String boemp_no = Util.checkString(req.getParameter("boemp_no"));
String extnid = Util.checkString(req.getParameter("extnid"));
String extnflnm = Util.checkString(req.getParameter("extnflnm"));
String extntel1 = Util.checkString(req.getParameter("extntel1"));
String extntel2 = Util.checkString(req.getParameter("extntel2"));
String extntel3 = Util.checkString(req.getParameter("extntel3"));
String extnptph_no1 = Util.checkString(req.getParameter("extnptph_no1"));
String extnptph_no2 = Util.checkString(req.getParameter("extnptph_no2"));
String extnptph_no3 = Util.checkString(req.getParameter("extnptph_no3"));
String extnemail = Util.checkString(req.getParameter("extnemail"));
String extnprn = Util.checkString(req.getParameter("extnprn"));
String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
String subsuprc = Util.checkString(req.getParameter("subsuprc"));
String medicd = Util.checkString(req.getParameter("medicd"));
String resitypecd = Util.checkString(req.getParameter("resitypecd"));
String resiclsfcd = Util.checkString(req.getParameter("resiclsfcd"));
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
String dlvbnji = Util.checkString(req.getParameter("dlvbnji"));
String dlvser_no = Util.checkString(req.getParameter("dlvser_no"));
String dlvdong = Util.checkString(req.getParameter("dlvdong"));
String dlvteamcd = Util.checkString(req.getParameter("dlvteamcd"));
String dlvdstccd = Util.checkString(req.getParameter("dlvdstccd"));
String dlvno = Util.checkString(req.getParameter("dlvno"));
String dlvintvno = Util.checkString(req.getParameter("dlvintvno"));
String dlvmthdcd = Util.checkString(req.getParameter("dlvmthdcd"));
String thrw_plac = Util.checkString(req.getParameter("thrw_plac"));
String dlvqty = Util.checkString(req.getParameter("dlvqty"));
String valqty = Util.checkString(req.getParameter("valqty"));
String no_valqty = Util.checkString(req.getParameter("no_valqty"));
String pre_valqty = Util.checkString(req.getParameter("pre_valqty"));
String subsamt = Util.checkString(req.getParameter("subsamt"));
String dscnamt = Util.checkString(req.getParameter("dscnamt"));
String post_dlvfee = Util.checkString(req.getParameter("post_dlvfee"));
String rptvfreeclsf = Util.checkString(req.getParameter("rptvfreeclsf"));
String rptvsubsdt = Util.checkString(req.getParameter("rptvsubsdt"));
String rptvrdr_extndt = Util.checkString(req.getParameter("rptvrdr_extndt"));
String rptvrdr_extntype = Util.checkString(req.getParameter("rptvrdr_extntype"));
String rptvextn = Util.checkString(req.getParameter("rptvextn"));
String totrdr_extncost = Util.checkString(req.getParameter("totrdr_extncost"));
String clamtclsfcd = Util.checkString(req.getParameter("clamtclsfcd"));
String rptvvalmm = Util.checkString(req.getParameter("rptvvalmm"));
String rptvrdr_movmdt = Util.checkString(req.getParameter("rptvrdr_movmdt"));
String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));
String clamtcyclcd = Util.checkString(req.getParameter("clamtcyclcd"));
String etc1 = Util.checkString(req.getParameter("etc1"));
String etc2 = Util.checkString(req.getParameter("etc2"));
String etc3 = Util.checkString(req.getParameter("etc3"));
String etc4 = Util.checkString(req.getParameter("etc4"));
String etc5 = Util.checkString(req.getParameter("etc5"));
String etc6 = Util.checkString(req.getParameter("etc6"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String paty_clsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("paty_clsfcd")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String ernno = Util.Uni2Ksc(Util.checkString(req.getParameter("ernno")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String weddanvydt = Util.Uni2Ksc(Util.checkString(req.getParameter("weddanvydt")));
String bidt = Util.Uni2Ksc(Util.checkString(req.getParameter("bidt")));
String lusoclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("lusoclsfcd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
String extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnblngcd")));
String empclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("empclsfcd")));
String empdeptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("empdeptcd")));
String empdeptnm = Util.Uni2Ksc(Util.checkString(req.getParameter("empdeptnm")));
String empseq = Util.Uni2Ksc(Util.checkString(req.getParameter("empseq")));
String bodutycd = Util.Uni2Ksc(Util.checkString(req.getParameter("bodutycd")));
String boposicd = Util.Uni2Ksc(Util.checkString(req.getParameter("boposicd")));
String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));
String extnid = Util.Uni2Ksc(Util.checkString(req.getParameter("extnid")));
String extnflnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnflnm")));
String extntel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel1")));
String extntel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel2")));
String extntel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel3")));
String extnptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no1")));
String extnptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no2")));
String extnptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no3")));
String extnemail = Util.Uni2Ksc(Util.checkString(req.getParameter("extnemail")));
String extnprn = Util.Uni2Ksc(Util.checkString(req.getParameter("extnprn")));
String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));
String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));
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
String dlvbnji = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvbnji")));
String dlvser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvser_no")));
String dlvdong = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdong")));
String dlvteamcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvteamcd")));
String dlvdstccd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdstccd")));
String dlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvno")));
String dlvintvno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvintvno")));
String dlvmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvmthdcd")));
String thrw_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_plac")));
String dlvqty = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvqty")));
String valqty = Util.Uni2Ksc(Util.checkString(req.getParameter("valqty")));
String no_valqty = Util.Uni2Ksc(Util.checkString(req.getParameter("no_valqty")));
String pre_valqty = Util.Uni2Ksc(Util.checkString(req.getParameter("pre_valqty")));
String subsamt = Util.Uni2Ksc(Util.checkString(req.getParameter("subsamt")));
String dscnamt = Util.Uni2Ksc(Util.checkString(req.getParameter("dscnamt")));
String post_dlvfee = Util.Uni2Ksc(Util.checkString(req.getParameter("post_dlvfee")));
String rptvfreeclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rptvfreeclsf")));
String rptvsubsdt = Util.Uni2Ksc(Util.checkString(req.getParameter("rptvsubsdt")));
String rptvrdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rptvrdr_extndt")));
String rptvrdr_extntype = Util.Uni2Ksc(Util.checkString(req.getParameter("rptvrdr_extntype")));
String rptvextn = Util.Uni2Ksc(Util.checkString(req.getParameter("rptvextn")));
String totrdr_extncost = Util.Uni2Ksc(Util.checkString(req.getParameter("totrdr_extncost")));
String clamtclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtclsfcd")));
String rptvvalmm = Util.Uni2Ksc(Util.checkString(req.getParameter("rptvvalmm")));
String rptvrdr_movmdt = Util.Uni2Ksc(Util.checkString(req.getParameter("rptvrdr_movmdt")));
String clamtmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtmthdcd")));
String clamtcyclcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtcyclcd")));
String etc1 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc1")));
String etc2 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc2")));
String etc3 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc3")));
String etc4 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc4")));
String etc5 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc5")));
String etc6 = Util.Uni2Ksc(Util.checkString(req.getParameter("etc6")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setPaty_clsfcd(paty_clsfcd);
dm.setRdrnm(rdrnm);
dm.setPrn(prn);
dm.setErnno(ernno);
dm.setEmail(email);
dm.setWeddanvydt(weddanvydt);
dm.setBidt(bidt);
dm.setLusoclsfcd(lusoclsfcd);
dm.setRemk(remk);
dm.setAplcpathcd(aplcpathcd);
dm.setRdr_extntypecd(rdr_extntypecd);
dm.setExtnblngcd(extnblngcd);
dm.setEmpclsfcd(empclsfcd);
dm.setEmpdeptcd(empdeptcd);
dm.setEmpdeptnm(empdeptnm);
dm.setEmpseq(empseq);
dm.setBodutycd(bodutycd);
dm.setBoposicd(boposicd);
dm.setStafclsfcd(stafclsfcd);
dm.setStafno(stafno);
dm.setBoemp_no(boemp_no);
dm.setExtnid(extnid);
dm.setExtnflnm(extnflnm);
dm.setExtntel1(extntel1);
dm.setExtntel2(extntel2);
dm.setExtntel3(extntel3);
dm.setExtnptph_no1(extnptph_no1);
dm.setExtnptph_no2(extnptph_no2);
dm.setExtnptph_no3(extnptph_no3);
dm.setExtnemail(extnemail);
dm.setExtnprn(extnprn);
dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBns_itemcd(bns_itemcd);
dm.setSubsuprc(subsuprc);
dm.setMedicd(medicd);
dm.setResitypecd(resitypecd);
dm.setResiclsfcd(resiclsfcd);
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
dm.setDlvbnji(dlvbnji);
dm.setDlvser_no(dlvser_no);
dm.setDlvdong(dlvdong);
dm.setDlvteamcd(dlvteamcd);
dm.setDlvdstccd(dlvdstccd);
dm.setDlvno(dlvno);
dm.setDlvintvno(dlvintvno);
dm.setDlvmthdcd(dlvmthdcd);
dm.setThrw_plac(thrw_plac);
dm.setDlvqty(dlvqty);
dm.setValqty(valqty);
dm.setNo_valqty(no_valqty);
dm.setPre_valqty(pre_valqty);
dm.setSubsamt(subsamt);
dm.setDscnamt(dscnamt);
dm.setPost_dlvfee(post_dlvfee);
dm.setRptvfreeclsf(rptvfreeclsf);
dm.setRptvsubsdt(rptvsubsdt);
dm.setRptvrdr_extndt(rptvrdr_extndt);
dm.setRptvrdr_extntype(rptvrdr_extntype);
dm.setRptvextn(rptvextn);
dm.setTotrdr_extncost(totrdr_extncost);
dm.setClamtclsfcd(clamtclsfcd);
dm.setRptvvalmm(rptvvalmm);
dm.setRptvrdr_movmdt(rptvrdr_movmdt);
dm.setClamtmthdcd(clamtmthdcd);
dm.setClamtcyclcd(clamtcyclcd);
dm.setEtc1(etc1);
dm.setEtc2(etc2);
dm.setEtc3(etc3);
dm.setEtc4(etc4);
dm.setEtc5(etc5);
dm.setEtc6(etc6);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 01 17:33:42 KST 2004 */