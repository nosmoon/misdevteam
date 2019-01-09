/***************************************************************************************************
* 파일명   : SP_AD_BRN_2000_M.java
* 기능     : 일일보고, 일일보고 등록 초기
* 작성일자 : 
* 작성자   : 
***************************************************************************************************/
/***************************************************************************************************
* 수정내역 :
* 수정자   :
* 수정일자 :
* 백업     :
***************************************************************************************************/


package chosun.ciis.ad.brn.ds;

import java.sql.CallableStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import somo.framework.util.Util;
import chosun.ciis.ad.brn.rec.AD_BRN_2000_MCURLIST1Record;
import chosun.ciis.ad.brn.rec.AD_BRN_2000_MCURLIST2Record;
import chosun.ciis.ad.brn.rec.AD_BRN_2000_MCURLIST3Record;

/**
 * 기초자료관리-일일보고, 일일보고 등록 초기
 */


public class AD_BRN_2000_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;
	public String page_id;

	public AD_BRN_2000_MDataSet(){}
	public AD_BRN_2000_MDataSet(String errcode, String errmsg, String page_id){
		this.errcode = errcode;
		this.errmsg = errmsg;
		this.page_id = page_id;
	}

	public void setErrcode(String errcode){
		this.errcode = errcode;
	}

	public void setErrmsg(String errmsg){
		this.errmsg = errmsg;
	}

	public void setPage_id(String page_id){
		this.page_id = page_id;
	}

	public String getErrcode(){
		return this.errcode;
	}

	public String getErrmsg(){
		return this.errmsg;
	}

	public String getPage_id(){
		return this.page_id;
	}

	public void getValues(CallableStatement cstmt) throws SQLException{
		this.errcode = Util.checkString(cstmt.getString(1));
		this.errmsg = Util.checkString(cstmt.getString(2));
		if(!"".equals(this.errcode)){			return;		}
		this.page_id = Util.checkString(cstmt.getString(4));
		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AD_BRN_2000_MCURLIST1Record rec = new AD_BRN_2000_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AD_BRN_2000_MCURLIST2Record rec = new AD_BRN_2000_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(7);
		while(rset2.next()){
			AD_BRN_2000_MCURLIST3Record rec = new AD_BRN_2000_MCURLIST3Record();
			rec.acct_id = Util.checkString(rset2.getString("acct_id"));
			rec.acct_nm = Util.checkString(rset2.getString("acct_nm"));
			this.curlist3.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_BRN_2000_MDataSet ds = (AD_BRN_2000_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_BRN_2000_MCURLIST1Record curlist1Rec = (AD_BRN_2000_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_BRN_2000_MCURLIST2Record curlist2Rec = (AD_BRN_2000_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_BRN_2000_MCURLIST3Record curlist3Rec = (AD_BRN_2000_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getPage_id()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist3()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist3Rec.acct_id%>
<%= curlist3Rec.acct_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Fri Mar 27 14:49:35 KST 2009 */