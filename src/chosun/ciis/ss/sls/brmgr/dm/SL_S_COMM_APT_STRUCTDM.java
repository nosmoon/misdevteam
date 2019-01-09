/***************************************************************************************************
 * 파일명   : SP_SL_S_COMM_APT_STRUCT.java
 * 기능     : 투입율조사
 * 작성일자 : 2006/03/08
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.ds.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  투입율조사-현황등록
**/

public class SL_S_COMM_APT_STRUCTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String invsgdt;
	public String invsgno;
	public String addrcd;
	public String dongno;

	public SL_S_COMM_APT_STRUCTDM(){}
	public SL_S_COMM_APT_STRUCTDM(String bocd, String invsgdt, String invsgno, String addrcd, String dongno){
		this.bocd = bocd;
		this.invsgdt = invsgdt;
		this.invsgno = invsgno;
		this.addrcd = addrcd;
		this.dongno = dongno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setInvsgdt(String invsgdt){
		this.invsgdt = invsgdt;
	}

	public void setInvsgno(String invsgno){
		this.invsgno = invsgno;
	}

	public void setAddrcd(String addrcd){
		this.addrcd = addrcd;
	}

	public void setDongno(String dongno){
		this.dongno = dongno;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getInvsgdt(){
		return this.invsgdt;
	}

	public String getInvsgno(){
		return this.invsgno;
	}

	public String getAddrcd(){
		return this.addrcd;
	}

	public String getDongno(){
		return this.dongno;
	}

	public String getSQL(){
		 return "{ call SP_SL_S_COMM_APT_STRUCT( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_S_COMM_APT_STRUCTDM dm = (SL_S_COMM_APT_STRUCTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.invsgdt);
		cstmt.setString(5, dm.invsgno);
		cstmt.setString(6, dm.addrcd);
		cstmt.setString(7, dm.dongno);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, OracleTypes.CURSOR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
		cstmt.registerOutParameter(15, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SL_S_COMM_APT_STRUCTDataSet();
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
String invsgdt = req.getParameter("invsgdt");
if( invsgdt == null){
	System.out.println(this.toString+" : invsgdt is null" );
}else{
	System.out.println(this.toString+" : invsgdt is "+invsgdt );
}
String invsgno = req.getParameter("invsgno");
if( invsgno == null){
	System.out.println(this.toString+" : invsgno is null" );
}else{
	System.out.println(this.toString+" : invsgno is "+invsgno );
}
String addrcd = req.getParameter("addrcd");
if( addrcd == null){
	System.out.println(this.toString+" : addrcd is null" );
}else{
	System.out.println(this.toString+" : addrcd is "+addrcd );
}
String dongno = req.getParameter("dongno");
if( dongno == null){
	System.out.println(this.toString+" : dongno is null" );
}else{
	System.out.println(this.toString+" : dongno is "+dongno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String invsgdt = Util.checkString(req.getParameter("invsgdt"));
String invsgno = Util.checkString(req.getParameter("invsgno"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
String dongno = Util.checkString(req.getParameter("dongno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String invsgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt")));
String invsgno = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgno")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setInvsgdt(invsgdt);
dm.setInvsgno(invsgno);
dm.setAddrcd(addrcd);
dm.setDongno(dongno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 13 17:11:10 KST 2006 */