/***************************************************************************************************
* 파일명 : SL_A_RDR_EXTN_CNFMDM.java
* 기능 : 외부확장확인관리(저장(확인))
* 작성일자 : 2004-05-20
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
 * 외부확장확인관리(저장(확인))
 *
 */

public class SL_A_RDR_EXTN_CNFMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String rdr_extndt;
	public String rdr_extnno;
	public String subscnfmstatcd;
	public String prcmsg;
	public String rdr_no;
	public String paty_clsfcd;
	public String rdrnm;
	public String prn;
	public String ernno;
	public String email;
	public String weddanvydt;
	public String bidt;
	public String lusoclsfcd;
	public String remk;
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
	public String medicd;
	public String rdr_extntypecd;
	public String extnnm;
	public long rdr_extncost;
	public String subsfr_dt;
	public String clamtmthdcd;
	public String clamtcyclcd;
	public String freeyn;
	public String freeclsf;
	public String valmm;
	public long subsuprc;
	public long subsqty;
	public long dscnamt;
	public String post_dlvfee;
	public String bns_itemcd;
	public String etc1;
	public String etc2;
	public String etc3;
	public String etc4;
	public String etc5;
	public String etc6;

	public SL_A_RDR_EXTN_CNFMDM(){}
	public SL_A_RDR_EXTN_CNFMDM(String bocd, String incmgpers, String rdr_extndt, String rdr_extnno, String subscnfmstatcd, String prcmsg, String rdr_no, String paty_clsfcd, String rdrnm, String prn, String ernno, String email, String weddanvydt, String bidt, String lusoclsfcd, String remk, String resitypecd, String resiclsfcd, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String dlvzip, String dlvcd, long dlvpyong, String dlvaddr, String dlvdtlsaddr, String dlvbnji, String dlvser_no, String dlvdong, String dlvteamcd, String dlvdstccd, String dlvno, String dlvintvno, String dlvmthdcd, String thrw_plac, String medicd, String rdr_extntypecd, String extnnm, long rdr_extncost, String subsfr_dt, String clamtmthdcd, String clamtcyclcd, String freeyn, String freeclsf, String valmm, long subsuprc, long subsqty, long dscnamt, String post_dlvfee, String bns_itemcd, String etc1, String etc2, String etc3, String etc4, String etc5, String etc6){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.subscnfmstatcd = subscnfmstatcd;
		this.prcmsg = prcmsg;
		this.rdr_no = rdr_no;
		this.paty_clsfcd = paty_clsfcd;
		this.rdrnm = rdrnm;
		this.prn = prn;
		this.ernno = ernno;
		this.email = email;
		this.weddanvydt = weddanvydt;
		this.bidt = bidt;
		this.lusoclsfcd = lusoclsfcd;
		this.remk = remk;
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
		this.medicd = medicd;
		this.rdr_extntypecd = rdr_extntypecd;
		this.extnnm = extnnm;
		this.rdr_extncost = rdr_extncost;
		this.subsfr_dt = subsfr_dt;
		this.clamtmthdcd = clamtmthdcd;
		this.clamtcyclcd = clamtcyclcd;
		this.freeyn = freeyn;
		this.freeclsf = freeclsf;
		this.valmm = valmm;
		this.subsuprc = subsuprc;
		this.subsqty = subsqty;
		this.dscnamt = dscnamt;
		this.post_dlvfee = post_dlvfee;
		this.bns_itemcd = bns_itemcd;
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

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setSubscnfmstatcd(String subscnfmstatcd){
		this.subscnfmstatcd = subscnfmstatcd;
	}

	public void setPrcmsg(String prcmsg){
		this.prcmsg = prcmsg;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
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

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
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

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setClamtcyclcd(String clamtcyclcd){
		this.clamtcyclcd = clamtcyclcd;
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

	public void setPost_dlvfee(String post_dlvfee){
		this.post_dlvfee = post_dlvfee;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
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

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getSubscnfmstatcd(){
		return this.subscnfmstatcd;
	}

	public String getPrcmsg(){
		return this.prcmsg;
	}

	public String getRdr_no(){
		return this.rdr_no;
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

	public String getMedicd(){
		return this.medicd;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
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

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getClamtcyclcd(){
		return this.clamtcyclcd;
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

	public String getPost_dlvfee(){
		return this.post_dlvfee;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
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
		 return "{ call SP_SL_A_RDR_EXTN_CNFM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_RDR_EXTN_CNFMDM dm = (SL_A_RDR_EXTN_CNFMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.rdr_extndt);
		cstmt.setString(6, dm.rdr_extnno);
		cstmt.setString(7, dm.subscnfmstatcd);
		cstmt.setString(8, dm.prcmsg);
		cstmt.setString(9, dm.rdr_no);
		cstmt.setString(10, dm.paty_clsfcd);
		cstmt.setString(11, dm.rdrnm);
		cstmt.setString(12, dm.prn);
		cstmt.setString(13, dm.ernno);
		cstmt.setString(14, dm.email);
		cstmt.setString(15, dm.weddanvydt);
		cstmt.setString(16, dm.bidt);
		cstmt.setString(17, dm.lusoclsfcd);
		cstmt.setString(18, dm.remk);
		cstmt.setString(19, dm.resitypecd);
		cstmt.setString(20, dm.resiclsfcd);
		cstmt.setString(21, dm.rdrtel_no1);
		cstmt.setString(22, dm.rdrtel_no2);
		cstmt.setString(23, dm.rdrtel_no3);
		cstmt.setString(24, dm.rdrptph_no1);
		cstmt.setString(25, dm.rdrptph_no2);
		cstmt.setString(26, dm.rdrptph_no3);
		cstmt.setString(27, dm.dlvzip);
		cstmt.setString(28, dm.dlvcd);
		cstmt.setLong(29, dm.dlvpyong);
		cstmt.setString(30, dm.dlvaddr);
		cstmt.setString(31, dm.dlvdtlsaddr);
		cstmt.setString(32, dm.dlvbnji);
		cstmt.setString(33, dm.dlvser_no);
		cstmt.setString(34, dm.dlvdong);
		cstmt.setString(35, dm.dlvteamcd);
		cstmt.setString(36, dm.dlvdstccd);
		cstmt.setString(37, dm.dlvno);
		cstmt.setString(38, dm.dlvintvno);
		cstmt.setString(39, dm.dlvmthdcd);
		cstmt.setString(40, dm.thrw_plac);
		cstmt.setString(41, dm.medicd);
		cstmt.setString(42, dm.rdr_extntypecd);
		cstmt.setString(43, dm.extnnm);
		cstmt.setLong(44, dm.rdr_extncost);
		cstmt.setString(45, dm.subsfr_dt);
		cstmt.setString(46, dm.clamtmthdcd);
		cstmt.setString(47, dm.clamtcyclcd);
		cstmt.setString(48, dm.freeyn);
		cstmt.setString(49, dm.freeclsf);
		cstmt.setString(50, dm.valmm);
		cstmt.setLong(51, dm.subsuprc);
		cstmt.setLong(52, dm.subsqty);
		cstmt.setLong(53, dm.dscnamt);
		cstmt.setString(54, dm.post_dlvfee);
		cstmt.setString(55, dm.bns_itemcd);
		cstmt.setString(56, dm.etc1);
		cstmt.setString(57, dm.etc2);
		cstmt.setString(58, dm.etc3);
		cstmt.setString(59, dm.etc4);
		cstmt.setString(60, dm.etc5);
		cstmt.setString(61, dm.etc6);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_RDR_EXTN_CNFMDataSet();
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
String subscnfmstatcd = req.getParameter("subscnfmstatcd");
if( subscnfmstatcd == null){
	System.out.println(this.toString+" : subscnfmstatcd is null" );
}else{
	System.out.println(this.toString+" : subscnfmstatcd is "+subscnfmstatcd );
}
String prcmsg = req.getParameter("prcmsg");
if( prcmsg == null){
	System.out.println(this.toString+" : prcmsg is null" );
}else{
	System.out.println(this.toString+" : prcmsg is "+prcmsg );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String rdr_extntypecd = req.getParameter("rdr_extntypecd");
if( rdr_extntypecd == null){
	System.out.println(this.toString+" : rdr_extntypecd is null" );
}else{
	System.out.println(this.toString+" : rdr_extntypecd is "+rdr_extntypecd );
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
String bns_itemcd = req.getParameter("bns_itemcd");
if( bns_itemcd == null){
	System.out.println(this.toString+" : bns_itemcd is null" );
}else{
	System.out.println(this.toString+" : bns_itemcd is "+bns_itemcd );
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
String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String subscnfmstatcd = Util.checkString(req.getParameter("subscnfmstatcd"));
String prcmsg = Util.checkString(req.getParameter("prcmsg"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String paty_clsfcd = Util.checkString(req.getParameter("paty_clsfcd"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String prn = Util.checkString(req.getParameter("prn"));
String ernno = Util.checkString(req.getParameter("ernno"));
String email = Util.checkString(req.getParameter("email"));
String weddanvydt = Util.checkString(req.getParameter("weddanvydt"));
String bidt = Util.checkString(req.getParameter("bidt"));
String lusoclsfcd = Util.checkString(req.getParameter("lusoclsfcd"));
String remk = Util.checkString(req.getParameter("remk"));
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
String medicd = Util.checkString(req.getParameter("medicd"));
String rdr_extntypecd = Util.checkString(req.getParameter("rdr_extntypecd"));
String extnnm = Util.checkString(req.getParameter("extnnm"));
String rdr_extncost = Util.checkString(req.getParameter("rdr_extncost"));
String subsfr_dt = Util.checkString(req.getParameter("subsfr_dt"));
String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));
String clamtcyclcd = Util.checkString(req.getParameter("clamtcyclcd"));
String freeyn = Util.checkString(req.getParameter("freeyn"));
String freeclsf = Util.checkString(req.getParameter("freeclsf"));
String valmm = Util.checkString(req.getParameter("valmm"));
String subsuprc = Util.checkString(req.getParameter("subsuprc"));
String subsqty = Util.checkString(req.getParameter("subsqty"));
String dscnamt = Util.checkString(req.getParameter("dscnamt"));
String post_dlvfee = Util.checkString(req.getParameter("post_dlvfee"));
String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
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
String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String subscnfmstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("subscnfmstatcd")));
String prcmsg = Util.Uni2Ksc(Util.checkString(req.getParameter("prcmsg")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String paty_clsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("paty_clsfcd")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String ernno = Util.Uni2Ksc(Util.checkString(req.getParameter("ernno")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String weddanvydt = Util.Uni2Ksc(Util.checkString(req.getParameter("weddanvydt")));
String bidt = Util.Uni2Ksc(Util.checkString(req.getParameter("bidt")));
String lusoclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("lusoclsfcd")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
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
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
String extnnm = Util.Uni2Ksc(Util.checkString(req.getParameter("extnnm")));
String rdr_extncost = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extncost")));
String subsfr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("subsfr_dt")));
String clamtmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtmthdcd")));
String clamtcyclcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtcyclcd")));
String freeyn = Util.Uni2Ksc(Util.checkString(req.getParameter("freeyn")));
String freeclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("freeclsf")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
String subsuprc = Util.Uni2Ksc(Util.checkString(req.getParameter("subsuprc")));
String subsqty = Util.Uni2Ksc(Util.checkString(req.getParameter("subsqty")));
String dscnamt = Util.Uni2Ksc(Util.checkString(req.getParameter("dscnamt")));
String post_dlvfee = Util.Uni2Ksc(Util.checkString(req.getParameter("post_dlvfee")));
String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
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
dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setSubscnfmstatcd(subscnfmstatcd);
dm.setPrcmsg(prcmsg);
dm.setRdr_no(rdr_no);
dm.setPaty_clsfcd(paty_clsfcd);
dm.setRdrnm(rdrnm);
dm.setPrn(prn);
dm.setErnno(ernno);
dm.setEmail(email);
dm.setWeddanvydt(weddanvydt);
dm.setBidt(bidt);
dm.setLusoclsfcd(lusoclsfcd);
dm.setRemk(remk);
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
dm.setMedicd(medicd);
dm.setRdr_extntypecd(rdr_extntypecd);
dm.setExtnnm(extnnm);
dm.setRdr_extncost(rdr_extncost);
dm.setSubsfr_dt(subsfr_dt);
dm.setClamtmthdcd(clamtmthdcd);
dm.setClamtcyclcd(clamtcyclcd);
dm.setFreeyn(freeyn);
dm.setFreeclsf(freeclsf);
dm.setValmm(valmm);
dm.setSubsuprc(subsuprc);
dm.setSubsqty(subsqty);
dm.setDscnamt(dscnamt);
dm.setPost_dlvfee(post_dlvfee);
dm.setBns_itemcd(bns_itemcd);
dm.setEtc1(etc1);
dm.setEtc2(etc2);
dm.setEtc3(etc3);
dm.setEtc4(etc4);
dm.setEtc5(etc5);
dm.setEtc6(etc6);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 01 16:26:35 KST 2004 */