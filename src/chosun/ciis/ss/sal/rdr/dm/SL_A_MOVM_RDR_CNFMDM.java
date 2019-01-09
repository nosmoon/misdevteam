/***************************************************************************************************
* 파일명 : SL_A_MOVM_RDR_CNFMDM.java
* 기능 : 독자-이사독자관리(인수)-등록,수정,삭제를 위한 DM
* 작성일자 : 2004-01-14
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
 * 독자-이사독자관리(인수)-등록,수정,삭제를 위한 DM
 */

public class SL_A_MOVM_RDR_CNFMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String cns_empnm;
	public String accflag;
	public String bocnfmstat;
	public String remk;
	public String regdt;
	public String regno;
	public String rdr_no;
	public String paty_clsfcd;
	public String rdrnm;
	public String prn;
	public String ernno;
	public String email;
	public String weddanvydt;
	public String bidt;
	public String lusoclsfcd;
	public String rdr_remk;
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
	public String freeyn;
	public String freeclsf;
	public String qty;
	public String valmm;

	public SL_A_MOVM_RDR_CNFMDM(){}
	public SL_A_MOVM_RDR_CNFMDM(String bocd, String incmgpers, String cns_empnm, String accflag, String bocnfmstat, String remk, String regdt, String regno, String rdr_no, String paty_clsfcd, String rdrnm, String prn, String ernno, String email, String weddanvydt, String bidt, String lusoclsfcd, String rdr_remk, String resitypecd, String resiclsfcd, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String dlvzip, String dlvcd, long dlvpyong, String dlvaddr, String dlvdtlsaddr, String dlvbnji, String dlvser_no, String dlvdong, String dlvteamcd, String dlvdstccd, String dlvno, String dlvintvno, String dlvmthdcd, String thrw_plac, String medicd, String freeyn, String freeclsf, String qty, String valmm){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.cns_empnm = cns_empnm;
		this.accflag = accflag;
		this.bocnfmstat = bocnfmstat;
		this.remk = remk;
		this.regdt = regdt;
		this.regno = regno;
		this.rdr_no = rdr_no;
		this.paty_clsfcd = paty_clsfcd;
		this.rdrnm = rdrnm;
		this.prn = prn;
		this.ernno = ernno;
		this.email = email;
		this.weddanvydt = weddanvydt;
		this.bidt = bidt;
		this.lusoclsfcd = lusoclsfcd;
		this.rdr_remk = rdr_remk;
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
		this.freeyn = freeyn;
		this.freeclsf = freeclsf;
		this.qty = qty;
		this.valmm = valmm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setBocnfmstat(String bocnfmstat){
		this.bocnfmstat = bocnfmstat;
	}

	public void setRemk(String remk){
		this.remk = remk;
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

	public void setRdr_remk(String rdr_remk){
		this.rdr_remk = rdr_remk;
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

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setFreeclsf(String freeclsf){
		this.freeclsf = freeclsf;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getBocnfmstat(){
		return this.bocnfmstat;
	}

	public String getRemk(){
		return this.remk;
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

	public String getRdr_remk(){
		return this.rdr_remk;
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

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getFreeclsf(){
		return this.freeclsf;
	}

	public String getQty(){
		return this.qty;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_MOVM_RDR_CNFM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_MOVM_RDR_CNFMDM dm = (SL_A_MOVM_RDR_CNFMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.cns_empnm);
		cstmt.setString(6, dm.accflag);
		cstmt.setString(7, dm.bocnfmstat);
		cstmt.setString(8, dm.remk);
		cstmt.setString(9, dm.regdt);
		cstmt.setString(10, dm.regno);
		cstmt.setString(11, dm.rdr_no);
		cstmt.setString(12, dm.paty_clsfcd);
		cstmt.setString(13, dm.rdrnm);
		cstmt.setString(14, dm.prn);
		cstmt.setString(15, dm.ernno);
		cstmt.setString(16, dm.email);
		cstmt.setString(17, dm.weddanvydt);
		cstmt.setString(18, dm.bidt);
		cstmt.setString(19, dm.lusoclsfcd);
		cstmt.setString(20, dm.rdr_remk);
		cstmt.setString(21, dm.resitypecd);
		cstmt.setString(22, dm.resiclsfcd);
		cstmt.setString(23, dm.rdrtel_no1);
		cstmt.setString(24, dm.rdrtel_no2);
		cstmt.setString(25, dm.rdrtel_no3);
		cstmt.setString(26, dm.rdrptph_no1);
		cstmt.setString(27, dm.rdrptph_no2);
		cstmt.setString(28, dm.rdrptph_no3);
		cstmt.setString(29, dm.dlvzip);
		cstmt.setString(30, dm.dlvcd);
		cstmt.setLong(31, dm.dlvpyong);
		cstmt.setString(32, dm.dlvaddr);
		cstmt.setString(33, dm.dlvdtlsaddr);
		cstmt.setString(34, dm.dlvbnji);
		cstmt.setString(35, dm.dlvser_no);
		cstmt.setString(36, dm.dlvdong);
		cstmt.setString(37, dm.dlvteamcd);
		cstmt.setString(38, dm.dlvdstccd);
		cstmt.setString(39, dm.dlvno);
		cstmt.setString(40, dm.dlvintvno);
		cstmt.setString(41, dm.dlvmthdcd);
		cstmt.setString(42, dm.thrw_plac);
		cstmt.setString(43, dm.medicd);
		cstmt.setString(44, dm.freeyn);
		cstmt.setString(45, dm.freeclsf);
		cstmt.setString(46, dm.qty);
		cstmt.setString(47, dm.valmm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_MOVM_RDR_CNFMDataSet();
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
String cns_empnm = req.getParameter("cns_empnm");
if( cns_empnm == null){
	System.out.println(this.toString+" : cns_empnm is null" );
}else{
	System.out.println(this.toString+" : cns_empnm is "+cns_empnm );
}
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String bocnfmstat = req.getParameter("bocnfmstat");
if( bocnfmstat == null){
	System.out.println(this.toString+" : bocnfmstat is null" );
}else{
	System.out.println(this.toString+" : bocnfmstat is "+bocnfmstat );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
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
String rdr_remk = req.getParameter("rdr_remk");
if( rdr_remk == null){
	System.out.println(this.toString+" : rdr_remk is null" );
}else{
	System.out.println(this.toString+" : rdr_remk is "+rdr_remk );
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
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String cns_empnm = Util.checkString(req.getParameter("cns_empnm"));
String accflag = Util.checkString(req.getParameter("accflag"));
String bocnfmstat = Util.checkString(req.getParameter("bocnfmstat"));
String remk = Util.checkString(req.getParameter("remk"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String paty_clsfcd = Util.checkString(req.getParameter("paty_clsfcd"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String prn = Util.checkString(req.getParameter("prn"));
String ernno = Util.checkString(req.getParameter("ernno"));
String email = Util.checkString(req.getParameter("email"));
String weddanvydt = Util.checkString(req.getParameter("weddanvydt"));
String bidt = Util.checkString(req.getParameter("bidt"));
String lusoclsfcd = Util.checkString(req.getParameter("lusoclsfcd"));
String rdr_remk = Util.checkString(req.getParameter("rdr_remk"));
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
String freeyn = Util.checkString(req.getParameter("freeyn"));
String freeclsf = Util.checkString(req.getParameter("freeclsf"));
String qty = Util.checkString(req.getParameter("qty"));
String valmm = Util.checkString(req.getParameter("valmm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String cns_empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empnm")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String bocnfmstat = Util.Uni2Ksc(Util.checkString(req.getParameter("bocnfmstat")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String paty_clsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("paty_clsfcd")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String ernno = Util.Uni2Ksc(Util.checkString(req.getParameter("ernno")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String weddanvydt = Util.Uni2Ksc(Util.checkString(req.getParameter("weddanvydt")));
String bidt = Util.Uni2Ksc(Util.checkString(req.getParameter("bidt")));
String lusoclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("lusoclsfcd")));
String rdr_remk = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_remk")));
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
String freeyn = Util.Uni2Ksc(Util.checkString(req.getParameter("freeyn")));
String freeclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("freeclsf")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setCns_empnm(cns_empnm);
dm.setAccflag(accflag);
dm.setBocnfmstat(bocnfmstat);
dm.setRemk(remk);
dm.setRegdt(regdt);
dm.setRegno(regno);
dm.setRdr_no(rdr_no);
dm.setPaty_clsfcd(paty_clsfcd);
dm.setRdrnm(rdrnm);
dm.setPrn(prn);
dm.setErnno(ernno);
dm.setEmail(email);
dm.setWeddanvydt(weddanvydt);
dm.setBidt(bidt);
dm.setLusoclsfcd(lusoclsfcd);
dm.setRdr_remk(rdr_remk);
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
dm.setFreeyn(freeyn);
dm.setFreeclsf(freeclsf);
dm.setQty(qty);
dm.setValmm(valmm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun Jan 18 20:09:16 KST 2004 */