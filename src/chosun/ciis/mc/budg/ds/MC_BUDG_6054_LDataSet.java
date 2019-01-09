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


public class MC_BUDG_6054_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6054_LDataSet(){}
	public MC_BUDG_6054_LDataSet(String errcode, String errmsg){
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

		ResultSet rset3 = (ResultSet) cstmt.getObject(11);
		while(rset3.next()){
			MC_BUDG_6054_LCURLISTRecord rec = new MC_BUDG_6054_LCURLISTRecord();
			rec.chk = Util.checkString(rset3.getString("chk"));
			rec.brnm1 = Util.checkString(rset3.getString("brnm1"));
			rec.brcd = Util.checkString(rset3.getString("brcd"));
			rec.brnm = Util.checkString(rset3.getString("brnm"));
			rec.a_total = Util.checkString(rset3.getString("a_total"));
			rec.b_total = Util.checkString(rset3.getString("b_total"));
			rec.biyul = Util.checkString(rset3.getString("biyul"));
			rec.camt = Util.checkString(rset3.getString("camt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6054_LDataSet ds = (MC_BUDG_6054_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6054_LCURLISTRecord curlistRec = (MC_BUDG_6054_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.chk%>
<%= curlistRec.brnm1%>
<%= curlistRec.brcd%>
<%= curlistRec.brnm%>
<%= curlistRec.a_total%>
<%= curlistRec.b_total%>
<%= curlistRec.biyul%>
<%= curlistRec.camt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue May 12 16:18:06 KST 2009 */