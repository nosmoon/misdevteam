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


public class FC_ACCT_2041_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist1 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_2041_LDataSet(){}
	public FC_ACCT_2041_LDataSet(String errcode, String errmsg){
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
		ResultSet rset0 = (ResultSet) cstmt.getObject(10);
		while(rset0.next()){
			FC_ACCT_2041_LCURLISTRecord rec = new FC_ACCT_2041_LCURLISTRecord();
			rec.chk = Util.checkString(rset0.getString("chk"));
			rec.slip_no = Util.checkString(rset0.getString("slip_no"));
			rec.rmks1 = Util.checkString(rset0.getString("rmks1"));
			rec.fisc_dt = Util.checkString(rset0.getString("fisc_dt"));
			rec.occr_amt = Util.checkString(rset0.getString("occr_amt"));
			rec.actu_adpay_bal = Util.checkString(rset0.getString("actu_adpay_bal"));
			rec.rest_amt = Util.checkString(rset0.getString("rest_amt"));
			rec.evnt_cd = Util.checkString(rset0.getString("evnt_cd"));
			rec.dept_nm = Util.checkString(rset0.getString("dept_nm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(11);
		while(rset1.next()){
			FC_ACCT_2041_LCURLIST1Record rec = new FC_ACCT_2041_LCURLIST1Record();
			rec.occr_amt = Util.checkString(rset1.getString("occr_amt"));
			rec.actu_adpay_bal = Util.checkString(rset1.getString("actu_adpay_bal"));
			rec.rest_amt = Util.checkString(rset1.getString("rest_amt"));
			this.curlist1.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_2041_LDataSet ds = (FC_ACCT_2041_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		FC_ACCT_2041_LCURLISTRecord curlistRec = (FC_ACCT_2041_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_2041_LCURLIST1Record curlist1Rec = (FC_ACCT_2041_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist1()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.chk%>
<%= curlistRec.slip_no%>
<%= curlistRec.rmks1%>
<%= curlistRec.fisc_dt%>
<%= curlistRec.occr_amt%>
<%= curlistRec.actu_adpay_bal%>
<%= curlistRec.rest_amt%>
<%= curlistRec.evnt_cd%>
<%= curlistRec.dept_nm%>
<%= curlist1Rec.occr_amt%>
<%= curlist1Rec.actu_adpay_bal%>
<%= curlist1Rec.rest_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Wed Feb 04 17:28:13 KST 2009 */