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


package chosun.ciis.ss.sls.extn.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.ss.sls.extn.dm.*;
import chosun.ciis.ss.sls.extn.rec.*;

/**
 * 
 */


public class SS_SLS_EXTN_4601_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList userlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public SS_SLS_EXTN_4601_LDataSet(){}
	public SS_SLS_EXTN_4601_LDataSet(String errcode, String errmsg){
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
			SS_SLS_EXTN_4601_LUSERLISTRecord rec = new SS_SLS_EXTN_4601_LUSERLISTRecord();
			rec.extnnm = Util.checkString(rset0.getString("extnnm"));
			rec.deptnm = Util.checkString(rset0.getString("deptnm"));
			rec.empseq = Util.checkString(rset0.getString("empseq"));
			this.userlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	SS_SLS_EXTN_4601_LDataSet ds = (SS_SLS_EXTN_4601_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.userlist.size(); i++){
		SS_SLS_EXTN_4601_LUSERLISTRecord userlistRec = (SS_SLS_EXTN_4601_LUSERLISTRecord)ds.userlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getUserlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= userlistRec.extnnm%>
<%= userlistRec.deptnm%>
<%= userlistRec.empseq%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Feb 15 19:54:18 KST 2016 */