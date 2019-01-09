/***************************************************************************************************
* 파일명 : .java
* 기능 : 판매-지국지원-이사독자수당현황
* 작성일자 : 2011-12-05
* 작성자 : 이기영
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_A_EMP_NWSPRDRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cntrno;
	public String cmpycd;
	public String empseq;
	public String rdr_no;
	public String rdrnm;
	public String rdr_extndt;
	public String subsfr_dt;
	public String valmm;
	public String qty;
	public String freeyn;
	public String suspdt;
	public String suspresncd;
	public String dlvaddr;
	public String bocd;
	public String bonm;
	public String rdr_extnno;
	public String dlvzip;
	public String dlvtelno;
	public String dlvptphno;
	public String medicd;
	public String modcheck;

	public SS_A_EMP_NWSPRDRDM(){}
	public SS_A_EMP_NWSPRDRDM(String cntrno, String cmpycd, String empseq, String rdr_no, String rdrnm, String rdr_extndt, String subsfr_dt, String valmm, String qty, String freeyn, String suspdt, String suspresncd, String dlvaddr, String bocd, String bonm, String rdr_extnno, String dlvzip, String dlvtelno, String dlvptphno, String medicd, String modcheck){
		this.cntrno = cntrno;
		this.cmpycd = cmpycd;
		this.empseq = empseq;
		this.rdr_no = rdr_no;
		this.rdrnm = rdrnm;
		this.rdr_extndt = rdr_extndt;
		this.subsfr_dt = subsfr_dt;
		this.valmm = valmm;
		this.qty = qty;
		this.freeyn = freeyn;
		this.suspdt = suspdt;
		this.suspresncd = suspresncd;
		this.dlvaddr = dlvaddr;
		this.bocd = bocd;
		this.bonm = bonm;
		this.rdr_extnno = rdr_extnno;
		this.dlvzip = dlvzip;
		this.dlvtelno = dlvtelno;
		this.dlvptphno = dlvptphno;
		this.medicd = medicd;
		this.modcheck = modcheck;
	}

	public void setCntrno(String cntrno){
		this.cntrno = cntrno;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setEmpseq(String empseq){
		this.empseq = empseq;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_extndt(String rdr_extndt){
		this.rdr_extndt = rdr_extndt;
	}

	public void setSubsfr_dt(String subsfr_dt){
		this.subsfr_dt = subsfr_dt;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public void setQty(String qty){
		this.qty = qty;
	}

	public void setFreeyn(String freeyn){
		this.freeyn = freeyn;
	}

	public void setSuspdt(String suspdt){
		this.suspdt = suspdt;
	}

	public void setSuspresncd(String suspresncd){
		this.suspresncd = suspresncd;
	}

	public void setDlvaddr(String dlvaddr){
		this.dlvaddr = dlvaddr;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setRdr_extnno(String rdr_extnno){
		this.rdr_extnno = rdr_extnno;
	}

	public void setDlvzip(String dlvzip){
		this.dlvzip = dlvzip;
	}

	public void setDlvtelno(String dlvtelno){
		this.dlvtelno = dlvtelno;
	}

	public void setDlvptphno(String dlvptphno){
		this.dlvptphno = dlvptphno;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setModcheck(String modcheck){
		this.modcheck = modcheck;
	}

	public String getCntrno(){
		return this.cntrno;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getEmpseq(){
		return this.empseq;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_extndt(){
		return this.rdr_extndt;
	}

	public String getSubsfr_dt(){
		return this.subsfr_dt;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getQty(){
		return this.qty;
	}

	public String getFreeyn(){
		return this.freeyn;
	}

	public String getSuspdt(){
		return this.suspdt;
	}

	public String getSuspresncd(){
		return this.suspresncd;
	}

	public String getDlvaddr(){
		return this.dlvaddr;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getRdr_extnno(){
		return this.rdr_extnno;
	}

	public String getDlvzip(){
		return this.dlvzip;
	}

	public String getDlvtelno(){
		return this.dlvtelno;
	}

	public String getDlvptphno(){
		return this.dlvptphno;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getModcheck(){
		return this.modcheck;
	}

	public String getSQL(){
		 return "{ call CRMSAL_COM.SP_SS_A_EMP_NWSPRDR(? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,? ,?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_EMP_NWSPRDRDM dm = (SS_A_EMP_NWSPRDRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cntrno);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.empseq);
		cstmt.setString(6, dm.rdr_no);
		cstmt.setString(7, dm.rdrnm);
		cstmt.setString(8, dm.rdr_extndt);
		cstmt.setString(9, dm.subsfr_dt);
		cstmt.setString(10, dm.valmm);
		cstmt.setString(11, dm.qty);
		cstmt.setString(12, dm.freeyn);
		cstmt.setString(13, dm.suspdt);
		cstmt.setString(14, dm.suspresncd);
		cstmt.setString(15, dm.dlvaddr);
		cstmt.setString(16, dm.bocd);
		cstmt.setString(17, dm.bonm);
		cstmt.setString(18, dm.rdr_extnno);
		cstmt.setString(19, dm.dlvzip);
		cstmt.setString(20, dm.dlvtelno);
		cstmt.setString(21, dm.dlvptphno);
		cstmt.setString(22, dm.medicd);
		cstmt.setString(23, dm.modcheck);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_A_EMP_NWSPRDRDataSet();
	}



	public void print(){
		System.out.println("SQL = " + this.getSQL());
		System.out.println("cntrno = [" + getCntrno() + "]");
		System.out.println("cmpycd = [" + getCmpycd() + "]");
		System.out.println("empseq = [" + getEmpseq() + "]");
		System.out.println("rdr_no = [" + getRdr_no() + "]");
		System.out.println("rdrnm = [" + getRdrnm() + "]");
		System.out.println("rdr_extndt = [" + getRdr_extndt() + "]");
		System.out.println("subsfr_dt = [" + getSubsfr_dt() + "]");
		System.out.println("valmm = [" + getValmm() + "]");
		System.out.println("qty = [" + getQty() + "]");
		System.out.println("freeyn = [" + getFreeyn() + "]");
		System.out.println("suspdt = [" + getSuspdt() + "]");
		System.out.println("suspresncd = [" + getSuspresncd() + "]");
		System.out.println("dlvaddr = [" + getDlvaddr() + "]");
		System.out.println("bocd = [" + getBocd() + "]");
		System.out.println("bonm = [" + getBonm() + "]");
		System.out.println("rdr_extnno = [" + getRdr_extnno() + "]");
		System.out.println("dlvzip = [" + getDlvzip() + "]");
		System.out.println("dlvtelno = [" + getDlvtelno() + "]");
		System.out.println("dlvptphno = [" + getDlvptphno() + "]");
		System.out.println("medicd = [" + getMedicd() + "]");
		System.out.println("modcheck = [" + getModcheck() + "]");
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cntrno = req.getParameter("cntrno");
if( cntrno == null){
	System.out.println(this.toString+" : cntrno is null" );
}else{
	System.out.println(this.toString+" : cntrno is "+cntrno );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String empseq = req.getParameter("empseq");
if( empseq == null){
	System.out.println(this.toString+" : empseq is null" );
}else{
	System.out.println(this.toString+" : empseq is "+empseq );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String rdr_extndt = req.getParameter("rdr_extndt");
if( rdr_extndt == null){
	System.out.println(this.toString+" : rdr_extndt is null" );
}else{
	System.out.println(this.toString+" : rdr_extndt is "+rdr_extndt );
}
String subsfr_dt = req.getParameter("subsfr_dt");
if( subsfr_dt == null){
	System.out.println(this.toString+" : subsfr_dt is null" );
}else{
	System.out.println(this.toString+" : subsfr_dt is "+subsfr_dt );
}
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
String qty = req.getParameter("qty");
if( qty == null){
	System.out.println(this.toString+" : qty is null" );
}else{
	System.out.println(this.toString+" : qty is "+qty );
}
String freeyn = req.getParameter("freeyn");
if( freeyn == null){
	System.out.println(this.toString+" : freeyn is null" );
}else{
	System.out.println(this.toString+" : freeyn is "+freeyn );
}
String suspdt = req.getParameter("suspdt");
if( suspdt == null){
	System.out.println(this.toString+" : suspdt is null" );
}else{
	System.out.println(this.toString+" : suspdt is "+suspdt );
}
String suspresncd = req.getParameter("suspresncd");
if( suspresncd == null){
	System.out.println(this.toString+" : suspresncd is null" );
}else{
	System.out.println(this.toString+" : suspresncd is "+suspresncd );
}
String dlvaddr = req.getParameter("dlvaddr");
if( dlvaddr == null){
	System.out.println(this.toString+" : dlvaddr is null" );
}else{
	System.out.println(this.toString+" : dlvaddr is "+dlvaddr );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String bonm = req.getParameter("bonm");
if( bonm == null){
	System.out.println(this.toString+" : bonm is null" );
}else{
	System.out.println(this.toString+" : bonm is "+bonm );
}
String rdr_extnno = req.getParameter("rdr_extnno");
if( rdr_extnno == null){
	System.out.println(this.toString+" : rdr_extnno is null" );
}else{
	System.out.println(this.toString+" : rdr_extnno is "+rdr_extnno );
}
String dlvzip = req.getParameter("dlvzip");
if( dlvzip == null){
	System.out.println(this.toString+" : dlvzip is null" );
}else{
	System.out.println(this.toString+" : dlvzip is "+dlvzip );
}
String dlvtelno = req.getParameter("dlvtelno");
if( dlvtelno == null){
	System.out.println(this.toString+" : dlvtelno is null" );
}else{
	System.out.println(this.toString+" : dlvtelno is "+dlvtelno );
}
String dlvptphno = req.getParameter("dlvptphno");
if( dlvptphno == null){
	System.out.println(this.toString+" : dlvptphno is null" );
}else{
	System.out.println(this.toString+" : dlvptphno is "+dlvptphno );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String modcheck = req.getParameter("modcheck");
if( modcheck == null){
	System.out.println(this.toString+" : modcheck is null" );
}else{
	System.out.println(this.toString+" : modcheck is "+modcheck );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cntrno = Util.checkString(req.getParameter("cntrno"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String empseq = Util.checkString(req.getParameter("empseq"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdr_extndt = Util.checkString(req.getParameter("rdr_extndt"));
String subsfr_dt = Util.checkString(req.getParameter("subsfr_dt"));
String valmm = Util.checkString(req.getParameter("valmm"));
String qty = Util.checkString(req.getParameter("qty"));
String freeyn = Util.checkString(req.getParameter("freeyn"));
String suspdt = Util.checkString(req.getParameter("suspdt"));
String suspresncd = Util.checkString(req.getParameter("suspresncd"));
String dlvaddr = Util.checkString(req.getParameter("dlvaddr"));
String bocd = Util.checkString(req.getParameter("bocd"));
String bonm = Util.checkString(req.getParameter("bonm"));
String rdr_extnno = Util.checkString(req.getParameter("rdr_extnno"));
String dlvzip = Util.checkString(req.getParameter("dlvzip"));
String dlvtelno = Util.checkString(req.getParameter("dlvtelno"));
String dlvptphno = Util.checkString(req.getParameter("dlvptphno"));
String medicd = Util.checkString(req.getParameter("medicd"));
String modcheck = Util.checkString(req.getParameter("modcheck"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cntrno = Util.Uni2Ksc(Util.checkString(req.getParameter("cntrno")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String empseq = Util.Uni2Ksc(Util.checkString(req.getParameter("empseq")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdr_extndt = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extndt")));
String subsfr_dt = Util.Uni2Ksc(Util.checkString(req.getParameter("subsfr_dt")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
String qty = Util.Uni2Ksc(Util.checkString(req.getParameter("qty")));
String freeyn = Util.Uni2Ksc(Util.checkString(req.getParameter("freeyn")));
String suspdt = Util.Uni2Ksc(Util.checkString(req.getParameter("suspdt")));
String suspresncd = Util.Uni2Ksc(Util.checkString(req.getParameter("suspresncd")));
String dlvaddr = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvaddr")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));
String rdr_extnno = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_extnno")));
String dlvzip = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvzip")));
String dlvtelno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvtelno")));
String dlvptphno = Util.Uni2Ksc(Util.checkString(req.getParameter("dlvptphno")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String modcheck = Util.Uni2Ksc(Util.checkString(req.getParameter("modcheck")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCntrno(cntrno);
dm.setCmpycd(cmpycd);
dm.setEmpseq(empseq);
dm.setRdr_no(rdr_no);
dm.setRdrnm(rdrnm);
dm.setRdr_extndt(rdr_extndt);
dm.setSubsfr_dt(subsfr_dt);
dm.setValmm(valmm);
dm.setQty(qty);
dm.setFreeyn(freeyn);
dm.setSuspdt(suspdt);
dm.setSuspresncd(suspresncd);
dm.setDlvaddr(dlvaddr);
dm.setBocd(bocd);
dm.setBonm(bonm);
dm.setRdr_extnno(rdr_extnno);
dm.setDlvzip(dlvzip);
dm.setDlvtelno(dlvtelno);
dm.setDlvptphno(dlvptphno);
dm.setMedicd(medicd);
dm.setModcheck(modcheck);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 11 06:20:19 GMT 2013 */