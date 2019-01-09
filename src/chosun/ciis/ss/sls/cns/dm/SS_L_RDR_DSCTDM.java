/***************************************************************************************************
* 파일명 : .java
* 기능 : 상담원-불편접수검색
* 작성일자 : 2008-07-11
* 작성자 : 노상현
***************************************************************************************************/


package chosun.ciis.ss.sls.cns.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.cns.ds.*;
import chosun.ciis.ss.sls.cns.rec.*;

/**
 *상담원-불편접수검색
*/
public class SS_L_RDR_DSCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptcd;
	public String areacd;
	public String bocd;
	public String fromtogb;
	public String frdt;
	public String todt;
	public String rdrnm;
	public String rdr_no;
	public String titl;
	public String cont;
	public String dscttypecd;
	public String bocnfmyn;
	public String boprocyn;
	public String acpnpathcd;
	public long pageno;
	public long pagesize;
	public String cns_empnm;
	public String procpers;

	public SS_L_RDR_DSCTDM(){}
	public SS_L_RDR_DSCTDM(String deptcd, String areacd, String bocd, String fromtogb, String frdt, String todt, String rdrnm, String rdr_no, String titl, String cont, String dscttypecd, String bocnfmyn, String boprocyn, String acpnpathcd, long pageno, long pagesize, String cns_empnm, String procpers){
		this.deptcd = deptcd;
		this.areacd = areacd;
		this.bocd = bocd;
		this.fromtogb = fromtogb;
		this.frdt = frdt;
		this.todt = todt;
		this.rdrnm = rdrnm;
		this.rdr_no = rdr_no;
		this.titl = titl;
		this.cont = cont;
		this.dscttypecd = dscttypecd;
		this.bocnfmyn = bocnfmyn;
		this.boprocyn = boprocyn;
		this.acpnpathcd = acpnpathcd;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.cns_empnm = cns_empnm;
		this.procpers = procpers;
	}

	public void setDeptcd(String deptcd){
		this.deptcd = deptcd;
	}

	public void setAreacd(String areacd){
		this.areacd = areacd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setFromtogb(String fromtogb){
		this.fromtogb = fromtogb;
	}

	public void setFrdt(String frdt){
		this.frdt = frdt;
	}

	public void setTodt(String todt){
		this.todt = todt;
	}

	public void setRdrnm(String rdrnm){
		this.rdrnm = rdrnm;
	}

	public void setRdr_no(String rdr_no){
		this.rdr_no = rdr_no;
	}

	public void setTitl(String titl){
		this.titl = titl;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public void setDscttypecd(String dscttypecd){
		this.dscttypecd = dscttypecd;
	}

	public void setBocnfmyn(String bocnfmyn){
		this.bocnfmyn = bocnfmyn;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setAcpnpathcd(String acpnpathcd){
		this.acpnpathcd = acpnpathcd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setCns_empnm(String cns_empnm){
		this.cns_empnm = cns_empnm;
	}

	public void setProcpers(String procpers){
		this.procpers = procpers;
	}

	public String getDeptcd(){
		return this.deptcd;
	}

	public String getAreacd(){
		return this.areacd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getFromtogb(){
		return this.fromtogb;
	}

	public String getFrdt(){
		return this.frdt;
	}

	public String getTodt(){
		return this.todt;
	}

	public String getRdrnm(){
		return this.rdrnm;
	}

	public String getRdr_no(){
		return this.rdr_no;
	}

	public String getTitl(){
		return this.titl;
	}

	public String getCont(){
		return this.cont;
	}

	public String getDscttypecd(){
		return this.dscttypecd;
	}

	public String getBocnfmyn(){
		return this.bocnfmyn;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getAcpnpathcd(){
		return this.acpnpathcd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getCns_empnm(){
		return this.cns_empnm;
	}

	public String getProcpers(){
		return this.procpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_RDR_DSCT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_RDR_DSCTDM dm = (SS_L_RDR_DSCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptcd);
		cstmt.setString(4, dm.areacd);
		cstmt.setString(5, dm.bocd);
		cstmt.setString(6, dm.fromtogb);
		cstmt.setString(7, dm.frdt);
		cstmt.setString(8, dm.todt);
		cstmt.setString(9, dm.rdrnm);
		cstmt.setString(10, dm.rdr_no);
		cstmt.setString(11, dm.titl);
		cstmt.setString(12, dm.cont);
		cstmt.setString(13, dm.dscttypecd);
		cstmt.setString(14, dm.bocnfmyn);
		cstmt.setString(15, dm.boprocyn);
		cstmt.setString(16, dm.acpnpathcd);
		cstmt.setLong(17, dm.pageno);
		cstmt.setLong(18, dm.pagesize);
		cstmt.setString(19, dm.cns_empnm);
		cstmt.setString(20, dm.procpers);
		cstmt.registerOutParameter(21, Types.INTEGER);
		cstmt.registerOutParameter(22, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.cns.ds.SS_L_RDR_DSCTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String fromtogb = req.getParameter("fromtogb");
if( fromtogb == null){
	System.out.println(this.toString+" : fromtogb is null" );
}else{
	System.out.println(this.toString+" : fromtogb is "+fromtogb );
}
String frdt = req.getParameter("frdt");
if( frdt == null){
	System.out.println(this.toString+" : frdt is null" );
}else{
	System.out.println(this.toString+" : frdt is "+frdt );
}
String todt = req.getParameter("todt");
if( todt == null){
	System.out.println(this.toString+" : todt is null" );
}else{
	System.out.println(this.toString+" : todt is "+todt );
}
String rdrnm = req.getParameter("rdrnm");
if( rdrnm == null){
	System.out.println(this.toString+" : rdrnm is null" );
}else{
	System.out.println(this.toString+" : rdrnm is "+rdrnm );
}
String rdr_no = req.getParameter("rdr_no");
if( rdr_no == null){
	System.out.println(this.toString+" : rdr_no is null" );
}else{
	System.out.println(this.toString+" : rdr_no is "+rdr_no );
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
String dscttypecd = req.getParameter("dscttypecd");
if( dscttypecd == null){
	System.out.println(this.toString+" : dscttypecd is null" );
}else{
	System.out.println(this.toString+" : dscttypecd is "+dscttypecd );
}
String bocnfmyn = req.getParameter("bocnfmyn");
if( bocnfmyn == null){
	System.out.println(this.toString+" : bocnfmyn is null" );
}else{
	System.out.println(this.toString+" : bocnfmyn is "+bocnfmyn );
}
String boprocyn = req.getParameter("boprocyn");
if( boprocyn == null){
	System.out.println(this.toString+" : boprocyn is null" );
}else{
	System.out.println(this.toString+" : boprocyn is "+boprocyn );
}
String acpnpathcd = req.getParameter("acpnpathcd");
if( acpnpathcd == null){
	System.out.println(this.toString+" : acpnpathcd is null" );
}else{
	System.out.println(this.toString+" : acpnpathcd is "+acpnpathcd );
}
String pageno = req.getParameter("pageno");
if( pageno == null){
	System.out.println(this.toString+" : pageno is null" );
}else{
	System.out.println(this.toString+" : pageno is "+pageno );
}
String pagesize = req.getParameter("pagesize");
if( pagesize == null){
	System.out.println(this.toString+" : pagesize is null" );
}else{
	System.out.println(this.toString+" : pagesize is "+pagesize );
}
String cns_empnm = req.getParameter("cns_empnm");
if( cns_empnm == null){
	System.out.println(this.toString+" : cns_empnm is null" );
}else{
	System.out.println(this.toString+" : cns_empnm is "+cns_empnm );
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

String deptcd = Util.checkString(req.getParameter("deptcd"));
String areacd = Util.checkString(req.getParameter("areacd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String fromtogb = Util.checkString(req.getParameter("fromtogb"));
String frdt = Util.checkString(req.getParameter("frdt"));
String todt = Util.checkString(req.getParameter("todt"));
String rdrnm = Util.checkString(req.getParameter("rdrnm"));
String rdr_no = Util.checkString(req.getParameter("rdr_no"));
String titl = Util.checkString(req.getParameter("titl"));
String cont = Util.checkString(req.getParameter("cont"));
String dscttypecd = Util.checkString(req.getParameter("dscttypecd"));
String bocnfmyn = Util.checkString(req.getParameter("bocnfmyn"));
String boprocyn = Util.checkString(req.getParameter("boprocyn"));
String acpnpathcd = Util.checkString(req.getParameter("acpnpathcd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String cns_empnm = Util.checkString(req.getParameter("cns_empnm"));
String procpers = Util.checkString(req.getParameter("procpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptcd = Util.Uni2Ksc(Util.checkString(req.getParameter("deptcd")));
String areacd = Util.Uni2Ksc(Util.checkString(req.getParameter("areacd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String fromtogb = Util.Uni2Ksc(Util.checkString(req.getParameter("fromtogb")));
String frdt = Util.Uni2Ksc(Util.checkString(req.getParameter("frdt")));
String todt = Util.Uni2Ksc(Util.checkString(req.getParameter("todt")));
String rdrnm = Util.Uni2Ksc(Util.checkString(req.getParameter("rdrnm")));
String rdr_no = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no")));
String titl = Util.Uni2Ksc(Util.checkString(req.getParameter("titl")));
String cont = Util.Uni2Ksc(Util.checkString(req.getParameter("cont")));
String dscttypecd = Util.Uni2Ksc(Util.checkString(req.getParameter("dscttypecd")));
String bocnfmyn = Util.Uni2Ksc(Util.checkString(req.getParameter("bocnfmyn")));
String boprocyn = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocyn")));
String acpnpathcd = Util.Uni2Ksc(Util.checkString(req.getParameter("acpnpathcd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String cns_empnm = Util.Uni2Ksc(Util.checkString(req.getParameter("cns_empnm")));
String procpers = Util.Uni2Ksc(Util.checkString(req.getParameter("procpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptcd(deptcd);
dm.setAreacd(areacd);
dm.setBocd(bocd);
dm.setFromtogb(fromtogb);
dm.setFrdt(frdt);
dm.setTodt(todt);
dm.setRdrnm(rdrnm);
dm.setRdr_no(rdr_no);
dm.setTitl(titl);
dm.setCont(cont);
dm.setDscttypecd(dscttypecd);
dm.setBocnfmyn(bocnfmyn);
dm.setBoprocyn(boprocyn);
dm.setAcpnpathcd(acpnpathcd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setCns_empnm(cns_empnm);
dm.setProcpers(procpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jul 11 15:36:57 KST 2008 */