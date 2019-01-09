/***************************************************************************************************
* 파일명   : SP_PS_L_PBLMCLAMT.java
* 기능     : 독자-수금입력목록 조회화면
* 작성일자 : 2008-07-16
* 작성자   : 김재일
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-수금입력목록 조회화면
 *
 */

public class PS_L_PBLMCLAMTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String procdt_to;
	public String procdt_fr;
	public String medicd;
	public String recpmthd;
	public long pageno;
	public long pagesize;

	public PS_L_PBLMCLAMTDM(){}
	public PS_L_PBLMCLAMTDM(String cmpycd, String bocd, String procdt_to, String procdt_fr, String medicd, String recpmthd, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.procdt_to = procdt_to;
		this.procdt_fr = procdt_fr;
		this.medicd = medicd;
		this.recpmthd = recpmthd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setProcdt_to(String procdt_to){
		this.procdt_to = procdt_to;
	}

	public void setProcdt_fr(String procdt_fr){
		this.procdt_fr = procdt_fr;
	}

	public void setMedicd(String medicd){
		this.medicd = medicd;
	}

	public void setRecpmthd(String recpmthd){
		this.recpmthd = recpmthd;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getCmpycd(){
		return this.cmpycd;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getProcdt_to(){
		return this.procdt_to;
	}

	public String getProcdt_fr(){
		return this.procdt_fr;
	}

	public String getMedicd(){
		return this.medicd;
	}

	public String getRecpmthd(){
		return this.recpmthd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_PBLMCLAMT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_PBLMCLAMTDM dm = (PS_L_PBLMCLAMTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.procdt_to);
		cstmt.setString(6, dm.procdt_fr);
		cstmt.setString(7, dm.medicd);
		cstmt.setString(8, dm.recpmthd);
		cstmt.setLong(9, dm.pageno);
		cstmt.setLong(10, dm.pagesize);
		cstmt.registerOutParameter(11, Types.INTEGER);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_L_PBLMCLAMTDataSet();
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
String procdt_to = req.getParameter("procdt_to");
if( procdt_to == null){
	System.out.println(this.toString+" : procdt_to is null" );
}else{
	System.out.println(this.toString+" : procdt_to is "+procdt_to );
}
String procdt_fr = req.getParameter("procdt_fr");
if( procdt_fr == null){
	System.out.println(this.toString+" : procdt_fr is null" );
}else{
	System.out.println(this.toString+" : procdt_fr is "+procdt_fr );
}
String medicd = req.getParameter("medicd");
if( medicd == null){
	System.out.println(this.toString+" : medicd is null" );
}else{
	System.out.println(this.toString+" : medicd is "+medicd );
}
String recpmthd = req.getParameter("recpmthd");
if( recpmthd == null){
	System.out.println(this.toString+" : recpmthd is null" );
}else{
	System.out.println(this.toString+" : recpmthd is "+recpmthd );
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

String cmpycd = Util.checkString(req.getParameter("cmpycd"));
String bocd = Util.checkString(req.getParameter("bocd"));
String procdt_to = Util.checkString(req.getParameter("procdt_to"));
String procdt_fr = Util.checkString(req.getParameter("procdt_fr"));
String medicd = Util.checkString(req.getParameter("medicd"));
String recpmthd = Util.checkString(req.getParameter("recpmthd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String procdt_to = Util.Uni2Ksc(Util.checkString(req.getParameter("procdt_to")));
String procdt_fr = Util.Uni2Ksc(Util.checkString(req.getParameter("procdt_fr")));
String medicd = Util.Uni2Ksc(Util.checkString(req.getParameter("medicd")));
String recpmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("recpmthd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setProcdt_to(procdt_to);
dm.setProcdt_fr(procdt_fr);
dm.setMedicd(medicd);
dm.setRecpmthd(recpmthd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 16 15:57:30 KST 2008 */