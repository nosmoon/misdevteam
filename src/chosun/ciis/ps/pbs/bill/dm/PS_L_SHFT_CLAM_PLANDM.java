/***************************************************************************************************
* 파일명 : PS_L_SHFT_CLAM_PLAN.java
* 기능   : 자동이체청구예정목록
* 작성일자 : 2006-04-25
* 작성자 : 전현표
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 출판국 -자동이체청구예정목록
 *
 */

public class PS_L_SHFT_CLAM_PLANDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public long pageno;
	public long pagesize;
	public String sechcond;
	public String sechcont;
	public String rcpmmthd;
	public String clammthd;

	public PS_L_SHFT_CLAM_PLANDM(){}
	public PS_L_SHFT_CLAM_PLANDM(String cmpycd, String bocd, long pageno, long pagesize, String sechcond, String sechcont, String rcpmmthd, String clammthd){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.sechcond = sechcond;
		this.sechcont = sechcont;
		this.rcpmmthd = rcpmmthd;
		this.clammthd = clammthd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public void setSechcond(String sechcond){
		this.sechcond = sechcond;
	}

	public void setSechcont(String sechcont){
		this.sechcont = sechcont;
	}

	public void setRcpmmthd(String rcpmmthd){
		this.rcpmmthd = rcpmmthd;
	}

	public void setClammthd(String clammthd){
		this.clammthd = clammthd;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSechcond(){
		return this.sechcond;
	}

	public String getSechcont(){
		return this.sechcont;
	}

	public String getRcpmmthd(){
		return this.rcpmmthd;
	}

	public String getClammthd(){
		return this.clammthd;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_SHFT_CLAM_PLAN( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SHFT_CLAM_PLANDM dm = (PS_L_SHFT_CLAM_PLANDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setLong(5, dm.pageno);
		cstmt.setLong(6, dm.pagesize);
		cstmt.setString(7, dm.sechcond);
		cstmt.setString(8, dm.sechcont);
		cstmt.setString(9, dm.rcpmmthd);
		cstmt.setString(10, dm.clammthd);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, Types.INTEGER);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_L_SHFT_CLAM_PLANDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String cmpycd = req.getParameter("cmpycd");
if( cmpycd == null){
	System.out.println(this.toString+" : cmpycd is null" );
}else{
	System.out.println(this.toString+" : cmpycd is "+cmpycd );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
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
String sechcond = req.getParameter("sechcond");
if( sechcond == null){
	System.out.println(this.toString+" : sechcond is null" );
}else{
	System.out.println(this.toString+" : sechcond is "+sechcond );
}
String sechcont = req.getParameter("sechcont");
if( sechcont == null){
	System.out.println(this.toString+" : sechcont is null" );
}else{
	System.out.println(this.toString+" : sechcont is "+sechcont );
}
String rcpmmthd = req.getParameter("rcpmmthd");
if( rcpmmthd == null){
	System.out.println(this.toString+" : rcpmmthd is null" );
}else{
	System.out.println(this.toString+" : rcpmmthd is "+rcpmmthd );
}
String clammthd = req.getParameter("clammthd");
if( clammthd == null){
	System.out.println(this.toString+" : clammthd is null" );
}else{
	System.out.println(this.toString+" : clammthd is "+clammthd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String sechcond = Util.checkString(req.getParameter("sechcond"));
String sechcont = Util.checkString(req.getParameter("sechcont"));
String rcpmmthd = Util.checkString(req.getParameter("rcpmmthd"));
String clammthd = Util.checkString(req.getParameter("clammthd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String sechcond = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcond")));
String sechcont = Util.Uni2Ksc(Util.checkString(req.getParameter("sechcont")));
String rcpmmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmmthd")));
String clammthd = Util.Uni2Ksc(Util.checkString(req.getParameter("clammthd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setSechcond(sechcond);
dm.setSechcont(sechcont);
dm.setRcpmmthd(rcpmmthd);
dm.setClammthd(clammthd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 25 15:14:46 KST 2006 */