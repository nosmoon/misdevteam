/***************************************************************************************************
* 파일명 : .java
* 기능 : 확장현황-본사확장- 지역담당자 공지내용
* 작성일자 : 2009-06-09
* 작성자 : 권정윤
***************************************************************************************************/


package chosun.ciis.ss.sls.extn.dm;

import java.sql.*;
import oracle.jdbc.driver.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.ds.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 확장현황-본사확장- 지역담당자 공지내용  
 */

public class SS_L_EXTN_HDQT_ALERTDM extends somo.framework.db.BaseDM implements java.io.Serializable{

	public String emp_no;
	public String valmm;

	public SS_L_EXTN_HDQT_ALERTDM(){}
	public SS_L_EXTN_HDQT_ALERTDM(String emp_no, String valmm){
		this.emp_no = emp_no;
		this.valmm = valmm;
	}

	public void setEmp_no(String emp_no){
		this.emp_no = emp_no;
	}

	public void setValmm(String valmm){
		this.valmm = valmm;
	}

	public String getEmp_no(){
		return this.emp_no;
	}

	public String getValmm(){
		return this.valmm;
	}

	public String getSQL(){
		 return "{ call SP_SS_L_EXTN_HDQT_ALERT( ?, ?, ?, ?, ?) }";
	}

	public void setParams(CallableStatement cstmt, BaseDM bdm) throws SQLException{
		SS_L_EXTN_HDQT_ALERTDM dm = (SS_L_EXTN_HDQT_ALERTDM)bdm;
		cstmt.registerOutParameter(1, Types.VARCHAR);
		cstmt.registerOutParameter(2, Types.VARCHAR);
		cstmt.setString(3, dm.emp_no);
		cstmt.setString(4, dm.valmm);
		cstmt.registerOutParameter(5, OracleTypes.CURSOR);
	}

	public BaseDataSet createDataSetObject(){
		return new chosun.ciis.ss.sls.extn.ds.SS_L_EXTN_HDQT_ALERTDataSet();
	}
}
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리 및 결과확인 검사시 사용하십시오.

String emp_no = req.getParameter("emp_no");
if( emp_no == null){
	System.out.println(this.toString+" : emp_no is null" );
}else{
	System.out.println(this.toString+" : emp_no is "+emp_no );
}
String valmm = req.getParameter("valmm");
if( valmm == null){
	System.out.println(this.toString+" : valmm is null" );
}else{
	System.out.println(this.toString+" : valmm is "+valmm );
}
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 req.getParameter() 처리시 사용하십시오.

String emp_no = Util.checkString(req.getParameter("emp_no"));
String valmm = Util.checkString(req.getParameter("valmm"));
----------------------------------------------------------------------------------------------------*//*----------------------------------------------------------------------------------------------------
Web Tier에서 한글처리와 동시에 req.getParameter() 처리시 사용하십시오.

String emp_no = Util.Uni2Ksc(Util.checkString(req.getParameter("emp_no")));
String valmm = Util.Uni2Ksc(Util.checkString(req.getParameter("valmm")));
----------------------------------------------------------------------------------------------------*/

/*----------------------------------------------------------------------------------------------------
Web Tier에서 DM 파일의 변수를 설정시 사용하십시오.

dm.setEmp_no(emp_no);
dm.setValmm(valmm);
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Jun 12 11:56:45 KST 2009 */