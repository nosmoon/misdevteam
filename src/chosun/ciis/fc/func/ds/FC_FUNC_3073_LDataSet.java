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


package chosun.ciis.fc.func.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.func.dm.*;
import chosun.ciis.fc.func.rec.*;

/**
 * 
 */


public class FC_FUNC_3073_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_3073_LDataSet(){}
	public FC_FUNC_3073_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_3073_LCURLISTRecord rec = new FC_FUNC_3073_LCURLISTRecord();
			rec.expn_dt = Util.checkString(rset0.getString("expn_dt"));
			rec.expn_dt_u = Util.checkString(rset0.getString("expn_dt_u"));
			rec.fund_cd = Util.checkString(rset0.getString("fund_cd"));
			rec.pay_wkdy = Util.checkString(rset0.getString("pay_wkdy"));
			rec.expn_amt = Util.checkString(rset0.getString("expn_amt"));
			rec.expn_yymm = Util.checkString(rset0.getString("expn_yymm"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_3073_LDataSet ds = (FC_FUNC_3073_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_3073_LCURLISTRecord curlistRec = (FC_FUNC_3073_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.expn_dt%>
<%= curlistRec.expn_dt_u%>
<%= curlistRec.fund_cd%>
<%= curlistRec.pay_wkdy%>
<%= curlistRec.expn_amt%>
<%= curlistRec.expn_yymm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Mar 30 14:18:03 KST 2009 */