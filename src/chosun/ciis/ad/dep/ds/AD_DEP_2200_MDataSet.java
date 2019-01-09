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
import chosun.ciis.ad.dep.rec.AD_DEP_2200_MCURLIST1Record;
import chosun.ciis.ad.dep.rec.AD_DEP_2200_MCURLIST22Record;
import chosun.ciis.ad.dep.rec.AD_DEP_2200_MCURLIST2Record;
import chosun.ciis.ad.dep.rec.AD_DEP_2200_MCURLIST3Record;
import chosun.ciis.ad.dep.rec.AD_DEP_2200_MCURLIST4Record;

/**
 * 
 */


public class AD_DEP_2200_MDataSet extends somo.framework.db.BaseDataSet implements java.io.Serializable{
	public ArrayList curlist4 = new ArrayList();
	public ArrayList curlist3 = new ArrayList();
	public ArrayList curlist2 = new ArrayList();
	public ArrayList curlist22 = new ArrayList();
	public ArrayList curlist1 = new ArrayList();
	public String errcode;
	public String errmsg;

	public AD_DEP_2200_MDataSet(){}
	public AD_DEP_2200_MDataSet(String errcode, String errmsg){
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

		ResultSet rset0 = (ResultSet) cstmt.getObject(4);
		while(rset0.next()){
			AD_DEP_2200_MCURLIST1Record rec = new AD_DEP_2200_MCURLIST1Record();
			rec.cd = Util.checkString(rset0.getString("cd"));
			rec.cdnm = Util.checkString(rset0.getString("cdnm"));
			this.curlist1.add(rec);
		}
		ResultSet rset1 = (ResultSet) cstmt.getObject(5);
		while(rset1.next()){
			AD_DEP_2200_MCURLIST2Record rec = new AD_DEP_2200_MCURLIST2Record();
			rec.cd = Util.checkString(rset1.getString("cd"));
			rec.cdnm = Util.checkString(rset1.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset1.getString("mang_cd_1"));
			this.curlist2.add(rec);
		}
		ResultSet rset2 = (ResultSet) cstmt.getObject(6);
		while(rset2.next()){
			AD_DEP_2200_MCURLIST22Record rec = new AD_DEP_2200_MCURLIST22Record();
			rec.cd = Util.checkString(rset2.getString("cd"));
			rec.cdnm = Util.checkString(rset2.getString("cdnm"));
			rec.mang_cd_1 = Util.checkString(rset2.getString("mang_cd_1"));
			this.curlist22.add(rec);
		}
		ResultSet rset3 = (ResultSet) cstmt.getObject(7);
		while(rset3.next()){
			AD_DEP_2200_MCURLIST3Record rec = new AD_DEP_2200_MCURLIST3Record();
			rec.cd = Util.checkString(rset3.getString("cd"));
			rec.cdnm = Util.checkString(rset3.getString("cdnm"));
			this.curlist3.add(rec);
		}
		ResultSet rset4 = (ResultSet) cstmt.getObject(8);
		while(rset4.next()){
			AD_DEP_2200_MCURLIST4Record rec = new AD_DEP_2200_MCURLIST4Record();
			rec.acct_id = Util.checkString(rset4.getString("acct_id"));
			rec.acct_nm = Util.checkString(rset4.getString("acct_nm"));
			this.curlist4.add(rec);
		}
	}
}/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체 관련 코드 작성시 사용하십시오.

<%
	AD_DEP_2200_MDataSet ds = (AD_DEP_2200_MDataSet)request.getAttribute("ds");
%>
Web Tier에서 Record 객체 관련 코드 작성시 사용하십시오.

<%
	for(int i=0; i<ds.curlist1.size(); i++){
		AD_DEP_2200_MCURLIST1Record curlist1Rec = (AD_DEP_2200_MCURLIST1Record)ds.curlist1.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist2.size(); i++){
		AD_DEP_2200_MCURLIST2Record curlist2Rec = (AD_DEP_2200_MCURLIST2Record)ds.curlist2.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist22.size(); i++){
		AD_DEP_2200_MCURLIST22Record curlist22Rec = (AD_DEP_2200_MCURLIST22Record)ds.curlist22.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist3.size(); i++){
		AD_DEP_2200_MCURLIST3Record curlist3Rec = (AD_DEP_2200_MCURLIST3Record)ds.curlist3.get(i);%>
HTML 코드들....
	<%}%>

<%
	for(int i=0; i<ds.curlist4.size(); i++){
		AD_DEP_2200_MCURLIST4Record curlist4Rec = (AD_DEP_2200_MCURLIST4Record)ds.curlist4.get(i);%>
HTML 코드들....
	<%}%>

----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 DataSet 객체의 <%= %> 작성시 사용하십시오.

<%= ds.getErrcode()%>
<%= ds.getErrmsg()%>
<%= ds.getCurlist1()%>
<%= ds.getCurlist2()%>
<%= ds.getCurlist22()%>
<%= ds.getCurlist3()%>
<%= ds.getCurlist4()%>
----------------------------------------------------------------------------------------------------*/
/*----------------------------------------------------------------------------------------------------
Web Tier에서 Record 객체의 <%= %> 작성시 사용하십시오.

<%= curlist1Rec.cd%>
<%= curlist1Rec.cdnm%>
<%= curlist2Rec.cd%>
<%= curlist2Rec.cdnm%>
<%= curlist2Rec.mang_cd_1%>
<%= curlist22Rec.cd%>
<%= curlist22Rec.cdnm%>
<%= curlist22Rec.mang_cd_1%>
<%= curlist3Rec.cd%>
<%= curlist3Rec.cdnm%>
<%= curlist4Rec.acct_id%>
<%= curlist4Rec.acct_nm%>
----------------------------------------------------------------------------------------------------*/


/* 작성시간 : Tue Jun 16 17:23:16 KST 2009 */