/***************************************************************************************************
 * 파일명   : PS_L_BILL_EXCSRCPMPROCDM.java
 * 기능     : 수금-초과입금처리 검색
 * 작성일자 : 2004-04-06
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.bill.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 수금-초과입금처리 검색
 */

public class PS_L_BILL_EXCSRCPMPROCDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String subsyy;
	public String procyn;
	public String procdtbgn;
	public String procdtend;
	public long pageno;
	public long pagesize;

	public PS_L_BILL_EXCSRCPMPROCDM(){}
	public PS_L_BILL_EXCSRCPMPROCDM(String bocd, String subsyy, String procyn, String procdtbgn, String procdtend, long pageno, long pagesize){
		this.bocd = bocd;
		this.subsyy = subsyy;
		this.procyn = procyn;
		this.procdtbgn = procdtbgn;
		this.procdtend = procdtend;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setSubsyy(String subsyy){
		this.subsyy = subsyy;
	}

	public void setProcyn(String procyn){
		this.procyn = procyn;
	}

	public void setProcdtbgn(String procdtbgn){
		this.procdtbgn = procdtbgn;
	}

	public void setProcdtend(String procdtend){
		this.procdtend = procdtend;
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

	public String getSubsyy(){
		return this.subsyy;
	}

	public String getProcyn(){
		return this.procyn;
	}

	public String getProcdtbgn(){
		return this.procdtbgn;
	}

	public String getProcdtend(){
		return this.procdtend;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_BILL_EXCSRCPMPROC( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_BILL_EXCSRCPMPROCDM dm = (PS_L_BILL_EXCSRCPMPROCDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.subsyy);
		cstmt.setString(5, dm.procyn);
		cstmt.setString(6, dm.procdtbgn);
		cstmt.setString(7, dm.procdtend);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_L_BILL_EXCSRCPMPROCDataSet();
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
String subsyy = req.getParameter("subsyy");
if( subsyy == null){
	System.out.println(this.toString+" : subsyy is null" );
}else{
	System.out.println(this.toString+" : subsyy is "+subsyy );
}
String procyn = req.getParameter("procyn");
if( procyn == null){
	System.out.println(this.toString+" : procyn is null" );
}else{
	System.out.println(this.toString+" : procyn is "+procyn );
}
String procdtbgn = req.getParameter("procdtbgn");
if( procdtbgn == null){
	System.out.println(this.toString+" : procdtbgn is null" );
}else{
	System.out.println(this.toString+" : procdtbgn is "+procdtbgn );
}
String procdtend = req.getParameter("procdtend");
if( procdtend == null){
	System.out.println(this.toString+" : procdtend is null" );
}else{
	System.out.println(this.toString+" : procdtend is "+procdtend );
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
String subsyy = Util.checkString(req.getParameter("subsyy"));
String procyn = Util.checkString(req.getParameter("procyn"));
String procdtbgn = Util.checkString(req.getParameter("procdtbgn"));
String procdtend = Util.checkString(req.getParameter("procdtend"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String subsyy = Util.Uni2Ksc(Util.checkString(req.getParameter("subsyy")));
String procyn = Util.Uni2Ksc(Util.checkString(req.getParameter("procyn")));
String procdtbgn = Util.Uni2Ksc(Util.checkString(req.getParameter("procdtbgn")));
String procdtend = Util.Uni2Ksc(Util.checkString(req.getParameter("procdtend")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setSubsyy(subsyy);
dm.setProcyn(procyn);
dm.setProcdtbgn(procdtbgn);
dm.setProcdtend(procdtend);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 07 16:42:18 KST 2004 */