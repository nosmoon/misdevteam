/***************************************************************************************************
* 파일명 : SL_MO_L_COMM_APT_THRWDM.java
* 기능 :  해당지국의아파트 주소목록을 조회_모바일용
* 작성일자 : 2017-01-13
* 작성자 : 장 선 희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 아파트코드레코드에 동리스트 추가
* 수정자 : 장선희
* 수정일자 : 2017-01-16
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
 *
 */


public class SL_MO_L_COMM_APT_THRWDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public long pageno;
	public long pagesize;
	public String invsgdt1;
	public String invsgdt2;
	public String addrcd;

	public SL_MO_L_COMM_APT_THRWDM(){}
	public SL_MO_L_COMM_APT_THRWDM(String bocd, long pageno, long pagesize, String invsgdt1, String invsgdt2, String addrcd){
		this.bocd = bocd;
		this.pageno = pageno;
		this.pagesize = pagesize;
		this.invsgdt1 = invsgdt1;
		this.invsgdt2 = invsgdt2;
		this.addrcd = addrcd;
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

	public void setInvsgdt1(String invsgdt1){
		this.invsgdt1 = invsgdt1;
	}

	public void setInvsgdt2(String invsgdt2){
		this.invsgdt2 = invsgdt2;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
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

	public String getInvsgdt1(){
		return this.invsgdt1;
	}

	public String getInvsgdt2(){
		return this.invsgdt2;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getSQL(){
		 return "{ call SP_SL_MO_L_COMM_APT_THRW( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_MO_L_COMM_APT_THRWDM dm = (SL_MO_L_COMM_APT_THRWDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setLong(4, dm.pageno);
		cstmt.setLong(5, dm.pagesize);
		cstmt.setString(6, dm.invsgdt1);
		cstmt.setString(7, dm.invsgdt2);
		cstmt.setString(8, dm.addrcd);
		cstmt.registerOutParameter(9, Types.INTEGER);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SL_MO_L_COMM_APT_THRWDataSet();
	}



    public void print(){
        System.out.println("bocd = " + getBocd());
        System.out.println("pageno = " + getPageno());
        System.out.println("pagesize = " + getPagesize());
        System.out.println("invsgdt1 = " + getInvsgdt1());
        System.out.println("invsgdt2 = " + getInvsgdt2());
        System.out.println("addrcd = " + getAddrcd());
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
String invsgdt1 = req.getParameter("invsgdt1");
if( invsgdt1 == null){
	System.out.println(this.toString+" : invsgdt1 is null" );
}else{
	System.out.println(this.toString+" : invsgdt1 is "+invsgdt1 );
}
String invsgdt2 = req.getParameter("invsgdt2");
if( invsgdt2 == null){
	System.out.println(this.toString+" : invsgdt2 is null" );
}else{
	System.out.println(this.toString+" : invsgdt2 is "+invsgdt2 );
}
String addrcd = req.getParameter("addrcd");
if( addrcd == null){
	System.out.println(this.toString+" : addrcd is null" );
}else{
	System.out.println(this.toString+" : addrcd is "+addrcd );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String pageno = Util.checkString(req.getParameter("pageno"));
String pagesize = Util.checkString(req.getParameter("pagesize"));
String invsgdt1 = Util.checkString(req.getParameter("invsgdt1"));
String invsgdt2 = Util.checkString(req.getParameter("invsgdt2"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String pageno = Util.Uni2Ksc(Util.checkString(req.getParameter("pageno")));
String pagesize = Util.Uni2Ksc(Util.checkString(req.getParameter("pagesize")));
String invsgdt1 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt1")));
String invsgdt2 = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt2")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setPageno(pageno);
dm.setPagesize(pagesize);
dm.setInvsgdt1(invsgdt1);
dm.setInvsgdt2(invsgdt2);
dm.setAddrcd(addrcd);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Jan 16 15:25:08 KST 2017 */