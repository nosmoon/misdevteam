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


public class FC_FUNC_3000_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_3000_LDataSet(){}
	public FC_FUNC_3000_LDataSet(String errcode, String errmsg){
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
			FC_FUNC_3000_LCURLISTRecord rec = new FC_FUNC_3000_LCURLISTRecord();
			rec.busn_dt = Util.checkString(rset0.getString("busn_dt"));
			rec.week_day = Util.checkString(rset0.getString("week_day"));
			rec.in_cash = Util.checkString(rset0.getString("in_cash"));
			rec.sumamt = Util.checkString(rset0.getString("sumamt"));
			rec.in_tot = Util.checkString(rset0.getString("in_tot"));
			rec.out_amt = Util.checkString(rset0.getString("out_amt"));
			rec.mtry_amt = Util.checkString(rset0.getString("mtry_amt"));
			rec.entry_amt = Util.checkString(rset0.getString("entry_amt"));
			rec.bal_amt = Util.checkString(rset0.getString("bal_amt"));
			rec.bal_amt2 = Util.checkString(rset0.getString("bal_amt2"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_3000_LDataSet ds = (FC_FUNC_3000_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_3000_LCURLISTRecord curlistRec = (FC_FUNC_3000_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.busn_dt%>
<%= curlistRec.week_day%>
<%= curlistRec.in_cash%>
<%= curlistRec.sumamt%>
<%= curlistRec.in_tot%>
<%= curlistRec.out_amt%>
<%= curlistRec.mtry_amt%>
<%= curlistRec.entry_amt%>
<%= curlistRec.bal_amt%>
<%= curlistRec.bal_amt2%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jul 14 18:11:54 KST 2009 */