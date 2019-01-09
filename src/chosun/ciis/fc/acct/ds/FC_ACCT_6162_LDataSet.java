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


public class FC_ACCT_6162_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public FC_ACCT_6162_LDataSet(){}
	public FC_ACCT_6162_LDataSet(String errcode, String errmsg){
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

		ResultSet rset2 = (ResultSet) cstmt.getObject(8);
		while(rset2.next()){
			FC_ACCT_6162_LCURLIST1Record rec = new FC_ACCT_6162_LCURLIST1Record();
			rec.dlco_cd = Util.checkString(rset2.getString("dlco_cd"));
			rec.cbamt = Util.checkString(rset2.getString("cbamt"));
			rec.slip_clsf_cd = Util.checkString(rset2.getString("slip_clsf_cd"));
			rec.from_fisc_dt = Util.checkString(rset2.getString("from_fisc_dt"));
			rec.to_fisc_dt = Util.checkString(rset2.getString("to_fisc_dt"));
			this.curlist1.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(9);
		while(rset3.next()){
			FC_ACCT_6162_LCURLIST2Record rec = new FC_ACCT_6162_LCURLIST2Record();
			rec.dlco_cd = Util.checkString(rset3.getString("dlco_cd"));
			rec.suply_amt = Util.checkString(rset3.getString("suply_amt"));
			rec.vat_amt = Util.checkString(rset3.getString("vat_amt"));
			rec.prof_type_cd = Util.checkString(rset3.getString("prof_type_cd"));
			rec.slip_clsf_cd = Util.checkString(rset3.getString("slip_clsf_cd"));
			rec.from_fisc_dt = Util.checkString(rset3.getString("from_fisc_dt"));
			rec.to_fisc_dt = Util.checkString(rset3.getString("to_fisc_dt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	FC_ACCT_6162_LDataSet ds = (FC_ACCT_6162_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		FC_ACCT_6162_LCURLIST1Record curlist1Rec = (FC_ACCT_6162_LCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		FC_ACCT_6162_LCURLIST2Record curlist2Rec = (FC_ACCT_6162_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.dlco_cd%>
<%= curlist1Rec.cbamt%>
<%= curlist1Rec.slip_clsf_cd%>
<%= curlist1Rec.from_fisc_dt%>
<%= curlist1Rec.to_fisc_dt%>
<%= curlist2Rec.dlco_cd%>
<%= curlist2Rec.suply_amt%>
<%= curlist2Rec.vat_amt%>
<%= curlist2Rec.prof_type_cd%>
<%= curlist2Rec.slip_clsf_cd%>
<%= curlist2Rec.from_fisc_dt%>
<%= curlist2Rec.to_fisc_dt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Sep 15 16:08:12 KST 2009 */