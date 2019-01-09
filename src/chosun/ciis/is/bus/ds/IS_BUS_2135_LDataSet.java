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


package chosun.ciis.is.bus.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.is.bus.dm.*;
import chosun.ciis.is.bus.rec.*;

/**
 * 
 */


public class IS_BUS_2135_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist_1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public IS_BUS_2135_LDataSet(){}
	public IS_BUS_2135_LDataSet(String errcode, String errmsg){
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
			IS_BUS_2135_LCURLIST_1Record rec = new IS_BUS_2135_LCURLIST_1Record();
			rec.bo_nm = Util.checkString(rset0.getString("bo_nm"));
			rec.std = Util.checkString(rset0.getString("std"));
			rec.advcs_nm = Util.checkString(rset0.getString("advcs_nm"));
			rec.tel_no = Util.checkString(rset0.getString("tel_no"));
			rec.chosun = Util.checkString(rset0.getString("chosun"));
			rec.jungang = Util.checkString(rset0.getString("jungang"));
			rec.donga = Util.checkString(rset0.getString("donga"));
			rec.etc = Util.checkString(rset0.getString("etc"));
			this.curlist_1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	IS_BUS_2135_LDataSet ds = (IS_BUS_2135_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist_1.size(); i++){
		IS_BUS_2135_LCURLIST_1Record curlist_1Rec = (IS_BUS_2135_LCURLIST_1Record)ds.curlist_1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist_1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist_1Rec.bo_nm%>
<%= curlist_1Rec.std%>
<%= curlist_1Rec.advcs_nm%>
<%= curlist_1Rec.tel_no%>
<%= curlist_1Rec.chosun%>
<%= curlist_1Rec.jungang%>
<%= curlist_1Rec.donga%>
<%= curlist_1Rec.etc%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Thu Jun 21 15:59:02 KST 2012 */