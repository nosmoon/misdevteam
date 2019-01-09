/***************************************************************************************************
* 파일명 : CO_A_DSCTDM.java
* 기능 : 불편관리(등록,수정,삭제)
* 작성일자 : 2003-12-27
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
 * 불편관리(등록,수정,삭제)
 *
 */
public class CO_A_DSCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String accflag;
	public String userflag;
	public String regdt;
	public String regno;
	public String dscttypecd;
	public String acpnpathcd;
	public String bocd;
	public String rdr_no;
	public String termsubsno;
	public String medicd;
	public String rdrnm;
	public String prn;
	public String rdremail;
	public String rdrtel_no1;
	public String rdrtel_no2;
	public String rdrtel_no3;
	public String rdrptph_no1;
	public String rdrptph_no2;
	public String rdrptph_no3;
	public String dlvzip;
	public String dlvaddr;
	public String dlvdtlsaddr;
	public String titl;
	public String cont;
	public String boproccont;
	public String cns_empnm;
	public String cns_empid;
	public String cns_empcnfmyn;
	public String cns_empremk;
	public String proccont;
	public String procpers;

	public CO_A_DSCTDM(){}
	public CO_A_DSCTDM(String incmgpers, String accflag, String userflag, String regdt, String regno, String dscttypecd, String acpnpathcd, String bocd, String rdr_no, String termsubsno, String medicd, String rdrnm, String prn, String rdremail, String rdrtel_no1, String rdrtel_no2, String rdrtel_no3, String rdrptph_no1, String rdrptph_no2, String rdrptph_no3, String dlvzip, String dlvaddr, String dlvdtlsaddr, String titl, String cont, String boproccont, String cns_empnm, String cns_empid, String cns_empcnfmyn, String cns_empremk, String proccont, String procpers){
		this.incmgpers = incmgpers;
		this.accflag = accflag;
		this.userflag = userflag;
		this.regdt = regdt;
		this.regno = regno;
		this.dscttypecd = dscttypecd;
		this.acpnpathcd = acpnpathcd;
		this.bocd = bocd;
		this.rdr_no = rdr_no;
		this.termsubsno = termsubsno;
		this.medicd = medicd;
		this.rdrnm = rdrnm;
		this.prn = prn;
		this.rdremail = rdremail;
		this.rdrtel_no1 = rdrtel_no1;
		this.rdrtel_no2 = rdrtel_no2;
		this.rdrtel_no3 = rdrtel_no3;
		this.rdrptph_no1 = rdrptph_no1;
		this.rdrptph_no2 = rdrptph_no2;
		this.rdrptph_no3 = rdrptph_no3;
		this.dlvzip = dlvzip;
		this.dlvaddr = dlvaddr;
		this.dlvdtlsaddr = dlvdtlsaddr;
		this.titl = titl;
		this.cont = cont;
		this.boproccont = boproccont;
		this.cns_empnm = cns_empnm;
		this.cns_empid = cns_empid;
		this.cns_empcnfmyn = cns_empcnfmyn;
		this.cns_empremk = cns_empremk;
		this.proccont = proccont;
		this.procpers = procpers;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setUserflag(String userflag){
		this.userflag = userflag;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
	}

	public void setRegno(String regno){
		this.regno = regno;
	}

	public void setDscttypecd(String dscttypecd){
		this.dscttypecd = dscttypecd;
	}

	public void setAcpnpathcd(String acpnpathcd){
		this.acpnpathcd = acpnpathcd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setTermsubsno(String termsubsno){
		this.termsubsno = termsubsno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setRdremail(String rdremail){
		this.rdremail = rdremail;
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

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setDlvdtlsaddr(String dlvdtlsaddr){
		this.dlvdtlsaddr = dlvdtlsaddr;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setBoproccont(String boproccont){
		this.boproccont = boproccont;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setCns_empid(String cns_empid){
		this.cns_empid = cns_empid;
	}

	public void setCns_empcnfmyn(String cns_empcnfmyn){
		this.cns_empcnfmyn = cns_empcnfmyn;
	}

	public void setCns_empremk(String cns_empremk){
		this.cns_empremk = cns_empremk;
	}

	public void setProccont(String proccont){
		this.proccont = proccont;
	}

	public void setProcpers(String procpers){
		this.procpers = procpers;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getUserflag(){
		return this.userflag;
	}

	public String getRegdt(){
		return this.regdt;
	}

	public String getRegno(){
		return this.regno;
	}

	public String getDscttypecd(){
		return this.dscttypecd;
	}

	public String getAcpnpathcd(){
		return this.acpnpathcd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getTermsubsno(){
		return this.termsubsno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getRdremail(){
		return this.rdremail;
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

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getDlvdtlsaddr(){
		return this.dlvdtlsaddr;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getBoproccont(){
		return this.boproccont;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getCns_empid(){
		return this.cns_empid;
	}

	public String getCns_empcnfmyn(){
		return this.cns_empcnfmyn;
	}

	public String getCns_empremk(){
		return this.cns_empremk;
	}

	public String getProccont(){
		return this.proccont;
	}

	public String getProcpers(){
		return this.procpers;
	}

	public String getSQL(){
		 return "{ call SP_CO_A_DSCT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_A_DSCTDM dm = (CO_A_DSCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.accflag);
		cstmt.setString(5, dm.userflag);
		cstmt.setString(6, dm.regdt);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.setString(7, dm.regno);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.setString(8, dm.dscttypecd);
		cstmt.setString(9, dm.acpnpathcd);
		cstmt.setString(10, dm.bocd);
		cstmt.setString(11, dm.rdr_no);
		cstmt.setString(12, dm.termsubsno);
		cstmt.setString(13, dm.medicd);
		cstmt.setString(14, dm.rdrnm);
		cstmt.setString(15, dm.prn);
		cstmt.setString(16, dm.rdremail);
		cstmt.setString(17, dm.rdrtel_no1);
		cstmt.setString(18, dm.rdrtel_no2);
		cstmt.setString(19, dm.rdrtel_no3);
		cstmt.setString(20, dm.rdrptph_no1);
		cstmt.setString(21, dm.rdrptph_no2);
		cstmt.setString(22, dm.rdrptph_no3);
		cstmt.setString(23, dm.dlvzip);
		cstmt.setString(24, dm.dlvaddr);
		cstmt.setString(25, dm.dlvdtlsaddr);
		cstmt.setString(26, dm.titl);
		cstmt.setString(27, dm.cont);
		cstmt.setString(28, dm.boproccont);
		cstmt.setString(29, dm.cns_empnm);
		cstmt.setString(30, dm.cns_empid);
		cstmt.setString(31, dm.cns_empcnfmyn);
		cstmt.setString(32, dm.cns_empremk);
		cstmt.setString(33, dm.proccont);
		cstmt.setString(34, dm.procpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.rdr.ds.CO_A_DSCTDataSet();
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
String userflag = req.getParameter("userflag");
if( userflag == null){
	System.out.println(this.toString+" : userflag is null" );
}else{
	System.out.println(this.toString+" : userflag is "+userflag );
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
String dscttypecd = req.getParameter("dscttypecd");
if( dscttypecd == null){
	System.out.println(this.toString+" : dscttypecd is null" );
}else{
	System.out.println(this.toString+" : dscttypecd is "+dscttypecd );
}
String acpnpathcd = req.getParameter("acpnpathcd");
if( acpnpathcd == null){
	System.out.println(this.toString+" : acpnpathcd is null" );
}else{
	System.out.println(this.toString+" : acpnpathcd is "+acpnpathcd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String termsubsno = req.getParameter("termsubsno");
if( termsubsno == null){
	System.out.println(this.toString+" : termsubsno is null" );
}else{
	System.out.println(this.toString+" : termsubsno is "+termsubsno );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
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
String rdremail = req.getParameter("rdremail");
if( rdremail == null){
	System.out.println(this.toString+" : rdremail is null" );
}else{
	System.out.println(this.toString+" : rdremail is "+rdremail );
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
String titl = req.getParameter("titl");
if( titl == null){
	System.out.println(this.toString+" : titl is null" );
}else{
	System.out.println(this.toString+" : titl is "+titl );
}
String cont = req.getParameter("cont");
if( cont == null){
	System.out.println(this.toString+" : cont is null" );
}else{
	System.out.println(this.toString+" : cont is "+cont );
}
String boproccont = req.getParameter("boproccont");
if( boproccont == null){
	System.out.println(this.toString+" : boproccont is null" );
}else{
	System.out.println(this.toString+" : boproccont is "+boproccont );
}
String cns_empnm = req.getParameter("cns_empnm");
if( cns_empnm == null){
	System.out.println(this.toString+" : cns_empnm is null" );
}else{
	System.out.println(this.toString+" : cns_empnm is "+cns_empnm );
}
String cns_empid = req.getParameter("cns_empid");
if( cns_empid == null){
	System.out.println(this.toString+" : cns_empid is null" );
}else{
	System.out.println(this.toString+" : cns_empid is "+cns_empid );
}
String cns_empcnfmyn = req.getParameter("cns_empcnfmyn");
if( cns_empcnfmyn == null){
	System.out.println(this.toString+" : cns_empcnfmyn is null" );
}else{
	System.out.println(this.toString+" : cns_empcnfmyn is "+cns_empcnfmyn );
}
String cns_empremk = req.getParameter("cns_empremk");
if( cns_empremk == null){
	System.out.println(this.toString+" : cns_empremk is null" );
}else{
	System.out.println(this.toString+" : cns_empremk is "+cns_empremk );
}
String proccont = req.getParameter("proccont");
if( proccont == null){
	System.out.println(this.toString+" : proccont is null" );
}else{
	System.out.println(this.toString+" : proccont is "+proccont );
}
String procpers = req.getParameter("procpers");
if( procpers == null){
	System.out.println(this.toString+" : procpers is null" );
}else{
	System.out.println(this.toString+" : procpers is "+procpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String accflag = Util.checkString(req.getParameter("accflag"));
String userflag = Util.checkString(req.getParameter("userflag"));
String regdt = Util.checkString(req.getParameter("regdt"));
String regno = Util.checkString(req.getParameter("regno"));
String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));
String acpnpathcd = Util.checkString(req.getParameter("acpnpathcd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String termsubsno = Util.checkString(req.getParameter("termsubsno"));
String medicd = Util.checkString(req.getParameter("medicd"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String prn = Util.checkString(req.getParameter("prn"));
String rdremail = Util.checkString(req.getParameter("rdremail"));
String rdrtel_no1 = Util.checkString(req.getParameter("rdrtel_no1"));
String rdrtel_no2 = Util.checkString(req.getParameter("rdrtel_no2"));
String rdrtel_no3 = Util.checkString(req.getParameter("rdrtel_no3"));
String rdrptph_no1 = Util.checkString(req.getParameter("rdrptph_no1"));
String rdrptph_no2 = Util.checkString(req.getParameter("rdrptph_no2"));
String rdrptph_no3 = Util.checkString(req.getParameter("rdrptph_no3"));
String dlvzip = Util.checkString(req.getParameter("dlvzip"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String dlvdtlsaddr = Util.checkString(req.getParameter("dlvdtlsaddr"));
String titl = Util.checkString(req.getParameter("titl"));
String cont = Util.checkString(req.getParameter("cont"));
String boproccont = Util.checkString(req.getParameter("boproccont"));
String cns_empnm = Util.checkString(req.getParameter("cns_empnm"));
String cns_empid = Util.checkString(req.getParameter("cns_empid"));
String cns_empcnfmyn = Util.checkString(req.getParameter("cns_empcnfmyn"));
String cns_empremk = Util.checkString(req.getParameter("cns_empremk"));
String proccont = Util.checkString(req.getParameter("proccont"));
String procpers = Util.checkString(req.getParameter("procpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String userflag = Util.Uni2Ksc(Util.checkString(req.getParameter("userflag")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String regno = Util.Uni2Ksc(Util.checkString(req.getParameter("regno")));
String dscttypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("dscttypecd")));
String acpnpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("acpnpathcd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String termsubsno = Util.Uni2Ksc(Util.checkString(req.getParameter("termsubsno")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String rdremail = Util.Uni2Ksc(Util.checkString(req.getParameter("rdremail")));
String rdrtel_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no1")));
String rdrtel_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no2")));
String rdrtel_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrtel_no3")));
String rdrptph_no1 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no1")));
String rdrptph_no2 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no2")));
String rdrptph_no3 = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrptph_no3")));
String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String dlvdtlsaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvdtlsaddr")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String boproccont = Util.Uni2Ksc(Util.checkString(req.getParameter("boproccont")));
String cns_empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empnm")));
String cns_empid = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empid")));
String cns_empcnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empcnfmyn")));
String cns_empremk = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empremk")));
String proccont = Util.Uni2Ksc(Util.checkString(req.getParameter("proccont")));
String procpers = Util.Uni2Ksc(Util.checkString(req.getParameter("procpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setAccflag(accflag);
dm.setUserflag(userflag);
dm.setRegdt(regdt);
dm.setRegno(regno);
dm.setDscttypecd(dscttypecd);
dm.setAcpnpathcd(acpnpathcd);
dm.setBocd(bocd);
dm.setRdr_no(rdr_no);
dm.setTermsubsno(termsubsno);
dm.setMedicd(medicd);
dm.setRdrnm(rdrnm);
dm.setPrn(prn);
dm.setRdremail(rdremail);
dm.setRdrtel_no1(rdrtel_no1);
dm.setRdrtel_no2(rdrtel_no2);
dm.setRdrtel_no3(rdrtel_no3);
dm.setRdrptph_no1(rdrptph_no1);
dm.setRdrptph_no2(rdrptph_no2);
dm.setRdrptph_no3(rdrptph_no3);
dm.setDlvzip(dlvzip);
dm.setDlvaddr(dlvaddr);
dm.setDlvdtlsaddr(dlvdtlsaddr);
dm.setTitl(titl);
dm.setCont(cont);
dm.setBoproccont(boproccont);
dm.setCns_empnm(cns_empnm);
dm.setCns_empid(cns_empid);
dm.setCns_empcnfmyn(cns_empcnfmyn);
dm.setCns_empremk(cns_empremk);
dm.setProccont(proccont);
dm.setProcpers(procpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jan 30 18:03:24 KST 2004 */