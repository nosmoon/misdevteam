/***************************************************************************************************
 * 파일명   : SS_A_ACTMEMODataSet.java
 * 기능     : 지국경영-아파트투입율-활동사항(조회,수정,삭제f)
 * 작성일자 : 2005/11/02
 * 작성자   : 이혁
 **************************************************************************************************/
 


package chosun.ciis.ss.sls.brmgr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.brmgr.dm.*;
import chosun.ciis.ss.sls.brmgr.rec.*;

/**
**  지국경영-아파트투입율-활동사항(조회,수정,삭제)
**/

public class SS_A_ACTMEMODataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String cont;

	public SS_A_ACTMEMODataSet(){}
	public SS_A_ACTMEMODataSet(String errcode, String errmsg, String cont){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.cont = cont;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCont(String cont){
		this.cont = cont;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCont(){
		return this.cont;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.cont = Util.checkString(cstmt.getString(10));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_A_ACTMEMODataSet ds = (SS_A_ACTMEMODataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCont()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Nov 02 14:06:03 KST 2005 */