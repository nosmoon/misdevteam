/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 심정보
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.ss.sls.admin.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.admin.dm.*;
import chosun.ciis.ss.sls.admin.rec.*;

/**
 * 
 */


public class SS_S_SQL_EXECUTE_QUERYLISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String sql_nm;
	public String sql_text;
	public String db_cd;

	public SS_S_SQL_EXECUTE_QUERYLISTDataSet(){}
	public SS_S_SQL_EXECUTE_QUERYLISTDataSet(String errcode, String errmsg, String sql_nm, String sql_text, String db_cd){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sql_nm = sql_nm;
		this.sql_text = sql_text;
		this.db_cd = db_cd;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSql_nm(String sql_nm){
		this.sql_nm = sql_nm;
	}

	public void setSql_text(String sql_text){
		this.sql_text = sql_text;
	}
	
	public void setDb_cd(String db_cd){
		this.db_cd = db_cd;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSql_nm(){
		return this.sql_nm;
	}

	public String getSql_text(){
		return this.sql_text;
	}
	
	public String getDb_cd(){
		return this.db_cd;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.sql_nm = Util.checkString(cstmt.getString(5));
		this.sql_text = Util.checkString(cstmt.getString(6));
		this.db_cd = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_S_SQL_EXECUTE_QUERYLISTDataSet ds = (SS_S_SQL_EXECUTE_QUERYLISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSql_nm()%>
<%= ds.getSql_text()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 23 06:42:42 GMT 2014 */