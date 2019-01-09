/***************************************************************************************************
* 파일명 : SP_PS_L_RDR_ARBT.java
* 기능 :   독자-중재처리 조회화면
* 작성일자 : 2004-02-23
* 작성자 : 김건호 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :   
* 백업 :   
***************************************************************************************************/


package chosun.ciis.ps.pbs.reader.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.reader.ds.*;
import chosun.ciis.ps.pbs.reader.rec.*;

/**
 * 독자-중재처리 조회화면
 *
 */


public class PS_L_RDR_ARBTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String bocd;
	public String aprvproccd;
	public String arbtaplcdtfr;
	public String arbtaplcdtto;
	public long pageno;
	public long pagesize;

	public PS_L_RDR_ARBTDM(){}
	public PS_L_RDR_ARBTDM(String cmpycd, String bocd, String aprvproccd, String arbtaplcdtfr, String arbtaplcdtto, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.bocd = bocd;
		this.aprvproccd = aprvproccd;
		this.arbtaplcdtfr = arbtaplcdtfr;
		this.arbtaplcdtto = arbtaplcdtto;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAprvproccd(String aprvproccd){
		this.aprvproccd = aprvproccd;
	}

	public void setArbtaplcdtfr(String arbtaplcdtfr){
		this.arbtaplcdtfr = arbtaplcdtfr;
	}

	public void setArbtaplcdtto(String arbtaplcdtto){
		this.arbtaplcdtto = arbtaplcdtto;
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

	public String getAprvproccd(){
		return this.aprvproccd;
	}

	public String getArbtaplcdtfr(){
		return this.arbtaplcdtfr;
	}

	public String getArbtaplcdtto(){
		return this.arbtaplcdtto;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_RDR_ARBT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_RDR_ARBTDM dm = (PS_L_RDR_ARBTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.bocd);
		cstmt.setString(5, dm.aprvproccd);
		cstmt.setString(6, dm.arbtaplcdtfr);
		cstmt.setString(7, dm.arbtaplcdtto);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.reader.ds.PS_L_RDR_ARBTDataSet();
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
String aprvproccd = req.getParameter("aprvproccd");
if( aprvproccd == null){
	System.out.println(this.toString+" : aprvproccd is null" );
}else{
	System.out.println(this.toString+" : aprvproccd is "+aprvproccd );
}
String arbtaplcdtfr = req.getParameter("arbtaplcdtfr");
if( arbtaplcdtfr == null){
	System.out.println(this.toString+" : arbtaplcdtfr is null" );
}else{
	System.out.println(this.toString+" : arbtaplcdtfr is "+arbtaplcdtfr );
}
String arbtaplcdtto = req.getParameter("arbtaplcdtto");
if( arbtaplcdtto == null){
	System.out.println(this.toString+" : arbtaplcdtto is null" );
}else{
	System.out.println(this.toString+" : arbtaplcdtto is "+arbtaplcdtto );
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
String aprvproccd = Util.checkString(req.getParameter("aprvproccd"));
String arbtaplcdtfr = Util.checkString(req.getParameter("arbtaplcdtfr"));
String arbtaplcdtto = Util.checkString(req.getParameter("arbtaplcdtto"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String aprvproccd = Util.Uni2Ksc(Util.checkString(req.getParameter("aprvproccd")));
String arbtaplcdtfr = Util.Uni2Ksc(Util.checkString(req.getParameter("arbtaplcdtfr")));
String arbtaplcdtto = Util.Uni2Ksc(Util.checkString(req.getParameter("arbtaplcdtto")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setBocd(bocd);
dm.setAprvproccd(aprvproccd);
dm.setArbtaplcdtfr(arbtaplcdtfr);
dm.setArbtaplcdtto(arbtaplcdtto);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 26 20:06:06 KST 2004 */