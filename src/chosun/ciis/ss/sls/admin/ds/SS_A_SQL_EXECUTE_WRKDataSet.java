/***************************************************************************************************
* ���ϸ� : .java
* ��� : 
* �ۼ����� : 
* �ۼ��� : ������
***************************************************************************************************/
/***************************************************************************************************
* �������� :
* ������ :
* �������� :
* ��� : 
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


public class SS_A_SQL_EXECUTE_WRKDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public String errcode;
	public String errmsg;
	public String sql_dt;
	public String sql_seq;

	public SS_A_SQL_EXECUTE_WRKDataSet(){}
	public SS_A_SQL_EXECUTE_WRKDataSet(String errcode, String errmsg, String sql_dt, String sql_seq){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.sql_dt = sql_dt;
		this.sql_seq = sql_seq;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setSql_dt(String sql_dt){
		this.sql_dt = sql_dt;
	}

	public void setSql_seq(String sql_seq){
		this.sql_seq = sql_seq;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getSql_dt(){
		return this.sql_dt;
	}

	public String getSql_seq(){
		return this.sql_seq;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.sql_dt = Util.checkString(cstmt.getString(6));
		this.sql_seq = Util.checkString(cstmt.getString(7));
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

<%
	SS_A_SQL_EXECUTE_WRKDataSet ds = (SS_A_SQL_EXECUTE_WRKDataSet)request.getAttribute("ds");
%>
Web Tier���� Record ��ü ���� �ڵ� �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� DataSet ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getSql_dt()%>
<%= ds.getSql_seq()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier���� Record ��ü�� <%= %> �ۼ��� ����Ͻʽÿ�.

----------------------------------------------------------------------------------------------------*/


/* �ۼ��ð� : Tue Dec 24 02:17:57 GMT 2013 */