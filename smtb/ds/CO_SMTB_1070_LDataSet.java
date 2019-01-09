/***************************************************************************************************
* 파일명 : .java
* 기능 : 공통 - 세금계산서 사용자 조회
* 작성일자 : 2011-05-16
* 작성자 : 전병희
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.co.smtb.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.co.smtb.dm.*;
import chosun.ciis.co.smtb.rec.*;

/**
 * 공통 - 세금계산서 사용자조회
 */


public class CO_SMTB_1070_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList fnd_userlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public CO_SMTB_1070_LDataSet(){}
	public CO_SMTB_1070_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			CO_SMTB_1070_LFND_USERLISTRecord rec = new CO_SMTB_1070_LFND_USERLISTRecord();
			rec.fnd_user = Util.checkString(rset0.getString("fnd_user"));
			rec.fnd_regno = Util.checkString(rset0.getString("fnd_regno"));
			rec.fnd_user_name = Util.checkString(rset0.getString("fnd_user_name"));
			rec.smart_id = Util.checkString(rset0.getString("smart_id"));
			rec.smart_password = Util.checkString(rset0.getString("smart_password"));
			rec.smart_email = Util.checkString(rset0.getString("smart_email"));
			this.fnd_userlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	CO_SMTB_1070_LDataSet ds = (CO_SMTB_1070_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.fnd_userlist.size(); i++){
		CO_SMTB_1070_LFND_USERLISTRecord fnd_userlistRec = (CO_SMTB_1070_LFND_USERLISTRecord)ds.fnd_userlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getFnd_userlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= fnd_userlistRec.fnd_user%>
<%= fnd_userlistRec.fnd_regno%>
<%= fnd_userlistRec.fnd_user_name%>
<%= fnd_userlistRec.smart_id%>
<%= fnd_userlistRec.smart_email%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 16 10:50:31 KST 2011 */