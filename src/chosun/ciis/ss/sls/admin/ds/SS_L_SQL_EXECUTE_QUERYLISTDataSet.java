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


public class SS_L_SQL_EXECUTE_QUERYLISTDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList resultcur = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_L_SQL_EXECUTE_QUERYLISTDataSet(){}
	public SS_L_SQL_EXECUTE_QUERYLISTDataSet(String errcode, String errmsg){
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
			SS_L_SQL_EXECUTE_QUERYLISTRESULTCURRecord rec = new SS_L_SQL_EXECUTE_QUERYLISTRESULTCURRecord();
			rec.seq = Util.checkString(rset0.getString("seq"));
			rec.sql_nm = Util.checkString(rset0.getString("sql_nm"));
			rec.incmgpers = Util.checkString(rset0.getString("incmgpers"));
			rec.db_cd = Util.checkString(rset0.getString("db_cd"));
			rec.db_nm = Util.checkString(rset0.getString("db_nm"));
			this.resultcur.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_L_SQL_EXECUTE_QUERYLISTDataSet ds = (SS_L_SQL_EXECUTE_QUERYLISTDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.resultcur.size(); i++){
		SS_L_SQL_EXECUTE_QUERYLISTRESULTCURRecord resultcurRec = (SS_L_SQL_EXECUTE_QUERYLISTRESULTCURRecord)ds.resultcur.get(i);%>
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

<%= resultcurRec.seq%>
<%= resultcurRec.sql_nm%>
<%= resultcurRec.incmgpesr%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Apr 23 06:42:28 GMT 2014 */