/***************************************************************************************************
 * 파일명   : SP_SL_S_COMM_APT_THRW.java
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

public class SL_S_COMM_APT_THRWDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String regdt;
	public String invsgdt;
	public String invsgno;
	public String addrcd;
	public String dongno;

	public SL_S_COMM_APT_THRWDM(){}
	public SL_S_COMM_APT_THRWDM(String bocd, String regdt, String invsgdt, String invsgno, String addrcd, String dongno){
		this.bocd = bocd;
		this.regdt = regdt;
		this.invsgdt = invsgdt;
		this.invsgno = invsgno;
		this.addrcd = addrcd;
		this.dongno = dongno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setRegdt(String regdt){
		this.regdt = regdt;
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

	public String getRegdt(){
		return this.regdt;
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
		 return "{ call SP_SL_S_COMM_APT_THRW( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_S_COMM_APT_THRWDM dm = (SL_S_COMM_APT_THRWDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.regdt);
		cstmt.setString(5, dm.invsgdt);
		cstmt.setString(6, dm.invsgno);
		cstmt.setString(7, dm.addrcd);
		cstmt.setString(8, dm.dongno);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, Types.VARCHAR);
		cstmt.registerOutParameter(15, Types.VARCHAR);
		cstmt.registerOutParameter(16, Types.VARCHAR);
		cstmt.registerOutParameter(17, Types.VARCHAR);
		cstmt.registerOutParameter(18, Types.VARCHAR);
		cstmt.registerOutParameter(19, Types.VARCHAR);
		cstmt.registerOutParameter(20, Types.VARCHAR);
		cstmt.registerOutParameter(21, Types.VARCHAR);
		cstmt.registerOutParameter(22, Types.VARCHAR);
		cstmt.registerOutParameter(23, OracleTypes.CURSOR);
		cstmt.registerOutParameter(24, OracleTypes.CURSOR);
		cstmt.registerOutParameter(25, OracleTypes.CURSOR);
		cstmt.registerOutParameter(26, OracleTypes.CURSOR);
		cstmt.registerOutParameter(27, Types.VARCHAR);
		cstmt.registerOutParameter(28, Types.VARCHAR);
		cstmt.registerOutParameter(29, Types.VARCHAR);
		cstmt.registerOutParameter(30, Types.VARCHAR);
		cstmt.registerOutParameter(31, Types.VARCHAR);
		cstmt.registerOutParameter(32, Types.VARCHAR);
		cstmt.registerOutParameter(33, Types.VARCHAR);
		cstmt.registerOutParameter(34, Types.VARCHAR);
		cstmt.registerOutParameter(35, Types.VARCHAR);
		cstmt.registerOutParameter(36, Types.VARCHAR);
		cstmt.registerOutParameter(37, Types.VARCHAR);
		cstmt.registerOutParameter(38, Types.VARCHAR);
		cstmt.registerOutParameter(39, Types.VARCHAR);
		cstmt.registerOutParameter(40, Types.VARCHAR);
		cstmt.registerOutParameter(41, Types.VARCHAR);
		cstmt.registerOutParameter(42, Types.VARCHAR);
		cstmt.registerOutParameter(43, Types.VARCHAR);
		cstmt.registerOutParameter(44, Types.VARCHAR);
		cstmt.registerOutParameter(45, Types.VARCHAR);
		cstmt.registerOutParameter(46, OracleTypes.CURSOR);
		cstmt.registerOutParameter(47, OracleTypes.CURSOR);
		cstmt.registerOutParameter(48, OracleTypes.CURSOR);
		cstmt.registerOutParameter(49, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SL_S_COMM_APT_THRWDataSet();
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
String regdt = req.getParameter("regdt");
if( regdt == null){
	System.out.println(this.toString+" : regdt is null" );
}else{
	System.out.println(this.toString+" : regdt is "+regdt );
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
String regdt = Util.checkString(req.getParameter("regdt"));
String invsgdt = Util.checkString(req.getParameter("invsgdt"));
String invsgno = Util.checkString(req.getParameter("invsgno"));
String addrcd = Util.checkString(req.getParameter("addrcd"));
String dongno = Util.checkString(req.getParameter("dongno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String regdt = Util.Uni2Ksc(Util.checkString(req.getParameter("regdt")));
String invsgdt = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgdt")));
String invsgno = Util.Uni2Ksc(Util.checkString(req.getParameter("invsgno")));
String addrcd = Util.Uni2Ksc(Util.checkString(req.getParameter("addrcd")));
String dongno = Util.Uni2Ksc(Util.checkString(req.getParameter("dongno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setRegdt(regdt);
dm.setInvsgdt(invsgdt);
dm.setInvsgno(invsgno);
dm.setAddrcd(addrcd);
dm.setDongno(dongno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 13 16:22:03 KST 2006 */