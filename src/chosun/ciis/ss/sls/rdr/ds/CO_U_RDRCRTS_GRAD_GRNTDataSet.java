/***************************************************************************************************
* 파일명 : CO_U_RDRCRTS_GRAD_GRNTDataSet.java
* 기능 : 독자현황-독자등급부여
* 작성일자 : 2005-02-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.rdr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.rdr.dm.*;
import chosun.ciis.ss.sls.rdr.rec.*;

/**
 * 독자현황-독자등급부여
 */


public class CO_U_RDRCRTS_GRAD_GRNTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String chkwantcol;
	public String chkmessage;

	public CO_U_RDRCRTS_GRAD_GRNTDataSet(){}
	public CO_U_RDRCRTS_GRAD_GRNTDataSet(String errcode, String errmsg, String chkwantcol, String chkmessage){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.chkwantcol = chkwantcol;
		this.chkmessage = chkmessage;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setChkwantcol(String chkwantcol){
		this.chkwantcol = chkwantcol;
	}

	public void setChkmessage(String chkmessage){
		this.chkmessage = chkmessage;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getChkwantcol(){
		return this.chkwantcol;
	}

	public String getChkmessage(){
		return this.chkmessage;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.chkwantcol = Util.checkString(cstmt.getString(17));
		this.chkmessage = Util.checkString(cstmt.getString(18));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_U_RDRCRTS_GRAD_GRNTDataSet ds = (CO_U_RDRCRTS_GRAD_GRNTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getChkwantcol()%>
<%= ds.getChkmessage()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Feb 22 10:22:58 KST 2005 */