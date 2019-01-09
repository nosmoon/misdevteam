/***************************************************************************************************
* 파일명 : .java
* 기능 : 관리자-지국월마감-상세
* 작성일자 : 2005-02-02
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 :
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.ds.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 관리자-지국월마감-상세
 */


public class SS_S_BOCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bocd;
	public String yymm;
	public String detail_yymm;

	public SS_S_BOCLOSDM(){}
	public SS_S_BOCLOSDM(String bocd, String yymm, String detail_yymm){
		this.bocd = bocd;
		this.yymm = yymm;
		this.detail_yymm = detail_yymm;
	}

	public void setBocd(String bocd){
		this.bocd = bocd;
	}

	public void setYymm(String yymm){
		this.yymm = yymm;
	}

	public void setDetail_yymm(String detail_yymm){
		this.detail_yymm = detail_yymm;
	}

	public String getBocd(){
		return this.bocd;
	}

	public String getYymm(){
		return this.yymm;
	}

	public String getDetail_yymm(){
		return this.detail_yymm;
	}

	public String getSQL(){
		 return "{ call SP_SS_S_BOCLOS( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_S_BOCLOSDM dm = (SS_S_BOCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bocd);
		cstmt.setString(4, dm.yymm);
		cstmt.setString(5, dm.detail_yymm);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
		cstmt.registerOutParameter(13, Types.VARCHAR);
		cstmt.registerOutParameter(14, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.admin.ds.SS_S_BOCLOSDataSet();
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
String yymm = req.getParameter("yymm");
if( yymm == null){
	System.out.println(this.toString+" : yymm is null" );
}else{
	System.out.println(this.toString+" : yymm is "+yymm );
}
String detail_yymm = req.getParameter("detail_yymm");
if( detail_yymm == null){
	System.out.println(this.toString+" : detail_yymm is null" );
}else{
	System.out.println(this.toString+" : detail_yymm is "+detail_yymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bocd = Util.checkString(req.getParameter("bocd"));
String yymm = Util.checkString(req.getParameter("yymm"));
String detail_yymm = Util.checkString(req.getParameter("detail_yymm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bocd = Util.Uni2Ksc(Util.checkString(req.getParameter("bocd")));
String yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("yymm")));
String detail_yymm = Util.Uni2Ksc(Util.checkString(req.getParameter("detail_yymm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBocd(bocd);
dm.setYymm(yymm);
dm.setDetail_yymm(detail_yymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 02 11:54:15 KST 2005 */