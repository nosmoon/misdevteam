/***************************************************************************************************
* 파일명 : .java
* 기능 : *판촉물코드검색(목록조회)
* 작성일자 : 2009-06-15
* 작성자 : 김세웅
***************************************************************************************************/


package chosun.ciis.ss.sal.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 * 판촉물코드검색(목록조회)
 */

public class SL_L_BNSITEMDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bns_itemcd;
	public String bns_itemnm;
	public long pageno;
	public long pagesize;

	public SL_L_BNSITEMDM(){}
	public SL_L_BNSITEMDM(String bns_itemcd, String bns_itemnm, long pageno, long pagesize){
		this.bns_itemcd = bns_itemcd;
		this.bns_itemnm = bns_itemnm;
		this.pageno = pageno;
		this.pagesize = pagesize;
	}

	public void setBns_itemcd(String bns_itemcd){
		this.bns_itemcd = bns_itemcd;
	}

	public void setBns_itemnm(String bns_itemnm){
		this.bns_itemnm = bns_itemnm;
	}

	public void setPageno(long pageno){
		this.pageno = pageno;
	}

	public void setPagesize(long pagesize){
		this.pagesize = pagesize;
	}

	public String getBns_itemcd(){
		return this.bns_itemcd;
	}

	public String getBns_itemnm(){
		return this.bns_itemnm;
	}

	public long getPageno(){
		return this.pageno;
	}

	public long getPagesize(){
		return this.pagesize;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_BNSITEM( ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_BNSITEMDM dm = (SL_L_BNSITEMDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bns_itemcd);
		cstmt.setString(4, dm.bns_itemnm);
		cstmt.setLong(5, dm.pageno);
		cstmt.setLong(6, dm.pagesize);
		cstmt.registerOutParameter(7, Types.INTEGER);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.common.ds.SL_L_BNSITEMDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bns_itemcd = req.getParameter("bns_itemcd");
if( bns_itemcd == null){
	System.out.println(this.toString+" : bns_itemcd is null" );
}else{
	System.out.println(this.toString+" : bns_itemcd is "+bns_itemcd );
}
String bns_itemnm = req.getParameter("bns_itemnm");
if( bns_itemnm == null){
	System.out.println(this.toString+" : bns_itemnm is null" );
}else{
	System.out.println(this.toString+" : bns_itemnm is "+bns_itemnm );
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

String bns_itemcd = Util.checkString(req.getParameter("bns_itemcd"));
String bns_itemnm = Util.checkString(req.getParameter("bns_itemnm"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bns_itemcd = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemcd")));
String bns_itemnm = Util.Uni2Ksc(Util.checkString(req.getParameter("bns_itemnm")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBns_itemcd(bns_itemcd);
dm.setBns_itemnm(bns_itemnm);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jun 15 16:06:04 KST 2009 */