/***************************************************************************************************
* 파일명 : SL_A_NWSPSUBSCNTRDM.java
* 기능 : 독자정보관리(구독추가변경팝업-구독계약수정)
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
 * 독자정보관리(구독추가변경팝업-구독계약수정)
 *
 */

public class SL_A_NWSPSUBSCNTRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String incmgpers;
	public String accflag;
	public String rdr_no;
	public String medicd;
	public String cntrno;
	public String mangno;
	public String rdr_extndt;
	public String rdr_extnno;
	public String rdr_extntypecd;
	public String aplcpathcd;
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
	public String bns_itemcd;
	public String extnblngcd;
	public String bodutycd;
	public String boposicd;
	public String stafclsfcd;
	public String stafno;
	public String boemp_no;
	public String extntel1;
	public String extntel2;
	public String extntel3;
	public String extnptph_no1;
	public String extnptph_no2;
	public String extnptph_no3;
	public String extnprn;
	public String extnemail;
	public String remk;

	public SL_A_NWSPSUBSCNTRDM(){}
	public SL_A_NWSPSUBSCNTRDM(String bocd, String incmgpers, String accflag, String rdr_no, String medicd, String cntrno, String mangno, String rdr_extndt, String rdr_extnno, String rdr_extntypecd, String aplcpathcd, String extnnm, long rdr_extncost, String subsfr_dt, String freeyn, String freeclsf, String valmm, long subsuprc, long subsqty, long dscnamt, long post_dlvfee, String bns_itemcd, String extnblngcd, String bodutycd, String boposicd, String stafclsfcd, String stafno, String boemp_no, String extntel1, String extntel2, String extntel3, String extnptph_no1, String extnptph_no2, String extnptph_no3, String extnprn, String extnemail, String remk){
		this.bocd = bocd;
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.rdr_no = rdr_no;
		this.medicd = medicd;
		this.cntrno = cntrno;
		this.mangno = mangno;
		this.rdr_extndt = rdr_extndt;
		this.rdr_extnno = rdr_extnno;
		this.rdr_extntypecd = rdr_extntypecd;
		this.aplcpathcd = aplcpathcd;
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
		this.bns_itemcd = bns_itemcd;
		this.extnblngcd = extnblngcd;
		this.bodutycd = bodutycd;
		this.boposicd = boposicd;
		this.stafclsfcd = stafclsfcd;
		this.stafno = stafno;
		this.boemp_no = boemp_no;
		this.extntel1 = extntel1;
		this.extntel2 = extntel2;
		this.extntel3 = extntel3;
		this.extnptph_no1 = extnptph_no1;
		this.extnptph_no2 = extnptph_no2;
		this.extnptph_no3 = extnptph_no3;
		this.extnprn = extnprn;
		this.extnemail = extnemail;
		this.remk = remk;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setMangno(String mangno){
		this.mangno = mangno;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setRdr_extntypecd(String rdr_extntypecd){
		this.rdr_extntypecd = rdr_extntypecd;
	}

	public void setAplcpathcd(String aplcpathcd){
		this.aplcpathcd = aplcpathcd;
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

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setExtnblngcd(String extnblngcd){
		this.extnblngcd = extnblngcd;
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

	public void setExtnprn(String extnprn){
		this.extnprn = extnprn;
	}

	public void setExtnemail(String extnemail){
		this.extnemail = extnemail;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCntrno(){
		return this.cntrno;
	}

	public String getMangno(){
		return this.mangno;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getRdr_extntypecd(){
		return this.rdr_extntypecd;
	}

	public String getAplcpathcd(){
		return this.aplcpathcd;
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

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getExtnblngcd(){
		return this.extnblngcd;
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

	public String getExtnprn(){
		return this.extnprn;
	}

	public String getExtnemail(){
		return this.extnemail;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_NWSPSUBSCNTR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_NWSPSUBSCNTRDM dm = (SL_A_NWSPSUBSCNTRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.accflag);
		cstmt.setString(6, dm.rdr_no);
		cstmt.setString(7, dm.medicd);
		cstmt.setString(8, dm.cntrno);
		cstmt.setString(9, dm.mangno);
		cstmt.setString(10, dm.rdr_extndt);
		cstmt.setString(11, dm.rdr_extnno);
		cstmt.setString(12, dm.rdr_extntypecd);
		cstmt.setString(13, dm.aplcpathcd);
		cstmt.setString(14, dm.extnnm);
		cstmt.setLong(15, dm.rdr_extncost);
		cstmt.setString(16, dm.subsfr_dt);
		cstmt.setString(17, dm.freeyn);
		cstmt.setString(18, dm.freeclsf);
		cstmt.setString(19, dm.valmm);
		cstmt.setLong(20, dm.subsuprc);
		cstmt.setLong(21, dm.subsqty);
		cstmt.setLong(22, dm.dscnamt);
		cstmt.setLong(23, dm.post_dlvfee);
		cstmt.setString(24, dm.bns_itemcd);
		cstmt.setString(25, dm.extnblngcd);
		cstmt.setString(26, dm.bodutycd);
		cstmt.setString(27, dm.boposicd);
		cstmt.setString(28, dm.stafclsfcd);
		cstmt.setString(29, dm.stafno);
		cstmt.setString(30, dm.boemp_no);
		cstmt.setString(31, dm.extntel1);
		cstmt.setString(32, dm.extntel2);
		cstmt.setString(33, dm.extntel3);
		cstmt.setString(34, dm.extnptph_no1);
		cstmt.setString(35, dm.extnptph_no2);
		cstmt.setString(36, dm.extnptph_no3);
		cstmt.setString(37, dm.extnprn);
		cstmt.setString(38, dm.extnemail);
		cstmt.setString(39, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.SL_A_NWSPSUBSCNTRDataSet();
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
String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
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
String cntrno = req.getParameter("cntrno");
if( cntrno == null){
	System.out.println(this.toString+" : cntrno is null" );
}else{
	System.out.println(this.toString+" : cntrno is "+cntrno );
}
String mangno = req.getParameter("mangno");
if( mangno == null){
	System.out.println(this.toString+" : mangno is null" );
}else{
	System.out.println(this.toString+" : mangno is "+mangno );
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
String rdr_extntypecd = req.getParameter("rdr_extntypecd");
if( rdr_extntypecd == null){
	System.out.println(this.toString+" : rdr_extntypecd is null" );
}else{
	System.out.println(this.toString+" : rdr_extntypecd is "+rdr_extntypecd );
}
String aplcpathcd = req.getParameter("aplcpathcd");
if( aplcpathcd == null){
	System.out.println(this.toString+" : aplcpathcd is null" );
}else{
	System.out.println(this.toString+" : aplcpathcd is "+aplcpathcd );
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
String bns_itemcd = req.getParameter("bns_itemcd");
if( bns_itemcd == null){
	System.out.println(this.toString+" : bns_itemcd is null" );
}else{
	System.out.println(this.toString+" : bns_itemcd is "+bns_itemcd );
}
String extnblngcd = req.getParameter("extnblngcd");
if( extnblngcd == null){
	System.out.println(this.toString+" : extnblngcd is null" );
}else{
	System.out.println(this.toString+" : extnblngcd is "+extnblngcd );
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
String extnprn = req.getParameter("extnprn");
if( extnprn == null){
	System.out.println(this.toString+" : extnprn is null" );
}else{
	System.out.println(this.toString+" : extnprn is "+extnprn );
}
String extnemail = req.getParameter("extnemail");
if( extnemail == null){
	System.out.println(this.toString+" : extnemail is null" );
}else{
	System.out.println(this.toString+" : extnemail is "+extnemail );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String medicd = Util.checkString(req.getParameter("medicd"));
String cntrno = Util.checkString(req.getParameter("cntrno"));
String mangno = Util.checkString(req.getParameter("mangno"));
String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String rdr_extntypecd = Util.checkString(req.getParameter("rdr_extntypecd"));
String aplcpathcd = Util.checkString(req.getParameter("aplcpathcd"));
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
String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
String extnblngcd = Util.checkString(req.getParameter("extnblngcd"));
String bodutycd = Util.checkString(req.getParameter("bodutycd"));
String boposicd = Util.checkString(req.getParameter("boposicd"));
String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
String stafno = Util.checkString(req.getParameter("stafno"));
String boemp_no = Util.checkString(req.getParameter("boemp_no"));
String extntel1 = Util.checkString(req.getParameter("extntel1"));
String extntel2 = Util.checkString(req.getParameter("extntel2"));
String extntel3 = Util.checkString(req.getParameter("extntel3"));
String extnptph_no1 = Util.checkString(req.getParameter("extnptph_no1"));
String extnptph_no2 = Util.checkString(req.getParameter("extnptph_no2"));
String extnptph_no3 = Util.checkString(req.getParameter("extnptph_no3"));
String extnprn = Util.checkString(req.getParameter("extnprn"));
String extnemail = Util.checkString(req.getParameter("extnemail"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));
String mangno = Util.Uni2Ksc(Util.checkString(req.getParameter("mangno")));
String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String rdr_extntypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extntypecd")));
String aplcpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcpathcd")));
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
String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
String extnblngcd = Util.Uni2Ksc(Util.checkString(req.getParameter("extnblngcd")));
String bodutycd = Util.Uni2Ksc(Util.checkString(req.getParameter("bodutycd")));
String boposicd = Util.Uni2Ksc(Util.checkString(req.getParameter("boposicd")));
String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
String boemp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("boemp_no")));
String extntel1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel1")));
String extntel2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel2")));
String extntel3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extntel3")));
String extnptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no1")));
String extnptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no2")));
String extnptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("extnptph_no3")));
String extnprn = Util.Uni2Ksc(Util.checkString(req.getParameter("extnprn")));
String extnemail = Util.Uni2Ksc(Util.checkString(req.getParameter("extnemail")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setRdr_no(rdr_no);
dm.setMedicd(medicd);
dm.setCntrno(cntrno);
dm.setMangno(mangno);
dm.setRdr_extndt(rdr_extndt);
dm.setRdr_extnno(rdr_extnno);
dm.setRdr_extntypecd(rdr_extntypecd);
dm.setAplcpathcd(aplcpathcd);
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
dm.setBns_itemcd(bns_itemcd);
dm.setExtnblngcd(extnblngcd);
dm.setBodutycd(bodutycd);
dm.setBoposicd(boposicd);
dm.setStafclsfcd(stafclsfcd);
dm.setStafno(stafno);
dm.setBoemp_no(boemp_no);
dm.setExtntel1(extntel1);
dm.setExtntel2(extntel2);
dm.setExtntel3(extntel3);
dm.setExtnptph_no1(extnptph_no1);
dm.setExtnptph_no2(extnptph_no2);
dm.setExtnptph_no3(extnptph_no3);
dm.setExtnprn(extnprn);
dm.setExtnemail(extnemail);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 01 16:31:12 KST 2004 */