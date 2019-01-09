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


package chosun.ciis.mt.commatr.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.mt.commatr.dm.*;
import chosun.ciis.mt.commatr.rec.*;

/**
 * 
 */


public class MT_COMMATR_6510_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public MT_COMMATR_6510_LDataSet(){}
	public MT_COMMATR_6510_LDataSet(String errcode, String errmsg){
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
			MT_COMMATR_6510_LCURLISTRecord rec = new MT_COMMATR_6510_LCURLISTRecord();
			rec.yyyy = Util.checkString(rset0.getString("yyyy"));
			rec.mm = Util.checkString(rset0.getString("mm"));
			rec.a10_1 = Util.checkString(rset0.getString("a10_1"));
			rec.a10_2 = Util.checkString(rset0.getString("a10_2"));
			rec.a10_3 = Util.checkString(rset0.getString("a10_3"));
			rec.a10_4 = Util.checkString(rset0.getString("a10_4"));
			rec.a10_5 = Util.checkString(rset0.getString("a10_5"));
			rec.a10_6 = Util.checkString(rset0.getString("a10_6"));
			rec.a22_1 = Util.checkString(rset0.getString("a22_1"));
			rec.a22_2 = Util.checkString(rset0.getString("a22_2"));
			rec.a22_3 = Util.checkString(rset0.getString("a22_3"));
			rec.a22_4 = Util.checkString(rset0.getString("a22_4"));
			rec.a22_5 = Util.checkString(rset0.getString("a22_5"));
			rec.a22_6 = Util.checkString(rset0.getString("a22_6"));
			rec.a25_1 = Util.checkString(rset0.getString("a25_1"));
			rec.a25_2 = Util.checkString(rset0.getString("a25_2"));
			rec.a25_3 = Util.checkString(rset0.getString("a25_3"));
			rec.a25_4 = Util.checkString(rset0.getString("a25_4"));
			rec.a25_5 = Util.checkString(rset0.getString("a25_5"));
			rec.a25_6 = Util.checkString(rset0.getString("a25_6"));
			rec.a_1 = Util.checkString(rset0.getString("a_1"));
			rec.a_2 = Util.checkString(rset0.getString("a_2"));
			rec.a_3 = Util.checkString(rset0.getString("a_3"));
			rec.a_4 = Util.checkString(rset0.getString("a_4"));
			rec.a_5 = Util.checkString(rset0.getString("a_5"));
			rec.a_6 = Util.checkString(rset0.getString("a_6"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	MT_COMMATR_6510_LDataSet ds = (MT_COMMATR_6510_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		MT_COMMATR_6510_LCURLISTRecord curlistRec = (MT_COMMATR_6510_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.yymm%>
<%= curlistRec.a10_1%>
<%= curlistRec.a10_2%>
<%= curlistRec.a10_3%>
<%= curlistRec.a10_4%>
<%= curlistRec.a10_5%>
<%= curlistRec.a10_6%>
<%= curlistRec.a22_1%>
<%= curlistRec.a22_2%>
<%= curlistRec.a22_3%>
<%= curlistRec.a22_4%>
<%= curlistRec.a22_5%>
<%= curlistRec.a22_6%>
<%= curlistRec.a25_1%>
<%= curlistRec.a25_2%>
<%= curlistRec.a25_3%>
<%= curlistRec.a25_4%>
<%= curlistRec.a25_5%>
<%= curlistRec.a25_6%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Sep 12 14:17:27 KST 2013 */