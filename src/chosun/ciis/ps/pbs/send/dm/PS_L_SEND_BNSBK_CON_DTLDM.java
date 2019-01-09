/***************************************************************************************************
* 파일명 : SP_PS_L_SEND_BNSBK_CON_DTL.java
* 기능 :   발송-보너스북발송 발송처리 상세내역 조회화면 
* 작성일자 : 2004-02-28
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
 * 발송-보너스북발송  발송처리 상세내역 조회화면 
 *
 */ 

 

public class PS_L_SEND_BNSBK_CON_DTLDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String cmpycd;
	public String incmgpers;
	public String senddt;
	public String asinbocd;
	public String sendmthd;
	public long pageno;
	public long pagesize;

	public PS_L_SEND_BNSBK_CON_DTLDM(){}
	public PS_L_SEND_BNSBK_CON_DTLDM(String cmpycd, String incmgpers, String senddt, String asinbocd, String sendmthd, long pageno, long pagesize){
		this.cmpycd = cmpycd;
		this.incmgpers = incmgpers;
		this.senddt = senddt;
		this.asinbocd = asinbocd;
		this.sendmthd = sendmthd;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setCmpycd(String cmpycd){
		this.cmpycd = cmpycd;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public void setSenddt(String senddt){
		this.senddt = senddt;
	}

	public void setAsinbocd(String asinbocd){
		this.asinbocd = asinbocd;
	}

	public void setSendmthd(String sendmthd){
		this.sendmthd = sendmthd;
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

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSenddt(){
		return this.senddt;
	}

	public String getAsinbocd(){
		return this.asinbocd;
	}

	public String getSendmthd(){
		return this.sendmthd;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_SEND_BNSBK_CON_DTL( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_SEND_BNSBK_CON_DTLDM dm = (PS_L_SEND_BNSBK_CON_DTLDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.cmpycd);
		cstmt.setString(4, dm.incmgpers);
		cstmt.setString(5, dm.senddt);
		cstmt.setString(6, dm.asinbocd);
		cstmt.setString(7, dm.sendmthd);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, Types.INTEGER);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.send.ds.PS_L_SEND_BNSBK_CON_DTLDataSet();
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
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
String senddt = req.getParameter("senddt");
if( senddt == null){
	System.out.println(this.toString+" : senddt is null" );
}else{
	System.out.println(this.toString+" : senddt is "+senddt );
}
String asinbocd = req.getParameter("asinbocd");
if( asinbocd == null){
	System.out.println(this.toString+" : asinbocd is null" );
}else{
	System.out.println(this.toString+" : asinbocd is "+asinbocd );
}
String sendmthd = req.getParameter("sendmthd");
if( sendmthd == null){
	System.out.println(this.toString+" : sendmthd is null" );
}else{
	System.out.println(this.toString+" : sendmthd is "+sendmthd );
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
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
String senddt = Util.checkString(req.getParameter("senddt"));
String asinbocd = Util.checkString(req.getParameter("asinbocd"));
String sendmthd = Util.checkString(req.getParameter("sendmthd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String cmpycd = Util.Uni2Ksc(Util.checkString(req.getParameter("cmpycd")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
String senddt = Util.Uni2Ksc(Util.checkString(req.getParameter("senddt")));
String asinbocd = Util.Uni2Ksc(Util.checkString(req.getParameter("asinbocd")));
String sendmthd = Util.Uni2Ksc(Util.checkString(req.getParameter("sendmthd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setCmpycd(cmpycd);
dm.setIncmgpers(incmgpers);
dm.setSenddt(senddt);
dm.setAsinbocd(asinbocd);
dm.setSendmthd(sendmthd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Mar 04 16:39:49 KST 2004 */