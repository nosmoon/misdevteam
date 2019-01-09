/***************************************************************************************************
* 파일명 : SP_PS_L_SEND_RETN.java
* 발송-반송관리 조회화면
* 작성일자 : 2004-03-19
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.send.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.send.ds.*;
import chosun.ciis.ps.pbs.send.rec.*;

/**
 * 발송-반송관리 조회화면
 *
 */

public class PS_L_SEND_RETNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String cmpycd;
	public String retndt_fr;
	public String retndt_to;
	public String retnclsf;
	public String boprocyn;
	public String acqnm;
	public long pageno;
	public long pagesize;

	public PS_L_SEND_RETNDM(){}
	public PS_L_SEND_RETNDM(String bocd, String cmpycd, String retndt_fr, String retndt_to, String retnclsf, String boprocyn, String acqnm, long pageno, long pagesize){
		this.bocd = bocd;
		this.cmpycd = cmpycd;
		this.retndt_fr = retndt_fr;
		this.retndt_to = retndt_to;
		this.retnclsf = retnclsf;
		this.boprocyn = boprocyn;
		this.acqnm = acqnm;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setRetndt_fr(String retndt_fr){
		this.retndt_fr = retndt_fr;
	}

	public void setRetndt_to(String retndt_to){
		this.retndt_to = retndt_to;
	}

	public void setRetnclsf(String retnclsf){
		this.retnclsf = retnclsf;
	}

	public void setBoprocyn(String boprocyn){
		this.boprocyn = boprocyn;
	}

	public void setAcqnm(String acqnm){
		this.acqnm = acqnm;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getRetndt_fr(){
		return this.retndt_fr;
	}

	public String getRetndt_to(){
		return this.retndt_to;
	}

	public String getRetnclsf(){
		return this.retnclsf;
	}

	public String getBoprocyn(){
		return this.boprocyn;
	}

	public String getAcqnm(){
		return this.acqnm;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_SEND_RETN( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SEND_RETNDM dm = (PS_L_SEND_RETNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.retndt_fr);
		cstmt.setString(6, dm.retndt_to);
		cstmt.setString(7, dm.retnclsf);
		cstmt.setString(8, dm.boprocyn);
		cstmt.setString(9, dm.acqnm);
		cstmt.setLong(10, dm.pageno);
		cstmt.setLong(11, dm.pagesize);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_SEND_RETNDataSet();
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
String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String retndt_fr = req.getParameter("retndt_fr");
if( retndt_fr == null){
	System.out.println(this.toString+" : retndt_fr is null" );
}else{
	System.out.println(this.toString+" : retndt_fr is "+retndt_fr );
}
String retndt_to = req.getParameter("retndt_to");
if( retndt_to == null){
	System.out.println(this.toString+" : retndt_to is null" );
}else{
	System.out.println(this.toString+" : retndt_to is "+retndt_to );
}
String retnclsf = req.getParameter("retnclsf");
if( retnclsf == null){
	System.out.println(this.toString+" : retnclsf is null" );
}else{
	System.out.println(this.toString+" : retnclsf is "+retnclsf );
}
String boprocyn = req.getParameter("boprocyn");
if( boprocyn == null){
	System.out.println(this.toString+" : boprocyn is null" );
}else{
	System.out.println(this.toString+" : boprocyn is "+boprocyn );
}
String acqnm = req.getParameter("acqnm");
if( acqnm == null){
	System.out.println(this.toString+" : acqnm is null" );
}else{
	System.out.println(this.toString+" : acqnm is "+acqnm );
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
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String retndt_fr = Util.checkString(req.getParameter("retndt_fr"));
String retndt_to = Util.checkString(req.getParameter("retndt_to"));
String retnclsf = Util.checkString(req.getParameter("retnclsf"));
String boprocyn = Util.checkString(req.getParameter("boprocyn"));
String acqnm = Util.checkString(req.getParameter("acqnm"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String retndt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("retndt_fr")));
String retndt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("retndt_to")));
String retnclsf = Util.Uni2Ksc(Util.checkString(req.getParameter("retnclsf")));
String boprocyn = Util.Uni2Ksc(Util.checkString(req.getParameter("boprocyn")));
String acqnm = Util.Uni2Ksc(Util.checkString(req.getParameter("acqnm")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setCmpycd(cmpycd);
dm.setRetndt_fr(retndt_fr);
dm.setRetndt_to(retndt_to);
dm.setRetnclsf(retnclsf);
dm.setBoprocyn(boprocyn);
dm.setAcqnm(acqnm);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 18 16:58:09 KST 2008 */