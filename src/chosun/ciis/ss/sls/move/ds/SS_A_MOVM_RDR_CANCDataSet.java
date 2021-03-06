/***************************************************************************************************
 * 파일명   : SS_A_MOVM_RDR_CANCDataSet.java
 * 기능     : 이사신청-이사신청취소
 * 작성일자 : 2007/05/09
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.move.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.move.dm.*;
import chosun.ciis.ss.sls.move.rec.*;

/**
**  SP_SS_A_MOVM_RDR_CANC
**/

public class SS_A_MOVM_RDR_CANCDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;

	public SS_A_MOVM_RDR_CANCDataSet(){}
	public SS_A_MOVM_RDR_CANCDataSet(String errcode, String errmsg){
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
	SS_A_MOVM_RDR_CANCDataSet ds = (SS_A_MOVM_RDR_CANCDataSet)request.getAttribute("ds");
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


/* 작성시간 : Wed May 09 14:52:59 KST 2007 */