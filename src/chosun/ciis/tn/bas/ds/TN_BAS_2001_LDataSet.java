/***************************************************************************************************
* 파일명 : .java
* 기능 : 
* 작성일자 : 
* 작성자 : 이태식
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 : 
* 수정자 : 
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.tn.bas.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.tn.bas.dm.*;
import chosun.ciis.tn.bas.rec.*;

/**
 * 
 */


public class TN_BAS_2001_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public TN_BAS_2001_LDataSet(){}
	public TN_BAS_2001_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			TN_BAS_2001_LCURLISTRecord rec = new TN_BAS_2001_LCURLISTRecord();
			rec.membercategorycode = Util.checkString(rset0.getString("membercategorycode"));
			rec.parentmembercategorycode = Util.checkString(rset0.getString("parentmembercategorycode"));
			rec.membertype = Util.checkString(rset0.getString("membertype"));
			rec.membertype_nm = Util.checkString(rset0.getString("membertype_nm"));
			rec.depth = Util.checkString(rset0.getString("depth"));
			rec.membercategory = Util.checkString(rset0.getString("membercategory"));
			rec.displayorder = Util.checkString(rset0.getString("displayorder"));
			rec.description = Util.checkString(rset0.getString("description"));
			rec.useinsert_nm = Util.checkString(rset0.getString("useinsert_nm"));
			rec.useinsert = Util.checkString(rset0.getString("useinsert"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	TN_BAS_2001_LDataSet ds = (TN_BAS_2001_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		TN_BAS_2001_LCURLISTRecord curlistRec = (TN_BAS_2001_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.membercategorycode%>
<%= curlistRec.parentmembercategorycode%>
<%= curlistRec.membertype%>
<%= curlistRec.membertype_nm%>
<%= curlistRec.depth%>
<%= curlistRec.membercategory%>
<%= curlistRec.displayorder%>
<%= curlistRec.description%>
<%= curlistRec.useinsert_nm%>
<%= curlistRec.useinsert%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jul 07 18:53:57 KST 2016 */