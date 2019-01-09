/***************************************************************************************************
* 파일명 : SL_U_READERINFODM.java
* 기능 : 독자정보관리(독자정보수정)
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
 * 독자정보관리(독자정보수정)
 *
 */

public class SL_U_READERINFODM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String rdr_no;
	public String dlvdstccd;
	public String dlvno;
	public String dlvintvno;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String dlvbnji;
	public String dlvcd;
	public String dlvdong;
	public String dlvser_no;
	public long dlvpyong;
	public String rdrnm;
	public String paty_clsfcd;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String resitypecd;
	public String resiclsfcd;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String dlvmthdcd;
	public String thrw_plac;
	public String bidt;
	public String lusoclsfcd;
	public String weddanvydt;
	public String email;
	public String prn;
	public String remk;
	public String medicd;
	public String clamtmthdcd;
	public String clamtcyclcd;

	public SL_U_READERINFODM(){}
	public SL_U_READERINFODM(String bocd, String incmgpers, String rdr_no, String dlvdstccd, String dlvno, String dlvintvno, String dlvzip, String dlvaddr, String dlvdtlsaddr, String dlvbnji, String dlvcd, String dlvdong, String dlvser_no, long dlvpyong, String rdrnm, String paty_clsfcd, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String resitypecd, String resiclsfcd, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String dlvmthdcd, String thrw_plac, String bidt, String lusoclsfcd, String weddanvydt, String email, String prn, String remk, String medicd, String clamtmthdcd, String clamtcyclcd){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.rdr_no = rdr_no;
		this.dlvdstccd = dlvdstccd;
		this.dlvno = dlvno;
		this.dlvintvno = dlvintvno;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.dlvbnji = dlvbnji;
		this.dlvcd = dlvcd;
		this.dlvdong = dlvdong;
		this.dlvser_no = dlvser_no;
		this.dlvpyong = dlvpyong;
		this.rdrnm = rdrnm;
		this.paty_clsfcd = paty_clsfcd;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.resitypecd = resitypecd;
		this.resiclsfcd = resiclsfcd;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.dlvmthdcd = dlvmthdcd;
		this.thrw_plac = thrw_plac;
		this.bidt = bidt;
		this.lusoclsfcd = lusoclsfcd;
		this.weddanvydt = weddanvydt;
		this.email = email;
		this.prn = prn;
		this.remk = remk;
		this.medicd = medicd;
		this.clamtmthdcd = clamtmthdcd;
		this.clamtcyclcd = clamtcyclcd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
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

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
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

	public void setDlvcd(String dlvcd){
		this.dlvcd = dlvcd;
	}

	public void setDlvdong(String dlvdong){
		this.dlvdong = dlvdong;
	}

	public void setDlvser_no(String dlvser_no){
		this.dlvser_no = dlvser_no;
	}

	public void setDlvpyong(long dlvpyong){
		this.dlvpyong = dlvpyong;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPaty_clsfcd(String paty_clsfcd){
		this.paty_clsfcd = paty_clsfcd;
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

	public void setResitypecd(String resitypecd){
		this.resitypecd = resitypecd;
	}

	public void setResiclsfcd(String resiclsfcd){
		this.resiclsfcd = resiclsfcd;
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

	public void setDlvmthdcd(String dlvmthdcd){
		this.dlvmthdcd = dlvmthdcd;
	}

	public void setThrw_plac(String thrw_plac){
		this.thrw_plac = thrw_plac;
	}

	public void setBidt(String bidt){
		this.bidt = bidt;
	}

	public void setLusoclsfcd(String lusoclsfcd){
		this.lusoclsfcd = lusoclsfcd;
	}

	public void setWeddanvydt(String weddanvydt){
		this.weddanvydt = weddanvydt;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setClamtmthdcd(String clamtmthdcd){
		this.clamtmthdcd = clamtmthdcd;
	}

	public void setClamtcyclcd(String clamtcyclcd){
		this.clamtcyclcd = clamtcyclcd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getRdr_no(){
		return this.rdr_no;
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

	public String getDlvzip(){
		return this.dlvzip;
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

	public String getDlvcd(){
		return this.dlvcd;
	}

	public String getDlvdong(){
		return this.dlvdong;
	}

	public String getDlvser_no(){
		return this.dlvser_no;
	}

	public long getDlvpyong(){
		return this.dlvpyong;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPaty_clsfcd(){
		return this.paty_clsfcd;
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

	public String getResitypecd(){
		return this.resitypecd;
	}

	public String getResiclsfcd(){
		return this.resiclsfcd;
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

	public String getDlvmthdcd(){
		return this.dlvmthdcd;
	}

	public String getThrw_plac(){
		return this.thrw_plac;
	}

	public String getBidt(){
		return this.bidt;
	}

	public String getLusoclsfcd(){
		return this.lusoclsfcd;
	}

	public String getWeddanvydt(){
		return this.weddanvydt;
	}

	public String getEmail(){
		return this.email;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getClamtmthdcd(){
		return this.clamtmthdcd;
	}

	public String getClamtcyclcd(){
		return this.clamtcyclcd;
	}

	public String getSQL(){
		 return "{ call SP_SL_U_READERINFO( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_U_READERINFODM dm = (SL_U_READERINFODM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.rdr_no);
		cstmt.setString(6, dm.dlvdstccd);
		cstmt.setString(7, dm.dlvno);
		cstmt.setString(8, dm.dlvintvno);
		cstmt.setString(9, dm.dlvzip);
		cstmt.setString(10, dm.dlvaddr);
		cstmt.setString(11, dm.dlvdtlsaddr);
		cstmt.setString(12, dm.dlvbnji);
		cstmt.setString(13, dm.dlvcd);
		cstmt.setString(14, dm.dlvdong);
		cstmt.setString(15, dm.dlvser_no);
		cstmt.setLong(16, dm.dlvpyong);
		cstmt.setString(17, dm.rdrnm);
		cstmt.setString(18, dm.paty_clsfcd);
		cstmt.setString(19, dm.rdrtel_no1);
		cstmt.setString(20, dm.rdrtel_no2);
		cstmt.setString(21, dm.rdrtel_no3);
		cstmt.setString(22, dm.resitypecd);
		cstmt.setString(23, dm.resiclsfcd);
		cstmt.setString(24, dm.rdrptph_no1);
		cstmt.setString(25, dm.rdrptph_no2);
		cstmt.setString(26, dm.rdrptph_no3);
		cstmt.setString(27, dm.dlvmthdcd);
		cstmt.setString(28, dm.thrw_plac);
		cstmt.setString(29, dm.bidt);
		cstmt.setString(30, dm.lusoclsfcd);
		cstmt.setString(31, dm.weddanvydt);
		cstmt.setString(32, dm.email);
		cstmt.setString(33, dm.prn);
		cstmt.setString(34, dm.remk);
		cstmt.setString(35, dm.medicd);
		cstmt.setString(36, dm.clamtmthdcd);
		cstmt.setString(37, dm.clamtcyclcd);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_U_READERINFODataSet();
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
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
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
String dlvzip = req.getParameter("dlvzip");
if( dlvzip == null){
	System.out.println(this.toString+" : dlvzip is null" );
}else{
	System.out.println(this.toString+" : dlvzip is "+dlvzip );
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
String dlvcd = req.getParameter("dlvcd");
if( dlvcd == null){
	System.out.println(this.toString+" : dlvcd is null" );
}else{
	System.out.println(this.toString+" : dlvcd is "+dlvcd );
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
String dlvpyong = req.getParameter("dlvpyong");
if( dlvpyong == null){
	System.out.println(this.toString+" : dlvpyong is null" );
}else{
	System.out.println(this.toString+" : dlvpyong is "+dlvpyong );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String paty_clsfcd = req.getParameter("paty_clsfcd");
if( paty_clsfcd == null){
	System.out.println(this.toString+" : paty_clsfcd is null" );
}else{
	System.out.println(this.toString+" : paty_clsfcd is "+paty_clsfcd );
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
String weddanvydt = req.getParameter("weddanvydt");
if( weddanvydt == null){
	System.out.println(this.toString+" : weddanvydt is null" );
}else{
	System.out.println(this.toString+" : weddanvydt is "+weddanvydt );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String dlvdstccd = Util.checkString(req.getParameter("dlvdstccd"));
String dlvno = Util.checkString(req.getParameter("dlvno"));
String dlvintvno = Util.checkString(req.getParameter("dlvintvno"));
String dlvzip = Util.checkString(req.getParameter("dlvzip"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String dlvdtlsaddr = Util.checkString(req.getParameter("dlvdtlsaddr"));
String dlvbnji = Util.checkString(req.getParameter("dlvbnji"));
String dlvcd = Util.checkString(req.getParameter("dlvcd"));
String dlvdong = Util.checkString(req.getParameter("dlvdong"));
String dlvser_no = Util.checkString(req.getParameter("dlvser_no"));
String dlvpyong = Util.checkString(req.getParameter("dlvpyong"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String paty_clsfcd = Util.checkString(req.getParameter("paty_clsfcd"));
String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
String resitypecd = Util.checkString(req.getParameter("resitypecd"));
String resiclsfcd = Util.checkString(req.getParameter("resiclsfcd"));
String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));
String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));
String dlvmthdcd = Util.checkString(req.getParameter("dlvmthdcd"));
String thrw_plac = Util.checkString(req.getParameter("thrw_plac"));
String bidt = Util.checkString(req.getParameter("bidt"));
String lusoclsfcd = Util.checkString(req.getParameter("lusoclsfcd"));
String weddanvydt = Util.checkString(req.getParameter("weddanvydt"));
String email = Util.checkString(req.getParameter("email"));
String prn = Util.checkString(req.getParameter("prn"));
String remk = Util.checkString(req.getParameter("remk"));
String medicd = Util.checkString(req.getParameter("medicd"));
String clamtmthdcd = Util.checkString(req.getParameter("clamtmthdcd"));
String clamtcyclcd = Util.checkString(req.getParameter("clamtcyclcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String dlvdstccd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdstccd")));
String dlvno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvno")));
String dlvintvno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvintvno")));
String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
String dlvbnji = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvbnji")));
String dlvcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvcd")));
String dlvdong = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdong")));
String dlvser_no = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvser_no")));
String dlvpyong = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvpyong")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String paty_clsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("paty_clsfcd")));
String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
String resitypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("resitypecd")));
String resiclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("resiclsfcd")));
String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
String dlvmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvmthdcd")));
String thrw_plac = Util.Uni2Ksc(Util.checkString(req.getParameter("thrw_plac")));
String bidt = Util.Uni2Ksc(Util.checkString(req.getParameter("bidt")));
String lusoclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("lusoclsfcd")));
String weddanvydt = Util.Uni2Ksc(Util.checkString(req.getParameter("weddanvydt")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String clamtmthdcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtmthdcd")));
String clamtcyclcd = Util.Uni2Ksc(Util.checkString(req.getParameter("clamtcyclcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setRdr_no(rdr_no);
dm.setDlvdstccd(dlvdstccd);
dm.setDlvno(dlvno);
dm.setDlvintvno(dlvintvno);
dm.setDlvzip(dlvzip);
dm.setDlvaddr(dlvaddr);
dm.setDlvdtlsaddr(dlvdtlsaddr);
dm.setDlvbnji(dlvbnji);
dm.setDlvcd(dlvcd);
dm.setDlvdong(dlvdong);
dm.setDlvser_no(dlvser_no);
dm.setDlvpyong(dlvpyong);
dm.setRdrnm(rdrnm);
dm.setPaty_clsfcd(paty_clsfcd);
dm.setRdrtel_no1(rdrtel_no1);
dm.setRdrtel_no2(rdrtel_no2);
dm.setRdrtel_no3(rdrtel_no3);
dm.setResitypecd(resitypecd);
dm.setResiclsfcd(resiclsfcd);
dm.setRdrptph_no1(rdrptph_no1);
dm.setRdrptph_no2(rdrptph_no2);
dm.setRdrptph_no3(rdrptph_no3);
dm.setDlvmthdcd(dlvmthdcd);
dm.setThrw_plac(thrw_plac);
dm.setBidt(bidt);
dm.setLusoclsfcd(lusoclsfcd);
dm.setWeddanvydt(weddanvydt);
dm.setEmail(email);
dm.setPrn(prn);
dm.setRemk(remk);
dm.setMedicd(medicd);
dm.setClamtmthdcd(clamtmthdcd);
dm.setClamtcyclcd(clamtcyclcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sun May 30 23:15:11 KST 2004 */