/***************************************************************************************************
* 파일명 : SP_PS_L_BILL_SEPR.java
* 수금-개별입금 조회화면
* 작성일자 : 2004-03-29
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 : 
* 수정일자 :     
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.bill.dm ;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.ds.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/** 
 * 수금-개별입금 조회화면   
 * 
 */

  

public class PS_L_BILL_SEPRDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String cmpycd;
	public String proc_dd_1;
	public String proc_dd_2;
	public String rcpm_mthd;
	public long pageno;
	public long pagesize;

	public PS_L_BILL_SEPRDM(){}
	public PS_L_BILL_SEPRDM(String bocd, String cmpycd, String proc_dd_1, String proc_dd_2, String rcpm_mthd, long pageno, long pagesize){
		this.bocd = bocd;
		this.cmpycd = cmpycd;
		this.proc_dd_1 = proc_dd_1;
		this.proc_dd_2 = proc_dd_2;
		this.rcpm_mthd = rcpm_mthd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setProc_dd_1(String proc_dd_1){
		this.proc_dd_1 = proc_dd_1;
	}

	public void setProc_dd_2(String proc_dd_2){
		this.proc_dd_2 = proc_dd_2;
	}

	public void setRcpm_mthd(String rcpm_mthd){
		this.rcpm_mthd = rcpm_mthd;
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

	public String getProc_dd_1(){
		return this.proc_dd_1;
	}

	public String getProc_dd_2(){
		return this.proc_dd_2;
	}

	public String getRcpm_mthd(){
		return this.rcpm_mthd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_BILL_SEPR( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_BILL_SEPRDM dm = (PS_L_BILL_SEPRDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.cmpycd);
		cstmt.setString(5, dm.proc_dd_1);
		cstmt.setString(6, dm.proc_dd_2);
		cstmt.setString(7, dm.rcpm_mthd);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_L_BILL_SEPRDataSet();
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
String proc_dd_1 = req.getParameter("proc_dd_1");
if( proc_dd_1 == null){
	System.out.println(this.toString+" : proc_dd_1 is null" );
}else{
	System.out.println(this.toString+" : proc_dd_1 is "+proc_dd_1 );
}
String proc_dd_2 = req.getParameter("proc_dd_2");
if( proc_dd_2 == null){
	System.out.println(this.toString+" : proc_dd_2 is null" );
}else{
	System.out.println(this.toString+" : proc_dd_2 is "+proc_dd_2 );
}
String rcpm_mthd = req.getParameter("rcpm_mthd");
if( rcpm_mthd == null){
	System.out.println(this.toString+" : rcpm_mthd is null" );
}else{
	System.out.println(this.toString+" : rcpm_mthd is "+rcpm_mthd );
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
String proc_dd_1 = Util.checkString(req.getParameter("proc_dd_1"));
String proc_dd_2 = Util.checkString(req.getParameter("proc_dd_2"));
String rcpm_mthd = Util.checkString(req.getParameter("rcpm_mthd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String proc_dd_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dd_1")));
String proc_dd_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("proc_dd_2")));
String rcpm_mthd = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpm_mthd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setCmpycd(cmpycd);
dm.setProc_dd_1(proc_dd_1);
dm.setProc_dd_2(proc_dd_2);
dm.setRcpm_mthd(rcpm_mthd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 31 10:55:44 KST 2004 */