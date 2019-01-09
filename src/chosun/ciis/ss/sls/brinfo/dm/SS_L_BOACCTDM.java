/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
 * 
 */


public class SS_L_BOACCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String deptlist;
	public String partlist;
	public String arealist;
	public String bocd;
	public String acctitem;
	public long pageno;
	public long pagesize;

	public SS_L_BOACCTDM(){}
	public SS_L_BOACCTDM(String deptlist, String partlist, String arealist, String bocd, String acctitem, long pageno, long pagesize){
		this.deptlist = deptlist;
		this.partlist = partlist;
		this.arealist = arealist;
		this.bocd = bocd;
		this.acctitem = acctitem;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setDeptlist(String deptlist){
		this.deptlist = deptlist;
	}

	public void setPartlist(String partlist){
		this.partlist = partlist;
	}

	public void setArealist(String arealist){
		this.arealist = arealist;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setAcctitem(String acctitem){
		this.acctitem = acctitem;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getDeptlist(){
		return this.deptlist;
	}

	public String getPartlist(){
		return this.partlist;
	}

	public String getArealist(){
		return this.arealist;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getAcctitem(){
		return this.acctitem;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_BOACCT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_BOACCTDM dm = (SS_L_BOACCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.deptlist);
		cstmt.setString(4, dm.partlist);
		cstmt.setString(5, dm.arealist);
		cstmt.setString(6, dm.bocd);
		cstmt.setString(7, dm.acctitem);
		cstmt.setLong(8, dm.pageno);
		cstmt.setLong(9, dm.pagesize);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, Types.INTEGER);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_L_BOACCTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String deptlist = req.getParameter("deptlist");
if( deptlist == null){
	System.out.println(this.toString+" : deptlist is null" );
}else{
	System.out.println(this.toString+" : deptlist is "+deptlist );
}
String partlist = req.getParameter("partlist");
if( partlist == null){
	System.out.println(this.toString+" : partlist is null" );
}else{
	System.out.println(this.toString+" : partlist is "+partlist );
}
String arealist = req.getParameter("arealist");
if( arealist == null){
	System.out.println(this.toString+" : arealist is null" );
}else{
	System.out.println(this.toString+" : arealist is "+arealist );
}
String bocd = req.getParameter("bocd");
if( bocd == null){
	System.out.println(this.toString+" : bocd is null" );
}else{
	System.out.println(this.toString+" : bocd is "+bocd );
}
String acctitem = req.getParameter("acctitem");
if( acctitem == null){
	System.out.println(this.toString+" : acctitem is null" );
}else{
	System.out.println(this.toString+" : acctitem is "+acctitem );
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

String deptlist = Util.checkString(req.getParameter("deptlist"));
String partlist = Util.checkString(req.getParameter("partlist"));
String arealist = Util.checkString(req.getParameter("arealist"));
String bocd = Util.checkString(req.getParameter("bocd"));
String acctitem = Util.checkString(req.getParameter("acctitem"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String deptlist = Util.Uni2Ksc(Util.checkString(req.getParameter("deptlist")));
String partlist = Util.Uni2Ksc(Util.checkString(req.getParameter("partlist")));
String arealist = Util.Uni2Ksc(Util.checkString(req.getParameter("arealist")));
String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String acctitem = Util.Uni2Ksc(Util.checkString(req.getParameter("acctitem")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setDeptlist(deptlist);
dm.setPartlist(partlist);
dm.setArealist(arealist);
dm.setBocd(bocd);
dm.setAcctitem(acctitem);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Feb 12 17:17:01 KST 2009 */