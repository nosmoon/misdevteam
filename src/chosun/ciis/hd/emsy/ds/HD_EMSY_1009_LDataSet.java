

package chosun.ciis.hd.emsy.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.hd.emsy.dm.*;
import chosun.ciis.hd.emsy.rec.*;

/**
 * 
 */


public class HD_EMSY_1009_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public HD_EMSY_1009_LDataSet(){}
	public HD_EMSY_1009_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			HashMap rMap = new HashMap();
			rMap.put("sfromemail", Util.checkString(rset0.getString("sfromemail")));
			rMap.put("smailsubject", Util.checkString(rset0.getString("smailsubject")));
			rMap.put("smailcontent", Util.checkString(rset0.getString("smailcontent")));
			this.curlist.add(rMap);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	HD_EMSY_1000_LDataSet ds = (HD_EMSY_1000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		HD_EMSY_1000_LCURLISTRecord curlistRec = (HD_EMSY_1000_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.sfromemail%>
<%= curlistRec.smailsubject%>
<%= curlistRec.smailcontent%>
<%= curlistRec.saly_pay_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Oct 11 14:15:08 KST 2010 */