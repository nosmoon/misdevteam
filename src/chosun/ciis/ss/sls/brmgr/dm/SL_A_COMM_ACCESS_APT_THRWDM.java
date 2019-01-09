/***************************************************************************************************
 * 파일명   : SP_SL_A_COMM_ACCESS_APT_THRW.java
 * 기능     : 투입율조사
 * 작성일자 : 2006/03/08
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  투입율조사-현황등록
**/

public class SL_A_COMM_ACCESS_APT_THRWDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String hmflag;
	public String bocd;
	public String zip;
	public String addr;
	public String addrcd;
	public String dongno;
	public long pyong1;
	public long hoscnt1;
	public long pyong2;
	public long hoscnt2;
	public long pyong3;
	public long hoscnt3;
	public String invsgdt;
	public String invsgno;
	public String invsghhmm;
	public String invsgpers;
	public String housval;
	public String incmgpers;
	public String medicd;
	public String qty;
	public String qtyratio;
	public String bgndlvtm;
	public String enddlvtm;
	public String dlvstatcd;
	public String leaffeednosh;

	public SL_A_COMM_ACCESS_APT_THRWDM(){}
	public SL_A_COMM_ACCESS_APT_THRWDM(String accflag, String hmflag, String bocd, String zip, String addr, String addrcd, String dongno, long pyong1, long hoscnt1, long pyong2, long hoscnt2, long pyong3, long hoscnt3, String invsgdt, String invsgno, String invsghhmm, String invsgpers, String housval, String incmgpers, String medicd, String qty, String qtyratio, String bgndlvtm, String enddlvtm, String dlvstatcd, String leaffeednosh){
		this.accflag = accflag;
		this.hmflag = hmflag;
		this.bocd = bocd;
		this.zip = zip;
		this.addr = addr;
		this.addrcd = addrcd;
		this.dongno = dongno;
		this.pyong1 = pyong1;
		this.hoscnt1 = hoscnt1;
		this.pyong2 = pyong2;
		this.hoscnt2 = hoscnt2;
		this.pyong3 = pyong3;
		this.hoscnt3 = hoscnt3;
		this.invsgdt = invsgdt;
		this.invsgno = invsgno;
		this.invsghhmm = invsghhmm;
		this.invsgpers = invsgpers;
		this.housval = housval;
		this.incmgpers = incmgpers;
		this.medicd = medicd;
		this.qty = qty;
		this.qtyratio = qtyratio;
		this.bgndlvtm = bgndlvtm;
		this.enddlvtm = enddlvtm;
		this.dlvstatcd = dlvstatcd;
		this.leaffeednosh = leaffeednosh;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setHmflag(String hmflag){
		this.hmflag = hmflag;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public void setPyong1(long pyong1){
		this.pyong1 = pyong1;
	}

	public void setHoscnt1(long hoscnt1){
		this.hoscnt1 = hoscnt1;
	}

	public void setPyong2(long pyong2){
		this.pyong2 = pyong2;
	}

	public void setHoscnt2(long hoscnt2){
		this.hoscnt2 = hoscnt2;
	}

	public void setPyong3(long pyong3){
		this.pyong3 = pyong3;
	}

	public void setHoscnt3(long hoscnt3){
		this.hoscnt3 = hoscnt3;
	}

	public void setInvsgdt(String invsgdt){
		this.invsgdt = invsgdt;
	}

	public void setInvsgno(String invsgno){
		this.invsgno = invsgno;
	}

	public void setInvsghhmm(String invsghhmm){
		this.invsghhmm = invsghhmm;
	}

	public void setInvsgpers(String invsgpers){
		this.invsgpers = invsgpers;
	}

	public void setHousval(String housval){
		this.housval = housval;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setQtyratio(String qtyratio){
		this.qtyratio = qtyratio;
	}

	public void setBgndlvtm(String bgndlvtm){
		this.bgndlvtm = bgndlvtm;
	}

	public void setEnddlvtm(String enddlvtm){
		this.enddlvtm = enddlvtm;
	}

	public void setDlvstatcd(String dlvstatcd){
		this.dlvstatcd = dlvstatcd;
	}

	public void setLeaffeednosh(String leaffeednosh){
		this.leaffeednosh = leaffeednosh;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getHmflag(){
		return this.hmflag;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getDongno(){
		return this.dongno;
	}

	public long getPyong1(){
		return this.pyong1;
	}

	public long getHoscnt1(){
		return this.hoscnt1;
	}

	public long getPyong2(){
		return this.pyong2;
	}

	public long getHoscnt2(){
		return this.hoscnt2;
	}

	public long getPyong3(){
		return this.pyong3;
	}

	public long getHoscnt3(){
		return this.hoscnt3;
	}

	public String getInvsgdt(){
		return this.invsgdt;
	}

	public String getInvsgno(){
		return this.invsgno;
	}

	public String getInvsghhmm(){
		return this.invsghhmm;
	}

	public String getInvsgpers(){
		return this.invsgpers;
	}

	public String getHousval(){
		return this.housval;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getQty(){
		return this.qty;
	}

	public String getQtyratio(){
		return this.qtyratio;
	}

	public String getBgndlvtm(){
		return this.bgndlvtm;
	}

	public String getEnddlvtm(){
		return this.enddlvtm;
	}

	public String getDlvstatcd(){
		return this.dlvstatcd;
	}

	public String getLeaffeednosh(){
		return this.leaffeednosh;
	}

	public String getSQL(){
		 return "{ call SP_SL_A_COMM_ACCESS_APT_THRW( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_A_COMM_ACCESS_APT_THRWDM dm = (SL_A_COMM_ACCESS_APT_THRWDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.hmflag);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.zip);
		cstmt.setString(7, dm.addr);
		cstmt.setString(8, dm.addrcd);
		cstmt.setString(9, dm.dongno);
		cstmt.setLong(10, dm.pyong1);
		cstmt.setLong(11, dm.hoscnt1);
		cstmt.setLong(12, dm.pyong2);
		cstmt.setLong(13, dm.hoscnt2);
		cstmt.setLong(14, dm.pyong3);
		cstmt.setLong(15, dm.hoscnt3);
		cstmt.setString(16, dm.invsgdt);
		cstmt.setString(17, dm.invsgno);
		cstmt.setString(18, dm.invsghhmm);
		cstmt.setString(19, dm.invsgpers);
		cstmt.setString(20, dm.housval);
		cstmt.setString(21, dm.incmgpers);
		cstmt.setString(22, dm.medicd);
		cstmt.setString(23, dm.qty);
		cstmt.setString(24, dm.qtyratio);
		cstmt.setString(25, dm.bgndlvtm);
		cstmt.setString(26, dm.enddlvtm);
		cstmt.setString(27, dm.dlvstatcd);
		cstmt.setString(28, dm.leaffeednosh);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, OracleTypes.CURSOR);
		cstmt.registerOutParameter(31, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SL_A_COMM_ACCESS_APT_THRWDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String hmflag = req.getParameter("hmflag");
if( hmflag == null){
	System.out.println(this.toString+" : hmflag is null" );
}else{
	System.out.println(this.toString+" : hmflag is "+hmflag );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String zip = req.getParameter("zip");
if( zip == null){
	System.out.println(this.toString+" : zip is null" );
}else{
	System.out.println(this.toString+" : zip is "+zip );
}
String addr = req.getParameter("addr");
if( addr == null){
	System.out.println(this.toString+" : addr is null" );
}else{
	System.out.println(this.toString+" : addr is "+addr );
}
String addrcd = req.getParameter("addrcd");
if( addrcd == null){
	System.out.println(this.toString+" : addrcd is null" );
}else{
	System.out.println(this.toString+" : addrcd is "+addrcd );
}
String dongno = req.getParameter("dongno");
if( dongno == null){
	System.out.println(this.toString+" : dongno is null" );
}else{
	System.out.println(this.toString+" : dongno is "+dongno );
}
String pyong1 = req.getParameter("pyong1");
if( pyong1 == null){
	System.out.println(this.toString+" : pyong1 is null" );
}else{
	System.out.println(this.toString+" : pyong1 is "+pyong1 );
}
String hoscnt1 = req.getParameter("hoscnt1");
if( hoscnt1 == null){
	System.out.println(this.toString+" : hoscnt1 is null" );
}else{
	System.out.println(this.toString+" : hoscnt1 is "+hoscnt1 );
}
String pyong2 = req.getParameter("pyong2");
if( pyong2 == null){
	System.out.println(this.toString+" : pyong2 is null" );
}else{
	System.out.println(this.toString+" : pyong2 is "+pyong2 );
}
String hoscnt2 = req.getParameter("hoscnt2");
if( hoscnt2 == null){
	System.out.println(this.toString+" : hoscnt2 is null" );
}else{
	System.out.println(this.toString+" : hoscnt2 is "+hoscnt2 );
}
String pyong3 = req.getParameter("pyong3");
if( pyong3 == null){
	System.out.println(this.toString+" : pyong3 is null" );
}else{
	System.out.println(this.toString+" : pyong3 is "+pyong3 );
}
String hoscnt3 = req.getParameter("hoscnt3");
if( hoscnt3 == null){
	System.out.println(this.toString+" : hoscnt3 is null" );
}else{
	System.out.println(this.toString+" : hoscnt3 is "+hoscnt3 );
}
String invsgdt = req.getParameter("invsgdt");
if( invsgdt == null){
	System.out.println(this.toString+" : invsgdt is null" );
}else{
	System.out.println(this.toString+" : invsgdt is "+invsgdt );
}
String invsgno = req.getParameter("invsgno");
if( invsgno == null){
	System.out.println(this.toString+" : invsgno is null" );
}else{
	System.out.println(this.toString+" : invsgno is "+invsgno );
}
String invsghhmm = req.getParameter("invsghhmm");
if( invsghhmm == null){
	System.out.println(this.toString+" : invsghhmm is null" );
}else{
	System.out.println(this.toString+" : invsghhmm is "+invsghhmm );
}
String invsgpers = req.getParameter("invsgpers");
if( invsgpers == null){
	System.out.println(this.toString+" : invsgpers is null" );
}else{
	System.out.println(this.toString+" : invsgpers is "+invsgpers );
}
String housval = req.getParameter("housval");
if( housval == null){
	System.out.println(this.toString+" : housval is null" );
}else{
	System.out.println(this.toString+" : housval is "+housval );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String qtyratio = req.getParameter("qtyratio");
if( qtyratio == null){
	System.out.println(this.toString+" : qtyratio is null" );
}else{
	System.out.println(this.toString+" : qtyratio is "+qtyratio );
}
String bgndlvtm = req.getParameter("bgndlvtm");
if( bgndlvtm == null){
	System.out.println(this.toString+" : bgndlvtm is null" );
}else{
	System.out.println(this.toString+" : bgndlvtm is "+bgndlvtm );
}
String enddlvtm = req.getParameter("enddlvtm");
if( enddlvtm == null){
	System.out.println(this.toString+" : enddlvtm is null" );
}else{
	System.out.println(this.toString+" : enddlvtm is "+enddlvtm );
}
String dlvstatcd = req.getParameter("dlvstatcd");
if( dlvstatcd == null){
	System.out.println(this.toString+" : dlvstatcd is null" );
}else{
	System.out.println(this.toString+" : dlvstatcd is "+dlvstatcd );
}
String leaffeednosh = req.getParameter("leaffeednosh");
if( leaffeednosh == null){
	System.out.println(this.toString+" : leaffeednosh is null" );
}else{
	System.out.println(this.toString+" : leaffeednosh is "+leaffeednosh );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String hmflag = Util.checkString(req.getParameter("hmflag"));
String bocd = Util.checkString(req.getParameter("bocd"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
String dongno = Util.checkString(req.getParameter("dongno"));
String pyong1 = Util.checkString(req.getParameter("pyong1"));
String hoscnt1 = Util.checkString(req.getParameter("hoscnt1"));
String pyong2 = Util.checkString(req.getParameter("pyong2"));
String hoscnt2 = Util.checkString(req.getParameter("hoscnt2"));
String pyong3 = Util.checkString(req.getParameter("pyong3"));
String hoscnt3 = Util.checkString(req.getParameter("hoscnt3"));
String invsgdt = Util.checkString(req.getParameter("invsgdt"));
String invsgno = Util.checkString(req.getParameter("invsgno"));
String invsghhmm = Util.checkString(req.getParameter("invsghhmm"));
String invsgpers = Util.checkString(req.getParameter("invsgpers"));
String housval = Util.checkString(req.getParameter("housval"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String medicd = Util.checkString(req.getParameter("medicd"));
String qty = Util.checkString(req.getParameter("qty"));
String qtyratio = Util.checkString(req.getParameter("qtyratio"));
String bgndlvtm = Util.checkString(req.getParameter("bgndlvtm"));
String enddlvtm = Util.checkString(req.getParameter("enddlvtm"));
String dlvstatcd = Util.checkString(req.getParameter("dlvstatcd"));
String leaffeednosh = Util.checkString(req.getParameter("leaffeednosh"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String hmflag = Util.Uni2Ksc(Util.checkString(req.getParameter("hmflag")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));
String pyong1 = Util.Uni2Ksc(Util.checkString(req.getParameter("pyong1")));
String hoscnt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("hoscnt1")));
String pyong2 = Util.Uni2Ksc(Util.checkString(req.getParameter("pyong2")));
String hoscnt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("hoscnt2")));
String pyong3 = Util.Uni2Ksc(Util.checkString(req.getParameter("pyong3")));
String hoscnt3 = Util.Uni2Ksc(Util.checkString(req.getParameter("hoscnt3")));
String invsgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt")));
String invsgno = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgno")));
String invsghhmm = Util.Uni2Ksc(Util.checkString(req.getParameter("invsghhmm")));
String invsgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgpers")));
String housval = Util.Uni2Ksc(Util.checkString(req.getParameter("housval")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String qtyratio = Util.Uni2Ksc(Util.checkString(req.getParameter("qtyratio")));
String bgndlvtm = Util.Uni2Ksc(Util.checkString(req.getParameter("bgndlvtm")));
String enddlvtm = Util.Uni2Ksc(Util.checkString(req.getParameter("enddlvtm")));
String dlvstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvstatcd")));
String leaffeednosh = Util.Uni2Ksc(Util.checkString(req.getParameter("leaffeednosh")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setHmflag(hmflag);
dm.setBocd(bocd);
dm.setZip(zip);
dm.setAddr(addr);
dm.setAddrcd(addrcd);
dm.setDongno(dongno);
dm.setPyong1(pyong1);
dm.setHoscnt1(hoscnt1);
dm.setPyong2(pyong2);
dm.setHoscnt2(hoscnt2);
dm.setPyong3(pyong3);
dm.setHoscnt3(hoscnt3);
dm.setInvsgdt(invsgdt);
dm.setInvsgno(invsgno);
dm.setInvsghhmm(invsghhmm);
dm.setInvsgpers(invsgpers);
dm.setHousval(housval);
dm.setIncmgpers(incmgpers);
dm.setMedicd(medicd);
dm.setQty(qty);
dm.setQtyratio(qtyratio);
dm.setBgndlvtm(bgndlvtm);
dm.setEnddlvtm(enddlvtm);
dm.setDlvstatcd(dlvstatcd);
dm.setLeaffeednosh(leaffeednosh);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 08 11:24:22 KST 2006 */