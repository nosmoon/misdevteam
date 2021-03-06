/***************************************************************************************************
* 파일명 : SS_A_SHFTAPLC_TMSGDataSet.java
* 기능 : 지국지원 - Billing자동이체 - 신청관리 - 자동이체신청송신
* 작성일자 : 2004-04-30
* 작성자 : 김상열
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.brsup.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brsup.dm.*;
import chosun.ciis.ss.sls.brsup.rec.*;

/**
 * 지국지원 - Billing자동이체 - 신청관리 - 자동이체신청송신
 *
 */


public class SS_A_SHFTAPLC_TMSGDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public SS_A_SHFTAPLC_TMSGDataSet(){}
	public SS_A_SHFTAPLC_TMSGDataSet(String errcode, String errmsg){
		this.errcode = errcode;
		this.errmsg = errmsg;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_A_SHFTAPLC_TMSGDataSet ds = (SS_A_SHFTAPLC_TMSGDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Apr 30 10:31:00 KST 2004 */