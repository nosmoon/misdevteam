/***************************************************************************************************
* 파일명 : .java
* 기능 : 지지국지원-빌링_자동이체-이체신청개선 업로드(이체신청내역 엑셀문서 일괄등록)  
* 작성일자 :2009/05/22 
* 작성자 : 김용욱
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.ds.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원-빌링_자동이체-이체신청개선 업로드(이체신청내역 엑셀문서 일괄등록)  
 */

public class SS_L_SHFTAPLC_UPLOADDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String uid;
	public String filenm;
	public String procdt;
	public String procstat;
	public String proccnt;
	public String basidt;
	public String svctype;
	public String aplcclsf;
	public String insttcd;
	public String aplcdt;
	public String shftaplcclsf;
	public String pymtno1;
	public String pymtno2;
	public String pymthopedt;
	public String feekind;
	public String recpinstt;
	public String acctno;
	public String vdtydt;
	public String prn;
	public String nm;
	public String tel_no;
	public String rdrnm;
	public String rdrtel;
	public String rdrprn;
	public String zipseq;
	public String zip1;
	public String zip2;
	public String zip3;
	public String dlvplacno;
	public String brchptel;
	public String reqbrchcd;
	public String fststrtdt;
	public String reqplacclsf;
	public String elecreqno;
	public String ocomcd;
	public String ocomresn;
	public String remk;

	public SS_L_SHFTAPLC_UPLOADDM(){}
	public SS_L_SHFTAPLC_UPLOADDM(String uid, String filenm, String procdt, String procstat, String proccnt, String basidt, String svctype, String aplcclsf, String insttcd, String aplcdt, String shftaplcclsf, String pymtno1, String pymtno2, String pymthopedt, String feekind, String recpinstt, String acctno, String vdtydt, String prn, String nm, String tel_no, String rdrnm, String rdrtel, String rdrprn, String zipseq, String zip1, String zip2, String zip3, String dlvplacno, String brchptel, String reqbrchcd, String fststrtdt, String reqplacclsf, String elecreqno, String ocomcd, String ocomresn, String remk){
		this.uid = uid;
		this.filenm = filenm;
		this.procdt = procdt;
		this.procstat = procstat;
		this.proccnt = proccnt;
		this.basidt = basidt;
		this.svctype = svctype;
		this.aplcclsf = aplcclsf;
		this.insttcd = insttcd;
		this.aplcdt = aplcdt;
		this.shftaplcclsf = shftaplcclsf;
		this.pymtno1 = pymtno1;
		this.pymtno2 = pymtno2;
		this.pymthopedt = pymthopedt;
		this.feekind = feekind;
		this.recpinstt = recpinstt;
		this.acctno = acctno;
		this.vdtydt = vdtydt;
		this.prn = prn;
		this.nm = nm;
		this.tel_no = tel_no;
		this.rdrnm = rdrnm;
		this.rdrtel = rdrtel;
		this.rdrprn = rdrprn;
		this.zipseq = zipseq;
		this.zip1 = zip1;
		this.zip2 = zip2;
		this.zip3 = zip3;
		this.dlvplacno = dlvplacno;
		this.brchptel = brchptel;
		this.reqbrchcd = reqbrchcd;
		this.fststrtdt = fststrtdt;
		this.reqplacclsf = reqplacclsf;
		this.elecreqno = elecreqno;
		this.ocomcd = ocomcd;
		this.ocomresn = ocomresn;
		this.remk = remk;
	}

	public void setUid(String uid){
		this.uid = uid;
	}

	public void setFilenm(String filenm){
		this.filenm = filenm;
	}

	public void setProcdt(String procdt){
		this.procdt = procdt;
	}

	public void setProcstat(String procstat){
		this.procstat = procstat;
	}

	public void setProccnt(String proccnt){
		this.proccnt = proccnt;
	}

	public void setBasidt(String basidt){
		this.basidt = basidt;
	}

	public void setSvctype(String svctype){
		this.svctype = svctype;
	}

	public void setAplcclsf(String aplcclsf){
		this.aplcclsf = aplcclsf;
	}

	public void setInsttcd(String insttcd){
		this.insttcd = insttcd;
	}

	public void setAplcdt(String aplcdt){
		this.aplcdt = aplcdt;
	}

	public void setShftaplcclsf(String shftaplcclsf){
		this.shftaplcclsf = shftaplcclsf;
	}

	public void setPymtno1(String pymtno1){
		this.pymtno1 = pymtno1;
	}

	public void setPymtno2(String pymtno2){
		this.pymtno2 = pymtno2;
	}

	public void setPymthopedt(String pymthopedt){
		this.pymthopedt = pymthopedt;
	}

	public void setFeekind(String feekind){
		this.feekind = feekind;
	}

	public void setRecpinstt(String recpinstt){
		this.recpinstt = recpinstt;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setVdtydt(String vdtydt){
		this.vdtydt = vdtydt;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setNm(String nm){
		this.nm = nm;
	}

	public void setTel_no(String tel_no){
		this.tel_no = tel_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdrtel(String rdrtel){
		this.rdrtel = rdrtel;
	}

	public void setRdrprn(String rdrprn){
		this.rdrprn = rdrprn;
	}

	public void setZipseq(String zipseq){
		this.zipseq = zipseq;
	}

	public void setZip1(String zip1){
		this.zip1 = zip1;
	}

	public void setZip2(String zip2){
		this.zip2 = zip2;
	}

	public void setZip3(String zip3){
		this.zip3 = zip3;
	}

	public void setDlvplacno(String dlvplacno){
		this.dlvplacno = dlvplacno;
	}

	public void setBrchptel(String brchptel){
		this.brchptel = brchptel;
	}

	public void setReqbrchcd(String reqbrchcd){
		this.reqbrchcd = reqbrchcd;
	}

	public void setFststrtdt(String fststrtdt){
		this.fststrtdt = fststrtdt;
	}

	public void setReqplacclsf(String reqplacclsf){
		this.reqplacclsf = reqplacclsf;
	}

	public void setElecreqno(String elecreqno){
		this.elecreqno = elecreqno;
	}

	public void setOcomcd(String ocomcd){
		this.ocomcd = ocomcd;
	}

	public void setOcomresn(String ocomresn){
		this.ocomresn = ocomresn;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public String getUid(){
		return this.uid;
	}

	public String getFilenm(){
		return this.filenm;
	}

	public String getProcdt(){
		return this.procdt;
	}

	public String getProcstat(){
		return this.procstat;
	}

	public String getProccnt(){
		return this.proccnt;
	}

	public String getBasidt(){
		return this.basidt;
	}

	public String getSvctype(){
		return this.svctype;
	}

	public String getAplcclsf(){
		return this.aplcclsf;
	}

	public String getInsttcd(){
		return this.insttcd;
	}

	public String getAplcdt(){
		return this.aplcdt;
	}

	public String getShftaplcclsf(){
		return this.shftaplcclsf;
	}

	public String getPymtno1(){
		return this.pymtno1;
	}

	public String getPymtno2(){
		return this.pymtno2;
	}

	public String getPymthopedt(){
		return this.pymthopedt;
	}

	public String getFeekind(){
		return this.feekind;
	}

	public String getRecpinstt(){
		return this.recpinstt;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getVdtydt(){
		return this.vdtydt;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getNm(){
		return this.nm;
	}

	public String getTel_no(){
		return this.tel_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdrtel(){
		return this.rdrtel;
	}

	public String getRdrprn(){
		return this.rdrprn;
	}

	public String getZipseq(){
		return this.zipseq;
	}

	public String getZip1(){
		return this.zip1;
	}

	public String getZip2(){
		return this.zip2;
	}

	public String getZip3(){
		return this.zip3;
	}

	public String getDlvplacno(){
		return this.dlvplacno;
	}

	public String getBrchptel(){
		return this.brchptel;
	}

	public String getReqbrchcd(){
		return this.reqbrchcd;
	}

	public String getFststrtdt(){
		return this.fststrtdt;
	}

	public String getReqplacclsf(){
		return this.reqplacclsf;
	}

	public String getElecreqno(){
		return this.elecreqno;
	}

	public String getOcomcd(){
		return this.ocomcd;
	}

	public String getOcomresn(){
		return this.ocomresn;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_SHFTAPLC_UPLOAD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_SHFTAPLC_UPLOADDM dm = (SS_L_SHFTAPLC_UPLOADDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.uid);
		cstmt.setString(4, dm.filenm);
		cstmt.setString(5, dm.procdt);
		cstmt.setString(6, dm.procstat);
		cstmt.setString(7, dm.proccnt);
		cstmt.setString(8, dm.basidt);
		cstmt.setString(9, dm.svctype);
		cstmt.setString(10, dm.aplcclsf);
		cstmt.setString(11, dm.insttcd);
		cstmt.setString(12, dm.aplcdt);
		cstmt.setString(13, dm.shftaplcclsf);
		cstmt.setString(14, dm.pymtno1);
		cstmt.setString(15, dm.pymtno2);
		cstmt.setString(16, dm.pymthopedt);
		cstmt.setString(17, dm.feekind);
		cstmt.setString(18, dm.recpinstt);
		cstmt.setString(19, dm.acctno);
		cstmt.setString(20, dm.vdtydt);
		cstmt.setString(21, dm.prn);
		cstmt.setString(22, dm.nm);
		cstmt.setString(23, dm.tel_no);
		cstmt.setString(24, dm.rdrnm);
		cstmt.setString(25, dm.rdrtel);
		cstmt.setString(26, dm.rdrprn);
		cstmt.setString(27, dm.zipseq);
		cstmt.setString(28, dm.zip1);
		cstmt.setString(29, dm.zip2);
		cstmt.setString(30, dm.zip3);
		cstmt.setString(31, dm.dlvplacno);
		cstmt.setString(32, dm.brchptel);
		cstmt.setString(33, dm.reqbrchcd);
		cstmt.setString(34, dm.fststrtdt);
		cstmt.setString(35, dm.reqplacclsf);
		cstmt.setString(36, dm.elecreqno);
		cstmt.setString(37, dm.ocomcd);
		cstmt.setString(38, dm.ocomresn);
		cstmt.setString(39, dm.remk);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brsup.ds.SS_L_SHFTAPLC_UPLOADDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String uid = req.getParameter("uid");
if( uid == null){
	System.out.println(this.toString+" : uid is null" );
}else{
	System.out.println(this.toString+" : uid is "+uid );
}
String filenm = req.getParameter("filenm");
if( filenm == null){
	System.out.println(this.toString+" : filenm is null" );
}else{
	System.out.println(this.toString+" : filenm is "+filenm );
}
String procdt = req.getParameter("procdt");
if( procdt == null){
	System.out.println(this.toString+" : procdt is null" );
}else{
	System.out.println(this.toString+" : procdt is "+procdt );
}
String procstat = req.getParameter("procstat");
if( procstat == null){
	System.out.println(this.toString+" : procstat is null" );
}else{
	System.out.println(this.toString+" : procstat is "+procstat );
}
String proccnt = req.getParameter("proccnt");
if( proccnt == null){
	System.out.println(this.toString+" : proccnt is null" );
}else{
	System.out.println(this.toString+" : proccnt is "+proccnt );
}
String basidt = req.getParameter("basidt");
if( basidt == null){
	System.out.println(this.toString+" : basidt is null" );
}else{
	System.out.println(this.toString+" : basidt is "+basidt );
}
String svctype = req.getParameter("svctype");
if( svctype == null){
	System.out.println(this.toString+" : svctype is null" );
}else{
	System.out.println(this.toString+" : svctype is "+svctype );
}
String aplcclsf = req.getParameter("aplcclsf");
if( aplcclsf == null){
	System.out.println(this.toString+" : aplcclsf is null" );
}else{
	System.out.println(this.toString+" : aplcclsf is "+aplcclsf );
}
String insttcd = req.getParameter("insttcd");
if( insttcd == null){
	System.out.println(this.toString+" : insttcd is null" );
}else{
	System.out.println(this.toString+" : insttcd is "+insttcd );
}
String aplcdt = req.getParameter("aplcdt");
if( aplcdt == null){
	System.out.println(this.toString+" : aplcdt is null" );
}else{
	System.out.println(this.toString+" : aplcdt is "+aplcdt );
}
String shftaplcclsf = req.getParameter("shftaplcclsf");
if( shftaplcclsf == null){
	System.out.println(this.toString+" : shftaplcclsf is null" );
}else{
	System.out.println(this.toString+" : shftaplcclsf is "+shftaplcclsf );
}
String pymtno1 = req.getParameter("pymtno1");
if( pymtno1 == null){
	System.out.println(this.toString+" : pymtno1 is null" );
}else{
	System.out.println(this.toString+" : pymtno1 is "+pymtno1 );
}
String pymtno2 = req.getParameter("pymtno2");
if( pymtno2 == null){
	System.out.println(this.toString+" : pymtno2 is null" );
}else{
	System.out.println(this.toString+" : pymtno2 is "+pymtno2 );
}
String pymthopedt = req.getParameter("pymthopedt");
if( pymthopedt == null){
	System.out.println(this.toString+" : pymthopedt is null" );
}else{
	System.out.println(this.toString+" : pymthopedt is "+pymthopedt );
}
String feekind = req.getParameter("feekind");
if( feekind == null){
	System.out.println(this.toString+" : feekind is null" );
}else{
	System.out.println(this.toString+" : feekind is "+feekind );
}
String recpinstt = req.getParameter("recpinstt");
if( recpinstt == null){
	System.out.println(this.toString+" : recpinstt is null" );
}else{
	System.out.println(this.toString+" : recpinstt is "+recpinstt );
}
String acctno = req.getParameter("acctno");
if( acctno == null){
	System.out.println(this.toString+" : acctno is null" );
}else{
	System.out.println(this.toString+" : acctno is "+acctno );
}
String vdtydt = req.getParameter("vdtydt");
if( vdtydt == null){
	System.out.println(this.toString+" : vdtydt is null" );
}else{
	System.out.println(this.toString+" : vdtydt is "+vdtydt );
}
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String nm = req.getParameter("nm");
if( nm == null){
	System.out.println(this.toString+" : nm is null" );
}else{
	System.out.println(this.toString+" : nm is "+nm );
}
String tel_no = req.getParameter("tel_no");
if( tel_no == null){
	System.out.println(this.toString+" : tel_no is null" );
}else{
	System.out.println(this.toString+" : tel_no is "+tel_no );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String rdrtel = req.getParameter("rdrtel");
if( rdrtel == null){
	System.out.println(this.toString+" : rdrtel is null" );
}else{
	System.out.println(this.toString+" : rdrtel is "+rdrtel );
}
String rdrprn = req.getParameter("rdrprn");
if( rdrprn == null){
	System.out.println(this.toString+" : rdrprn is null" );
}else{
	System.out.println(this.toString+" : rdrprn is "+rdrprn );
}
String zipseq = req.getParameter("zipseq");
if( zipseq == null){
	System.out.println(this.toString+" : zipseq is null" );
}else{
	System.out.println(this.toString+" : zipseq is "+zipseq );
}
String zip1 = req.getParameter("zip1");
if( zip1 == null){
	System.out.println(this.toString+" : zip1 is null" );
}else{
	System.out.println(this.toString+" : zip1 is "+zip1 );
}
String zip2 = req.getParameter("zip2");
if( zip2 == null){
	System.out.println(this.toString+" : zip2 is null" );
}else{
	System.out.println(this.toString+" : zip2 is "+zip2 );
}
String zip3 = req.getParameter("zip3");
if( zip3 == null){
	System.out.println(this.toString+" : zip3 is null" );
}else{
	System.out.println(this.toString+" : zip3 is "+zip3 );
}
String dlvplacno = req.getParameter("dlvplacno");
if( dlvplacno == null){
	System.out.println(this.toString+" : dlvplacno is null" );
}else{
	System.out.println(this.toString+" : dlvplacno is "+dlvplacno );
}
String brchptel = req.getParameter("brchptel");
if( brchptel == null){
	System.out.println(this.toString+" : brchptel is null" );
}else{
	System.out.println(this.toString+" : brchptel is "+brchptel );
}
String reqbrchcd = req.getParameter("reqbrchcd");
if( reqbrchcd == null){
	System.out.println(this.toString+" : reqbrchcd is null" );
}else{
	System.out.println(this.toString+" : reqbrchcd is "+reqbrchcd );
}
String fststrtdt = req.getParameter("fststrtdt");
if( fststrtdt == null){
	System.out.println(this.toString+" : fststrtdt is null" );
}else{
	System.out.println(this.toString+" : fststrtdt is "+fststrtdt );
}
String reqplacclsf = req.getParameter("reqplacclsf");
if( reqplacclsf == null){
	System.out.println(this.toString+" : reqplacclsf is null" );
}else{
	System.out.println(this.toString+" : reqplacclsf is "+reqplacclsf );
}
String elecreqno = req.getParameter("elecreqno");
if( elecreqno == null){
	System.out.println(this.toString+" : elecreqno is null" );
}else{
	System.out.println(this.toString+" : elecreqno is "+elecreqno );
}
String ocomcd = req.getParameter("ocomcd");
if( ocomcd == null){
	System.out.println(this.toString+" : ocomcd is null" );
}else{
	System.out.println(this.toString+" : ocomcd is "+ocomcd );
}
String ocomresn = req.getParameter("ocomresn");
if( ocomresn == null){
	System.out.println(this.toString+" : ocomresn is null" );
}else{
	System.out.println(this.toString+" : ocomresn is "+ocomresn );
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

String uid = Util.checkString(req.getParameter("uid"));
String filenm = Util.checkString(req.getParameter("filenm"));
String procdt = Util.checkString(req.getParameter("procdt"));
String procstat = Util.checkString(req.getParameter("procstat"));
String proccnt = Util.checkString(req.getParameter("proccnt"));
String basidt = Util.checkString(req.getParameter("basidt"));
String svctype = Util.checkString(req.getParameter("svctype"));
String aplcclsf = Util.checkString(req.getParameter("aplcclsf"));
String insttcd = Util.checkString(req.getParameter("insttcd"));
String aplcdt = Util.checkString(req.getParameter("aplcdt"));
String shftaplcclsf = Util.checkString(req.getParameter("shftaplcclsf"));
String pymtno1 = Util.checkString(req.getParameter("pymtno1"));
String pymtno2 = Util.checkString(req.getParameter("pymtno2"));
String pymthopedt = Util.checkString(req.getParameter("pymthopedt"));
String feekind = Util.checkString(req.getParameter("feekind"));
String recpinstt = Util.checkString(req.getParameter("recpinstt"));
String acctno = Util.checkString(req.getParameter("acctno"));
String vdtydt = Util.checkString(req.getParameter("vdtydt"));
String prn = Util.checkString(req.getParameter("prn"));
String nm = Util.checkString(req.getParameter("nm"));
String tel_no = Util.checkString(req.getParameter("tel_no"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdrtel = Util.checkString(req.getParameter("rdrtel"));
String rdrprn = Util.checkString(req.getParameter("rdrprn"));
String zipseq = Util.checkString(req.getParameter("zipseq"));
String zip1 = Util.checkString(req.getParameter("zip1"));
String zip2 = Util.checkString(req.getParameter("zip2"));
String zip3 = Util.checkString(req.getParameter("zip3"));
String dlvplacno = Util.checkString(req.getParameter("dlvplacno"));
String brchptel = Util.checkString(req.getParameter("brchptel"));
String reqbrchcd = Util.checkString(req.getParameter("reqbrchcd"));
String fststrtdt = Util.checkString(req.getParameter("fststrtdt"));
String reqplacclsf = Util.checkString(req.getParameter("reqplacclsf"));
String elecreqno = Util.checkString(req.getParameter("elecreqno"));
String ocomcd = Util.checkString(req.getParameter("ocomcd"));
String ocomresn = Util.checkString(req.getParameter("ocomresn"));
String remk = Util.checkString(req.getParameter("remk"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String uid = Util.Uni2Ksc(Util.checkString(req.getParameter("uid")));
String filenm = Util.Uni2Ksc(Util.checkString(req.getParameter("filenm")));
String procdt = Util.Uni2Ksc(Util.checkString(req.getParameter("procdt")));
String procstat = Util.Uni2Ksc(Util.checkString(req.getParameter("procstat")));
String proccnt = Util.Uni2Ksc(Util.checkString(req.getParameter("proccnt")));
String basidt = Util.Uni2Ksc(Util.checkString(req.getParameter("basidt")));
String svctype = Util.Uni2Ksc(Util.checkString(req.getParameter("svctype")));
String aplcclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcclsf")));
String insttcd = Util.Uni2Ksc(Util.checkString(req.getParameter("insttcd")));
String aplcdt = Util.Uni2Ksc(Util.checkString(req.getParameter("aplcdt")));
String shftaplcclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("shftaplcclsf")));
String pymtno1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtno1")));
String pymtno2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pymtno2")));
String pymthopedt = Util.Uni2Ksc(Util.checkString(req.getParameter("pymthopedt")));
String feekind = Util.Uni2Ksc(Util.checkString(req.getParameter("feekind")));
String recpinstt = Util.Uni2Ksc(Util.checkString(req.getParameter("recpinstt")));
String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
String vdtydt = Util.Uni2Ksc(Util.checkString(req.getParameter("vdtydt")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String nm = Util.Uni2Ksc(Util.checkString(req.getParameter("nm")));
String tel_no = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdrtel = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel")));
String rdrprn = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrprn")));
String zipseq = Util.Uni2Ksc(Util.checkString(req.getParameter("zipseq")));
String zip1 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip1")));
String zip2 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip2")));
String zip3 = Util.Uni2Ksc(Util.checkString(req.getParameter("zip3")));
String dlvplacno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvplacno")));
String brchptel = Util.Uni2Ksc(Util.checkString(req.getParameter("brchptel")));
String reqbrchcd = Util.Uni2Ksc(Util.checkString(req.getParameter("reqbrchcd")));
String fststrtdt = Util.Uni2Ksc(Util.checkString(req.getParameter("fststrtdt")));
String reqplacclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("reqplacclsf")));
String elecreqno = Util.Uni2Ksc(Util.checkString(req.getParameter("elecreqno")));
String ocomcd = Util.Uni2Ksc(Util.checkString(req.getParameter("ocomcd")));
String ocomresn = Util.Uni2Ksc(Util.checkString(req.getParameter("ocomresn")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setUid(uid);
dm.setFilenm(filenm);
dm.setProcdt(procdt);
dm.setProcstat(procstat);
dm.setProccnt(proccnt);
dm.setBasidt(basidt);
dm.setSvctype(svctype);
dm.setAplcclsf(aplcclsf);
dm.setInsttcd(insttcd);
dm.setAplcdt(aplcdt);
dm.setShftaplcclsf(shftaplcclsf);
dm.setPymtno1(pymtno1);
dm.setPymtno2(pymtno2);
dm.setPymthopedt(pymthopedt);
dm.setFeekind(feekind);
dm.setRecpinstt(recpinstt);
dm.setAcctno(acctno);
dm.setVdtydt(vdtydt);
dm.setPrn(prn);
dm.setNm(nm);
dm.setTel_no(tel_no);
dm.setRdrnm(rdrnm);
dm.setRdrtel(rdrtel);
dm.setRdrprn(rdrprn);
dm.setZipseq(zipseq);
dm.setZip1(zip1);
dm.setZip2(zip2);
dm.setZip3(zip3);
dm.setDlvplacno(dlvplacno);
dm.setBrchptel(brchptel);
dm.setReqbrchcd(reqbrchcd);
dm.setFststrtdt(fststrtdt);
dm.setReqplacclsf(reqplacclsf);
dm.setElecreqno(elecreqno);
dm.setOcomcd(ocomcd);
dm.setOcomresn(ocomresn);
dm.setRemk(remk);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 15:39:05 PDT 2009 */