/***************************************************************************************************
* 파일명 : PS_L_CASHRCPT.java
* 기능   : 불편관리 - 현금영수증 신청리스트
* 작성일자 : 2005-12-19
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ps.pbs.support.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.support.ds.*;
import chosun.ciis.ps.pbs.support.rec.*;

/**
 * 불편관리 - 현금영수증 신청리스트
 *
 */

public class PS_L_CASHRCPTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String incmgpers;
	public String bocd;
	public String cashrcpt_dtbgn;
	public String cashrcpt_dtend;
	public String selpubclsf;
	public long pageno;
	public long pagesize;
	public String medicd;
	public String cmpycd;
	public String rcptclsf;

	public PS_L_CASHRCPTDM(){}
	public PS_L_CASHRCPTDM(String incmgpers, String bocd, String cashrcpt_dtbgn, String cashrcpt_dtend, String selpubclsf, long pageno, long pagesize, String medicd, String cmpycd, String rcptclsf){
		this.incmgpers = incmgpers;
		this.bocd = bocd;
		this.cashrcpt_dtbgn = cashrcpt_dtbgn;
		this.cashrcpt_dtend = cashrcpt_dtend;
		this.selpubclsf = selpubclsf;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.medicd = medicd;
		this.cmpycd = cmpycd;
		this.rcptclsf = rcptclsf;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setCashrcpt_dtbgn(String cashrcpt_dtbgn){
		this.cashrcpt_dtbgn = cashrcpt_dtbgn;
	}

	public void setCashrcpt_dtend(String cashrcpt_dtend){
		this.cashrcpt_dtend = cashrcpt_dtend;
	}

	public void setSelpubclsf(String selpubclsf){
		this.selpubclsf = selpubclsf;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setRcptclsf(String rcptclsf){
		this.rcptclsf = rcptclsf;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getCashrcpt_dtbgn(){
		return this.cashrcpt_dtbgn;
	}

	public String getCashrcpt_dtend(){
		return this.cashrcpt_dtend;
	}

	public String getSelpubclsf(){
		return this.selpubclsf;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getRcptclsf(){
		return this.rcptclsf;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_CASHRCPT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_CASHRCPTDM dm = (PS_L_CASHRCPTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.incmgpers);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.cashrcpt_dtbgn);
		cstmt.setString(6, dm.cashrcpt_dtend);
		cstmt.setString(7, dm.selpubclsf);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.setString(10, dm.medicd);
		cstmt.setString(11, dm.cmpycd);
		cstmt.setString(12, dm.rcptclsf);
		cstmt.registerOutParameter(13, Types.INTEGER);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.support.ds.PS_L_CASHRCPTDataSet();
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
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String cashrcpt_dtbgn = req.getParameter("cashrcpt_dtbgn");
if( cashrcpt_dtbgn == null){
	System.out.println(this.toString+" : cashrcpt_dtbgn is null" );
}else{
	System.out.println(this.toString+" : cashrcpt_dtbgn is "+cashrcpt_dtbgn );
}
String cashrcpt_dtend = req.getParameter("cashrcpt_dtend");
if( cashrcpt_dtend == null){
	System.out.println(this.toString+" : cashrcpt_dtend is null" );
}else{
	System.out.println(this.toString+" : cashrcpt_dtend is "+cashrcpt_dtend );
}
String selpubclsf = req.getParameter("selpubclsf");
if( selpubclsf == null){
	System.out.println(this.toString+" : selpubclsf is null" );
}else{
	System.out.println(this.toString+" : selpubclsf is "+selpubclsf );
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
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String rcptclsf = req.getParameter("rcptclsf");
if( rcptclsf == null){
	System.out.println(this.toString+" : rcptclsf is null" );
}else{
	System.out.println(this.toString+" : rcptclsf is "+rcptclsf );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String bocd = Util.checkString(req.getParameter("bocd"));
String cashrcpt_dtbgn = Util.checkString(req.getParameter("cashrcpt_dtbgn"));
String cashrcpt_dtend = Util.checkString(req.getParameter("cashrcpt_dtend"));
String selpubclsf = Util.checkString(req.getParameter("selpubclsf"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String medicd = Util.checkString(req.getParameter("medicd"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String rcptclsf = Util.checkString(req.getParameter("rcptclsf"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String cashrcpt_dtbgn = Util.Uni2Ksc(Util.checkString(req.getParameter("cashrcpt_dtbgn")));
String cashrcpt_dtend = Util.Uni2Ksc(Util.checkString(req.getParameter("cashrcpt_dtend")));
String selpubclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("selpubclsf")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String rcptclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("rcptclsf")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setIncmgpers(incmgpers);
dm.setBocd(bocd);
dm.setCashrcpt_dtbgn(cashrcpt_dtbgn);
dm.setCashrcpt_dtend(cashrcpt_dtend);
dm.setSelpubclsf(selpubclsf);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setMedicd(medicd);
dm.setCmpycd(cmpycd);
dm.setRcptclsf(rcptclsf);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Dec 23 15:42:59 KST 2005 */