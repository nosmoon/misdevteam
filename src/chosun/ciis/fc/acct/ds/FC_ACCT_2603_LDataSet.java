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


public class FC_ACCT_2603_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;
	public String curr_yymm;

	public FC_ACCT_2603_LDataSet(){}
	public FC_ACCT_2603_LDataSet(String errcode, String errmsg, String curr_yymm){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.curr_yymm = curr_yymm;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setCurr_yymm(String curr_yymm){
		this.curr_yymm = curr_yymm;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getCurr_yymm(){
		return this.curr_yymm;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){
			return;
		}

		this.curr_yymm = Util.checkString(cstmt.getString(6));
		ResultSet rset0 = (ResultSet) cstmt.getObject(7);
		while(rset0.next()){
			FC_ACCT_2603_LCURLISTRecord rec = new FC_ACCT_2603_LCURLISTRecord();
			rec.cmpy_cd = Util.checkString(rset0.getString("cmpy_cd"));
			rec.acct_levl = Util.checkString(rset0.getString("acct_levl"));
			rec.acct_cd = Util.checkString(rset0.getString("acct_cd"));
			rec.acct_subj_nm = Util.checkString(rset0.getString("acct_subj_nm"));
			rec.amt0 = Util.checkString(rset0.getString("amt0"));
			rec.amt1 = Util.checkString(rset0.getString("amt1"));
			rec.amt2 = Util.checkString(rset0.getString("amt2"));
			rec.amt3 = Util.checkString(rset0.getString("amt3"));
			rec.amt4 = Util.checkString(rset0.getString("amt4"));
			rec.amt5 = Util.checkString(rset0.getString("amt5"));
			rec.amt6 = Util.checkString(rset0.getString("amt6"));
			rec.amt7 = Util.checkString(rset0.getString("amt7"));
			rec.amt8 = Util.checkString(rset0.getString("amt8"));
			rec.amt9 = Util.checkString(rset0.getString("amt9"));
			rec.amt10 = Util.checkString(rset0.getString("amt10"));
			rec.amt11 = Util.checkString(rset0.getString("amt11"));
			rec.amt12 = Util.checkString(rset0.getString("amt12"));
			rec.totamt = Util.checkString(rset0.getString("totamt"));
			this.curlist.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2603_LDataSet ds = (FC_ACCT_2603_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2603_LCURLISTRecord curlistRec = (FC_ACCT_2603_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurr_yymm()%>
<%= ds.getCurlist()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cmpy_cd%>
<%= curlistRec.acct_levl%>
<%= curlistRec.acct_cd%>
<%= curlistRec.acct_subj_nm%>
<%= curlistRec.amt0%>
<%= curlistRec.amt1%>
<%= curlistRec.amt2%>
<%= curlistRec.amt3%>
<%= curlistRec.amt4%>
<%= curlistRec.amt5%>
<%= curlistRec.amt6%>
<%= curlistRec.amt7%>
<%= curlistRec.amt8%>
<%= curlistRec.amt9%>
<%= curlistRec.amt10%>
<%= curlistRec.amt11%>
<%= curlistRec.amt12%>
<%= curlistRec.totamt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon May 15 17:46:23 KST 2017 */