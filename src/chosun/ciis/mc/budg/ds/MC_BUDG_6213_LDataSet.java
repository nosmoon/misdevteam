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


public class MC_BUDG_6213_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MC_BUDG_6213_LDataSet(){}
	public MC_BUDG_6213_LDataSet(String errcode, String errmsg){
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
			MC_BUDG_6213_LCURLISTRecord rec = new MC_BUDG_6213_LCURLISTRecord();
			rec.rownm = Util.checkString(rset0.getString("rownm"));
			rec.mm_amt_1 = Util.checkString(rset0.getString("mm_amt_1"));
			rec.mm_amt_2 = Util.checkString(rset0.getString("mm_amt_2"));
			rec.mm_amt_3 = Util.checkString(rset0.getString("mm_amt_3"));
			rec.mm_amt_4 = Util.checkString(rset0.getString("mm_amt_4"));
			rec.mm_amt_5 = Util.checkString(rset0.getString("mm_amt_5"));
			rec.mm_amt_6 = Util.checkString(rset0.getString("mm_amt_6"));
			rec.mm_amt_7 = Util.checkString(rset0.getString("mm_amt_7"));
			rec.mm_amt_8 = Util.checkString(rset0.getString("mm_amt_8"));
			rec.mm_amt_9 = Util.checkString(rset0.getString("mm_amt_9"));
			rec.mm_amt_10 = Util.checkString(rset0.getString("mm_amt_10"));
			rec.mm_amt_11 = Util.checkString(rset0.getString("mm_amt_11"));
			rec.mm_amt_12 = Util.checkString(rset0.getString("mm_amt_12"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MC_BUDG_6213_LDataSet ds = (MC_BUDG_6213_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MC_BUDG_6213_LCURLISTRecord curlistRec = (MC_BUDG_6213_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.rownm%>
<%= curlistRec.mm_amt_1%>
<%= curlistRec.mm_amt_2%>
<%= curlistRec.mm_amt_3%>
<%= curlistRec.mm_amt_4%>
<%= curlistRec.mm_amt_5%>
<%= curlistRec.mm_amt_6%>
<%= curlistRec.mm_amt_7%>
<%= curlistRec.mm_amt_8%>
<%= curlistRec.mm_amt_9%>
<%= curlistRec.mm_amt_10%>
<%= curlistRec.mm_amt_11%>
<%= curlistRec.mm_amt_12%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 25 16:40:12 KST 2009 */