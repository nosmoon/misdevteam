/***************************************************************************************************
 * 파일명   : SS_S_BO_HEADDM.java
 * 기능     : 지국info-지국장정보-상세조회
 * 작성일자 : 2007/01/11
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brinfo.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brinfo.ds.*;
import chosun.ciis.ss.sls.brinfo.rec.*;

/**
**  SP_SS_S_BO_HEAD
**/

public class SS_S_BO_HEADDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String prn;
	public String bjjgseq;
	public String bjjuminno;

	public SS_S_BO_HEADDM(){}
	public SS_S_BO_HEADDM(String bocd, String prn, String bjjgseq, String bjjuminno){
		this.bocd = bocd;
		this.prn = prn;
		this.bjjgseq = bjjgseq;
		this.bjjuminno = bjjuminno;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setPrn(String prn){
		this.prn = prn;
	}

	public void setBjjgseq(String bjjgseq){
		this.bjjgseq = bjjgseq;
	}

	public void setBjjuminno(String bjjuminno){
		this.bjjuminno = bjjuminno;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getPrn(){
		return this.prn;
	}

	public String getBjjgseq(){
		return this.bjjgseq;
	}

	public String getBjjuminno(){
		return this.bjjuminno;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_BO_HEAD( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_BO_HEADDM dm = (SS_S_BO_HEADDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.prn);
		cstmt.setString(5, dm.bjjgseq);
		cstmt.setString(6, dm.bjjuminno);
		cstmt.registerOutParameter(7, OracleTypes.CURSOR);
		cstmt.registerOutParameter(8, OracleTypes.CURSOR);
		cstmt.registerOutParameter(9, OracleTypes.CURSOR);
		cstmt.registerOutParameter(10, OracleTypes.CURSOR);
		cstmt.registerOutParameter(11, OracleTypes.CURSOR);
		cstmt.registerOutParameter(12, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brinfo.ds.SS_S_BO_HEADDataSet();
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
String prn = req.getParameter("prn");
if( prn == null){
	System.out.println(this.toString+" : prn is null" );
}else{
	System.out.println(this.toString+" : prn is "+prn );
}
String bjjgseq = req.getParameter("bjjgseq");
if( bjjgseq == null){
	System.out.println(this.toString+" : bjjgseq is null" );
}else{
	System.out.println(this.toString+" : bjjgseq is "+bjjgseq );
}
String bjjuminno = req.getParameter("bjjuminno");
if( bjjuminno == null){
	System.out.println(this.toString+" : bjjuminno is null" );
}else{
	System.out.println(this.toString+" : bjjuminno is "+bjjuminno );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String prn = Util.checkString(req.getParameter("prn"));
String bjjgseq = Util.checkString(req.getParameter("bjjgseq"));
String bjjuminno = Util.checkString(req.getParameter("bjjuminno"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String prn = Util.Uni2Ksc(Util.checkString(req.getParameter("prn")));
String bjjgseq = Util.Uni2Ksc(Util.checkString(req.getParameter("bjjgseq")));
String bjjuminno = Util.Uni2Ksc(Util.checkString(req.getParameter("bjjuminno")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setPrn(prn);
dm.setBjjgseq(bjjgseq);
dm.setBjjuminno(bjjuminno);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jan 11 14:52:18 KST 2007 */