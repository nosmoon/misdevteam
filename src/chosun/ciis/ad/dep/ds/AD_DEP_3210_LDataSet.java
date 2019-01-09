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


package chosun.ciis.ad.dep.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.dep.rec.AD_DEP_3210_LCURLIST2Record;
import chosun.ciis.ad.dep.rec.AD_DEP_3210_LCURLISTRecord;

/**
 * 
 */


public class AD_DEP_3210_LDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_3210_LDataSet(){}
	public AD_DEP_3210_LDataSet(String errcode, String errmsg){
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
			AD_DEP_3210_LCURLISTRecord rec = new AD_DEP_3210_LCURLISTRecord();
			rec.cash_amt = Util.checkString(rset0.getString("cash_amt"));
			rec.note3 = Util.checkString(rset0.getString("note3"));
			rec.note4 = Util.checkString(rset0.getString("note4"));
			rec.note5 = Util.checkString(rset0.getString("note5"));
			rec.note6 = Util.checkString(rset0.getString("note6"));
			rec.note_amt = Util.checkString(rset0.getString("note_amt"));
			rec.fee = Util.checkString(rset0.getString("fee"));
			rec.etc_amt = Util.checkString(rset0.getString("etc_amt"));
			rec.tot_amt = Util.checkString(rset0.getString("tot_amt"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(8);
		while(rset1.next()){
			AD_DEP_3210_LCURLIST2Record rec = new AD_DEP_3210_LCURLIST2Record();
			rec.rcpm_yymm = Util.checkString(rset1.getString("rcpm_yymm"));
			rec.cash_amt = Util.checkString(rset1.getString("cash_amt"));
			rec.note3 = Util.checkString(rset1.getString("note3"));
			rec.note4 = Util.checkString(rset1.getString("note4"));
			rec.note5 = Util.checkString(rset1.getString("note5"));
			rec.note6 = Util.checkString(rset1.getString("note6"));
			rec.note_amt = Util.checkString(rset1.getString("note_amt"));
			rec.fee = Util.checkString(rset1.getString("fee"));
			rec.etc_amt = Util.checkString(rset1.getString("etc_amt"));
			rec.tot_amt = Util.checkString(rset1.getString("tot_amt"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_3210_LDataSet ds = (AD_DEP_3210_LDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_3210_LCURLISTRecord curlistRec = (AD_DEP_3210_LCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_DEP_3210_LCURLIST2Record curlist2Rec = (AD_DEP_3210_LCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist()%>
<%= ds.getCurlist2()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlistRec.cash_amt%>
<%= curlistRec.note3%>
<%= curlistRec.note4%>
<%= curlistRec.note5%>
<%= curlistRec.note6%>
<%= curlistRec.note_amt%>
<%= curlistRec.fee%>
<%= curlistRec.etc_amt%>
<%= curlistRec.tot_amt%>
<%= curlist2Rec.rcpm_yymm%>
<%= curlist2Rec.cash_amt%>
<%= curlist2Rec.note3%>
<%= curlist2Rec.note4%>
<%= curlist2Rec.note5%>
<%= curlist2Rec.note6%>
<%= curlist2Rec.note_amt%>
<%= curlist2Rec.fee%>
<%= curlist2Rec.etc_amt%>
<%= curlist2Rec.tot_amt%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Mon Apr 20 17:58:03 KST 2009 */