/***************************************************************************************************
 * 파일명   : PS_A_BILL_EXCSRCPMPROCDataSet.java
 * 기능     : 수금-초과입금처리 등록/삭제
 * 작성일자 : 2004-04-06
 * 작성자   : 김상옥
 **************************************************************************************************/
 /**************************************************************************************************
 * 수정내역 :
 * 수정자   :
 * 수정일자 :
 * 백업     : 
 **************************************************************************************************/


package chosun.ciis.ps.pbs.bill.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ps.pbs.bill.dm.*;
import chosun.ciis.ps.pbs.bill.rec.*;

/**
 * 수금-초과입금처리 등록/삭제
 */

public class PS_A_BILL_EXCSRCPMPROCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public PS_A_BILL_EXCSRCPMPROCDataSet(){}
	public PS_A_BILL_EXCSRCPMPROCDataSet(String errcode, String errmsg){
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
	PS_A_BILL_EXCSRCPMPROCDataSet ds = (PS_A_BILL_EXCSRCPMPROCDataSet)request.getAttribute("ds");
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


/* 작성시간 : Wed Apr 07 15:56:43 KST 2004 */