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
import chosun.ciis.ad.dep.rec.AD_DEP_1800_MCURLIST2Record;
import chosun.ciis.ad.dep.rec.AD_DEP_1800_MCURLISTRecord;

/**
 * 
 */


public class AD_DEP_1800_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_1800_MDataSet(){}
	public AD_DEP_1800_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(5);
		while(rset0.next()){
			AD_DEP_1800_MCURLISTRecord rec = new AD_DEP_1800_MCURLISTRecord();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(6);
		while(rset1.next()){
			AD_DEP_1800_MCURLIST2Record rec = new AD_DEP_1800_MCURLIST2Record();
			rec.acct_id = Util.checkString(rset1.getString("acct_id"));
			rec.acct_nm = Util.checkString(rset1.getString("acct_nm"));
			this.curlist2.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_1800_MDataSet ds = (AD_DEP_1800_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist.size(); i++){
		AD_DEP_1800_MCURLISTRecord curlistRec = (AD_DEP_1800_MCURLISTRecord)ds.curlist.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_DEP_1800_MCURLIST2Record curlist2Rec = (AD_DEP_1800_MCURLIST2Record)ds.curlist2.get(i);%>
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

<%= curlistRec.cd%>
<%= curlistRec.cdnm%>
<%= curlist2Rec.acct_id%>
<%= curlist2Rec.acct_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Apr 21 10:01:32 KST 2009 */