/***************************************************************************************************
 * 파일명   : CO_A_CYBALONCLOSDM.java
 * 기능     : 사이버센터-사이버수당마감 마감및취소
 * 작성일자 : 2005-07-27
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ss.sls.ca.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.ca.ds.*;
import chosun.ciis.ss.sls.ca.rec.*;

/**
 * 사이버센터-사이버수당마감 마감및취소
 */

public class CO_A_CYBALONCLOSDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String accflag;
	public String closyymm;

	public CO_A_CYBALONCLOSDM(){}
	public CO_A_CYBALONCLOSDM(String accflag, String closyymm){
		this.accflag = accflag;
		this.closyymm = closyymm;
	}

	public void setAccflag(String accflag){
		this.accflag = accflag;
	}

	public void setClosyymm(String closyymm){
		this.closyymm = closyymm;
	}

	public String getAccflag(){
		return this.accflag;
	}

	public String getClosyymm(){
		return this.closyymm;
	}

	public String getSQL(){
		 return "{ call SP_CO_A_CYBALONCLOS( ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		CO_A_CYBALONCLOSDM dm = (CO_A_CYBALONCLOSDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.accflag);
		cstmt.setString(4, dm.closyymm);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.ca.ds.CO_A_CYBALONCLOSDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String accflag = req.getParameter("accflag");
if( accflag == null){
	System.out.println(this.toString+" : accflag is null" );
}else{
	System.out.println(this.toString+" : accflag is "+accflag );
}
String closyymm = req.getParameter("closyymm");
if( closyymm == null){
	System.out.println(this.toString+" : closyymm is null" );
}else{
	System.out.println(this.toString+" : closyymm is "+closyymm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String accflag = Util.checkString(req.getParameter("accflag"));
String closyymm = Util.checkString(req.getParameter("closyymm"));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String accflag = Util.Uni2Ksc(Util.checkString(req.getParameter("accflag")));
String closyymm = Util.Uni2Ksc(Util.checkString(req.getParameter("closyymm")));
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setAccflag(accflag);
dm.setClosyymm(closyymm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Jul 27 17:23:13 KST 2005 */