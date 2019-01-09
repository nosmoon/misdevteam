/***************************************************************************************************
* 파일명 : SL_L_BO_SRCHDM.java
* 기능 : 공통-지국검색
* 작성일자 : 2004-02-06
* 작성자 : 김영윤
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sal.common.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sal.common.ds.*;
import chosun.ciis.ss.sal.common.rec.*;

/**
 * 공통-지국검색
 *
 */


public class SL_L_BO_SRCHDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String bonm;
	public String addr3;

	public SL_L_BO_SRCHDM(){}
	public SL_L_BO_SRCHDM(String bonm, String addr3){
		this.bonm = bonm;
		this.addr3 = addr3;
	}

	public void setBonm(String bonm){
		this.bonm = bonm;
	}

	public void setAddr3(String addr3){
		this.addr3 = addr3;
	}

	public String getBonm(){
		return this.bonm;
	}

	public String getAddr3(){
		return this.addr3;
	}

	public String getSQL(){
		 return "{ call SP_SL_L_BO_SRCH( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SL_L_BO_SRCHDM dm = (SL_L_BO_SRCHDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.bonm);
		cstmt.setString(4, dm.addr3);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sal.common.ds.SL_L_BO_SRCHDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String bonm = req.getParameter("bonm");
if( bonm == null){
	System.out.println(this.toString+" : bonm is null" );
}else{
	System.out.println(this.toString+" : bonm is "+bonm );
}
String addr3 = req.getParameter("addr3");
if( addr3 == null){
	System.out.println(this.toString+" : addr3 is null" );
}else{
	System.out.println(this.toString+" : addr3 is "+addr3 );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String bonm = Util.checkString(req.getParameter("bonm"));
String addr3 = Util.checkString(req.getParameter("addr3"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String bonm = Util.Uni2Ksc(Util.checkString(req.getParameter("bonm")));
String addr3 = Util.Uni2Ksc(Util.checkString(req.getParameter("addr3")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setBonm(bonm);
dm.setAddr3(addr3);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Feb 06 17:18:41 KST 2004 */