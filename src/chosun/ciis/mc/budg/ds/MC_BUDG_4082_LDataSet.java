/***************************************************************************************************
* 파일명 : .java
* 기능 : 독자우대-구독신청
* 작성일자 : 2007-05-22
* 작성자 : 김대섭
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자 :
* 수정일자 :
* 백업 : 
***************************************************************************************************/


package chosun.ciis.mc.budg.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mc.budg.dm.*;
import chosun.ciis.mc.budg.rec.*;

/**
 * 
 */


public class MC_BUDG_4082_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_4082_LDataSet(){}
	public MC_BUDG_4082_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(5);
		while(rset2.next()){
			MC_BUDG_4082_LCURLISTRecord rec = new MC_BUDG_4082_LCURLISTRecord();
			rec.befamt_10 = Util.checkString(rset2.getString("befamt_10"));
			rec.addamt_10 = Util.checkString(rset2.getString("addamt_10"));
			rec.sumamt_10 = Util.checkString(rset2.getString("sumamt_10"));
			rec.befamt_20 = Util.checkString(rset2.getString("befamt_20"));
			rec.addamt_20 = Util.checkString(rset2.getString("addamt_20"));
			rec.sumamt_20 = Util.checkString(rset2.getString("sumamt_20"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_4082_LDataSet ds = (MC_BUDG_4082_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_4082_LCURLISTRecord curlistRec = (MC_BUDG_4082_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.befamt_10%>
<%= curlistRec.addamt_10%>
<%= curlistRec.sumamt_10%>
<%= curlistRec.befamt_20%>
<%= curlistRec.addamt_20%>
<%= curlistRec.sumamt_20%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 18 14:24:01 KST 2009 */