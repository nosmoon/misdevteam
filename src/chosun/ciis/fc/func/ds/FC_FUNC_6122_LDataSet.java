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


public class FC_FUNC_6122_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_FUNC_6122_LDataSet(){}
	public FC_FUNC_6122_LDataSet(String errcode, String errmsg){
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
		if(!"".equals(this.errcode)){			return;		}
		ResultSet rset0 = (ResultSet) cstmt.getObject(6);
		while(rset0.next()){
			FC_FUNC_6122_LCURLISTRecord rec = new FC_FUNC_6122_LCURLISTRecord();
			rec.recp_dt = Util.checkString(rset0.getString("recp_dt"));
			rec.tot_int_amt = Util.checkString(rset0.getString("tot_int_amt"));
			rec.corp_tax_amt = Util.checkString(rset0.getString("corp_tax_amt"));
			rec.aft_tax_int_amt = Util.checkString(rset0.getString("aft_tax_int_amt"));
			rec.rmks = Util.checkString(rset0.getString("rmks"));
			rec.unrcp_precpt_bal = Util.checkString(rset0.getString("unrcp_precpt_bal"));
			rec.jpno = Util.checkString(rset0.getString("jpno"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_FUNC_6122_LDataSet ds = (FC_FUNC_6122_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_FUNC_6122_LCURLISTRecord curlistRec = (FC_FUNC_6122_LCURLISTRecord)ds.curlist.get(i);%>
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

<%= curlistRec.recp_dt%>
<%= curlistRec.tot_int_amt%>
<%= curlistRec.corp_tax_amt%>
<%= curlistRec.aft_tax_int_amt%>
<%= curlistRec.rmks%>
<%= curlistRec.unrcp_precpt_bal%>
<%= curlistRec.jpno%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Mar 11 15:35:48 KST 2009 */