/***************************************************************************************************
* 파일명 : SP_PS_L_BILL_NONRCPM.java
* 수금-비정상입금 조회화면
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
 * 수금-비정상입금 조회화면   
 * 
 */

  

public class PS_L_BILL_NONRCPMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String acqdt_1;
	public String acqdt_2;
	public String rcpmrflyn;
	public long pageno;
	public long pagesize;

	public PS_L_BILL_NONRCPMDM(){}
	public PS_L_BILL_NONRCPMDM(String bocd, String acqdt_1, String acqdt_2, String rcpmrflyn, long pageno, long pagesize){
		this.bocd = bocd;
		this.acqdt_1 = acqdt_1;
		this.acqdt_2 = acqdt_2;
		this.rcpmrflyn = rcpmrflyn;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAcqdt_1(String acqdt_1){
		this.acqdt_1 = acqdt_1;
	}

	public void setAcqdt_2(String acqdt_2){
		this.acqdt_2 = acqdt_2;
	}

	public void setRcpmrflyn(String rcpmrflyn){
		this.rcpmrflyn = rcpmrflyn;
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

	public String getAcqdt_1(){
		return this.acqdt_1;
	}

	public String getAcqdt_2(){
		return this.acqdt_2;
	}

	public String getRcpmrflyn(){
		return this.rcpmrflyn;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_PS_L_BILL_NONRCPM( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		PS_L_BILL_NONRCPMDM dm = (PS_L_BILL_NONRCPMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.acqdt_1);
		cstmt.setString(5, dm.acqdt_2);
		cstmt.setString(6, dm.rcpmrflyn);
		cstmt.setLong(7, dm.pageno);
		cstmt.setLong(8, dm.pagesize);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ps.pbs.bill.ds.PS_L_BILL_NONRCPMDataSet();
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
String acqdt_1 = req.getParameter("acqdt_1");
if( acqdt_1 == null){
	System.out.println(this.toString+" : acqdt_1 is null" );
}else{
	System.out.println(this.toString+" : acqdt_1 is "+acqdt_1 );
}
String acqdt_2 = req.getParameter("acqdt_2");
if( acqdt_2 == null){
	System.out.println(this.toString+" : acqdt_2 is null" );
}else{
	System.out.println(this.toString+" : acqdt_2 is "+acqdt_2 );
}
String rcpmrflyn = req.getParameter("rcpmrflyn");
if( rcpmrflyn == null){
	System.out.println(this.toString+" : rcpmrflyn is null" );
}else{
	System.out.println(this.toString+" : rcpmrflyn is "+rcpmrflyn );
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
String acqdt_1 = Util.checkString(req.getParameter("acqdt_1"));
String acqdt_2 = Util.checkString(req.getParameter("acqdt_2"));
String rcpmrflyn = Util.checkString(req.getParameter("rcpmrflyn"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String acqdt_1 = Util.Uni2Ksc(Util.checkString(req.getParameter("acqdt_1")));
String acqdt_2 = Util.Uni2Ksc(Util.checkString(req.getParameter("acqdt_2")));
String rcpmrflyn = Util.Uni2Ksc(Util.checkString(req.getParameter("rcpmrflyn")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setAcqdt_1(acqdt_1);
dm.setAcqdt_2(acqdt_2);
dm.setRcpmrflyn(rcpmrflyn);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 29 17:51:13 KST 2004 */