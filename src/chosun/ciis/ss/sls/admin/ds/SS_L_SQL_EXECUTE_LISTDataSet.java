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


public class SS_L_SQL_EXECUTE_LISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList resultcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_SQL_EXECUTE_LISTDataSet(){}
	public SS_L_SQL_EXECUTE_LISTDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){
			return;
		}

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			SS_L_SQL_EXECUTE_LISTRESULTCURRecord rec = new SS_L_SQL_EXECUTE_LISTRESULTCURRecord();
			rec.sql_nm = Util.checkString(rset0.getString("sql_nm"));
			rec.bgntm = rset0.getTimestamp("bgntm");
			rec.endtm = rset0.getTimestamp("endtm");
			rec.erryn = Util.checkString(rset0.getString("erryn"));
			rec.errmsg = Util.checkString(rset0.getString("errmsg"));
			rec.incmgpers = Util.checkString(rset0.getString("incmgpers"));
			rec.data_cnt = rset0.getInt("data_cnt");
			rec.execute_dt = Util.checkString(rset0.getString("execute_dt"));
			rec.sql_seq = Util.checkString(rset0.getString("sql_seq"));
			this.resultcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_SQL_EXECUTE_LISTDataSet ds = (SS_L_SQL_EXECUTE_LISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.resultcur.size(); i++){
		SS_L_SQL_EXECUTE_LISTRESULTCURRecord resultcurRec = (SS_L_SQL_EXECUTE_LISTRESULTCURRecord)ds.resultcur.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getResultcur()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= resultcurRec.sql_nm%>
<%= resultcurRec.bgntm%>
<%= resultcurRec.endtm%>
<%= resultcurRec.erryn%>
<%= resultcurRec.errmsg%>
<%= resultcurRec.incmgpers%>
<%= resultcurRec.data_cnt%>
<%= resultcurRec.execute_dt%>
<%= resultcurRec.sql_seq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Dec 24 07:39:20 GMT 2013 */