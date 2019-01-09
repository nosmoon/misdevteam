/***************************************************************************************************
 * 파일명   : SP_SL_L_COMM_THRW_RATE.java
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

public class SL_L_COMM_THRW_RATEDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String hoscnt;
	public String housval;

	public SL_L_COMM_THRW_RATEDM(){}
	public SL_L_COMM_THRW_RATEDM(String hoscnt, String housval){
		this.hoscnt = hoscnt;
		this.housval = housval;
	}

	public void setHoscnt(String hoscnt){
		this.hoscnt = hoscnt;
	}

	public void setHousval(String housval){
		this.housval = housval;
	}

	public String getHoscnt(){
		return this.hoscnt;
	}

	public String getHousval(){
		return this.housval;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_COMM_THRW_RATE( ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_COMM_THRW_RATEDM dm = (SL_L_COMM_THRW_RATEDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.hoscnt);
		cstmt.setString(4, dm.housval);
		cstmt.registerOutParameter(5, Types.VARCHAR);
		cstmt.registerOutParameter(6, Types.VARCHAR);
		cstmt.registerOutParameter(7, Types.VARCHAR);
		cstmt.registerOutParameter(8, Types.VARCHAR);
		cstmt.registerOutParameter(9, Types.VARCHAR);
		cstmt.registerOutParameter(10, Types.VARCHAR);
		cstmt.registerOutParameter(11, Types.VARCHAR);
		cstmt.registerOutParameter(12, Types.VARCHAR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.brmgr.ds.SL_L_COMM_THRW_RATEDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String hoscnt = req.getParameter("hoscnt");
if( hoscnt == null){
	System.out.println(this.toString+" : hoscnt is null" );
}else{
	System.out.println(this.toString+" : hoscnt is "+hoscnt );
}
String housval = req.getParameter("housval");
if( housval == null){
	System.out.println(this.toString+" : housval is null" );
}else{
	System.out.println(this.toString+" : housval is "+housval );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String hoscnt = Util.checkString(req.getParameter("hoscnt"));
String housval = Util.checkString(req.getParameter("housval"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String hoscnt = Util.Uni2Ksc(Util.checkString(req.getParameter("hoscnt")));
String housval = Util.Uni2Ksc(Util.checkString(req.getParameter("housval")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setHoscnt(hoscnt);
dm.setHousval(housval);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Sat Mar 11 13:15:24 KST 2006 */