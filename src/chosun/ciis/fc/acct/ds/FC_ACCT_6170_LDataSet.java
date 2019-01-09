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


package chosun.ciis.fc.acct.ds;

import java.sql.*;
import java.util.*;
import somo.framework.db.*;
import somo.framework.util.*;
import chosun.ciis.fc.acct.dm.*;
import chosun.ciis.fc.acct.rec.*;

/**
 * 
 */


public class FC_ACCT_6170_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList totlist = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6170_LDataSet(){}
	public FC_ACCT_6170_LDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(8);
		while(rset0.next()){
			FC_ACCT_6170_LCURLISTRecord rec = new FC_ACCT_6170_LCURLISTRecord();
			rec.col1 = Util.checkString(rset0.getString("col1"));
			rec.col2 = Util.checkString(rset0.getString("col2"));
			rec.col3 = Util.checkString(rset0.getString("col3"));
			rec.col4 = Util.checkString(rset0.getString("col4"));
			rec.col5 = Util.checkString(rset0.getString("col5"));
			rec.col6 = Util.checkString(rset0.getString("col6"));
			rec.col7 = Util.checkString(rset0.getString("col7"));
			rec.col8 = Util.checkString(rset0.getString("col8"));
			rec.col9 = Util.checkString(rset0.getString("col9"));
			rec.col10 = Util.checkString(rset0.getString("col10"));
			rec.col11 = Util.checkString(rset0.getString("col11"));
			rec.col12 = Util.checkString(rset0.getString("col12"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(9);
		while(rset1.next()){
			FC_ACCT_6170_LCURLIST2Record rec = new FC_ACCT_6170_LCURLIST2Record();
			rec.col1 = Util.checkString(rset1.getString("col1"));
			rec.col2 = Util.checkString(rset1.getString("col2"));
			rec.col3 = Util.checkString(rset1.getString("col3"));
			rec.col4 = Util.checkString(rset1.getString("col4"));
			rec.col5 = Util.checkString(rset1.getString("col5"));
			rec.col6 = Util.checkString(rset1.getString("col6"));
			rec.col7 = Util.checkString(rset1.getString("col7"));
			rec.col8 = Util.checkString(rset1.getString("col8"));
			rec.col9 = Util.checkString(rset1.getString("col9"));
			rec.col10 = Util.checkString(rset1.getString("col10"));
			rec.col11 = Util.checkString(rset1.getString("col11"));
			rec.col12 = Util.checkString(rset1.getString("col12"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(10);
		while(rset2.next()){
			FC_ACCT_6170_LTOTLISTRecord rec = new FC_ACCT_6170_LTOTLISTRecord();
			rec.tax_clsf = Util.checkString(rset2.getString("tax_clsf"));
			rec.clsf = Util.checkString(rset2.getString("clsf"));
			rec.erp = Util.checkString(rset2.getString("erp"));
			rec.ksc = Util.checkString(rset2.getString("ksc"));
			rec.erp_ksc = Util.checkString(rset2.getString("erp_ksc"));
			this.totlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6170_LDataSet ds = (FC_ACCT_6170_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_6170_LCURLISTRecord curlistRec = (FC_ACCT_6170_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_6170_LCURLIST2Record curlist2Rec = (FC_ACCT_6170_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.totlist.size(); i++){
		FC_ACCT_6170_LTOTLISTRecord totlistRec = (FC_ACCT_6170_LTOTLISTRecord)ds.totlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
<%= ds.getTotlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.col1%>
<%= curlistRec.col2%>
<%= curlistRec.col3%>
<%= curlistRec.col4%>
<%= curlistRec.col5%>
<%= curlistRec.col6%>
<%= curlistRec.col7%>
<%= curlistRec.col8%>
<%= curlistRec.col9%>
<%= curlistRec.col10%>
<%= curlistRec.col11%>
<%= curlistRec.col12%>
<%= curlist2Rec.col1%>
<%= curlist2Rec.col2%>
<%= curlist2Rec.col3%>
<%= curlist2Rec.col4%>
<%= curlist2Rec.col5%>
<%= curlist2Rec.col6%>
<%= curlist2Rec.col7%>
<%= curlist2Rec.col8%>
<%= curlist2Rec.col9%>
<%= curlist2Rec.col10%>
<%= curlist2Rec.col11%>
<%= curlist2Rec.col12%>
<%= totlistRec.tax_clsf%>
<%= totlistRec.clsf%>
<%= totlistRec.erp%>
<%= totlistRec.ksc%>
<%= totlistRec.erp_ksc%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 11:09:30 KST 2015 */