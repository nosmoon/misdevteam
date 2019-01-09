/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.ca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
 * 
 */


public class SS_A_CA_HEADDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String stafclsfcd;
	public String stafno;
	public String prn;
	public String ernno;
	public String stafnm;
	public String zip;
	public String addr;
	public String dtlsaddr;
	public String tel_no1;
	public String tel_no2;
	public String tel_no3;
	public String ptph_no1;
	public String ptph_no2;
	public String ptph_no3;
	public String email;
	public String carrmatt;
	public String leaderyn;
	public String acctno;
	public String acctbank;
	public String acctdeps_pers;
	public String id_cardissudt;
	public String blngteamregmm;
	public String blngteamnm;
	public String jursarearegmm;
	public String jursareanm;
	public String remk;
	public String cntrstatcd;
	public String in_cmpydt;
	public String lvcmpydt;
	public String empseq;

	public SS_A_CA_HEADDM(){}
	public SS_A_CA_HEADDM(String incmgpers, String accflag, String stafclsfcd, String stafno, String prn, String ernno, String stafnm, String zip, String addr, String dtlsaddr, String tel_no1, String tel_no2, String tel_no3, String ptph_no1, String ptph_no2, String ptph_no3, String email, String carrmatt, String leaderyn, String acctno, String acctbank, String acctdeps_pers, String id_cardissudt, String blngteamregmm, String blngteamnm, String jursarearegmm, String jursareanm, String remk, String cntrstatcd, String in_cmpydt, String lvcmpydt, String empseq){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.stafclsfcd = stafclsfcd;
		this.stafno = stafno;
		this.prn = prn;
		this.ernno = ernno;
		this.stafnm = stafnm;
		this.zip = zip;
		this.addr = addr;
		this.dtlsaddr = dtlsaddr;
		this.tel_no1 = tel_no1;
		this.tel_no2 = tel_no2;
		this.tel_no3 = tel_no3;
		this.ptph_no1 = ptph_no1;
		this.ptph_no2 = ptph_no2;
		this.ptph_no3 = ptph_no3;
		this.email = email;
		this.carrmatt = carrmatt;
		this.leaderyn = leaderyn;
		this.acctno = acctno;
		this.acctbank = acctbank;
		this.acctdeps_pers = acctdeps_pers;
		this.id_cardissudt = id_cardissudt;
		this.blngteamregmm = blngteamregmm;
		this.blngteamnm = blngteamnm;
		this.jursarearegmm = jursarearegmm;
		this.jursareanm = jursareanm;
		this.remk = remk;
		this.cntrstatcd = cntrstatcd;
		this.in_cmpydt = in_cmpydt;
		this.lvcmpydt = lvcmpydt;
		this.empseq = empseq;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setStafclsfcd(String stafclsfcd){
		this.stafclsfcd = stafclsfcd;
	}

	public void setStafno(String stafno){
		this.stafno = stafno;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setErnno(String ernno){
		this.ernno = ernno;
	}

	public void setStafnm(String stafnm){
		this.stafnm = stafnm;
	}

	public void setZip(String zip){
		this.zip = zip;
	}

	public void setAddr(String addr){
		this.addr = addr;
	}

	public void setDtlsaddr(String dtlsaddr){
		this.dtlsaddr = dtlsaddr;
	}

	public void setTel_no1(String tel_no1){
		this.tel_no1 = tel_no1;
	}

	public void setTel_no2(String tel_no2){
		this.tel_no2 = tel_no2;
	}

	public void setTel_no3(String tel_no3){
		this.tel_no3 = tel_no3;
	}

	public void setPtph_no1(String ptph_no1){
		this.ptph_no1 = ptph_no1;
	}

	public void setPtph_no2(String ptph_no2){
		this.ptph_no2 = ptph_no2;
	}

	public void setPtph_no3(String ptph_no3){
		this.ptph_no3 = ptph_no3;
	}

	public void setEmail(String email){
		this.email = email;
	}

	public void setCarrmatt(String carrmatt){
		this.carrmatt = carrmatt;
	}

	public void setLeaderyn(String leaderyn){
		this.leaderyn = leaderyn;
	}

	public void setAcctno(String acctno){
		this.acctno = acctno;
	}

	public void setAcctbank(String acctbank){
		this.acctbank = acctbank;
	}

	public void setAcctdeps_pers(String acctdeps_pers){
		this.acctdeps_pers = acctdeps_pers;
	}

	public void setId_cardissudt(String id_cardissudt){
		this.id_cardissudt = id_cardissudt;
	}

	public void setBlngteamregmm(String blngteamregmm){
		this.blngteamregmm = blngteamregmm;
	}

	public void setBlngteamnm(String blngteamnm){
		this.blngteamnm = blngteamnm;
	}

	public void setJursarearegmm(String jursarearegmm){
		this.jursarearegmm = jursarearegmm;
	}

	public void setJursareanm(String jursareanm){
		this.jursareanm = jursareanm;
	}

	public void setRemk(String remk){
		this.remk = remk;
	}

	public void setCntrstatcd(String cntrstatcd){
		this.cntrstatcd = cntrstatcd;
	}

	public void setIn_cmpydt(String in_cmpydt){
		this.in_cmpydt = in_cmpydt;
	}

	public void setLvcmpydt(String lvcmpydt){
		this.lvcmpydt = lvcmpydt;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getStafclsfcd(){
		return this.stafclsfcd;
	}

	public String getStafno(){
		return this.stafno;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getErnno(){
		return this.ernno;
	}

	public String getStafnm(){
		return this.stafnm;
	}

	public String getZip(){
		return this.zip;
	}

	public String getAddr(){
		return this.addr;
	}

	public String getDtlsaddr(){
		return this.dtlsaddr;
	}

	public String getTel_no1(){
		return this.tel_no1;
	}

	public String getTel_no2(){
		return this.tel_no2;
	}

	public String getTel_no3(){
		return this.tel_no3;
	}

	public String getPtph_no1(){
		return this.ptph_no1;
	}

	public String getPtph_no2(){
		return this.ptph_no2;
	}

	public String getPtph_no3(){
		return this.ptph_no3;
	}

	public String getEmail(){
		return this.email;
	}

	public String getCarrmatt(){
		return this.carrmatt;
	}

	public String getLeaderyn(){
		return this.leaderyn;
	}

	public String getAcctno(){
		return this.acctno;
	}

	public String getAcctbank(){
		return this.acctbank;
	}

	public String getAcctdeps_pers(){
		return this.acctdeps_pers;
	}

	public String getId_cardissudt(){
		return this.id_cardissudt;
	}

	public String getBlngteamregmm(){
		return this.blngteamregmm;
	}

	public String getBlngteamnm(){
		return this.blngteamnm;
	}

	public String getJursarearegmm(){
		return this.jursarearegmm;
	}

	public String getJursareanm(){
		return this.jursareanm;
	}

	public String getRemk(){
		return this.remk;
	}

	public String getCntrstatcd(){
		return this.cntrstatcd;
	}

	public String getIn_cmpydt(){
		return this.in_cmpydt;
	}

	public String getLvcmpydt(){
		return this.lvcmpydt;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_A_CA_HEAD(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_CA_HEADDM dm = (SS_A_CA_HEADDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.stafclsfcd);
		cstmt.setString(6, dm.stafno);
		cstmt.setString(7, dm.prn);
		cstmt.setString(8, dm.ernno);
		cstmt.setString(9, dm.stafnm);
		cstmt.setString(10, dm.zip);
		cstmt.setString(11, dm.addr);
		cstmt.setString(12, dm.dtlsaddr);
		cstmt.setString(13, dm.tel_no1);
		cstmt.setString(14, dm.tel_no2);
		cstmt.setString(15, dm.tel_no3);
		cstmt.setString(16, dm.ptph_no1);
		cstmt.setString(17, dm.ptph_no2);
		cstmt.setString(18, dm.ptph_no3);
		cstmt.setString(19, dm.email);
		cstmt.setString(20, dm.carrmatt);
		cstmt.setString(21, dm.leaderyn);
		cstmt.setString(22, dm.acctno);
		cstmt.setString(23, dm.acctbank);
		cstmt.setString(24, dm.acctdeps_pers);
		cstmt.setString(25, dm.id_cardissudt);
		cstmt.setString(26, dm.blngteamregmm);
		cstmt.setString(27, dm.blngteamnm);
		cstmt.setString(28, dm.jursarearegmm);
		cstmt.setString(29, dm.jursareanm);
		cstmt.setString(30, dm.remk);
		cstmt.setString(31, dm.cntrstatcd);
		cstmt.setString(32, dm.in_cmpydt);
		cstmt.setString(33, dm.lvcmpydt);
		cstmt.setString(34, dm.empseq);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.ca.ds.SS_A_CA_HEADDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("incmgpers = [" + getIncmgpers() + "]");
		System.out.println("accflag = [" + getAccflag() + "]");
		System.out.println("stafclsfcd = [" + getStafclsfcd() + "]");
		System.out.println("stafno = [" + getStafno() + "]");
		System.out.println("prn = [" + getPrn() + "]");
		System.out.println("ernno = [" + getErnno() + "]");
		System.out.println("stafnm = [" + getStafnm() + "]");
		System.out.println("zip = [" + getZip() + "]");
		System.out.println("addr = [" + getAddr() + "]");
		System.out.println("dtlsaddr = [" + getDtlsaddr() + "]");
		System.out.println("tel_no1 = [" + getTel_no1() + "]");
		System.out.println("tel_no2 = [" + getTel_no2() + "]");
		System.out.println("tel_no3 = [" + getTel_no3() + "]");
		System.out.println("ptph_no1 = [" + getPtph_no1() + "]");
		System.out.println("ptph_no2 = [" + getPtph_no2() + "]");
		System.out.println("ptph_no3 = [" + getPtph_no3() + "]");
		System.out.println("email = [" + getEmail() + "]");
		System.out.println("carrmatt = [" + getCarrmatt() + "]");
		System.out.println("leaderyn = [" + getLeaderyn() + "]");
		System.out.println("acctno = [" + getAcctno() + "]");
		System.out.println("acctbank = [" + getAcctbank() + "]");
		System.out.println("acctdeps_pers = [" + getAcctdeps_pers() + "]");
		System.out.println("id_cardissudt = [" + getId_cardissudt() + "]");
		System.out.println("blngteamregmm = [" + getBlngteamregmm() + "]");
		System.out.println("blngteamnm = [" + getBlngteamnm() + "]");
		System.out.println("jursarearegmm = [" + getJursarearegmm() + "]");
		System.out.println("jursareanm = [" + getJursareanm() + "]");
		System.out.println("remk = [" + getRemk() + "]");
		System.out.println("cntrstatcd = [" + getCntrstatcd() + "]");
		System.out.println("in_cmpydt = [" + getIn_cmpydt() + "]");
		System.out.println("lvcmpydt = [" + getLvcmpydt() + "]");
		System.out.println("empseq = [" + getEmpseq() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String stafnm = req.getParameter("stafnm");
if( stafnm == null){
	System.out.println(this.toString+" : stafnm is null" );
}else{
	System.out.println(this.toString+" : stafnm is "+stafnm );
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
String dtlsaddr = req.getParameter("dtlsaddr");
if( dtlsaddr == null){
	System.out.println(this.toString+" : dtlsaddr is null" );
}else{
	System.out.println(this.toString+" : dtlsaddr is "+dtlsaddr );
}
String tel_no1 = req.getParameter("tel_no1");
if( tel_no1 == null){
	System.out.println(this.toString+" : tel_no1 is null" );
}else{
	System.out.println(this.toString+" : tel_no1 is "+tel_no1 );
}
String tel_no2 = req.getParameter("tel_no2");
if( tel_no2 == null){
	System.out.println(this.toString+" : tel_no2 is null" );
}else{
	System.out.println(this.toString+" : tel_no2 is "+tel_no2 );
}
String tel_no3 = req.getParameter("tel_no3");
if( tel_no3 == null){
	System.out.println(this.toString+" : tel_no3 is null" );
}else{
	System.out.println(this.toString+" : tel_no3 is "+tel_no3 );
}
String ptph_no1 = req.getParameter("ptph_no1");
if( ptph_no1 == null){
	System.out.println(this.toString+" : ptph_no1 is null" );
}else{
	System.out.println(this.toString+" : ptph_no1 is "+ptph_no1 );
}
String ptph_no2 = req.getParameter("ptph_no2");
if( ptph_no2 == null){
	System.out.println(this.toString+" : ptph_no2 is null" );
}else{
	System.out.println(this.toString+" : ptph_no2 is "+ptph_no2 );
}
String ptph_no3 = req.getParameter("ptph_no3");
if( ptph_no3 == null){
	System.out.println(this.toString+" : ptph_no3 is null" );
}else{
	System.out.println(this.toString+" : ptph_no3 is "+ptph_no3 );
}
String email = req.getParameter("email");
if( email == null){
	System.out.println(this.toString+" : email is null" );
}else{
	System.out.println(this.toString+" : email is "+email );
}
String carrmatt = req.getParameter("carrmatt");
if( carrmatt == null){
	System.out.println(this.toString+" : carrmatt is null" );
}else{
	System.out.println(this.toString+" : carrmatt is "+carrmatt );
}
String leaderyn = req.getParameter("leaderyn");
if( leaderyn == null){
	System.out.println(this.toString+" : leaderyn is null" );
}else{
	System.out.println(this.toString+" : leaderyn is "+leaderyn );
}
String acctno = req.getParameter("acctno");
if( acctno == null){
	System.out.println(this.toString+" : acctno is null" );
}else{
	System.out.println(this.toString+" : acctno is "+acctno );
}
String acctbank = req.getParameter("acctbank");
if( acctbank == null){
	System.out.println(this.toString+" : acctbank is null" );
}else{
	System.out.println(this.toString+" : acctbank is "+acctbank );
}
String acctdeps_pers = req.getParameter("acctdeps_pers");
if( acctdeps_pers == null){
	System.out.println(this.toString+" : acctdeps_pers is null" );
}else{
	System.out.println(this.toString+" : acctdeps_pers is "+acctdeps_pers );
}
String id_cardissudt = req.getParameter("id_cardissudt");
if( id_cardissudt == null){
	System.out.println(this.toString+" : id_cardissudt is null" );
}else{
	System.out.println(this.toString+" : id_cardissudt is "+id_cardissudt );
}
String blngteamregmm = req.getParameter("blngteamregmm");
if( blngteamregmm == null){
	System.out.println(this.toString+" : blngteamregmm is null" );
}else{
	System.out.println(this.toString+" : blngteamregmm is "+blngteamregmm );
}
String blngteamnm = req.getParameter("blngteamnm");
if( blngteamnm == null){
	System.out.println(this.toString+" : blngteamnm is null" );
}else{
	System.out.println(this.toString+" : blngteamnm is "+blngteamnm );
}
String jursarearegmm = req.getParameter("jursarearegmm");
if( jursarearegmm == null){
	System.out.println(this.toString+" : jursarearegmm is null" );
}else{
	System.out.println(this.toString+" : jursarearegmm is "+jursarearegmm );
}
String jursareanm = req.getParameter("jursareanm");
if( jursareanm == null){
	System.out.println(this.toString+" : jursareanm is null" );
}else{
	System.out.println(this.toString+" : jursareanm is "+jursareanm );
}
String remk = req.getParameter("remk");
if( remk == null){
	System.out.println(this.toString+" : remk is null" );
}else{
	System.out.println(this.toString+" : remk is "+remk );
}
String cntrstatcd = req.getParameter("cntrstatcd");
if( cntrstatcd == null){
	System.out.println(this.toString+" : cntrstatcd is null" );
}else{
	System.out.println(this.toString+" : cntrstatcd is "+cntrstatcd );
}
String in_cmpydt = req.getParameter("in_cmpydt");
if( in_cmpydt == null){
	System.out.println(this.toString+" : in_cmpydt is null" );
}else{
	System.out.println(this.toString+" : in_cmpydt is "+in_cmpydt );
}
String lvcmpydt = req.getParameter("lvcmpydt");
if( lvcmpydt == null){
	System.out.println(this.toString+" : lvcmpydt is null" );
}else{
	System.out.println(this.toString+" : lvcmpydt is "+lvcmpydt );
}
String empseq = req.getParameter("empseq");
if( empseq == null){
	System.out.println(this.toString+" : empseq is null" );
}else{
	System.out.println(this.toString+" : empseq is "+empseq );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String stafclsfcd = Util.checkString(req.getParameter("stafclsfcd"));
String stafno = Util.checkString(req.getParameter("stafno"));
String prn = Util.checkString(req.getParameter("prn"));
String ernno = Util.checkString(req.getParameter("ernno"));
String stafnm = Util.checkString(req.getParameter("stafnm"));
String zip = Util.checkString(req.getParameter("zip"));
String addr = Util.checkString(req.getParameter("addr"));
String dtlsaddr = Util.checkString(req.getParameter("dtlsaddr"));
String tel_no1 = Util.checkString(req.getParameter("tel_no1"));
String tel_no2 = Util.checkString(req.getParameter("tel_no2"));
String tel_no3 = Util.checkString(req.getParameter("tel_no3"));
String ptph_no1 = Util.checkString(req.getParameter("ptph_no1"));
String ptph_no2 = Util.checkString(req.getParameter("ptph_no2"));
String ptph_no3 = Util.checkString(req.getParameter("ptph_no3"));
String email = Util.checkString(req.getParameter("email"));
String carrmatt = Util.checkString(req.getParameter("carrmatt"));
String leaderyn = Util.checkString(req.getParameter("leaderyn"));
String acctno = Util.checkString(req.getParameter("acctno"));
String acctbank = Util.checkString(req.getParameter("acctbank"));
String acctdeps_pers = Util.checkString(req.getParameter("acctdeps_pers"));
String id_cardissudt = Util.checkString(req.getParameter("id_cardissudt"));
String blngteamregmm = Util.checkString(req.getParameter("blngteamregmm"));
String blngteamnm = Util.checkString(req.getParameter("blngteamnm"));
String jursarearegmm = Util.checkString(req.getParameter("jursarearegmm"));
String jursareanm = Util.checkString(req.getParameter("jursareanm"));
String remk = Util.checkString(req.getParameter("remk"));
String cntrstatcd = Util.checkString(req.getParameter("cntrstatcd"));
String in_cmpydt = Util.checkString(req.getParameter("in_cmpydt"));
String lvcmpydt = Util.checkString(req.getParameter("lvcmpydt"));
String empseq = Util.checkString(req.getParameter("empseq"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String stafclsfcd = Util.Uni2Ksc(Util.checkString(req.getParameter("stafclsfcd")));
String stafno = Util.Uni2Ksc(Util.checkString(req.getParameter("stafno")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String ernno = Util.Uni2Ksc(Util.checkString(req.getParameter("ernno")));
String stafnm = Util.Uni2Ksc(Util.checkString(req.getParameter("stafnm")));
String zip = Util.Uni2Ksc(Util.checkString(req.getParameter("zip")));
String addr = Util.Uni2Ksc(Util.checkString(req.getParameter("addr")));
String dtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dtlsaddr")));
String tel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no1")));
String tel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no2")));
String tel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("tel_no3")));
String ptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no1")));
String ptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no2")));
String ptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("ptph_no3")));
String email = Util.Uni2Ksc(Util.checkString(req.getParameter("email")));
String carrmatt = Util.Uni2Ksc(Util.checkString(req.getParameter("carrmatt")));
String leaderyn = Util.Uni2Ksc(Util.checkString(req.getParameter("leaderyn")));
String acctno = Util.Uni2Ksc(Util.checkString(req.getParameter("acctno")));
String acctbank = Util.Uni2Ksc(Util.checkString(req.getParameter("acctbank")));
String acctdeps_pers = Util.Uni2Ksc(Util.checkString(req.getParameter("acctdeps_pers")));
String id_cardissudt = Util.Uni2Ksc(Util.checkString(req.getParameter("id_cardissudt")));
String blngteamregmm = Util.Uni2Ksc(Util.checkString(req.getParameter("blngteamregmm")));
String blngteamnm = Util.Uni2Ksc(Util.checkString(req.getParameter("blngteamnm")));
String jursarearegmm = Util.Uni2Ksc(Util.checkString(req.getParameter("jursarearegmm")));
String jursareanm = Util.Uni2Ksc(Util.checkString(req.getParameter("jursareanm")));
String remk = Util.Uni2Ksc(Util.checkString(req.getParameter("remk")));
String cntrstatcd = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrstatcd")));
String in_cmpydt = Util.Uni2Ksc(Util.checkString(req.getParameter("in_cmpydt")));
String lvcmpydt = Util.Uni2Ksc(Util.checkString(req.getParameter("lvcmpydt")));
String empseq = Util.Uni2Ksc(Util.checkString(req.getParameter("empseq")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setStafclsfcd(stafclsfcd);
dm.setStafno(stafno);
dm.setPrn(prn);
dm.setErnno(ernno);
dm.setStafnm(stafnm);
dm.setZip(zip);
dm.setAddr(addr);
dm.setDtlsaddr(dtlsaddr);
dm.setTel_no1(tel_no1);
dm.setTel_no2(tel_no2);
dm.setTel_no3(tel_no3);
dm.setPtph_no1(ptph_no1);
dm.setPtph_no2(ptph_no2);
dm.setPtph_no3(ptph_no3);
dm.setEmail(email);
dm.setCarrmatt(carrmatt);
dm.setLeaderyn(leaderyn);
dm.setAcctno(acctno);
dm.setAcctbank(acctbank);
dm.setAcctdeps_pers(acctdeps_pers);
dm.setId_cardissudt(id_cardissudt);
dm.setBlngteamregmm(blngteamregmm);
dm.setBlngteamnm(blngteamnm);
dm.setJursarearegmm(jursarearegmm);
dm.setJursareanm(jursareanm);
dm.setRemk(remk);
dm.setCntrstatcd(cntrstatcd);
dm.setIn_cmpydt(in_cmpydt);
dm.setLvcmpydt(lvcmpydt);
dm.setEmpseq(empseq);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 03 14:56:38 KST 2015 */