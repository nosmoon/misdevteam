/***************************************************************************************************
 * 파일명   : SSExtn2280.java
 * 기능     : 일괄확장 등록
 * 작성일자 : 2011-03-30
 * 작성자   : 김태희
 ***************************************************************************************************/
/***************************************************************************************************
 * 수정내역 :
 * 수정자 :
 * 수정일자 :
 * 백업 :
 ***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_A_BATCH_EXTNDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String rdr_no_list;
	public String reqqty_list;
	public String incmgpers;

	public SS_A_BATCH_EXTNDM(){}
	public SS_A_BATCH_EXTNDM(String rdr_no_list, String reqqty_list, String incmgpers){
		this.rdr_no_list = rdr_no_list;
		this.reqqty_list = reqqty_list;
		this.incmgpers = incmgpers;
	}

	public void setRdr_no_list(String rdr_no_list){
		this.rdr_no_list = rdr_no_list;
	}

	public void setReqqty_list(String reqqty_list){
		this.reqqty_list = reqqty_list;
	}

	public void setIncmgpers(String incmgpers){
		this.incmgpers = incmgpers;
	}

	public String getRdr_no_list(){
		return this.rdr_no_list;
	}

	public String getReqqty_list(){
		return this.reqqty_list;
	}

	public String getIncmgpers(){
		return this.incmgpers;
	}

	public String getSQL(){
		 return "{ call SP_SS_A_BATCH_EXTN( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_A_BATCH_EXTNDM dm = (SS_A_BATCH_EXTNDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.rdr_no_list);
		cstmt.setString(4, dm.reqqty_list);
		cstmt.setString(5, dm.incmgpers);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_A_BATCH_EXTNDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String rdr_no_list = req.getParameter("rdr_no_list");
if( rdr_no_list == null){
	System.out.println(this.toString+" : rdr_no_list is null" );
}else{
	System.out.println(this.toString+" : rdr_no_list is "+rdr_no_list );
}
String reqqty_list = req.getParameter("reqqty_list");
if( reqqty_list == null){
	System.out.println(this.toString+" : reqqty_list is null" );
}else{
	System.out.println(this.toString+" : reqqty_list is "+reqqty_list );
}
String incmgpers = req.getParameter("incmgpers");
if( incmgpers == null){
	System.out.println(this.toString+" : incmgpers is null" );
}else{
	System.out.println(this.toString+" : incmgpers is "+incmgpers );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String rdr_no_list = Util.checkString(req.getParameter("rdr_no_list"));
String reqqty_list = Util.checkString(req.getParameter("reqqty_list"));
String incmgpers = Util.checkString(req.getParameter("incmgpers"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String rdr_no_list = Util.Uni2Ksc(Util.checkString(req.getParameter("rdr_no_list")));
String reqqty_list = Util.Uni2Ksc(Util.checkString(req.getParameter("reqqty_list")));
String incmgpers = Util.Uni2Ksc(Util.checkString(req.getParameter("incmgpers")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setRdr_no_list(rdr_no_list);
dm.setReqqty_list(reqqty_list);
dm.setIncmgpers(incmgpers);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 30 11:56:34 KST 2011 */