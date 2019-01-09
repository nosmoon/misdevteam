/***************************************************************************************************
* 파일명 : SP_PS_L_BILL_TACOD_GRRCPCM.java
* 수금-일괄입금 상세조회화면
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
 * 수금-일괄입금 상세조회화면   
 * 
 */

   

public class PS_L_BILL_TACOD_GRRCPCMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String acqdt;
	public String acqno;
	public String girono;
	public long pageno;
	public long pagesize;

	public PS_L_BILL_TACOD_GRRCPCMDM(){}
	public PS_L_BILL_TACOD_GRRCPCMDM(String bocd, String acqdt, String acqno, String girono, long pageno, long pagesize){
		this.bocd = bocd;
		this.acqdt = acqdt;
		this.acqno = acqno;
		this.girono = girono;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAcqdt(String acqdt){
		this.acqdt = acqdt;
	}

	public void setAcqno(String acqno){
		this.acqno = acqno;
	}

	public void setGirono(String girono){
		this.girono = girono;
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

	public String getAcqdt(){
		return this.acqdt;
	}

	public String getAcqno(){
		return this.acqno;
	}

	public String getGirono(){
		return this.girono;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_BILL_TACOD_GRRCPCM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_BILL_TACOD_GRRCPCMDM dm = (PS_L_BILL_TACOD_GRRCPCMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.acqdt);
		cstmt.setString(5, dm.acqno);
		cstmt.setString(6, dm.girono);
		cstmt.setLong(7, dm.pageno);
		cstmt.setLong(8, dm.pagesize);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_L_BILL_TACOD_GRRCPCMDataSet();
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
String acqdt = req.getParameter("acqdt");
if( acqdt == null){
	System.out.println(this.toString+" : acqdt is null" );
}else{
	System.out.println(this.toString+" : acqdt is "+acqdt );
}
String acqno = req.getParameter("acqno");
if( acqno == null){
	System.out.println(this.toString+" : acqno is null" );
}else{
	System.out.println(this.toString+" : acqno is "+acqno );
}
String girono = req.getParameter("girono");
if( girono == null){
	System.out.println(this.toString+" : girono is null" );
}else{
	System.out.println(this.toString+" : girono is "+girono );
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
String acqdt = Util.checkString(req.getParameter("acqdt"));
String acqno = Util.checkString(req.getParameter("acqno"));
String girono = Util.checkString(req.getParameter("girono"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String acqdt = Util.Uni2Ksc(Util.checkString(req.getParameter("acqdt")));
String acqno = Util.Uni2Ksc(Util.checkString(req.getParameter("acqno")));
String girono = Util.Uni2Ksc(Util.checkString(req.getParameter("girono")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setAcqdt(acqdt);
dm.setAcqno(acqno);
dm.setGirono(girono);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 31 18:01:32 KST 2004 */